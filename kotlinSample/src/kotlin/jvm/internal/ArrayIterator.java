// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArrayIterator.kt

package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.jvm.internal:
//            Intrinsics

final class ArrayIterator
    implements Iterator, KMappedMarker
{

    public boolean hasNext()
    {
        return index < array.length;
    }

    public Object next()
    {
        int i = index;
        index = index + 1;
        return array[i];
    }

    public final Object[] getArray()
    {
        return array;
    }

    public ArrayIterator(Object array[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (array)), "array");
        super();
        this.array = array;
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    private int index;
    private final Object array[];
}
