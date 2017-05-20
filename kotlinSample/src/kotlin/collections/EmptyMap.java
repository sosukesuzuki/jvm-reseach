// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Maps.kt

package kotlin.collections;

import java.io.Serializable;
import java.util.*;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.collections:
//            EmptySet, EmptyList

final class EmptyMap
    implements Map, Serializable, KMappedMarker
{

    public boolean equals(Object other)
    {
        return (other instanceof Map) && ((Map)other).isEmpty();
    }

    public int hashCode()
    {
        return 0;
    }

    public String toString()
    {
        return "{}";
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

    public boolean containsKey(Object key)
    {
        return false;
    }

    public boolean containsValue(Void value)
    {
        Intrinsics.checkParameterIsNotNull(value, "value");
        return false;
    }

    public final volatile boolean containsValue(Object obj)
    {
        if(!(obj instanceof Void))
            return false;
        else
            return containsValue((Void)obj);
    }

    public Void get(Object key)
    {
        return null;
    }

    public final volatile Object get(Object obj)
    {
        return get(obj);
    }

    public Set getEntries()
    {
        return (Set)EmptySet.INSTANCE;
    }

    public final volatile Set entrySet()
    {
        return getEntries();
    }

    public Set getKeys()
    {
        return (Set)EmptySet.INSTANCE;
    }

    public final volatile Set keySet()
    {
        return getKeys();
    }

    public Collection getValues()
    {
        return (Collection)EmptyList.INSTANCE;
    }

    public final volatile Collection values()
    {
        return getValues();
    }

    private final Object readResolve()
    {
        return INSTANCE;
    }

    private EmptyMap()
    {
    }

    public Void put(Object obj, Void void1)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void putAll(Map map)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public void clear()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public Void remove(Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public Object remove(Object obj)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public Object put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    public static final EmptyMap INSTANCE = (EmptyMap)this;

    static 
    {
        new EmptyMap();
    }
}
