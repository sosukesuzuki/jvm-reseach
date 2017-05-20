// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MapAccessors.kt

package kotlin.collections;

import java.util.Map;
import kotlin.reflect.KProperty;

// Referenced classes of package kotlin.collections:
//            MapsKt

public final class MapAccessorsKt
{

    private static final Object getValue(Map $receiver, Object thisRef, KProperty property)
    {
        return (Object)MapsKt.getOrImplicitDefaultNullable($receiver, property.getName());
    }

    private static final Object getVar(Map $receiver, Object thisRef, KProperty property)
    {
        return (Object)MapsKt.getOrImplicitDefaultNullable($receiver, property.getName());
    }

    private static final void setValue(Map $receiver, Object thisRef, KProperty property, Object value)
    {
        $receiver.put(property.getName(), value);
    }
}
