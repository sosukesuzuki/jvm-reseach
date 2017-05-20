// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Collections.kt

package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class EmptyIterator
    implements ListIterator, KMappedMarker
{

    public boolean hasNext()
    {
        return false;
    }

    public boolean hasPrevious()
    {
        return false;
    }

    public int nextIndex()
    {
        return 0;
    }

    public int previousIndex()
    {
        return -1;
    }

    public Void next()
    {
        throw (Throwable)new NoSuchElementException();
    }

    public volatile Object next()
    {
        return next();
    }

    public Void previous()
    {
        throw (Throwable)new NoSuchElementException();
    }

    public volatile Object previous()
    {
        return previous();
    }

    private EmptyIterator()
    {
    }

    public void add(Void void1)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void set(Void void1)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void add(Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void set(Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public static final EmptyIterator INSTANCE = (EmptyIterator)this;

    static 
    {
        new EmptyIterator();
    }
}
