// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.ListVirtioScsiLunResponse}
 */
public final class ListVirtioScsiLunResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.ListVirtioScsiLunResponse)
    ListVirtioScsiLunResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListVirtioScsiLunResponse.newBuilder() to construct.
  private ListVirtioScsiLunResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListVirtioScsiLunResponse() {
    lun_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListVirtioScsiLunResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListVirtioScsiLunResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              lun_ = new java.util.ArrayList<opi_api.storage.v1.VirtioScsiLun>();
              mutable_bitField0_ |= 0x00000001;
            }
            lun_.add(
                input.readMessage(opi_api.storage.v1.VirtioScsiLun.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        lun_ = java.util.Collections.unmodifiableList(lun_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiLunResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiLunResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.ListVirtioScsiLunResponse.class, opi_api.storage.v1.ListVirtioScsiLunResponse.Builder.class);
  }

  public static final int LUN_FIELD_NUMBER = 1;
  private java.util.List<opi_api.storage.v1.VirtioScsiLun> lun_;
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.storage.v1.VirtioScsiLun> getLunList() {
    return lun_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.storage.v1.VirtioScsiLunOrBuilder> 
      getLunOrBuilderList() {
    return lun_;
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
   */
  @java.lang.Override
  public int getLunCount() {
    return lun_.size();
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiLun getLun(int index) {
    return lun_.get(index);
  }
  /**
   * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioScsiLunOrBuilder getLunOrBuilder(
      int index) {
    return lun_.get(index);
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
    for (int i = 0; i < lun_.size(); i++) {
      output.writeMessage(1, lun_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lun_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lun_.get(i));
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
    if (!(obj instanceof opi_api.storage.v1.ListVirtioScsiLunResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.ListVirtioScsiLunResponse other = (opi_api.storage.v1.ListVirtioScsiLunResponse) obj;

    if (!getLunList()
        .equals(other.getLunList())) return false;
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
    if (getLunCount() > 0) {
      hash = (37 * hash) + LUN_FIELD_NUMBER;
      hash = (53 * hash) + getLunList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.ListVirtioScsiLunResponse parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.ListVirtioScsiLunResponse prototype) {
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
   * Protobuf type {@code opi_api.storage.v1.ListVirtioScsiLunResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.ListVirtioScsiLunResponse)
      opi_api.storage.v1.ListVirtioScsiLunResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiLunResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiLunResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.ListVirtioScsiLunResponse.class, opi_api.storage.v1.ListVirtioScsiLunResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.ListVirtioScsiLunResponse.newBuilder()
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
        getLunFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (lunBuilder_ == null) {
        lun_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lunBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioScsiProto.internal_static_opi_api_storage_v1_ListVirtioScsiLunResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListVirtioScsiLunResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.ListVirtioScsiLunResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.ListVirtioScsiLunResponse build() {
      opi_api.storage.v1.ListVirtioScsiLunResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.ListVirtioScsiLunResponse buildPartial() {
      opi_api.storage.v1.ListVirtioScsiLunResponse result = new opi_api.storage.v1.ListVirtioScsiLunResponse(this);
      int from_bitField0_ = bitField0_;
      if (lunBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lun_ = java.util.Collections.unmodifiableList(lun_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lun_ = lun_;
      } else {
        result.lun_ = lunBuilder_.build();
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
      if (other instanceof opi_api.storage.v1.ListVirtioScsiLunResponse) {
        return mergeFrom((opi_api.storage.v1.ListVirtioScsiLunResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.ListVirtioScsiLunResponse other) {
      if (other == opi_api.storage.v1.ListVirtioScsiLunResponse.getDefaultInstance()) return this;
      if (lunBuilder_ == null) {
        if (!other.lun_.isEmpty()) {
          if (lun_.isEmpty()) {
            lun_ = other.lun_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLunIsMutable();
            lun_.addAll(other.lun_);
          }
          onChanged();
        }
      } else {
        if (!other.lun_.isEmpty()) {
          if (lunBuilder_.isEmpty()) {
            lunBuilder_.dispose();
            lunBuilder_ = null;
            lun_ = other.lun_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lunBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLunFieldBuilder() : null;
          } else {
            lunBuilder_.addAllMessages(other.lun_);
          }
        }
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
      opi_api.storage.v1.ListVirtioScsiLunResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.ListVirtioScsiLunResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.storage.v1.VirtioScsiLun> lun_ =
      java.util.Collections.emptyList();
    private void ensureLunIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lun_ = new java.util.ArrayList<opi_api.storage.v1.VirtioScsiLun>(lun_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.VirtioScsiLun, opi_api.storage.v1.VirtioScsiLun.Builder, opi_api.storage.v1.VirtioScsiLunOrBuilder> lunBuilder_;

    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.VirtioScsiLun> getLunList() {
      if (lunBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lun_);
      } else {
        return lunBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public int getLunCount() {
      if (lunBuilder_ == null) {
        return lun_.size();
      } else {
        return lunBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiLun getLun(int index) {
      if (lunBuilder_ == null) {
        return lun_.get(index);
      } else {
        return lunBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public Builder setLun(
        int index, opi_api.storage.v1.VirtioScsiLun value) {
      if (lunBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLunIsMutable();
        lun_.set(index, value);
        onChanged();
      } else {
        lunBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public Builder setLun(
        int index, opi_api.storage.v1.VirtioScsiLun.Builder builderForValue) {
      if (lunBuilder_ == null) {
        ensureLunIsMutable();
        lun_.set(index, builderForValue.build());
        onChanged();
      } else {
        lunBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public Builder addLun(opi_api.storage.v1.VirtioScsiLun value) {
      if (lunBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLunIsMutable();
        lun_.add(value);
        onChanged();
      } else {
        lunBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public Builder addLun(
        int index, opi_api.storage.v1.VirtioScsiLun value) {
      if (lunBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLunIsMutable();
        lun_.add(index, value);
        onChanged();
      } else {
        lunBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public Builder addLun(
        opi_api.storage.v1.VirtioScsiLun.Builder builderForValue) {
      if (lunBuilder_ == null) {
        ensureLunIsMutable();
        lun_.add(builderForValue.build());
        onChanged();
      } else {
        lunBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public Builder addLun(
        int index, opi_api.storage.v1.VirtioScsiLun.Builder builderForValue) {
      if (lunBuilder_ == null) {
        ensureLunIsMutable();
        lun_.add(index, builderForValue.build());
        onChanged();
      } else {
        lunBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public Builder addAllLun(
        java.lang.Iterable<? extends opi_api.storage.v1.VirtioScsiLun> values) {
      if (lunBuilder_ == null) {
        ensureLunIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lun_);
        onChanged();
      } else {
        lunBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public Builder clearLun() {
      if (lunBuilder_ == null) {
        lun_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lunBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public Builder removeLun(int index) {
      if (lunBuilder_ == null) {
        ensureLunIsMutable();
        lun_.remove(index);
        onChanged();
      } else {
        lunBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiLun.Builder getLunBuilder(
        int index) {
      return getLunFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiLunOrBuilder getLunOrBuilder(
        int index) {
      if (lunBuilder_ == null) {
        return lun_.get(index);  } else {
        return lunBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public java.util.List<? extends opi_api.storage.v1.VirtioScsiLunOrBuilder> 
         getLunOrBuilderList() {
      if (lunBuilder_ != null) {
        return lunBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lun_);
      }
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiLun.Builder addLunBuilder() {
      return getLunFieldBuilder().addBuilder(
          opi_api.storage.v1.VirtioScsiLun.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public opi_api.storage.v1.VirtioScsiLun.Builder addLunBuilder(
        int index) {
      return getLunFieldBuilder().addBuilder(
          index, opi_api.storage.v1.VirtioScsiLun.getDefaultInstance());
    }
    /**
     * <code>repeated .opi_api.storage.v1.VirtioScsiLun lun = 1;</code>
     */
    public java.util.List<opi_api.storage.v1.VirtioScsiLun.Builder> 
         getLunBuilderList() {
      return getLunFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.storage.v1.VirtioScsiLun, opi_api.storage.v1.VirtioScsiLun.Builder, opi_api.storage.v1.VirtioScsiLunOrBuilder> 
        getLunFieldBuilder() {
      if (lunBuilder_ == null) {
        lunBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.storage.v1.VirtioScsiLun, opi_api.storage.v1.VirtioScsiLun.Builder, opi_api.storage.v1.VirtioScsiLunOrBuilder>(
                lun_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lun_ = null;
      }
      return lunBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.ListVirtioScsiLunResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.ListVirtioScsiLunResponse)
  private static final opi_api.storage.v1.ListVirtioScsiLunResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.ListVirtioScsiLunResponse();
  }

  public static opi_api.storage.v1.ListVirtioScsiLunResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVirtioScsiLunResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListVirtioScsiLunResponse>() {
    @java.lang.Override
    public ListVirtioScsiLunResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListVirtioScsiLunResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListVirtioScsiLunResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVirtioScsiLunResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.ListVirtioScsiLunResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
