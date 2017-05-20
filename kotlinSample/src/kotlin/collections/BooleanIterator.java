// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Iterators.kt

package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public abstract class BooleanIterator
    implements Iterator, KMappedMarker
{

    public final Boolean next()
    {
        return Boolean.valueOf(nextBoolean());
    }

    public volatile Object next()
    {
        return next();
    }

    public abstract boolean nextBoolean();

    public BooleanIterator()
    {
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }
}
