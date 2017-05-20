// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveSpreadBuilders.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            PrimitiveSpreadBuilder, Intrinsics

public final class ByteSpreadBuilder extends PrimitiveSpreadBuilder
{

    protected int getSize(byte $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length;
    }

    public volatile int getSize(Object obj)
    {
        return getSize((byte[])obj);
    }

    public final void add(byte value)
    {
        int i;
        int j = getPosition();
        i = j;
        setPosition(j + 1);
        values[i] = value;
    }

    public final byte[] toArray()
    {
        return (byte[])toArray(values, new byte[size()]);
    }

    public ByteSpreadBuilder(int size)
    {
        super(size);
        values = new byte[size];
    }

    private final byte values[];
}
