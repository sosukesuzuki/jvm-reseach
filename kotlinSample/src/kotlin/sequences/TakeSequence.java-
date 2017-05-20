// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.sequences:
//            Sequence, DropTakeSequence, SequencesKt, SubSequence

public final class TakeSequence
    implements Sequence, DropTakeSequence
{

    public Sequence drop(int n)
    {
        return n < count ? (Sequence)new SubSequence(sequence, n, count) : SequencesKt.emptySequence();
    }

    public Sequence take(int n)
    {
        return n < count ? (Sequence)new TakeSequence(sequence, n) : (Sequence)this;
    }

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final int getLeft()
            {
                return left;
            }

            public final void setLeft(int <set-?>)
            {
                left = <set-?>;
            }

            public final Iterator getIterator()
            {
                return iterator;
            }

            public Object next()
            {
                if(left == 0)
                {
                    throw (Throwable)new NoSuchElementException();
                } else
                {
                    int i = left;
                    left = left + -1;
                    int _tmp = i;
                    return iterator.next();
                }
            }

            public boolean hasNext()
            {
                return left > 0 && iterator.hasNext();
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private int left;
            private final Iterator iterator;
            final TakeSequence this$0;

            
            {
                this$0 = $outer;
                super();
                left = $outer.count;
                iterator = $outer.sequence.iterator();
            }
        }
;
    }

    public TakeSequence(Sequence sequence, int count)
    {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        super();
        this.sequence = sequence;
        this.count = count;
        boolean flag = this.count >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("count must be non-negative, but was ").append(this.count).append(".").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return;
        }
    }

    private final Sequence sequence;
    private final int count;


}
