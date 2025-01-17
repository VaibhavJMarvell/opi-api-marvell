// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.CreateNVMeSubsystemRequest}
 */
public final class CreateNVMeSubsystemRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateNVMeSubsystemRequest)
    CreateNVMeSubsystemRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNVMeSubsystemRequest.newBuilder() to construct.
  private CreateNVMeSubsystemRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNVMeSubsystemRequest() {
    parent_ = "";
    nvMeSubsystemId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNVMeSubsystemRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateNVMeSubsystemRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            opi_api.storage.v1.NVMeSubsystem.Builder subBuilder = null;
            if (nvMeSubsystem_ != null) {
              subBuilder = nvMeSubsystem_.toBuilder();
            }
            nvMeSubsystem_ = input.readMessage(opi_api.storage.v1.NVMeSubsystem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nvMeSubsystem_);
              nvMeSubsystem_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nvMeSubsystemId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateNVMeSubsystemRequest.class, opi_api.storage.v1.CreateNVMeSubsystemRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NV_ME_SUBSYSTEM_FIELD_NUMBER = 2;
  private opi_api.storage.v1.NVMeSubsystem nvMeSubsystem_;
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvMeSubsystem field is set.
   */
  @java.lang.Override
  public boolean hasNvMeSubsystem() {
    return nvMeSubsystem_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvMeSubsystem.
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeSubsystem getNvMeSubsystem() {
    return nvMeSubsystem_ == null ? opi_api.storage.v1.NVMeSubsystem.getDefaultInstance() : nvMeSubsystem_;
  }
  /**
   * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NVMeSubsystemOrBuilder getNvMeSubsystemOrBuilder() {
    return getNvMeSubsystem();
  }

  public static final int NV_ME_SUBSYSTEM_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object nvMeSubsystemId_;
  /**
   * <code>string nv_me_subsystem_id = 3;</code>
   * @return The nvMeSubsystemId.
   */
  @java.lang.Override
  public java.lang.String getNvMeSubsystemId() {
    java.lang.Object ref = nvMeSubsystemId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nvMeSubsystemId_ = s;
      return s;
    }
  }
  /**
   * <code>string nv_me_subsystem_id = 3;</code>
   * @return The bytes for nvMeSubsystemId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNvMeSubsystemIdBytes() {
    java.lang.Object ref = nvMeSubsystemId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nvMeSubsystemId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (nvMeSubsystem_ != null) {
      output.writeMessage(2, getNvMeSubsystem());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvMeSubsystemId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nvMeSubsystemId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (nvMeSubsystem_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNvMeSubsystem());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvMeSubsystemId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nvMeSubsystemId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.CreateNVMeSubsystemRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateNVMeSubsystemRequest other = (opi_api.storage.v1.CreateNVMeSubsystemRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasNvMeSubsystem() != other.hasNvMeSubsystem()) return false;
    if (hasNvMeSubsystem()) {
      if (!getNvMeSubsystem()
          .equals(other.getNvMeSubsystem())) return false;
    }
    if (!getNvMeSubsystemId()
        .equals(other.getNvMeSubsystemId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasNvMeSubsystem()) {
      hash = (37 * hash) + NV_ME_SUBSYSTEM_FIELD_NUMBER;
      hash = (53 * hash) + getNvMeSubsystem().hashCode();
    }
    hash = (37 * hash) + NV_ME_SUBSYSTEM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNvMeSubsystemId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNVMeSubsystemRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.CreateNVMeSubsystemRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code opi_api.storage.v1.CreateNVMeSubsystemRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateNVMeSubsystemRequest)
      opi_api.storage.v1.CreateNVMeSubsystemRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateNVMeSubsystemRequest.class, opi_api.storage.v1.CreateNVMeSubsystemRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateNVMeSubsystemRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (nvMeSubsystemBuilder_ == null) {
        nvMeSubsystem_ = null;
      } else {
        nvMeSubsystem_ = null;
        nvMeSubsystemBuilder_ = null;
      }
      nvMeSubsystemId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNVMeSubsystemRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMeSubsystemRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateNVMeSubsystemRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMeSubsystemRequest build() {
      opi_api.storage.v1.CreateNVMeSubsystemRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNVMeSubsystemRequest buildPartial() {
      opi_api.storage.v1.CreateNVMeSubsystemRequest result = new opi_api.storage.v1.CreateNVMeSubsystemRequest(this);
      result.parent_ = parent_;
      if (nvMeSubsystemBuilder_ == null) {
        result.nvMeSubsystem_ = nvMeSubsystem_;
      } else {
        result.nvMeSubsystem_ = nvMeSubsystemBuilder_.build();
      }
      result.nvMeSubsystemId_ = nvMeSubsystemId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.CreateNVMeSubsystemRequest) {
        return mergeFrom((opi_api.storage.v1.CreateNVMeSubsystemRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateNVMeSubsystemRequest other) {
      if (other == opi_api.storage.v1.CreateNVMeSubsystemRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasNvMeSubsystem()) {
        mergeNvMeSubsystem(other.getNvMeSubsystem());
      }
      if (!other.getNvMeSubsystemId().isEmpty()) {
        nvMeSubsystemId_ = other.nvMeSubsystemId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.CreateNVMeSubsystemRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateNVMeSubsystemRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private opi_api.storage.v1.NVMeSubsystem nvMeSubsystem_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeSubsystem, opi_api.storage.v1.NVMeSubsystem.Builder, opi_api.storage.v1.NVMeSubsystemOrBuilder> nvMeSubsystemBuilder_;
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the nvMeSubsystem field is set.
     */
    public boolean hasNvMeSubsystem() {
      return nvMeSubsystemBuilder_ != null || nvMeSubsystem_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nvMeSubsystem.
     */
    public opi_api.storage.v1.NVMeSubsystem getNvMeSubsystem() {
      if (nvMeSubsystemBuilder_ == null) {
        return nvMeSubsystem_ == null ? opi_api.storage.v1.NVMeSubsystem.getDefaultInstance() : nvMeSubsystem_;
      } else {
        return nvMeSubsystemBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvMeSubsystem(opi_api.storage.v1.NVMeSubsystem value) {
      if (nvMeSubsystemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nvMeSubsystem_ = value;
        onChanged();
      } else {
        nvMeSubsystemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvMeSubsystem(
        opi_api.storage.v1.NVMeSubsystem.Builder builderForValue) {
      if (nvMeSubsystemBuilder_ == null) {
        nvMeSubsystem_ = builderForValue.build();
        onChanged();
      } else {
        nvMeSubsystemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNvMeSubsystem(opi_api.storage.v1.NVMeSubsystem value) {
      if (nvMeSubsystemBuilder_ == null) {
        if (nvMeSubsystem_ != null) {
          nvMeSubsystem_ =
            opi_api.storage.v1.NVMeSubsystem.newBuilder(nvMeSubsystem_).mergeFrom(value).buildPartial();
        } else {
          nvMeSubsystem_ = value;
        }
        onChanged();
      } else {
        nvMeSubsystemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNvMeSubsystem() {
      if (nvMeSubsystemBuilder_ == null) {
        nvMeSubsystem_ = null;
        onChanged();
      } else {
        nvMeSubsystem_ = null;
        nvMeSubsystemBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NVMeSubsystem.Builder getNvMeSubsystemBuilder() {
      
      onChanged();
      return getNvMeSubsystemFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NVMeSubsystemOrBuilder getNvMeSubsystemOrBuilder() {
      if (nvMeSubsystemBuilder_ != null) {
        return nvMeSubsystemBuilder_.getMessageOrBuilder();
      } else {
        return nvMeSubsystem_ == null ?
            opi_api.storage.v1.NVMeSubsystem.getDefaultInstance() : nvMeSubsystem_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.NVMeSubsystem nv_me_subsystem = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NVMeSubsystem, opi_api.storage.v1.NVMeSubsystem.Builder, opi_api.storage.v1.NVMeSubsystemOrBuilder> 
        getNvMeSubsystemFieldBuilder() {
      if (nvMeSubsystemBuilder_ == null) {
        nvMeSubsystemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NVMeSubsystem, opi_api.storage.v1.NVMeSubsystem.Builder, opi_api.storage.v1.NVMeSubsystemOrBuilder>(
                getNvMeSubsystem(),
                getParentForChildren(),
                isClean());
        nvMeSubsystem_ = null;
      }
      return nvMeSubsystemBuilder_;
    }

    private java.lang.Object nvMeSubsystemId_ = "";
    /**
     * <code>string nv_me_subsystem_id = 3;</code>
     * @return The nvMeSubsystemId.
     */
    public java.lang.String getNvMeSubsystemId() {
      java.lang.Object ref = nvMeSubsystemId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nvMeSubsystemId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nv_me_subsystem_id = 3;</code>
     * @return The bytes for nvMeSubsystemId.
     */
    public com.google.protobuf.ByteString
        getNvMeSubsystemIdBytes() {
      java.lang.Object ref = nvMeSubsystemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nvMeSubsystemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nv_me_subsystem_id = 3;</code>
     * @param value The nvMeSubsystemId to set.
     * @return This builder for chaining.
     */
    public Builder setNvMeSubsystemId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nvMeSubsystemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nv_me_subsystem_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNvMeSubsystemId() {
      
      nvMeSubsystemId_ = getDefaultInstance().getNvMeSubsystemId();
      onChanged();
      return this;
    }
    /**
     * <code>string nv_me_subsystem_id = 3;</code>
     * @param value The bytes for nvMeSubsystemId to set.
     * @return This builder for chaining.
     */
    public Builder setNvMeSubsystemIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nvMeSubsystemId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateNVMeSubsystemRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNVMeSubsystemRequest)
  private static final opi_api.storage.v1.CreateNVMeSubsystemRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateNVMeSubsystemRequest();
  }

  public static opi_api.storage.v1.CreateNVMeSubsystemRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNVMeSubsystemRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNVMeSubsystemRequest>() {
    @java.lang.Override
    public CreateNVMeSubsystemRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateNVMeSubsystemRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateNVMeSubsystemRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNVMeSubsystemRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateNVMeSubsystemRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

