// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveSpreadBuilders.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            PrimitiveSpreadBuilder, Intrinsics

public final class CharSpreadBuilder extends PrimitiveSpreadBuilder
{

    protected int getSize(char $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length;
    }

    public volatile int getSize(Object obj)
    {
        return getSize((char[])obj);
    }

    public final void add(char value)
    {
        int i;
        int j = getPosition();
        i = j;
        setPosition(j + 1);
        values[i] = value;
    }

    public final char[] toArray()
    {
        return (char[])toArray(values, new char[size()]);
    }

    public CharSpreadBuilder(int size)
    {
        super(size);
        values = new char[size];
    }

    private final char values[];
}
