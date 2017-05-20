// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   progressionUtil.kt

package kotlin.internal;


public final class ProgressionUtilKt
{

    private static final int mod(int a, int b)
    {
        int mod = a % b;
        return mod < 0 ? mod + b : mod;
    }

    private static final long mod(long a, long b)
    {
        long mod = a % b;
        return mod < (long)0 ? mod + b : mod;
    }

    private static final int differenceModulo(int a, int b, int c)
    {
        return mod(mod(a, c) - mod(b, c), c);
    }

    private static final long differenceModulo(long a, long b, long c)
    {
        return mod(mod(a, c) - mod(b, c), c);
    }

    public static final int getProgressionLastElement(int start, int end, int step)
    {
        if(step > 0)
            return end - differenceModulo(end, start, step);
        if(step < 0)
            return end + differenceModulo(start, end, -step);
        else
            throw (Throwable)new IllegalArgumentException("Step is zero.");
    }

    public static final long getProgressionLastElement(long start, long end, long step)
    {
        if(step > (long)0)
            return end - differenceModulo(end, start, step);
        if(step < (long)0)
            return end + differenceModulo(start, end, -step);
        else
            throw (Throwable)new IllegalArgumentException("Step is zero.");
    }
}
