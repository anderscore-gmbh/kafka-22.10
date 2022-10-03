/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package gs.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PersonValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 675124557271353175L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PersonValue\",\"namespace\":\"gs.model\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\",\"doc\":\"Vorname\"},{\"name\":\"lastName\",\"type\":\"string\",\"doc\":\"Nachname\"},{\"name\":\"steuerId\",\"type\":\"string\",\"doc\":\"Steuer-ID\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PersonValue> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PersonValue> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PersonValue> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PersonValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PersonValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PersonValue to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PersonValue from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PersonValue instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PersonValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Vorname */
  private java.lang.CharSequence firstName;
  /** Nachname */
  private java.lang.CharSequence lastName;
  /** Steuer-ID */
  private java.lang.CharSequence steuerId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PersonValue() {}

  /**
   * All-args constructor.
   * @param firstName Vorname
   * @param lastName Nachname
   * @param steuerId Steuer-ID
   */
  public PersonValue(java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.lang.CharSequence steuerId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.steuerId = steuerId;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return lastName;
    case 2: return steuerId;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.CharSequence)value$; break;
    case 1: lastName = (java.lang.CharSequence)value$; break;
    case 2: steuerId = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return Vorname
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }


  /**
   * Sets the value of the 'firstName' field.
   * Vorname
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return Nachname
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }


  /**
   * Sets the value of the 'lastName' field.
   * Nachname
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'steuerId' field.
   * @return Steuer-ID
   */
  public java.lang.CharSequence getSteuerId() {
    return steuerId;
  }


  /**
   * Sets the value of the 'steuerId' field.
   * Steuer-ID
   * @param value the value to set.
   */
  public void setSteuerId(java.lang.CharSequence value) {
    this.steuerId = value;
  }

  /**
   * Creates a new PersonValue RecordBuilder.
   * @return A new PersonValue RecordBuilder
   */
  public static gs.model.PersonValue.Builder newBuilder() {
    return new gs.model.PersonValue.Builder();
  }

  /**
   * Creates a new PersonValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PersonValue RecordBuilder
   */
  public static gs.model.PersonValue.Builder newBuilder(gs.model.PersonValue.Builder other) {
    if (other == null) {
      return new gs.model.PersonValue.Builder();
    } else {
      return new gs.model.PersonValue.Builder(other);
    }
  }

  /**
   * Creates a new PersonValue RecordBuilder by copying an existing PersonValue instance.
   * @param other The existing instance to copy.
   * @return A new PersonValue RecordBuilder
   */
  public static gs.model.PersonValue.Builder newBuilder(gs.model.PersonValue other) {
    if (other == null) {
      return new gs.model.PersonValue.Builder();
    } else {
      return new gs.model.PersonValue.Builder(other);
    }
  }

  /**
   * RecordBuilder for PersonValue instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PersonValue>
    implements org.apache.avro.data.RecordBuilder<PersonValue> {

    /** Vorname */
    private java.lang.CharSequence firstName;
    /** Nachname */
    private java.lang.CharSequence lastName;
    /** Steuer-ID */
    private java.lang.CharSequence steuerId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(gs.model.PersonValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.steuerId)) {
        this.steuerId = data().deepCopy(fields()[2].schema(), other.steuerId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing PersonValue instance
     * @param other The existing instance to copy.
     */
    private Builder(gs.model.PersonValue other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.steuerId)) {
        this.steuerId = data().deepCopy(fields()[2].schema(), other.steuerId);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * Vorname
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }


    /**
      * Sets the value of the 'firstName' field.
      * Vorname
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public gs.model.PersonValue.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * Vorname
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * Vorname
      * @return This builder.
      */
    public gs.model.PersonValue.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * Nachname
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }


    /**
      * Sets the value of the 'lastName' field.
      * Nachname
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public gs.model.PersonValue.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.lastName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * Nachname
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastName' field.
      * Nachname
      * @return This builder.
      */
    public gs.model.PersonValue.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'steuerId' field.
      * Steuer-ID
      * @return The value.
      */
    public java.lang.CharSequence getSteuerId() {
      return steuerId;
    }


    /**
      * Sets the value of the 'steuerId' field.
      * Steuer-ID
      * @param value The value of 'steuerId'.
      * @return This builder.
      */
    public gs.model.PersonValue.Builder setSteuerId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.steuerId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'steuerId' field has been set.
      * Steuer-ID
      * @return True if the 'steuerId' field has been set, false otherwise.
      */
    public boolean hasSteuerId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'steuerId' field.
      * Steuer-ID
      * @return This builder.
      */
    public gs.model.PersonValue.Builder clearSteuerId() {
      steuerId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PersonValue build() {
      try {
        PersonValue record = new PersonValue();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lastName = fieldSetFlags()[1] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.steuerId = fieldSetFlags()[2] ? this.steuerId : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PersonValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<PersonValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PersonValue>
    READER$ = (org.apache.avro.io.DatumReader<PersonValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.firstName);

    out.writeString(this.lastName);

    out.writeString(this.steuerId);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8)this.firstName : null);

      this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8)this.lastName : null);

      this.steuerId = in.readString(this.steuerId instanceof Utf8 ? (Utf8)this.steuerId : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8)this.firstName : null);
          break;

        case 1:
          this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8)this.lastName : null);
          break;

        case 2:
          this.steuerId = in.readString(this.steuerId instanceof Utf8 ? (Utf8)this.steuerId : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









