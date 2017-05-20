// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Collections.kt

package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.*;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.collections:
//            ArraysKt, CollectionsKt__CollectionsKt

final class ArrayAsCollection
    implements Collection, KMappedMarker
{

    public int getSize()
    {
        return values.length;
    }

    public final volatile int size()
    {
        return getSize();
    }

    public boolean isEmpty()
    {
        Object aobj[] = values;
        return aobj.length == 0;
    }

    public boolean contains(Object element)
    {
        return ArraysKt.contains(values, element);
    }

    public boolean containsAll(Collection elements)
    {
        Iterator iterator1;
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        Iterable iterable = (Iterable)elements;
        iterator1 = iterable.iterator();
_L4:
        if(!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        Object it;
        Object element$iv = iterator1.next();
        it = element$iv;
        if(contains(it)) goto _L4; else goto _L3
_L3:
        false;
          goto _L5
_L2:
        true;
_L5:
        return;
    }

    public Iterator iterator()
    {
        return ArrayIteratorKt.iterator(values);
    }

    public final Object[] toArray()
    {
        return CollectionsKt__CollectionsKt.access$copyToArrayOfAny(values, isVarargs);
    }

    public final Object[] getValues()
    {
        return values;
    }

    public final boolean isVarargs()
    {
        return isVarargs;
    }

    public ArrayAsCollection(Object values[], boolean isVarargs)
    {
        Intrinsics.checkParameterIsNotNull(((Object) (values)), "values");
        super();
        this.values = values;
        this.isVarargs = isVarargs;
    }

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void clear()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public Object[] toArray(Object aobj[])
    {
        return CollectionToArray.toArray(this, aobj);
    }

    private final Object values[];
    private final boolean isVarargs;
}
