// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MapWithDefault.kt

package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//            MapWithDefault, MapsKt, MapWithDefaultImpl, MutableMapWithDefault, 
//            MutableMapWithDefaultImpl

class MapsKt__MapWithDefaultKt
{

    public static final Object getOrImplicitDefaultNullable(Map $receiver, Object key)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof MapWithDefault)
            return ((MapWithDefault)$receiver).getOrImplicitDefault(key);
        Map $receiver$iv = $receiver;
        Object value$iv = $receiver$iv.get(key);
        if(value$iv == null && !$receiver$iv.containsKey(key))
            throw (Throwable)new NoSuchElementException((new StringBuilder()).append("Key ").append(key).append(" is missing in the map.").toString());
        else
            return (Object)value$iv;
    }

    public static final Map withDefault(Map $receiver, Function1 defaultValue)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        Map map = $receiver;
        return (map instanceof MapWithDefault) ? MapsKt.withDefault(((MapWithDefault)$receiver).getMap(), defaultValue) : (Map)new MapWithDefaultImpl($receiver, defaultValue);
    }

    public static final Map withDefaultMutable(Map $receiver, Function1 defaultValue)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        Map map = $receiver;
        return (map instanceof MutableMapWithDefault) ? MapsKt.withDefaultMutable(((MutableMapWithDefault)$receiver).getMap(), defaultValue) : (Map)new MutableMapWithDefaultImpl($receiver, defaultValue);
    }

    public MapsKt__MapWithDefaultKt()
    {
    }
}
