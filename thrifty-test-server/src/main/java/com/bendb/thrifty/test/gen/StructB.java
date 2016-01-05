/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.bendb.thrifty.test.gen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-04")
public class StructB implements org.apache.thrift.TBase<StructB, StructB._Fields>, java.io.Serializable, Cloneable, Comparable<StructB> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StructB");

  private static final org.apache.thrift.protocol.TField AA_FIELD_DESC = new org.apache.thrift.protocol.TField("aa", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField AB_FIELD_DESC = new org.apache.thrift.protocol.TField("ab", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StructBStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StructBTupleSchemeFactory());
  }

  public StructA aa; // optional
  public StructA ab; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AA((short)1, "aa"),
    AB((short)2, "ab");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // AA
          return AA;
        case 2: // AB
          return AB;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.AA};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AA, new org.apache.thrift.meta_data.FieldMetaData("aa", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StructA.class)));
    tmpMap.put(_Fields.AB, new org.apache.thrift.meta_data.FieldMetaData("ab", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StructA.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StructB.class, metaDataMap);
  }

  public StructB() {
  }

  public StructB(
    StructA ab)
  {
    this();
    this.ab = ab;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StructB(StructB other) {
    if (other.isSetAa()) {
      this.aa = new StructA(other.aa);
    }
    if (other.isSetAb()) {
      this.ab = new StructA(other.ab);
    }
  }

  public StructB deepCopy() {
    return new StructB(this);
  }

  @Override
  public void clear() {
    this.aa = null;
    this.ab = null;
  }

  public StructA getAa() {
    return this.aa;
  }

  public StructB setAa(StructA aa) {
    this.aa = aa;
    return this;
  }

  public void unsetAa() {
    this.aa = null;
  }

  /** Returns true if field aa is set (has been assigned a value) and false otherwise */
  public boolean isSetAa() {
    return this.aa != null;
  }

  public void setAaIsSet(boolean value) {
    if (!value) {
      this.aa = null;
    }
  }

  public StructA getAb() {
    return this.ab;
  }

  public StructB setAb(StructA ab) {
    this.ab = ab;
    return this;
  }

  public void unsetAb() {
    this.ab = null;
  }

  /** Returns true if field ab is set (has been assigned a value) and false otherwise */
  public boolean isSetAb() {
    return this.ab != null;
  }

  public void setAbIsSet(boolean value) {
    if (!value) {
      this.ab = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AA:
      if (value == null) {
        unsetAa();
      } else {
        setAa((StructA)value);
      }
      break;

    case AB:
      if (value == null) {
        unsetAb();
      } else {
        setAb((StructA)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AA:
      return getAa();

    case AB:
      return getAb();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AA:
      return isSetAa();
    case AB:
      return isSetAb();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StructB)
      return this.equals((StructB)that);
    return false;
  }

  public boolean equals(StructB that) {
    if (that == null)
      return false;

    boolean this_present_aa = true && this.isSetAa();
    boolean that_present_aa = true && that.isSetAa();
    if (this_present_aa || that_present_aa) {
      if (!(this_present_aa && that_present_aa))
        return false;
      if (!this.aa.equals(that.aa))
        return false;
    }

    boolean this_present_ab = true && this.isSetAb();
    boolean that_present_ab = true && that.isSetAb();
    if (this_present_ab || that_present_ab) {
      if (!(this_present_ab && that_present_ab))
        return false;
      if (!this.ab.equals(that.ab))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_aa = true && (isSetAa());
    list.add(present_aa);
    if (present_aa)
      list.add(aa);

    boolean present_ab = true && (isSetAb());
    list.add(present_ab);
    if (present_ab)
      list.add(ab);

    return list.hashCode();
  }

  @Override
  public int compareTo(StructB other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAa()).compareTo(other.isSetAa());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAa()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aa, other.aa);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAb()).compareTo(other.isSetAb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ab, other.ab);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StructB(");
    boolean first = true;

    if (isSetAa()) {
      sb.append("aa:");
      if (this.aa == null) {
        sb.append("null");
      } else {
        sb.append(this.aa);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("ab:");
    if (this.ab == null) {
      sb.append("null");
    } else {
      sb.append(this.ab);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (ab == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ab' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (aa != null) {
      aa.validate();
    }
    if (ab != null) {
      ab.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StructBStandardSchemeFactory implements SchemeFactory {
    public StructBStandardScheme getScheme() {
      return new StructBStandardScheme();
    }
  }

  private static class StructBStandardScheme extends StandardScheme<StructB> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StructB struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.aa = new StructA();
              struct.aa.read(iprot);
              struct.setAaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ab = new StructA();
              struct.ab.read(iprot);
              struct.setAbIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StructB struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.aa != null) {
        if (struct.isSetAa()) {
          oprot.writeFieldBegin(AA_FIELD_DESC);
          struct.aa.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ab != null) {
        oprot.writeFieldBegin(AB_FIELD_DESC);
        struct.ab.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StructBTupleSchemeFactory implements SchemeFactory {
    public StructBTupleScheme getScheme() {
      return new StructBTupleScheme();
    }
  }

  private static class StructBTupleScheme extends TupleScheme<StructB> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StructB struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.ab.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetAa()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAa()) {
        struct.aa.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StructB struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.ab = new StructA();
      struct.ab.read(iprot);
      struct.setAbIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.aa = new StructA();
        struct.aa.read(iprot);
        struct.setAaIsSet(true);
      }
    }
  }

}

