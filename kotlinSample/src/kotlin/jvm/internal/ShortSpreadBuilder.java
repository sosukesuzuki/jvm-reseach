// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveSpreadBuilders.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            PrimitiveSpreadBuilder, Intrinsics

public final class ShortSpreadBuilder extends PrimitiveSpreadBuilder
{

    protected int getSize(short $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length;
    }

    public volatile int getSize(Object obj)
    {
        return getSize((short[])obj);
    }

    public final void add(short value)
    {
        int i;
        int j = getPosition();
        i = j;
        setPosition(j + 1);
        values[i] = value;
    }

    public final short[] toArray()
    {
        return (short[])toArray(values, new short[size()]);
    }

    public ShortSpreadBuilder(int size)
    {
        super(size);
        values = new short[size];
    }

    private final short values[];
}
