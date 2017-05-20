// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Timing.kt

package kotlin.system;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class TimingKt
{

    public static final long measureTimeMillis(Function0 block)
    {
        Intrinsics.checkParameterIsNotNull(block, "block");
        long start = System.currentTimeMillis();
        block.invoke();
        return System.currentTimeMillis() - start;
    }

    public static final long measureNanoTime(Function0 block)
    {
        Intrinsics.checkParameterIsNotNull(block, "block");
        long start = System.nanoTime();
        block.invoke();
        return System.nanoTime() - start;
    }
}
