// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Delegates.kt

package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

// Referenced classes of package kotlin.properties:
//            ReadWriteProperty

final class NotNullVar
    implements ReadWriteProperty
{

    public Object getValue(Object thisRef, KProperty property)
    {
        Intrinsics.checkParameterIsNotNull(property, "property");
        value;
        if(value != null)
            break MISSING_BLOCK_LABEL_58;
        JVM INSTR pop ;
        throw (Throwable)new IllegalStateException((new StringBuilder()).append("Property ").append(property.getName()).append(" should be initialized before get.").toString());
        return;
    }

    public void setValue(Object thisRef, KProperty property, Object value)
    {
        Intrinsics.checkParameterIsNotNull(property, "property");
        Intrinsics.checkParameterIsNotNull(value, "value");
        this.value = value;
    }

    public NotNullVar()
    {
    }

    private Object value;
}
