// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StringBuilderJVM.kt

package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

final class SystemProperties
{

    private SystemProperties()
    {
        String s;
        INSTANCE = (SystemProperties)this;
        s = System.getProperty("line.separator");
        s;
        if(s == null)
            Intrinsics.throwNpe();
        LINE_SEPARATOR;
    }

    public static final String LINE_SEPARATOR;
    public static final SystemProperties INSTANCE;

    static 
    {
        new SystemProperties();
    }
}
