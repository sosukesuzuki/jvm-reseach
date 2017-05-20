// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Ranges.kt

package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

// Referenced classes of package kotlin.ranges:
//            IntProgression, ClosedRange

public final class IntRange extends IntProgression
    implements ClosedRange
{
    public static final class Companion
    {

        public final IntRange getEMPTY()
        {
            return IntRange.EMPTY;
        }

        private Companion()
        {
        }

        public Companion(DefaultConstructorMarker $constructor_marker)
        {
            this();
        }
    }


    public Integer getStart()
    {
        return Integer.valueOf(getFirst());
    }

    public volatile Comparable getStart()
    {
        return (Comparable)getStart();
    }

    public Integer getEndInclusive()
    {
        return Integer.valueOf(getLast());
    }

    public volatile Comparable getEndInclusive()
    {
        return (Comparable)getEndInclusive();
    }

    public boolean contains(int value)
    {
        return getFirst() <= value && value <= getLast();
    }

    public volatile boolean contains(Comparable comparable)
    {
        return contains(((Number)comparable).intValue());
    }

    public boolean isEmpty()
    {
        return getFirst() > getLast();
    }

    public boolean equals(Object other)
    {
        return (other instanceof IntRange) && (isEmpty() && ((IntRange)other).isEmpty() || getFirst() == ((IntRange)other).getFirst() && getLast() == ((IntRange)other).getLast());
    }

    public int hashCode()
    {
        return isEmpty() ? -1 : 31 * getFirst() + getLast();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getFirst()).append("..").append(getLast()).toString();
    }

    public IntRange(int start, int endInclusive)
    {
        super(start, endInclusive, 1);
    }

    private static final IntRange EMPTY = new IntRange(1, 0);
    public static final Companion Companion = new Companion(null);


}
