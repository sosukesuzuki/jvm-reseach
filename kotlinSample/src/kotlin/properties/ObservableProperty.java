// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ObservableProperty.kt

package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

// Referenced classes of package kotlin.properties:
//            ReadWriteProperty

public abstract class ObservableProperty
    implements ReadWriteProperty
{

    protected boolean beforeChange(KProperty property, Object oldValue, Object newValue)
    {
        Intrinsics.checkParameterIsNotNull(property, "property");
        return true;
    }

    protected void afterChange(KProperty property, Object oldValue, Object newValue)
    {
        Intrinsics.checkParameterIsNotNull(property, "property");
    }

    public Object getValue(Object thisRef, KProperty property)
    {
        Intrinsics.checkParameterIsNotNull(property, "property");
        return value;
    }

    public void setValue(Object thisRef, KProperty property, Object value)
    {
        Intrinsics.checkParameterIsNotNull(property, "property");
        Object oldValue = this.value;
        if(!beforeChange(property, oldValue, value))
        {
            return;
        } else
        {
            this.value = value;
            afterChange(property, oldValue, value);
            return;
        }
    }

    public ObservableProperty(Object initialValue)
    {
        value = initialValue;
    }

    private Object value;
}
