// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveSpreadBuilders.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            PrimitiveSpreadBuilder, Intrinsics

public final class DoubleSpreadBuilder extends PrimitiveSpreadBuilder
{

    protected int getSize(double $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length;
    }

    public volatile int getSize(Object obj)
    {
        return getSize((double[])obj);
    }

    public final void add(double value)
    {
        int i;
        int j = getPosition();
        i = j;
        setPosition(j + 1);
        values[i] = value;
    }

    public final double[] toArray()
    {
        return (double[])toArray(values, new double[size()]);
    }

    public DoubleSpreadBuilder(int size)
    {
        super(size);
        values = new double[size];
    }

    private final double values[];
}
