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
//            Sequence, DropTakeSequence, SequencesKt

public final class SubSequence
    implements Sequence, DropTakeSequence
{

    private final int getCount()
    {
        return endIndex - startIndex;
    }

    public Sequence drop(int n)
    {
        return n < getCount() ? (Sequence)new SubSequence(sequence, startIndex + n, endIndex) : SequencesKt.emptySequence();
    }

    public Sequence take(int n)
    {
        return n < getCount() ? (Sequence)new SubSequence(sequence, startIndex, startIndex + n) : (Sequence)this;
    }

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final Iterator getIterator()
            {
                return iterator;
            }

            public final int getPosition()
            {
                return position;
            }

            public final void setPosition(int <set-?>)
            {
                position = <set-?>;
            }

            private final void drop()
            {
                while(position < startIndex && iterator.hasNext()) 
                {
                    iterator.next();
                    int i = position;
                    position = position + 1;
                    int _tmp = i;
                }
            }

            public boolean hasNext()
            {
                drop();
                return position < endIndex && iterator.hasNext();
            }

            public Object next()
            {
                drop();
                if(position >= endIndex)
                {
                    throw (Throwable)new NoSuchElementException();
                } else
                {
                    int i = position;
                    position = position + 1;
                    int _tmp = i;
                    return iterator.next();
                }
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private final Iterator iterator;
            private int position;
            final SubSequence this$0;

            
            {
                this$0 = $outer;
                super();
                iterator = $outer.sequence.iterator();
            }
        }
;
    }

    public SubSequence(Sequence sequence, int startIndex, int endIndex)
    {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        super();
        this.sequence = sequence;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        boolean flag = this.startIndex >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("startIndex should be non-negative, but is ").append(this.startIndex).toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        }
        flag = this.endIndex >= 0;
        if(!flag)
        {
            String s1 = (new StringBuilder()).append("endIndex should be non-negative, but is ").append(this.endIndex).toString();
            throw (Throwable)new IllegalArgumentException(s1.toString());
        }
        flag = this.endIndex >= this.startIndex;
        if(!flag)
        {
            String s2 = (new StringBuilder()).append("endIndex should be not less than startIndex, but was ").append(this.endIndex).append(" < ").append(this.startIndex).toString();
            throw (Throwable)new IllegalArgumentException(s2.toString());
        } else
        {
            return;
        }
    }

    private final Sequence sequence;
    private final int startIndex;
    private final int endIndex;



}
