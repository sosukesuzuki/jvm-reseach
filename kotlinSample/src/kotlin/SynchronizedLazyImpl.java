// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Lazy.kt

package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin:
//            Lazy, UNINITIALIZED_VALUE, InitializedLazyImpl

final class SynchronizedLazyImpl
    implements Lazy, Serializable
{

    public Object getValue()
    {
        Object _v1 = _value;
        if(_v1 != UNINITIALIZED_VALUE.INSTANCE)
            return (Object)_v1;
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        Object typedValue;
        Object _v2 = _value;
        if(_v2 != UNINITIALIZED_VALUE.INSTANCE)
        {
            typedValue = (Object)_v2;
        } else
        {
            if(initializer == null)
                Intrinsics.throwNpe();
            typedValue = initializer.invoke();
            _value = typedValue;
            initializer = (Function0)null;
            typedValue = typedValue;
        }
        obj;
        JVM INSTR monitorexit ;
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L1:
        return typedValue;
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

    public SynchronizedLazyImpl(Function0 initializer, Object lock)
    {
        Intrinsics.checkParameterIsNotNull(initializer, "initializer");
        super();
        this.initializer = initializer;
        _value = UNINITIALIZED_VALUE.INSTANCE;
        this.lock = lock == null ? ((Object) (this)) : lock;
    }

    public SynchronizedLazyImpl(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultconstructormarker)
    {
        if((i & 2) != 0)
            obj = null;
        this(function0, obj);
    }

    private Function0 initializer;
    private volatile Object _value;
    private final Object lock;
}
