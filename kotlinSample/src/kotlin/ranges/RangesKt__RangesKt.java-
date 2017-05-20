// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Ranges.kt

package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.ranges:
//            ComparableRange, ClosedRange

class RangesKt__RangesKt
{

    public static final ClosedRange rangeTo(Comparable $receiver, Comparable that)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(that, "that");
        return (ClosedRange)new ComparableRange($receiver, that);
    }

    public static final void checkStepIsPositive(boolean isPositive, Number step)
    {
        Intrinsics.checkParameterIsNotNull(step, "step");
        if(!isPositive)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Step must be positive, was: ").append(step).append(".").toString());
        else
            return;
    }

    public RangesKt__RangesKt()
    {
    }
}
