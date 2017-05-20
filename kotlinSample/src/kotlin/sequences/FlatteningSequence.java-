// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.sequences:
//            Sequence

public final class FlatteningSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final Iterator getIterator()
            {
                return iterator;
            }

            public final Iterator getItemIterator()
            {
                return itemIterator;
            }

            public final void setItemIterator(Iterator <set-?>)
            {
                itemIterator = <set-?>;
            }

            public Object next()
            {
                if(!ensureItemIterator())
                    throw (Throwable)new NoSuchElementException();
                itemIterator;
                if(itemIterator == null)
                    Intrinsics.throwNpe();
                next();
                return;
            }

            public boolean hasNext()
            {
                return ensureItemIterator();
            }

            private final boolean ensureItemIterator()
            {
                itemIterator;
                if(itemIterator == null) goto _L2; else goto _L1
_L1:
                hasNext();
                Boolean.valueOf();
                  goto _L3
_L2:
                JVM INSTR pop ;
                null;
_L3:
                Boolean.valueOf(false);
                Intrinsics.areEqual();
                JVM INSTR ifeq 39;
                   goto _L4 _L5
_L4:
_L5:
                for(itemIterator = (Iterator)null; itemIterator == null;)
                {
                    if(!iterator.hasNext())
                        return false;
                    Object element = iterator.next();
                    Iterator nextItemIterator = (Iterator)FlatteningSequence.this.iterator.invoke(transformer.invoke(element));
                    if(nextItemIterator.hasNext())
                    {
                        itemIterator = nextItemIterator;
                        return true;
                    }
                }

                return true;
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private final Iterator iterator;
            private Iterator itemIterator;
            final FlatteningSequence this$0;

            
            {
                this$0 = $outer;
                super();
                iterator = $outer.sequence.iterator();
            }
        }
;
    }

    public FlatteningSequence(Sequence sequence, Function1 transformer, Function1 iterator)
    {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        Intrinsics.checkParameterIsNotNull(transformer, "transformer");
        Intrinsics.checkParameterIsNotNull(iterator, "iterator");
        super();
        this.sequence = sequence;
        this.transformer = transformer;
        this.iterator = iterator;
    }

    private final Sequence sequence;
    private final Function1 transformer;
    private final Function1 iterator;



}
