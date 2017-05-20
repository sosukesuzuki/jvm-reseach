// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveSpreadBuilders.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            PrimitiveSpreadBuilder, Intrinsics

public final class IntSpreadBuilder extends PrimitiveSpreadBuilder
{

    protected int getSize(int $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length;
    }

    public volatile int getSize(Object obj)
    {
        return getSize((int[])obj);
    }

    public final void add(int value)
    {
        int i;
        int j = getPosition();
        i = j;
        setPosition(j + 1);
        values[i] = value;
    }

    public final int[] toArray()
    {
        return (int[])toArray(values, new int[size()]);
    }

    public IntSpreadBuilder(int size)
    {
        super(size);
        values = new int[size];
    }

    private final int values[];
}
