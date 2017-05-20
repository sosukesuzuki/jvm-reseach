// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MapsJVM.kt

package kotlin.collections;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//            MapsKt__MapWithDefaultKt, MapsKt

class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt
{

    private static final void set(Map $receiver, Object key, Object value)
    {
        $receiver.put(key, value);
    }

    public static final Object getOrPut(ConcurrentMap $receiver, Object key, Function0 defaultValue)
    {
        Object obj1;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        obj1 = $receiver.get(key);
        obj1;
        if(obj1 == null) goto _L2; else goto _L1
_L2:
        JVM INSTR pop ;
        Object default;
        Object obj2;
        Object obj = defaultValue.invoke();
        default = obj;
        obj2 = $receiver.putIfAbsent(key, default);
        obj2 == null ? default : obj2;
_L1:
        return;
    }

    public static final SortedMap toSortedMap(Map $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (SortedMap)new TreeMap($receiver);
    }

    public static final SortedMap toSortedMap(Map $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        TreeMap treemap = new TreeMap(comparator);
        TreeMap $receiver = (TreeMap)treemap;
        $receiver.putAll($receiver);
        return (SortedMap)treemap;
    }

    public static final transient SortedMap sortedMapOf(Pair pairs[])
    {
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        TreeMap treemap = new TreeMap();
        TreeMap $receiver = (TreeMap)treemap;
        MapsKt.putAll((Map)$receiver, pairs);
        return (SortedMap)treemap;
    }

    private static final Properties toProperties(Map $receiver)
    {
        Properties properties = new Properties();
        Properties $receiver = (Properties)properties;
        $receiver.putAll($receiver);
        return (Properties)properties;
    }

    public MapsKt__MapsJVMKt()
    {
    }
}
