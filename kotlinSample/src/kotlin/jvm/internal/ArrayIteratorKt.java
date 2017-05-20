// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArrayIterator.kt

package kotlin.jvm.internal;

import java.util.Iterator;

// Referenced classes of package kotlin.jvm.internal:
//            Intrinsics, ArrayIterator

public final class ArrayIteratorKt
{

    public static final Iterator iterator(Object array[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (array)), "array");
        return (Iterator)new ArrayIterator(array);
    }
}
