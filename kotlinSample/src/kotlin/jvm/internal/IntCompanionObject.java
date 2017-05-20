// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveCompanionObjects.kt

package kotlin.jvm.internal;


public final class IntCompanionObject
{

    private IntCompanionObject()
    {
    }

    public static final int MIN_VALUE = 0x80000000;
    public static final int MAX_VALUE = 0x7fffffff;
    public static final IntCompanionObject INSTANCE = (IntCompanionObject)this;

    static 
    {
        new IntCompanionObject();
    }
}
