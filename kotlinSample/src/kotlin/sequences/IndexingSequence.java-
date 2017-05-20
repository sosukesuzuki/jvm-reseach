// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.sequences:
//            Sequence

public final class IndexingSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final Iterator getIterator()
            {
                return iterator;
            }

            public final int getIndex()
            {
                return index;
            }

            public final void setIndex(int <set-?>)
            {
                index = <set-?>;
            }

            public IndexedValue next()
            {
                int i = index;
                index = index + 1;
                return new IndexedValue(i, iterator.next());
            }

            public volatile Object next()
            {
                return next();
            }

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private final Iterator iterator;
            private int index;
            final IndexingSequence this$0;

            
            {
                this$0 = $outer;
                super();
                iterator = $outer.sequence.iterator();
            }
        }
;
    }

    public IndexingSequence(Sequence sequence)
    {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        super();
        this.sequence = sequence;
    }

    private final Sequence sequence;

}
