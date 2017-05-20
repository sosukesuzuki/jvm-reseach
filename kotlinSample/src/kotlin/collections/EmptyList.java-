// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Collections.kt

package kotlin.collections;

import java.io.Serializable;
import java.util.*;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.collections:
//            EmptyIterator

public final class EmptyList
    implements List, Serializable, RandomAccess, KMappedMarker
{

    public boolean equals(Object other)
    {
        return (other instanceof List) && ((List)other).isEmpty();
    }

    public int hashCode()
    {
        return 1;
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

    public Void get(int index)
    {
        throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("Empty list doesn't contain element at index ").append(index).append(".").toString());
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int indexOf(Void element)
    {
        Intrinsics.checkParameterIsNotNull(element, "element");
        return -1;
    }

    public final volatile int indexOf(Object obj)
    {
        if(!(obj instanceof Void))
            return -1;
        else
            return indexOf((Void)obj);
    }

    public int lastIndexOf(Void element)
    {
        Intrinsics.checkParameterIsNotNull(element, "element");
        return -1;
    }

    public final volatile int lastIndexOf(Object obj)
    {
        if(!(obj instanceof Void))
            return -1;
        else
            return lastIndexOf((Void)obj);
    }

    public Iterator iterator()
    {
        return (Iterator)EmptyIterator.INSTANCE;
    }

    public ListIterator listIterator()
    {
        return (ListIterator)EmptyIterator.INSTANCE;
    }

    public ListIterator listIterator(int index)
    {
        if(index != 0)
            throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("Index: ").append(index).toString());
        else
            return (ListIterator)EmptyIterator.INSTANCE;
    }

    public List subList(int fromIndex, int toIndex)
    {
        if(fromIndex == 0 && toIndex == 0)
            return (List)this;
        else
            throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("fromIndex: ").append(fromIndex).append(", toIndex: ").append(toIndex).toString());
    }

    private final Object readResolve()
    {
        return INSTANCE;
    }

    private EmptyList()
    {
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public Void set(int i, Void void1)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean add(Void void1)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void add(int i, Void void1)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void clear()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public Void removeAt(int i)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public Void remove(int i)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean retainAll(Collection collection)
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

    public Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void add(int i, Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public Object remove(int i)
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

    private static final long serialVersionUID = 0xa7e06032L;
    public static final EmptyList INSTANCE = (EmptyList)this;

    static 
    {
        new EmptyList();
    }
}
