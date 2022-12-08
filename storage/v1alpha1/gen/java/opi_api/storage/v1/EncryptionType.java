// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opicommon.proto

package opi_api.storage.v1;

/**
 * <pre>
 * AES encryption types
 * </pre>
 *
 * Protobuf enum {@code opi_api.storage.v1.EncryptionType}
 */
public enum EncryptionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENCRYPTION_TYPE_UNSPECIFIED = 0;</code>
   */
  ENCRYPTION_TYPE_UNSPECIFIED(0),
  /**
   * <code>ENCRYPTION_TYPE_AES_CBC_128 = 1;</code>
   */
  ENCRYPTION_TYPE_AES_CBC_128(1),
  /**
   * <code>ENCRYPTION_TYPE_AES_CBC_192 = 2;</code>
   */
  ENCRYPTION_TYPE_AES_CBC_192(2),
  /**
   * <code>ENCRYPTION_TYPE_AES_CBC_256 = 3;</code>
   */
  ENCRYPTION_TYPE_AES_CBC_256(3),
  /**
   * <code>ENCRYPTION_TYPE_AES_XTS_128 = 4;</code>
   */
  ENCRYPTION_TYPE_AES_XTS_128(4),
  /**
   * <code>ENCRYPTION_TYPE_AES_XTS_192 = 5;</code>
   */
  ENCRYPTION_TYPE_AES_XTS_192(5),
  /**
   * <code>ENCRYPTION_TYPE_AES_XTS_256 = 6;</code>
   */
  ENCRYPTION_TYPE_AES_XTS_256(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENCRYPTION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ENCRYPTION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ENCRYPTION_TYPE_AES_CBC_128 = 1;</code>
   */
  public static final int ENCRYPTION_TYPE_AES_CBC_128_VALUE = 1;
  /**
   * <code>ENCRYPTION_TYPE_AES_CBC_192 = 2;</code>
   */
  public static final int ENCRYPTION_TYPE_AES_CBC_192_VALUE = 2;
  /**
   * <code>ENCRYPTION_TYPE_AES_CBC_256 = 3;</code>
   */
  public static final int ENCRYPTION_TYPE_AES_CBC_256_VALUE = 3;
  /**
   * <code>ENCRYPTION_TYPE_AES_XTS_128 = 4;</code>
   */
  public static final int ENCRYPTION_TYPE_AES_XTS_128_VALUE = 4;
  /**
   * <code>ENCRYPTION_TYPE_AES_XTS_192 = 5;</code>
   */
  public static final int ENCRYPTION_TYPE_AES_XTS_192_VALUE = 5;
  /**
   * <code>ENCRYPTION_TYPE_AES_XTS_256 = 6;</code>
   */
  public static final int ENCRYPTION_TYPE_AES_XTS_256_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EncryptionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EncryptionType forNumber(int value) {
    switch (value) {
      case 0: return ENCRYPTION_TYPE_UNSPECIFIED;
      case 1: return ENCRYPTION_TYPE_AES_CBC_128;
      case 2: return ENCRYPTION_TYPE_AES_CBC_192;
      case 3: return ENCRYPTION_TYPE_AES_CBC_256;
      case 4: return ENCRYPTION_TYPE_AES_XTS_128;
      case 5: return ENCRYPTION_TYPE_AES_XTS_192;
      case 6: return ENCRYPTION_TYPE_AES_XTS_256;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EncryptionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EncryptionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EncryptionType>() {
          public EncryptionType findValueByNumber(int number) {
            return EncryptionType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.storage.v1.OpiCommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final EncryptionType[] VALUES = values();

  public static EncryptionType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EncryptionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.storage.v1.EncryptionType)
}
