// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Lazy.kt

package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin:
//            Lazy, UNINITIALIZED_VALUE, InitializedLazyImpl

final class SafePublicationLazyImpl
    implements Lazy, Serializable
{
    public static final class Companion
    {

        private final AtomicReferenceFieldUpdater getValueUpdater()
        {
            return SafePublicationLazyImpl.valueUpdater;
        }


        private Companion()
        {
        }

        public Companion(DefaultConstructorMarker $constructor_marker)
        {
            this();
        }
    }


    public Object getValue()
    {
        if(_value == UNINITIALIZED_VALUE.INSTANCE)
        {
            Function0 initializerValue = initializer;
            if(initializerValue != null)
            {
                Object newValue = initializerValue.invoke();
                if(Companion.getValueUpdater().compareAndSet(this, UNINITIALIZED_VALUE.INSTANCE, newValue))
                    initializer = (Function0)null;
            }
        }
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

    public SafePublicationLazyImpl(Function0 initializer)
    {
        Intrinsics.checkParameterIsNotNull(initializer, "initializer");
        super();
        this.initializer = initializer;
        _value = UNINITIALIZED_VALUE.INSTANCE;
        _fldfinal = UNINITIALIZED_VALUE.INSTANCE;
    }

    private Function0 initializer;
    private volatile Object _value;
    private final Object _fldfinal;
    private static final AtomicReferenceFieldUpdater valueUpdater = AtomicReferenceFieldUpdater.newUpdater(kotlin/SafePublicationLazyImpl, java/lang/Object, "_value");
    public static final Companion Companion = new Companion(null);


}
