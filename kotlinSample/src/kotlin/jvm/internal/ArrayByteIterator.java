// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArrayIterators.kt

package kotlin.jvm.internal;

import kotlin.collections.ByteIterator;

// Referenced classes of package kotlin.jvm.internal:
//            Intrinsics

final class ArrayByteIterator extends ByteIterator
{

    public boolean hasNext()
    {
        return index < array.length;
    }

    public byte nextByte()
    {
        int i = index;
        index = index + 1;
        return array[i];
    }

    public ArrayByteIterator(byte array[])
    {
        Intrinsics.checkParameterIsNotNull(array, "array");
        super();
        this.array = array;
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    private int index;
    private final byte array[];
}
