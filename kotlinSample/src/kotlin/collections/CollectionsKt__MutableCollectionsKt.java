// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MutableCollections.kt

package kotlin.collections;

import java.util.*;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.collections:
//            CollectionsKt__IteratorsKt, CollectionsKt, ArraysKt

class CollectionsKt__MutableCollectionsKt extends CollectionsKt__IteratorsKt
{

    private static final boolean remove(Collection $receiver, Object element)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return TypeIntrinsics.asMutableCollection($receiver).remove(element);
    }

    private static final boolean removeAll(Collection $receiver, Collection elements)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return TypeIntrinsics.asMutableCollection($receiver).removeAll(elements);
    }

    private static final boolean retainAll(Collection $receiver, Collection elements)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return TypeIntrinsics.asMutableCollection($receiver).retainAll(elements);
    }

    /**
     * @deprecated Method remove is deprecated
     */

    private static final Object remove(List $receiver, int index)
    {
        return $receiver.remove(index);
    }

    private static final void plusAssign(Collection $receiver, Object element)
    {
        $receiver.add(element);
    }

    private static final void plusAssign(Collection $receiver, Iterable elements)
    {
        CollectionsKt.addAll($receiver, elements);
    }

    private static final void plusAssign(Collection $receiver, Object elements[])
    {
        CollectionsKt.addAll($receiver, elements);
    }

    private static final void plusAssign(Collection $receiver, Sequence elements)
    {
        CollectionsKt.addAll($receiver, elements);
    }

    private static final void minusAssign(Collection $receiver, Object element)
    {
        $receiver.remove(element);
    }

    private static final void minusAssign(Collection $receiver, Iterable elements)
    {
        CollectionsKt.removeAll($receiver, elements);
    }

    private static final void minusAssign(Collection $receiver, Object elements[])
    {
        CollectionsKt.removeAll($receiver, elements);
    }

    private static final void minusAssign(Collection $receiver, Sequence elements)
    {
        CollectionsKt.removeAll($receiver, elements);
    }

    public static final boolean addAll(Collection $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        Iterable iterable = elements;
        if(iterable instanceof Collection)
            return $receiver.addAll((Collection)elements);
        boolean result = false;
        Iterator iterator = elements.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object item = iterator.next();
            if($receiver.add(item))
                result = true;
        } while(true);
        return result;
    }

    public static final boolean addAll(Collection $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        boolean result = false;
        Iterator iterator = elements.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object item = iterator.next();
            if($receiver.add(item))
                result = true;
        } while(true);
        return result;
    }

    public static final boolean addAll(Collection $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return $receiver.addAll((Collection)ArraysKt.asList(elements));
    }

    public static final boolean removeAll(Iterable $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($receiver, predicate, true);
    }

    public static final boolean retainAll(Iterable $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($receiver, predicate, false);
    }

    private static final boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable $receiver, Function1 predicate, boolean predicateResultToRemove)
    {
        kotlin.jvm.internal.Ref.BooleanRef result = new kotlin.jvm.internal.Ref.BooleanRef();
        result.element = false;
        Iterator iterator = $receiver.iterator();
        Iterator $receiver = (Iterator)iterator;
        do
        {
            if(!$receiver.hasNext())
                break;
            if(((Boolean)predicate.invoke($receiver.next())).booleanValue() == predicateResultToRemove)
            {
                $receiver.remove();
                result.element = true;
            }
        } while(true);
        return result.element;
    }

    public static final boolean removeAll(List $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($receiver, predicate, true);
    }

    public static final boolean retainAll(List $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt($receiver, predicate, false);
    }

    private static final boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List $receiver, Function1 predicate, boolean predicateResultToRemove)
    {
        int removeIndex;
        int i;
        int j;
        IntProgression intprogression;
        if(!($receiver instanceof RandomAccess))
        {
            if($receiver == null)
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
            return filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable($receiver), predicate, predicateResultToRemove);
        }
        int writeIndex = 0;
        int readIndex = 0;
        i = CollectionsKt.getLastIndex($receiver);
        if(readIndex <= i)
            do
            {
                Object element = $receiver.get(readIndex);
                if(((Boolean)predicate.invoke(element)).booleanValue() != predicateResultToRemove)
                {
                    if(writeIndex != readIndex)
                        $receiver.set(writeIndex, element);
                    writeIndex++;
                }
                if(readIndex == i)
                    break;
                readIndex++;
            } while(true);
        if(writeIndex >= $receiver.size())
            break MISSING_BLOCK_LABEL_193;
        intprogression = RangesKt.downTo(CollectionsKt.getLastIndex($receiver), writeIndex);
        removeIndex = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        removeIndex;
        i;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_162;
        JVM INSTR icmpgt 191;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_165;
_L2:
        break MISSING_BLOCK_LABEL_191;
        JVM INSTR icmplt 191;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_165;
_L4:
        break MISSING_BLOCK_LABEL_191;
        do
        {
            $receiver.remove(removeIndex);
            if(removeIndex == i)
                break;
            removeIndex += j;
        } while(true);
        return true;
        return false;
    }

    public static final boolean removeAll(Collection $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        Collection collection = $receiver;
        Collection collection1 = CollectionsKt.convertToSetForSetOperationWith(elements, (Iterable)$receiver);
        if(collection == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return TypeIntrinsics.asMutableCollection(collection).removeAll(collection1);
    }

    public static final boolean removeAll(Collection $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        HashSet set = SequencesKt.toHashSet(elements);
        Collection collection = (Collection)set;
        return (!collection.isEmpty()) && $receiver.removeAll((Collection)set);
    }

    public static final boolean removeAll(Collection $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        Object aobj[] = elements;
        Object aobj1[] = aobj;
        return (aobj1.length == 0) && $receiver.removeAll((Collection)ArraysKt.toHashSet(elements));
    }

    public static final boolean retainAll(Collection $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        Collection collection = $receiver;
        Collection collection1 = CollectionsKt.convertToSetForSetOperationWith(elements, (Iterable)$receiver);
        if(collection == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return TypeIntrinsics.asMutableCollection(collection).retainAll(collection1);
    }

    public static final boolean retainAll(Collection $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        Object aobj[] = elements;
        Object aobj1[] = aobj;
        if(aobj1.length != 0)
            return $receiver.retainAll((Collection)ArraysKt.toHashSet(elements));
        else
            return retainNothing$CollectionsKt__MutableCollectionsKt($receiver);
    }

    public static final boolean retainAll(Collection $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        HashSet set = SequencesKt.toHashSet(elements);
        Collection collection = (Collection)set;
        if(!collection.isEmpty())
            return $receiver.retainAll((Collection)set);
        else
            return retainNothing$CollectionsKt__MutableCollectionsKt($receiver);
    }

    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection $receiver)
    {
        Collection collection = $receiver;
        boolean result = !collection.isEmpty();
        $receiver.clear();
        return result;
    }

    public static final void sort(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver.size() > 1)
            Collections.sort($receiver);
    }

    public static final void sortWith(List $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        if($receiver.size() > 1)
            Collections.sort($receiver, comparator);
    }

    public CollectionsKt__MutableCollectionsKt()
    {
    }
}
