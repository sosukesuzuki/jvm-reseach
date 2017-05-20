// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Ranges.kt

package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.ranges:
//            ClosedRange

final class ComparableRange
    implements ClosedRange
{

    public boolean equals(Object other)
    {
        return (other instanceof ComparableRange) && (isEmpty() && ((ComparableRange)other).isEmpty() || Intrinsics.areEqual(getStart(), ((ComparableRange)other).getStart()) && Intrinsics.areEqual(getEndInclusive(), ((ComparableRange)other).getEndInclusive()));
    }

    public int hashCode()
    {
        return isEmpty() ? -1 : 31 * getStart().hashCode() + getEndInclusive().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getStart()).append("..").append(getEndInclusive()).toString();
    }

    public Comparable getStart()
    {
        return start;
    }

    public Comparable getEndInclusive()
    {
        return endInclusive;
    }

    public ComparableRange(Comparable start, Comparable endInclusive)
    {
        Intrinsics.checkParameterIsNotNull(start, "start");
        Intrinsics.checkParameterIsNotNull(endInclusive, "endInclusive");
        super();
        this.start = start;
        this.endInclusive = endInclusive;
    }

    public boolean isEmpty()
    {
        return ClosedRange.DefaultImpls.isEmpty(this);
    }

    public boolean contains(Comparable value)
    {
        Intrinsics.checkParameterIsNotNull(value, "value");
        return ClosedRange.DefaultImpls.contains(this, value);
    }

    private final Comparable start;
    private final Comparable endInclusive;
}
