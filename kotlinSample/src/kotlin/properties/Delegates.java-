// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Delegates.kt

package kotlin.properties;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

// Referenced classes of package kotlin.properties:
//            NotNullVar, ReadWriteProperty, ObservableProperty

public final class Delegates
{

    public final ReadWriteProperty notNull()
    {
        return (ReadWriteProperty)new NotNullVar();
    }

    public final ReadWriteProperty observable(Object initialValue, Function3 onChange)
    {
        Intrinsics.checkParameterIsNotNull(onChange, "onChange");
        return (ReadWriteProperty)new ObservableProperty(onChange, initialValue) {

            protected void afterChange(KProperty property, Object oldValue, Object newValue)
            {
                Intrinsics.checkParameterIsNotNull(property, "property");
                $onChange.invoke(property, oldValue, newValue);
            }

            final Function3 $onChange;

            public 
            {
                $onChange = $captured_local_variable$0;
                super($super_call_param$1);
            }
        }
;
    }

    public final ReadWriteProperty vetoable(Object initialValue, Function3 onChange)
    {
        Intrinsics.checkParameterIsNotNull(onChange, "onChange");
        return (ReadWriteProperty)new ObservableProperty(onChange, initialValue) {

            protected boolean beforeChange(KProperty property, Object oldValue, Object newValue)
            {
                Intrinsics.checkParameterIsNotNull(property, "property");
                return ((Boolean)$onChange.invoke(property, oldValue, newValue)).booleanValue();
            }

            final Function3 $onChange;

            public 
            {
                $onChange = $captured_local_variable$0;
                super($super_call_param$1);
            }
        }
;
    }

    private Delegates()
    {
    }

    public static final Delegates INSTANCE = (Delegates)this;

    static 
    {
        new Delegates();
    }
}
