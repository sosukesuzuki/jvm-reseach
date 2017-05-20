// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Collections.kt

package kotlin.collections;

import java.util.*;
import kotlin.TypeCastException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

// Referenced classes of package kotlin.collections:
//            ArrayAsCollection, EmptyList, ArraysKt, CollectionsKt

class CollectionsKt__CollectionsKt
{

    public static final Collection asCollection(Object $receiver[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) ($receiver)), "$receiver");
        return (Collection)new ArrayAsCollection($receiver, false);
    }

    public static final List emptyList()
    {
        return (List)EmptyList.INSTANCE;
    }

    public static final transient List listOf(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return elements.length <= 0 ? CollectionsKt.emptyList() : ArraysKt.asList(elements);
    }

    private static final List listOf()
    {
        return CollectionsKt.emptyList();
    }

    public static final List listOf(Object element)
    {
        List list = Collections.singletonList(element);
        Intrinsics.checkExpressionValueIsNotNull(list, "Collections.singletonList(element)");
        return list;
    }

    public static final transient List mutableListOf(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return elements.length != 0 ? (List)new ArrayList((Collection)new ArrayAsCollection(elements, true)) : (List)new ArrayList();
    }

    public static final transient ArrayList arrayListOf(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return elements.length != 0 ? new ArrayList((Collection)new ArrayAsCollection(elements, true)) : new ArrayList();
    }

    public static final List listOfNotNull(Object element)
    {
        return element == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(element);
    }

    public static final transient List listOfNotNull(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return ArraysKt.filterNotNull(elements);
    }

    public static final IntRange getIndices(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        0;
        JVM INSTR new #85  <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        $receiver.size() - 1;
        IntRange();
        return;
    }

    public static final int getLastIndex(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.size() - 1;
    }

    private static final boolean isNotEmpty(Collection $receiver)
    {
        return !$receiver.isEmpty();
    }

    private static final Collection orEmpty(Collection $receiver)
    {
        return $receiver == null ? (Collection)CollectionsKt.emptyList() : $receiver;
    }

    private static final List orEmpty(List $receiver)
    {
        return $receiver == null ? CollectionsKt.emptyList() : $receiver;
    }

    private static final List toList(Enumeration $receiver)
    {
        List list = (List)Collections.list($receiver);
        Intrinsics.checkExpressionValueIsNotNull(list, "Collections.list(this)");
        return list;
    }

    private static final boolean containsAll(Collection $receiver, Collection elements)
    {
        return $receiver.containsAll(elements);
    }

    public static final List optimizeReadOnlyList(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver.size();
        List list;
        JVM INSTR lookupswitch 2: default 59
    //                   0: 40
    //                   1: 46;
           goto _L1 _L2 _L3
_L2:
        list = CollectionsKt.emptyList();
          goto _L4
_L3:
        list = CollectionsKt.listOf($receiver.get(0));
          goto _L4
_L1:
        list = $receiver;
_L4:
        return list;
    }

    private static final Object[] copyToArrayOfAny$CollectionsKt__CollectionsKt(Object $receiver[], boolean isVarargs)
    {
        if(!isVarargs || !Intrinsics.areEqual(((Object) ($receiver)).getClass(), [Ljava/lang/Object;))
            break MISSING_BLOCK_LABEL_37;
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        (Object[]);
        break MISSING_BLOCK_LABEL_51;
        Object aobj[] = Arrays.copyOf($receiver, $receiver.length, [Ljava/lang/Object;);
        aobj;
        Intrinsics.checkExpressionValueIsNotNull(((Object) (aobj)), "Arrays.copyOf(this, this\u2026 Array<Any?>::class.java)");
        return;
    }

    public static final int binarySearch(List $receiver, Comparable element, int fromIndex, int toIndex)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        rangeCheck$CollectionsKt__CollectionsKt($receiver.size(), fromIndex, toIndex);
        int low = fromIndex;
        for(int high = toIndex - 1; low <= high;)
        {
            int mid = low + high >>> 1;
            Comparable midVal = (Comparable)$receiver.get(mid);
            int cmp = ComparisonsKt.compareValues(midVal, element);
            if(cmp < 0)
                low = mid + 1;
            else
            if(cmp > 0)
                high = mid - 1;
            else
                return mid;
        }

        return -(low + 1);
    }

    public static volatile int binarySearch$default(List list, Comparable comparable, int i, int j, int k, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        if((k & 2) != 0)
            i = 0;
        if((k & 4) != 0)
            j = list.size();
        return CollectionsKt.binarySearch(list, comparable, i, j);
    }

    public static final int binarySearch(List $receiver, Object element, Comparator comparator, int fromIndex, int toIndex)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        rangeCheck$CollectionsKt__CollectionsKt($receiver.size(), fromIndex, toIndex);
        int low = fromIndex;
        for(int high = toIndex - 1; low <= high;)
        {
            int mid = low + high >>> 1;
            Object midVal = $receiver.get(mid);
            int cmp = comparator.compare(midVal, element);
            if(cmp < 0)
                low = mid + 1;
            else
            if(cmp > 0)
                high = mid - 1;
            else
                return mid;
        }

        return -(low + 1);
    }

    public static volatile int binarySearch$default(List list, Object obj, Comparator comparator, int i, int j, int k, Object obj1)
    {
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        if((k & 4) != 0)
            i = 0;
        if((k & 8) != 0)
            j = list.size();
        return CollectionsKt.binarySearch(list, obj, comparator, i, j);
    }

    public static final int binarySearchBy(List $receiver, Comparable key, int fromIndex, int toIndex, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        return CollectionsKt.binarySearch($receiver, fromIndex, toIndex, (Function1)new Function1(selector, key) {

            public volatile Object invoke(Object obj)
            {
                return Integer.valueOf(invoke(obj));
            }

            public final int invoke(Object it)
            {
                return ComparisonsKt.compareValues((Comparable)$selector.invoke(it), $key);
            }

            final Function1 $selector;
            final Comparable $key;

            public 
            {
                $selector = function1;
                $key = comparable;
                super(1);
            }
        }
);
    }

    public static volatile int binarySearchBy$default(List $receiver, Comparable key, int fromIndex, int toIndex, Function1 selector, int $i$f$binarySearchBy, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearchBy");
        if(($i$f$binarySearchBy & 2) != 0)
            fromIndex = 0;
        if(($i$f$binarySearchBy & 4) != 0)
            toIndex = $receiver.size();
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        return CollectionsKt.binarySearch($receiver, fromIndex, toIndex, (Function1)new binarySearchBy._cls1(selector, key));
    }

    public static final int binarySearch(List $receiver, int fromIndex, int toIndex, Function1 comparison)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparison, "comparison");
        rangeCheck$CollectionsKt__CollectionsKt($receiver.size(), fromIndex, toIndex);
        int low = fromIndex;
        for(int high = toIndex - 1; low <= high;)
        {
            int mid = low + high >>> 1;
            Object midVal = $receiver.get(mid);
            int cmp = ((Number)comparison.invoke(midVal)).intValue();
            if(cmp < 0)
                low = mid + 1;
            else
            if(cmp > 0)
                high = mid - 1;
            else
                return mid;
        }

        return -(low + 1);
    }

    public static volatile int binarySearch$default(List list, int i, int j, Function1 function1, int k, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        if((k & 1) != 0)
            i = 0;
        if((k & 2) != 0)
            j = list.size();
        return CollectionsKt.binarySearch(list, i, j, function1);
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int size, int fromIndex, int toIndex)
    {
        if(fromIndex > toIndex)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("fromIndex (").append(fromIndex).append(") is greater than toIndex (").append(toIndex).append(").").toString());
        if(fromIndex < 0)
            throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("fromIndex (").append(fromIndex).append(") is less than zero.").toString());
        if(toIndex > size)
            throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("toIndex (").append(toIndex).append(") is greater than size (").append(size).append(").").toString());
        else
            return;
    }

    public CollectionsKt__CollectionsKt()
    {
    }

}
