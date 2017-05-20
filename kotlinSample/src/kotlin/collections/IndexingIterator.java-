// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Iterators.kt

package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.collections:
//            IndexedValue

public final class IndexingIterator
    implements Iterator, KMappedMarker
{

    private final int getIndex()
    {
        return index;
    }

    private final void setIndex(int <set-?>)
    {
        index = <set-?>;
    }

    public final boolean hasNext()
    {
        return iterator.hasNext();
    }

    public final IndexedValue next()
    {
        int i = index;
        index = index + 1;
        return new IndexedValue(i, iterator.next());
    }

    public volatile Object next()
    {
        return next();
    }

    public IndexingIterator(Iterator iterator)
    {
        Intrinsics.checkParameterIsNotNull(iterator, "iterator");
        super();
        this.iterator = iterator;
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    private int index;
    private final Iterator iterator;
}
