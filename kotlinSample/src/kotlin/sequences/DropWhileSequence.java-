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
//            Sequence

public final class DropWhileSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final Iterator getIterator()
            {
                return iterator;
            }

            public final int getDropState()
            {
                return dropState;
            }

            public final void setDropState(int <set-?>)
            {
                dropState = <set-?>;
            }

            public final Object getNextItem()
            {
                return nextItem;
            }

            public final void setNextItem(Object <set-?>)
            {
                nextItem = <set-?>;
            }

            private final void drop()
            {
                while(iterator.hasNext()) 
                {
                    Object item = iterator.next();
                    if(!((Boolean)predicate.invoke(item)).booleanValue())
                    {
                        nextItem = item;
                        dropState = 1;
                        return;
                    }
                }
                dropState = 0;
            }

            public Object next()
            {
                if(dropState == -1)
                    drop();
                if(dropState == 1)
                {
                    Object result = (Object)nextItem;
                    nextItem = null;
                    dropState = 0;
                    return result;
                } else
                {
                    return iterator.next();
                }
            }

            public boolean hasNext()
            {
                if(dropState == -1)
                    drop();
                return dropState == 1 || iterator.hasNext();
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private final Iterator iterator;
            private int dropState;
            private Object nextItem;
            final DropWhileSequence this$0;

            
            {
                this$0 = $outer;
                super();
                iterator = $outer.sequence.iterator();
                dropState = -1;
            }
        }
;
    }

    public DropWhileSequence(Sequence sequence, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        super();
        this.sequence = sequence;
        this.predicate = predicate;
    }

    private final Sequence sequence;
    private final Function1 predicate;


}
