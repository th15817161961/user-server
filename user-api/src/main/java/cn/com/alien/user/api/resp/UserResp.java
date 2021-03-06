/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.com.alien.user.api.resp;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-07-17")
public class UserResp implements org.apache.thrift.TBase<UserResp, UserResp._Fields>, java.io.Serializable, Cloneable, Comparable<UserResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserResp");

  private static final org.apache.thrift.protocol.TField BASE_RESP_FIELD_DESC = new org.apache.thrift.protocol.TField("baseResp", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserRespStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserRespTupleSchemeFactory();

  public cn.com.alien.user.api.resp.base.BaseResp baseResp; // required
  public java.lang.String userId; // required
  public java.lang.String userName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE_RESP((short)1, "baseResp"),
    USER_ID((short)2, "userId"),
    USER_NAME((short)3, "userName");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BASE_RESP
          return BASE_RESP;
        case 2: // USER_ID
          return USER_ID;
        case 3: // USER_NAME
          return USER_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE_RESP, new org.apache.thrift.meta_data.FieldMetaData("baseResp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, cn.com.alien.user.api.resp.base.BaseResp.class)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserResp.class, metaDataMap);
  }

  public UserResp() {
  }

  public UserResp(
    cn.com.alien.user.api.resp.base.BaseResp baseResp,
    java.lang.String userId,
    java.lang.String userName)
  {
    this();
    this.baseResp = baseResp;
    this.userId = userId;
    this.userName = userName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserResp(UserResp other) {
    if (other.isSetBaseResp()) {
      this.baseResp = new cn.com.alien.user.api.resp.base.BaseResp(other.baseResp);
    }
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
  }

  public UserResp deepCopy() {
    return new UserResp(this);
  }

  @Override
  public void clear() {
    this.baseResp = null;
    this.userId = null;
    this.userName = null;
  }

  public cn.com.alien.user.api.resp.base.BaseResp getBaseResp() {
    return this.baseResp;
  }

  public UserResp setBaseResp(cn.com.alien.user.api.resp.base.BaseResp baseResp) {
    this.baseResp = baseResp;
    return this;
  }

  public void unsetBaseResp() {
    this.baseResp = null;
  }

  /** Returns true if field baseResp is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseResp() {
    return this.baseResp != null;
  }

  public void setBaseRespIsSet(boolean value) {
    if (!value) {
      this.baseResp = null;
    }
  }

  public java.lang.String getUserId() {
    return this.userId;
  }

  public UserResp setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public java.lang.String getUserName() {
    return this.userName;
  }

  public UserResp setUserName(java.lang.String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case BASE_RESP:
      if (value == null) {
        unsetBaseResp();
      } else {
        setBaseResp((cn.com.alien.user.api.resp.base.BaseResp)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((java.lang.String)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE_RESP:
      return getBaseResp();

    case USER_ID:
      return getUserId();

    case USER_NAME:
      return getUserName();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BASE_RESP:
      return isSetBaseResp();
    case USER_ID:
      return isSetUserId();
    case USER_NAME:
      return isSetUserName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UserResp)
      return this.equals((UserResp)that);
    return false;
  }

  public boolean equals(UserResp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_baseResp = true && this.isSetBaseResp();
    boolean that_present_baseResp = true && that.isSetBaseResp();
    if (this_present_baseResp || that_present_baseResp) {
      if (!(this_present_baseResp && that_present_baseResp))
        return false;
      if (!this.baseResp.equals(that.baseResp))
        return false;
    }

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBaseResp()) ? 131071 : 524287);
    if (isSetBaseResp())
      hashCode = hashCode * 8191 + baseResp.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserId()) ? 131071 : 524287);
    if (isSetUserId())
      hashCode = hashCode * 8191 + userId.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserName()) ? 131071 : 524287);
    if (isSetUserName())
      hashCode = hashCode * 8191 + userName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UserResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetBaseResp()).compareTo(other.isSetBaseResp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseResp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.baseResp, other.baseResp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserResp(");
    boolean first = true;

    sb.append("baseResp:");
    if (this.baseResp == null) {
      sb.append("null");
    } else {
      sb.append(this.baseResp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (baseResp == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'baseResp' was not present! Struct: " + toString());
    }
    if (userId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userId' was not present! Struct: " + toString());
    }
    if (userName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (baseResp != null) {
      baseResp.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserRespStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserRespStandardScheme getScheme() {
      return new UserRespStandardScheme();
    }
  }

  private static class UserRespStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BASE_RESP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.baseResp = new cn.com.alien.user.api.resp.base.BaseResp();
              struct.baseResp.read(iprot);
              struct.setBaseRespIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.baseResp != null) {
        oprot.writeFieldBegin(BASE_RESP_FIELD_DESC);
        struct.baseResp.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.userName != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.userName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserRespTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserRespTupleScheme getScheme() {
      return new UserRespTupleScheme();
    }
  }

  private static class UserRespTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.baseResp.write(oprot);
      oprot.writeString(struct.userId);
      oprot.writeString(struct.userName);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.baseResp = new cn.com.alien.user.api.resp.base.BaseResp();
      struct.baseResp.read(iprot);
      struct.setBaseRespIsSet(true);
      struct.userId = iprot.readString();
      struct.setUserIdIsSet(true);
      struct.userName = iprot.readString();
      struct.setUserNameIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

