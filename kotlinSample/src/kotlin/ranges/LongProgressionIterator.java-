// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProgressionIterators.kt

package kotlin.ranges;

import kotlin.collections.LongIterator;

public final class LongProgressionIterator extends LongIterator
{

    public boolean hasNext()
    {
        return hasNext;
    }

    public long nextLong()
    {
        long value = next;
        if(value == finalElement)
            hasNext = false;
        else
            next += step;
        return value;
    }

    public final long getStep()
    {
        return step;
    }

    public LongProgressionIterator(long first, long last, long step)
    {
        this.step = step;
        next = first;
        finalElement = last;
        hasNext = this.step <= (long)0 ? first >= last : first <= last;
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    private long next;
    private final long finalElement;
    private boolean hasNext;
    private final long step;
}
