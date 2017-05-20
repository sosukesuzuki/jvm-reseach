// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Iterables.kt

package kotlin.collections;

import java.util.*;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.collections:
//            CollectionsKt__CollectionsKt, CollectionsKt

class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt
{

    private static final Iterable Iterable(Function0 iterator)
    {
        return (Iterable)new Iterable(iterator) {

            public Iterator iterator()
            {
                return (Iterator)$iterator.invoke();
            }

            final Function0 $iterator;

            public 
            {
                $iterator = $captured_local_variable$0;
                super();
            }
        }
;
    }

    public static final Integer collectionSizeOrNull(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ($receiver instanceof Collection) ? Integer.valueOf(((Collection)$receiver).size()) : (Integer)null;
    }

    public static final int collectionSizeOrDefault(Iterable $receiver, int default)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ($receiver instanceof Collection) ? ((Collection)$receiver).size() : default;
    }

    private static final boolean safeToConvertToSet$CollectionsKt__IterablesKt(Collection $receiver)
    {
        return $receiver.size() > 2 && ($receiver instanceof ArrayList);
    }

    public static final Collection convertToSetForSetOperationWith(Iterable $receiver, Iterable source)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(source, "source");
        Iterable iterable = $receiver;
        return (iterable instanceof Set) ? (Collection)$receiver : (iterable instanceof Collection) ? !(source instanceof Collection) || ((Collection)source).size() >= 2 ? safeToConvertToSet$CollectionsKt__IterablesKt((Collection)$receiver) ? (Collection)CollectionsKt.toHashSet($receiver) : (Collection)$receiver : (Collection)$receiver : (Collection)CollectionsKt.toHashSet($receiver);
    }

    public static final Collection convertToSetForSetOperation(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterable iterable = $receiver;
        return (iterable instanceof Set) ? (Collection)$receiver : (iterable instanceof Collection) ? safeToConvertToSet$CollectionsKt__IterablesKt((Collection)$receiver) ? (Collection)CollectionsKt.toHashSet($receiver) : (Collection)$receiver : (Collection)CollectionsKt.toHashSet($receiver);
    }

    public static final List flatten(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        ArrayList result = new ArrayList();
        Iterable element;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); CollectionsKt.addAll((Collection)result, element))
            element = (Iterable)iterator.next();

        return (List)result;
    }

    public static final Pair unzip(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        int expectedSize = CollectionsKt.collectionSizeOrDefault($receiver, 10);
        ArrayList listT = new ArrayList(expectedSize);
        ArrayList listR = new ArrayList(expectedSize);
        Pair pair;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); listR.add(pair.getSecond()))
        {
            pair = (Pair)iterator.next();
            listT.add(pair.getFirst());
        }

        return TuplesKt.to(listT, listR);
    }

    public CollectionsKt__IterablesKt()
    {
    }
}
