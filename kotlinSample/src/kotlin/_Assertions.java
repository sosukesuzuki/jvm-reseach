// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AssertionsJVM.kt

package kotlin;


public final class _Assertions
{

    private _Assertions()
    {
    }

    public static final boolean ENABLED = getClass().desiredAssertionStatus();
    public static final _Assertions INSTANCE = (_Assertions)this;

    static 
    {
        new _Assertions();
    }
}
