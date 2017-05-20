// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveSpreadBuilders.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            PrimitiveSpreadBuilder, Intrinsics

public final class BooleanSpreadBuilder extends PrimitiveSpreadBuilder
{

    protected int getSize(boolean $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length;
    }

    public volatile int getSize(Object obj)
    {
        return getSize((boolean[])obj);
    }

    public final void add(boolean value)
    {
        int i;
        int j = getPosition();
        i = j;
        setPosition(j + 1);
        values[i] = value;
    }

    public final boolean[] toArray()
    {
        return (boolean[])toArray(values, new boolean[size()]);
    }

    public BooleanSpreadBuilder(int size)
    {
        super(size);
        values = new boolean[size];
    }

    private final boolean values[];
}
