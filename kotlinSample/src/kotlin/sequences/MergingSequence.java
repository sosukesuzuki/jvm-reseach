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

public final class MergingSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final Iterator getIterator1()
            {
                return iterator1;
            }

            public final Iterator getIterator2()
            {
                return iterator2;
            }

            public Object next()
            {
                return transform.invoke(iterator1.next(), iterator2.next());
            }

            public boolean hasNext()
            {
                return iterator1.hasNext() && iterator2.hasNext();
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private final Iterator iterator1;
            private final Iterator iterator2;
            final MergingSequence this$0;

            
            {
                this$0 = $outer;
                super();
                iterator1 = $outer.sequence1.iterator();
                iterator2 = $outer.sequence2.iterator();
            }
        }
;
    }

    public MergingSequence(Sequence sequence1, Sequence sequence2, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull(sequence1, "sequence1");
        Intrinsics.checkParameterIsNotNull(sequence2, "sequence2");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        super();
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
        this.transform = transform;
    }

    private final Sequence sequence1;
    private final Sequence sequence2;
    private final Function2 transform;



}
