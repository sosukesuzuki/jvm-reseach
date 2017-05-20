// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Iterators.kt

package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.collections:
//            CollectionsKt__IterablesKt, IndexingIterator

class CollectionsKt__IteratorsKt extends CollectionsKt__IterablesKt
{

    public static final Iterator iterator(Enumeration $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (Iterator)new Iterator($receiver) {

            public boolean hasNext()
            {
                return receiver$0.hasMoreElements();
            }

            public Object next()
            {
                return receiver$0.nextElement();
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            final Enumeration receiver$0;

            
            {
                receiver$0 = $receiver;
                super();
            }
        }
;
    }

    private static final Iterator iterator(Iterator $receiver)
    {
        return $receiver;
    }

    public static final Iterator withIndex(Iterator $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (Iterator)new IndexingIterator($receiver);
    }

    public static final void forEach(Iterator $receiver, Function1 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Iterator iterator2 = $receiver;
        Object element;
        for(Iterator iterator1 = iterator2; iterator1.hasNext(); operation.invoke(element))
            element = iterator1.next();

    }

    public CollectionsKt__IteratorsKt()
    {
    }
}
