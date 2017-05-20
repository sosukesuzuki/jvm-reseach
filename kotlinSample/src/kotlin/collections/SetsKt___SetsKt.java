// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   _Sets.kt

package kotlin.collections;

import java.util.*;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

// Referenced classes of package kotlin.collections:
//            SetsKt__SetsKt, MapsKt, CollectionsKt, SetsKt

class SetsKt___SetsKt extends SetsKt__SetsKt
{

    public static final Set minus(Set $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($receiver.size()));
        kotlin.jvm.internal.Ref.BooleanRef removed = new kotlin.jvm.internal.Ref.BooleanRef();
        removed.element = false;
        Iterable iterable = (Iterable)$receiver;
        Iterator iterator = iterable.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv = iterator.next();
            Object it = element$iv;
            if(!removed.element && Intrinsics.areEqual(it, element))
            {
                removed.element = true;
                if(true)
                    continue;
            } else
            if(false)
                continue;
            ((Collection)result).add(element$iv);
        } while(true);
        return (Set)(Collection)result;
    }

    public static final Set minus(Set $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        LinkedHashSet result = new LinkedHashSet((Collection)$receiver);
        CollectionsKt.removeAll((Collection)result, elements);
        return (Set)result;
    }

    public static final Set minus(Set $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        Collection other = CollectionsKt.convertToSetForSetOperationWith(elements, (Iterable)$receiver);
        if(other.isEmpty())
            return CollectionsKt.toSet((Iterable)$receiver);
        if(other instanceof Set)
        {
            Iterable iterable = (Iterable)$receiver;
            Collection destination$iv = (Collection)new LinkedHashSet();
            Iterator iterator = iterable.iterator();
            do
            {
                if(!iterator.hasNext())
                    break;
                Object element$iv = iterator.next();
                Object it = element$iv;
                if(!other.contains(it))
                    destination$iv.add(element$iv);
            } while(true);
            return (Set)destination$iv;
        } else
        {
            LinkedHashSet result = new LinkedHashSet((Collection)$receiver);
            result.removeAll(other);
            return (Set)result;
        }
    }

    public static final Set minus(Set $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        LinkedHashSet result = new LinkedHashSet((Collection)$receiver);
        CollectionsKt.removeAll((Collection)result, elements);
        return (Set)result;
    }

    private static final Set minusElement(Set $receiver, Object element)
    {
        return SetsKt.minus($receiver, element);
    }

    public static final Set plus(Set $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($receiver.size() + 1));
        result.addAll((Collection)$receiver);
        result.add(element);
        return (Set)result;
    }

    public static final Set plus(Set $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($receiver.size() + elements.length));
        result.addAll((Collection)$receiver);
        CollectionsKt.addAll((Collection)result, elements);
        return (Set)result;
    }

    public static final Set plus(Set $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        JVM INSTR new #17  <Class LinkedHashSet>;
        JVM INSTR dup ;
        Integer integer1 = CollectionsKt.collectionSizeOrNull(elements);
        integer1;
        if(integer1 == null) goto _L2; else goto _L1
_L1:
        Integer integer;
        integer;
        LinkedHashSet linkedhashset1;
        linkedhashset1;
        LinkedHashSet linkedhashset;
        linkedhashset;
        int i;
        int it = ((Number)integer).intValue();
        i = $receiver.size() + it;
        linkedhashset;
        linkedhashset1;
        i;
          goto _L3
_L2:
        JVM INSTR pop ;
        $receiver.size() * 2;
_L3:
        MapsKt.mapCapacity();
        LinkedHashSet();
        LinkedHashSet result;
        result;
        result.addAll((Collection)$receiver);
        CollectionsKt.addAll((Collection)result, elements);
        return (Set)result;
    }

    public static final Set plus(Set $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        LinkedHashSet result = new LinkedHashSet(MapsKt.mapCapacity($receiver.size() * 2));
        result.addAll((Collection)$receiver);
        CollectionsKt.addAll((Collection)result, elements);
        return (Set)result;
    }

    private static final Set plusElement(Set $receiver, Object element)
    {
        return SetsKt.plus($receiver, element);
    }

    public SetsKt___SetsKt()
    {
    }
}
