/**
 * Copyright 2013 Google Inc.
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

import java.util.List;

/**
 * Default no-op implementation of {@link BlockChainListener}.
 */
public class AbstractBlockChainListener implements com.tribesman.kobocoinj.core.BlockChainListener {
    @Override
    public void notifyNewBestBlock(com.tribesman.kobocoinj.core.StoredBlock block) throws com.tribesman.kobocoinj.core.VerificationException {
    }

    @Override
    public void reorganize(com.tribesman.kobocoinj.core.StoredBlock splitPoint, List<com.tribesman.kobocoinj.core.StoredBlock> oldBlocks, List<com.tribesman.kobocoinj.core.StoredBlock> newBlocks) throws com.tribesman.kobocoinj.core.VerificationException {
    }

    @Override
    public boolean isTransactionRelevant(com.tribesman.kobocoinj.core.Transaction tx) throws com.tribesman.kobocoinj.core.ScriptException {
        return false;
    }

    @Override
    public void receiveFromBlock(com.tribesman.kobocoinj.core.Transaction tx, com.tribesman.kobocoinj.core.StoredBlock block, com.tribesman.kobocoinj.core.BlockChain.NewBlockType blockType,
                                 int relativityOffset) throws com.tribesman.kobocoinj.core.VerificationException {
    }

    @Override
    public boolean notifyTransactionIsInBlock(com.tribesman.kobocoinj.core.Sha256Hash txHash, com.tribesman.kobocoinj.core.StoredBlock block, com.tribesman.kobocoinj.core.BlockChain.NewBlockType blockType,
                                              int relativityOffset) throws com.tribesman.kobocoinj.core.VerificationException {
        return false;
    }
}
