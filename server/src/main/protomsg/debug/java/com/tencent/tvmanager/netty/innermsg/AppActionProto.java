// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AppAction.proto

package com.tencent.tvmanager.netty.innermsg;

public final class AppActionProto {
  private AppActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AppActionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AppAction)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string messageId = 1;</code>
     *
     * <pre>
     *消息id
     * </pre>
     */
    boolean hasMessageId();
    /**
     * <code>required string messageId = 1;</code>
     *
     * <pre>
     *消息id
     * </pre>
     */
    java.lang.String getMessageId();
    /**
     * <code>required string messageId = 1;</code>
     *
     * <pre>
     *消息id
     * </pre>
     */
    com.google.protobuf.ByteString
        getMessageIdBytes();

    /**
     * <code>required string packageName = 2;</code>
     */
    boolean hasPackageName();
    /**
     * <code>required string packageName = 2;</code>
     */
    java.lang.String getPackageName();
    /**
     * <code>required string packageName = 2;</code>
     */
    com.google.protobuf.ByteString
        getPackageNameBytes();

    /**
     * <code>optional string appName = 3;</code>
     */
    boolean hasAppName();
    /**
     * <code>optional string appName = 3;</code>
     */
    java.lang.String getAppName();
    /**
     * <code>optional string appName = 3;</code>
     */
    com.google.protobuf.ByteString
        getAppNameBytes();

    /**
     * <code>optional int32 versionCode = 4;</code>
     */
    boolean hasVersionCode();
    /**
     * <code>optional int32 versionCode = 4;</code>
     */
    int getVersionCode();

    /**
     * <code>optional string versionName = 5;</code>
     */
    boolean hasVersionName();
    /**
     * <code>optional string versionName = 5;</code>
     */
    java.lang.String getVersionName();
    /**
     * <code>optional string versionName = 5;</code>
     */
    com.google.protobuf.ByteString
        getVersionNameBytes();

    /**
     * <code>optional bool isSystem = 6;</code>
     */
    boolean hasIsSystem();
    /**
     * <code>optional bool isSystem = 6;</code>
     */
    boolean getIsSystem();
  }
  /**
   * Protobuf type {@code AppAction}
   */
  public static final class AppAction extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AppAction)
      AppActionOrBuilder {
    // Use AppAction.newBuilder() to construct.
    private AppAction(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AppAction(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AppAction defaultInstance;
    public static AppAction getDefaultInstance() {
      return defaultInstance;
    }

    public AppAction getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AppAction(
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              messageId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              packageName_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              appName_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              versionCode_ = input.readInt32();
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              versionName_ = bs;
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              isSystem_ = input.readBool();
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
      return com.tencent.tvmanager.netty.innermsg.AppActionProto.internal_static_AppAction_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.tvmanager.netty.innermsg.AppActionProto.internal_static_AppAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction.class, com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction.Builder.class);
    }

    public static com.google.protobuf.Parser<AppAction> PARSER =
        new com.google.protobuf.AbstractParser<AppAction>() {
      public AppAction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AppAction(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AppAction> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int MESSAGEID_FIELD_NUMBER = 1;
    private java.lang.Object messageId_;
    /**
     * <code>required string messageId = 1;</code>
     *
     * <pre>
     *消息id
     * </pre>
     */
    public boolean hasMessageId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string messageId = 1;</code>
     *
     * <pre>
     *消息id
     * </pre>
     */
    public java.lang.String getMessageId() {
      java.lang.Object ref = messageId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          messageId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string messageId = 1;</code>
     *
     * <pre>
     *消息id
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMessageIdBytes() {
      java.lang.Object ref = messageId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PACKAGENAME_FIELD_NUMBER = 2;
    private java.lang.Object packageName_;
    /**
     * <code>required string packageName = 2;</code>
     */
    public boolean hasPackageName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string packageName = 2;</code>
     */
    public java.lang.String getPackageName() {
      java.lang.Object ref = packageName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          packageName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string packageName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPackageNameBytes() {
      java.lang.Object ref = packageName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        packageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int APPNAME_FIELD_NUMBER = 3;
    private java.lang.Object appName_;
    /**
     * <code>optional string appName = 3;</code>
     */
    public boolean hasAppName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string appName = 3;</code>
     */
    public java.lang.String getAppName() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          appName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string appName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAppNameBytes() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VERSIONCODE_FIELD_NUMBER = 4;
    private int versionCode_;
    /**
     * <code>optional int32 versionCode = 4;</code>
     */
    public boolean hasVersionCode() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 versionCode = 4;</code>
     */
    public int getVersionCode() {
      return versionCode_;
    }

    public static final int VERSIONNAME_FIELD_NUMBER = 5;
    private java.lang.Object versionName_;
    /**
     * <code>optional string versionName = 5;</code>
     */
    public boolean hasVersionName() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string versionName = 5;</code>
     */
    public java.lang.String getVersionName() {
      java.lang.Object ref = versionName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          versionName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string versionName = 5;</code>
     */
    public com.google.protobuf.ByteString
        getVersionNameBytes() {
      java.lang.Object ref = versionName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        versionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ISSYSTEM_FIELD_NUMBER = 6;
    private boolean isSystem_;
    /**
     * <code>optional bool isSystem = 6;</code>
     */
    public boolean hasIsSystem() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool isSystem = 6;</code>
     */
    public boolean getIsSystem() {
      return isSystem_;
    }

    private void initFields() {
      messageId_ = "";
      packageName_ = "";
      appName_ = "";
      versionCode_ = 0;
      versionName_ = "";
      isSystem_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMessageId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPackageName()) {
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
        output.writeBytes(1, getMessageIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPackageNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getAppNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, versionCode_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getVersionNameBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(6, isSystem_);
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
          .computeBytesSize(1, getMessageIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPackageNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getAppNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, versionCode_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getVersionNameBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isSystem_);
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

    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction prototype) {
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
     * Protobuf type {@code AppAction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AppAction)
        com.tencent.tvmanager.netty.innermsg.AppActionProto.AppActionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.tencent.tvmanager.netty.innermsg.AppActionProto.internal_static_AppAction_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.tencent.tvmanager.netty.innermsg.AppActionProto.internal_static_AppAction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction.class, com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction.Builder.class);
      }

      // Construct using com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction.newBuilder()
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
        messageId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        packageName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        appName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        versionCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        versionName_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        isSystem_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.tencent.tvmanager.netty.innermsg.AppActionProto.internal_static_AppAction_descriptor;
      }

      public com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction getDefaultInstanceForType() {
        return com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction.getDefaultInstance();
      }

      public com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction build() {
        com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction buildPartial() {
        com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction result = new com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.messageId_ = messageId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.packageName_ = packageName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.appName_ = appName_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.versionCode_ = versionCode_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.versionName_ = versionName_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.isSystem_ = isSystem_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction) {
          return mergeFrom((com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction other) {
        if (other == com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction.getDefaultInstance()) return this;
        if (other.hasMessageId()) {
          bitField0_ |= 0x00000001;
          messageId_ = other.messageId_;
          onChanged();
        }
        if (other.hasPackageName()) {
          bitField0_ |= 0x00000002;
          packageName_ = other.packageName_;
          onChanged();
        }
        if (other.hasAppName()) {
          bitField0_ |= 0x00000004;
          appName_ = other.appName_;
          onChanged();
        }
        if (other.hasVersionCode()) {
          setVersionCode(other.getVersionCode());
        }
        if (other.hasVersionName()) {
          bitField0_ |= 0x00000010;
          versionName_ = other.versionName_;
          onChanged();
        }
        if (other.hasIsSystem()) {
          setIsSystem(other.getIsSystem());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMessageId()) {
          
          return false;
        }
        if (!hasPackageName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.tencent.tvmanager.netty.innermsg.AppActionProto.AppAction) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object messageId_ = "";
      /**
       * <code>required string messageId = 1;</code>
       *
       * <pre>
       *消息id
       * </pre>
       */
      public boolean hasMessageId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string messageId = 1;</code>
       *
       * <pre>
       *消息id
       * </pre>
       */
      public java.lang.String getMessageId() {
        java.lang.Object ref = messageId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            messageId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string messageId = 1;</code>
       *
       * <pre>
       *消息id
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMessageIdBytes() {
        java.lang.Object ref = messageId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          messageId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string messageId = 1;</code>
       *
       * <pre>
       *消息id
       * </pre>
       */
      public Builder setMessageId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        messageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string messageId = 1;</code>
       *
       * <pre>
       *消息id
       * </pre>
       */
      public Builder clearMessageId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        messageId_ = getDefaultInstance().getMessageId();
        onChanged();
        return this;
      }
      /**
       * <code>required string messageId = 1;</code>
       *
       * <pre>
       *消息id
       * </pre>
       */
      public Builder setMessageIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        messageId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object packageName_ = "";
      /**
       * <code>required string packageName = 2;</code>
       */
      public boolean hasPackageName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string packageName = 2;</code>
       */
      public java.lang.String getPackageName() {
        java.lang.Object ref = packageName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            packageName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string packageName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPackageNameBytes() {
        java.lang.Object ref = packageName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          packageName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string packageName = 2;</code>
       */
      public Builder setPackageName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        packageName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string packageName = 2;</code>
       */
      public Builder clearPackageName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        packageName_ = getDefaultInstance().getPackageName();
        onChanged();
        return this;
      }
      /**
       * <code>required string packageName = 2;</code>
       */
      public Builder setPackageNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        packageName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object appName_ = "";
      /**
       * <code>optional string appName = 3;</code>
       */
      public boolean hasAppName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string appName = 3;</code>
       */
      public java.lang.String getAppName() {
        java.lang.Object ref = appName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            appName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string appName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getAppNameBytes() {
        java.lang.Object ref = appName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string appName = 3;</code>
       */
      public Builder setAppName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        appName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string appName = 3;</code>
       */
      public Builder clearAppName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        appName_ = getDefaultInstance().getAppName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string appName = 3;</code>
       */
      public Builder setAppNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        appName_ = value;
        onChanged();
        return this;
      }

      private int versionCode_ ;
      /**
       * <code>optional int32 versionCode = 4;</code>
       */
      public boolean hasVersionCode() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 versionCode = 4;</code>
       */
      public int getVersionCode() {
        return versionCode_;
      }
      /**
       * <code>optional int32 versionCode = 4;</code>
       */
      public Builder setVersionCode(int value) {
        bitField0_ |= 0x00000008;
        versionCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 versionCode = 4;</code>
       */
      public Builder clearVersionCode() {
        bitField0_ = (bitField0_ & ~0x00000008);
        versionCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object versionName_ = "";
      /**
       * <code>optional string versionName = 5;</code>
       */
      public boolean hasVersionName() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string versionName = 5;</code>
       */
      public java.lang.String getVersionName() {
        java.lang.Object ref = versionName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            versionName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string versionName = 5;</code>
       */
      public com.google.protobuf.ByteString
          getVersionNameBytes() {
        java.lang.Object ref = versionName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          versionName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string versionName = 5;</code>
       */
      public Builder setVersionName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        versionName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string versionName = 5;</code>
       */
      public Builder clearVersionName() {
        bitField0_ = (bitField0_ & ~0x00000010);
        versionName_ = getDefaultInstance().getVersionName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string versionName = 5;</code>
       */
      public Builder setVersionNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        versionName_ = value;
        onChanged();
        return this;
      }

      private boolean isSystem_ ;
      /**
       * <code>optional bool isSystem = 6;</code>
       */
      public boolean hasIsSystem() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bool isSystem = 6;</code>
       */
      public boolean getIsSystem() {
        return isSystem_;
      }
      /**
       * <code>optional bool isSystem = 6;</code>
       */
      public Builder setIsSystem(boolean value) {
        bitField0_ |= 0x00000020;
        isSystem_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isSystem = 6;</code>
       */
      public Builder clearIsSystem() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isSystem_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:AppAction)
    }

    static {
      defaultInstance = new AppAction(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:AppAction)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AppAction_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AppAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017AppAction.proto\"\200\001\n\tAppAction\022\021\n\tmessa" +
      "geId\030\001 \002(\t\022\023\n\013packageName\030\002 \002(\t\022\017\n\007appNa" +
      "me\030\003 \001(\t\022\023\n\013versionCode\030\004 \001(\005\022\023\n\013version" +
      "Name\030\005 \001(\t\022\020\n\010isSystem\030\006 \001(\010B6\n$com.tenc" +
      "ent.tvmanager.netty.innermsgB\016AppActionP" +
      "roto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_AppAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AppAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AppAction_descriptor,
        new java.lang.String[] { "MessageId", "PackageName", "AppName", "VersionCode", "VersionName", "IsSystem", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}