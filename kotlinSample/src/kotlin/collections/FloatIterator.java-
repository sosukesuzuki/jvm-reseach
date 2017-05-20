// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Iterators.kt

package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public abstract class FloatIterator
    implements Iterator, KMappedMarker
{

    public final Float next()
    {
        return Float.valueOf(nextFloat());
    }

    public volatile Object next()
    {
        return next();
    }

    public abstract float nextFloat();

    public FloatIterator()
    {
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }
}
