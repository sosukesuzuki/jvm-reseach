// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Maps.kt

package kotlin.collections;

import java.util.*;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.*;
import kotlin.sequences.Sequence;

// Referenced classes of package kotlin.collections:
//            MapsKt__MapsJVMKt, EmptyMap, MapsKt

class MapsKt__MapsKt extends MapsKt__MapsJVMKt
{

    public static final Map emptyMap()
    {
        EmptyMap.INSTANCE;
        if(EmptyMap.INSTANCE == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        (Map);
        return;
    }

    public static final transient Map mapOf(Pair pairs[])
    {
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        return ((Object[])pairs).length <= 0 ? MapsKt.emptyMap() : (Map)MapsKt.linkedMapOf((Pair[])Arrays.copyOf(pairs, pairs.length));
    }

    private static final Map mapOf()
    {
        return MapsKt.emptyMap();
    }

    public static final Map mapOf(Pair pair)
    {
        Intrinsics.checkParameterIsNotNull(pair, "pair");
        Map map = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        Intrinsics.checkExpressionValueIsNotNull(map, "Collections.singletonMap(pair.first, pair.second)");
        return map;
    }

    public static final transient Map mutableMapOf(Pair pairs[])
    {
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        LinkedHashMap linkedhashmap = new LinkedHashMap(MapsKt.mapCapacity(((Object[])pairs).length));
        LinkedHashMap $receiver = (LinkedHashMap)linkedhashmap;
        MapsKt.putAll((Map)$receiver, pairs);
        return (Map)linkedhashmap;
    }

    public static final transient HashMap hashMapOf(Pair pairs[])
    {
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        HashMap hashmap = new HashMap(MapsKt.mapCapacity(((Object[])pairs).length));
        HashMap $receiver = (HashMap)hashmap;
        MapsKt.putAll((Map)$receiver, pairs);
        return (HashMap)hashmap;
    }

    public static final transient LinkedHashMap linkedMapOf(Pair pairs[])
    {
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        LinkedHashMap linkedhashmap = new LinkedHashMap(MapsKt.mapCapacity(((Object[])pairs).length));
        LinkedHashMap $receiver = (LinkedHashMap)linkedhashmap;
        MapsKt.putAll((Map)$receiver, pairs);
        return (LinkedHashMap)linkedhashmap;
    }

    public static final int mapCapacity(int expectedSize)
    {
        if(expectedSize < 3)
            return expectedSize + 1;
        if(expectedSize < INT_MAX_POWER_OF_TWO)
            return expectedSize + expectedSize / 3;
        else
            return IntCompanionObject.MAX_VALUE;
    }

    private static final boolean isNotEmpty(Map $receiver)
    {
        return !$receiver.isEmpty();
    }

    private static final Map orEmpty(Map $receiver)
    {
        return $receiver == null ? MapsKt.emptyMap() : $receiver;
    }

    private static final boolean contains(Map $receiver, Object key)
    {
        Map map = $receiver;
        if(map == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return ((Map)map).containsKey(key);
    }

    private static final Object get(Map $receiver, Object key)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        return ((Map)$receiver).get(key);
    }

    private static final boolean containsKey(Map $receiver, Object key)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return ((Map)$receiver).containsKey(key);
    }

    private static final boolean containsValue(Map $receiver, Object value)
    {
        return $receiver.containsValue(value);
    }

