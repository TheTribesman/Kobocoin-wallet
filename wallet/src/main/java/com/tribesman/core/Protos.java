package com.tribesman.core;

import java.util.List;

public final class Protos {
    private Protos() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    public interface PeerAddressOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required bytes ip_address = 1;
        /**
         * <code>required bytes ip_address = 1;</code>
         */
        boolean hasIpAddress();
        /**
         * <code>required bytes ip_address = 1;</code>
         */
        com.google.protobuf.ByteString getIpAddress();

        // required uint32 port = 2;
        /**
         * <code>required uint32 port = 2;</code>
         */
        boolean hasPort();
        /**
         * <code>required uint32 port = 2;</code>
         */
        int getPort();

        // required uint64 services = 3;
        /**
         * <code>required uint64 services = 3;</code>
         */
        boolean hasServices();
        /**
         * <code>required uint64 services = 3;</code>
         */
        long getServices();
    }
    /**
     * Protobuf type {@code wallet.PeerAddress}
     */
    public static final class PeerAddress extends
            com.google.protobuf.GeneratedMessage
            implements PeerAddressOrBuilder {
        // Use PeerAddress.newBuilder() to construct.
        private PeerAddress(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private PeerAddress(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final PeerAddress defaultInstance;
        public static PeerAddress getDefaultInstance() {
            return defaultInstance;
        }

        public PeerAddress getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private PeerAddress(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            ipAddress_ = input.readBytes();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            port_ = input.readUInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            services_ = input.readUInt64();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_PeerAddress_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_PeerAddress_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.PeerAddress.class, Protos.PeerAddress.Builder.class);
        }

        public static com.google.protobuf.Parser<PeerAddress> PARSER =
                new com.google.protobuf.AbstractParser<PeerAddress>() {
                    public PeerAddress parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PeerAddress(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<PeerAddress> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required bytes ip_address = 1;
        public static final int IP_ADDRESS_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString ipAddress_;
        /**
         * <code>required bytes ip_address = 1;</code>
         */
        public boolean hasIpAddress() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required bytes ip_address = 1;</code>
         */
        public com.google.protobuf.ByteString getIpAddress() {
            return ipAddress_;
        }

        // required uint32 port = 2;
        public static final int PORT_FIELD_NUMBER = 2;
        private int port_;
        /**
         * <code>required uint32 port = 2;</code>
         */
        public boolean hasPort() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required uint32 port = 2;</code>
         */
        public int getPort() {
            return port_;
        }

        // required uint64 services = 3;
        public static final int SERVICES_FIELD_NUMBER = 3;
        private long services_;
        /**
         * <code>required uint64 services = 3;</code>
         */
        public boolean hasServices() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required uint64 services = 3;</code>
         */
        public long getServices() {
            return services_;
        }

        private void initFields() {
            ipAddress_ = com.google.protobuf.ByteString.EMPTY;
            port_ = 0;
            services_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasIpAddress()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasPort()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasServices()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, ipAddress_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt32(2, port_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt64(3, services_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, ipAddress_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, port_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(3, services_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.PeerAddress parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.PeerAddress parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.PeerAddress parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.PeerAddress parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.PeerAddress parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.PeerAddress parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.PeerAddress parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.PeerAddress parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.PeerAddress parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.PeerAddress parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.PeerAddress prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.PeerAddress}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.PeerAddressOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_PeerAddress_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_PeerAddress_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.PeerAddress.class, Protos.PeerAddress.Builder.class);
            }

            // Construct using Protos.PeerAddress.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                ipAddress_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                port_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                services_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_PeerAddress_descriptor;
            }

            public Protos.PeerAddress getDefaultInstanceForType() {
                return Protos.PeerAddress.getDefaultInstance();
            }

            public Protos.PeerAddress build() {
                Protos.PeerAddress result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.PeerAddress buildPartial() {
                Protos.PeerAddress result = new Protos.PeerAddress(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.ipAddress_ = ipAddress_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.port_ = port_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.services_ = services_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.PeerAddress) {
                    return mergeFrom((Protos.PeerAddress)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.PeerAddress other) {
                if (other == Protos.PeerAddress.getDefaultInstance()) return this;
                if (other.hasIpAddress()) {
                    setIpAddress(other.getIpAddress());
                }
                if (other.hasPort()) {
                    setPort(other.getPort());
                }
                if (other.hasServices()) {
                    setServices(other.getServices());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasIpAddress()) {

                    return false;
                }
                if (!hasPort()) {

                    return false;
                }
                if (!hasServices()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.PeerAddress parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.PeerAddress) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required bytes ip_address = 1;
            private com.google.protobuf.ByteString ipAddress_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes ip_address = 1;</code>
             */
            public boolean hasIpAddress() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required bytes ip_address = 1;</code>
             */
            public com.google.protobuf.ByteString getIpAddress() {
                return ipAddress_;
            }
            /**
             * <code>required bytes ip_address = 1;</code>
             */
            public Builder setIpAddress(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                ipAddress_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes ip_address = 1;</code>
             */
            public Builder clearIpAddress() {
                bitField0_ = (bitField0_ & ~0x00000001);
                ipAddress_ = getDefaultInstance().getIpAddress();
                onChanged();
                return this;
            }

            // required uint32 port = 2;
            private int port_ ;
            /**
             * <code>required uint32 port = 2;</code>
             */
            public boolean hasPort() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required uint32 port = 2;</code>
             */
            public int getPort() {
                return port_;
            }
            /**
             * <code>required uint32 port = 2;</code>
             */
            public Builder setPort(int value) {
                bitField0_ |= 0x00000002;
                port_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required uint32 port = 2;</code>
             */
            public Builder clearPort() {
                bitField0_ = (bitField0_ & ~0x00000002);
                port_ = 0;
                onChanged();
                return this;
            }

            // required uint64 services = 3;
            private long services_ ;
            /**
             * <code>required uint64 services = 3;</code>
             */
            public boolean hasServices() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required uint64 services = 3;</code>
             */
            public long getServices() {
                return services_;
            }
            /**
             * <code>required uint64 services = 3;</code>
             */
            public Builder setServices(long value) {
                bitField0_ |= 0x00000004;
                services_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required uint64 services = 3;</code>
             */
            public Builder clearServices() {
                bitField0_ = (bitField0_ & ~0x00000004);
                services_ = 0L;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.PeerAddress)
        }

        static {
            defaultInstance = new PeerAddress(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.PeerAddress)
    }

    public interface EncryptedPrivateKeyOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required bytes initialisation_vector = 1;
        /**
         * <code>required bytes initialisation_vector = 1;</code>
         *
         * <pre>
         * The initialisation vector for the AES encryption (16 bytes)
         * </pre>
         */
        boolean hasInitialisationVector();
        /**
         * <code>required bytes initialisation_vector = 1;</code>
         *
         * <pre>
         * The initialisation vector for the AES encryption (16 bytes)
         * </pre>
         */
        com.google.protobuf.ByteString getInitialisationVector();

        // required bytes encrypted_private_key = 2;
        /**
         * <code>required bytes encrypted_private_key = 2;</code>
         *
         * <pre>
         * The encrypted private key
         * </pre>
         */
        boolean hasEncryptedPrivateKey();
        /**
         * <code>required bytes encrypted_private_key = 2;</code>
         *
         * <pre>
         * The encrypted private key
         * </pre>
         */
        com.google.protobuf.ByteString getEncryptedPrivateKey();
    }
    /**
     * Protobuf type {@code wallet.EncryptedPrivateKey}
     *
     * <pre>
     **
     * The data to store a private key encrypted with Scrypt and AES
     * </pre>
     */
    public static final class EncryptedPrivateKey extends
            com.google.protobuf.GeneratedMessage
            implements EncryptedPrivateKeyOrBuilder {
        // Use EncryptedPrivateKey.newBuilder() to construct.
        private EncryptedPrivateKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private EncryptedPrivateKey(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final EncryptedPrivateKey defaultInstance;
        public static EncryptedPrivateKey getDefaultInstance() {
            return defaultInstance;
        }

        public EncryptedPrivateKey getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private EncryptedPrivateKey(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            initialisationVector_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            encryptedPrivateKey_ = input.readBytes();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_EncryptedPrivateKey_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_EncryptedPrivateKey_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.EncryptedPrivateKey.class, Protos.EncryptedPrivateKey.Builder.class);
        }

        public static com.google.protobuf.Parser<EncryptedPrivateKey> PARSER =
                new com.google.protobuf.AbstractParser<EncryptedPrivateKey>() {
                    public EncryptedPrivateKey parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new EncryptedPrivateKey(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<EncryptedPrivateKey> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required bytes initialisation_vector = 1;
        public static final int INITIALISATION_VECTOR_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString initialisationVector_;
        /**
         * <code>required bytes initialisation_vector = 1;</code>
         *
         * <pre>
         * The initialisation vector for the AES encryption (16 bytes)
         * </pre>
         */
        public boolean hasInitialisationVector() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required bytes initialisation_vector = 1;</code>
         *
         * <pre>
         * The initialisation vector for the AES encryption (16 bytes)
         * </pre>
         */
        public com.google.protobuf.ByteString getInitialisationVector() {
            return initialisationVector_;
        }

        // required bytes encrypted_private_key = 2;
        public static final int ENCRYPTED_PRIVATE_KEY_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString encryptedPrivateKey_;
        /**
         * <code>required bytes encrypted_private_key = 2;</code>
         *
         * <pre>
         * The encrypted private key
         * </pre>
         */
        public boolean hasEncryptedPrivateKey() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required bytes encrypted_private_key = 2;</code>
         *
         * <pre>
         * The encrypted private key
         * </pre>
         */
        public com.google.protobuf.ByteString getEncryptedPrivateKey() {
            return encryptedPrivateKey_;
        }

        private void initFields() {
            initialisationVector_ = com.google.protobuf.ByteString.EMPTY;
            encryptedPrivateKey_ = com.google.protobuf.ByteString.EMPTY;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasInitialisationVector()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasEncryptedPrivateKey()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, initialisationVector_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, encryptedPrivateKey_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, initialisationVector_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, encryptedPrivateKey_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.EncryptedPrivateKey parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.EncryptedPrivateKey parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.EncryptedPrivateKey parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.EncryptedPrivateKey parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.EncryptedPrivateKey parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.EncryptedPrivateKey parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.EncryptedPrivateKey parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.EncryptedPrivateKey parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.EncryptedPrivateKey parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.EncryptedPrivateKey parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.EncryptedPrivateKey prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.EncryptedPrivateKey}
         *
         * <pre>
         **
         * The data to store a private key encrypted with Scrypt and AES
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.EncryptedPrivateKeyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_EncryptedPrivateKey_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_EncryptedPrivateKey_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.EncryptedPrivateKey.class, Protos.EncryptedPrivateKey.Builder.class);
            }

            // Construct using Protos.EncryptedPrivateKey.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                initialisationVector_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                encryptedPrivateKey_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_EncryptedPrivateKey_descriptor;
            }

            public Protos.EncryptedPrivateKey getDefaultInstanceForType() {
                return Protos.EncryptedPrivateKey.getDefaultInstance();
            }

            public Protos.EncryptedPrivateKey build() {
                Protos.EncryptedPrivateKey result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.EncryptedPrivateKey buildPartial() {
                Protos.EncryptedPrivateKey result = new Protos.EncryptedPrivateKey(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.initialisationVector_ = initialisationVector_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.encryptedPrivateKey_ = encryptedPrivateKey_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.EncryptedPrivateKey) {
                    return mergeFrom((Protos.EncryptedPrivateKey)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.EncryptedPrivateKey other) {
                if (other == Protos.EncryptedPrivateKey.getDefaultInstance()) return this;
                if (other.hasInitialisationVector()) {
                    setInitialisationVector(other.getInitialisationVector());
                }
                if (other.hasEncryptedPrivateKey()) {
                    setEncryptedPrivateKey(other.getEncryptedPrivateKey());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasInitialisationVector()) {

                    return false;
                }
                if (!hasEncryptedPrivateKey()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.EncryptedPrivateKey parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.EncryptedPrivateKey) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required bytes initialisation_vector = 1;
            private com.google.protobuf.ByteString initialisationVector_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes initialisation_vector = 1;</code>
             *
             * <pre>
             * The initialisation vector for the AES encryption (16 bytes)
             * </pre>
             */
            public boolean hasInitialisationVector() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required bytes initialisation_vector = 1;</code>
             *
             * <pre>
             * The initialisation vector for the AES encryption (16 bytes)
             * </pre>
             */
            public com.google.protobuf.ByteString getInitialisationVector() {
                return initialisationVector_;
            }
            /**
             * <code>required bytes initialisation_vector = 1;</code>
             *
             * <pre>
             * The initialisation vector for the AES encryption (16 bytes)
             * </pre>
             */
            public Builder setInitialisationVector(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                initialisationVector_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes initialisation_vector = 1;</code>
             *
             * <pre>
             * The initialisation vector for the AES encryption (16 bytes)
             * </pre>
             */
            public Builder clearInitialisationVector() {
                bitField0_ = (bitField0_ & ~0x00000001);
                initialisationVector_ = getDefaultInstance().getInitialisationVector();
                onChanged();
                return this;
            }

            // required bytes encrypted_private_key = 2;
            private com.google.protobuf.ByteString encryptedPrivateKey_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes encrypted_private_key = 2;</code>
             *
             * <pre>
             * The encrypted private key
             * </pre>
             */
            public boolean hasEncryptedPrivateKey() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required bytes encrypted_private_key = 2;</code>
             *
             * <pre>
             * The encrypted private key
             * </pre>
             */
            public com.google.protobuf.ByteString getEncryptedPrivateKey() {
                return encryptedPrivateKey_;
            }
            /**
             * <code>required bytes encrypted_private_key = 2;</code>
             *
             * <pre>
             * The encrypted private key
             * </pre>
             */
            public Builder setEncryptedPrivateKey(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                encryptedPrivateKey_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes encrypted_private_key = 2;</code>
             *
             * <pre>
             * The encrypted private key
             * </pre>
             */
            public Builder clearEncryptedPrivateKey() {
                bitField0_ = (bitField0_ & ~0x00000002);
                encryptedPrivateKey_ = getDefaultInstance().getEncryptedPrivateKey();
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.EncryptedPrivateKey)
        }

        static {
            defaultInstance = new EncryptedPrivateKey(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.EncryptedPrivateKey)
    }

    public interface KeyOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required .wallet.Key.Type type = 1;
        /**
         * <code>required .wallet.Key.Type type = 1;</code>
         */
        boolean hasType();
        /**
         * <code>required .wallet.Key.Type type = 1;</code>
         */
        Protos.Key.Type getType();

        // optional bytes private_key = 2;
        /**
         * <code>optional bytes private_key = 2;</code>
         *
         * <pre>
         * The private EC key bytes without any ASN.1 wrapping.
         * </pre>
         */
        boolean hasPrivateKey();
        /**
         * <code>optional bytes private_key = 2;</code>
         *
         * <pre>
         * The private EC key bytes without any ASN.1 wrapping.
         * </pre>
         */
        com.google.protobuf.ByteString getPrivateKey();

        // optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;
        /**
         * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
         *
         * <pre>
         * The message containing the encrypted private EC key information.
         * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
         * This is for security of the private key information.
         * </pre>
         */
        boolean hasEncryptedPrivateKey();
        /**
         * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
         *
         * <pre>
         * The message containing the encrypted private EC key information.
         * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
         * This is for security of the private key information.
         * </pre>
         */
        Protos.EncryptedPrivateKey getEncryptedPrivateKey();
        /**
         * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
         *
         * <pre>
         * The message containing the encrypted private EC key information.
         * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
         * This is for security of the private key information.
         * </pre>
         */
        Protos.EncryptedPrivateKeyOrBuilder getEncryptedPrivateKeyOrBuilder();

        // optional bytes public_key = 3;
        /**
         * <code>optional bytes public_key = 3;</code>
         *
         * <pre>
         * The public EC key derived from the private key. We allow both to be stored to avoid mobile clients having to
         * do lots of slow EC math on startup.
         * </pre>
         */
        boolean hasPublicKey();
        /**
         * <code>optional bytes public_key = 3;</code>
         *
         * <pre>
         * The public EC key derived from the private key. We allow both to be stored to avoid mobile clients having to
         * do lots of slow EC math on startup.
         * </pre>
         */
        com.google.protobuf.ByteString getPublicKey();

        // optional string label = 4;
        /**
         * <code>optional string label = 4;</code>
         *
         * <pre>
         * User-provided label associated with the key.
         * </pre>
         */
        boolean hasLabel();
        /**
         * <code>optional string label = 4;</code>
         *
         * <pre>
         * User-provided label associated with the key.
         * </pre>
         */
        java.lang.String getLabel();
        /**
         * <code>optional string label = 4;</code>
         *
         * <pre>
         * User-provided label associated with the key.
         * </pre>
         */
        com.google.protobuf.ByteString
        getLabelBytes();

        // optional int64 creation_timestamp = 5;
        /**
         * <code>optional int64 creation_timestamp = 5;</code>
         *
         * <pre>
         * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point.
         * </pre>
         */
        boolean hasCreationTimestamp();
        /**
         * <code>optional int64 creation_timestamp = 5;</code>
         *
         * <pre>
         * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point.
         * </pre>
         */
        long getCreationTimestamp();
    }
    /**
     * Protobuf type {@code wallet.Key}
     *
     * <pre>
     **
     * A key used to control Kobocoin spending.
     *
     * Either the private key, the public key or both may be present.  It is recommended that
     * if the private key is provided that the public key is provided too because deriving it is slow.
     *
     * If only the public key is provided, the key can only be used to watch the blockchain and verify
     * transactions, and not for spending.
     * </pre>
     */
    public static final class Key extends
            com.google.protobuf.GeneratedMessage
            implements KeyOrBuilder {
        // Use Key.newBuilder() to construct.
        private Key(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Key(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final Key defaultInstance;
        public static Key getDefaultInstance() {
            return defaultInstance;
        }

        public Key getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Key(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();
                            Protos.Key.Type value = Protos.Key.Type.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(1, rawValue);
                            } else {
                                bitField0_ |= 0x00000001;
                                type_ = value;
                            }
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            privateKey_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000008;
                            publicKey_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000010;
                            label_ = input.readBytes();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000020;
                            creationTimestamp_ = input.readInt64();
                            break;
                        }
                        case 50: {
                            Protos.EncryptedPrivateKey.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                                subBuilder = encryptedPrivateKey_.toBuilder();
                            }
                            encryptedPrivateKey_ = input.readMessage(Protos.EncryptedPrivateKey.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(encryptedPrivateKey_);
                                encryptedPrivateKey_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000004;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_Key_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_Key_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.Key.class, Protos.Key.Builder.class);
        }

        public static com.google.protobuf.Parser<Key> PARSER =
                new com.google.protobuf.AbstractParser<Key>() {
                    public Key parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Key(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<Key> getParserForType() {
            return PARSER;
        }

        /**
         * Protobuf enum {@code wallet.Key.Type}
         */
        public enum Type
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>ORIGINAL = 1;</code>
             *
             * <pre>
             * Unencrypted - Original kobocoin secp256k1 curve
             * </pre>
             */
            ORIGINAL(0, 1),
            /**
             * <code>ENCRYPTED_SCRYPT_AES = 2;</code>
             *
             * <pre>
             * Encrypted with Scrypt and AES - - Original kobocoin secp256k1 curve
             * </pre>
             */
            ENCRYPTED_SCRYPT_AES(1, 2),
            ;

            /**
             * <code>ORIGINAL = 1;</code>
             *
             * <pre>
             * Unencrypted - Original kobocoin secp256k1 curve
             * </pre>
             */
            public static final int ORIGINAL_VALUE = 1;
            /**
             * <code>ENCRYPTED_SCRYPT_AES = 2;</code>
             *
             * <pre>
             * Encrypted with Scrypt and AES - - Original kobocoin secp256k1 curve
             * </pre>
             */
            public static final int ENCRYPTED_SCRYPT_AES_VALUE = 2;


            public final int getNumber() { return value; }

            public static Type valueOf(int value) {
                switch (value) {
                    case 1: return ORIGINAL;
                    case 2: return ENCRYPTED_SCRYPT_AES;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Type>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<Type>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Type>() {
                        public Type findValueByNumber(int number) {
                            return Type.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Protos.Key.getDescriptor().getEnumTypes().get(0);
            }

            private static final Type[] VALUES = values();

            public static Type valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private Type(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:wallet.Key.Type)
        }

        private int bitField0_;
        // required .wallet.Key.Type type = 1;
        public static final int TYPE_FIELD_NUMBER = 1;
        private Protos.Key.Type type_;
        /**
         * <code>required .wallet.Key.Type type = 1;</code>
         */
        public boolean hasType() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required .wallet.Key.Type type = 1;</code>
         */
        public Protos.Key.Type getType() {
            return type_;
        }

        // optional bytes private_key = 2;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString privateKey_;
        /**
         * <code>optional bytes private_key = 2;</code>
         *
         * <pre>
         * The private EC key bytes without any ASN.1 wrapping.
         * </pre>
         */
        public boolean hasPrivateKey() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional bytes private_key = 2;</code>
         *
         * <pre>
         * The private EC key bytes without any ASN.1 wrapping.
         * </pre>
         */
        public com.google.protobuf.ByteString getPrivateKey() {
            return privateKey_;
        }

        // optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;
        public static final int ENCRYPTED_PRIVATE_KEY_FIELD_NUMBER = 6;
        private Protos.EncryptedPrivateKey encryptedPrivateKey_;
        /**
         * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
         *
         * <pre>
         * The message containing the encrypted private EC key information.
         * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
         * This is for security of the private key information.
         * </pre>
         */
        public boolean hasEncryptedPrivateKey() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
         *
         * <pre>
         * The message containing the encrypted private EC key information.
         * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
         * This is for security of the private key information.
         * </pre>
         */
        public Protos.EncryptedPrivateKey getEncryptedPrivateKey() {
            return encryptedPrivateKey_;
        }
        /**
         * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
         *
         * <pre>
         * The message containing the encrypted private EC key information.
         * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
         * This is for security of the private key information.
         * </pre>
         */
        public Protos.EncryptedPrivateKeyOrBuilder getEncryptedPrivateKeyOrBuilder() {
            return encryptedPrivateKey_;
        }

        // optional bytes public_key = 3;
        public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
        private com.google.protobuf.ByteString publicKey_;
        /**
         * <code>optional bytes public_key = 3;</code>
         *
         * <pre>
         * The public EC key derived from the private key. We allow both to be stored to avoid mobile clients having to
         * do lots of slow EC math on startup.
         * </pre>
         */
        public boolean hasPublicKey() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional bytes public_key = 3;</code>
         *
         * <pre>
         * The public EC key derived from the private key. We allow both to be stored to avoid mobile clients having to
         * do lots of slow EC math on startup.
         * </pre>
         */
        public com.google.protobuf.ByteString getPublicKey() {
            return publicKey_;
        }

        // optional string label = 4;
        public static final int LABEL_FIELD_NUMBER = 4;
        private java.lang.Object label_;
        /**
         * <code>optional string label = 4;</code>
         *
         * <pre>
         * User-provided label associated with the key.
         * </pre>
         */
        public boolean hasLabel() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional string label = 4;</code>
         *
         * <pre>
         * User-provided label associated with the key.
         * </pre>
         */
        public java.lang.String getLabel() {
            java.lang.Object ref = label_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    label_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string label = 4;</code>
         *
         * <pre>
         * User-provided label associated with the key.
         * </pre>
         */
        public com.google.protobuf.ByteString
        getLabelBytes() {
            java.lang.Object ref = label_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                label_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional int64 creation_timestamp = 5;
        public static final int CREATION_TIMESTAMP_FIELD_NUMBER = 5;
        private long creationTimestamp_;
        /**
         * <code>optional int64 creation_timestamp = 5;</code>
         *
         * <pre>
         * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point.
         * </pre>
         */
        public boolean hasCreationTimestamp() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional int64 creation_timestamp = 5;</code>
         *
         * <pre>
         * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point.
         * </pre>
         */
        public long getCreationTimestamp() {
            return creationTimestamp_;
        }

        private void initFields() {
            type_ = Protos.Key.Type.ORIGINAL;
            privateKey_ = com.google.protobuf.ByteString.EMPTY;
            encryptedPrivateKey_ = Protos.EncryptedPrivateKey.getDefaultInstance();
            publicKey_ = com.google.protobuf.ByteString.EMPTY;
            label_ = "";
            creationTimestamp_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasType()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (hasEncryptedPrivateKey()) {
                if (!getEncryptedPrivateKey().isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, type_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, privateKey_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(3, publicKey_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBytes(4, getLabelBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeInt64(5, creationTimestamp_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeMessage(6, encryptedPrivateKey_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, type_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, privateKey_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, publicKey_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getLabelBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(5, creationTimestamp_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, encryptedPrivateKey_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.Key parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Key parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Key parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Key parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Key parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Key parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.Key parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.Key parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.Key parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Key parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.Key prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.Key}
         *
         * <pre>
         **
         * A key used to control Kobocoin spending.
         *
         * Either the private key, the public key or both may be present.  It is recommended that
         * if the private key is provided that the public key is provided too because deriving it is slow.
         *
         * If only the public key is provided, the key can only be used to watch the blockchain and verify
         * transactions, and not for spending.
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.KeyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_Key_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_Key_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.Key.class, Protos.Key.Builder.class);
            }

            // Construct using Protos.Key.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    getEncryptedPrivateKeyFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                type_ = Protos.Key.Type.ORIGINAL;
                bitField0_ = (bitField0_ & ~0x00000001);
                privateKey_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                if (encryptedPrivateKeyBuilder_ == null) {
                    encryptedPrivateKey_ = Protos.EncryptedPrivateKey.getDefaultInstance();
                } else {
                    encryptedPrivateKeyBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                publicKey_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000008);
                label_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                creationTimestamp_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000020);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_Key_descriptor;
            }

            public Protos.Key getDefaultInstanceForType() {
                return Protos.Key.getDefaultInstance();
            }

            public Protos.Key build() {
                Protos.Key result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.Key buildPartial() {
                Protos.Key result = new Protos.Key(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.type_ = type_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.privateKey_ = privateKey_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                if (encryptedPrivateKeyBuilder_ == null) {
                    result.encryptedPrivateKey_ = encryptedPrivateKey_;
                } else {
                    result.encryptedPrivateKey_ = encryptedPrivateKeyBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.publicKey_ = publicKey_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.label_ = label_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.creationTimestamp_ = creationTimestamp_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.Key) {
                    return mergeFrom((Protos.Key)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.Key other) {
                if (other == Protos.Key.getDefaultInstance()) return this;
                if (other.hasType()) {
                    setType(other.getType());
                }
                if (other.hasPrivateKey()) {
                    setPrivateKey(other.getPrivateKey());
                }
                if (other.hasEncryptedPrivateKey()) {
                    mergeEncryptedPrivateKey(other.getEncryptedPrivateKey());
                }
                if (other.hasPublicKey()) {
                    setPublicKey(other.getPublicKey());
                }
                if (other.hasLabel()) {
                    bitField0_ |= 0x00000010;
                    label_ = other.label_;
                    onChanged();
                }
                if (other.hasCreationTimestamp()) {
                    setCreationTimestamp(other.getCreationTimestamp());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasType()) {

                    return false;
                }
                if (hasEncryptedPrivateKey()) {
                    if (!getEncryptedPrivateKey().isInitialized()) {

                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.Key parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.Key) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required .wallet.Key.Type type = 1;
            private Protos.Key.Type type_ = Protos.Key.Type.ORIGINAL;
            /**
             * <code>required .wallet.Key.Type type = 1;</code>
             */
            public boolean hasType() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required .wallet.Key.Type type = 1;</code>
             */
            public Protos.Key.Type getType() {
                return type_;
            }
            /**
             * <code>required .wallet.Key.Type type = 1;</code>
             */
            public Builder setType(Protos.Key.Type value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                type_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required .wallet.Key.Type type = 1;</code>
             */
            public Builder clearType() {
                bitField0_ = (bitField0_ & ~0x00000001);
                type_ = Protos.Key.Type.ORIGINAL;
                onChanged();
                return this;
            }

            // optional bytes private_key = 2;
            private com.google.protobuf.ByteString privateKey_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes private_key = 2;</code>
             *
             * <pre>
             * The private EC key bytes without any ASN.1 wrapping.
             * </pre>
             */
            public boolean hasPrivateKey() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional bytes private_key = 2;</code>
             *
             * <pre>
             * The private EC key bytes without any ASN.1 wrapping.
             * </pre>
             */
            public com.google.protobuf.ByteString getPrivateKey() {
                return privateKey_;
            }
            /**
             * <code>optional bytes private_key = 2;</code>
             *
             * <pre>
             * The private EC key bytes without any ASN.1 wrapping.
             * </pre>
             */
            public Builder setPrivateKey(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                privateKey_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes private_key = 2;</code>
             *
             * <pre>
             * The private EC key bytes without any ASN.1 wrapping.
             * </pre>
             */
            public Builder clearPrivateKey() {
                bitField0_ = (bitField0_ & ~0x00000002);
                privateKey_ = getDefaultInstance().getPrivateKey();
                onChanged();
                return this;
            }

            // optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;
            private Protos.EncryptedPrivateKey encryptedPrivateKey_ = Protos.EncryptedPrivateKey.getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<
                    Protos.EncryptedPrivateKey, Protos.EncryptedPrivateKey.Builder, Protos.EncryptedPrivateKeyOrBuilder> encryptedPrivateKeyBuilder_;
            /**
             * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
             *
             * <pre>
             * The message containing the encrypted private EC key information.
             * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
             * This is for security of the private key information.
             * </pre>
             */
            public boolean hasEncryptedPrivateKey() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
             *
             * <pre>
             * The message containing the encrypted private EC key information.
             * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
             * This is for security of the private key information.
             * </pre>
             */
            public Protos.EncryptedPrivateKey getEncryptedPrivateKey() {
                if (encryptedPrivateKeyBuilder_ == null) {
                    return encryptedPrivateKey_;
                } else {
                    return encryptedPrivateKeyBuilder_.getMessage();
                }
            }
            /**
             * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
             *
             * <pre>
             * The message containing the encrypted private EC key information.
             * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
             * This is for security of the private key information.
             * </pre>
             */
            public Builder setEncryptedPrivateKey(Protos.EncryptedPrivateKey value) {
                if (encryptedPrivateKeyBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    encryptedPrivateKey_ = value;
                    onChanged();
                } else {
                    encryptedPrivateKeyBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
             *
             * <pre>
             * The message containing the encrypted private EC key information.
             * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
             * This is for security of the private key information.
             * </pre>
             */
            public Builder setEncryptedPrivateKey(
                    Protos.EncryptedPrivateKey.Builder builderForValue) {
                if (encryptedPrivateKeyBuilder_ == null) {
                    encryptedPrivateKey_ = builderForValue.build();
                    onChanged();
                } else {
                    encryptedPrivateKeyBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
             *
             * <pre>
             * The message containing the encrypted private EC key information.
             * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
             * This is for security of the private key information.
             * </pre>
             */
            public Builder mergeEncryptedPrivateKey(Protos.EncryptedPrivateKey value) {
                if (encryptedPrivateKeyBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) == 0x00000004) &&
                            encryptedPrivateKey_ != Protos.EncryptedPrivateKey.getDefaultInstance()) {
                        encryptedPrivateKey_ =
                                Protos.EncryptedPrivateKey.newBuilder(encryptedPrivateKey_).mergeFrom(value).buildPartial();
                    } else {
                        encryptedPrivateKey_ = value;
                    }
                    onChanged();
                } else {
                    encryptedPrivateKeyBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
             *
             * <pre>
             * The message containing the encrypted private EC key information.
             * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
             * This is for security of the private key information.
             * </pre>
             */
            public Builder clearEncryptedPrivateKey() {
                if (encryptedPrivateKeyBuilder_ == null) {
                    encryptedPrivateKey_ = Protos.EncryptedPrivateKey.getDefaultInstance();
                    onChanged();
                } else {
                    encryptedPrivateKeyBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }
            /**
             * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
             *
             * <pre>
             * The message containing the encrypted private EC key information.
             * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
             * This is for security of the private key information.
             * </pre>
             */
            public Protos.EncryptedPrivateKey.Builder getEncryptedPrivateKeyBuilder() {
                bitField0_ |= 0x00000004;
                onChanged();
                return getEncryptedPrivateKeyFieldBuilder().getBuilder();
            }
            /**
             * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
             *
             * <pre>
             * The message containing the encrypted private EC key information.
             * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
             * This is for security of the private key information.
             * </pre>
             */
            public Protos.EncryptedPrivateKeyOrBuilder getEncryptedPrivateKeyOrBuilder() {
                if (encryptedPrivateKeyBuilder_ != null) {
                    return encryptedPrivateKeyBuilder_.getMessageOrBuilder();
                } else {
                    return encryptedPrivateKey_;
                }
            }
            /**
             * <code>optional .wallet.EncryptedPrivateKey encrypted_private_key = 6;</code>
             *
             * <pre>
             * The message containing the encrypted private EC key information.
             * When an EncryptedPrivateKey is present then the (unencrypted) private_key will be a zero length byte array or contain all zeroes.
             * This is for security of the private key information.
             * </pre>
             */
            private com.google.protobuf.SingleFieldBuilder<
                    Protos.EncryptedPrivateKey, Protos.EncryptedPrivateKey.Builder, Protos.EncryptedPrivateKeyOrBuilder>
            getEncryptedPrivateKeyFieldBuilder() {
                if (encryptedPrivateKeyBuilder_ == null) {
                    encryptedPrivateKeyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                            Protos.EncryptedPrivateKey, Protos.EncryptedPrivateKey.Builder, Protos.EncryptedPrivateKeyOrBuilder>(
                            encryptedPrivateKey_,
                            getParentForChildren(),
                            isClean());
                    encryptedPrivateKey_ = null;
                }
                return encryptedPrivateKeyBuilder_;
            }

            // optional bytes public_key = 3;
            private com.google.protobuf.ByteString publicKey_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes public_key = 3;</code>
             *
             * <pre>
             * The public EC key derived from the private key. We allow both to be stored to avoid mobile clients having to
             * do lots of slow EC math on startup.
             * </pre>
             */
            public boolean hasPublicKey() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional bytes public_key = 3;</code>
             *
             * <pre>
             * The public EC key derived from the private key. We allow both to be stored to avoid mobile clients having to
             * do lots of slow EC math on startup.
             * </pre>
             */
            public com.google.protobuf.ByteString getPublicKey() {
                return publicKey_;
            }
            /**
             * <code>optional bytes public_key = 3;</code>
             *
             * <pre>
             * The public EC key derived from the private key. We allow both to be stored to avoid mobile clients having to
             * do lots of slow EC math on startup.
             * </pre>
             */
            public Builder setPublicKey(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                publicKey_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes public_key = 3;</code>
             *
             * <pre>
             * The public EC key derived from the private key. We allow both to be stored to avoid mobile clients having to
             * do lots of slow EC math on startup.
             * </pre>
             */
            public Builder clearPublicKey() {
                bitField0_ = (bitField0_ & ~0x00000008);
                publicKey_ = getDefaultInstance().getPublicKey();
                onChanged();
                return this;
            }

            // optional string label = 4;
            private java.lang.Object label_ = "";
            /**
             * <code>optional string label = 4;</code>
             *
             * <pre>
             * User-provided label associated with the key.
             * </pre>
             */
            public boolean hasLabel() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional string label = 4;</code>
             *
             * <pre>
             * User-provided label associated with the key.
             * </pre>
             */
            public java.lang.String getLabel() {
                java.lang.Object ref = label_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    label_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string label = 4;</code>
             *
             * <pre>
             * User-provided label associated with the key.
             * </pre>
             */
            public com.google.protobuf.ByteString
            getLabelBytes() {
                java.lang.Object ref = label_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    label_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string label = 4;</code>
             *
             * <pre>
             * User-provided label associated with the key.
             * </pre>
             */
            public Builder setLabel(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                label_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string label = 4;</code>
             *
             * <pre>
             * User-provided label associated with the key.
             * </pre>
             */
            public Builder clearLabel() {
                bitField0_ = (bitField0_ & ~0x00000010);
                label_ = getDefaultInstance().getLabel();
                onChanged();
                return this;
            }
            /**
             * <code>optional string label = 4;</code>
             *
             * <pre>
             * User-provided label associated with the key.
             * </pre>
             */
            public Builder setLabelBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                label_ = value;
                onChanged();
                return this;
            }

            // optional int64 creation_timestamp = 5;
            private long creationTimestamp_ ;
            /**
             * <code>optional int64 creation_timestamp = 5;</code>
             *
             * <pre>
             * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point.
             * </pre>
             */
            public boolean hasCreationTimestamp() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional int64 creation_timestamp = 5;</code>
             *
             * <pre>
             * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point.
             * </pre>
             */
            public long getCreationTimestamp() {
                return creationTimestamp_;
            }
            /**
             * <code>optional int64 creation_timestamp = 5;</code>
             *
             * <pre>
             * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point.
             * </pre>
             */
            public Builder setCreationTimestamp(long value) {
                bitField0_ |= 0x00000020;
                creationTimestamp_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int64 creation_timestamp = 5;</code>
             *
             * <pre>
             * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point.
             * </pre>
             */
            public Builder clearCreationTimestamp() {
                bitField0_ = (bitField0_ & ~0x00000020);
                creationTimestamp_ = 0L;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.Key)
        }

        static {
            defaultInstance = new Key(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.Key)
    }

    public interface ScriptOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required bytes program = 1;
        /**
         * <code>required bytes program = 1;</code>
         */
        boolean hasProgram();
        /**
         * <code>required bytes program = 1;</code>
         */
        com.google.protobuf.ByteString getProgram();

        // required int64 creation_timestamp = 2;
        /**
         * <code>required int64 creation_timestamp = 2;</code>
         *
         * <pre>
         * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point
         * when watching for scripts on the blockchain.
         * </pre>
         */
        boolean hasCreationTimestamp();
        /**
         * <code>required int64 creation_timestamp = 2;</code>
         *
         * <pre>
         * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point
         * when watching for scripts on the blockchain.
         * </pre>
         */
        long getCreationTimestamp();
    }
    /**
     * Protobuf type {@code wallet.Script}
     */
    public static final class Script extends
            com.google.protobuf.GeneratedMessage
            implements ScriptOrBuilder {
        // Use Script.newBuilder() to construct.
        private Script(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Script(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final Script defaultInstance;
        public static Script getDefaultInstance() {
            return defaultInstance;
        }

        public Script getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Script(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            program_ = input.readBytes();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            creationTimestamp_ = input.readInt64();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_Script_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_Script_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.Script.class, Protos.Script.Builder.class);
        }

        public static com.google.protobuf.Parser<Script> PARSER =
                new com.google.protobuf.AbstractParser<Script>() {
                    public Script parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Script(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<Script> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required bytes program = 1;
        public static final int PROGRAM_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString program_;
        /**
         * <code>required bytes program = 1;</code>
         */
        public boolean hasProgram() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required bytes program = 1;</code>
         */
        public com.google.protobuf.ByteString getProgram() {
            return program_;
        }

        // required int64 creation_timestamp = 2;
        public static final int CREATION_TIMESTAMP_FIELD_NUMBER = 2;
        private long creationTimestamp_;
        /**
         * <code>required int64 creation_timestamp = 2;</code>
         *
         * <pre>
         * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point
         * when watching for scripts on the blockchain.
         * </pre>
         */
        public boolean hasCreationTimestamp() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required int64 creation_timestamp = 2;</code>
         *
         * <pre>
         * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point
         * when watching for scripts on the blockchain.
         * </pre>
         */
        public long getCreationTimestamp() {
            return creationTimestamp_;
        }

        private void initFields() {
            program_ = com.google.protobuf.ByteString.EMPTY;
            creationTimestamp_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasProgram()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasCreationTimestamp()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, program_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt64(2, creationTimestamp_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, program_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(2, creationTimestamp_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.Script parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Script parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Script parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Script parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Script parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Script parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.Script parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.Script parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.Script parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Script parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.Script prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.Script}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.ScriptOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_Script_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_Script_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.Script.class, Protos.Script.Builder.class);
            }

            // Construct using Protos.Script.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                program_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                creationTimestamp_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_Script_descriptor;
            }

            public Protos.Script getDefaultInstanceForType() {
                return Protos.Script.getDefaultInstance();
            }

            public Protos.Script build() {
                Protos.Script result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.Script buildPartial() {
                Protos.Script result = new Protos.Script(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.program_ = program_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.creationTimestamp_ = creationTimestamp_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.Script) {
                    return mergeFrom((Protos.Script)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.Script other) {
                if (other == Protos.Script.getDefaultInstance()) return this;
                if (other.hasProgram()) {
                    setProgram(other.getProgram());
                }
                if (other.hasCreationTimestamp()) {
                    setCreationTimestamp(other.getCreationTimestamp());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasProgram()) {

                    return false;
                }
                if (!hasCreationTimestamp()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.Script parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.Script) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required bytes program = 1;
            private com.google.protobuf.ByteString program_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes program = 1;</code>
             */
            public boolean hasProgram() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required bytes program = 1;</code>
             */
            public com.google.protobuf.ByteString getProgram() {
                return program_;
            }
            /**
             * <code>required bytes program = 1;</code>
             */
            public Builder setProgram(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                program_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes program = 1;</code>
             */
            public Builder clearProgram() {
                bitField0_ = (bitField0_ & ~0x00000001);
                program_ = getDefaultInstance().getProgram();
                onChanged();
                return this;
            }

            // required int64 creation_timestamp = 2;
            private long creationTimestamp_ ;
            /**
             * <code>required int64 creation_timestamp = 2;</code>
             *
             * <pre>
             * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point
             * when watching for scripts on the blockchain.
             * </pre>
             */
            public boolean hasCreationTimestamp() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required int64 creation_timestamp = 2;</code>
             *
             * <pre>
             * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point
             * when watching for scripts on the blockchain.
             * </pre>
             */
            public long getCreationTimestamp() {
                return creationTimestamp_;
            }
            /**
             * <code>required int64 creation_timestamp = 2;</code>
             *
             * <pre>
             * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point
             * when watching for scripts on the blockchain.
             * </pre>
             */
            public Builder setCreationTimestamp(long value) {
                bitField0_ |= 0x00000002;
                creationTimestamp_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int64 creation_timestamp = 2;</code>
             *
             * <pre>
             * Timestamp stored as millis since epoch. Useful for skipping block bodies before this point
             * when watching for scripts on the blockchain.
             * </pre>
             */
            public Builder clearCreationTimestamp() {
                bitField0_ = (bitField0_ & ~0x00000002);
                creationTimestamp_ = 0L;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.Script)
        }

        static {
            defaultInstance = new Script(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.Script)
    }

    public interface TransactionInputOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required bytes transaction_out_point_hash = 1;
        /**
         * <code>required bytes transaction_out_point_hash = 1;</code>
         *
         * <pre>
         * Hash of the transaction this input is using.
         * </pre>
         */
        boolean hasTransactionOutPointHash();
        /**
         * <code>required bytes transaction_out_point_hash = 1;</code>
         *
         * <pre>
         * Hash of the transaction this input is using.
         * </pre>
         */
        com.google.protobuf.ByteString getTransactionOutPointHash();

        // required uint32 transaction_out_point_index = 2;
        /**
         * <code>required uint32 transaction_out_point_index = 2;</code>
         *
         * <pre>
         * Index of transaction output used by this input.
         * </pre>
         */
        boolean hasTransactionOutPointIndex();
        /**
         * <code>required uint32 transaction_out_point_index = 2;</code>
         *
         * <pre>
         * Index of transaction output used by this input.
         * </pre>
         */
        int getTransactionOutPointIndex();

        // required bytes script_bytes = 3;
        /**
         * <code>required bytes script_bytes = 3;</code>
         *
         * <pre>
         * Script that contains the signatures/pubkeys.
         * </pre>
         */
        boolean hasScriptBytes();
        /**
         * <code>required bytes script_bytes = 3;</code>
         *
         * <pre>
         * Script that contains the signatures/pubkeys.
         * </pre>
         */
        com.google.protobuf.ByteString getScriptBytes();

        // optional uint32 sequence = 4;
        /**
         * <code>optional uint32 sequence = 4;</code>
         *
         * <pre>
         * Sequence number. Currently unused, but intended for contracts in future.
         * </pre>
         */
        boolean hasSequence();
        /**
         * <code>optional uint32 sequence = 4;</code>
         *
         * <pre>
         * Sequence number. Currently unused, but intended for contracts in future.
         * </pre>
         */
        int getSequence();
    }
    /**
     * Protobuf type {@code wallet.TransactionInput}
     */
    public static final class TransactionInput extends
            com.google.protobuf.GeneratedMessage
            implements TransactionInputOrBuilder {
        // Use TransactionInput.newBuilder() to construct.
        private TransactionInput(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private TransactionInput(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final TransactionInput defaultInstance;
        public static TransactionInput getDefaultInstance() {
            return defaultInstance;
        }

        public TransactionInput getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private TransactionInput(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            transactionOutPointHash_ = input.readBytes();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            transactionOutPointIndex_ = input.readUInt32();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            scriptBytes_ = input.readBytes();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            sequence_ = input.readUInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_TransactionInput_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_TransactionInput_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.TransactionInput.class, Protos.TransactionInput.Builder.class);
        }

        public static com.google.protobuf.Parser<TransactionInput> PARSER =
                new com.google.protobuf.AbstractParser<TransactionInput>() {
                    public TransactionInput parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new TransactionInput(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<TransactionInput> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required bytes transaction_out_point_hash = 1;
        public static final int TRANSACTION_OUT_POINT_HASH_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString transactionOutPointHash_;
        /**
         * <code>required bytes transaction_out_point_hash = 1;</code>
         *
         * <pre>
         * Hash of the transaction this input is using.
         * </pre>
         */
        public boolean hasTransactionOutPointHash() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required bytes transaction_out_point_hash = 1;</code>
         *
         * <pre>
         * Hash of the transaction this input is using.
         * </pre>
         */
        public com.google.protobuf.ByteString getTransactionOutPointHash() {
            return transactionOutPointHash_;
        }

        // required uint32 transaction_out_point_index = 2;
        public static final int TRANSACTION_OUT_POINT_INDEX_FIELD_NUMBER = 2;
        private int transactionOutPointIndex_;
        /**
         * <code>required uint32 transaction_out_point_index = 2;</code>
         *
         * <pre>
         * Index of transaction output used by this input.
         * </pre>
         */
        public boolean hasTransactionOutPointIndex() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required uint32 transaction_out_point_index = 2;</code>
         *
         * <pre>
         * Index of transaction output used by this input.
         * </pre>
         */
        public int getTransactionOutPointIndex() {
            return transactionOutPointIndex_;
        }

        // required bytes script_bytes = 3;
        public static final int SCRIPT_BYTES_FIELD_NUMBER = 3;
        private com.google.protobuf.ByteString scriptBytes_;
        /**
         * <code>required bytes script_bytes = 3;</code>
         *
         * <pre>
         * Script that contains the signatures/pubkeys.
         * </pre>
         */
        public boolean hasScriptBytes() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required bytes script_bytes = 3;</code>
         *
         * <pre>
         * Script that contains the signatures/pubkeys.
         * </pre>
         */
        public com.google.protobuf.ByteString getScriptBytes() {
            return scriptBytes_;
        }

        // optional uint32 sequence = 4;
        public static final int SEQUENCE_FIELD_NUMBER = 4;
        private int sequence_;
        /**
         * <code>optional uint32 sequence = 4;</code>
         *
         * <pre>
         * Sequence number. Currently unused, but intended for contracts in future.
         * </pre>
         */
        public boolean hasSequence() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional uint32 sequence = 4;</code>
         *
         * <pre>
         * Sequence number. Currently unused, but intended for contracts in future.
         * </pre>
         */
        public int getSequence() {
            return sequence_;
        }

        private void initFields() {
            transactionOutPointHash_ = com.google.protobuf.ByteString.EMPTY;
            transactionOutPointIndex_ = 0;
            scriptBytes_ = com.google.protobuf.ByteString.EMPTY;
            sequence_ = 0;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasTransactionOutPointHash()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasTransactionOutPointIndex()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasScriptBytes()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, transactionOutPointHash_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt32(2, transactionOutPointIndex_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, scriptBytes_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeUInt32(4, sequence_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, transactionOutPointHash_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, transactionOutPointIndex_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, scriptBytes_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, sequence_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.TransactionInput parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.TransactionInput parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.TransactionInput parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.TransactionInput parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.TransactionInput parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.TransactionInput parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.TransactionInput parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.TransactionInput parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.TransactionInput parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.TransactionInput parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.TransactionInput prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.TransactionInput}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.TransactionInputOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_TransactionInput_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_TransactionInput_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.TransactionInput.class, Protos.TransactionInput.Builder.class);
            }

            // Construct using Protos.TransactionInput.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                transactionOutPointHash_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                transactionOutPointIndex_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                scriptBytes_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000004);
                sequence_ = 0;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_TransactionInput_descriptor;
            }

            public Protos.TransactionInput getDefaultInstanceForType() {
                return Protos.TransactionInput.getDefaultInstance();
            }

            public Protos.TransactionInput build() {
                Protos.TransactionInput result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.TransactionInput buildPartial() {
                Protos.TransactionInput result = new Protos.TransactionInput(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.transactionOutPointHash_ = transactionOutPointHash_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.transactionOutPointIndex_ = transactionOutPointIndex_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.scriptBytes_ = scriptBytes_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.sequence_ = sequence_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.TransactionInput) {
                    return mergeFrom((Protos.TransactionInput)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.TransactionInput other) {
                if (other == Protos.TransactionInput.getDefaultInstance()) return this;
                if (other.hasTransactionOutPointHash()) {
                    setTransactionOutPointHash(other.getTransactionOutPointHash());
                }
                if (other.hasTransactionOutPointIndex()) {
                    setTransactionOutPointIndex(other.getTransactionOutPointIndex());
                }
                if (other.hasScriptBytes()) {
                    setScriptBytes(other.getScriptBytes());
                }
                if (other.hasSequence()) {
                    setSequence(other.getSequence());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasTransactionOutPointHash()) {

                    return false;
                }
                if (!hasTransactionOutPointIndex()) {

                    return false;
                }
                if (!hasScriptBytes()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.TransactionInput parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.TransactionInput) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required bytes transaction_out_point_hash = 1;
            private com.google.protobuf.ByteString transactionOutPointHash_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes transaction_out_point_hash = 1;</code>
             *
             * <pre>
             * Hash of the transaction this input is using.
             * </pre>
             */
            public boolean hasTransactionOutPointHash() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required bytes transaction_out_point_hash = 1;</code>
             *
             * <pre>
             * Hash of the transaction this input is using.
             * </pre>
             */
            public com.google.protobuf.ByteString getTransactionOutPointHash() {
                return transactionOutPointHash_;
            }
            /**
             * <code>required bytes transaction_out_point_hash = 1;</code>
             *
             * <pre>
             * Hash of the transaction this input is using.
             * </pre>
             */
            public Builder setTransactionOutPointHash(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                transactionOutPointHash_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes transaction_out_point_hash = 1;</code>
             *
             * <pre>
             * Hash of the transaction this input is using.
             * </pre>
             */
            public Builder clearTransactionOutPointHash() {
                bitField0_ = (bitField0_ & ~0x00000001);
                transactionOutPointHash_ = getDefaultInstance().getTransactionOutPointHash();
                onChanged();
                return this;
            }

            // required uint32 transaction_out_point_index = 2;
            private int transactionOutPointIndex_ ;
            /**
             * <code>required uint32 transaction_out_point_index = 2;</code>
             *
             * <pre>
             * Index of transaction output used by this input.
             * </pre>
             */
            public boolean hasTransactionOutPointIndex() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required uint32 transaction_out_point_index = 2;</code>
             *
             * <pre>
             * Index of transaction output used by this input.
             * </pre>
             */
            public int getTransactionOutPointIndex() {
                return transactionOutPointIndex_;
            }
            /**
             * <code>required uint32 transaction_out_point_index = 2;</code>
             *
             * <pre>
             * Index of transaction output used by this input.
             * </pre>
             */
            public Builder setTransactionOutPointIndex(int value) {
                bitField0_ |= 0x00000002;
                transactionOutPointIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required uint32 transaction_out_point_index = 2;</code>
             *
             * <pre>
             * Index of transaction output used by this input.
             * </pre>
             */
            public Builder clearTransactionOutPointIndex() {
                bitField0_ = (bitField0_ & ~0x00000002);
                transactionOutPointIndex_ = 0;
                onChanged();
                return this;
            }

            // required bytes script_bytes = 3;
            private com.google.protobuf.ByteString scriptBytes_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes script_bytes = 3;</code>
             *
             * <pre>
             * Script that contains the signatures/pubkeys.
             * </pre>
             */
            public boolean hasScriptBytes() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required bytes script_bytes = 3;</code>
             *
             * <pre>
             * Script that contains the signatures/pubkeys.
             * </pre>
             */
            public com.google.protobuf.ByteString getScriptBytes() {
                return scriptBytes_;
            }
            /**
             * <code>required bytes script_bytes = 3;</code>
             *
             * <pre>
             * Script that contains the signatures/pubkeys.
             * </pre>
             */
            public Builder setScriptBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                scriptBytes_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes script_bytes = 3;</code>
             *
             * <pre>
             * Script that contains the signatures/pubkeys.
             * </pre>
             */
            public Builder clearScriptBytes() {
                bitField0_ = (bitField0_ & ~0x00000004);
                scriptBytes_ = getDefaultInstance().getScriptBytes();
                onChanged();
                return this;
            }

            // optional uint32 sequence = 4;
            private int sequence_ ;
            /**
             * <code>optional uint32 sequence = 4;</code>
             *
             * <pre>
             * Sequence number. Currently unused, but intended for contracts in future.
             * </pre>
             */
            public boolean hasSequence() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional uint32 sequence = 4;</code>
             *
             * <pre>
             * Sequence number. Currently unused, but intended for contracts in future.
             * </pre>
             */
            public int getSequence() {
                return sequence_;
            }
            /**
             * <code>optional uint32 sequence = 4;</code>
             *
             * <pre>
             * Sequence number. Currently unused, but intended for contracts in future.
             * </pre>
             */
            public Builder setSequence(int value) {
                bitField0_ |= 0x00000008;
                sequence_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 sequence = 4;</code>
             *
             * <pre>
             * Sequence number. Currently unused, but intended for contracts in future.
             * </pre>
             */
            public Builder clearSequence() {
                bitField0_ = (bitField0_ & ~0x00000008);
                sequence_ = 0;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.TransactionInput)
        }

        static {
            defaultInstance = new TransactionInput(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.TransactionInput)
    }

    public interface TransactionOutputOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required int64 value = 1;
        /**
         * <code>required int64 value = 1;</code>
         */
        boolean hasValue();
        /**
         * <code>required int64 value = 1;</code>
         */
        long getValue();

        // required bytes script_bytes = 2;
        /**
         * <code>required bytes script_bytes = 2;</code>
         *
         * <pre>
         * script of transaction output
         * </pre>
         */
        boolean hasScriptBytes();
        /**
         * <code>required bytes script_bytes = 2;</code>
         *
         * <pre>
         * script of transaction output
         * </pre>
         */
        com.google.protobuf.ByteString getScriptBytes();

        // optional bytes spent_by_transaction_hash = 3;
        /**
         * <code>optional bytes spent_by_transaction_hash = 3;</code>
         *
         * <pre>
         * If spent, the hash of the transaction doing the spend.
         * </pre>
         */
        boolean hasSpentByTransactionHash();
        /**
         * <code>optional bytes spent_by_transaction_hash = 3;</code>
         *
         * <pre>
         * If spent, the hash of the transaction doing the spend.
         * </pre>
         */
        com.google.protobuf.ByteString getSpentByTransactionHash();

        // optional int32 spent_by_transaction_index = 4;
        /**
         * <code>optional int32 spent_by_transaction_index = 4;</code>
         *
         * <pre>
         * If spent, the index of the transaction input of the transaction doing the spend.
         * </pre>
         */
        boolean hasSpentByTransactionIndex();
        /**
         * <code>optional int32 spent_by_transaction_index = 4;</code>
         *
         * <pre>
         * If spent, the index of the transaction input of the transaction doing the spend.
         * </pre>
         */
        int getSpentByTransactionIndex();
    }
    /**
     * Protobuf type {@code wallet.TransactionOutput}
     */
    public static final class TransactionOutput extends
            com.google.protobuf.GeneratedMessage
            implements TransactionOutputOrBuilder {
        // Use TransactionOutput.newBuilder() to construct.
        private TransactionOutput(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private TransactionOutput(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final TransactionOutput defaultInstance;
        public static TransactionOutput getDefaultInstance() {
            return defaultInstance;
        }

        public TransactionOutput getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private TransactionOutput(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            value_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            scriptBytes_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            spentByTransactionHash_ = input.readBytes();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            spentByTransactionIndex_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_TransactionOutput_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_TransactionOutput_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.TransactionOutput.class, Protos.TransactionOutput.Builder.class);
        }

        public static com.google.protobuf.Parser<TransactionOutput> PARSER =
                new com.google.protobuf.AbstractParser<TransactionOutput>() {
                    public TransactionOutput parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new TransactionOutput(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<TransactionOutput> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required int64 value = 1;
        public static final int VALUE_FIELD_NUMBER = 1;
        private long value_;
        /**
         * <code>required int64 value = 1;</code>
         */
        public boolean hasValue() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required int64 value = 1;</code>
         */
        public long getValue() {
            return value_;
        }

        // required bytes script_bytes = 2;
        public static final int SCRIPT_BYTES_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString scriptBytes_;
        /**
         * <code>required bytes script_bytes = 2;</code>
         *
         * <pre>
         * script of transaction output
         * </pre>
         */
        public boolean hasScriptBytes() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required bytes script_bytes = 2;</code>
         *
         * <pre>
         * script of transaction output
         * </pre>
         */
        public com.google.protobuf.ByteString getScriptBytes() {
            return scriptBytes_;
        }

        // optional bytes spent_by_transaction_hash = 3;
        public static final int SPENT_BY_TRANSACTION_HASH_FIELD_NUMBER = 3;
        private com.google.protobuf.ByteString spentByTransactionHash_;
        /**
         * <code>optional bytes spent_by_transaction_hash = 3;</code>
         *
         * <pre>
         * If spent, the hash of the transaction doing the spend.
         * </pre>
         */
        public boolean hasSpentByTransactionHash() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional bytes spent_by_transaction_hash = 3;</code>
         *
         * <pre>
         * If spent, the hash of the transaction doing the spend.
         * </pre>
         */
        public com.google.protobuf.ByteString getSpentByTransactionHash() {
            return spentByTransactionHash_;
        }

        // optional int32 spent_by_transaction_index = 4;
        public static final int SPENT_BY_TRANSACTION_INDEX_FIELD_NUMBER = 4;
        private int spentByTransactionIndex_;
        /**
         * <code>optional int32 spent_by_transaction_index = 4;</code>
         *
         * <pre>
         * If spent, the index of the transaction input of the transaction doing the spend.
         * </pre>
         */
        public boolean hasSpentByTransactionIndex() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional int32 spent_by_transaction_index = 4;</code>
         *
         * <pre>
         * If spent, the index of the transaction input of the transaction doing the spend.
         * </pre>
         */
        public int getSpentByTransactionIndex() {
            return spentByTransactionIndex_;
        }

        private void initFields() {
            value_ = 0L;
            scriptBytes_ = com.google.protobuf.ByteString.EMPTY;
            spentByTransactionHash_ = com.google.protobuf.ByteString.EMPTY;
            spentByTransactionIndex_ = 0;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasValue()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasScriptBytes()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt64(1, value_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, scriptBytes_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, spentByTransactionHash_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeInt32(4, spentByTransactionIndex_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, value_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, scriptBytes_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, spentByTransactionHash_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, spentByTransactionIndex_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.TransactionOutput parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.TransactionOutput parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.TransactionOutput parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.TransactionOutput parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.TransactionOutput parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.TransactionOutput parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.TransactionOutput parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.TransactionOutput parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.TransactionOutput parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.TransactionOutput parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.TransactionOutput prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.TransactionOutput}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.TransactionOutputOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_TransactionOutput_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_TransactionOutput_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.TransactionOutput.class, Protos.TransactionOutput.Builder.class);
            }

            // Construct using Protos.TransactionOutput.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                value_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                scriptBytes_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                spentByTransactionHash_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000004);
                spentByTransactionIndex_ = 0;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_TransactionOutput_descriptor;
            }

            public Protos.TransactionOutput getDefaultInstanceForType() {
                return Protos.TransactionOutput.getDefaultInstance();
            }

            public Protos.TransactionOutput build() {
                Protos.TransactionOutput result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.TransactionOutput buildPartial() {
                Protos.TransactionOutput result = new Protos.TransactionOutput(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.value_ = value_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.scriptBytes_ = scriptBytes_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.spentByTransactionHash_ = spentByTransactionHash_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.spentByTransactionIndex_ = spentByTransactionIndex_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.TransactionOutput) {
                    return mergeFrom((Protos.TransactionOutput)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.TransactionOutput other) {
                if (other == Protos.TransactionOutput.getDefaultInstance()) return this;
                if (other.hasValue()) {
                    setValue(other.getValue());
                }
                if (other.hasScriptBytes()) {
                    setScriptBytes(other.getScriptBytes());
                }
                if (other.hasSpentByTransactionHash()) {
                    setSpentByTransactionHash(other.getSpentByTransactionHash());
                }
                if (other.hasSpentByTransactionIndex()) {
                    setSpentByTransactionIndex(other.getSpentByTransactionIndex());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasValue()) {

                    return false;
                }
                if (!hasScriptBytes()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.TransactionOutput parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.TransactionOutput) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required int64 value = 1;
            private long value_ ;
            /**
             * <code>required int64 value = 1;</code>
             */
            public boolean hasValue() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required int64 value = 1;</code>
             */
            public long getValue() {
                return value_;
            }
            /**
             * <code>required int64 value = 1;</code>
             */
            public Builder setValue(long value) {
                bitField0_ |= 0x00000001;
                value_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int64 value = 1;</code>
             */
            public Builder clearValue() {
                bitField0_ = (bitField0_ & ~0x00000001);
                value_ = 0L;
                onChanged();
                return this;
            }

            // required bytes script_bytes = 2;
            private com.google.protobuf.ByteString scriptBytes_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes script_bytes = 2;</code>
             *
             * <pre>
             * script of transaction output
             * </pre>
             */
            public boolean hasScriptBytes() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required bytes script_bytes = 2;</code>
             *
             * <pre>
             * script of transaction output
             * </pre>
             */
            public com.google.protobuf.ByteString getScriptBytes() {
                return scriptBytes_;
            }
            /**
             * <code>required bytes script_bytes = 2;</code>
             *
             * <pre>
             * script of transaction output
             * </pre>
             */
            public Builder setScriptBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                scriptBytes_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes script_bytes = 2;</code>
             *
             * <pre>
             * script of transaction output
             * </pre>
             */
            public Builder clearScriptBytes() {
                bitField0_ = (bitField0_ & ~0x00000002);
                scriptBytes_ = getDefaultInstance().getScriptBytes();
                onChanged();
                return this;
            }

            // optional bytes spent_by_transaction_hash = 3;
            private com.google.protobuf.ByteString spentByTransactionHash_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes spent_by_transaction_hash = 3;</code>
             *
             * <pre>
             * If spent, the hash of the transaction doing the spend.
             * </pre>
             */
            public boolean hasSpentByTransactionHash() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional bytes spent_by_transaction_hash = 3;</code>
             *
             * <pre>
             * If spent, the hash of the transaction doing the spend.
             * </pre>
             */
            public com.google.protobuf.ByteString getSpentByTransactionHash() {
                return spentByTransactionHash_;
            }
            /**
             * <code>optional bytes spent_by_transaction_hash = 3;</code>
             *
             * <pre>
             * If spent, the hash of the transaction doing the spend.
             * </pre>
             */
            public Builder setSpentByTransactionHash(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                spentByTransactionHash_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes spent_by_transaction_hash = 3;</code>
             *
             * <pre>
             * If spent, the hash of the transaction doing the spend.
             * </pre>
             */
            public Builder clearSpentByTransactionHash() {
                bitField0_ = (bitField0_ & ~0x00000004);
                spentByTransactionHash_ = getDefaultInstance().getSpentByTransactionHash();
                onChanged();
                return this;
            }

            // optional int32 spent_by_transaction_index = 4;
            private int spentByTransactionIndex_ ;
            /**
             * <code>optional int32 spent_by_transaction_index = 4;</code>
             *
             * <pre>
             * If spent, the index of the transaction input of the transaction doing the spend.
             * </pre>
             */
            public boolean hasSpentByTransactionIndex() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional int32 spent_by_transaction_index = 4;</code>
             *
             * <pre>
             * If spent, the index of the transaction input of the transaction doing the spend.
             * </pre>
             */
            public int getSpentByTransactionIndex() {
                return spentByTransactionIndex_;
            }
            /**
             * <code>optional int32 spent_by_transaction_index = 4;</code>
             *
             * <pre>
             * If spent, the index of the transaction input of the transaction doing the spend.
             * </pre>
             */
            public Builder setSpentByTransactionIndex(int value) {
                bitField0_ |= 0x00000008;
                spentByTransactionIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 spent_by_transaction_index = 4;</code>
             *
             * <pre>
             * If spent, the index of the transaction input of the transaction doing the spend.
             * </pre>
             */
            public Builder clearSpentByTransactionIndex() {
                bitField0_ = (bitField0_ & ~0x00000008);
                spentByTransactionIndex_ = 0;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.TransactionOutput)
        }

        static {
            defaultInstance = new TransactionOutput(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.TransactionOutput)
    }

    public interface TransactionConfidenceOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // optional .wallet.TransactionConfidence.Type type = 1;
        /**
         * <code>optional .wallet.TransactionConfidence.Type type = 1;</code>
         *
         * <pre>
         * This is optional in case we add confidence types to prevent parse errors - backwards compatible.
         * </pre>
         */
        boolean hasType();
        /**
         * <code>optional .wallet.TransactionConfidence.Type type = 1;</code>
         *
         * <pre>
         * This is optional in case we add confidence types to prevent parse errors - backwards compatible.
         * </pre>
         */
        Protos.TransactionConfidence.Type getType();

        // optional int32 appeared_at_height = 2;
        /**
         * <code>optional int32 appeared_at_height = 2;</code>
         *
         * <pre>
         * If type == BUILDING then this is the chain height at which the transaction was included.
         * </pre>
         */
        boolean hasAppearedAtHeight();
        /**
         * <code>optional int32 appeared_at_height = 2;</code>
         *
         * <pre>
         * If type == BUILDING then this is the chain height at which the transaction was included.
         * </pre>
         */
        int getAppearedAtHeight();

        // optional bytes overriding_transaction = 3;
        /**
         * <code>optional bytes overriding_transaction = 3;</code>
         *
         * <pre>
         * If set, hash of the transaction that double spent this one into oblivion. A transaction can be double spent by
         * multiple transactions in the case of several inputs being re-spent by several transactions but we don't
         * bother to track them all, just the first. This only makes sense if type = DEAD.
         * </pre>
         */
        boolean hasOverridingTransaction();
        /**
         * <code>optional bytes overriding_transaction = 3;</code>
         *
         * <pre>
         * If set, hash of the transaction that double spent this one into oblivion. A transaction can be double spent by
         * multiple transactions in the case of several inputs being re-spent by several transactions but we don't
         * bother to track them all, just the first. This only makes sense if type = DEAD.
         * </pre>
         */
        com.google.protobuf.ByteString getOverridingTransaction();

        // optional int32 depth = 4;
        /**
         * <code>optional int32 depth = 4;</code>
         *
         * <pre>
         * If type == BUILDING then this is the depth of the transaction in the blockchain.
         * Zero confirmations: depth = 0, one confirmation: depth = 1 etc.
         * </pre>
         */
        boolean hasDepth();
        /**
         * <code>optional int32 depth = 4;</code>
         *
         * <pre>
         * If type == BUILDING then this is the depth of the transaction in the blockchain.
         * Zero confirmations: depth = 0, one confirmation: depth = 1 etc.
         * </pre>
         */
        int getDepth();

        // optional int64 work_done = 5;
        /**
         * <code>optional int64 work_done = 5;</code>
         *
         * <pre>
         * If type == BUILDING then this is the cumulative workDone for the block the transaction appears in, together with
         * all blocks that bury it.
         * </pre>
         */
        boolean hasWorkDone();
        /**
         * <code>optional int64 work_done = 5;</code>
         *
         * <pre>
         * If type == BUILDING then this is the cumulative workDone for the block the transaction appears in, together with
         * all blocks that bury it.
         * </pre>
         */
        long getWorkDone();

        // repeated .wallet.PeerAddress broadcast_by = 6;
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        java.util.List<Protos.PeerAddress>
        getBroadcastByList();
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        Protos.PeerAddress getBroadcastBy(int index);
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        int getBroadcastByCount();
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        java.util.List<? extends Protos.PeerAddressOrBuilder>
        getBroadcastByOrBuilderList();
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        Protos.PeerAddressOrBuilder getBroadcastByOrBuilder(
                int index);

        // optional .wallet.TransactionConfidence.Source source = 7;
        /**
         * <code>optional .wallet.TransactionConfidence.Source source = 7;</code>
         */
        boolean hasSource();
        /**
         * <code>optional .wallet.TransactionConfidence.Source source = 7;</code>
         */
        Protos.TransactionConfidence.Source getSource();
    }
    /**
     * Protobuf type {@code wallet.TransactionConfidence}
     *
     * <pre>
     **
     * A description of the confidence we have that a transaction cannot be reversed in the future.
     *
     * Parsing should be lenient, since this could change for different applications yet we should
     * maintain backward compatibility.
     * </pre>
     */
    public static final class TransactionConfidence extends
            com.google.protobuf.GeneratedMessage
            implements TransactionConfidenceOrBuilder {
        // Use TransactionConfidence.newBuilder() to construct.
        private TransactionConfidence(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private TransactionConfidence(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final TransactionConfidence defaultInstance;
        public static TransactionConfidence getDefaultInstance() {
            return defaultInstance;
        }

        public TransactionConfidence getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private TransactionConfidence(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();
                            Protos.TransactionConfidence.Type value = Protos.TransactionConfidence.Type.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(1, rawValue);
                            } else {
                                bitField0_ |= 0x00000001;
                                type_ = value;
                            }
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            appearedAtHeight_ = input.readInt32();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            overridingTransaction_ = input.readBytes();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            depth_ = input.readInt32();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            workDone_ = input.readInt64();
                            break;
                        }
                        case 50: {
                            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                                broadcastBy_ = new java.util.ArrayList<Protos.PeerAddress>();
                                mutable_bitField0_ |= 0x00000020;
                            }
                            broadcastBy_.add(input.readMessage(Protos.PeerAddress.PARSER, extensionRegistry));
                            break;
                        }
                        case 56: {
                            int rawValue = input.readEnum();
                            Protos.TransactionConfidence.Source value = Protos.TransactionConfidence.Source.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(7, rawValue);
                            } else {
                                bitField0_ |= 0x00000020;
                                source_ = value;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                    broadcastBy_ = java.util.Collections.unmodifiableList(broadcastBy_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_TransactionConfidence_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_TransactionConfidence_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.TransactionConfidence.class, Protos.TransactionConfidence.Builder.class);
        }

        public static com.google.protobuf.Parser<TransactionConfidence> PARSER =
                new com.google.protobuf.AbstractParser<TransactionConfidence>() {
                    public TransactionConfidence parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new TransactionConfidence(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<TransactionConfidence> getParserForType() {
            return PARSER;
        }

        /**
         * Protobuf enum {@code wallet.TransactionConfidence.Type}
         */
        public enum Type
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>UNKNOWN = 0;</code>
             */
            UNKNOWN(0, 0),
            /**
             * <code>BUILDING = 1;</code>
             *
             * <pre>
             * In best chain.  If and only if appeared_at_height is present.
             * </pre>
             */
            BUILDING(1, 1),
            /**
             * <code>PENDING = 2;</code>
             *
             * <pre>
             * Unconfirmed and sitting in the networks memory pools, waiting to be included in the chain.
             * </pre>
             */
            PENDING(2, 2),
            /**
             * <code>NOT_IN_BEST_CHAIN = 3;</code>
             *
             * <pre>
             * Deprecated: equivalent to PENDING.
             * </pre>
             */
            NOT_IN_BEST_CHAIN(3, 3),
            /**
             * <code>DEAD = 4;</code>
             *
             * <pre>
             * Either if overriding_transaction is present or transaction is dead coinbase
             * </pre>
             */
            DEAD(4, 4),
            ;

            /**
             * <code>UNKNOWN = 0;</code>
             */
            public static final int UNKNOWN_VALUE = 0;
            /**
             * <code>BUILDING = 1;</code>
             *
             * <pre>
             * In best chain.  If and only if appeared_at_height is present.
             * </pre>
             */
            public static final int BUILDING_VALUE = 1;
            /**
             * <code>PENDING = 2;</code>
             *
             * <pre>
             * Unconfirmed and sitting in the networks memory pools, waiting to be included in the chain.
             * </pre>
             */
            public static final int PENDING_VALUE = 2;
            /**
             * <code>NOT_IN_BEST_CHAIN = 3;</code>
             *
             * <pre>
             * Deprecated: equivalent to PENDING.
             * </pre>
             */
            public static final int NOT_IN_BEST_CHAIN_VALUE = 3;
            /**
             * <code>DEAD = 4;</code>
             *
             * <pre>
             * Either if overriding_transaction is present or transaction is dead coinbase
             * </pre>
             */
            public static final int DEAD_VALUE = 4;


            public final int getNumber() { return value; }

            public static Type valueOf(int value) {
                switch (value) {
                    case 0: return UNKNOWN;
                    case 1: return BUILDING;
                    case 2: return PENDING;
                    case 3: return NOT_IN_BEST_CHAIN;
                    case 4: return DEAD;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Type>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<Type>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Type>() {
                        public Type findValueByNumber(int number) {
                            return Type.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Protos.TransactionConfidence.getDescriptor().getEnumTypes().get(0);
            }

            private static final Type[] VALUES = values();

            public static Type valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private Type(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:wallet.TransactionConfidence.Type)
        }

        /**
         * Protobuf enum {@code wallet.TransactionConfidence.Source}
         *
         * <pre>
         * Where did we get this transaction from? Knowing the source may help us to risk analyze pending transactions.
         * </pre>
         */
        public enum Source
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>SOURCE_UNKNOWN = 0;</code>
             *
             * <pre>
             * We don't know where it came from, or this is a wallet from the future.
             * </pre>
             */
            SOURCE_UNKNOWN(0, 0),
            /**
             * <code>SOURCE_NETWORK = 1;</code>
             *
             * <pre>
             * We received it from a network broadcast. This is the normal way to get payments.
             * </pre>
             */
            SOURCE_NETWORK(1, 1),
            /**
             * <code>SOURCE_SELF = 2;</code>
             *
             * <pre>
             * We made it ourselves, so we know it should be valid.
             * </pre>
             */
            SOURCE_SELF(2, 2),
            ;

            /**
             * <code>SOURCE_UNKNOWN = 0;</code>
             *
             * <pre>
             * We don't know where it came from, or this is a wallet from the future.
             * </pre>
             */
            public static final int SOURCE_UNKNOWN_VALUE = 0;
            /**
             * <code>SOURCE_NETWORK = 1;</code>
             *
             * <pre>
             * We received it from a network broadcast. This is the normal way to get payments.
             * </pre>
             */
            public static final int SOURCE_NETWORK_VALUE = 1;
            /**
             * <code>SOURCE_SELF = 2;</code>
             *
             * <pre>
             * We made it ourselves, so we know it should be valid.
             * </pre>
             */
            public static final int SOURCE_SELF_VALUE = 2;


            public final int getNumber() { return value; }

            public static Source valueOf(int value) {
                switch (value) {
                    case 0: return SOURCE_UNKNOWN;
                    case 1: return SOURCE_NETWORK;
                    case 2: return SOURCE_SELF;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Source>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<Source>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Source>() {
                        public Source findValueByNumber(int number) {
                            return Source.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Protos.TransactionConfidence.getDescriptor().getEnumTypes().get(1);
            }

            private static final Source[] VALUES = values();

            public static Source valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private Source(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:wallet.TransactionConfidence.Source)
        }

        private int bitField0_;
        // optional .wallet.TransactionConfidence.Type type = 1;
        public static final int TYPE_FIELD_NUMBER = 1;
        private Protos.TransactionConfidence.Type type_;
        /**
         * <code>optional .wallet.TransactionConfidence.Type type = 1;</code>
         *
         * <pre>
         * This is optional in case we add confidence types to prevent parse errors - backwards compatible.
         * </pre>
         */
        public boolean hasType() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .wallet.TransactionConfidence.Type type = 1;</code>
         *
         * <pre>
         * This is optional in case we add confidence types to prevent parse errors - backwards compatible.
         * </pre>
         */
        public Protos.TransactionConfidence.Type getType() {
            return type_;
        }

        // optional int32 appeared_at_height = 2;
        public static final int APPEARED_AT_HEIGHT_FIELD_NUMBER = 2;
        private int appearedAtHeight_;
        /**
         * <code>optional int32 appeared_at_height = 2;</code>
         *
         * <pre>
         * If type == BUILDING then this is the chain height at which the transaction was included.
         * </pre>
         */
        public boolean hasAppearedAtHeight() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional int32 appeared_at_height = 2;</code>
         *
         * <pre>
         * If type == BUILDING then this is the chain height at which the transaction was included.
         * </pre>
         */
        public int getAppearedAtHeight() {
            return appearedAtHeight_;
        }

        // optional bytes overriding_transaction = 3;
        public static final int OVERRIDING_TRANSACTION_FIELD_NUMBER = 3;
        private com.google.protobuf.ByteString overridingTransaction_;
        /**
         * <code>optional bytes overriding_transaction = 3;</code>
         *
         * <pre>
         * If set, hash of the transaction that double spent this one into oblivion. A transaction can be double spent by
         * multiple transactions in the case of several inputs being re-spent by several transactions but we don't
         * bother to track them all, just the first. This only makes sense if type = DEAD.
         * </pre>
         */
        public boolean hasOverridingTransaction() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional bytes overriding_transaction = 3;</code>
         *
         * <pre>
         * If set, hash of the transaction that double spent this one into oblivion. A transaction can be double spent by
         * multiple transactions in the case of several inputs being re-spent by several transactions but we don't
         * bother to track them all, just the first. This only makes sense if type = DEAD.
         * </pre>
         */
        public com.google.protobuf.ByteString getOverridingTransaction() {
            return overridingTransaction_;
        }

        // optional int32 depth = 4;
        public static final int DEPTH_FIELD_NUMBER = 4;
        private int depth_;
        /**
         * <code>optional int32 depth = 4;</code>
         *
         * <pre>
         * If type == BUILDING then this is the depth of the transaction in the blockchain.
         * Zero confirmations: depth = 0, one confirmation: depth = 1 etc.
         * </pre>
         */
        public boolean hasDepth() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional int32 depth = 4;</code>
         *
         * <pre>
         * If type == BUILDING then this is the depth of the transaction in the blockchain.
         * Zero confirmations: depth = 0, one confirmation: depth = 1 etc.
         * </pre>
         */
        public int getDepth() {
            return depth_;
        }

        // optional int64 work_done = 5;
        public static final int WORK_DONE_FIELD_NUMBER = 5;
        private long workDone_;
        /**
         * <code>optional int64 work_done = 5;</code>
         *
         * <pre>
         * If type == BUILDING then this is the cumulative workDone for the block the transaction appears in, together with
         * all blocks that bury it.
         * </pre>
         */
        public boolean hasWorkDone() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional int64 work_done = 5;</code>
         *
         * <pre>
         * If type == BUILDING then this is the cumulative workDone for the block the transaction appears in, together with
         * all blocks that bury it.
         * </pre>
         */
        public long getWorkDone() {
            return workDone_;
        }

        // repeated .wallet.PeerAddress broadcast_by = 6;
        public static final int BROADCAST_BY_FIELD_NUMBER = 6;
        private java.util.List<Protos.PeerAddress> broadcastBy_;
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        public java.util.List<Protos.PeerAddress> getBroadcastByList() {
            return broadcastBy_;
        }
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        public java.util.List<? extends Protos.PeerAddressOrBuilder>
        getBroadcastByOrBuilderList() {
            return broadcastBy_;
        }
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        public int getBroadcastByCount() {
            return broadcastBy_.size();
        }
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        public Protos.PeerAddress getBroadcastBy(int index) {
            return broadcastBy_.get(index);
        }
        /**
         * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
         */
        public Protos.PeerAddressOrBuilder getBroadcastByOrBuilder(
                int index) {
            return broadcastBy_.get(index);
        }

        // optional .wallet.TransactionConfidence.Source source = 7;
        public static final int SOURCE_FIELD_NUMBER = 7;
        private Protos.TransactionConfidence.Source source_;
        /**
         * <code>optional .wallet.TransactionConfidence.Source source = 7;</code>
         */
        public boolean hasSource() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional .wallet.TransactionConfidence.Source source = 7;</code>
         */
        public Protos.TransactionConfidence.Source getSource() {
            return source_;
        }

        private void initFields() {
            type_ = Protos.TransactionConfidence.Type.UNKNOWN;
            appearedAtHeight_ = 0;
            overridingTransaction_ = com.google.protobuf.ByteString.EMPTY;
            depth_ = 0;
            workDone_ = 0L;
            broadcastBy_ = java.util.Collections.emptyList();
            source_ = Protos.TransactionConfidence.Source.SOURCE_UNKNOWN;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            for (int i = 0; i < getBroadcastByCount(); i++) {
                if (!getBroadcastBy(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, type_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, appearedAtHeight_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, overridingTransaction_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeInt32(4, depth_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeInt64(5, workDone_);
            }
            for (int i = 0; i < broadcastBy_.size(); i++) {
                output.writeMessage(6, broadcastBy_.get(i));
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeEnum(7, source_.getNumber());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, type_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, appearedAtHeight_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, overridingTransaction_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, depth_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(5, workDone_);
            }
            for (int i = 0; i < broadcastBy_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, broadcastBy_.get(i));
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(7, source_.getNumber());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.TransactionConfidence parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.TransactionConfidence parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.TransactionConfidence parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.TransactionConfidence parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.TransactionConfidence parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.TransactionConfidence parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.TransactionConfidence parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.TransactionConfidence parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.TransactionConfidence parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.TransactionConfidence parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.TransactionConfidence prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.TransactionConfidence}
         *
         * <pre>
         **
         * A description of the confidence we have that a transaction cannot be reversed in the future.
         *
         * Parsing should be lenient, since this could change for different applications yet we should
         * maintain backward compatibility.
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.TransactionConfidenceOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_TransactionConfidence_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_TransactionConfidence_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.TransactionConfidence.class, Protos.TransactionConfidence.Builder.class);
            }

            // Construct using Protos.TransactionConfidence.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    getBroadcastByFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                type_ = Protos.TransactionConfidence.Type.UNKNOWN;
                bitField0_ = (bitField0_ & ~0x00000001);
                appearedAtHeight_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                overridingTransaction_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000004);
                depth_ = 0;
                bitField0_ = (bitField0_ & ~0x00000008);
                workDone_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000010);
                if (broadcastByBuilder_ == null) {
                    broadcastBy_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000020);
                } else {
                    broadcastByBuilder_.clear();
                }
                source_ = Protos.TransactionConfidence.Source.SOURCE_UNKNOWN;
                bitField0_ = (bitField0_ & ~0x00000040);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_TransactionConfidence_descriptor;
            }

            public Protos.TransactionConfidence getDefaultInstanceForType() {
                return Protos.TransactionConfidence.getDefaultInstance();
            }

            public Protos.TransactionConfidence build() {
                Protos.TransactionConfidence result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.TransactionConfidence buildPartial() {
                Protos.TransactionConfidence result = new Protos.TransactionConfidence(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.type_ = type_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.appearedAtHeight_ = appearedAtHeight_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.overridingTransaction_ = overridingTransaction_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.depth_ = depth_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.workDone_ = workDone_;
                if (broadcastByBuilder_ == null) {
                    if (((bitField0_ & 0x00000020) == 0x00000020)) {
                        broadcastBy_ = java.util.Collections.unmodifiableList(broadcastBy_);
                        bitField0_ = (bitField0_ & ~0x00000020);
                    }
                    result.broadcastBy_ = broadcastBy_;
                } else {
                    result.broadcastBy_ = broadcastByBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.source_ = source_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.TransactionConfidence) {
                    return mergeFrom((Protos.TransactionConfidence)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.TransactionConfidence other) {
                if (other == Protos.TransactionConfidence.getDefaultInstance()) return this;
                if (other.hasType()) {
                    setType(other.getType());
                }
                if (other.hasAppearedAtHeight()) {
                    setAppearedAtHeight(other.getAppearedAtHeight());
                }
                if (other.hasOverridingTransaction()) {
                    setOverridingTransaction(other.getOverridingTransaction());
                }
                if (other.hasDepth()) {
                    setDepth(other.getDepth());
                }
                if (other.hasWorkDone()) {
                    setWorkDone(other.getWorkDone());
                }
                if (broadcastByBuilder_ == null) {
                    if (!other.broadcastBy_.isEmpty()) {
                        if (broadcastBy_.isEmpty()) {
                            broadcastBy_ = other.broadcastBy_;
                            bitField0_ = (bitField0_ & ~0x00000020);
                        } else {
                            ensureBroadcastByIsMutable();
                            broadcastBy_.addAll(other.broadcastBy_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.broadcastBy_.isEmpty()) {
                        if (broadcastByBuilder_.isEmpty()) {
                            broadcastByBuilder_.dispose();
                            broadcastByBuilder_ = null;
                            broadcastBy_ = other.broadcastBy_;
                            bitField0_ = (bitField0_ & ~0x00000020);
                            broadcastByBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getBroadcastByFieldBuilder() : null;
                        } else {
                            broadcastByBuilder_.addAllMessages(other.broadcastBy_);
                        }
                    }
                }
                if (other.hasSource()) {
                    setSource(other.getSource());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getBroadcastByCount(); i++) {
                    if (!getBroadcastBy(i).isInitialized()) {

                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.TransactionConfidence parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.TransactionConfidence) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional .wallet.TransactionConfidence.Type type = 1;
            private Protos.TransactionConfidence.Type type_ = Protos.TransactionConfidence.Type.UNKNOWN;
            /**
             * <code>optional .wallet.TransactionConfidence.Type type = 1;</code>
             *
             * <pre>
             * This is optional in case we add confidence types to prevent parse errors - backwards compatible.
             * </pre>
             */
            public boolean hasType() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional .wallet.TransactionConfidence.Type type = 1;</code>
             *
             * <pre>
             * This is optional in case we add confidence types to prevent parse errors - backwards compatible.
             * </pre>
             */
            public Protos.TransactionConfidence.Type getType() {
                return type_;
            }
            /**
             * <code>optional .wallet.TransactionConfidence.Type type = 1;</code>
             *
             * <pre>
             * This is optional in case we add confidence types to prevent parse errors - backwards compatible.
             * </pre>
             */
            public Builder setType(Protos.TransactionConfidence.Type value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                type_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .wallet.TransactionConfidence.Type type = 1;</code>
             *
             * <pre>
             * This is optional in case we add confidence types to prevent parse errors - backwards compatible.
             * </pre>
             */
            public Builder clearType() {
                bitField0_ = (bitField0_ & ~0x00000001);
                type_ = Protos.TransactionConfidence.Type.UNKNOWN;
                onChanged();
                return this;
            }

            // optional int32 appeared_at_height = 2;
            private int appearedAtHeight_ ;
            /**
             * <code>optional int32 appeared_at_height = 2;</code>
             *
             * <pre>
             * If type == BUILDING then this is the chain height at which the transaction was included.
             * </pre>
             */
            public boolean hasAppearedAtHeight() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional int32 appeared_at_height = 2;</code>
             *
             * <pre>
             * If type == BUILDING then this is the chain height at which the transaction was included.
             * </pre>
             */
            public int getAppearedAtHeight() {
                return appearedAtHeight_;
            }
            /**
             * <code>optional int32 appeared_at_height = 2;</code>
             *
             * <pre>
             * If type == BUILDING then this is the chain height at which the transaction was included.
             * </pre>
             */
            public Builder setAppearedAtHeight(int value) {
                bitField0_ |= 0x00000002;
                appearedAtHeight_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 appeared_at_height = 2;</code>
             *
             * <pre>
             * If type == BUILDING then this is the chain height at which the transaction was included.
             * </pre>
             */
            public Builder clearAppearedAtHeight() {
                bitField0_ = (bitField0_ & ~0x00000002);
                appearedAtHeight_ = 0;
                onChanged();
                return this;
            }

            // optional bytes overriding_transaction = 3;
            private com.google.protobuf.ByteString overridingTransaction_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes overriding_transaction = 3;</code>
             *
             * <pre>
             * If set, hash of the transaction that double spent this one into oblivion. A transaction can be double spent by
             * multiple transactions in the case of several inputs being re-spent by several transactions but we don't
             * bother to track them all, just the first. This only makes sense if type = DEAD.
             * </pre>
             */
            public boolean hasOverridingTransaction() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional bytes overriding_transaction = 3;</code>
             *
             * <pre>
             * If set, hash of the transaction that double spent this one into oblivion. A transaction can be double spent by
             * multiple transactions in the case of several inputs being re-spent by several transactions but we don't
             * bother to track them all, just the first. This only makes sense if type = DEAD.
             * </pre>
             */
            public com.google.protobuf.ByteString getOverridingTransaction() {
                return overridingTransaction_;
            }
            /**
             * <code>optional bytes overriding_transaction = 3;</code>
             *
             * <pre>
             * If set, hash of the transaction that double spent this one into oblivion. A transaction can be double spent by
             * multiple transactions in the case of several inputs being re-spent by several transactions but we don't
             * bother to track them all, just the first. This only makes sense if type = DEAD.
             * </pre>
             */
            public Builder setOverridingTransaction(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                overridingTransaction_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes overriding_transaction = 3;</code>
             *
             * <pre>
             * If set, hash of the transaction that double spent this one into oblivion. A transaction can be double spent by
             * multiple transactions in the case of several inputs being re-spent by several transactions but we don't
             * bother to track them all, just the first. This only makes sense if type = DEAD.
             * </pre>
             */
            public Builder clearOverridingTransaction() {
                bitField0_ = (bitField0_ & ~0x00000004);
                overridingTransaction_ = getDefaultInstance().getOverridingTransaction();
                onChanged();
                return this;
            }

            // optional int32 depth = 4;
            private int depth_ ;
            /**
             * <code>optional int32 depth = 4;</code>
             *
             * <pre>
             * If type == BUILDING then this is the depth of the transaction in the blockchain.
             * Zero confirmations: depth = 0, one confirmation: depth = 1 etc.
             * </pre>
             */
            public boolean hasDepth() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional int32 depth = 4;</code>
             *
             * <pre>
             * If type == BUILDING then this is the depth of the transaction in the blockchain.
             * Zero confirmations: depth = 0, one confirmation: depth = 1 etc.
             * </pre>
             */
            public int getDepth() {
                return depth_;
            }
            /**
             * <code>optional int32 depth = 4;</code>
             *
             * <pre>
             * If type == BUILDING then this is the depth of the transaction in the blockchain.
             * Zero confirmations: depth = 0, one confirmation: depth = 1 etc.
             * </pre>
             */
            public Builder setDepth(int value) {
                bitField0_ |= 0x00000008;
                depth_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 depth = 4;</code>
             *
             * <pre>
             * If type == BUILDING then this is the depth of the transaction in the blockchain.
             * Zero confirmations: depth = 0, one confirmation: depth = 1 etc.
             * </pre>
             */
            public Builder clearDepth() {
                bitField0_ = (bitField0_ & ~0x00000008);
                depth_ = 0;
                onChanged();
                return this;
            }

            // optional int64 work_done = 5;
            private long workDone_ ;
            /**
             * <code>optional int64 work_done = 5;</code>
             *
             * <pre>
             * If type == BUILDING then this is the cumulative workDone for the block the transaction appears in, together with
             * all blocks that bury it.
             * </pre>
             */
            public boolean hasWorkDone() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional int64 work_done = 5;</code>
             *
             * <pre>
             * If type == BUILDING then this is the cumulative workDone for the block the transaction appears in, together with
             * all blocks that bury it.
             * </pre>
             */
            public long getWorkDone() {
                return workDone_;
            }
            /**
             * <code>optional int64 work_done = 5;</code>
             *
             * <pre>
             * If type == BUILDING then this is the cumulative workDone for the block the transaction appears in, together with
             * all blocks that bury it.
             * </pre>
             */
            public Builder setWorkDone(long value) {
                bitField0_ |= 0x00000010;
                workDone_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int64 work_done = 5;</code>
             *
             * <pre>
             * If type == BUILDING then this is the cumulative workDone for the block the transaction appears in, together with
             * all blocks that bury it.
             * </pre>
             */
            public Builder clearWorkDone() {
                bitField0_ = (bitField0_ & ~0x00000010);
                workDone_ = 0L;
                onChanged();
                return this;
            }

            // repeated .wallet.PeerAddress broadcast_by = 6;
            private java.util.List<Protos.PeerAddress> broadcastBy_ =
                    java.util.Collections.emptyList();
            private void ensureBroadcastByIsMutable() {
                if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                    broadcastBy_ = new java.util.ArrayList<Protos.PeerAddress>(broadcastBy_);
                    bitField0_ |= 0x00000020;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.PeerAddress, Protos.PeerAddress.Builder, Protos.PeerAddressOrBuilder> broadcastByBuilder_;

            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public java.util.List<Protos.PeerAddress> getBroadcastByList() {
                if (broadcastByBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(broadcastBy_);
                } else {
                    return broadcastByBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public int getBroadcastByCount() {
                if (broadcastByBuilder_ == null) {
                    return broadcastBy_.size();
                } else {
                    return broadcastByBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Protos.PeerAddress getBroadcastBy(int index) {
                if (broadcastByBuilder_ == null) {
                    return broadcastBy_.get(index);
                } else {
                    return broadcastByBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Builder setBroadcastBy(
                    int index, Protos.PeerAddress value) {
                if (broadcastByBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBroadcastByIsMutable();
                    broadcastBy_.set(index, value);
                    onChanged();
                } else {
                    broadcastByBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Builder setBroadcastBy(
                    int index, Protos.PeerAddress.Builder builderForValue) {
                if (broadcastByBuilder_ == null) {
                    ensureBroadcastByIsMutable();
                    broadcastBy_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    broadcastByBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Builder addBroadcastBy(Protos.PeerAddress value) {
                if (broadcastByBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBroadcastByIsMutable();
                    broadcastBy_.add(value);
                    onChanged();
                } else {
                    broadcastByBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Builder addBroadcastBy(
                    int index, Protos.PeerAddress value) {
                if (broadcastByBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBroadcastByIsMutable();
                    broadcastBy_.add(index, value);
                    onChanged();
                } else {
                    broadcastByBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Builder addBroadcastBy(
                    Protos.PeerAddress.Builder builderForValue) {
                if (broadcastByBuilder_ == null) {
                    ensureBroadcastByIsMutable();
                    broadcastBy_.add(builderForValue.build());
                    onChanged();
                } else {
                    broadcastByBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Builder addBroadcastBy(
                    int index, Protos.PeerAddress.Builder builderForValue) {
                if (broadcastByBuilder_ == null) {
                    ensureBroadcastByIsMutable();
                    broadcastBy_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    broadcastByBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Builder addAllBroadcastBy(
                    java.lang.Iterable<? extends Protos.PeerAddress> values) {
                if (broadcastByBuilder_ == null) {
                    ensureBroadcastByIsMutable();
                    super.addAll(values, broadcastBy_);
                    onChanged();
                } else {
                    broadcastByBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Builder clearBroadcastBy() {
                if (broadcastByBuilder_ == null) {
                    broadcastBy_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000020);
                    onChanged();
                } else {
                    broadcastByBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Builder removeBroadcastBy(int index) {
                if (broadcastByBuilder_ == null) {
                    ensureBroadcastByIsMutable();
                    broadcastBy_.remove(index);
                    onChanged();
                } else {
                    broadcastByBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Protos.PeerAddress.Builder getBroadcastByBuilder(
                    int index) {
                return getBroadcastByFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Protos.PeerAddressOrBuilder getBroadcastByOrBuilder(
                    int index) {
                if (broadcastByBuilder_ == null) {
                    return broadcastBy_.get(index);  } else {
                    return broadcastByBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public java.util.List<? extends Protos.PeerAddressOrBuilder>
            getBroadcastByOrBuilderList() {
                if (broadcastByBuilder_ != null) {
                    return broadcastByBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(broadcastBy_);
                }
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Protos.PeerAddress.Builder addBroadcastByBuilder() {
                return getBroadcastByFieldBuilder().addBuilder(
                        Protos.PeerAddress.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public Protos.PeerAddress.Builder addBroadcastByBuilder(
                    int index) {
                return getBroadcastByFieldBuilder().addBuilder(
                        index, Protos.PeerAddress.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.PeerAddress broadcast_by = 6;</code>
             */
            public java.util.List<Protos.PeerAddress.Builder>
            getBroadcastByBuilderList() {
                return getBroadcastByFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.PeerAddress, Protos.PeerAddress.Builder, Protos.PeerAddressOrBuilder>
            getBroadcastByFieldBuilder() {
                if (broadcastByBuilder_ == null) {
                    broadcastByBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            Protos.PeerAddress, Protos.PeerAddress.Builder, Protos.PeerAddressOrBuilder>(
                            broadcastBy_,
                            ((bitField0_ & 0x00000020) == 0x00000020),
                            getParentForChildren(),
                            isClean());
                    broadcastBy_ = null;
                }
                return broadcastByBuilder_;
            }

            // optional .wallet.TransactionConfidence.Source source = 7;
            private Protos.TransactionConfidence.Source source_ = Protos.TransactionConfidence.Source.SOURCE_UNKNOWN;
            /**
             * <code>optional .wallet.TransactionConfidence.Source source = 7;</code>
             */
            public boolean hasSource() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional .wallet.TransactionConfidence.Source source = 7;</code>
             */
            public Protos.TransactionConfidence.Source getSource() {
                return source_;
            }
            /**
             * <code>optional .wallet.TransactionConfidence.Source source = 7;</code>
             */
            public Builder setSource(Protos.TransactionConfidence.Source value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000040;
                source_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .wallet.TransactionConfidence.Source source = 7;</code>
             */
            public Builder clearSource() {
                bitField0_ = (bitField0_ & ~0x00000040);
                source_ = Protos.TransactionConfidence.Source.SOURCE_UNKNOWN;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.TransactionConfidence)
        }

        static {
            defaultInstance = new TransactionConfidence(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.TransactionConfidence)
    }

    public interface TransactionOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required int32 version = 1;
        /**
         * <code>required int32 version = 1;</code>
         *
         * <pre>
         * See Wallet.java for detailed description of pool semantics
         * </pre>
         */
        boolean hasVersion();
        /**
         * <code>required int32 version = 1;</code>
         *
         * <pre>
         * See Wallet.java for detailed description of pool semantics
         * </pre>
         */
        int getVersion();

        // required int64 time = 12;
        /**
         * <code>required int64 time = 12;</code>
         */
        boolean hasTime();
        /**
         * <code>required int64 time = 12;</code>
         */
        long getTime();

        // required bytes hash = 2;
        /**
         * <code>required bytes hash = 2;</code>
         */
        boolean hasHash();
        /**
         * <code>required bytes hash = 2;</code>
         */
        com.google.protobuf.ByteString getHash();

        // optional .wallet.Transaction.Pool pool = 3;
        /**
         * <code>optional .wallet.Transaction.Pool pool = 3;</code>
         *
         * <pre>
         * If pool is not present, that means either:
         *  - This Transaction is either not in a wallet at all (the proto is re-used elsewhere)
         *  - Or it is stored but for other purposes, for example, because it is the overriding transaction of a double spend.
         *  - Or the Pool enum got a new value which your software is too old to parse.
         * </pre>
         */
        boolean hasPool();
        /**
         * <code>optional .wallet.Transaction.Pool pool = 3;</code>
         *
         * <pre>
         * If pool is not present, that means either:
         *  - This Transaction is either not in a wallet at all (the proto is re-used elsewhere)
         *  - Or it is stored but for other purposes, for example, because it is the overriding transaction of a double spend.
         *  - Or the Pool enum got a new value which your software is too old to parse.
         * </pre>
         */
        Protos.Transaction.Pool getPool();

        // optional uint32 lock_time = 4;
        /**
         * <code>optional uint32 lock_time = 4;</code>
         *
         * <pre>
         * The nLockTime field is useful for contracts.
         * </pre>
         */
        boolean hasLockTime();
        /**
         * <code>optional uint32 lock_time = 4;</code>
         *
         * <pre>
         * The nLockTime field is useful for contracts.
         * </pre>
         */
        int getLockTime();

        // optional int64 updated_at = 5;
        /**
         * <code>optional int64 updated_at = 5;</code>
         *
         * <pre>
         * millis since epoch the transaction was last updated
         * </pre>
         */
        boolean hasUpdatedAt();
        /**
         * <code>optional int64 updated_at = 5;</code>
         *
         * <pre>
         * millis since epoch the transaction was last updated
         * </pre>
         */
        long getUpdatedAt();

        // repeated .wallet.TransactionInput transaction_input = 6;
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        java.util.List<Protos.TransactionInput>
        getTransactionInputList();
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        Protos.TransactionInput getTransactionInput(int index);
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        int getTransactionInputCount();
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        java.util.List<? extends Protos.TransactionInputOrBuilder>
        getTransactionInputOrBuilderList();
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        Protos.TransactionInputOrBuilder getTransactionInputOrBuilder(
                int index);

        // repeated .wallet.TransactionOutput transaction_output = 7;
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        java.util.List<Protos.TransactionOutput>
        getTransactionOutputList();
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        Protos.TransactionOutput getTransactionOutput(int index);
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        int getTransactionOutputCount();
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        java.util.List<? extends Protos.TransactionOutputOrBuilder>
        getTransactionOutputOrBuilderList();
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        Protos.TransactionOutputOrBuilder getTransactionOutputOrBuilder(
                int index);

        // repeated bytes block_hash = 8;
        /**
         * <code>repeated bytes block_hash = 8;</code>
         *
         * <pre>
         * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
         * ordering within a block.
         * </pre>
         */
        java.util.List<com.google.protobuf.ByteString> getBlockHashList();
        /**
         * <code>repeated bytes block_hash = 8;</code>
         *
         * <pre>
         * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
         * ordering within a block.
         * </pre>
         */
        int getBlockHashCount();
        /**
         * <code>repeated bytes block_hash = 8;</code>
         *
         * <pre>
         * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
         * ordering within a block.
         * </pre>
         */
        com.google.protobuf.ByteString getBlockHash(int index);

        // repeated int32 block_relativity_offsets = 11;
        /**
         * <code>repeated int32 block_relativity_offsets = 11;</code>
         */
        java.util.List<java.lang.Integer> getBlockRelativityOffsetsList();
        /**
         * <code>repeated int32 block_relativity_offsets = 11;</code>
         */
        int getBlockRelativityOffsetsCount();
        /**
         * <code>repeated int32 block_relativity_offsets = 11;</code>
         */
        int getBlockRelativityOffsets(int index);

        // optional .wallet.TransactionConfidence confidence = 9;
        /**
         * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
         *
         * <pre>
         * Data describing where the transaction is in the chain.
         * </pre>
         */
        boolean hasConfidence();
        /**
         * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
         *
         * <pre>
         * Data describing where the transaction is in the chain.
         * </pre>
         */
        Protos.TransactionConfidence getConfidence();
        /**
         * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
         *
         * <pre>
         * Data describing where the transaction is in the chain.
         * </pre>
         */
        Protos.TransactionConfidenceOrBuilder getConfidenceOrBuilder();

        // optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];
        /**
         * <code>optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];</code>
         */
        boolean hasPurpose();
        /**
         * <code>optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];</code>
         */
        Protos.Transaction.Purpose getPurpose();
    }
    /**
     * Protobuf type {@code wallet.Transaction}
     */
    public static final class Transaction extends
            com.google.protobuf.GeneratedMessage
            implements TransactionOrBuilder {
        // Use Transaction.newBuilder() to construct.
        private Transaction(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Transaction(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final Transaction defaultInstance;
        public static Transaction getDefaultInstance() {
            return defaultInstance;
        }

        public Transaction getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Transaction(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            version_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000004;
                            hash_ = input.readBytes();
                            break;
                        }
                        case 24: {
                            int rawValue = input.readEnum();
                            Protos.Transaction.Pool value = Protos.Transaction.Pool.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(3, rawValue);
                            } else {
                                bitField0_ |= 0x00000008;
                                pool_ = value;
                            }
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000010;
                            lockTime_ = input.readUInt32();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000020;
                            updatedAt_ = input.readInt64();
                            break;
                        }
                        case 50: {
                            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                                transactionInput_ = new java.util.ArrayList<Protos.TransactionInput>();
                                mutable_bitField0_ |= 0x00000040;
                            }
                            transactionInput_.add(input.readMessage(Protos.TransactionInput.PARSER, extensionRegistry));
                            break;
                        }
                        case 58: {
                            if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                                transactionOutput_ = new java.util.ArrayList<Protos.TransactionOutput>();
                                mutable_bitField0_ |= 0x00000080;
                            }
                            transactionOutput_.add(input.readMessage(Protos.TransactionOutput.PARSER, extensionRegistry));
                            break;
                        }
                        case 66: {
                            if (!((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
                                blockHash_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                                mutable_bitField0_ |= 0x00000100;
                            }
                            blockHash_.add(input.readBytes());
                            break;
                        }
                        case 74: {
                            Protos.TransactionConfidence.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                                subBuilder = confidence_.toBuilder();
                            }
                            confidence_ = input.readMessage(Protos.TransactionConfidence.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(confidence_);
                                confidence_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000040;
                            break;
                        }
                        case 80: {
                            int rawValue = input.readEnum();
                            Protos.Transaction.Purpose value = Protos.Transaction.Purpose.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(10, rawValue);
                            } else {
                                bitField0_ |= 0x00000080;
                                purpose_ = value;
                            }
                            break;
                        }
                        case 88: {
                            if (!((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
                                blockRelativityOffsets_ = new java.util.ArrayList<java.lang.Integer>();
                                mutable_bitField0_ |= 0x00000200;
                            }
                            blockRelativityOffsets_.add(input.readInt32());
                            break;
                        }
                        case 90: {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            if (!((mutable_bitField0_ & 0x00000200) == 0x00000200) && input.getBytesUntilLimit() > 0) {
                                blockRelativityOffsets_ = new java.util.ArrayList<java.lang.Integer>();
                                mutable_bitField0_ |= 0x00000200;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                blockRelativityOffsets_.add(input.readInt32());
                            }
                            input.popLimit(limit);
                            break;
                        }
                        case 96: {
                            bitField0_ |= 0x00000002;
                            time_ = input.readInt64();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                    transactionInput_ = java.util.Collections.unmodifiableList(transactionInput_);
                }
                if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                    transactionOutput_ = java.util.Collections.unmodifiableList(transactionOutput_);
                }
                if (((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
                    blockHash_ = java.util.Collections.unmodifiableList(blockHash_);
                }
                if (((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
                    blockRelativityOffsets_ = java.util.Collections.unmodifiableList(blockRelativityOffsets_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_Transaction_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_Transaction_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.Transaction.class, Protos.Transaction.Builder.class);
        }

        public static com.google.protobuf.Parser<Transaction> PARSER =
                new com.google.protobuf.AbstractParser<Transaction>() {
                    public Transaction parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Transaction(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<Transaction> getParserForType() {
            return PARSER;
        }

        /**
         * Protobuf enum {@code wallet.Transaction.Pool}
         *
         * <pre>
         **
         * This is a bitfield oriented enum, with the following bits:
         *
         * bit 0 - spent
         * bit 1 - appears in alt chain
         * bit 2 - appears in best chain
         * bit 3 - double-spent
         * bit 4 - pending (we would like the tx to go into the best chain)
         *
         * Not all combinations are interesting, just the ones actually used in the enum.
         * </pre>
         */
        public enum Pool
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>UNSPENT = 4;</code>
             *
             * <pre>
             * In best chain, not all outputs spent
             * </pre>
             */
            UNSPENT(0, 4),
            /**
             * <code>SPENT = 5;</code>
             *
             * <pre>
             * In best chain, all outputs spent
             * </pre>
             */
            SPENT(1, 5),
            /**
             * <code>INACTIVE = 2;</code>
             *
             * <pre>
             * In non-best chain, not our transaction
             * </pre>
             */
            INACTIVE(2, 2),
            /**
             * <code>DEAD = 10;</code>
             *
             * <pre>
             * Double-spent by a transaction in the best chain
             * </pre>
             */
            DEAD(3, 10),
            /**
             * <code>PENDING = 16;</code>
             *
             * <pre>
             * Our transaction, not in any chain
             * </pre>
             */
            PENDING(4, 16),
            /**
             * <code>PENDING_INACTIVE = 18;</code>
             *
             * <pre>
             * In non-best chain, our transaction
             * </pre>
             */
            PENDING_INACTIVE(5, 18),
            ;

            /**
             * <code>UNSPENT = 4;</code>
             *
             * <pre>
             * In best chain, not all outputs spent
             * </pre>
             */
            public static final int UNSPENT_VALUE = 4;
            /**
             * <code>SPENT = 5;</code>
             *
             * <pre>
             * In best chain, all outputs spent
             * </pre>
             */
            public static final int SPENT_VALUE = 5;
            /**
             * <code>INACTIVE = 2;</code>
             *
             * <pre>
             * In non-best chain, not our transaction
             * </pre>
             */
            public static final int INACTIVE_VALUE = 2;
            /**
             * <code>DEAD = 10;</code>
             *
             * <pre>
             * Double-spent by a transaction in the best chain
             * </pre>
             */
            public static final int DEAD_VALUE = 10;
            /**
             * <code>PENDING = 16;</code>
             *
             * <pre>
             * Our transaction, not in any chain
             * </pre>
             */
            public static final int PENDING_VALUE = 16;
            /**
             * <code>PENDING_INACTIVE = 18;</code>
             *
             * <pre>
             * In non-best chain, our transaction
             * </pre>
             */
            public static final int PENDING_INACTIVE_VALUE = 18;


            public final int getNumber() { return value; }

            public static Pool valueOf(int value) {
                switch (value) {
                    case 4: return UNSPENT;
                    case 5: return SPENT;
                    case 2: return INACTIVE;
                    case 10: return DEAD;
                    case 16: return PENDING;
                    case 18: return PENDING_INACTIVE;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Pool>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<Pool>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Pool>() {
                        public Pool findValueByNumber(int number) {
                            return Pool.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Protos.Transaction.getDescriptor().getEnumTypes().get(0);
            }

            private static final Pool[] VALUES = values();

            public static Pool valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private Pool(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:wallet.Transaction.Pool)
        }

        /**
         * Protobuf enum {@code wallet.Transaction.Purpose}
         *
         * <pre>
         * For what purpose the transaction was created.
         * </pre>
         */
        public enum Purpose
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>UNKNOWN = 0;</code>
             *
             * <pre>
             * Old wallets or the purpose genuinely is a mystery (e.g. imported from some external source).
             * </pre>
             */
            UNKNOWN(0, 0),
            /**
             * <code>USER_PAYMENT = 1;</code>
             *
             * <pre>
             * Created in response to a user request for payment. This is the normal case.
             * </pre>
             */
            USER_PAYMENT(1, 1),
            /**
             * <code>KEY_ROTATION = 2;</code>
             *
             * <pre>
             * Created automatically to move money from rotated keys.
             * </pre>
             */
            KEY_ROTATION(2, 2),
            ;

            /**
             * <code>UNKNOWN = 0;</code>
             *
             * <pre>
             * Old wallets or the purpose genuinely is a mystery (e.g. imported from some external source).
             * </pre>
             */
            public static final int UNKNOWN_VALUE = 0;
            /**
             * <code>USER_PAYMENT = 1;</code>
             *
             * <pre>
             * Created in response to a user request for payment. This is the normal case.
             * </pre>
             */
            public static final int USER_PAYMENT_VALUE = 1;
            /**
             * <code>KEY_ROTATION = 2;</code>
             *
             * <pre>
             * Created automatically to move money from rotated keys.
             * </pre>
             */
            public static final int KEY_ROTATION_VALUE = 2;


            public final int getNumber() { return value; }

            public static Purpose valueOf(int value) {
                switch (value) {
                    case 0: return UNKNOWN;
                    case 1: return USER_PAYMENT;
                    case 2: return KEY_ROTATION;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Purpose>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<Purpose>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Purpose>() {
                        public Purpose findValueByNumber(int number) {
                            return Purpose.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Protos.Transaction.getDescriptor().getEnumTypes().get(1);
            }

            private static final Purpose[] VALUES = values();

            public static Purpose valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private Purpose(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:wallet.Transaction.Purpose)
        }

        private int bitField0_;
        // required int32 version = 1;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int version_;
        /**
         * <code>required int32 version = 1;</code>
         *
         * <pre>
         * See Wallet.java for detailed description of pool semantics
         * </pre>
         */
        public boolean hasVersion() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required int32 version = 1;</code>
         *
         * <pre>
         * See Wallet.java for detailed description of pool semantics
         * </pre>
         */
        public int getVersion() {
            return version_;
        }

        // required int64 time = 12;
        public static final int TIME_FIELD_NUMBER = 12;
        private long time_;
        /**
         * <code>required int64 time = 12;</code>
         */
        public boolean hasTime() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required int64 time = 12;</code>
         */
        public long getTime() {
            return time_;
        }

        // required bytes hash = 2;
        public static final int HASH_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString hash_;
        /**
         * <code>required bytes hash = 2;</code>
         */
        public boolean hasHash() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required bytes hash = 2;</code>
         */
        public com.google.protobuf.ByteString getHash() {
            return hash_;
        }

        // optional .wallet.Transaction.Pool pool = 3;
        public static final int POOL_FIELD_NUMBER = 3;
        private Protos.Transaction.Pool pool_;
        /**
         * <code>optional .wallet.Transaction.Pool pool = 3;</code>
         *
         * <pre>
         * If pool is not present, that means either:
         *  - This Transaction is either not in a wallet at all (the proto is re-used elsewhere)
         *  - Or it is stored but for other purposes, for example, because it is the overriding transaction of a double spend.
         *  - Or the Pool enum got a new value which your software is too old to parse.
         * </pre>
         */
        public boolean hasPool() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional .wallet.Transaction.Pool pool = 3;</code>
         *
         * <pre>
         * If pool is not present, that means either:
         *  - This Transaction is either not in a wallet at all (the proto is re-used elsewhere)
         *  - Or it is stored but for other purposes, for example, because it is the overriding transaction of a double spend.
         *  - Or the Pool enum got a new value which your software is too old to parse.
         * </pre>
         */
        public Protos.Transaction.Pool getPool() {
            return pool_;
        }

        // optional uint32 lock_time = 4;
        public static final int LOCK_TIME_FIELD_NUMBER = 4;
        private int lockTime_;
        /**
         * <code>optional uint32 lock_time = 4;</code>
         *
         * <pre>
         * The nLockTime field is useful for contracts.
         * </pre>
         */
        public boolean hasLockTime() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional uint32 lock_time = 4;</code>
         *
         * <pre>
         * The nLockTime field is useful for contracts.
         * </pre>
         */
        public int getLockTime() {
            return lockTime_;
        }

        // optional int64 updated_at = 5;
        public static final int UPDATED_AT_FIELD_NUMBER = 5;
        private long updatedAt_;
        /**
         * <code>optional int64 updated_at = 5;</code>
         *
         * <pre>
         * millis since epoch the transaction was last updated
         * </pre>
         */
        public boolean hasUpdatedAt() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional int64 updated_at = 5;</code>
         *
         * <pre>
         * millis since epoch the transaction was last updated
         * </pre>
         */
        public long getUpdatedAt() {
            return updatedAt_;
        }

        // repeated .wallet.TransactionInput transaction_input = 6;
        public static final int TRANSACTION_INPUT_FIELD_NUMBER = 6;
        private java.util.List<Protos.TransactionInput> transactionInput_;
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        public java.util.List<Protos.TransactionInput> getTransactionInputList() {
            return transactionInput_;
        }
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        public java.util.List<? extends Protos.TransactionInputOrBuilder>
        getTransactionInputOrBuilderList() {
            return transactionInput_;
        }
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        public int getTransactionInputCount() {
            return transactionInput_.size();
        }
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        public Protos.TransactionInput getTransactionInput(int index) {
            return transactionInput_.get(index);
        }
        /**
         * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
         */
        public Protos.TransactionInputOrBuilder getTransactionInputOrBuilder(
                int index) {
            return transactionInput_.get(index);
        }

        // repeated .wallet.TransactionOutput transaction_output = 7;
        public static final int TRANSACTION_OUTPUT_FIELD_NUMBER = 7;
        private java.util.List<Protos.TransactionOutput> transactionOutput_;
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        public java.util.List<Protos.TransactionOutput> getTransactionOutputList() {
            return transactionOutput_;
        }
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        public java.util.List<? extends Protos.TransactionOutputOrBuilder>
        getTransactionOutputOrBuilderList() {
            return transactionOutput_;
        }
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        public int getTransactionOutputCount() {
            return transactionOutput_.size();
        }
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        public Protos.TransactionOutput getTransactionOutput(int index) {
            return transactionOutput_.get(index);
        }
        /**
         * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
         */
        public Protos.TransactionOutputOrBuilder getTransactionOutputOrBuilder(
                int index) {
            return transactionOutput_.get(index);
        }

        // repeated bytes block_hash = 8;
        public static final int BLOCK_HASH_FIELD_NUMBER = 8;
        private java.util.List<com.google.protobuf.ByteString> blockHash_;
        /**
         * <code>repeated bytes block_hash = 8;</code>
         *
         * <pre>
         * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
         * ordering within a block.
         * </pre>
         */
        public java.util.List<com.google.protobuf.ByteString>
        getBlockHashList() {
            return blockHash_;
        }
        /**
         * <code>repeated bytes block_hash = 8;</code>
         *
         * <pre>
         * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
         * ordering within a block.
         * </pre>
         */
        public int getBlockHashCount() {
            return blockHash_.size();
        }
        /**
         * <code>repeated bytes block_hash = 8;</code>
         *
         * <pre>
         * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
         * ordering within a block.
         * </pre>
         */
        public com.google.protobuf.ByteString getBlockHash(int index) {
            return blockHash_.get(index);
        }

        // repeated int32 block_relativity_offsets = 11;
        public static final int BLOCK_RELATIVITY_OFFSETS_FIELD_NUMBER = 11;
        private java.util.List<java.lang.Integer> blockRelativityOffsets_;
        /**
         * <code>repeated int32 block_relativity_offsets = 11;</code>
         */
        public java.util.List<java.lang.Integer>
        getBlockRelativityOffsetsList() {
            return blockRelativityOffsets_;
        }
        /**
         * <code>repeated int32 block_relativity_offsets = 11;</code>
         */
        public int getBlockRelativityOffsetsCount() {
            return blockRelativityOffsets_.size();
        }
        /**
         * <code>repeated int32 block_relativity_offsets = 11;</code>
         */
        public int getBlockRelativityOffsets(int index) {
            return blockRelativityOffsets_.get(index);
        }

        // optional .wallet.TransactionConfidence confidence = 9;
        public static final int CONFIDENCE_FIELD_NUMBER = 9;
        private Protos.TransactionConfidence confidence_;
        /**
         * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
         *
         * <pre>
         * Data describing where the transaction is in the chain.
         * </pre>
         */
        public boolean hasConfidence() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
         *
         * <pre>
         * Data describing where the transaction is in the chain.
         * </pre>
         */
        public Protos.TransactionConfidence getConfidence() {
            return confidence_;
        }
        /**
         * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
         *
         * <pre>
         * Data describing where the transaction is in the chain.
         * </pre>
         */
        public Protos.TransactionConfidenceOrBuilder getConfidenceOrBuilder() {
            return confidence_;
        }

        // optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];
        public static final int PURPOSE_FIELD_NUMBER = 10;
        private Protos.Transaction.Purpose purpose_;
        /**
         * <code>optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];</code>
         */
        public boolean hasPurpose() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];</code>
         */
        public Protos.Transaction.Purpose getPurpose() {
            return purpose_;
        }

        private void initFields() {
            version_ = 0;
            time_ = 0L;
            hash_ = com.google.protobuf.ByteString.EMPTY;
            pool_ = Protos.Transaction.Pool.UNSPENT;
            lockTime_ = 0;
            updatedAt_ = 0L;
            transactionInput_ = java.util.Collections.emptyList();
            transactionOutput_ = java.util.Collections.emptyList();
            blockHash_ = java.util.Collections.emptyList();
            blockRelativityOffsets_ = java.util.Collections.emptyList();
            confidence_ = Protos.TransactionConfidence.getDefaultInstance();
            purpose_ = Protos.Transaction.Purpose.UNKNOWN;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasVersion()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasTime()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasHash()) {
                memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getTransactionInputCount(); i++) {
                if (!getTransactionInput(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i = 0; i < getTransactionOutputCount(); i++) {
                if (!getTransactionOutput(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasConfidence()) {
                if (!getConfidence().isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(2, hash_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeEnum(3, pool_.getNumber());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeUInt32(4, lockTime_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeInt64(5, updatedAt_);
            }
            for (int i = 0; i < transactionInput_.size(); i++) {
                output.writeMessage(6, transactionInput_.get(i));
            }
            for (int i = 0; i < transactionOutput_.size(); i++) {
                output.writeMessage(7, transactionOutput_.get(i));
            }
            for (int i = 0; i < blockHash_.size(); i++) {
                output.writeBytes(8, blockHash_.get(i));
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeMessage(9, confidence_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeEnum(10, purpose_.getNumber());
            }
            for (int i = 0; i < blockRelativityOffsets_.size(); i++) {
                output.writeInt32(11, blockRelativityOffsets_.get(i));
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt64(12, time_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, version_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, hash_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(3, pool_.getNumber());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, lockTime_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(5, updatedAt_);
            }
            for (int i = 0; i < transactionInput_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, transactionInput_.get(i));
            }
            for (int i = 0; i < transactionOutput_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(7, transactionOutput_.get(i));
            }
            {
                int dataSize = 0;
                for (int i = 0; i < blockHash_.size(); i++) {
                    dataSize += com.google.protobuf.CodedOutputStream
                            .computeBytesSizeNoTag(blockHash_.get(i));
                }
                size += dataSize;
                size += 1 * getBlockHashList().size();
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(9, confidence_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(10, purpose_.getNumber());
            }
            {
                int dataSize = 0;
                for (int i = 0; i < blockRelativityOffsets_.size(); i++) {
                    dataSize += com.google.protobuf.CodedOutputStream
                            .computeInt32SizeNoTag(blockRelativityOffsets_.get(i));
                }
                size += dataSize;
                size += 1 * getBlockRelativityOffsetsList().size();
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(12, time_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.Transaction parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Transaction parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Transaction parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Transaction parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Transaction parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Transaction parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.Transaction parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.Transaction parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.Transaction parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Transaction parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.Transaction prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.Transaction}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.TransactionOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_Transaction_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_Transaction_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.Transaction.class, Protos.Transaction.Builder.class);
            }

            // Construct using Protos.Transaction.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    getTransactionInputFieldBuilder();
                    getTransactionOutputFieldBuilder();
                    getConfidenceFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                version_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                time_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                hash_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000004);
                pool_ = Protos.Transaction.Pool.UNSPENT;
                bitField0_ = (bitField0_ & ~0x00000008);
                lockTime_ = 0;
                bitField0_ = (bitField0_ & ~0x00000010);
                updatedAt_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000020);
                if (transactionInputBuilder_ == null) {
                    transactionInput_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000040);
                } else {
                    transactionInputBuilder_.clear();
                }
                if (transactionOutputBuilder_ == null) {
                    transactionOutput_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000080);
                } else {
                    transactionOutputBuilder_.clear();
                }
                blockHash_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000100);
                blockRelativityOffsets_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000200);
                if (confidenceBuilder_ == null) {
                    confidence_ = Protos.TransactionConfidence.getDefaultInstance();
                } else {
                    confidenceBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000400);
                purpose_ = Protos.Transaction.Purpose.UNKNOWN;
                bitField0_ = (bitField0_ & ~0x00000800);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_Transaction_descriptor;
            }

            public Protos.Transaction getDefaultInstanceForType() {
                return Protos.Transaction.getDefaultInstance();
            }

            public Protos.Transaction build() {
                Protos.Transaction result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.Transaction buildPartial() {
                Protos.Transaction result = new Protos.Transaction(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.version_ = version_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.time_ = time_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.hash_ = hash_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.pool_ = pool_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.lockTime_ = lockTime_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.updatedAt_ = updatedAt_;
                if (transactionInputBuilder_ == null) {
                    if (((bitField0_ & 0x00000040) == 0x00000040)) {
                        transactionInput_ = java.util.Collections.unmodifiableList(transactionInput_);
                        bitField0_ = (bitField0_ & ~0x00000040);
                    }
                    result.transactionInput_ = transactionInput_;
                } else {
                    result.transactionInput_ = transactionInputBuilder_.build();
                }
                if (transactionOutputBuilder_ == null) {
                    if (((bitField0_ & 0x00000080) == 0x00000080)) {
                        transactionOutput_ = java.util.Collections.unmodifiableList(transactionOutput_);
                        bitField0_ = (bitField0_ & ~0x00000080);
                    }
                    result.transactionOutput_ = transactionOutput_;
                } else {
                    result.transactionOutput_ = transactionOutputBuilder_.build();
                }
                if (((bitField0_ & 0x00000100) == 0x00000100)) {
                    blockHash_ = java.util.Collections.unmodifiableList(blockHash_);
                    bitField0_ = (bitField0_ & ~0x00000100);
                }
                result.blockHash_ = blockHash_;
                if (((bitField0_ & 0x00000200) == 0x00000200)) {
                    blockRelativityOffsets_ = java.util.Collections.unmodifiableList(blockRelativityOffsets_);
                    bitField0_ = (bitField0_ & ~0x00000200);
                }
                result.blockRelativityOffsets_ = blockRelativityOffsets_;
                if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
                    to_bitField0_ |= 0x00000040;
                }
                if (confidenceBuilder_ == null) {
                    result.confidence_ = confidence_;
                } else {
                    result.confidence_ = confidenceBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.purpose_ = purpose_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.Transaction) {
                    return mergeFrom((Protos.Transaction)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.Transaction other) {
                if (other == Protos.Transaction.getDefaultInstance()) return this;
                if (other.hasVersion()) {
                    setVersion(other.getVersion());
                }
                if (other.hasTime()) {
                    setTime(other.getTime());
                }
                if (other.hasHash()) {
                    setHash(other.getHash());
                }
                if (other.hasPool()) {
                    setPool(other.getPool());
                }
                if (other.hasLockTime()) {
                    setLockTime(other.getLockTime());
                }
                if (other.hasUpdatedAt()) {
                    setUpdatedAt(other.getUpdatedAt());
                }
                if (transactionInputBuilder_ == null) {
                    if (!other.transactionInput_.isEmpty()) {
                        if (transactionInput_.isEmpty()) {
                            transactionInput_ = other.transactionInput_;
                            bitField0_ = (bitField0_ & ~0x00000040);
                        } else {
                            ensureTransactionInputIsMutable();
                            transactionInput_.addAll(other.transactionInput_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.transactionInput_.isEmpty()) {
                        if (transactionInputBuilder_.isEmpty()) {
                            transactionInputBuilder_.dispose();
                            transactionInputBuilder_ = null;
                            transactionInput_ = other.transactionInput_;
                            bitField0_ = (bitField0_ & ~0x00000040);
                            transactionInputBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getTransactionInputFieldBuilder() : null;
                        } else {
                            transactionInputBuilder_.addAllMessages(other.transactionInput_);
                        }
                    }
                }
                if (transactionOutputBuilder_ == null) {
                    if (!other.transactionOutput_.isEmpty()) {
                        if (transactionOutput_.isEmpty()) {
                            transactionOutput_ = other.transactionOutput_;
                            bitField0_ = (bitField0_ & ~0x00000080);
                        } else {
                            ensureTransactionOutputIsMutable();
                            transactionOutput_.addAll(other.transactionOutput_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.transactionOutput_.isEmpty()) {
                        if (transactionOutputBuilder_.isEmpty()) {
                            transactionOutputBuilder_.dispose();
                            transactionOutputBuilder_ = null;
                            transactionOutput_ = other.transactionOutput_;
                            bitField0_ = (bitField0_ & ~0x00000080);
                            transactionOutputBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getTransactionOutputFieldBuilder() : null;
                        } else {
                            transactionOutputBuilder_.addAllMessages(other.transactionOutput_);
                        }
                    }
                }
                if (!other.blockHash_.isEmpty()) {
                    if (blockHash_.isEmpty()) {
                        blockHash_ = other.blockHash_;
                        bitField0_ = (bitField0_ & ~0x00000100);
                    } else {
                        ensureBlockHashIsMutable();
                        blockHash_.addAll(other.blockHash_);
                    }
                    onChanged();
                }
                if (!other.blockRelativityOffsets_.isEmpty()) {
                    if (blockRelativityOffsets_.isEmpty()) {
                        blockRelativityOffsets_ = other.blockRelativityOffsets_;
                        bitField0_ = (bitField0_ & ~0x00000200);
                    } else {
                        ensureBlockRelativityOffsetsIsMutable();
                        blockRelativityOffsets_.addAll(other.blockRelativityOffsets_);
                    }
                    onChanged();
                }
                if (other.hasConfidence()) {
                    mergeConfidence(other.getConfidence());
                }
                if (other.hasPurpose()) {
                    setPurpose(other.getPurpose());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasVersion()) {

                    return false;
                }
                if (!hasTime()) {

                    return false;
                }
                if (!hasHash()) {

                    return false;
                }
                for (int i = 0; i < getTransactionInputCount(); i++) {
                    if (!getTransactionInput(i).isInitialized()) {

                        return false;
                    }
                }
                for (int i = 0; i < getTransactionOutputCount(); i++) {
                    if (!getTransactionOutput(i).isInitialized()) {

                        return false;
                    }
                }
                if (hasConfidence()) {
                    if (!getConfidence().isInitialized()) {

                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.Transaction parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.Transaction) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required int32 version = 1;
            private int version_ ;
            /**
             * <code>required int32 version = 1;</code>
             *
             * <pre>
             * See Wallet.java for detailed description of pool semantics
             * </pre>
             */
            public boolean hasVersion() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required int32 version = 1;</code>
             *
             * <pre>
             * See Wallet.java for detailed description of pool semantics
             * </pre>
             */
            public int getVersion() {
                return version_;
            }
            /**
             * <code>required int32 version = 1;</code>
             *
             * <pre>
             * See Wallet.java for detailed description of pool semantics
             * </pre>
             */
            public Builder setVersion(int value) {
                bitField0_ |= 0x00000001;
                version_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int32 version = 1;</code>
             *
             * <pre>
             * See Wallet.java for detailed description of pool semantics
             * </pre>
             */
            public Builder clearVersion() {
                bitField0_ = (bitField0_ & ~0x00000001);
                version_ = 0;
                onChanged();
                return this;
            }

            // required int64 time = 12;
            private long time_ ;
            /**
             * <code>required int64 time = 12;</code>
             */
            public boolean hasTime() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required int64 time = 12;</code>
             */
            public long getTime() {
                return time_;
            }
            /**
             * <code>required int64 time = 12;</code>
             */
            public Builder setTime(long value) {
                bitField0_ |= 0x00000002;
                time_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required int64 time = 12;</code>
             */
            public Builder clearTime() {
                bitField0_ = (bitField0_ & ~0x00000002);
                time_ = 0L;
                onChanged();
                return this;
            }

            // required bytes hash = 2;
            private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes hash = 2;</code>
             */
            public boolean hasHash() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required bytes hash = 2;</code>
             */
            public com.google.protobuf.ByteString getHash() {
                return hash_;
            }
            /**
             * <code>required bytes hash = 2;</code>
             */
            public Builder setHash(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                hash_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes hash = 2;</code>
             */
            public Builder clearHash() {
                bitField0_ = (bitField0_ & ~0x00000004);
                hash_ = getDefaultInstance().getHash();
                onChanged();
                return this;
            }

            // optional .wallet.Transaction.Pool pool = 3;
            private Protos.Transaction.Pool pool_ = Protos.Transaction.Pool.UNSPENT;
            /**
             * <code>optional .wallet.Transaction.Pool pool = 3;</code>
             *
             * <pre>
             * If pool is not present, that means either:
             *  - This Transaction is either not in a wallet at all (the proto is re-used elsewhere)
             *  - Or it is stored but for other purposes, for example, because it is the overriding transaction of a double spend.
             *  - Or the Pool enum got a new value which your software is too old to parse.
             * </pre>
             */
            public boolean hasPool() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional .wallet.Transaction.Pool pool = 3;</code>
             *
             * <pre>
             * If pool is not present, that means either:
             *  - This Transaction is either not in a wallet at all (the proto is re-used elsewhere)
             *  - Or it is stored but for other purposes, for example, because it is the overriding transaction of a double spend.
             *  - Or the Pool enum got a new value which your software is too old to parse.
             * </pre>
             */
            public Protos.Transaction.Pool getPool() {
                return pool_;
            }
            /**
             * <code>optional .wallet.Transaction.Pool pool = 3;</code>
             *
             * <pre>
             * If pool is not present, that means either:
             *  - This Transaction is either not in a wallet at all (the proto is re-used elsewhere)
             *  - Or it is stored but for other purposes, for example, because it is the overriding transaction of a double spend.
             *  - Or the Pool enum got a new value which your software is too old to parse.
             * </pre>
             */
            public Builder setPool(Protos.Transaction.Pool value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                pool_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .wallet.Transaction.Pool pool = 3;</code>
             *
             * <pre>
             * If pool is not present, that means either:
             *  - This Transaction is either not in a wallet at all (the proto is re-used elsewhere)
             *  - Or it is stored but for other purposes, for example, because it is the overriding transaction of a double spend.
             *  - Or the Pool enum got a new value which your software is too old to parse.
             * </pre>
             */
            public Builder clearPool() {
                bitField0_ = (bitField0_ & ~0x00000008);
                pool_ = Protos.Transaction.Pool.UNSPENT;
                onChanged();
                return this;
            }

            // optional uint32 lock_time = 4;
            private int lockTime_ ;
            /**
             * <code>optional uint32 lock_time = 4;</code>
             *
             * <pre>
             * The nLockTime field is useful for contracts.
             * </pre>
             */
            public boolean hasLockTime() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional uint32 lock_time = 4;</code>
             *
             * <pre>
             * The nLockTime field is useful for contracts.
             * </pre>
             */
            public int getLockTime() {
                return lockTime_;
            }
            /**
             * <code>optional uint32 lock_time = 4;</code>
             *
             * <pre>
             * The nLockTime field is useful for contracts.
             * </pre>
             */
            public Builder setLockTime(int value) {
                bitField0_ |= 0x00000010;
                lockTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 lock_time = 4;</code>
             *
             * <pre>
             * The nLockTime field is useful for contracts.
             * </pre>
             */
            public Builder clearLockTime() {
                bitField0_ = (bitField0_ & ~0x00000010);
                lockTime_ = 0;
                onChanged();
                return this;
            }

            // optional int64 updated_at = 5;
            private long updatedAt_ ;
            /**
             * <code>optional int64 updated_at = 5;</code>
             *
             * <pre>
             * millis since epoch the transaction was last updated
             * </pre>
             */
            public boolean hasUpdatedAt() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional int64 updated_at = 5;</code>
             *
             * <pre>
             * millis since epoch the transaction was last updated
             * </pre>
             */
            public long getUpdatedAt() {
                return updatedAt_;
            }
            /**
             * <code>optional int64 updated_at = 5;</code>
             *
             * <pre>
             * millis since epoch the transaction was last updated
             * </pre>
             */
            public Builder setUpdatedAt(long value) {
                bitField0_ |= 0x00000020;
                updatedAt_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int64 updated_at = 5;</code>
             *
             * <pre>
             * millis since epoch the transaction was last updated
             * </pre>
             */
            public Builder clearUpdatedAt() {
                bitField0_ = (bitField0_ & ~0x00000020);
                updatedAt_ = 0L;
                onChanged();
                return this;
            }

            // repeated .wallet.TransactionInput transaction_input = 6;
            private java.util.List<Protos.TransactionInput> transactionInput_ =
                    java.util.Collections.emptyList();
            private void ensureTransactionInputIsMutable() {
                if (!((bitField0_ & 0x00000040) == 0x00000040)) {
                    transactionInput_ = new java.util.ArrayList<Protos.TransactionInput>(transactionInput_);
                    bitField0_ |= 0x00000040;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.TransactionInput, Protos.TransactionInput.Builder, Protos.TransactionInputOrBuilder> transactionInputBuilder_;

            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public java.util.List<Protos.TransactionInput> getTransactionInputList() {
                if (transactionInputBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(transactionInput_);
                } else {
                    return transactionInputBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public int getTransactionInputCount() {
                if (transactionInputBuilder_ == null) {
                    return transactionInput_.size();
                } else {
                    return transactionInputBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Protos.TransactionInput getTransactionInput(int index) {
                if (transactionInputBuilder_ == null) {
                    return transactionInput_.get(index);
                } else {
                    return transactionInputBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Builder setTransactionInput(
                    int index, Protos.TransactionInput value) {
                if (transactionInputBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionInputIsMutable();
                    transactionInput_.set(index, value);
                    onChanged();
                } else {
                    transactionInputBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Builder setTransactionInput(
                    int index, Protos.TransactionInput.Builder builderForValue) {
                if (transactionInputBuilder_ == null) {
                    ensureTransactionInputIsMutable();
                    transactionInput_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    transactionInputBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Builder addTransactionInput(Protos.TransactionInput value) {
                if (transactionInputBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionInputIsMutable();
                    transactionInput_.add(value);
                    onChanged();
                } else {
                    transactionInputBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Builder addTransactionInput(
                    int index, Protos.TransactionInput value) {
                if (transactionInputBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionInputIsMutable();
                    transactionInput_.add(index, value);
                    onChanged();
                } else {
                    transactionInputBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Builder addTransactionInput(
                    Protos.TransactionInput.Builder builderForValue) {
                if (transactionInputBuilder_ == null) {
                    ensureTransactionInputIsMutable();
                    transactionInput_.add(builderForValue.build());
                    onChanged();
                } else {
                    transactionInputBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Builder addTransactionInput(
                    int index, Protos.TransactionInput.Builder builderForValue) {
                if (transactionInputBuilder_ == null) {
                    ensureTransactionInputIsMutable();
                    transactionInput_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    transactionInputBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Builder addAllTransactionInput(
                    java.lang.Iterable<? extends Protos.TransactionInput> values) {
                if (transactionInputBuilder_ == null) {
                    ensureTransactionInputIsMutable();
                    super.addAll(values, transactionInput_);
                    onChanged();
                } else {
                    transactionInputBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Builder clearTransactionInput() {
                if (transactionInputBuilder_ == null) {
                    transactionInput_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000040);
                    onChanged();
                } else {
                    transactionInputBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Builder removeTransactionInput(int index) {
                if (transactionInputBuilder_ == null) {
                    ensureTransactionInputIsMutable();
                    transactionInput_.remove(index);
                    onChanged();
                } else {
                    transactionInputBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Protos.TransactionInput.Builder getTransactionInputBuilder(
                    int index) {
                return getTransactionInputFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Protos.TransactionInputOrBuilder getTransactionInputOrBuilder(
                    int index) {
                if (transactionInputBuilder_ == null) {
                    return transactionInput_.get(index);  } else {
                    return transactionInputBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public java.util.List<? extends Protos.TransactionInputOrBuilder>
            getTransactionInputOrBuilderList() {
                if (transactionInputBuilder_ != null) {
                    return transactionInputBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(transactionInput_);
                }
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Protos.TransactionInput.Builder addTransactionInputBuilder() {
                return getTransactionInputFieldBuilder().addBuilder(
                        Protos.TransactionInput.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public Protos.TransactionInput.Builder addTransactionInputBuilder(
                    int index) {
                return getTransactionInputFieldBuilder().addBuilder(
                        index, Protos.TransactionInput.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.TransactionInput transaction_input = 6;</code>
             */
            public java.util.List<Protos.TransactionInput.Builder>
            getTransactionInputBuilderList() {
                return getTransactionInputFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.TransactionInput, Protos.TransactionInput.Builder, Protos.TransactionInputOrBuilder>
            getTransactionInputFieldBuilder() {
                if (transactionInputBuilder_ == null) {
                    transactionInputBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            Protos.TransactionInput, Protos.TransactionInput.Builder, Protos.TransactionInputOrBuilder>(
                            transactionInput_,
                            ((bitField0_ & 0x00000040) == 0x00000040),
                            getParentForChildren(),
                            isClean());
                    transactionInput_ = null;
                }
                return transactionInputBuilder_;
            }

            // repeated .wallet.TransactionOutput transaction_output = 7;
            private java.util.List<Protos.TransactionOutput> transactionOutput_ =
                    java.util.Collections.emptyList();
            private void ensureTransactionOutputIsMutable() {
                if (!((bitField0_ & 0x00000080) == 0x00000080)) {
                    transactionOutput_ = new java.util.ArrayList<Protos.TransactionOutput>(transactionOutput_);
                    bitField0_ |= 0x00000080;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.TransactionOutput, Protos.TransactionOutput.Builder, Protos.TransactionOutputOrBuilder> transactionOutputBuilder_;

            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public java.util.List<Protos.TransactionOutput> getTransactionOutputList() {
                if (transactionOutputBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(transactionOutput_);
                } else {
                    return transactionOutputBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public int getTransactionOutputCount() {
                if (transactionOutputBuilder_ == null) {
                    return transactionOutput_.size();
                } else {
                    return transactionOutputBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Protos.TransactionOutput getTransactionOutput(int index) {
                if (transactionOutputBuilder_ == null) {
                    return transactionOutput_.get(index);
                } else {
                    return transactionOutputBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Builder setTransactionOutput(
                    int index, Protos.TransactionOutput value) {
                if (transactionOutputBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionOutputIsMutable();
                    transactionOutput_.set(index, value);
                    onChanged();
                } else {
                    transactionOutputBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Builder setTransactionOutput(
                    int index, Protos.TransactionOutput.Builder builderForValue) {
                if (transactionOutputBuilder_ == null) {
                    ensureTransactionOutputIsMutable();
                    transactionOutput_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    transactionOutputBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Builder addTransactionOutput(Protos.TransactionOutput value) {
                if (transactionOutputBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionOutputIsMutable();
                    transactionOutput_.add(value);
                    onChanged();
                } else {
                    transactionOutputBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Builder addTransactionOutput(
                    int index, Protos.TransactionOutput value) {
                if (transactionOutputBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionOutputIsMutable();
                    transactionOutput_.add(index, value);
                    onChanged();
                } else {
                    transactionOutputBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Builder addTransactionOutput(
                    Protos.TransactionOutput.Builder builderForValue) {
                if (transactionOutputBuilder_ == null) {
                    ensureTransactionOutputIsMutable();
                    transactionOutput_.add(builderForValue.build());
                    onChanged();
                } else {
                    transactionOutputBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Builder addTransactionOutput(
                    int index, Protos.TransactionOutput.Builder builderForValue) {
                if (transactionOutputBuilder_ == null) {
                    ensureTransactionOutputIsMutable();
                    transactionOutput_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    transactionOutputBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Builder addAllTransactionOutput(
                    java.lang.Iterable<? extends Protos.TransactionOutput> values) {
                if (transactionOutputBuilder_ == null) {
                    ensureTransactionOutputIsMutable();
                    super.addAll(values, transactionOutput_);
                    onChanged();
                } else {
                    transactionOutputBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Builder clearTransactionOutput() {
                if (transactionOutputBuilder_ == null) {
                    transactionOutput_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000080);
                    onChanged();
                } else {
                    transactionOutputBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Builder removeTransactionOutput(int index) {
                if (transactionOutputBuilder_ == null) {
                    ensureTransactionOutputIsMutable();
                    transactionOutput_.remove(index);
                    onChanged();
                } else {
                    transactionOutputBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Protos.TransactionOutput.Builder getTransactionOutputBuilder(
                    int index) {
                return getTransactionOutputFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Protos.TransactionOutputOrBuilder getTransactionOutputOrBuilder(
                    int index) {
                if (transactionOutputBuilder_ == null) {
                    return transactionOutput_.get(index);  } else {
                    return transactionOutputBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public java.util.List<? extends Protos.TransactionOutputOrBuilder>
            getTransactionOutputOrBuilderList() {
                if (transactionOutputBuilder_ != null) {
                    return transactionOutputBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(transactionOutput_);
                }
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Protos.TransactionOutput.Builder addTransactionOutputBuilder() {
                return getTransactionOutputFieldBuilder().addBuilder(
                        Protos.TransactionOutput.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public Protos.TransactionOutput.Builder addTransactionOutputBuilder(
                    int index) {
                return getTransactionOutputFieldBuilder().addBuilder(
                        index, Protos.TransactionOutput.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.TransactionOutput transaction_output = 7;</code>
             */
            public java.util.List<Protos.TransactionOutput.Builder>
            getTransactionOutputBuilderList() {
                return getTransactionOutputFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.TransactionOutput, Protos.TransactionOutput.Builder, Protos.TransactionOutputOrBuilder>
            getTransactionOutputFieldBuilder() {
                if (transactionOutputBuilder_ == null) {
                    transactionOutputBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            Protos.TransactionOutput, Protos.TransactionOutput.Builder, Protos.TransactionOutputOrBuilder>(
                            transactionOutput_,
                            ((bitField0_ & 0x00000080) == 0x00000080),
                            getParentForChildren(),
                            isClean());
                    transactionOutput_ = null;
                }
                return transactionOutputBuilder_;
            }

            // repeated bytes block_hash = 8;
            private java.util.List<com.google.protobuf.ByteString> blockHash_ = java.util.Collections.emptyList();
            private void ensureBlockHashIsMutable() {
                if (!((bitField0_ & 0x00000100) == 0x00000100)) {
                    blockHash_ = new java.util.ArrayList<com.google.protobuf.ByteString>(blockHash_);
                    bitField0_ |= 0x00000100;
                }
            }
            /**
             * <code>repeated bytes block_hash = 8;</code>
             *
             * <pre>
             * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
             * ordering within a block.
             * </pre>
             */
            public java.util.List<com.google.protobuf.ByteString>
            getBlockHashList() {
                return java.util.Collections.unmodifiableList(blockHash_);
            }
            /**
             * <code>repeated bytes block_hash = 8;</code>
             *
             * <pre>
             * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
             * ordering within a block.
             * </pre>
             */
            public int getBlockHashCount() {
                return blockHash_.size();
            }
            /**
             * <code>repeated bytes block_hash = 8;</code>
             *
             * <pre>
             * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
             * ordering within a block.
             * </pre>
             */
            public com.google.protobuf.ByteString getBlockHash(int index) {
                return blockHash_.get(index);
            }
            /**
             * <code>repeated bytes block_hash = 8;</code>
             *
             * <pre>
             * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
             * ordering within a block.
             * </pre>
             */
            public Builder setBlockHash(
                    int index, com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureBlockHashIsMutable();
                blockHash_.set(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated bytes block_hash = 8;</code>
             *
             * <pre>
             * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
             * ordering within a block.
             * </pre>
             */
            public Builder addBlockHash(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureBlockHashIsMutable();
                blockHash_.add(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated bytes block_hash = 8;</code>
             *
             * <pre>
             * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
             * ordering within a block.
             * </pre>
             */
            public Builder addAllBlockHash(
                    java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
                ensureBlockHashIsMutable();
                super.addAll(values, blockHash_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated bytes block_hash = 8;</code>
             *
             * <pre>
             * A list of blocks in which the transaction has been observed (on any chain). Also, a number used to disambiguate
             * ordering within a block.
             * </pre>
             */
            public Builder clearBlockHash() {
                blockHash_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000100);
                onChanged();
                return this;
            }

            // repeated int32 block_relativity_offsets = 11;
            private java.util.List<java.lang.Integer> blockRelativityOffsets_ = java.util.Collections.emptyList();
            private void ensureBlockRelativityOffsetsIsMutable() {
                if (!((bitField0_ & 0x00000200) == 0x00000200)) {
                    blockRelativityOffsets_ = new java.util.ArrayList<java.lang.Integer>(blockRelativityOffsets_);
                    bitField0_ |= 0x00000200;
                }
            }
            /**
             * <code>repeated int32 block_relativity_offsets = 11;</code>
             */
            public java.util.List<java.lang.Integer>
            getBlockRelativityOffsetsList() {
                return java.util.Collections.unmodifiableList(blockRelativityOffsets_);
            }
            /**
             * <code>repeated int32 block_relativity_offsets = 11;</code>
             */
            public int getBlockRelativityOffsetsCount() {
                return blockRelativityOffsets_.size();
            }
            /**
             * <code>repeated int32 block_relativity_offsets = 11;</code>
             */
            public int getBlockRelativityOffsets(int index) {
                return blockRelativityOffsets_.get(index);
            }
            /**
             * <code>repeated int32 block_relativity_offsets = 11;</code>
             */
            public Builder setBlockRelativityOffsets(
                    int index, int value) {
                ensureBlockRelativityOffsetsIsMutable();
                blockRelativityOffsets_.set(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 block_relativity_offsets = 11;</code>
             */
            public Builder addBlockRelativityOffsets(int value) {
                ensureBlockRelativityOffsetsIsMutable();
                blockRelativityOffsets_.add(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 block_relativity_offsets = 11;</code>
             */
            public Builder addAllBlockRelativityOffsets(
                    java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureBlockRelativityOffsetsIsMutable();
                super.addAll(values, blockRelativityOffsets_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 block_relativity_offsets = 11;</code>
             */
            public Builder clearBlockRelativityOffsets() {
                blockRelativityOffsets_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000200);
                onChanged();
                return this;
            }

            // optional .wallet.TransactionConfidence confidence = 9;
            private Protos.TransactionConfidence confidence_ = Protos.TransactionConfidence.getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<
                    Protos.TransactionConfidence, Protos.TransactionConfidence.Builder, Protos.TransactionConfidenceOrBuilder> confidenceBuilder_;
            /**
             * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
             *
             * <pre>
             * Data describing where the transaction is in the chain.
             * </pre>
             */
            public boolean hasConfidence() {
                return ((bitField0_ & 0x00000400) == 0x00000400);
            }
            /**
             * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
             *
             * <pre>
             * Data describing where the transaction is in the chain.
             * </pre>
             */
            public Protos.TransactionConfidence getConfidence() {
                if (confidenceBuilder_ == null) {
                    return confidence_;
                } else {
                    return confidenceBuilder_.getMessage();
                }
            }
            /**
             * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
             *
             * <pre>
             * Data describing where the transaction is in the chain.
             * </pre>
             */
            public Builder setConfidence(Protos.TransactionConfidence value) {
                if (confidenceBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    confidence_ = value;
                    onChanged();
                } else {
                    confidenceBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000400;
                return this;
            }
            /**
             * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
             *
             * <pre>
             * Data describing where the transaction is in the chain.
             * </pre>
             */
            public Builder setConfidence(
                    Protos.TransactionConfidence.Builder builderForValue) {
                if (confidenceBuilder_ == null) {
                    confidence_ = builderForValue.build();
                    onChanged();
                } else {
                    confidenceBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000400;
                return this;
            }
            /**
             * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
             *
             * <pre>
             * Data describing where the transaction is in the chain.
             * </pre>
             */
            public Builder mergeConfidence(Protos.TransactionConfidence value) {
                if (confidenceBuilder_ == null) {
                    if (((bitField0_ & 0x00000400) == 0x00000400) &&
                            confidence_ != Protos.TransactionConfidence.getDefaultInstance()) {
                        confidence_ =
                                Protos.TransactionConfidence.newBuilder(confidence_).mergeFrom(value).buildPartial();
                    } else {
                        confidence_ = value;
                    }
                    onChanged();
                } else {
                    confidenceBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000400;
                return this;
            }
            /**
             * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
             *
             * <pre>
             * Data describing where the transaction is in the chain.
             * </pre>
             */
            public Builder clearConfidence() {
                if (confidenceBuilder_ == null) {
                    confidence_ = Protos.TransactionConfidence.getDefaultInstance();
                    onChanged();
                } else {
                    confidenceBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000400);
                return this;
            }
            /**
             * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
             *
             * <pre>
             * Data describing where the transaction is in the chain.
             * </pre>
             */
            public Protos.TransactionConfidence.Builder getConfidenceBuilder() {
                bitField0_ |= 0x00000400;
                onChanged();
                return getConfidenceFieldBuilder().getBuilder();
            }
            /**
             * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
             *
             * <pre>
             * Data describing where the transaction is in the chain.
             * </pre>
             */
            public Protos.TransactionConfidenceOrBuilder getConfidenceOrBuilder() {
                if (confidenceBuilder_ != null) {
                    return confidenceBuilder_.getMessageOrBuilder();
                } else {
                    return confidence_;
                }
            }
            /**
             * <code>optional .wallet.TransactionConfidence confidence = 9;</code>
             *
             * <pre>
             * Data describing where the transaction is in the chain.
             * </pre>
             */
            private com.google.protobuf.SingleFieldBuilder<
                    Protos.TransactionConfidence, Protos.TransactionConfidence.Builder, Protos.TransactionConfidenceOrBuilder>
            getConfidenceFieldBuilder() {
                if (confidenceBuilder_ == null) {
                    confidenceBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                            Protos.TransactionConfidence, Protos.TransactionConfidence.Builder, Protos.TransactionConfidenceOrBuilder>(
                            confidence_,
                            getParentForChildren(),
                            isClean());
                    confidence_ = null;
                }
                return confidenceBuilder_;
            }

            // optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];
            private Protos.Transaction.Purpose purpose_ = Protos.Transaction.Purpose.UNKNOWN;
            /**
             * <code>optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];</code>
             */
            public boolean hasPurpose() {
                return ((bitField0_ & 0x00000800) == 0x00000800);
            }
            /**
             * <code>optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];</code>
             */
            public Protos.Transaction.Purpose getPurpose() {
                return purpose_;
            }
            /**
             * <code>optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];</code>
             */
            public Builder setPurpose(Protos.Transaction.Purpose value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000800;
                purpose_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .wallet.Transaction.Purpose purpose = 10 [default = UNKNOWN];</code>
             */
            public Builder clearPurpose() {
                bitField0_ = (bitField0_ & ~0x00000800);
                purpose_ = Protos.Transaction.Purpose.UNKNOWN;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.Transaction)
        }

        static {
            defaultInstance = new Transaction(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.Transaction)
    }

    public interface ScryptParametersOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required bytes salt = 1;
        /**
         * <code>required bytes salt = 1;</code>
         *
         * <pre>
         * Salt to use in generation of the wallet password (8 bytes)
         * </pre>
         */
        boolean hasSalt();
        /**
         * <code>required bytes salt = 1;</code>
         *
         * <pre>
         * Salt to use in generation of the wallet password (8 bytes)
         * </pre>
         */
        com.google.protobuf.ByteString getSalt();

        // optional int64 n = 2 [default = 16384];
        /**
         * <code>optional int64 n = 2 [default = 16384];</code>
         *
         * <pre>
         * CPU/ memory cost parameter
         * </pre>
         */
        boolean hasN();
        /**
         * <code>optional int64 n = 2 [default = 16384];</code>
         *
         * <pre>
         * CPU/ memory cost parameter
         * </pre>
         */
        long getN();

        // optional int32 r = 3 [default = 8];
        /**
         * <code>optional int32 r = 3 [default = 8];</code>
         *
         * <pre>
         * Block size parameter
         * </pre>
         */
        boolean hasR();
        /**
         * <code>optional int32 r = 3 [default = 8];</code>
         *
         * <pre>
         * Block size parameter
         * </pre>
         */
        int getR();

        // optional int32 p = 4 [default = 1];
        /**
         * <code>optional int32 p = 4 [default = 1];</code>
         *
         * <pre>
         * Parallelisation parameter
         * </pre>
         */
        boolean hasP();
        /**
         * <code>optional int32 p = 4 [default = 1];</code>
         *
         * <pre>
         * Parallelisation parameter
         * </pre>
         */
        int getP();
    }
    /**
     * Protobuf type {@code wallet.ScryptParameters}
     *
     * <pre>
     ** The parameters used in the scrypt key derivation function.
     *  The default values are taken from http://www.tarsnap.com/scrypt/scrypt-slides.pdf.
     *  They can be increased - n is the number of iterations performed and
     *  r and p can be used to tweak the algorithm - see:
     *  http://stackoverflow.com/questions/11126315/what-are-optimal-scrypt-work-factors
     * </pre>
     */
    public static final class ScryptParameters extends
            com.google.protobuf.GeneratedMessage
            implements ScryptParametersOrBuilder {
        // Use ScryptParameters.newBuilder() to construct.
        private ScryptParameters(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private ScryptParameters(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final ScryptParameters defaultInstance;
        public static ScryptParameters getDefaultInstance() {
            return defaultInstance;
        }

        public ScryptParameters getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private ScryptParameters(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            salt_ = input.readBytes();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            n_ = input.readInt64();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            r_ = input.readInt32();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            p_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_ScryptParameters_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_ScryptParameters_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.ScryptParameters.class, Protos.ScryptParameters.Builder.class);
        }

        public static com.google.protobuf.Parser<ScryptParameters> PARSER =
                new com.google.protobuf.AbstractParser<ScryptParameters>() {
                    public ScryptParameters parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ScryptParameters(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<ScryptParameters> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required bytes salt = 1;
        public static final int SALT_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString salt_;
        /**
         * <code>required bytes salt = 1;</code>
         *
         * <pre>
         * Salt to use in generation of the wallet password (8 bytes)
         * </pre>
         */
        public boolean hasSalt() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required bytes salt = 1;</code>
         *
         * <pre>
         * Salt to use in generation of the wallet password (8 bytes)
         * </pre>
         */
        public com.google.protobuf.ByteString getSalt() {
            return salt_;
        }

        // optional int64 n = 2 [default = 16384];
        public static final int N_FIELD_NUMBER = 2;
        private long n_;
        /**
         * <code>optional int64 n = 2 [default = 16384];</code>
         *
         * <pre>
         * CPU/ memory cost parameter
         * </pre>
         */
        public boolean hasN() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional int64 n = 2 [default = 16384];</code>
         *
         * <pre>
         * CPU/ memory cost parameter
         * </pre>
         */
        public long getN() {
            return n_;
        }

        // optional int32 r = 3 [default = 8];
        public static final int R_FIELD_NUMBER = 3;
        private int r_;
        /**
         * <code>optional int32 r = 3 [default = 8];</code>
         *
         * <pre>
         * Block size parameter
         * </pre>
         */
        public boolean hasR() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional int32 r = 3 [default = 8];</code>
         *
         * <pre>
         * Block size parameter
         * </pre>
         */
        public int getR() {
            return r_;
        }

        // optional int32 p = 4 [default = 1];
        public static final int P_FIELD_NUMBER = 4;
        private int p_;
        /**
         * <code>optional int32 p = 4 [default = 1];</code>
         *
         * <pre>
         * Parallelisation parameter
         * </pre>
         */
        public boolean hasP() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional int32 p = 4 [default = 1];</code>
         *
         * <pre>
         * Parallelisation parameter
         * </pre>
         */
        public int getP() {
            return p_;
        }

        private void initFields() {
            salt_ = com.google.protobuf.ByteString.EMPTY;
            n_ = 16384L;
            r_ = 8;
            p_ = 1;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasSalt()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, salt_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt64(2, n_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeInt32(3, r_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeInt32(4, p_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, salt_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(2, n_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, r_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, p_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.ScryptParameters parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.ScryptParameters parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.ScryptParameters parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.ScryptParameters parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.ScryptParameters parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.ScryptParameters parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.ScryptParameters parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.ScryptParameters parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.ScryptParameters parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.ScryptParameters parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.ScryptParameters prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.ScryptParameters}
         *
         * <pre>
         ** The parameters used in the scrypt key derivation function.
         *  The default values are taken from http://www.tarsnap.com/scrypt/scrypt-slides.pdf.
         *  They can be increased - n is the number of iterations performed and
         *  r and p can be used to tweak the algorithm - see:
         *  http://stackoverflow.com/questions/11126315/what-are-optimal-scrypt-work-factors
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.ScryptParametersOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_ScryptParameters_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_ScryptParameters_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.ScryptParameters.class, Protos.ScryptParameters.Builder.class);
            }

            // Construct using Protos.ScryptParameters.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                salt_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                n_ = 16384L;
                bitField0_ = (bitField0_ & ~0x00000002);
                r_ = 8;
                bitField0_ = (bitField0_ & ~0x00000004);
                p_ = 1;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_ScryptParameters_descriptor;
            }

            public Protos.ScryptParameters getDefaultInstanceForType() {
                return Protos.ScryptParameters.getDefaultInstance();
            }

            public Protos.ScryptParameters build() {
                Protos.ScryptParameters result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.ScryptParameters buildPartial() {
                Protos.ScryptParameters result = new Protos.ScryptParameters(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.salt_ = salt_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.n_ = n_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.r_ = r_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.p_ = p_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.ScryptParameters) {
                    return mergeFrom((Protos.ScryptParameters)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.ScryptParameters other) {
                if (other == Protos.ScryptParameters.getDefaultInstance()) return this;
                if (other.hasSalt()) {
                    setSalt(other.getSalt());
                }
                if (other.hasN()) {
                    setN(other.getN());
                }
                if (other.hasR()) {
                    setR(other.getR());
                }
                if (other.hasP()) {
                    setP(other.getP());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasSalt()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.ScryptParameters parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.ScryptParameters) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required bytes salt = 1;
            private com.google.protobuf.ByteString salt_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes salt = 1;</code>
             *
             * <pre>
             * Salt to use in generation of the wallet password (8 bytes)
             * </pre>
             */
            public boolean hasSalt() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required bytes salt = 1;</code>
             *
             * <pre>
             * Salt to use in generation of the wallet password (8 bytes)
             * </pre>
             */
            public com.google.protobuf.ByteString getSalt() {
                return salt_;
            }
            /**
             * <code>required bytes salt = 1;</code>
             *
             * <pre>
             * Salt to use in generation of the wallet password (8 bytes)
             * </pre>
             */
            public Builder setSalt(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                salt_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes salt = 1;</code>
             *
             * <pre>
             * Salt to use in generation of the wallet password (8 bytes)
             * </pre>
             */
            public Builder clearSalt() {
                bitField0_ = (bitField0_ & ~0x00000001);
                salt_ = getDefaultInstance().getSalt();
                onChanged();
                return this;
            }

            // optional int64 n = 2 [default = 16384];
            private long n_ = 16384L;
            /**
             * <code>optional int64 n = 2 [default = 16384];</code>
             *
             * <pre>
             * CPU/ memory cost parameter
             * </pre>
             */
            public boolean hasN() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional int64 n = 2 [default = 16384];</code>
             *
             * <pre>
             * CPU/ memory cost parameter
             * </pre>
             */
            public long getN() {
                return n_;
            }
            /**
             * <code>optional int64 n = 2 [default = 16384];</code>
             *
             * <pre>
             * CPU/ memory cost parameter
             * </pre>
             */
            public Builder setN(long value) {
                bitField0_ |= 0x00000002;
                n_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int64 n = 2 [default = 16384];</code>
             *
             * <pre>
             * CPU/ memory cost parameter
             * </pre>
             */
            public Builder clearN() {
                bitField0_ = (bitField0_ & ~0x00000002);
                n_ = 16384L;
                onChanged();
                return this;
            }

            // optional int32 r = 3 [default = 8];
            private int r_ = 8;
            /**
             * <code>optional int32 r = 3 [default = 8];</code>
             *
             * <pre>
             * Block size parameter
             * </pre>
             */
            public boolean hasR() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional int32 r = 3 [default = 8];</code>
             *
             * <pre>
             * Block size parameter
             * </pre>
             */
            public int getR() {
                return r_;
            }
            /**
             * <code>optional int32 r = 3 [default = 8];</code>
             *
             * <pre>
             * Block size parameter
             * </pre>
             */
            public Builder setR(int value) {
                bitField0_ |= 0x00000004;
                r_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 r = 3 [default = 8];</code>
             *
             * <pre>
             * Block size parameter
             * </pre>
             */
            public Builder clearR() {
                bitField0_ = (bitField0_ & ~0x00000004);
                r_ = 8;
                onChanged();
                return this;
            }

            // optional int32 p = 4 [default = 1];
            private int p_ = 1;
            /**
             * <code>optional int32 p = 4 [default = 1];</code>
             *
             * <pre>
             * Parallelisation parameter
             * </pre>
             */
            public boolean hasP() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional int32 p = 4 [default = 1];</code>
             *
             * <pre>
             * Parallelisation parameter
             * </pre>
             */
            public int getP() {
                return p_;
            }
            /**
             * <code>optional int32 p = 4 [default = 1];</code>
             *
             * <pre>
             * Parallelisation parameter
             * </pre>
             */
            public Builder setP(int value) {
                bitField0_ |= 0x00000008;
                p_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 p = 4 [default = 1];</code>
             *
             * <pre>
             * Parallelisation parameter
             * </pre>
             */
            public Builder clearP() {
                bitField0_ = (bitField0_ & ~0x00000008);
                p_ = 1;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.ScryptParameters)
        }

        static {
            defaultInstance = new ScryptParameters(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.ScryptParameters)
    }

    public interface ExtensionOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required string id = 1;
        /**
         * <code>required string id = 1;</code>
         *
         * <pre>
         * like org.whatever.foo.bar
         * </pre>
         */
        boolean hasId();
        /**
         * <code>required string id = 1;</code>
         *
         * <pre>
         * like org.whatever.foo.bar
         * </pre>
         */
        java.lang.String getId();
        /**
         * <code>required string id = 1;</code>
         *
         * <pre>
         * like org.whatever.foo.bar
         * </pre>
         */
        com.google.protobuf.ByteString
        getIdBytes();

        // required bytes data = 2;
        /**
         * <code>required bytes data = 2;</code>
         */
        boolean hasData();
        /**
         * <code>required bytes data = 2;</code>
         */
        com.google.protobuf.ByteString getData();

        // required bool mandatory = 3;
        /**
         * <code>required bool mandatory = 3;</code>
         *
         * <pre>
         * If we do not understand a mandatory extension, abort to prevent data loss.
         * For example, this could be applied to a new type of holding, such as a contract, where
         * dropping of an extension in a read/write cycle could cause loss of value.
         * </pre>
         */
        boolean hasMandatory();
        /**
         * <code>required bool mandatory = 3;</code>
         *
         * <pre>
         * If we do not understand a mandatory extension, abort to prevent data loss.
         * For example, this could be applied to a new type of holding, such as a contract, where
         * dropping of an extension in a read/write cycle could cause loss of value.
         * </pre>
         */
        boolean getMandatory();
    }
    /**
     * Protobuf type {@code wallet.Extension}
     *
     * <pre>
     ** An extension to the wallet 
     * </pre>
     */
    public static final class Extension extends
            com.google.protobuf.GeneratedMessage
            implements ExtensionOrBuilder {
        // Use Extension.newBuilder() to construct.
        private Extension(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Extension(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final Extension defaultInstance;
        public static Extension getDefaultInstance() {
            return defaultInstance;
        }

        public Extension getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Extension(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            id_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            data_ = input.readBytes();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            mandatory_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_Extension_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_Extension_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.Extension.class, Protos.Extension.Builder.class);
        }

        public static com.google.protobuf.Parser<Extension> PARSER =
                new com.google.protobuf.AbstractParser<Extension>() {
                    public Extension parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Extension(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<Extension> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required string id = 1;
        public static final int ID_FIELD_NUMBER = 1;
        private java.lang.Object id_;
        /**
         * <code>required string id = 1;</code>
         *
         * <pre>
         * like org.whatever.foo.bar
         * </pre>
         */
        public boolean hasId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string id = 1;</code>
         *
         * <pre>
         * like org.whatever.foo.bar
         * </pre>
         */
        public java.lang.String getId() {
            java.lang.Object ref = id_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    id_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string id = 1;</code>
         *
         * <pre>
         * like org.whatever.foo.bar
         * </pre>
         */
        public com.google.protobuf.ByteString
        getIdBytes() {
            java.lang.Object ref = id_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                id_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // required bytes data = 2;
        public static final int DATA_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString data_;
        /**
         * <code>required bytes data = 2;</code>
         */
        public boolean hasData() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>required bytes data = 2;</code>
         */
        public com.google.protobuf.ByteString getData() {
            return data_;
        }

        // required bool mandatory = 3;
        public static final int MANDATORY_FIELD_NUMBER = 3;
        private boolean mandatory_;
        /**
         * <code>required bool mandatory = 3;</code>
         *
         * <pre>
         * If we do not understand a mandatory extension, abort to prevent data loss.
         * For example, this could be applied to a new type of holding, such as a contract, where
         * dropping of an extension in a read/write cycle could cause loss of value.
         * </pre>
         */
        public boolean hasMandatory() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>required bool mandatory = 3;</code>
         *
         * <pre>
         * If we do not understand a mandatory extension, abort to prevent data loss.
         * For example, this could be applied to a new type of holding, such as a contract, where
         * dropping of an extension in a read/write cycle could cause loss of value.
         * </pre>
         */
        public boolean getMandatory() {
            return mandatory_;
        }

        private void initFields() {
            id_ = "";
            data_ = com.google.protobuf.ByteString.EMPTY;
            mandatory_ = false;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasId()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasData()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasMandatory()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getIdBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, data_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBool(3, mandatory_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getIdBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, data_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, mandatory_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.Extension parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Extension parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Extension parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Extension parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Extension parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Extension parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.Extension parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.Extension parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.Extension parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Extension parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.Extension prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.Extension}
         *
         * <pre>
         ** An extension to the wallet 
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.ExtensionOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_Extension_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_Extension_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.Extension.class, Protos.Extension.Builder.class);
            }

            // Construct using Protos.Extension.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                id_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                data_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                mandatory_ = false;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_Extension_descriptor;
            }

            public Protos.Extension getDefaultInstanceForType() {
                return Protos.Extension.getDefaultInstance();
            }

            public Protos.Extension build() {
                Protos.Extension result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.Extension buildPartial() {
                Protos.Extension result = new Protos.Extension(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.id_ = id_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.data_ = data_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.mandatory_ = mandatory_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.Extension) {
                    return mergeFrom((Protos.Extension)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.Extension other) {
                if (other == Protos.Extension.getDefaultInstance()) return this;
                if (other.hasId()) {
                    bitField0_ |= 0x00000001;
                    id_ = other.id_;
                    onChanged();
                }
                if (other.hasData()) {
                    setData(other.getData());
                }
                if (other.hasMandatory()) {
                    setMandatory(other.getMandatory());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasId()) {

                    return false;
                }
                if (!hasData()) {

                    return false;
                }
                if (!hasMandatory()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.Extension parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.Extension) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required string id = 1;
            private java.lang.Object id_ = "";
            /**
             * <code>required string id = 1;</code>
             *
             * <pre>
             * like org.whatever.foo.bar
             * </pre>
             */
            public boolean hasId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string id = 1;</code>
             *
             * <pre>
             * like org.whatever.foo.bar
             * </pre>
             */
            public java.lang.String getId() {
                java.lang.Object ref = id_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    id_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string id = 1;</code>
             *
             * <pre>
             * like org.whatever.foo.bar
             * </pre>
             */
            public com.google.protobuf.ByteString
            getIdBytes() {
                java.lang.Object ref = id_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    id_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string id = 1;</code>
             *
             * <pre>
             * like org.whatever.foo.bar
             * </pre>
             */
            public Builder setId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string id = 1;</code>
             *
             * <pre>
             * like org.whatever.foo.bar
             * </pre>
             */
            public Builder clearId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                id_ = getDefaultInstance().getId();
                onChanged();
                return this;
            }
            /**
             * <code>required string id = 1;</code>
             *
             * <pre>
             * like org.whatever.foo.bar
             * </pre>
             */
            public Builder setIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                id_ = value;
                onChanged();
                return this;
            }

            // required bytes data = 2;
            private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>required bytes data = 2;</code>
             */
            public boolean hasData() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>required bytes data = 2;</code>
             */
            public com.google.protobuf.ByteString getData() {
                return data_;
            }
            /**
             * <code>required bytes data = 2;</code>
             */
            public Builder setData(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                data_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bytes data = 2;</code>
             */
            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000002);
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }

            // required bool mandatory = 3;
            private boolean mandatory_ ;
            /**
             * <code>required bool mandatory = 3;</code>
             *
             * <pre>
             * If we do not understand a mandatory extension, abort to prevent data loss.
             * For example, this could be applied to a new type of holding, such as a contract, where
             * dropping of an extension in a read/write cycle could cause loss of value.
             * </pre>
             */
            public boolean hasMandatory() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>required bool mandatory = 3;</code>
             *
             * <pre>
             * If we do not understand a mandatory extension, abort to prevent data loss.
             * For example, this could be applied to a new type of holding, such as a contract, where
             * dropping of an extension in a read/write cycle could cause loss of value.
             * </pre>
             */
            public boolean getMandatory() {
                return mandatory_;
            }
            /**
             * <code>required bool mandatory = 3;</code>
             *
             * <pre>
             * If we do not understand a mandatory extension, abort to prevent data loss.
             * For example, this could be applied to a new type of holding, such as a contract, where
             * dropping of an extension in a read/write cycle could cause loss of value.
             * </pre>
             */
            public Builder setMandatory(boolean value) {
                bitField0_ |= 0x00000004;
                mandatory_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bool mandatory = 3;</code>
             *
             * <pre>
             * If we do not understand a mandatory extension, abort to prevent data loss.
             * For example, this could be applied to a new type of holding, such as a contract, where
             * dropping of an extension in a read/write cycle could cause loss of value.
             * </pre>
             */
            public Builder clearMandatory() {
                bitField0_ = (bitField0_ & ~0x00000004);
                mandatory_ = false;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.Extension)
        }

        static {
            defaultInstance = new Extension(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.Extension)
    }

    public interface WalletOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // required string network_identifier = 1;
        /**
         * <code>required string network_identifier = 1;</code>
         *
         * <pre>
         * the network used by this wallet
         * </pre>
         */
        boolean hasNetworkIdentifier();
        /**
         * <code>required string network_identifier = 1;</code>
         *
         * <pre>
         * the network used by this wallet
         * </pre>
         */
        java.lang.String getNetworkIdentifier();
        /**
         * <code>required string network_identifier = 1;</code>
         *
         * <pre>
         * the network used by this wallet
         * </pre>
         */
        com.google.protobuf.ByteString
        getNetworkIdentifierBytes();

        // optional bytes last_seen_block_hash = 2;
        /**
         * <code>optional bytes last_seen_block_hash = 2;</code>
         *
         * <pre>
         * The SHA256 hash of the head of the best chain seen by this wallet.
         * </pre>
         */
        boolean hasLastSeenBlockHash();
        /**
         * <code>optional bytes last_seen_block_hash = 2;</code>
         *
         * <pre>
         * The SHA256 hash of the head of the best chain seen by this wallet.
         * </pre>
         */
        com.google.protobuf.ByteString getLastSeenBlockHash();

        // optional uint32 last_seen_block_height = 12;
        /**
         * <code>optional uint32 last_seen_block_height = 12;</code>
         *
         * <pre>
         * The height in the chain of the last seen block.
         * </pre>
         */
        boolean hasLastSeenBlockHeight();
        /**
         * <code>optional uint32 last_seen_block_height = 12;</code>
         *
         * <pre>
         * The height in the chain of the last seen block.
         * </pre>
         */
        int getLastSeenBlockHeight();

        // optional int64 last_seen_block_time_secs = 14;
        /**
         * <code>optional int64 last_seen_block_time_secs = 14;</code>
         */
        boolean hasLastSeenBlockTimeSecs();
        /**
         * <code>optional int64 last_seen_block_time_secs = 14;</code>
         */
        long getLastSeenBlockTimeSecs();

        // repeated .wallet.Key key = 3;
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        java.util.List<Protos.Key>
        getKeyList();
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        Protos.Key getKey(int index);
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        int getKeyCount();
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        List<? extends KeyOrBuilder>
        getKeyOrBuilderList();
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        Protos.KeyOrBuilder getKeyOrBuilder(
                int index);

        // repeated .wallet.Transaction transaction = 4;
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        java.util.List<Protos.Transaction>
        getTransactionList();
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        Protos.Transaction getTransaction(int index);
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        int getTransactionCount();
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        java.util.List<? extends Protos.TransactionOrBuilder>
        getTransactionOrBuilderList();
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        Protos.TransactionOrBuilder getTransactionOrBuilder(
                int index);

        // repeated .wallet.Script watched_script = 15;
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        java.util.List<Protos.Script>
        getWatchedScriptList();
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        Protos.Script getWatchedScript(int index);
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        int getWatchedScriptCount();
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        java.util.List<? extends Protos.ScriptOrBuilder>
        getWatchedScriptOrBuilderList();
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        Protos.ScriptOrBuilder getWatchedScriptOrBuilder(
                int index);

        // optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];
        /**
         * <code>optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];</code>
         */
        boolean hasEncryptionType();
        /**
         * <code>optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];</code>
         */
        Protos.Wallet.EncryptionType getEncryptionType();

        // optional .wallet.ScryptParameters encryption_parameters = 6;
        /**
         * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
         */
        boolean hasEncryptionParameters();
        /**
         * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
         */
        Protos.ScryptParameters getEncryptionParameters();
        /**
         * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
         */
        Protos.ScryptParametersOrBuilder getEncryptionParametersOrBuilder();

        // optional int32 version = 7;
        /**
         * <code>optional int32 version = 7;</code>
         *
         * <pre>
         * The version number of the wallet - used to detect wallets that were produced in the future
         * (i.e the wallet may contain some future format this protobuf/ code does not know about)
         * </pre>
         */
        boolean hasVersion();
        /**
         * <code>optional int32 version = 7;</code>
         *
         * <pre>
         * The version number of the wallet - used to detect wallets that were produced in the future
         * (i.e the wallet may contain some future format this protobuf/ code does not know about)
         * </pre>
         */
        int getVersion();

        // repeated .wallet.Extension extension = 10;
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        java.util.List<Protos.Extension>
        getExtensionList();
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        Protos.Extension getExtension(int index);
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        int getExtensionCount();
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        java.util.List<? extends Protos.ExtensionOrBuilder>
        getExtensionOrBuilderList();
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        Protos.ExtensionOrBuilder getExtensionOrBuilder(
                int index);

        // optional string description = 11;
        /**
         * <code>optional string description = 11;</code>
         *
         * <pre>
         * A UTF8 encoded text description of the wallet that is intended for end user provided text.
         * </pre>
         */
        boolean hasDescription();
        /**
         * <code>optional string description = 11;</code>
         *
         * <pre>
         * A UTF8 encoded text description of the wallet that is intended for end user provided text.
         * </pre>
         */
        java.lang.String getDescription();
        /**
         * <code>optional string description = 11;</code>
         *
         * <pre>
         * A UTF8 encoded text description of the wallet that is intended for end user provided text.
         * </pre>
         */
        com.google.protobuf.ByteString
        getDescriptionBytes();

        // optional uint64 key_rotation_time = 13;
        /**
         * <code>optional uint64 key_rotation_time = 13;</code>
         *
         * <pre>
         * UNIX time in seconds since the epoch. If set, then any keys created before this date are assumed to be no longer
         * wanted. Money sent to them will be re-spent automatically to the first key that was created after this time. It
         * can be used to recover a compromised wallet, or just as part of preventative defence-in-depth measures.
         * </pre>
         */
        boolean hasKeyRotationTime();
        /**
         * <code>optional uint64 key_rotation_time = 13;</code>
         *
         * <pre>
         * UNIX time in seconds since the epoch. If set, then any keys created before this date are assumed to be no longer
         * wanted. Money sent to them will be re-spent automatically to the first key that was created after this time. It
         * can be used to recover a compromised wallet, or just as part of preventative defence-in-depth measures.
         * </pre>
         */
        long getKeyRotationTime();
    }
    /**
     * Protobuf type {@code wallet.Wallet}
     *
     * <pre>
     ** A kobocoin wallet 
     * </pre>
     */
    public static final class Wallet extends
            com.google.protobuf.GeneratedMessage
            implements WalletOrBuilder {
        // Use Wallet.newBuilder() to construct.
        private Wallet(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Wallet(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

        private static final Wallet defaultInstance;
        public static Wallet getDefaultInstance() {
            return defaultInstance;
        }

        public Wallet getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Wallet(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            networkIdentifier_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            lastSeenBlockHash_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                                key_ = new java.util.ArrayList<Protos.Key>();
                                mutable_bitField0_ |= 0x00000010;
                            }
                            key_.add(input.readMessage(Protos.Key.PARSER, extensionRegistry));
                            break;
                        }
                        case 34: {
                            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                                transaction_ = new java.util.ArrayList<Protos.Transaction>();
                                mutable_bitField0_ |= 0x00000020;
                            }
                            transaction_.add(input.readMessage(Protos.Transaction.PARSER, extensionRegistry));
                            break;
                        }
                        case 40: {
                            int rawValue = input.readEnum();
                            Protos.Wallet.EncryptionType value = Protos.Wallet.EncryptionType.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(5, rawValue);
                            } else {
                                bitField0_ |= 0x00000010;
                                encryptionType_ = value;
                            }
                            break;
                        }
                        case 50: {
                            Protos.ScryptParameters.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                                subBuilder = encryptionParameters_.toBuilder();
                            }
                            encryptionParameters_ = input.readMessage(Protos.ScryptParameters.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(encryptionParameters_);
                                encryptionParameters_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000020;
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            version_ = input.readInt32();
                            break;
                        }
                        case 82: {
                            if (!((mutable_bitField0_ & 0x00000400) == 0x00000400)) {
                                extension_ = new java.util.ArrayList<Protos.Extension>();
                                mutable_bitField0_ |= 0x00000400;
                            }
                            extension_.add(input.readMessage(Protos.Extension.PARSER, extensionRegistry));
                            break;
                        }
                        case 90: {
                            bitField0_ |= 0x00000080;
                            description_ = input.readBytes();
                            break;
                        }
                        case 96: {
                            bitField0_ |= 0x00000004;
                            lastSeenBlockHeight_ = input.readUInt32();
                            break;
                        }
                        case 104: {
                            bitField0_ |= 0x00000100;
                            keyRotationTime_ = input.readUInt64();
                            break;
                        }
                        case 112: {
                            bitField0_ |= 0x00000008;
                            lastSeenBlockTimeSecs_ = input.readInt64();
                            break;
                        }
                        case 122: {
                            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                                watchedScript_ = new java.util.ArrayList<Protos.Script>();
                                mutable_bitField0_ |= 0x00000040;
                            }
                            watchedScript_.add(input.readMessage(Protos.Script.PARSER, extensionRegistry));
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                    key_ = java.util.Collections.unmodifiableList(key_);
                }
                if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                    transaction_ = java.util.Collections.unmodifiableList(transaction_);
                }
                if (((mutable_bitField0_ & 0x00000400) == 0x00000400)) {
                    extension_ = java.util.Collections.unmodifiableList(extension_);
                }
                if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                    watchedScript_ = java.util.Collections.unmodifiableList(watchedScript_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Protos.internal_static_wallet_Wallet_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Protos.internal_static_wallet_Wallet_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Protos.Wallet.class, Protos.Wallet.Builder.class);
        }

        public static com.google.protobuf.Parser<Wallet> PARSER =
                new com.google.protobuf.AbstractParser<Wallet>() {
                    public Wallet parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Wallet(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<Wallet> getParserForType() {
            return PARSER;
        }

        /**
         * Protobuf enum {@code wallet.Wallet.EncryptionType}
         *
         * <pre>
         **
         * The encryption type of the wallet.
         *
         * The encryption type is UNENCRYPTED for wallets where the wallet does not support encryption - wallets prior to
         * encryption support are grandfathered in as this wallet type.
         * When a wallet is ENCRYPTED_SCRYPT_AES the keys are either encrypted with the wallet password or are unencrypted.
         * </pre>
         */
        public enum EncryptionType
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>UNENCRYPTED = 1;</code>
             *
             * <pre>
             * All keys in the wallet are unencrypted
             * </pre>
             */
            UNENCRYPTED(0, 1),
            /**
             * <code>ENCRYPTED_SCRYPT_AES = 2;</code>
             *
             * <pre>
             * All keys are encrypted with a passphrase based KDF of scrypt and AES encryption
             * </pre>
             */
            ENCRYPTED_SCRYPT_AES(1, 2),
            ;

            /**
             * <code>UNENCRYPTED = 1;</code>
             *
             * <pre>
             * All keys in the wallet are unencrypted
             * </pre>
             */
            public static final int UNENCRYPTED_VALUE = 1;
            /**
             * <code>ENCRYPTED_SCRYPT_AES = 2;</code>
             *
             * <pre>
             * All keys are encrypted with a passphrase based KDF of scrypt and AES encryption
             * </pre>
             */
            public static final int ENCRYPTED_SCRYPT_AES_VALUE = 2;


            public final int getNumber() { return value; }

            public static EncryptionType valueOf(int value) {
                switch (value) {
                    case 1: return UNENCRYPTED;
                    case 2: return ENCRYPTED_SCRYPT_AES;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<EncryptionType>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static com.google.protobuf.Internal.EnumLiteMap<EncryptionType>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<EncryptionType>() {
                        public EncryptionType findValueByNumber(int number) {
                            return EncryptionType.valueOf(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(index);
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return Protos.Wallet.getDescriptor().getEnumTypes().get(0);
            }

            private static final EncryptionType[] VALUES = values();

            public static EncryptionType valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int index;
            private final int value;

            private EncryptionType(int index, int value) {
                this.index = index;
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:wallet.Wallet.EncryptionType)
        }

        private int bitField0_;
        // required string network_identifier = 1;
        public static final int NETWORK_IDENTIFIER_FIELD_NUMBER = 1;
        private java.lang.Object networkIdentifier_;
        /**
         * <code>required string network_identifier = 1;</code>
         *
         * <pre>
         * the network used by this wallet
         * </pre>
         */
        public boolean hasNetworkIdentifier() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required string network_identifier = 1;</code>
         *
         * <pre>
         * the network used by this wallet
         * </pre>
         */
        public java.lang.String getNetworkIdentifier() {
            java.lang.Object ref = networkIdentifier_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    networkIdentifier_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string network_identifier = 1;</code>
         *
         * <pre>
         * the network used by this wallet
         * </pre>
         */
        public com.google.protobuf.ByteString
        getNetworkIdentifierBytes() {
            java.lang.Object ref = networkIdentifier_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                networkIdentifier_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional bytes last_seen_block_hash = 2;
        public static final int LAST_SEEN_BLOCK_HASH_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString lastSeenBlockHash_;
        /**
         * <code>optional bytes last_seen_block_hash = 2;</code>
         *
         * <pre>
         * The SHA256 hash of the head of the best chain seen by this wallet.
         * </pre>
         */
        public boolean hasLastSeenBlockHash() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional bytes last_seen_block_hash = 2;</code>
         *
         * <pre>
         * The SHA256 hash of the head of the best chain seen by this wallet.
         * </pre>
         */
        public com.google.protobuf.ByteString getLastSeenBlockHash() {
            return lastSeenBlockHash_;
        }

        // optional uint32 last_seen_block_height = 12;
        public static final int LAST_SEEN_BLOCK_HEIGHT_FIELD_NUMBER = 12;
        private int lastSeenBlockHeight_;
        /**
         * <code>optional uint32 last_seen_block_height = 12;</code>
         *
         * <pre>
         * The height in the chain of the last seen block.
         * </pre>
         */
        public boolean hasLastSeenBlockHeight() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint32 last_seen_block_height = 12;</code>
         *
         * <pre>
         * The height in the chain of the last seen block.
         * </pre>
         */
        public int getLastSeenBlockHeight() {
            return lastSeenBlockHeight_;
        }

        // optional int64 last_seen_block_time_secs = 14;
        public static final int LAST_SEEN_BLOCK_TIME_SECS_FIELD_NUMBER = 14;
        private long lastSeenBlockTimeSecs_;
        /**
         * <code>optional int64 last_seen_block_time_secs = 14;</code>
         */
        public boolean hasLastSeenBlockTimeSecs() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional int64 last_seen_block_time_secs = 14;</code>
         */
        public long getLastSeenBlockTimeSecs() {
            return lastSeenBlockTimeSecs_;
        }

        // repeated .wallet.Key key = 3;
        public static final int KEY_FIELD_NUMBER = 3;
        private java.util.List<Protos.Key> key_;
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        public java.util.List<Protos.Key> getKeyList() {
            return key_;
        }
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        public java.util.List<? extends Protos.KeyOrBuilder>
        getKeyOrBuilderList() {
            return key_;
        }
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        public int getKeyCount() {
            return key_.size();
        }
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        public Protos.Key getKey(int index) {
            return key_.get(index);
        }
        /**
         * <code>repeated .wallet.Key key = 3;</code>
         */
        public Protos.KeyOrBuilder getKeyOrBuilder(
                int index) {
            return key_.get(index);
        }

        // repeated .wallet.Transaction transaction = 4;
        public static final int TRANSACTION_FIELD_NUMBER = 4;
        private java.util.List<Protos.Transaction> transaction_;
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        public java.util.List<Protos.Transaction> getTransactionList() {
            return transaction_;
        }
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        public java.util.List<? extends Protos.TransactionOrBuilder>
        getTransactionOrBuilderList() {
            return transaction_;
        }
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        public int getTransactionCount() {
            return transaction_.size();
        }
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        public Protos.Transaction getTransaction(int index) {
            return transaction_.get(index);
        }
        /**
         * <code>repeated .wallet.Transaction transaction = 4;</code>
         */
        public Protos.TransactionOrBuilder getTransactionOrBuilder(
                int index) {
            return transaction_.get(index);
        }

        // repeated .wallet.Script watched_script = 15;
        public static final int WATCHED_SCRIPT_FIELD_NUMBER = 15;
        private java.util.List<Protos.Script> watchedScript_;
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        public java.util.List<Protos.Script> getWatchedScriptList() {
            return watchedScript_;
        }
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        public java.util.List<? extends Protos.ScriptOrBuilder>
        getWatchedScriptOrBuilderList() {
            return watchedScript_;
        }
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        public int getWatchedScriptCount() {
            return watchedScript_.size();
        }
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        public Protos.Script getWatchedScript(int index) {
            return watchedScript_.get(index);
        }
        /**
         * <code>repeated .wallet.Script watched_script = 15;</code>
         */
        public Protos.ScriptOrBuilder getWatchedScriptOrBuilder(
                int index) {
            return watchedScript_.get(index);
        }

        // optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];
        public static final int ENCRYPTION_TYPE_FIELD_NUMBER = 5;
        private Protos.Wallet.EncryptionType encryptionType_;
        /**
         * <code>optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];</code>
         */
        public boolean hasEncryptionType() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];</code>
         */
        public Protos.Wallet.EncryptionType getEncryptionType() {
            return encryptionType_;
        }

        // optional .wallet.ScryptParameters encryption_parameters = 6;
        public static final int ENCRYPTION_PARAMETERS_FIELD_NUMBER = 6;
        private Protos.ScryptParameters encryptionParameters_;
        /**
         * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
         */
        public boolean hasEncryptionParameters() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
         */
        public Protos.ScryptParameters getEncryptionParameters() {
            return encryptionParameters_;
        }
        /**
         * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
         */
        public Protos.ScryptParametersOrBuilder getEncryptionParametersOrBuilder() {
            return encryptionParameters_;
        }

        // optional int32 version = 7;
        public static final int VERSION_FIELD_NUMBER = 7;
        private int version_;
        /**
         * <code>optional int32 version = 7;</code>
         *
         * <pre>
         * The version number of the wallet - used to detect wallets that were produced in the future
         * (i.e the wallet may contain some future format this protobuf/ code does not know about)
         * </pre>
         */
        public boolean hasVersion() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional int32 version = 7;</code>
         *
         * <pre>
         * The version number of the wallet - used to detect wallets that were produced in the future
         * (i.e the wallet may contain some future format this protobuf/ code does not know about)
         * </pre>
         */
        public int getVersion() {
            return version_;
        }

        // repeated .wallet.Extension extension = 10;
        public static final int EXTENSION_FIELD_NUMBER = 10;
        private java.util.List<Protos.Extension> extension_;
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        public java.util.List<Protos.Extension> getExtensionList() {
            return extension_;
        }
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        public java.util.List<? extends Protos.ExtensionOrBuilder>
        getExtensionOrBuilderList() {
            return extension_;
        }
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        public int getExtensionCount() {
            return extension_.size();
        }
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        public Protos.Extension getExtension(int index) {
            return extension_.get(index);
        }
        /**
         * <code>repeated .wallet.Extension extension = 10;</code>
         */
        public Protos.ExtensionOrBuilder getExtensionOrBuilder(
                int index) {
            return extension_.get(index);
        }

        // optional string description = 11;
        public static final int DESCRIPTION_FIELD_NUMBER = 11;
        private java.lang.Object description_;
        /**
         * <code>optional string description = 11;</code>
         *
         * <pre>
         * A UTF8 encoded text description of the wallet that is intended for end user provided text.
         * </pre>
         */
        public boolean hasDescription() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional string description = 11;</code>
         *
         * <pre>
         * A UTF8 encoded text description of the wallet that is intended for end user provided text.
         * </pre>
         */
        public java.lang.String getDescription() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    description_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string description = 11;</code>
         *
         * <pre>
         * A UTF8 encoded text description of the wallet that is intended for end user provided text.
         * </pre>
         */
        public com.google.protobuf.ByteString
        getDescriptionBytes() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                description_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional uint64 key_rotation_time = 13;
        public static final int KEY_ROTATION_TIME_FIELD_NUMBER = 13;
        private long keyRotationTime_;
        /**
         * <code>optional uint64 key_rotation_time = 13;</code>
         *
         * <pre>
         * UNIX time in seconds since the epoch. If set, then any keys created before this date are assumed to be no longer
         * wanted. Money sent to them will be re-spent automatically to the first key that was created after this time. It
         * can be used to recover a compromised wallet, or just as part of preventative defence-in-depth measures.
         * </pre>
         */
        public boolean hasKeyRotationTime() {
            return ((bitField0_ & 0x00000100) == 0x00000100);
        }
        /**
         * <code>optional uint64 key_rotation_time = 13;</code>
         *
         * <pre>
         * UNIX time in seconds since the epoch. If set, then any keys created before this date are assumed to be no longer
         * wanted. Money sent to them will be re-spent automatically to the first key that was created after this time. It
         * can be used to recover a compromised wallet, or just as part of preventative defence-in-depth measures.
         * </pre>
         */
        public long getKeyRotationTime() {
            return keyRotationTime_;
        }

        private void initFields() {
            networkIdentifier_ = "";
            lastSeenBlockHash_ = com.google.protobuf.ByteString.EMPTY;
            lastSeenBlockHeight_ = 0;
            lastSeenBlockTimeSecs_ = 0L;
            key_ = java.util.Collections.emptyList();
            transaction_ = java.util.Collections.emptyList();
            watchedScript_ = java.util.Collections.emptyList();
            encryptionType_ = Protos.Wallet.EncryptionType.UNENCRYPTED;
            encryptionParameters_ = Protos.ScryptParameters.getDefaultInstance();
            version_ = 0;
            extension_ = java.util.Collections.emptyList();
            description_ = "";
            keyRotationTime_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            if (!hasNetworkIdentifier()) {
                memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getKeyCount(); i++) {
                if (!getKey(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i = 0; i < getTransactionCount(); i++) {
                if (!getTransaction(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i = 0; i < getWatchedScriptCount(); i++) {
                if (!getWatchedScript(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasEncryptionParameters()) {
                if (!getEncryptionParameters().isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i = 0; i < getExtensionCount(); i++) {
                if (!getExtension(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getNetworkIdentifierBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, lastSeenBlockHash_);
            }
            for (int i = 0; i < key_.size(); i++) {
                output.writeMessage(3, key_.get(i));
            }
            for (int i = 0; i < transaction_.size(); i++) {
                output.writeMessage(4, transaction_.get(i));
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeEnum(5, encryptionType_.getNumber());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeMessage(6, encryptionParameters_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeInt32(7, version_);
            }
            for (int i = 0; i < extension_.size(); i++) {
                output.writeMessage(10, extension_.get(i));
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeBytes(11, getDescriptionBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt32(12, lastSeenBlockHeight_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                output.writeUInt64(13, keyRotationTime_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeInt64(14, lastSeenBlockTimeSecs_);
            }
            for (int i = 0; i < watchedScript_.size(); i++) {
                output.writeMessage(15, watchedScript_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getNetworkIdentifierBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, lastSeenBlockHash_);
            }
            for (int i = 0; i < key_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, key_.get(i));
            }
            for (int i = 0; i < transaction_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, transaction_.get(i));
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(5, encryptionType_.getNumber());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, encryptionParameters_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(7, version_);
            }
            for (int i = 0; i < extension_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(10, extension_.get(i));
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(11, getDescriptionBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(12, lastSeenBlockHeight_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(13, keyRotationTime_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(14, lastSeenBlockTimeSecs_);
            }
            for (int i = 0; i < watchedScript_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(15, watchedScript_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protos.Wallet parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Wallet parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Wallet parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Protos.Wallet parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Protos.Wallet parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Wallet parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Protos.Wallet parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static Protos.Wallet parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static Protos.Wallet parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static Protos.Wallet parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(Protos.Wallet prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code wallet.Wallet}
         *
         * <pre>
         ** A kobocoin wallet 
         * </pre>
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements Protos.WalletOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Protos.internal_static_wallet_Wallet_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Protos.internal_static_wallet_Wallet_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Protos.Wallet.class, Protos.Wallet.Builder.class);
            }

            // Construct using Protos.Wallet.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                    getKeyFieldBuilder();
                    getTransactionFieldBuilder();
                    getWatchedScriptFieldBuilder();
                    getEncryptionParametersFieldBuilder();
                    getExtensionFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                networkIdentifier_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                lastSeenBlockHash_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                lastSeenBlockHeight_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                lastSeenBlockTimeSecs_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000008);
                if (keyBuilder_ == null) {
                    key_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000010);
                } else {
                    keyBuilder_.clear();
                }
                if (transactionBuilder_ == null) {
                    transaction_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000020);
                } else {
                    transactionBuilder_.clear();
                }
                if (watchedScriptBuilder_ == null) {
                    watchedScript_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000040);
                } else {
                    watchedScriptBuilder_.clear();
                }
                encryptionType_ = Protos.Wallet.EncryptionType.UNENCRYPTED;
                bitField0_ = (bitField0_ & ~0x00000080);
                if (encryptionParametersBuilder_ == null) {
                    encryptionParameters_ = Protos.ScryptParameters.getDefaultInstance();
                } else {
                    encryptionParametersBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000100);
                version_ = 0;
                bitField0_ = (bitField0_ & ~0x00000200);
                if (extensionBuilder_ == null) {
                    extension_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000400);
                } else {
                    extensionBuilder_.clear();
                }
                description_ = "";
                bitField0_ = (bitField0_ & ~0x00000800);
                keyRotationTime_ = 0L;
                bitField0_ = (bitField0_ & ~0x00001000);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Protos.internal_static_wallet_Wallet_descriptor;
            }

            public Protos.Wallet getDefaultInstanceForType() {
                return Protos.Wallet.getDefaultInstance();
            }

            public Protos.Wallet build() {
                Protos.Wallet result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Protos.Wallet buildPartial() {
                Protos.Wallet result = new Protos.Wallet(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.networkIdentifier_ = networkIdentifier_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.lastSeenBlockHash_ = lastSeenBlockHash_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.lastSeenBlockHeight_ = lastSeenBlockHeight_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.lastSeenBlockTimeSecs_ = lastSeenBlockTimeSecs_;
                if (keyBuilder_ == null) {
                    if (((bitField0_ & 0x00000010) == 0x00000010)) {
                        key_ = java.util.Collections.unmodifiableList(key_);
                        bitField0_ = (bitField0_ & ~0x00000010);
                    }
                    result.key_ = key_;
                } else {
                    result.key_ = keyBuilder_.build();
                }
                if (transactionBuilder_ == null) {
                    if (((bitField0_ & 0x00000020) == 0x00000020)) {
                        transaction_ = java.util.Collections.unmodifiableList(transaction_);
                        bitField0_ = (bitField0_ & ~0x00000020);
                    }
                    result.transaction_ = transaction_;
                } else {
                    result.transaction_ = transactionBuilder_.build();
                }
                if (watchedScriptBuilder_ == null) {
                    if (((bitField0_ & 0x00000040) == 0x00000040)) {
                        watchedScript_ = java.util.Collections.unmodifiableList(watchedScript_);
                        bitField0_ = (bitField0_ & ~0x00000040);
                    }
                    result.watchedScript_ = watchedScript_;
                } else {
                    result.watchedScript_ = watchedScriptBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.encryptionType_ = encryptionType_;
                if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
                    to_bitField0_ |= 0x00000020;
                }
                if (encryptionParametersBuilder_ == null) {
                    result.encryptionParameters_ = encryptionParameters_;
                } else {
                    result.encryptionParameters_ = encryptionParametersBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.version_ = version_;
                if (extensionBuilder_ == null) {
                    if (((bitField0_ & 0x00000400) == 0x00000400)) {
                        extension_ = java.util.Collections.unmodifiableList(extension_);
                        bitField0_ = (bitField0_ & ~0x00000400);
                    }
                    result.extension_ = extension_;
                } else {
                    result.extension_ = extensionBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.description_ = description_;
                if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
                    to_bitField0_ |= 0x00000100;
                }
                result.keyRotationTime_ = keyRotationTime_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Protos.Wallet) {
                    return mergeFrom((Protos.Wallet)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Protos.Wallet other) {
                if (other == Protos.Wallet.getDefaultInstance()) return this;
                if (other.hasNetworkIdentifier()) {
                    bitField0_ |= 0x00000001;
                    networkIdentifier_ = other.networkIdentifier_;
                    onChanged();
                }
                if (other.hasLastSeenBlockHash()) {
                    setLastSeenBlockHash(other.getLastSeenBlockHash());
                }
                if (other.hasLastSeenBlockHeight()) {
                    setLastSeenBlockHeight(other.getLastSeenBlockHeight());
                }
                if (other.hasLastSeenBlockTimeSecs()) {
                    setLastSeenBlockTimeSecs(other.getLastSeenBlockTimeSecs());
                }
                if (keyBuilder_ == null) {
                    if (!other.key_.isEmpty()) {
                        if (key_.isEmpty()) {
                            key_ = other.key_;
                            bitField0_ = (bitField0_ & ~0x00000010);
                        } else {
                            ensureKeyIsMutable();
                            key_.addAll(other.key_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.key_.isEmpty()) {
                        if (keyBuilder_.isEmpty()) {
                            keyBuilder_.dispose();
                            keyBuilder_ = null;
                            key_ = other.key_;
                            bitField0_ = (bitField0_ & ~0x00000010);
                            keyBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getKeyFieldBuilder() : null;
                        } else {
                            keyBuilder_.addAllMessages(other.key_);
                        }
                    }
                }
                if (transactionBuilder_ == null) {
                    if (!other.transaction_.isEmpty()) {
                        if (transaction_.isEmpty()) {
                            transaction_ = other.transaction_;
                            bitField0_ = (bitField0_ & ~0x00000020);
                        } else {
                            ensureTransactionIsMutable();
                            transaction_.addAll(other.transaction_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.transaction_.isEmpty()) {
                        if (transactionBuilder_.isEmpty()) {
                            transactionBuilder_.dispose();
                            transactionBuilder_ = null;
                            transaction_ = other.transaction_;
                            bitField0_ = (bitField0_ & ~0x00000020);
                            transactionBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getTransactionFieldBuilder() : null;
                        } else {
                            transactionBuilder_.addAllMessages(other.transaction_);
                        }
                    }
                }
                if (watchedScriptBuilder_ == null) {
                    if (!other.watchedScript_.isEmpty()) {
                        if (watchedScript_.isEmpty()) {
                            watchedScript_ = other.watchedScript_;
                            bitField0_ = (bitField0_ & ~0x00000040);
                        } else {
                            ensureWatchedScriptIsMutable();
                            watchedScript_.addAll(other.watchedScript_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.watchedScript_.isEmpty()) {
                        if (watchedScriptBuilder_.isEmpty()) {
                            watchedScriptBuilder_.dispose();
                            watchedScriptBuilder_ = null;
                            watchedScript_ = other.watchedScript_;
                            bitField0_ = (bitField0_ & ~0x00000040);
                            watchedScriptBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getWatchedScriptFieldBuilder() : null;
                        } else {
                            watchedScriptBuilder_.addAllMessages(other.watchedScript_);
                        }
                    }
                }
                if (other.hasEncryptionType()) {
                    setEncryptionType(other.getEncryptionType());
                }
                if (other.hasEncryptionParameters()) {
                    mergeEncryptionParameters(other.getEncryptionParameters());
                }
                if (other.hasVersion()) {
                    setVersion(other.getVersion());
                }
                if (extensionBuilder_ == null) {
                    if (!other.extension_.isEmpty()) {
                        if (extension_.isEmpty()) {
                            extension_ = other.extension_;
                            bitField0_ = (bitField0_ & ~0x00000400);
                        } else {
                            ensureExtensionIsMutable();
                            extension_.addAll(other.extension_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.extension_.isEmpty()) {
                        if (extensionBuilder_.isEmpty()) {
                            extensionBuilder_.dispose();
                            extensionBuilder_ = null;
                            extension_ = other.extension_;
                            bitField0_ = (bitField0_ & ~0x00000400);
                            extensionBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getExtensionFieldBuilder() : null;
                        } else {
                            extensionBuilder_.addAllMessages(other.extension_);
                        }
                    }
                }
                if (other.hasDescription()) {
                    bitField0_ |= 0x00000800;
                    description_ = other.description_;
                    onChanged();
                }
                if (other.hasKeyRotationTime()) {
                    setKeyRotationTime(other.getKeyRotationTime());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasNetworkIdentifier()) {

                    return false;
                }
                for (int i = 0; i < getKeyCount(); i++) {
                    if (!getKey(i).isInitialized()) {

                        return false;
                    }
                }
                for (int i = 0; i < getTransactionCount(); i++) {
                    if (!getTransaction(i).isInitialized()) {

                        return false;
                    }
                }
                for (int i = 0; i < getWatchedScriptCount(); i++) {
                    if (!getWatchedScript(i).isInitialized()) {

                        return false;
                    }
                }
                if (hasEncryptionParameters()) {
                    if (!getEncryptionParameters().isInitialized()) {

                        return false;
                    }
                }
                for (int i = 0; i < getExtensionCount(); i++) {
                    if (!getExtension(i).isInitialized()) {

                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Protos.Wallet parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Protos.Wallet) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // required string network_identifier = 1;
            private java.lang.Object networkIdentifier_ = "";
            /**
             * <code>required string network_identifier = 1;</code>
             *
             * <pre>
             * the network used by this wallet
             * </pre>
             */
            public boolean hasNetworkIdentifier() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required string network_identifier = 1;</code>
             *
             * <pre>
             * the network used by this wallet
             * </pre>
             */
            public java.lang.String getNetworkIdentifier() {
                java.lang.Object ref = networkIdentifier_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    networkIdentifier_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>required string network_identifier = 1;</code>
             *
             * <pre>
             * the network used by this wallet
             * </pre>
             */
            public com.google.protobuf.ByteString
            getNetworkIdentifierBytes() {
                java.lang.Object ref = networkIdentifier_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    networkIdentifier_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string network_identifier = 1;</code>
             *
             * <pre>
             * the network used by this wallet
             * </pre>
             */
            public Builder setNetworkIdentifier(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                networkIdentifier_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string network_identifier = 1;</code>
             *
             * <pre>
             * the network used by this wallet
             * </pre>
             */
            public Builder clearNetworkIdentifier() {
                bitField0_ = (bitField0_ & ~0x00000001);
                networkIdentifier_ = getDefaultInstance().getNetworkIdentifier();
                onChanged();
                return this;
            }
            /**
             * <code>required string network_identifier = 1;</code>
             *
             * <pre>
             * the network used by this wallet
             * </pre>
             */
            public Builder setNetworkIdentifierBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                networkIdentifier_ = value;
                onChanged();
                return this;
            }

            // optional bytes last_seen_block_hash = 2;
            private com.google.protobuf.ByteString lastSeenBlockHash_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes last_seen_block_hash = 2;</code>
             *
             * <pre>
             * The SHA256 hash of the head of the best chain seen by this wallet.
             * </pre>
             */
            public boolean hasLastSeenBlockHash() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional bytes last_seen_block_hash = 2;</code>
             *
             * <pre>
             * The SHA256 hash of the head of the best chain seen by this wallet.
             * </pre>
             */
            public com.google.protobuf.ByteString getLastSeenBlockHash() {
                return lastSeenBlockHash_;
            }
            /**
             * <code>optional bytes last_seen_block_hash = 2;</code>
             *
             * <pre>
             * The SHA256 hash of the head of the best chain seen by this wallet.
             * </pre>
             */
            public Builder setLastSeenBlockHash(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                lastSeenBlockHash_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes last_seen_block_hash = 2;</code>
             *
             * <pre>
             * The SHA256 hash of the head of the best chain seen by this wallet.
             * </pre>
             */
            public Builder clearLastSeenBlockHash() {
                bitField0_ = (bitField0_ & ~0x00000002);
                lastSeenBlockHash_ = getDefaultInstance().getLastSeenBlockHash();
                onChanged();
                return this;
            }

            // optional uint32 last_seen_block_height = 12;
            private int lastSeenBlockHeight_ ;
            /**
             * <code>optional uint32 last_seen_block_height = 12;</code>
             *
             * <pre>
             * The height in the chain of the last seen block.
             * </pre>
             */
            public boolean hasLastSeenBlockHeight() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional uint32 last_seen_block_height = 12;</code>
             *
             * <pre>
             * The height in the chain of the last seen block.
             * </pre>
             */
            public int getLastSeenBlockHeight() {
                return lastSeenBlockHeight_;
            }
            /**
             * <code>optional uint32 last_seen_block_height = 12;</code>
             *
             * <pre>
             * The height in the chain of the last seen block.
             * </pre>
             */
            public Builder setLastSeenBlockHeight(int value) {
                bitField0_ |= 0x00000004;
                lastSeenBlockHeight_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 last_seen_block_height = 12;</code>
             *
             * <pre>
             * The height in the chain of the last seen block.
             * </pre>
             */
            public Builder clearLastSeenBlockHeight() {
                bitField0_ = (bitField0_ & ~0x00000004);
                lastSeenBlockHeight_ = 0;
                onChanged();
                return this;
            }

            // optional int64 last_seen_block_time_secs = 14;
            private long lastSeenBlockTimeSecs_ ;
            /**
             * <code>optional int64 last_seen_block_time_secs = 14;</code>
             */
            public boolean hasLastSeenBlockTimeSecs() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional int64 last_seen_block_time_secs = 14;</code>
             */
            public long getLastSeenBlockTimeSecs() {
                return lastSeenBlockTimeSecs_;
            }
            /**
             * <code>optional int64 last_seen_block_time_secs = 14;</code>
             */
            public Builder setLastSeenBlockTimeSecs(long value) {
                bitField0_ |= 0x00000008;
                lastSeenBlockTimeSecs_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int64 last_seen_block_time_secs = 14;</code>
             */
            public Builder clearLastSeenBlockTimeSecs() {
                bitField0_ = (bitField0_ & ~0x00000008);
                lastSeenBlockTimeSecs_ = 0L;
                onChanged();
                return this;
            }

            // repeated .wallet.Key key = 3;
            private java.util.List<Protos.Key> key_ =
                    java.util.Collections.emptyList();
            private void ensureKeyIsMutable() {
                if (!((bitField0_ & 0x00000010) == 0x00000010)) {
                    key_ = new java.util.ArrayList<Protos.Key>(key_);
                    bitField0_ |= 0x00000010;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.Key, Protos.Key.Builder, Protos.KeyOrBuilder> keyBuilder_;

            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public java.util.List<Protos.Key> getKeyList() {
                if (keyBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(key_);
                } else {
                    return keyBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public int getKeyCount() {
                if (keyBuilder_ == null) {
                    return key_.size();
                } else {
                    return keyBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Protos.Key getKey(int index) {
                if (keyBuilder_ == null) {
                    return key_.get(index);
                } else {
                    return keyBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Builder setKey(
                    int index, Protos.Key value) {
                if (keyBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureKeyIsMutable();
                    key_.set(index, value);
                    onChanged();
                } else {
                    keyBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Builder setKey(
                    int index, Protos.Key.Builder builderForValue) {
                if (keyBuilder_ == null) {
                    ensureKeyIsMutable();
                    key_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    keyBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Builder addKey(Protos.Key value) {
                if (keyBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureKeyIsMutable();
                    key_.add(value);
                    onChanged();
                } else {
                    keyBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Builder addKey(
                    int index, Protos.Key value) {
                if (keyBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureKeyIsMutable();
                    key_.add(index, value);
                    onChanged();
                } else {
                    keyBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Builder addKey(
                    Protos.Key.Builder builderForValue) {
                if (keyBuilder_ == null) {
                    ensureKeyIsMutable();
                    key_.add(builderForValue.build());
                    onChanged();
                } else {
                    keyBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Builder addKey(
                    int index, Protos.Key.Builder builderForValue) {
                if (keyBuilder_ == null) {
                    ensureKeyIsMutable();
                    key_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    keyBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Builder addAllKey(
                    java.lang.Iterable<? extends Protos.Key> values) {
                if (keyBuilder_ == null) {
                    ensureKeyIsMutable();
                    super.addAll(values, key_);
                    onChanged();
                } else {
                    keyBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Builder clearKey() {
                if (keyBuilder_ == null) {
                    key_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000010);
                    onChanged();
                } else {
                    keyBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Builder removeKey(int index) {
                if (keyBuilder_ == null) {
                    ensureKeyIsMutable();
                    key_.remove(index);
                    onChanged();
                } else {
                    keyBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Protos.Key.Builder getKeyBuilder(
                    int index) {
                return getKeyFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Protos.KeyOrBuilder getKeyOrBuilder(
                    int index) {
                if (keyBuilder_ == null) {
                    return key_.get(index);  } else {
                    return keyBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public java.util.List<? extends Protos.KeyOrBuilder>
            getKeyOrBuilderList() {
                if (keyBuilder_ != null) {
                    return keyBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(key_);
                }
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Protos.Key.Builder addKeyBuilder() {
                return getKeyFieldBuilder().addBuilder(
                        Protos.Key.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public Protos.Key.Builder addKeyBuilder(
                    int index) {
                return getKeyFieldBuilder().addBuilder(
                        index, Protos.Key.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.Key key = 3;</code>
             */
            public java.util.List<Protos.Key.Builder>
            getKeyBuilderList() {
                return getKeyFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.Key, Protos.Key.Builder, Protos.KeyOrBuilder>
            getKeyFieldBuilder() {
                if (keyBuilder_ == null) {
                    keyBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            Protos.Key, Protos.Key.Builder, Protos.KeyOrBuilder>(
                            key_,
                            ((bitField0_ & 0x00000010) == 0x00000010),
                            getParentForChildren(),
                            isClean());
                    key_ = null;
                }
                return keyBuilder_;
            }

            // repeated .wallet.Transaction transaction = 4;
            private java.util.List<Protos.Transaction> transaction_ =
                    java.util.Collections.emptyList();
            private void ensureTransactionIsMutable() {
                if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                    transaction_ = new java.util.ArrayList<Protos.Transaction>(transaction_);
                    bitField0_ |= 0x00000020;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.Transaction, Protos.Transaction.Builder, Protos.TransactionOrBuilder> transactionBuilder_;

            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public java.util.List<Protos.Transaction> getTransactionList() {
                if (transactionBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(transaction_);
                } else {
                    return transactionBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public int getTransactionCount() {
                if (transactionBuilder_ == null) {
                    return transaction_.size();
                } else {
                    return transactionBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Protos.Transaction getTransaction(int index) {
                if (transactionBuilder_ == null) {
                    return transaction_.get(index);
                } else {
                    return transactionBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Builder setTransaction(
                    int index, Protos.Transaction value) {
                if (transactionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionIsMutable();
                    transaction_.set(index, value);
                    onChanged();
                } else {
                    transactionBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Builder setTransaction(
                    int index, Protos.Transaction.Builder builderForValue) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    transaction_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    transactionBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Builder addTransaction(Protos.Transaction value) {
                if (transactionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionIsMutable();
                    transaction_.add(value);
                    onChanged();
                } else {
                    transactionBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Builder addTransaction(
                    int index, Protos.Transaction value) {
                if (transactionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTransactionIsMutable();
                    transaction_.add(index, value);
                    onChanged();
                } else {
                    transactionBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Builder addTransaction(
                    Protos.Transaction.Builder builderForValue) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    transaction_.add(builderForValue.build());
                    onChanged();
                } else {
                    transactionBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Builder addTransaction(
                    int index, Protos.Transaction.Builder builderForValue) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    transaction_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    transactionBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Builder addAllTransaction(
                    java.lang.Iterable<? extends Protos.Transaction> values) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    super.addAll(values, transaction_);
                    onChanged();
                } else {
                    transactionBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Builder clearTransaction() {
                if (transactionBuilder_ == null) {
                    transaction_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000020);
                    onChanged();
                } else {
                    transactionBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Builder removeTransaction(int index) {
                if (transactionBuilder_ == null) {
                    ensureTransactionIsMutable();
                    transaction_.remove(index);
                    onChanged();
                } else {
                    transactionBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Protos.Transaction.Builder getTransactionBuilder(
                    int index) {
                return getTransactionFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Protos.TransactionOrBuilder getTransactionOrBuilder(
                    int index) {
                if (transactionBuilder_ == null) {
                    return transaction_.get(index);  } else {
                    return transactionBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public java.util.List<? extends Protos.TransactionOrBuilder>
            getTransactionOrBuilderList() {
                if (transactionBuilder_ != null) {
                    return transactionBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(transaction_);
                }
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Protos.Transaction.Builder addTransactionBuilder() {
                return getTransactionFieldBuilder().addBuilder(
                        Protos.Transaction.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public Protos.Transaction.Builder addTransactionBuilder(
                    int index) {
                return getTransactionFieldBuilder().addBuilder(
                        index, Protos.Transaction.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.Transaction transaction = 4;</code>
             */
            public java.util.List<Protos.Transaction.Builder>
            getTransactionBuilderList() {
                return getTransactionFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.Transaction, Protos.Transaction.Builder, Protos.TransactionOrBuilder>
            getTransactionFieldBuilder() {
                if (transactionBuilder_ == null) {
                    transactionBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            Protos.Transaction, Protos.Transaction.Builder, Protos.TransactionOrBuilder>(
                            transaction_,
                            ((bitField0_ & 0x00000020) == 0x00000020),
                            getParentForChildren(),
                            isClean());
                    transaction_ = null;
                }
                return transactionBuilder_;
            }

            // repeated .wallet.Script watched_script = 15;
            private java.util.List<Protos.Script> watchedScript_ =
                    java.util.Collections.emptyList();
            private void ensureWatchedScriptIsMutable() {
                if (!((bitField0_ & 0x00000040) == 0x00000040)) {
                    watchedScript_ = new java.util.ArrayList<Protos.Script>(watchedScript_);
                    bitField0_ |= 0x00000040;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.Script, Protos.Script.Builder, Protos.ScriptOrBuilder> watchedScriptBuilder_;

            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public java.util.List<Protos.Script> getWatchedScriptList() {
                if (watchedScriptBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(watchedScript_);
                } else {
                    return watchedScriptBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public int getWatchedScriptCount() {
                if (watchedScriptBuilder_ == null) {
                    return watchedScript_.size();
                } else {
                    return watchedScriptBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Protos.Script getWatchedScript(int index) {
                if (watchedScriptBuilder_ == null) {
                    return watchedScript_.get(index);
                } else {
                    return watchedScriptBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Builder setWatchedScript(
                    int index, Protos.Script value) {
                if (watchedScriptBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureWatchedScriptIsMutable();
                    watchedScript_.set(index, value);
                    onChanged();
                } else {
                    watchedScriptBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Builder setWatchedScript(
                    int index, Protos.Script.Builder builderForValue) {
                if (watchedScriptBuilder_ == null) {
                    ensureWatchedScriptIsMutable();
                    watchedScript_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    watchedScriptBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Builder addWatchedScript(Protos.Script value) {
                if (watchedScriptBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureWatchedScriptIsMutable();
                    watchedScript_.add(value);
                    onChanged();
                } else {
                    watchedScriptBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Builder addWatchedScript(
                    int index, Protos.Script value) {
                if (watchedScriptBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureWatchedScriptIsMutable();
                    watchedScript_.add(index, value);
                    onChanged();
                } else {
                    watchedScriptBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Builder addWatchedScript(
                    Protos.Script.Builder builderForValue) {
                if (watchedScriptBuilder_ == null) {
                    ensureWatchedScriptIsMutable();
                    watchedScript_.add(builderForValue.build());
                    onChanged();
                } else {
                    watchedScriptBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Builder addWatchedScript(
                    int index, Protos.Script.Builder builderForValue) {
                if (watchedScriptBuilder_ == null) {
                    ensureWatchedScriptIsMutable();
                    watchedScript_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    watchedScriptBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Builder addAllWatchedScript(
                    java.lang.Iterable<? extends Protos.Script> values) {
                if (watchedScriptBuilder_ == null) {
                    ensureWatchedScriptIsMutable();
                    super.addAll(values, watchedScript_);
                    onChanged();
                } else {
                    watchedScriptBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Builder clearWatchedScript() {
                if (watchedScriptBuilder_ == null) {
                    watchedScript_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000040);
                    onChanged();
                } else {
                    watchedScriptBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Builder removeWatchedScript(int index) {
                if (watchedScriptBuilder_ == null) {
                    ensureWatchedScriptIsMutable();
                    watchedScript_.remove(index);
                    onChanged();
                } else {
                    watchedScriptBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Protos.Script.Builder getWatchedScriptBuilder(
                    int index) {
                return getWatchedScriptFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Protos.ScriptOrBuilder getWatchedScriptOrBuilder(
                    int index) {
                if (watchedScriptBuilder_ == null) {
                    return watchedScript_.get(index);  } else {
                    return watchedScriptBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public java.util.List<? extends Protos.ScriptOrBuilder>
            getWatchedScriptOrBuilderList() {
                if (watchedScriptBuilder_ != null) {
                    return watchedScriptBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(watchedScript_);
                }
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Protos.Script.Builder addWatchedScriptBuilder() {
                return getWatchedScriptFieldBuilder().addBuilder(
                        Protos.Script.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public Protos.Script.Builder addWatchedScriptBuilder(
                    int index) {
                return getWatchedScriptFieldBuilder().addBuilder(
                        index, Protos.Script.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.Script watched_script = 15;</code>
             */
            public java.util.List<Protos.Script.Builder>
            getWatchedScriptBuilderList() {
                return getWatchedScriptFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.Script, Protos.Script.Builder, Protos.ScriptOrBuilder>
            getWatchedScriptFieldBuilder() {
                if (watchedScriptBuilder_ == null) {
                    watchedScriptBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            Protos.Script, Protos.Script.Builder, Protos.ScriptOrBuilder>(
                            watchedScript_,
                            ((bitField0_ & 0x00000040) == 0x00000040),
                            getParentForChildren(),
                            isClean());
                    watchedScript_ = null;
                }
                return watchedScriptBuilder_;
            }

            // optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];
            private Protos.Wallet.EncryptionType encryptionType_ = Protos.Wallet.EncryptionType.UNENCRYPTED;
            /**
             * <code>optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];</code>
             */
            public boolean hasEncryptionType() {
                return ((bitField0_ & 0x00000080) == 0x00000080);
            }
            /**
             * <code>optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];</code>
             */
            public Protos.Wallet.EncryptionType getEncryptionType() {
                return encryptionType_;
            }
            /**
             * <code>optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];</code>
             */
            public Builder setEncryptionType(Protos.Wallet.EncryptionType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000080;
                encryptionType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .wallet.Wallet.EncryptionType encryption_type = 5 [default = UNENCRYPTED];</code>
             */
            public Builder clearEncryptionType() {
                bitField0_ = (bitField0_ & ~0x00000080);
                encryptionType_ = Protos.Wallet.EncryptionType.UNENCRYPTED;
                onChanged();
                return this;
            }

            // optional .wallet.ScryptParameters encryption_parameters = 6;
            private Protos.ScryptParameters encryptionParameters_ = Protos.ScryptParameters.getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<
                    Protos.ScryptParameters, Protos.ScryptParameters.Builder, Protos.ScryptParametersOrBuilder> encryptionParametersBuilder_;
            /**
             * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
             */
            public boolean hasEncryptionParameters() {
                return ((bitField0_ & 0x00000100) == 0x00000100);
            }
            /**
             * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
             */
            public Protos.ScryptParameters getEncryptionParameters() {
                if (encryptionParametersBuilder_ == null) {
                    return encryptionParameters_;
                } else {
                    return encryptionParametersBuilder_.getMessage();
                }
            }
            /**
             * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
             */
            public Builder setEncryptionParameters(Protos.ScryptParameters value) {
                if (encryptionParametersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    encryptionParameters_ = value;
                    onChanged();
                } else {
                    encryptionParametersBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000100;
                return this;
            }
            /**
             * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
             */
            public Builder setEncryptionParameters(
                    Protos.ScryptParameters.Builder builderForValue) {
                if (encryptionParametersBuilder_ == null) {
                    encryptionParameters_ = builderForValue.build();
                    onChanged();
                } else {
                    encryptionParametersBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000100;
                return this;
            }
            /**
             * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
             */
            public Builder mergeEncryptionParameters(Protos.ScryptParameters value) {
                if (encryptionParametersBuilder_ == null) {
                    if (((bitField0_ & 0x00000100) == 0x00000100) &&
                            encryptionParameters_ != Protos.ScryptParameters.getDefaultInstance()) {
                        encryptionParameters_ =
                                Protos.ScryptParameters.newBuilder(encryptionParameters_).mergeFrom(value).buildPartial();
                    } else {
                        encryptionParameters_ = value;
                    }
                    onChanged();
                } else {
                    encryptionParametersBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000100;
                return this;
            }
            /**
             * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
             */
            public Builder clearEncryptionParameters() {
                if (encryptionParametersBuilder_ == null) {
                    encryptionParameters_ = Protos.ScryptParameters.getDefaultInstance();
                    onChanged();
                } else {
                    encryptionParametersBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000100);
                return this;
            }
            /**
             * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
             */
            public Protos.ScryptParameters.Builder getEncryptionParametersBuilder() {
                bitField0_ |= 0x00000100;
                onChanged();
                return getEncryptionParametersFieldBuilder().getBuilder();
            }
            /**
             * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
             */
            public Protos.ScryptParametersOrBuilder getEncryptionParametersOrBuilder() {
                if (encryptionParametersBuilder_ != null) {
                    return encryptionParametersBuilder_.getMessageOrBuilder();
                } else {
                    return encryptionParameters_;
                }
            }
            /**
             * <code>optional .wallet.ScryptParameters encryption_parameters = 6;</code>
             */
            private com.google.protobuf.SingleFieldBuilder<
                    Protos.ScryptParameters, Protos.ScryptParameters.Builder, Protos.ScryptParametersOrBuilder>
            getEncryptionParametersFieldBuilder() {
                if (encryptionParametersBuilder_ == null) {
                    encryptionParametersBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                            Protos.ScryptParameters, Protos.ScryptParameters.Builder, Protos.ScryptParametersOrBuilder>(
                            encryptionParameters_,
                            getParentForChildren(),
                            isClean());
                    encryptionParameters_ = null;
                }
                return encryptionParametersBuilder_;
            }

            // optional int32 version = 7;
            private int version_ ;
            /**
             * <code>optional int32 version = 7;</code>
             *
             * <pre>
             * The version number of the wallet - used to detect wallets that were produced in the future
             * (i.e the wallet may contain some future format this protobuf/ code does not know about)
             * </pre>
             */
            public boolean hasVersion() {
                return ((bitField0_ & 0x00000200) == 0x00000200);
            }
            /**
             * <code>optional int32 version = 7;</code>
             *
             * <pre>
             * The version number of the wallet - used to detect wallets that were produced in the future
             * (i.e the wallet may contain some future format this protobuf/ code does not know about)
             * </pre>
             */
            public int getVersion() {
                return version_;
            }
            /**
             * <code>optional int32 version = 7;</code>
             *
             * <pre>
             * The version number of the wallet - used to detect wallets that were produced in the future
             * (i.e the wallet may contain some future format this protobuf/ code does not know about)
             * </pre>
             */
            public Builder setVersion(int value) {
                bitField0_ |= 0x00000200;
                version_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 version = 7;</code>
             *
             * <pre>
             * The version number of the wallet - used to detect wallets that were produced in the future
             * (i.e the wallet may contain some future format this protobuf/ code does not know about)
             * </pre>
             */
            public Builder clearVersion() {
                bitField0_ = (bitField0_ & ~0x00000200);
                version_ = 0;
                onChanged();
                return this;
            }

            // repeated .wallet.Extension extension = 10;
            private java.util.List<Protos.Extension> extension_ =
                    java.util.Collections.emptyList();
            private void ensureExtensionIsMutable() {
                if (!((bitField0_ & 0x00000400) == 0x00000400)) {
                    extension_ = new java.util.ArrayList<Protos.Extension>(extension_);
                    bitField0_ |= 0x00000400;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.Extension, Protos.Extension.Builder, Protos.ExtensionOrBuilder> extensionBuilder_;

            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public java.util.List<Protos.Extension> getExtensionList() {
                if (extensionBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(extension_);
                } else {
                    return extensionBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public int getExtensionCount() {
                if (extensionBuilder_ == null) {
                    return extension_.size();
                } else {
                    return extensionBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Protos.Extension getExtension(int index) {
                if (extensionBuilder_ == null) {
                    return extension_.get(index);
                } else {
                    return extensionBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Builder setExtension(
                    int index, Protos.Extension value) {
                if (extensionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureExtensionIsMutable();
                    extension_.set(index, value);
                    onChanged();
                } else {
                    extensionBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Builder setExtension(
                    int index, Protos.Extension.Builder builderForValue) {
                if (extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    extension_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    extensionBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Builder addExtension(Protos.Extension value) {
                if (extensionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureExtensionIsMutable();
                    extension_.add(value);
                    onChanged();
                } else {
                    extensionBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Builder addExtension(
                    int index, Protos.Extension value) {
                if (extensionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureExtensionIsMutable();
                    extension_.add(index, value);
                    onChanged();
                } else {
                    extensionBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Builder addExtension(
                    Protos.Extension.Builder builderForValue) {
                if (extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    extension_.add(builderForValue.build());
                    onChanged();
                } else {
                    extensionBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Builder addExtension(
                    int index, Protos.Extension.Builder builderForValue) {
                if (extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    extension_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    extensionBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Builder addAllExtension(
                    java.lang.Iterable<? extends Protos.Extension> values) {
                if (extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    super.addAll(values, extension_);
                    onChanged();
                } else {
                    extensionBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Builder clearExtension() {
                if (extensionBuilder_ == null) {
                    extension_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000400);
                    onChanged();
                } else {
                    extensionBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Builder removeExtension(int index) {
                if (extensionBuilder_ == null) {
                    ensureExtensionIsMutable();
                    extension_.remove(index);
                    onChanged();
                } else {
                    extensionBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Protos.Extension.Builder getExtensionBuilder(
                    int index) {
                return getExtensionFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Protos.ExtensionOrBuilder getExtensionOrBuilder(
                    int index) {
                if (extensionBuilder_ == null) {
                    return extension_.get(index);  } else {
                    return extensionBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public java.util.List<? extends Protos.ExtensionOrBuilder>
            getExtensionOrBuilderList() {
                if (extensionBuilder_ != null) {
                    return extensionBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(extension_);
                }
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Protos.Extension.Builder addExtensionBuilder() {
                return getExtensionFieldBuilder().addBuilder(
                        Protos.Extension.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public Protos.Extension.Builder addExtensionBuilder(
                    int index) {
                return getExtensionFieldBuilder().addBuilder(
                        index, Protos.Extension.getDefaultInstance());
            }
            /**
             * <code>repeated .wallet.Extension extension = 10;</code>
             */
            public java.util.List<Protos.Extension.Builder>
            getExtensionBuilderList() {
                return getExtensionFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    Protos.Extension, Protos.Extension.Builder, Protos.ExtensionOrBuilder>
            getExtensionFieldBuilder() {
                if (extensionBuilder_ == null) {
                    extensionBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            Protos.Extension, Protos.Extension.Builder, Protos.ExtensionOrBuilder>(
                            extension_,
                            ((bitField0_ & 0x00000400) == 0x00000400),
                            getParentForChildren(),
                            isClean());
                    extension_ = null;
                }
                return extensionBuilder_;
            }

            // optional string description = 11;
            private java.lang.Object description_ = "";
            /**
             * <code>optional string description = 11;</code>
             *
             * <pre>
             * A UTF8 encoded text description of the wallet that is intended for end user provided text.
             * </pre>
             */
            public boolean hasDescription() {
                return ((bitField0_ & 0x00000800) == 0x00000800);
            }
            /**
             * <code>optional string description = 11;</code>
             *
             * <pre>
             * A UTF8 encoded text description of the wallet that is intended for end user provided text.
             * </pre>
             */
            public java.lang.String getDescription() {
                java.lang.Object ref = description_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    description_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string description = 11;</code>
             *
             * <pre>
             * A UTF8 encoded text description of the wallet that is intended for end user provided text.
             * </pre>
             */
            public com.google.protobuf.ByteString
            getDescriptionBytes() {
                java.lang.Object ref = description_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    description_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string description = 11;</code>
             *
             * <pre>
             * A UTF8 encoded text description of the wallet that is intended for end user provided text.
             * </pre>
             */
            public Builder setDescription(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000800;
                description_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string description = 11;</code>
             *
             * <pre>
             * A UTF8 encoded text description of the wallet that is intended for end user provided text.
             * </pre>
             */
            public Builder clearDescription() {
                bitField0_ = (bitField0_ & ~0x00000800);
                description_ = getDefaultInstance().getDescription();
                onChanged();
                return this;
            }
            /**
             * <code>optional string description = 11;</code>
             *
             * <pre>
             * A UTF8 encoded text description of the wallet that is intended for end user provided text.
             * </pre>
             */
            public Builder setDescriptionBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000800;
                description_ = value;
                onChanged();
                return this;
            }

            // optional uint64 key_rotation_time = 13;
            private long keyRotationTime_ ;
            /**
             * <code>optional uint64 key_rotation_time = 13;</code>
             *
             * <pre>
             * UNIX time in seconds since the epoch. If set, then any keys created before this date are assumed to be no longer
             * wanted. Money sent to them will be re-spent automatically to the first key that was created after this time. It
             * can be used to recover a compromised wallet, or just as part of preventative defence-in-depth measures.
             * </pre>
             */
            public boolean hasKeyRotationTime() {
                return ((bitField0_ & 0x00001000) == 0x00001000);
            }
            /**
             * <code>optional uint64 key_rotation_time = 13;</code>
             *
             * <pre>
             * UNIX time in seconds since the epoch. If set, then any keys created before this date are assumed to be no longer
             * wanted. Money sent to them will be re-spent automatically to the first key that was created after this time. It
             * can be used to recover a compromised wallet, or just as part of preventative defence-in-depth measures.
             * </pre>
             */
            public long getKeyRotationTime() {
                return keyRotationTime_;
            }
            /**
             * <code>optional uint64 key_rotation_time = 13;</code>
             *
             * <pre>
             * UNIX time in seconds since the epoch. If set, then any keys created before this date are assumed to be no longer
             * wanted. Money sent to them will be re-spent automatically to the first key that was created after this time. It
             * can be used to recover a compromised wallet, or just as part of preventative defence-in-depth measures.
             * </pre>
             */
            public Builder setKeyRotationTime(long value) {
                bitField0_ |= 0x00001000;
                keyRotationTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 key_rotation_time = 13;</code>
             *
             * <pre>
             * UNIX time in seconds since the epoch. If set, then any keys created before this date are assumed to be no longer
             * wanted. Money sent to them will be re-spent automatically to the first key that was created after this time. It
             * can be used to recover a compromised wallet, or just as part of preventative defence-in-depth measures.
             * </pre>
             */
            public Builder clearKeyRotationTime() {
                bitField0_ = (bitField0_ & ~0x00001000);
                keyRotationTime_ = 0L;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:wallet.Wallet)
        }

        static {
            defaultInstance = new Wallet(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:wallet.Wallet)
    }

    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_PeerAddress_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_PeerAddress_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_EncryptedPrivateKey_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_EncryptedPrivateKey_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_Key_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_Key_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_Script_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_Script_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_TransactionInput_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_TransactionInput_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_TransactionOutput_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_TransactionOutput_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_TransactionConfidence_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_TransactionConfidence_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_Transaction_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_Transaction_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_ScryptParameters_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_ScryptParameters_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_Extension_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_Extension_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_wallet_Wallet_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_wallet_Wallet_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\014kobocoin.proto\022\006wallet\"A\n\013PeerAddress\022\022\n" +
                        "\nip_address\030\001 \002(\014\022\014\n\004port\030\002 \002(\r\022\020\n\010servi" +
                        "ces\030\003 \002(\004\"S\n\023EncryptedPrivateKey\022\035\n\025init" +
                        "ialisation_vector\030\001 \002(\014\022\035\n\025encrypted_pri" +
                        "vate_key\030\002 \002(\014\"\345\001\n\003Key\022\036\n\004type\030\001 \002(\0162\020.w" +
                        "allet.Key.Type\022\023\n\013private_key\030\002 \001(\014\022:\n\025e" +
                        "ncrypted_private_key\030\006 \001(\0132\033.wallet.Encr" +
                        "yptedPrivateKey\022\022\n\npublic_key\030\003 \001(\014\022\r\n\005l" +
                        "abel\030\004 \001(\t\022\032\n\022creation_timestamp\030\005 \001(\003\"." +
                        "\n\004Type\022\014\n\010ORIGINAL\020\001\022\030\n\024ENCRYPTED_SCRYPT",
                "_AES\020\002\"5\n\006Script\022\017\n\007program\030\001 \002(\014\022\032\n\022cre" +
                        "ation_timestamp\030\002 \002(\003\"\203\001\n\020TransactionInp" +
                        "ut\022\"\n\032transaction_out_point_hash\030\001 \002(\014\022#" +
                        "\n\033transaction_out_point_index\030\002 \002(\r\022\024\n\014s" +
                        "cript_bytes\030\003 \002(\014\022\020\n\010sequence\030\004 \001(\r\"\177\n\021T" +
                        "ransactionOutput\022\r\n\005value\030\001 \002(\003\022\024\n\014scrip" +
                        "t_bytes\030\002 \002(\014\022!\n\031spent_by_transaction_ha" +
                        "sh\030\003 \001(\014\022\"\n\032spent_by_transaction_index\030\004" +
                        " \001(\005\"\234\003\n\025TransactionConfidence\0220\n\004type\030\001" +
                        " \001(\0162\".wallet.TransactionConfidence.Type",
                "\022\032\n\022appeared_at_height\030\002 \001(\005\022\036\n\026overridi" +
                        "ng_transaction\030\003 \001(\014\022\r\n\005depth\030\004 \001(\005\022\021\n\tw" +
                        "ork_done\030\005 \001(\003\022)\n\014broadcast_by\030\006 \003(\0132\023.w" +
                        "allet.PeerAddress\0224\n\006source\030\007 \001(\0162$.wall" +
                        "et.TransactionConfidence.Source\"O\n\004Type\022" +
                        "\013\n\007UNKNOWN\020\000\022\014\n\010BUILDING\020\001\022\013\n\007PENDING\020\002\022" +
                        "\025\n\021NOT_IN_BEST_CHAIN\020\003\022\010\n\004DEAD\020\004\"A\n\006Sour" +
                        "ce\022\022\n\016SOURCE_UNKNOWN\020\000\022\022\n\016SOURCE_NETWORK" +
                        "\020\001\022\017\n\013SOURCE_SELF\020\002\"\254\004\n\013Transaction\022\017\n\007v" +
                        "ersion\030\001 \002(\005\022\014\n\004time\030\014 \002(\003\022\014\n\004hash\030\002 \002(\014",
                "\022&\n\004pool\030\003 \001(\0162\030.wallet.Transaction.Pool" +
                        "\022\021\n\tlock_time\030\004 \001(\r\022\022\n\nupdated_at\030\005 \001(\003\022" +
                        "3\n\021transaction_input\030\006 \003(\0132\030.wallet.Tran" +
                        "sactionInput\0225\n\022transaction_output\030\007 \003(\013" +
                        "2\031.wallet.TransactionOutput\022\022\n\nblock_has" +
                        "h\030\010 \003(\014\022 \n\030block_relativity_offsets\030\013 \003(" +
                        "\005\0221\n\nconfidence\030\t \001(\0132\035.wallet.Transacti" +
                        "onConfidence\0225\n\007purpose\030\n \001(\0162\033.wallet.T" +
                        "ransaction.Purpose:\007UNKNOWN\"Y\n\004Pool\022\013\n\007U" +
                        "NSPENT\020\004\022\t\n\005SPENT\020\005\022\014\n\010INACTIVE\020\002\022\010\n\004DEA",
                "D\020\n\022\013\n\007PENDING\020\020\022\024\n\020PENDING_INACTIVE\020\022\":" +
                        "\n\007Purpose\022\013\n\007UNKNOWN\020\000\022\020\n\014USER_PAYMENT\020\001" +
                        "\022\020\n\014KEY_ROTATION\020\002\"N\n\020ScryptParameters\022\014" +
                        "\n\004salt\030\001 \002(\014\022\020\n\001n\030\002 \001(\003:\00516384\022\014\n\001r\030\003 \001(" +
                        "\005:\0018\022\014\n\001p\030\004 \001(\005:\0011\"8\n\tExtension\022\n\n\002id\030\001 " +
                        "\002(\t\022\014\n\004data\030\002 \002(\014\022\021\n\tmandatory\030\003 \002(\010\"\223\004\n" +
                        "\006Wallet\022\032\n\022network_identifier\030\001 \002(\t\022\034\n\024l" +
                        "ast_seen_block_hash\030\002 \001(\014\022\036\n\026last_seen_b" +
                        "lock_height\030\014 \001(\r\022!\n\031last_seen_block_tim" +
                        "e_secs\030\016 \001(\003\022\030\n\003key\030\003 \003(\0132\013.wallet.Key\022(",
                "\n\013transaction\030\004 \003(\0132\023.wallet.Transaction" +
                        "\022&\n\016watched_script\030\017 \003(\0132\016.wallet.Script" +
                        "\022C\n\017encryption_type\030\005 \001(\0162\035.wallet.Walle" +
                        "t.EncryptionType:\013UNENCRYPTED\0227\n\025encrypt" +
                        "ion_parameters\030\006 \001(\0132\030.wallet.ScryptPara" +
                        "meters\022\017\n\007version\030\007 \001(\005\022$\n\textension\030\n \003" +
                        "(\0132\021.wallet.Extension\022\023\n\013description\030\013 \001" +
                        "(\t\022\031\n\021key_rotation_time\030\r \001(\004\";\n\016Encrypt" +
                        "ionType\022\017\n\013UNENCRYPTED\020\001\022\030\n\024ENCRYPTED_SC" +
                        "RYPT_AES\020\002B\034\n\022org.kobocoinj.walletB\006Protos"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_wallet_PeerAddress_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_wallet_PeerAddress_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_PeerAddress_descriptor,
                                new java.lang.String[] { "IpAddress", "Port", "Services", });
                        internal_static_wallet_EncryptedPrivateKey_descriptor =
                                getDescriptor().getMessageTypes().get(1);
                        internal_static_wallet_EncryptedPrivateKey_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_EncryptedPrivateKey_descriptor,
                                new java.lang.String[] { "InitialisationVector", "EncryptedPrivateKey", });
                        internal_static_wallet_Key_descriptor =
                                getDescriptor().getMessageTypes().get(2);
                        internal_static_wallet_Key_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_Key_descriptor,
                                new java.lang.String[] { "Type", "PrivateKey", "EncryptedPrivateKey", "PublicKey", "Label", "CreationTimestamp", });
                        internal_static_wallet_Script_descriptor =
                                getDescriptor().getMessageTypes().get(3);
                        internal_static_wallet_Script_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_Script_descriptor,
                                new java.lang.String[] { "Program", "CreationTimestamp", });
                        internal_static_wallet_TransactionInput_descriptor =
                                getDescriptor().getMessageTypes().get(4);
                        internal_static_wallet_TransactionInput_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_TransactionInput_descriptor,
                                new java.lang.String[] { "TransactionOutPointHash", "TransactionOutPointIndex", "ScriptBytes", "Sequence", });
                        internal_static_wallet_TransactionOutput_descriptor =
                                getDescriptor().getMessageTypes().get(5);
                        internal_static_wallet_TransactionOutput_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_TransactionOutput_descriptor,
                                new java.lang.String[] { "Value", "ScriptBytes", "SpentByTransactionHash", "SpentByTransactionIndex", });
                        internal_static_wallet_TransactionConfidence_descriptor =
                                getDescriptor().getMessageTypes().get(6);
                        internal_static_wallet_TransactionConfidence_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_TransactionConfidence_descriptor,
                                new java.lang.String[] { "Type", "AppearedAtHeight", "OverridingTransaction", "Depth", "WorkDone", "BroadcastBy", "Source", });
                        internal_static_wallet_Transaction_descriptor =
                                getDescriptor().getMessageTypes().get(7);
                        internal_static_wallet_Transaction_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_Transaction_descriptor,
                                new java.lang.String[] { "Version", "Time", "Hash", "Pool", "LockTime", "UpdatedAt", "TransactionInput", "TransactionOutput", "BlockHash", "BlockRelativityOffsets", "Confidence", "Purpose", });
                        internal_static_wallet_ScryptParameters_descriptor =
                                getDescriptor().getMessageTypes().get(8);
                        internal_static_wallet_ScryptParameters_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_ScryptParameters_descriptor,
                                new java.lang.String[] { "Salt", "N", "R", "P", });
                        internal_static_wallet_Extension_descriptor =
                                getDescriptor().getMessageTypes().get(9);
                        internal_static_wallet_Extension_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_Extension_descriptor,
                                new java.lang.String[] { "Id", "Data", "Mandatory", });
                        internal_static_wallet_Wallet_descriptor =
                                getDescriptor().getMessageTypes().get(10);
                        internal_static_wallet_Wallet_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_wallet_Wallet_descriptor,
                                new java.lang.String[] { "NetworkIdentifier", "LastSeenBlockHash", "LastSeenBlockHeight", "LastSeenBlockTimeSecs", "Key", "Transaction", "WatchedScript", "EncryptionType", "EncryptionParameters", "Version", "Extension", "Description", "KeyRotationTime", });
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}