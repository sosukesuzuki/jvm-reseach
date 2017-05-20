// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveCompanionObjects.kt

package kotlin.jvm.internal;


public final class ShortCompanionObject
{

    private ShortCompanionObject()
    {
    }

    public static final short MIN_VALUE = -32768;
    public static final short MAX_VALUE = 32767;
    public static final ShortCompanionObject INSTANCE = (ShortCompanionObject)this;

    static 
    {
        new ShortCompanionObject();
    }
}
