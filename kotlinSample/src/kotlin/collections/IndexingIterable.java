// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Iterables.kt

package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.collections:
//            IndexingIterator

public final class IndexingIterable
    implements Iterable, KMappedMarker
{

    public Iterator iterator()
    {
        return (Iterator)new IndexingIterator((Iterator)iteratorFactory.invoke());
    }

    public IndexingIterable(Function0 iteratorFactory)
    {
        Intrinsics.checkParameterIsNotNull(iteratorFactory, "iteratorFactory");
        super();
        this.iteratorFactory = iteratorFactory;
    }

    private final Function0 iteratorFactory;
}
