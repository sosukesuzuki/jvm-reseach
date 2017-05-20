// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KProperty.kt

package kotlin.reflect;

import kotlin.jvm.functions.Function1;

// Referenced classes of package kotlin.reflect:
//            KProperty0, KMutableProperty

public interface KMutableProperty0
    extends KProperty0, KMutableProperty
{
    public static interface Setter
        extends KMutableProperty.Setter, Function1
    {
    }


    public abstract void set(Object obj);

    public abstract Setter getSetter();
}
