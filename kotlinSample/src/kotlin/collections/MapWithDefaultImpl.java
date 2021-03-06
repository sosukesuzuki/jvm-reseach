// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MapWithDefault.kt

package kotlin.collections;

import java.util.*;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//            MapWithDefault

final class MapWithDefaultImpl
    implements MapWithDefault
{

    public boolean equals(Object other)
    {
        return getMap().equals(other);
    }

    public int hashCode()
    {
        return getMap().hashCode();
    }

    public String toString()
    {
        return getMap().toString();
    }

    public int getSize()
    {
        return getMap().size();
    }

    public final volatile int size()
    {
        return getSize();
    }

    public boolean isEmpty()
    {
        return getMap().isEmpty();
    }

    public boolean containsKey(Object key)
    {
        return getMap().containsKey(key);
    }

    public boolean containsValue(Object value)
    {
        return getMap().containsValue(value);
    }

    public Object get(Object key)
    {
        return getMap().get(key);
    }

    public Set getKeys()
    {
        return getMap().keySet();
    }

    public final volatile Set keySet()
    {
        return getKeys();
    }

    public Collection getValues()
    {
        return getMap().values();
    }

    public final volatile Collection values()
    {
        return getValues();
    }

    public Set getEntries()
    {
        return getMap().entrySet();
    }

    public final volatile Set entrySet()
    {
        return getEntries();
    }

    public Object getOrImplicitDefault(Object key)
    {
        Map $receiver$iv = getMap();
        Object value$iv = $receiver$iv.get(key);
        return value$iv != null || $receiver$iv.containsKey(key) ? (Object)value$iv : _flddefault.invoke(key);
    }

    public Map getMap()
    {
        return map;
    }

    public MapWithDefaultImpl(Map map, Function1 default)
    {
        Intrinsics.checkParameterIsNotNull(map, "map");
        Intrinsics.checkParameterIsNotNull(default, "default");
        super();
        this.map = map;
        _flddefault = default;
    }

    public void putAll(Map map1)
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

    public void clear()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    private final Map map;
    private final Function1 _flddefault;
}
