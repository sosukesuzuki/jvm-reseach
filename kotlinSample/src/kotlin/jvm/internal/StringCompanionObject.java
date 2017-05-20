// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveCompanionObjects.kt

package kotlin.jvm.internal;


public final class StringCompanionObject
{

    private StringCompanionObject()
    {
    }

    public static final StringCompanionObject INSTANCE = (StringCompanionObject)this;

    static 
    {
        new StringCompanionObject();
    }
}
