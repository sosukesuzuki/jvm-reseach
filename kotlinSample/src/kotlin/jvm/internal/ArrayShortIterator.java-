// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArrayIterators.kt

package kotlin.jvm.internal;

import kotlin.collections.ShortIterator;

// Referenced classes of package kotlin.jvm.internal:
//            Intrinsics

final class ArrayShortIterator extends ShortIterator
{

    public boolean hasNext()
    {
        return index < array.length;
    }

    public short nextShort()
    {
        int i = index;
        index = index + 1;
        return array[i];
    }

    public ArrayShortIterator(short array[])
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
    private final short array[];
}
