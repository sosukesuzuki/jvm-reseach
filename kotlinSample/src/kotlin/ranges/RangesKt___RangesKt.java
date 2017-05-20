// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   _Ranges.kt

package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.ranges:
//            RangesKt__RangesKt, ClosedRange, IntProgression, LongProgression, 
//            CharProgression, RangesKt, IntRange, LongRange, 
//            CharRange

class RangesKt___RangesKt extends RangesKt__RangesKt
{

    public static final boolean intRangeContains(ClosedRange $receiver, byte value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).intValue() <= value && value <= ((Number)$receiver.getEndInclusive()).intValue();
    }

    public static final boolean longRangeContains(ClosedRange $receiver, byte value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).longValue() <= (long)value && (long)value <= ((Number)$receiver.getEndInclusive()).longValue();
    }

    public static final boolean shortRangeContains(ClosedRange $receiver, byte value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).intValue() <= value && value <= ((Number)$receiver.getEndInclusive()).intValue();
    }

    public static final boolean doubleRangeContains(ClosedRange $receiver, byte value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= (double)value && (double)value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean floatRangeContains(ClosedRange $receiver, byte value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).floatValue() <= (float)value && (float)value <= ((Number)$receiver.getEndInclusive()).floatValue();
    }

    public static final boolean intRangeContains(ClosedRange $receiver, double value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= value && value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean longRangeContains(ClosedRange $receiver, double value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= value && value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean byteRangeContains(ClosedRange $receiver, double value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= value && value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean shortRangeContains(ClosedRange $receiver, double value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= value && value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean floatRangeContains(ClosedRange $receiver, double value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= value && value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean intRangeContains(ClosedRange $receiver, float value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).floatValue() <= value && value <= ((Number)$receiver.getEndInclusive()).floatValue();
    }

    public static final boolean longRangeContains(ClosedRange $receiver, float value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).floatValue() <= value && value <= ((Number)$receiver.getEndInclusive()).floatValue();
    }

    public static final boolean byteRangeContains(ClosedRange $receiver, float value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).floatValue() <= value && value <= ((Number)$receiver.getEndInclusive()).floatValue();
    }

    public static final boolean shortRangeContains(ClosedRange $receiver, float value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).floatValue() <= value && value <= ((Number)$receiver.getEndInclusive()).floatValue();
    }

    public static final boolean doubleRangeContains(ClosedRange $receiver, float value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= (double)value && (double)value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean longRangeContains(ClosedRange $receiver, int value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).longValue() <= (long)value && (long)value <= ((Number)$receiver.getEndInclusive()).longValue();
    }

    public static final boolean byteRangeContains(ClosedRange $receiver, int value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).intValue() <= value && value <= ((Number)$receiver.getEndInclusive()).intValue();
    }

    public static final boolean shortRangeContains(ClosedRange $receiver, int value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).intValue() <= value && value <= ((Number)$receiver.getEndInclusive()).intValue();
    }

    public static final boolean doubleRangeContains(ClosedRange $receiver, int value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= (double)value && (double)value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean floatRangeContains(ClosedRange $receiver, int value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).floatValue() <= (float)value && (float)value <= ((Number)$receiver.getEndInclusive()).floatValue();
    }

    public static final boolean intRangeContains(ClosedRange $receiver, long value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).longValue() <= value && value <= ((Number)$receiver.getEndInclusive()).longValue();
    }

    public static final boolean byteRangeContains(ClosedRange $receiver, long value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).longValue() <= value && value <= ((Number)$receiver.getEndInclusive()).longValue();
    }

    public static final boolean shortRangeContains(ClosedRange $receiver, long value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).longValue() <= value && value <= ((Number)$receiver.getEndInclusive()).longValue();
    }

    public static final boolean doubleRangeContains(ClosedRange $receiver, long value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= (double)value && (double)value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean floatRangeContains(ClosedRange $receiver, long value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).floatValue() <= (float)value && (float)value <= ((Number)$receiver.getEndInclusive()).floatValue();
    }

    public static final boolean intRangeContains(ClosedRange $receiver, short value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).intValue() <= value && value <= ((Number)$receiver.getEndInclusive()).intValue();
    }

    public static final boolean longRangeContains(ClosedRange $receiver, short value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).longValue() <= (long)value && (long)value <= ((Number)$receiver.getEndInclusive()).longValue();
    }

    public static final boolean byteRangeContains(ClosedRange $receiver, short value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).intValue() <= value && value <= ((Number)$receiver.getEndInclusive()).intValue();
    }

    public static final boolean doubleRangeContains(ClosedRange $receiver, short value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).doubleValue() <= (double)value && (double)value <= ((Number)$receiver.getEndInclusive()).doubleValue();
    }

    public static final boolean floatRangeContains(ClosedRange $receiver, short value)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ((Number)$receiver.getStart()).floatValue() <= (float)value && (float)value <= ((Number)$receiver.getEndInclusive()).floatValue();
    }

    public static final IntProgression downTo(int $receiver, byte to)
    {
        return IntProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final LongProgression downTo(long $receiver, byte to)
    {
        return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
    }

    public static final IntProgression downTo(byte $receiver, byte to)
    {
        return IntProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final IntProgression downTo(short $receiver, byte to)
    {
        return IntProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final CharProgression downTo(char $receiver, char to)
    {
        return CharProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final IntProgression downTo(int $receiver, int to)
    {
        return IntProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final LongProgression downTo(long $receiver, int to)
    {
        return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
    }

    public static final IntProgression downTo(byte $receiver, int to)
    {
        return IntProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final IntProgression downTo(short $receiver, int to)
    {
        return IntProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final LongProgression downTo(int $receiver, long to)
    {
        return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
    }

    public static final LongProgression downTo(long $receiver, long to)
    {
        return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
    }

    public static final LongProgression downTo(byte $receiver, long to)
    {
        return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
    }

    public static final LongProgression downTo(short $receiver, long to)
    {
        return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
    }

    public static final IntProgression downTo(int $receiver, short to)
    {
        return IntProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final LongProgression downTo(long $receiver, short to)
    {
        return LongProgression.Companion.fromClosedRange($receiver, to, -1L);
    }

    public static final IntProgression downTo(byte $receiver, short to)
    {
        return IntProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final IntProgression downTo(short $receiver, short to)
    {
        return IntProgression.Companion.fromClosedRange($receiver, to, -1);
    }

    public static final IntProgression reversed(IntProgression $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return IntProgression.Companion.fromClosedRange($receiver.getLast(), $receiver.getFirst(), -$receiver.getStep());
    }

    public static final LongProgression reversed(LongProgression $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return LongProgression.Companion.fromClosedRange($receiver.getLast(), $receiver.getFirst(), -$receiver.getStep());
    }

    public static final CharProgression reversed(CharProgression $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return CharProgression.Companion.fromClosedRange($receiver.getLast(), $receiver.getFirst(), -$receiver.getStep());
    }

    public static final IntProgression step(IntProgression $receiver, int step)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        RangesKt.checkStepIsPositive(step > 0, Integer.valueOf(step));
        return IntProgression.Companion.fromClosedRange($receiver.getFirst(), $receiver.getLast(), $receiver.getStep() <= 0 ? -step : step);
    }

    public static final LongProgression step(LongProgression $receiver, long step)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        RangesKt.checkStepIsPositive(step > (long)0, Long.valueOf(step));
        return LongProgression.Companion.fromClosedRange($receiver.getFirst(), $receiver.getLast(), $receiver.getStep() <= (long)0 ? -step : step);
    }

    public static final CharProgression step(CharProgression $receiver, int step)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        RangesKt.checkStepIsPositive(step > 0, Integer.valueOf(step));
        return CharProgression.Companion.fromClosedRange($receiver.getFirst(), $receiver.getLast(), $receiver.getStep() <= 0 ? -step : step);
    }

    public static final IntRange until(int $receiver, byte to)
    {
        $receiver;
        JVM INSTR new #169 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to - 1;
        IntRange();
        return;
    }

    public static final LongRange until(long $receiver, byte to)
    {
        $receiver;
        JVM INSTR new #176 <Class LongRange>;
        JVM INSTR dup ;
        (long)to - (long)1;
        LongRange();
        return;
    }

    public static final IntRange until(byte $receiver, byte to)
    {
        $receiver;
        JVM INSTR new #169 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to - 1;
        IntRange();
        return;
    }

    public static final IntRange until(short $receiver, byte to)
    {
        $receiver;
        JVM INSTR new #169 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to - 1;
        IntRange();
        return;
    }

    public static final CharRange until(char $receiver, char to)
    {
        char to_;
        to_ = (char)(to - 1);
        if(to_ > to)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("The to argument value '").append(to).append("' was too small.").toString());
        $receiver;
        JVM INSTR new #211 <Class CharRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to_;
        CharRange();
        return;
    }

    public static final IntRange until(int $receiver, int to)
    {
        int to_;
        to_ = (int)((long)to - (long)1);
        if(to_ > to)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("The to argument value '").append(to).append("' was too small.").toString());
        $receiver;
        JVM INSTR new #169 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to_;
        IntRange();
        return;
    }

    public static final LongRange until(long $receiver, int to)
    {
        $receiver;
        JVM INSTR new #176 <Class LongRange>;
        JVM INSTR dup ;
        (long)to - (long)1;
        LongRange();
        return;
    }

    public static final IntRange until(byte $receiver, int to)
    {
        int to_;
        to_ = (int)((long)to - (long)1);
        if(to_ > to)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("The to argument value '").append(to).append("' was too small.").toString());
        $receiver;
        JVM INSTR new #169 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to_;
        IntRange();
        return;
    }

    public static final IntRange until(short $receiver, int to)
    {
        int to_;
        to_ = (int)((long)to - (long)1);
        if(to_ > to)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("The to argument value '").append(to).append("' was too small.").toString());
        $receiver;
        JVM INSTR new #169 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to_;
        IntRange();
        return;
    }

    public static final LongRange until(int $receiver, long to)
    {
        long to_;
        to_ = to - (long)1;
        if(to_ > to)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("The to argument value '").append(to).append("' was too small.").toString());
        (long)$receiver;
        JVM INSTR new #176 <Class LongRange>;
        JVM INSTR dup ;
        to_;
        LongRange();
        return;
    }

    public static final LongRange until(long $receiver, long to)
    {
        long to_;
        to_ = to - (long)1;
        if(to_ > to)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("The to argument value '").append(to).append("' was too small.").toString());
        $receiver;
        JVM INSTR new #176 <Class LongRange>;
        JVM INSTR dup ;
        to_;
        LongRange();
        return;
    }

    public static final LongRange until(byte $receiver, long to)
    {
        long to_;
        to_ = to - (long)1;
        if(to_ > to)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("The to argument value '").append(to).append("' was too small.").toString());
        (long)$receiver;
        JVM INSTR new #176 <Class LongRange>;
        JVM INSTR dup ;
        to_;
        LongRange();
        return;
    }

    public static final LongRange until(short $receiver, long to)
    {
        long to_;
        to_ = to - (long)1;
        if(to_ > to)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("The to argument value '").append(to).append("' was too small.").toString());
        (long)$receiver;
        JVM INSTR new #176 <Class LongRange>;
        JVM INSTR dup ;
        to_;
        LongRange();
        return;
    }

    public static final IntRange until(int $receiver, short to)
    {
        $receiver;
        JVM INSTR new #169 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to - 1;
        IntRange();
        return;
    }

    public static final LongRange until(long $receiver, short to)
    {
        $receiver;
        JVM INSTR new #176 <Class LongRange>;
        JVM INSTR dup ;
        (long)to - (long)1;
        LongRange();
        return;
    }

    public static final IntRange until(byte $receiver, short to)
    {
        $receiver;
        JVM INSTR new #169 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to - 1;
        IntRange();
        return;
    }

    public static final IntRange until(short $receiver, short to)
    {
        $receiver;
        JVM INSTR new #169 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        to - 1;
        IntRange();
        return;
    }

    public static final Comparable coerceAtLeast(Comparable $receiver, Comparable minimumValue)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(minimumValue, "minimumValue");
        return $receiver.compareTo(minimumValue) >= 0 ? $receiver : minimumValue;
    }

    public static final byte coerceAtLeast(byte $receiver, byte minimumValue)
    {
        return $receiver >= minimumValue ? $receiver : minimumValue;
    }

    public static final short coerceAtLeast(short $receiver, short minimumValue)
    {
        return $receiver >= minimumValue ? $receiver : minimumValue;
    }

    public static final int coerceAtLeast(int $receiver, int minimumValue)
    {
        return $receiver >= minimumValue ? $receiver : minimumValue;
    }

    public static final long coerceAtLeast(long $receiver, long minimumValue)
    {
        return $receiver >= minimumValue ? $receiver : minimumValue;
    }

    public static final float coerceAtLeast(float $receiver, float minimumValue)
    {
        return $receiver >= minimumValue ? $receiver : minimumValue;
    }

    public static final double coerceAtLeast(double $receiver, double minimumValue)
    {
        return $receiver >= minimumValue ? $receiver : minimumValue;
    }

    public static final Comparable coerceAtMost(Comparable $receiver, Comparable maximumValue)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(maximumValue, "maximumValue");
        return $receiver.compareTo(maximumValue) <= 0 ? $receiver : maximumValue;
    }

    public static final byte coerceAtMost(byte $receiver, byte maximumValue)
    {
        return $receiver <= maximumValue ? $receiver : maximumValue;
    }

    public static final short coerceAtMost(short $receiver, short maximumValue)
    {
        return $receiver <= maximumValue ? $receiver : maximumValue;
    }

    public static final int coerceAtMost(int $receiver, int maximumValue)
    {
        return $receiver <= maximumValue ? $receiver : maximumValue;
    }

    public static final long coerceAtMost(long $receiver, long maximumValue)
    {
        return $receiver <= maximumValue ? $receiver : maximumValue;
    }

    public static final float coerceAtMost(float $receiver, float maximumValue)
    {
        return $receiver <= maximumValue ? $receiver : maximumValue;
    }

    public static final double coerceAtMost(double $receiver, double maximumValue)
    {
        return $receiver <= maximumValue ? $receiver : maximumValue;
    }

    public static final Comparable coerceIn(Comparable $receiver, Comparable minimumValue, Comparable maximumValue)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(minimumValue != null && maximumValue != null)
        {
            if(minimumValue.compareTo(maximumValue) > 0)
                throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: maximum ").append(maximumValue).append(" is less than minimum ").append(minimumValue).append(".").toString());
            if($receiver.compareTo(minimumValue) < 0)
                return minimumValue;
            if($receiver.compareTo(maximumValue) > 0)
                return maximumValue;
        } else
        {
            if(minimumValue != null && $receiver.compareTo(minimumValue) < 0)
                return minimumValue;
            if(maximumValue != null && $receiver.compareTo(maximumValue) > 0)
                return maximumValue;
        }
        return $receiver;
    }

    public static final byte coerceIn(byte $receiver, byte minimumValue, byte maximumValue)
    {
        if(minimumValue > maximumValue)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: maximum ").append(maximumValue).append(" is less than minimum ").append(minimumValue).append(".").toString());
        if($receiver < minimumValue)
            return minimumValue;
        if($receiver > maximumValue)
            return maximumValue;
        else
            return $receiver;
    }

    public static final short coerceIn(short $receiver, short minimumValue, short maximumValue)
    {
        if(minimumValue > maximumValue)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: maximum ").append(maximumValue).append(" is less than minimum ").append(minimumValue).append(".").toString());
        if($receiver < minimumValue)
            return minimumValue;
        if($receiver > maximumValue)
            return maximumValue;
        else
            return $receiver;
    }

    public static final int coerceIn(int $receiver, int minimumValue, int maximumValue)
    {
        if(minimumValue > maximumValue)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: maximum ").append(maximumValue).append(" is less than minimum ").append(minimumValue).append(".").toString());
        if($receiver < minimumValue)
            return minimumValue;
        if($receiver > maximumValue)
            return maximumValue;
        else
            return $receiver;
    }

    public static final long coerceIn(long $receiver, long minimumValue, long maximumValue)
    {
        if(minimumValue > maximumValue)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: maximum ").append(maximumValue).append(" is less than minimum ").append(minimumValue).append(".").toString());
        if($receiver < minimumValue)
            return minimumValue;
        if($receiver > maximumValue)
            return maximumValue;
        else
            return $receiver;
    }

    public static final float coerceIn(float $receiver, float minimumValue, float maximumValue)
    {
        if(minimumValue > maximumValue)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: maximum ").append(maximumValue).append(" is less than minimum ").append(minimumValue).append(".").toString());
        if($receiver < minimumValue)
            return minimumValue;
        if($receiver > maximumValue)
            return maximumValue;
        else
            return $receiver;
    }

    public static final double coerceIn(double $receiver, double minimumValue, double maximumValue)
    {
        if(minimumValue > maximumValue)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: maximum ").append(maximumValue).append(" is less than minimum ").append(minimumValue).append(".").toString());
        if($receiver < minimumValue)
            return minimumValue;
        if($receiver > maximumValue)
            return maximumValue;
        else
            return $receiver;
    }

    public static final Comparable coerceIn(Comparable $receiver, ClosedRange range)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(range, "range");
        if(range.isEmpty())
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: ").append(range).append(".").toString());
        else
            return $receiver.compareTo(range.getStart()) >= 0 ? $receiver.compareTo(range.getEndInclusive()) <= 0 ? $receiver : range.getEndInclusive() : range.getStart();
    }

    public static final int coerceIn(int $receiver, ClosedRange range)
    {
        Intrinsics.checkParameterIsNotNull(range, "range");
        if(range.isEmpty())
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: ").append(range).append(".").toString());
        else
            return $receiver >= ((Number)range.getStart()).intValue() ? $receiver <= ((Number)range.getEndInclusive()).intValue() ? $receiver : ((Number)range.getEndInclusive()).intValue() : ((Number)range.getStart()).intValue();
    }

    public static final long coerceIn(long $receiver, ClosedRange range)
    {
        Intrinsics.checkParameterIsNotNull(range, "range");
        if(range.isEmpty())
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Cannot coerce value to an empty range: ").append(range).append(".").toString());
        else
            return $receiver >= ((Number)range.getStart()).longValue() ? $receiver <= ((Number)range.getEndInclusive()).longValue() ? $receiver : ((Number)range.getEndInclusive()).longValue() : ((Number)range.getStart()).longValue();
    }

    public RangesKt___RangesKt()
    {
    }
}
