// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Lazy.kt

package kotlin;

import java.io.Serializable;

// Referenced classes of package kotlin:
//            Lazy

final class InitializedLazyImpl
    implements Lazy, Serializable
{

    public boolean isInitialized()
    {
        return true;
    }

    public String toString()
    {
        return String.valueOf(getValue());
    }

    public Object getValue()
    {
        return value;
    }

    public InitializedLazyImpl(Object value)
    {
        this.value = value;
    }

    private final Object value;
}
