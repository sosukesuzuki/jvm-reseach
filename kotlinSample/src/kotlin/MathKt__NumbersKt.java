// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Numbers.kt

package kotlin;


// Referenced classes of package kotlin:
//            MathKt__BigNumbersKt

class MathKt__NumbersKt extends MathKt__BigNumbersKt
{

    private static final boolean isNaN(double $receiver)
    {
        return Double.isNaN($receiver);
    }

    private static final boolean isNaN(float $receiver)
    {
        return Float.isNaN($receiver);
    }

    private static final boolean isInfinite(double $receiver)
    {
        return Double.isInfinite($receiver);
    }

    private static final boolean isInfinite(float $receiver)
    {
        return Float.isInfinite($receiver);
    }

    private static final boolean isFinite(double $receiver)
    {
        double d = $receiver;
        if(Double.isInfinite(d)) goto _L2; else goto _L1
_L1:
        d = $receiver;
        if(Double.isNaN(d)) goto _L2; else goto _L3
_L3:
        true;
          goto _L4
_L2:
        false;
_L4:
        return;
    }

    private static final boolean isFinite(float $receiver)
    {
        float f = $receiver;
        if(Float.isInfinite(f)) goto _L2; else goto _L1
_L1:
        f = $receiver;
        if(Float.isNaN(f)) goto _L2; else goto _L3
_L3:
        true;
          goto _L4
_L2:
        false;
_L4:
        return;
    }

    public MathKt__NumbersKt()
    {
    }
}
