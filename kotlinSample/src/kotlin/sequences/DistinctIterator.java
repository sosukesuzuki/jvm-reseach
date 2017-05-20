// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class DistinctIterator extends AbstractIterator
{

    private final HashSet getObserved()
    {
        return observed;
    }

    protected void computeNext()
    {
        while(source.hasNext()) 
        {
            Object next = source.next();
            Object key = keySelector.invoke(next);
            if(observed.add(key))
            {
                setNext(next);
                return;
            }
        }
        done();
    }

    public DistinctIterator(Iterator source, Function1 keySelector)
    {
        Intrinsics.checkParameterIsNotNull(source, "source");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        super();
        this.source = source;
        this.keySelector = keySelector;
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    private final HashSet observed = new HashSet();
    private final Iterator source;
    private final Function1 keySelector;
}
