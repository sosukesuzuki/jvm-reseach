// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProgressionIterators.kt

package kotlin.ranges;

import kotlin.collections.IntIterator;

public final class IntProgressionIterator extends IntIterator
{

    public boolean hasNext()
    {
        return hasNext;
    }

    public int nextInt()
    {
        int value = next;
        if(value == finalElement)
            hasNext = false;
        else
            next += step;
        return value;
    }

    public final int getStep()
    {
        return step;
    }

    public IntProgressionIterator(int first, int last, int step)
    {
        this.step = step;
        next = first;
        finalElement = last;
        hasNext = this.step <= 0 ? first >= last : first <= last;
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    private int next;
    private final int finalElement;
    private boolean hasNext;
    private final int step;
}
