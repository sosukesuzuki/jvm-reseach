// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sets.kt

package kotlin.collections;

import java.io.Serializable;
import java.util.*;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.collections:
//            EmptyIterator

public final class EmptySet
    implements Set, Serializable, KMappedMarker
{

    public boolean equals(Object other)
    {
        return (other instanceof Set) && ((Set)other).isEmpty();
    }

    public int hashCode()
    {
        return 0;
    }

    public String toString()
    {
        return "[]";
    }

    public int getSize()
    {
        return 0;
    }

    public final volatile int size()
    {
        return getSize();
    }

    public boolean isEmpty()
    {
        return true;
    }

    public boolean contains(Void element)
    {
        Intrinsics.checkParameterIsNotNull(element, "element");
        return false;
    }

    public final volatile boolean contains(Object obj)
    {
        if(!(obj instanceof Void))
            return false;
        else
            return contains((Void)obj);
    }

    public boolean containsAll(Collection elements)
    {
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return elements.isEmpty();
    }

    public Iterator iterator()
    {
        return (Iterator)EmptyIterator.INSTANCE;
    }

    private final Object readResolve()
    {
        return INSTANCE;
    }

    private EmptySet()
    {
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean add(Void void1)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean remove(Void void1)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void clear()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public Object[] toArray()
    {
        return CollectionToArray.toArray(this);
    }

    public Object[] toArray(Object aobj[])
    {
        return CollectionToArray.toArray(this, aobj);
    }

    public static final EmptySet INSTANCE = (EmptySet)this;

    static 
    {
        new EmptySet();
    }
}
