// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveCompanionObjects.kt

package kotlin.jvm.internal;


public final class DoubleCompanionObject
{

    public final double getMIN_VALUE()
    {
        return MIN_VALUE;
    }

    public final double getMAX_VALUE()
    {
        return MAX_VALUE;
    }

    public final double getPOSITIVE_INFINITY()
    {
        return POSITIVE_INFINITY;
    }

    public final double getNEGATIVE_INFINITY()
    {
        return NEGATIVE_INFINITY;
    }

    public final double getNaN()
    {
        return NaN;
    }

    private DoubleCompanionObject()
    {
        POSITIVE_INFINITY = Double.POSITIVE_INFINITY;
        NEGATIVE_INFINITY = Double.NEGATIVE_INFINITY;
        NaN = Double.NaN;
    }

    private static final double MIN_VALUE = 4.9406564584124654E-324D;
    private static final double MAX_VALUE = 1.7976931348623157E+308D;
    private static final double POSITIVE_INFINITY;
    private static final double NEGATIVE_INFINITY;
    private static final double NaN;
    public static final DoubleCompanionObject INSTANCE = (DoubleCompanionObject)this;

    static 
    {
        new DoubleCompanionObject();
    }
}