    private static final Object remove(Map $receiver, Object key)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        return TypeIntrinsics.asMutableMap($receiver).remove(key);
    }

    private static final Object component1(java.util.Map.Entry $receiver)
    {
        return $receiver.getKey();
    }

    private static final Object component2(java.util.Map.Entry $receiver)
    {
        return $receiver.getValue();
    }

    private static final Pair toPair(java.util.Map.Entry $receiver)
    {
        return new Pair($receiver.getKey(), $receiver.getValue());
    }

    private static final Object getOrElse(Map $receiver, Object key, Function0 defaultValue)
    {
        Object obj = $receiver.get(key);
        return obj == null ? defaultValue.invoke() : obj;
    }

    public static final Object getOrElseNullable(Map $receiver, Object key, Function0 defaultValue)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        Object value = $receiver.get(key);
        if(value == null && !$receiver.containsKey(key))
            return defaultValue.invoke();
        else
            return (Object)value;
    }

    public static final Object getOrPut(Map $receiver, Object key, Function0 defaultValue)
    {
        Object value;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        value = $receiver.get(key);
        if(value != null) goto _L2; else goto _L1
_L1:
        Object answer;
        answer = defaultValue.invoke();
        $receiver.put(key, answer);
        answer;
          goto _L3
_L2:
        value;
_L3:
        return;
    }

    private static final Iterator iterator(Map $receiver)
    {
        return $receiver.entrySet().iterator();
    }

    private static final Iterator mutableIterator(Map $receiver)
    {
        return $receiver.entrySet().iterator();
    }

    public static final Map mapValuesTo(Map $receiver, Map destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable iterable = (Iterable)$receiver.entrySet();
        Object element$iv;
        Map map;
        Object obj;
        for(Iterator iterator1 = iterable.iterator(); iterator1.hasNext(); map.put(obj, transform.invoke(element$iv)))
        {
            element$iv = iterator1.next();
            java.util.Map.Entry entry = (java.util.Map.Entry)element$iv;
            map = destination;
            obj = entry.getKey();
        }

        return destination;
    }

    public static final Map mapKeysTo(Map $receiver, Map destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable iterable = (Iterable)$receiver.entrySet();
        Map map;
        Object obj;
        Object obj1;
        for(Iterator iterator1 = iterable.iterator(); iterator1.hasNext(); map.put(obj, obj1))
        {
            Object element$iv = iterator1.next();
            java.util.Map.Entry entry = (java.util.Map.Entry)element$iv;
            obj = transform.invoke(element$iv);
            map = destination;
            obj1 = entry.getValue();
        }

        return destination;
    }

    public static final void putAll(Map $receiver, Pair pairs[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        for(int i = 0; i < pairs.length; i++)
        {
            Pair pair = pairs[i];
            Object key = pair.component1();
            Object value = pair.component2();
            $receiver.put(key, value);
        }

    }

    public static final void putAll(Map $receiver, Iterable pairs)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        Object key;
        Object value;
        for(Iterator iterator1 = pairs.iterator(); iterator1.hasNext(); $receiver.put(key, value))
        {
            Pair pair = (Pair)iterator1.next();
            key = pair.component1();
            value = pair.component2();
        }

    }

    public static final void putAll(Map $receiver, Sequence pairs)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        Object key;
        Object value;
        for(Iterator iterator1 = pairs.iterator(); iterator1.hasNext(); $receiver.put(key, value))
        {
            Pair pair = (Pair)iterator1.next();
            key = pair.component1();
            value = pair.component2();
        }

    }

    public static final Map mapValues(Map $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Map map = $receiver;
        Map destination$iv = (Map)new LinkedHashMap(MapsKt.mapCapacity($receiver.size()));
        Iterable iterable = (Iterable)map.entrySet();
        Object element$iv$iv;
        Map map1;
        Object obj;
        for(Iterator iterator1 = iterable.iterator(); iterator1.hasNext(); map1.put(obj, transform.invoke(element$iv$iv)))
        {
            element$iv$iv = iterator1.next();
            java.util.Map.Entry entry = (java.util.Map.Entry)element$iv$iv;
            map1 = destination$iv;
            obj = entry.getKey();
        }

        return destination$iv;
    }

    public static final Map mapKeys(Map $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Map map = $receiver;
        Map destination$iv = (Map)new LinkedHashMap(MapsKt.mapCapacity($receiver.size()));
        Iterable iterable = (Iterable)map.entrySet();
        Object obj;
        Map map1;
        Object obj1;
        for(Iterator iterator1 = iterable.iterator(); iterator1.hasNext(); map1.put(obj, obj1))
        {
            Object element$iv$iv = iterator1.next();
            java.util.Map.Entry entry = (java.util.Map.Entry)element$iv$iv;
            obj = transform.invoke(element$iv$iv);
            map1 = destination$iv;
            obj1 = entry.getValue();
        }

        return destination$iv;
    }

    public static final Map filterKeys(Map $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        LinkedHashMap result = new LinkedHashMap();
        Map map = $receiver;
        Iterator iterator1 = map.entrySet().iterator();
        do
        {
            if(!iterator1.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            if(((Boolean)predicate.invoke(entry.getKey())).booleanValue())
                result.put(entry.getKey(), entry.getValue());
        } while(true);
        return (Map)result;
    }

    public static final Map filterValues(Map $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        LinkedHashMap result = new LinkedHashMap();
        Map map = $receiver;
        Iterator iterator1 = map.entrySet().iterator();
        do
        {
            if(!iterator1.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            if(((Boolean)predicate.invoke(entry.getValue())).booleanValue())
                result.put(entry.getKey(), entry.getValue());
        } while(true);
        return (Map)result;
    }

    public static final Map filterTo(Map $receiver, Map destination, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Map map = $receiver;
        Iterator iterator1 = map.entrySet().iterator();
        do
        {
            if(!iterator1.hasNext())
                break;
            java.util.Map.Entry element = (java.util.Map.Entry)iterator1.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                destination.put(element.getKey(), element.getValue());
        } while(true);
        return destination;
    }

    public static final Map filter(Map $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Map map = $receiver;
        Map destination$iv = (Map)new LinkedHashMap();
        Map map1 = map;
        Iterator iterator1 = map1.entrySet().iterator();
        do
        {
            if(!iterator1.hasNext())
                break;
            java.util.Map.Entry element$iv = (java.util.Map.Entry)iterator1.next();
            if(((Boolean)predicate.invoke(element$iv)).booleanValue())
                destination$iv.put(element$iv.getKey(), element$iv.getValue());
        } while(true);
        return destination$iv;
    }

    public static final Map filterNotTo(Map $receiver, Map destination, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Map map = $receiver;
        Iterator iterator1 = map.entrySet().iterator();
        do
        {
            if(!iterator1.hasNext())
                break;
            java.util.Map.Entry element = (java.util.Map.Entry)iterator1.next();
            if(!((Boolean)predicate.invoke(element)).booleanValue())
                destination.put(element.getKey(), element.getValue());
        } while(true);
        return destination;
    }

    public static final Map filterNot(Map $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Map map = $receiver;
        Map destination$iv = (Map)new LinkedHashMap();
        Map map1 = map;
        Iterator iterator1 = map1.entrySet().iterator();
        do
        {
            if(!iterator1.hasNext())
                break;
            java.util.Map.Entry element$iv = (java.util.Map.Entry)iterator1.next();
            if(!((Boolean)predicate.invoke(element$iv)).booleanValue())
                destination$iv.put(element$iv.getKey(), element$iv.getValue());
        } while(true);
        return destination$iv;
    }

    public static final Map toMap(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Map map;
        if($receiver instanceof Collection)
        {
            switch(((Collection)$receiver).size())
            {
            case 0: // '\0'
                map = MapsKt.emptyMap();
                break;

            case 1: // '\001'
                map = MapsKt.mapOf(($receiver instanceof List) ? (Pair)((List)$receiver).get(0) : (Pair)$receiver.iterator().next());
                break;

            default:
                map = MapsKt.toMap($receiver, (Map)new LinkedHashMap(MapsKt.mapCapacity(((Collection)$receiver).size())));
                break;
            }
            return map;
        } else
        {
            return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($receiver, (Map)new LinkedHashMap()));
        }
    }

    public static final Map toMap(Iterable $receiver, Map destination)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Map map = destination;
        Map $receiver = (Map)map;
        MapsKt.putAll($receiver, $receiver);
        return (Map)map;
    }

    public static final Map toMap(Pair $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Map map;
        switch(((Object[])$receiver).length)
        {
        case 0: // '\0'
            map = MapsKt.emptyMap();
            break;

        case 1: // '\001'
            map = MapsKt.mapOf($receiver[0]);
            break;

        default:
            map = MapsKt.toMap($receiver, (Map)new LinkedHashMap(MapsKt.mapCapacity(((Object[])$receiver).length)));
            break;
        }
        return map;
    }

    public static final Map toMap(Pair $receiver[], Map destination)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Map map = destination;
        Map $receiver = (Map)map;
        MapsKt.putAll($receiver, $receiver);
        return (Map)map;
    }

    public static final Map toMap(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return MapsKt.optimizeReadOnlyMap(MapsKt.toMap($receiver, (Map)new LinkedHashMap()));
    }

    public static final Map toMap(Sequence $receiver, Map destination)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Map map = destination;
        Map $receiver = (Map)map;
        MapsKt.putAll($receiver, $receiver);
        return (Map)map;
    }

    public static final Map plus(Map $receiver, Pair pair)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(pair, "pair");
        if(!$receiver.isEmpty()) goto _L2; else goto _L1
