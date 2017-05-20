// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.sequences:
//            Sequence

public final class FilteringSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final Iterator getIterator()
            {
                return iterator;
            }

            public final int getNextState()
            {
                return nextState;
            }

            public final void setNextState(int <set-?>)
            {
                nextState = <set-?>;
            }

            public final Object getNextItem()
            {
                return nextItem;
            }

            public final void setNextItem(Object <set-?>)
            {
                nextItem = <set-?>;
            }

            private final void calcNext()
            {
                while(iterator.hasNext()) 
                {
                    Object item = iterator.next();
                    if(((Boolean)predicate.invoke(item)).booleanValue() == sendWhen)
                    {
                        nextItem = item;
                        nextState = 1;
                        return;
                    }
                }
                nextState = 0;
            }

            public Object next()
            {
                if(nextState == -1)
                    calcNext();
                if(nextState == 0)
                {
                    throw (Throwable)new NoSuchElementException();
                } else
                {
                    Object result = nextItem;
                    nextItem = null;
                    nextState = -1;
                    return (Object)result;
                }
            }

            public boolean hasNext()
            {
                if(nextState == -1)
                    calcNext();
                return nextState == 1;
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private final Iterator iterator;
            private int nextState;
            private Object nextItem;
            final FilteringSequence this$0;

            
            {
                this$0 = $outer;
                super();
                iterator = $outer.sequence.iterator();
                nextState = -1;
            }
        }
;
    }

    public FilteringSequence(Sequence sequence, boolean sendWhen, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        super();
        this.sequence = sequence;
        this.sendWhen = sendWhen;
        this.predicate = predicate;
    }

    public FilteringSequence(Sequence sequence1, boolean flag, Function1 function1, int i, DefaultConstructorMarker defaultconstructormarker)
    {
        if((i & 2) != 0)
            flag = true;
        this(sequence1, flag, function1);
    }

    private final Sequence sequence;
    private final boolean sendWhen;
    private final Function1 predicate;



}
