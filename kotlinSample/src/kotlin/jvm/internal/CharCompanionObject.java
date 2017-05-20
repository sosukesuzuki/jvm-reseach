// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveCompanionObjects.kt

package kotlin.jvm.internal;


public final class CharCompanionObject
{

    private CharCompanionObject()
    {
    }

    public static final char MIN_HIGH_SURROGATE = 55296;
    public static final char MAX_HIGH_SURROGATE = 56319;
    public static final char MIN_LOW_SURROGATE = 56320;
    public static final char MAX_LOW_SURROGATE = 57343;
    public static final char MIN_SURROGATE = 55296;
    public static final char MAX_SURROGATE = 57343;
    public static final CharCompanionObject INSTANCE = (CharCompanionObject)this;

    static 
    {
        new CharCompanionObject();
    }
}
