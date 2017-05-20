// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KProperty.kt

package kotlin.reflect;


// Referenced classes of package kotlin.reflect:
//            KProperty, KFunction

public interface KMutableProperty
    extends KProperty
{
    public static interface Setter
        extends KProperty.Accessor, KFunction
    {
    }


    public abstract Setter getSetter();
}
