// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveSpreadBuilders.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            PrimitiveSpreadBuilder, Intrinsics

public final class FloatSpreadBuilder extends PrimitiveSpreadBuilder
{

    protected int getSize(float $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length;
    }

    public volatile int getSize(Object obj)
    {
        return getSize((float[])obj);
    }

    public final void add(float value)
    {
        int i;
        int j = getPosition();
        i = j;
        setPosition(j + 1);
        values[i] = value;
    }

    public final float[] toArray()
    {
        return (float[])toArray(values, new float[size()]);
    }

    public FloatSpreadBuilder(int size)
    {
        super(size);
        values = new float[size];
    }

    private final float values[];
}
