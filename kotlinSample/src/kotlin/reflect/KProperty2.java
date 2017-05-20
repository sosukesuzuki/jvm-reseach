// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KProperty.kt

package kotlin.reflect;

import kotlin.jvm.functions.Function2;

// Referenced classes of package kotlin.reflect:
//            KProperty

public interface KProperty2
    extends KProperty, Function2
{
    public static interface Getter
        extends KProperty.Getter, Function2
    {
    }


    public abstract Object get(Object obj, Object obj1);

    public abstract Getter getGetter();
}
