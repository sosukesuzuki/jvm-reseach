// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sets.kt

package kotlin.collections;

import java.util.*;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//            EmptySet, ArraysKt, SetsKt, MapsKt

class SetsKt__SetsKt
{

    public static final Set emptySet()
    {
        return (Set)EmptySet.INSTANCE;
    }

    public static final transient Set setOf(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return elements.length <= 0 ? SetsKt.emptySet() : ArraysKt.toSet(elements);
    }

    private static final Set setOf()
    {
        return SetsKt.emptySet();
    }

    public static final transient Set mutableSetOf(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return (Set)ArraysKt.toCollection(elements, (Collection)new LinkedHashSet(MapsKt.mapCapacity(elements.length)));
    }

    public static final transient HashSet hashSetOf(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return (HashSet)ArraysKt.toCollection(elements, (Collection)new HashSet(MapsKt.mapCapacity(elements.length)));
    }

    public static final transient LinkedHashSet linkedSetOf(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return (LinkedHashSet)ArraysKt.toCollection(elements, (Collection)new LinkedHashSet(MapsKt.mapCapacity(elements.length)));
    }

    private static final Set orEmpty(Set $receiver)
    {
        return $receiver == null ? SetsKt.emptySet() : $receiver;
    }

    public static final Set setOf(Object element)
    {
        Set set = Collections.singleton(element);
        Intrinsics.checkExpressionValueIsNotNull(set, "Collections.singleton(element)");
        return set;
    }

    public static final transient TreeSet sortedSetOf(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return (TreeSet)ArraysKt.toCollection(elements, (Collection)new TreeSet());
    }

    public static final transient TreeSet sortedSetOf(Comparator comparator, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return (TreeSet)ArraysKt.toCollection(elements, (Collection)new TreeSet(comparator));
    }

    public static final Set optimizeReadOnlySet(Set $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver.size();
        Set set;
        JVM INSTR lookupswitch 2: default 63
    //                   0: 40
    //                   1: 46;
           goto _L1 _L2 _L3
_L2:
        set = SetsKt.emptySet();
          goto _L4
_L3:
        set = SetsKt.setOf($receiver.iterator().next());
          goto _L4
_L1:
        set = $receiver;
_L4:
        return set;
    }

    public SetsKt__SetsKt()
    {
    }
}
