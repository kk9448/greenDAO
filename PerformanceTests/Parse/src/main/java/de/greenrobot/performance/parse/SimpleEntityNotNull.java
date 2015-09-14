package de.greenrobot.performance.parse;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Entity mapped to table "SIMPLE_ENTITY_NOT_NULL".
 */
@ParseClassName("SimpleEntity")
public class SimpleEntityNotNull extends ParseObject {

    private boolean simpleBoolean;
    private byte simpleByte;
    private short simpleShort;
    private int simpleInt;
    private long simpleLong;
    private float simpleFloat;
    private double simpleDouble;
    /** Not-null value. */
    private String simpleString;
    /** Not-null value. */
    private byte[] simpleByteArray;

    public SimpleEntityNotNull() {
    }

    public boolean getSimpleBoolean() {
        return simpleBoolean;
    }

    public void setSimpleBoolean(boolean simpleBoolean) {
        this.simpleBoolean = simpleBoolean;
    }

    public byte getSimpleByte() {
        return simpleByte;
    }

    public void setSimpleByte(byte simpleByte) {
        this.simpleByte = simpleByte;
    }

    public short getSimpleShort() {
        return simpleShort;
    }

    public void setSimpleShort(short simpleShort) {
        this.simpleShort = simpleShort;
    }

    public int getSimpleInt() {
        return simpleInt;
    }

    public void setSimpleInt(int simpleInt) {
        this.simpleInt = simpleInt;
    }

    public long getSimpleLong() {
        return simpleLong;
    }

    public void setSimpleLong(long simpleLong) {
        this.simpleLong = simpleLong;
    }

    public float getSimpleFloat() {
        return simpleFloat;
    }

    public void setSimpleFloat(float simpleFloat) {
        this.simpleFloat = simpleFloat;
    }

    public double getSimpleDouble() {
        return simpleDouble;
    }

    public void setSimpleDouble(double simpleDouble) {
        this.simpleDouble = simpleDouble;
    }

    /** Not-null value. */
    public String getSimpleString() {
        return simpleString;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setSimpleString(String simpleString) {
        this.simpleString = simpleString;
    }

    /** Not-null value. */
    public byte[] getSimpleByteArray() {
        return simpleByteArray;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setSimpleByteArray(byte[] simpleByteArray) {
        this.simpleByteArray = simpleByteArray;
    }

}