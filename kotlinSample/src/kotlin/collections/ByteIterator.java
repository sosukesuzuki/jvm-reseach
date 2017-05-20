// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Iterators.kt

package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public abstract class ByteIterator
    implements Iterator, KMappedMarker
{

    public final Byte next()
    {
        return Byte.valueOf(nextByte());
    }

    public volatile Object next()
    {
        return next();
    }

    public abstract byte nextByte();

    public ByteIterator()
    {
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }
}