_L1:
        MapsKt.mapOf(pair);
          goto _L3
_L2:
        LinkedHashMap linkedhashmap;
        linkedhashmap = new LinkedHashMap($receiver);
        LinkedHashMap $receiver = (LinkedHashMap)linkedhashmap;
        $receiver.put(pair.getFirst(), pair.getSecond());
        (Map)linkedhashmap;
_L3:
        return;
    }

    public static final Map plus(Map $receiver, Iterable pairs)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        if(!$receiver.isEmpty()) goto _L2; else goto _L1
_L1:
        MapsKt.toMap(pairs);
          goto _L3
_L2:
        LinkedHashMap linkedhashmap;
        linkedhashmap = new LinkedHashMap($receiver);
        LinkedHashMap $receiver = (LinkedHashMap)linkedhashmap;
        MapsKt.putAll((Map)$receiver, pairs);
        (Map)linkedhashmap;
_L3:
        return;
    }

    public static final Map plus(Map $receiver, Pair pairs[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        if(!$receiver.isEmpty()) goto _L2; else goto _L1
_L1:
        MapsKt.toMap(pairs);
          goto _L3
_L2:
        LinkedHashMap linkedhashmap;
        linkedhashmap = new LinkedHashMap($receiver);
        LinkedHashMap $receiver = (LinkedHashMap)linkedhashmap;
        MapsKt.putAll((Map)$receiver, pairs);
        (Map)linkedhashmap;
_L3:
        return;
    }

    public static final Map plus(Map $receiver, Sequence pairs)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(pairs, "pairs");
        LinkedHashMap linkedhashmap = new LinkedHashMap($receiver);
        LinkedHashMap $receiver = (LinkedHashMap)linkedhashmap;
        MapsKt.putAll((Map)$receiver, pairs);
        return MapsKt.optimizeReadOnlyMap((Map)linkedhashmap);
    }

    public static final Map plus(Map $receiver, Map map)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(map, "map");
        LinkedHashMap linkedhashmap = new LinkedHashMap($receiver);
        LinkedHashMap $receiver = (LinkedHashMap)linkedhashmap;
        $receiver.putAll(map);
        return (Map)linkedhashmap;
    }

    private static final void plusAssign(Map $receiver, Pair pair)
    {
        $receiver.put(pair.getFirst(), pair.getSecond());
    }

    private static final void plusAssign(Map $receiver, Iterable pairs)
    {
        MapsKt.putAll($receiver, pairs);
    }

    private static final void plusAssign(Map $receiver, Pair pairs[])
    {
        MapsKt.putAll($receiver, pairs);
    }

    private static final void plusAssign(Map $receiver, Sequence pairs)
    {
        MapsKt.putAll($receiver, pairs);
    }

    private static final void plusAssign(Map $receiver, Map map)
    {
        $receiver.putAll(map);
    }

    public static final Map optimizeReadOnlyMap(Map $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver.size();
        Map map;
        JVM INSTR lookupswitch 2: default 53
    //                   0: 40
    //                   1: 46;
           goto _L1 _L2 _L3
_L2:
        map = MapsKt.emptyMap();
          goto _L4
_L3:
        map = MapsKt.toSingletonMap($receiver);
          goto _L4
_L1:
        map = $receiver;
_L4:
        return map;
    }

    public static final Map toSingletonMap(Map $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Object obj = $receiver.entrySet().iterator().next();
        java.util.Map.Entry $receiver = (java.util.Map.Entry)obj;
        Map map = Collections.singletonMap($receiver.getKey(), $receiver.getValue());
        Intrinsics.checkExpressionValueIsNotNull(map, "Collections.singletonMap(key, value)");
        Map map1 = (Map)map;
        Intrinsics.checkExpressionValueIsNotNull(map1, "with (entries.iterator()\u2026ingletonMap(key, value) }");
        return map1;
    }

    public MapsKt__MapsKt()
    {
    }

    private static final int INT_MAX_POWER_OF_TWO = 0x40000000;
}
