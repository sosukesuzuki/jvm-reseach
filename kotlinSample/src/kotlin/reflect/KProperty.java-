// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KProperty.kt

package kotlin.reflect;


// Referenced classes of package kotlin.reflect:
//            KCallable, KFunction

public interface KProperty
    extends KCallable
{
    public static interface Accessor
    {

        public abstract KProperty getProperty();
    }

    public static interface Getter
        extends Accessor, KFunction
    {
    }


    public abstract Getter getGetter();
}
