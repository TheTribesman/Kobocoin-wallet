/**
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tribesman.kobocoinj.core;

import com.tribesman.kobocoinj.params.*;
import com.google.common.base.Objects;

import org.spongycastle.util.encoders.Hex;

import javax.annotation.Nullable;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static com.google.common.base.Preconditions.checkState;
import static com.tribesman.kobocoinj.core.Utils.COIN;

/**
 * <p>NetworkParameters contains the data needed for working with an instantiation of a Kobocoin chain.</p>
 *
 * <p>This is an abstract class, concrete instantiations can be found in the params package. There are four:
 * one for the main network ({@link MainNetParams}), one for the public test network, and two others that are
 * intended for unit testing and local app development purposes. Although this class contains some aliases for
 * them, you are encouraged to call the static get() methods on each specific params class directly.</p>
 */
public abstract class NetworkParameters implements Serializable {
    /**
     * The protocol version this library implements.
     */
    public static final int PROTOCOL_VERSION = 70508;

    /**
     * The alert signing key.
     */
    /* THE OLD FROM KOBOCOIN
	* public static final byte[] SATOSHI_KEY = Hex.decode("04B4E3C86CBB37515D61852F3F08E665324EE2513255EE69E3EB171A4F7A9D23CE56BD23352F6538B2855E0916A09AEBDF4B661CFA919FC726F3BB63EC62619FFB");
	*
	*/
	public static final byte[] SATOSHI_KEY = Hex.decode("049F2C10997604217E7238A4C5CF2843570ADA001D1A247B228A7C5583ACD0F762A3130D0C4331EB262E3D0EB516AE6F7B0B1ADA43275013F8552A83A7C621B1D9");
    /** The string returned by getId() for the main, production network where people trade things. */
    public static final String ID_MAINNET = "org.kobocoin.production";
    /** Unit test network. */
    public static final String ID_UNITTESTNET = "com.tribesman.kobocoinj.unittest";

    /** The string used by the payment protocol to represent the main net. */
    public static final String PAYMENT_PROTOCOL_ID_MAINNET = "main";

    protected Block genesisBlock;
    protected BigInteger proofOfWorkLimit;
    protected int port;
    protected long packetMagic;
    protected int addressHeader;
    protected int p2shHeader;
    protected int dumpedPrivateKeyHeader;
    protected int interval;
    protected int targetTimespan;
    protected byte[] alertSigningKey;

    /**
     * See getId(). This may be null for old deserialized wallets. In that case we derive it heuristically
     * by looking at the port number.
     */
    protected String id;

    /**
     * The depth of blocks required for a coinbase transaction to be spendable.
     */
    protected int spendableCoinbaseDepth;
    protected int subsidyDecreaseBlockCount;
    
    protected int[] acceptableAddressCodes;
    protected String[] dnsSeeds;
    protected Map<Integer, Sha256Hash> checkpoints = new HashMap<Integer, Sha256Hash>();

    protected NetworkParameters() {
        alertSigningKey = SATOSHI_KEY;
        genesisBlock = createGenesis(this);
    }

    private static Block createGenesis(NetworkParameters n) {
        Block genesisBlock = new Block(n);
        Transaction t = new Transaction(n);
        t.setTime(1421090888);
        try {
            // A script containing the difficulty bits and the following message:
            //
            //   "World Leaders Head Paris March Honoring Terror Victims ABC NEWS 12012015"
            byte[] bytes = Hex.decode
                    ("00012a48576f726c64204c6561646572732048656164205061726973204d6172636820486f6e6f72696e6720546572726f722056696374696d7320414243204e455753203132303132303135");
            t.addInput(new TransactionInput(n, t, bytes));
            ByteArrayOutputStream scriptPubKeyBytes = new ByteArrayOutputStream();
            t.addOutput(new TransactionOutput(n, t, Utils.toNanoCoins(0, 0), scriptPubKeyBytes.toByteArray()));
        } catch (Exception e) {
            // Cannot happen.
            throw new RuntimeException(e);
        }
        genesisBlock.addTransaction(t);
        
        String merkleHash = genesisBlock.getMerkleRoot().toString();
	java.util.logging.Logger.getLogger("mytag").info("merkleHash2 = " + merkleHash);
        checkState(merkleHash.equals("3519d54cd3dddf456888921b8e97c43ef6f6204b95683a45f28437d4c44153d3"), merkleHash);
        
        return genesisBlock;
    }

    public static final int TARGET_TIMESPAN = 16 * 60;  // 16 minutes.
    public static final int TARGET_SPACING = 1 * 60;  // 1 minute per block.
    public static final int INTERVAL = 16; // Every 16 blocks
    
    /**
     * Blocks with a timestamp after this should enforce BIP 16, aka "Pay to script hash". This BIP changed the
     * network rules in a soft-forking manner, that is, blocks that don't follow the rules are accepted but not
     * mined upon and thus will be quickly re-orged out as long as the majority are enforcing the rule.
     */
    public static final int BIP16_ENFORCE_TIME = 1333238400;
    
    public static final BigInteger MAX_MONEY = new BigInteger("350000000", 10).multiply(COIN);
    //public static final BigInteger PREMINE = new BigInteger("36000000000", 10).multiply(COIN);


