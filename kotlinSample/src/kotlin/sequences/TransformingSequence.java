// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.sequences:
//            Sequence, FlatteningSequence

public final class TransformingSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final Iterator getIterator()
            {
                return iterator;
            }

            public Object next()
            {
                return transformer.invoke(iterator.next());
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
            final TransformingSequence this$0;

            
            {
                this$0 = $outer;
                super();
                iterator = $outer.sequence.iterator();
            }
        }
;
    }

    public final Sequence flatten$kotlin_stdlib(Function1 iterator)
    {
        Intrinsics.checkParameterIsNotNull(iterator, "iterator");
        return (Sequence)new FlatteningSequence(sequence, transformer, iterator);
    }

    public TransformingSequence(Sequence sequence, Function1 transformer)
    {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        Intrinsics.checkParameterIsNotNull(transformer, "transformer");
        super();
        this.sequence = sequence;
        this.transformer = transformer;
    }

    private final Sequence sequence;
    private final Function1 transformer;


}
