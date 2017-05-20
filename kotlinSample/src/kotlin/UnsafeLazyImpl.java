// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Lazy.kt

package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin:
//            Lazy, UNINITIALIZED_VALUE, InitializedLazyImpl

public final class UnsafeLazyImpl
    implements Lazy, Serializable
{

    public Object getValue()
    {
        if(_value != UNINITIALIZED_VALUE.INSTANCE)
            break MISSING_BLOCK_LABEL_38;
        this;
        initializer;
        if(initializer == null)
            Intrinsics.throwNpe();
        invoke();
        _value;
        initializer = (Function0)null;
        return (Object)_value;
    }

    public boolean isInitialized()
    {
        return _value != UNINITIALIZED_VALUE.INSTANCE;
    }

    public String toString()
    {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace()
    {
        return new InitializedLazyImpl(getValue());
    }

    public UnsafeLazyImpl(Function0 initializer)
    {
        Intrinsics.checkParameterIsNotNull(initializer, "initializer");
        super();
        this.initializer = initializer;
        _value = UNINITIALIZED_VALUE.INSTANCE;
    }

    private Function0 initializer;
    private Object _value;
}
