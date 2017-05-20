// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Progressions.kt

package kotlin.ranges;

import java.util.Iterator;
import kotlin.collections.CharIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.ranges:
//            CharProgressionIterator

public class CharProgression
    implements Iterable, KMappedMarker
{
    public static final class Companion
    {

        public final CharProgression fromClosedRange(char rangeStart, char rangeEnd, int step)
        {
            return new CharProgression(rangeStart, rangeEnd, step);
        }

        private Companion()
        {
        }

        public Companion(DefaultConstructorMarker $constructor_marker)
        {
            this();
        }
    }


    public final char getFirst()
    {
        return first;
    }

    public final char getLast()
    {
        return last;
    }

    public final int getStep()
    {
        return step;
    }

    public CharIterator iterator()
    {
        return (CharIterator)new CharProgressionIterator(first, last, step);
    }

    public volatile Iterator iterator()
    {
        return (Iterator)iterator();
    }

    public boolean isEmpty()
    {
        return step <= 0 ? first < last : first > last;
    }

    public boolean equals(Object other)
    {
        return (other instanceof CharProgression) && (isEmpty() && ((CharProgression)other).isEmpty() || first == ((CharProgression)other).first && last == ((CharProgression)other).last && step == ((CharProgression)other).step);
    }

    public int hashCode()
    {
        return isEmpty() ? -1 : 31 * (31 * first + last) + step;
    }

    public String toString()
    {
        return step <= 0 ? (new StringBuilder()).append(first).append(" downTo ").append(last).append(" step ").append(-step).toString() : (new StringBuilder()).append(first).append("..").append(last).append(" step ").append(step).toString();
    }

    public CharProgression(char start, char endInclusive, int step)
    {
        if(step == 0)
        {
            throw (Throwable)new IllegalArgumentException("Step must be non-zero");
        } else
        {
            first = start;
            last = (char)ProgressionUtilKt.getProgressionLastElement(start, endInclusive, step);
            this.step = step;
            return;
        }
    }

    private final char first;
    private final char last;
    private final int step;
    public static final Companion Companion = new Companion(null);

}