    /** Alias for MainNetParams.get(), use that instead */
    @Deprecated
    public static NetworkParameters prodNet() {
        return MainNetParams.get();
    }

    /** Returns a testnet params modified to allow any difficulty target. */
    @Deprecated
    public static NetworkParameters unitTests() {
        return UnitTestParams.get();
    }

    /**
     * A Java package style string acting as unique ID for these parameters
     */
    public String getId() {
        return id;
    }

    public abstract String getPaymentProtocolId();

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof NetworkParameters)) return false;
        NetworkParameters o = (NetworkParameters) other;
        return o.getId().equals(getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    /** Returns the network parameters for the given string ID or NULL if not recognized. */
    @Nullable
    public static NetworkParameters fromID(String id) {
        if (id.equals(ID_MAINNET)) {
            return MainNetParams.get();
        } else if (id.equals(ID_UNITTESTNET)) {
            return UnitTestParams.get();
        } else {
            return null;
        }
    }

    /** Returns the network parameters for the given string paymentProtocolID or NULL if not recognized. */
    @Nullable
    public static NetworkParameters fromPmtProtocolID(String pmtProtocolId) {
        if (pmtProtocolId.equals(PAYMENT_PROTOCOL_ID_MAINNET)) {
            return MainNetParams.get();
        } else {
            return null;
        }
    }

    public int getSpendableCoinbaseDepth() {
        return spendableCoinbaseDepth;
    }

    /**
     * Returns true if the block height is either not a checkpoint, or is a checkpoint and the hash matches.
     */
    public boolean passesCheckpoint(int height, Sha256Hash hash) {
        Sha256Hash checkpointHash = checkpoints.get(height);
        return checkpointHash == null || checkpointHash.equals(hash);
    }

    /**
     * Returns true if the given height has a recorded checkpoint.
     */
    public boolean isCheckpoint(int height) {
        Sha256Hash checkpointHash = checkpoints.get(height);
        return checkpointHash != null;
    }

    public int getSubsidyDecreaseBlockCount() {
        return subsidyDecreaseBlockCount;
    }

    /** Returns DNS names that when resolved, give IP addresses of active peers. */
    public String[] getDnsSeeds() {
        return dnsSeeds;
    }

    /**
     * <p>Genesis block for this chain.</p>
     *
     * <p>The first block in every chain is a well known constant shared between all Kobocoin implemenetations. For a
     * block to be valid, it must be eventually possible to work backwards to the genesis block by following the
     * prevBlockHash pointers in the block headers.</p>
     *
     * <p>The genesis blocks for both test and prod networks contain the timestamp of when they were created,
     * and a message in the coinbase transaction. It says, <i>"Matonis 07-AUG-2012 Parallel Currencies And The 
     * Roadmap To Monetary Freedom"</i>.</p>
     */
    public Block getGenesisBlock() {
        return genesisBlock;
    }

    /** Default TCP port on which to connect to nodes. */
    public int getPort() {
        return port;
    }

    /** The header bytes that identify the start of a packet on this network. */
    public long getPacketMagic() {
        return packetMagic;
    }

    /**
     * First byte of a base58 encoded address. See {@link com.tribesman.kobocoinj.core.Address}. This is the same as acceptableAddressCodes[0] and
     * is the one used for "normal" addresses. Other types of address may be encountered with version codes found in
     * the acceptableAddressCodes array.
     */
    public int getAddressHeader() {
        return addressHeader;
    }

    /**
     * First byte of a base58 encoded P2SH address.  P2SH addresses are defined as part of BIP0013.
     */
    public int getP2SHHeader() {
        return p2shHeader;
    }

    /** First byte of a base58 encoded dumped private key. See {@link com.tribesman.kobocoinj.core.DumpedPrivateKey}. */
    public int getDumpedPrivateKeyHeader() {
        return dumpedPrivateKeyHeader;
    }

    /**
     * How much time in seconds is supposed to pass between "interval" blocks. If the actual elapsed time is
     * significantly different from this value, the network difficulty formula will produce a different value. Both
     * test and production Kobocoin networks use 2 weeks (1209600 seconds).
     */
    public int getTargetTimespan() {
        return targetTimespan;
    }

    /**
     * The version codes that prefix addresses which are acceptable on this network. Although Satoshi intended these to
     * be used for "versioning", in fact they are today used to discriminate what kind of data is contained in the
     * address and to prevent accidentally sending coins across chains which would destroy them.
     */
    public int[] getAcceptableAddressCodes() {
        return acceptableAddressCodes;
    }

    /**
     * If we are running in testnet-in-a-box mode, we allow connections to nodes with 0 non-genesis blocks.
     */
    public boolean allowEmptyPeerChain() {
        return true;
    }

    /** How many blocks pass between difficulty adjustment periods. Kobocoin standardises this to be 2015. */
    public int getInterval() {
        return interval;
    }

    /** What the easiest allowable proof of work should be. */
    public BigInteger getProofOfWorkLimit() {
        return proofOfWorkLimit;
    }

    /**
     * The key used to sign {@link com.tribesman.kobocoinj.core.AlertMessage}s. You can use {@link com.tribesman.kobocoinj.core.ECKey#verify(byte[], byte[], byte[])} to verify
     * signatures using it.
     */
    public byte[] getAlertSigningKey() {
        return alertSigningKey;
    }
}
