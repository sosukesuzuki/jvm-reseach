// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ProgressionIterators.kt

package kotlin.ranges;

import kotlin.collections.CharIterator;

public final class CharProgressionIterator extends CharIterator
{

    public boolean hasNext()
    {
        return hasNext;
    }

    public char nextChar()
    {
        int value = next;
        if(value == finalElement)
            hasNext = false;
        else
            next += step;
        return (char)value;
    }

    public final int getStep()
    {
        return step;
    }

    public CharProgressionIterator(char first, char last, int step)
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
