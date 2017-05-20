// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Progressions.kt

package kotlin.ranges;

import java.util.Iterator;
import kotlin.collections.LongIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.ranges:
//            LongProgressionIterator

public class LongProgression
    implements Iterable, KMappedMarker
{
    public static final class Companion
    {

        public final LongProgression fromClosedRange(long rangeStart, long rangeEnd, long step)
        {
            return new LongProgression(rangeStart, rangeEnd, step);
        }

        private Companion()
        {
        }

        public Companion(DefaultConstructorMarker $constructor_marker)
        {
            this();
        }
    }


    public final long getFirst()
    {
        return first;
    }

    public final long getLast()
    {
        return last;
    }

    public final long getStep()
    {
        return step;
    }

    public LongIterator iterator()
    {
        return (LongIterator)new LongProgressionIterator(first, last, step);
    }

    public volatile Iterator iterator()
    {
        return (Iterator)iterator();
    }

    public boolean isEmpty()
    {
        return step <= (long)0 ? first < last : first > last;
    }

    public boolean equals(Object other)
    {
        return (other instanceof LongProgression) && (isEmpty() && ((LongProgression)other).isEmpty() || first == ((LongProgression)other).first && last == ((LongProgression)other).last && step == ((LongProgression)other).step);
    }

    public int hashCode()
    {
        return isEmpty() ? -1 : (int)((long)31 * ((long)31 * (first ^ first >>> 32) + (last ^ last >>> 32)) + (step ^ step >>> 32));
    }

    public String toString()
    {
        return step <= (long)0 ? (new StringBuilder()).append(first).append(" downTo ").append(last).append(" step ").append(-step).toString() : (new StringBuilder()).append(first).append("..").append(last).append(" step ").append(step).toString();
    }

    public LongProgression(long start, long endInclusive, long step)
    {
        if(step == 0L)
        {
            throw (Throwable)new IllegalArgumentException("Step must be non-zero");
        } else
        {
            first = start;
            last = ProgressionUtilKt.getProgressionLastElement(start, endInclusive, step);
            this.step = step;
            return;
        }
    }

    private final long first;
    private final long last;
    private final long step;
    public static final Companion Companion = new Companion(null);

}
