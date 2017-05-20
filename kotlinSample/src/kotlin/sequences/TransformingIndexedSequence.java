// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.sequences:
//            Sequence

public final class TransformingIndexedSequence
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

            public Object next()
            {
                int i = index;
                index = index + 1;
                return transformer.invoke(Integer.valueOf(i), iterator.next());
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
            final TransformingIndexedSequence this$0;

            
            {
                this$0 = $outer;
                super();
                iterator = $outer.sequence.iterator();
            }
        }
;
    }

    public TransformingIndexedSequence(Sequence sequence, Function2 transformer)
    {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        Intrinsics.checkParameterIsNotNull(transformer, "transformer");
        super();
        this.sequence = sequence;
        this.transformer = transformer;
    }

    private final Sequence sequence;
    private final Function2 transformer;


}
