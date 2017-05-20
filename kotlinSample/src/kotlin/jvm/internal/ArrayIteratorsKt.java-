// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArrayIterators.kt

package kotlin.jvm.internal;

import kotlin.collections.*;

// Referenced classes of package kotlin.jvm.internal:
//            Intrinsics, ArrayByteIterator, ArrayCharIterator, ArrayShortIterator, 
//            ArrayIntIterator, ArrayLongIterator, ArrayFloatIterator, ArrayDoubleIterator, 
//            ArrayBooleanIterator

public final class ArrayIteratorsKt
{

    public static final ByteIterator iterator(byte array[])
    {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return (ByteIterator)new ArrayByteIterator(array);
    }

    public static final CharIterator iterator(char array[])
    {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return (CharIterator)new ArrayCharIterator(array);
    }

    public static final ShortIterator iterator(short array[])
    {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return (ShortIterator)new ArrayShortIterator(array);
    }

    public static final IntIterator iterator(int array[])
    {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return (IntIterator)new ArrayIntIterator(array);
    }

    public static final LongIterator iterator(long array[])
    {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return (LongIterator)new ArrayLongIterator(array);
    }

    public static final FloatIterator iterator(float array[])
    {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return (FloatIterator)new ArrayFloatIterator(array);
    }

    public static final DoubleIterator iterator(double array[])
    {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return (DoubleIterator)new ArrayDoubleIterator(array);
    }

    public static final BooleanIterator iterator(boolean array[])
    {
        Intrinsics.checkParameterIsNotNull(array, "array");
        return (BooleanIterator)new ArrayBooleanIterator(array);
    }
}
