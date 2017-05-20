// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.sequences:
//            Sequence, DropTakeSequence, SubSequence

public final class DropSequence
    implements Sequence, DropTakeSequence
{

    public Sequence drop(int n)
    {
        return (Sequence)new DropSequence(sequence, count + n);
    }

    public Sequence take(int n)
    {
        return (Sequence)new SubSequence(sequence, count, count + n);
    }

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final Iterator getIterator()
            {
                return iterator;
            }

            public final int getLeft()
            {
                return left;
            }

            public final void setLeft(int <set-?>)
            {
                left = <set-?>;
            }

            private final void drop()
            {
                while(left > 0 && iterator.hasNext()) 
                {
                    iterator.next();
                    int i = left;
                    left = left + -1;
                    int _tmp = i;
                }
            }

            public Object next()
            {
                drop();
                return iterator.next();
            }

            public boolean hasNext()
            {
                drop();
                return iterator.hasNext();
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private final Iterator iterator;
            private int left;
            final DropSequence this$0;

            
            {
                this$0 = $outer;
                super();
                iterator = $outer.sequence.iterator();
                left = $outer.count;
            }
        }
;
    }

    public DropSequence(Sequence sequence, int count)
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
