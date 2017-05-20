// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Range.kt

package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

public interface ClosedRange
{
    public static final class DefaultImpls
    {

        public static boolean contains(ClosedRange $this, Comparable value)
        {
            Intrinsics.checkParameterIsNotNull(value, "value");
            return value.compareTo($this.getStart()) >= 0 && value.compareTo($this.getEndInclusive()) <= 0;
        }

        public static boolean isEmpty(ClosedRange $this)
        {
            return $this.getStart().compareTo($this.getEndInclusive()) > 0;
        }
    }


    public abstract Comparable getStart();

    public abstract Comparable getEndInclusive();

    public abstract boolean contains(Comparable comparable);

    public abstract boolean isEmpty();
}
