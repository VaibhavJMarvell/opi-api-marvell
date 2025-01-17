// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ControllerNVMeNamespaceRequest}
 */
public final class ControllerNVMeNamespaceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ControllerNVMeNamespaceRequest)
    ControllerNVMeNamespaceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ControllerNVMeNamespaceRequest.newBuilder() to construct.
  private ControllerNVMeNamespaceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ControllerNVMeNamespaceRequest() {
    subsystem_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ControllerNVMeNamespaceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ControllerNVMeNamespaceRequest(
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

            subsystem_ = s;
            break;
          }
          case 18: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (controller_ != null) {
              subBuilder = controller_.toBuilder();
            }
            controller_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(controller_);
              controller_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (nvMeNamespaceId_ != null) {
              subBuilder = nvMeNamespaceId_.toBuilder();
            }
            nvMeNamespaceId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nvMeNamespaceId_);
              nvMeNamespaceId_ = subBuilder.buildPartial();
            }

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
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ControllerNVMeNamespaceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ControllerNVMeNamespaceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ControllerNVMeNamespaceRequest.class, opi_api.storage.v1.ControllerNVMeNamespaceRequest.Builder.class);
  }

  public static final int SUBSYSTEM_FIELD_NUMBER = 1;
  private volatile java.lang.Object subsystem_;
  /**
   * <code>string subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subsystem.
   */
  @java.lang.Override
  public java.lang.String getSubsystem() {
    java.lang.Object ref = subsystem_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subsystem_ = s;
      return s;
    }
  }
  /**
   * <code>string subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for subsystem.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubsystemBytes() {
    java.lang.Object ref = subsystem_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subsystem_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTROLLER_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey controller_;
  /**
   * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the controller field is set.
   */
  @java.lang.Override
  public boolean hasController() {
    return controller_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The controller.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getController() {
    return controller_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : controller_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getControllerOrBuilder() {
    return getController();
  }

  public static final int NV_ME_NAMESPACE_ID_FIELD_NUMBER = 3;
  private opi_api.common.v1.ObjectKey nvMeNamespaceId_;
  /**
   * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvMeNamespaceId field is set.
   */
  @java.lang.Override
  public boolean hasNvMeNamespaceId() {
    return nvMeNamespaceId_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvMeNamespaceId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getNvMeNamespaceId() {
    return nvMeNamespaceId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : nvMeNamespaceId_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getNvMeNamespaceIdOrBuilder() {
    return getNvMeNamespaceId();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subsystem_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subsystem_);
    }
    if (controller_ != null) {
      output.writeMessage(2, getController());
    }
    if (nvMeNamespaceId_ != null) {
      output.writeMessage(3, getNvMeNamespaceId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subsystem_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subsystem_);
    }
    if (controller_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getController());
    }
    if (nvMeNamespaceId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getNvMeNamespaceId());
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
    if (!(obj instanceof opi_api.storage.v1.ControllerNVMeNamespaceRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ControllerNVMeNamespaceRequest other = (opi_api.storage.v1.ControllerNVMeNamespaceRequest) obj;

    if (!getSubsystem()
        .equals(other.getSubsystem())) return false;
    if (hasController() != other.hasController()) return false;
    if (hasController()) {
      if (!getController()
          .equals(other.getController())) return false;
    }
    if (hasNvMeNamespaceId() != other.hasNvMeNamespaceId()) return false;
    if (hasNvMeNamespaceId()) {
      if (!getNvMeNamespaceId()
          .equals(other.getNvMeNamespaceId())) return false;
    }
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
    hash = (37 * hash) + SUBSYSTEM_FIELD_NUMBER;
    hash = (53 * hash) + getSubsystem().hashCode();
    if (hasController()) {
      hash = (37 * hash) + CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getController().hashCode();
    }
    if (hasNvMeNamespaceId()) {
      hash = (37 * hash) + NV_ME_NAMESPACE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNvMeNamespaceId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ControllerNVMeNamespaceRequest prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.ControllerNVMeNamespaceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ControllerNVMeNamespaceRequest)
      opi_api.storage.v1.ControllerNVMeNamespaceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ControllerNVMeNamespaceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ControllerNVMeNamespaceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ControllerNVMeNamespaceRequest.class, opi_api.storage.v1.ControllerNVMeNamespaceRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.ControllerNVMeNamespaceRequest.newBuilder()
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
      subsystem_ = "";

      if (controllerBuilder_ == null) {
        controller_ = null;
      } else {
        controller_ = null;
        controllerBuilder_ = null;
      }
      if (nvMeNamespaceIdBuilder_ == null) {
        nvMeNamespaceId_ = null;
      } else {
        nvMeNamespaceId_ = null;
        nvMeNamespaceIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_ControllerNVMeNamespaceRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ControllerNVMeNamespaceRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.ControllerNVMeNamespaceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ControllerNVMeNamespaceRequest build() {
      opi_api.storage.v1.ControllerNVMeNamespaceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ControllerNVMeNamespaceRequest buildPartial() {
      opi_api.storage.v1.ControllerNVMeNamespaceRequest result = new opi_api.storage.v1.ControllerNVMeNamespaceRequest(this);
      result.subsystem_ = subsystem_;
      if (controllerBuilder_ == null) {
        result.controller_ = controller_;
      } else {
        result.controller_ = controllerBuilder_.build();
      }
      if (nvMeNamespaceIdBuilder_ == null) {
        result.nvMeNamespaceId_ = nvMeNamespaceId_;
      } else {
        result.nvMeNamespaceId_ = nvMeNamespaceIdBuilder_.build();
      }
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
      if (other instanceof opi_api.storage.v1.ControllerNVMeNamespaceRequest) {
        return mergeFrom((opi_api.storage.v1.ControllerNVMeNamespaceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ControllerNVMeNamespaceRequest other) {
      if (other == opi_api.storage.v1.ControllerNVMeNamespaceRequest.getDefaultInstance()) return this;
      if (!other.getSubsystem().isEmpty()) {
        subsystem_ = other.subsystem_;
        onChanged();
      }
      if (other.hasController()) {
        mergeController(other.getController());
      }
      if (other.hasNvMeNamespaceId()) {
        mergeNvMeNamespaceId(other.getNvMeNamespaceId());
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
      opi_api.storage.v1.ControllerNVMeNamespaceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ControllerNVMeNamespaceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object subsystem_ = "";
    /**
     * <code>string subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The subsystem.
     */
    public java.lang.String getSubsystem() {
      java.lang.Object ref = subsystem_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subsystem_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for subsystem.
     */
    public com.google.protobuf.ByteString
        getSubsystemBytes() {
      java.lang.Object ref = subsystem_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subsystem_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The subsystem to set.
     * @return This builder for chaining.
     */
    public Builder setSubsystem(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subsystem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubsystem() {
      
      subsystem_ = getDefaultInstance().getSubsystem();
      onChanged();
      return this;
    }
    /**
     * <code>string subsystem = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for subsystem to set.
     * @return This builder for chaining.
     */
    public Builder setSubsystemBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subsystem_ = value;
      onChanged();
      return this;
    }

    private opi_api.common.v1.ObjectKey controller_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> controllerBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the controller field is set.
     */
    public boolean hasController() {
      return controllerBuilder_ != null || controller_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The controller.
     */
    public opi_api.common.v1.ObjectKey getController() {
      if (controllerBuilder_ == null) {
        return controller_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : controller_;
      } else {
        return controllerBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setController(opi_api.common.v1.ObjectKey value) {
      if (controllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        controller_ = value;
        onChanged();
      } else {
        controllerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setController(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (controllerBuilder_ == null) {
        controller_ = builderForValue.build();
        onChanged();
      } else {
        controllerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeController(opi_api.common.v1.ObjectKey value) {
      if (controllerBuilder_ == null) {
        if (controller_ != null) {
          controller_ =
            opi_api.common.v1.ObjectKey.newBuilder(controller_).mergeFrom(value).buildPartial();
        } else {
          controller_ = value;
        }
        onChanged();
      } else {
        controllerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearController() {
      if (controllerBuilder_ == null) {
        controller_ = null;
        onChanged();
      } else {
        controller_ = null;
        controllerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getControllerBuilder() {
      
      onChanged();
      return getControllerFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getControllerOrBuilder() {
      if (controllerBuilder_ != null) {
        return controllerBuilder_.getMessageOrBuilder();
      } else {
        return controller_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : controller_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getControllerFieldBuilder() {
      if (controllerBuilder_ == null) {
        controllerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getController(),
                getParentForChildren(),
                isClean());
        controller_ = null;
      }
      return controllerBuilder_;
    }

    private opi_api.common.v1.ObjectKey nvMeNamespaceId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> nvMeNamespaceIdBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the nvMeNamespaceId field is set.
     */
    public boolean hasNvMeNamespaceId() {
      return nvMeNamespaceIdBuilder_ != null || nvMeNamespaceId_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nvMeNamespaceId.
     */
    public opi_api.common.v1.ObjectKey getNvMeNamespaceId() {
      if (nvMeNamespaceIdBuilder_ == null) {
        return nvMeNamespaceId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : nvMeNamespaceId_;
      } else {
        return nvMeNamespaceIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvMeNamespaceId(opi_api.common.v1.ObjectKey value) {
      if (nvMeNamespaceIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nvMeNamespaceId_ = value;
        onChanged();
      } else {
        nvMeNamespaceIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvMeNamespaceId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (nvMeNamespaceIdBuilder_ == null) {
        nvMeNamespaceId_ = builderForValue.build();
        onChanged();
      } else {
        nvMeNamespaceIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNvMeNamespaceId(opi_api.common.v1.ObjectKey value) {
      if (nvMeNamespaceIdBuilder_ == null) {
        if (nvMeNamespaceId_ != null) {
          nvMeNamespaceId_ =
            opi_api.common.v1.ObjectKey.newBuilder(nvMeNamespaceId_).mergeFrom(value).buildPartial();
        } else {
          nvMeNamespaceId_ = value;
        }
        onChanged();
      } else {
        nvMeNamespaceIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNvMeNamespaceId() {
      if (nvMeNamespaceIdBuilder_ == null) {
        nvMeNamespaceId_ = null;
        onChanged();
      } else {
        nvMeNamespaceId_ = null;
        nvMeNamespaceIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getNvMeNamespaceIdBuilder() {
      
      onChanged();
      return getNvMeNamespaceIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getNvMeNamespaceIdOrBuilder() {
      if (nvMeNamespaceIdBuilder_ != null) {
        return nvMeNamespaceIdBuilder_.getMessageOrBuilder();
      } else {
        return nvMeNamespaceId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : nvMeNamespaceId_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey nv_me_namespace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getNvMeNamespaceIdFieldBuilder() {
      if (nvMeNamespaceIdBuilder_ == null) {
        nvMeNamespaceIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getNvMeNamespaceId(),
                getParentForChildren(),
                isClean());
        nvMeNamespaceId_ = null;
      }
      return nvMeNamespaceIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ControllerNVMeNamespaceRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ControllerNVMeNamespaceRequest)
  private static final opi_api.storage.v1.ControllerNVMeNamespaceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ControllerNVMeNamespaceRequest();
  }

  public static opi_api.storage.v1.ControllerNVMeNamespaceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ControllerNVMeNamespaceRequest>
      PARSER = new com.google.protobuf.AbstractParser<ControllerNVMeNamespaceRequest>() {
    @java.lang.Override
    public ControllerNVMeNamespaceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ControllerNVMeNamespaceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ControllerNVMeNamespaceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ControllerNVMeNamespaceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ControllerNVMeNamespaceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

