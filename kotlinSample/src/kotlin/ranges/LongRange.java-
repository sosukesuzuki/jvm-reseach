// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Ranges.kt

package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

// Referenced classes of package kotlin.ranges:
//            LongProgression, ClosedRange

public final class LongRange extends LongProgression
    implements ClosedRange
{
    public static final class Companion
    {

        public final LongRange getEMPTY()
        {
            return LongRange.EMPTY;
        }

        private Companion()
        {
        }

        public Companion(DefaultConstructorMarker $constructor_marker)
        {
            this();
        }
    }


    public Long getStart()
    {
        return Long.valueOf(getFirst());
    }

    public volatile Comparable getStart()
    {
        return (Comparable)getStart();
    }

    public Long getEndInclusive()
    {
        return Long.valueOf(getLast());
    }

    public volatile Comparable getEndInclusive()
    {
        return (Comparable)getEndInclusive();
    }

    public boolean contains(long value)
    {
        return getFirst() <= value && value <= getLast();
    }

    public volatile boolean contains(Comparable comparable)
    {
        return contains(((Number)comparable).longValue());
    }

    public boolean isEmpty()
    {
        return getFirst() > getLast();
    }

    public boolean equals(Object other)
    {
        return (other instanceof LongRange) && (isEmpty() && ((LongRange)other).isEmpty() || getFirst() == ((LongRange)other).getFirst() && getLast() == ((LongRange)other).getLast());
    }

    public int hashCode()
    {
        return isEmpty() ? -1 : (int)((long)31 * (getFirst() ^ getFirst() >>> 32) + (getLast() ^ getLast() >>> 32));
    }

    public String toString()
    {
        return (new StringBuilder()).append(getFirst()).append("..").append(getLast()).toString();
    }

    public LongRange(long start, long endInclusive)
    {
        super(start, endInclusive, 1L);
    }

    private static final LongRange EMPTY = new LongRange(1L, 0L);
    public static final Companion Companion = new Companion(null);


}
