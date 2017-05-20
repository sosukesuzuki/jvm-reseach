// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveSpreadBuilders.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            PrimitiveSpreadBuilder, Intrinsics

public final class LongSpreadBuilder extends PrimitiveSpreadBuilder
{

    protected int getSize(long $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length;
    }

    public volatile int getSize(Object obj)
    {
        return getSize((long[])obj);
    }

    public final void add(long value)
    {
        int i;
        int j = getPosition();
        i = j;
        setPosition(j + 1);
        values[i] = value;
    }

    public final long[] toArray()
    {
        return (long[])toArray(values, new long[size()]);
    }

    public LongSpreadBuilder(int size)
    {
        super(size);
        values = new long[size];
    }

    private final long values[];
}
