// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MapWithDefault.kt

package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

interface MapWithDefault
    extends Map, KMappedMarker
{

    public abstract Map getMap();

    public abstract Object getOrImplicitDefault(Object obj);

    public abstract void clear();

    public abstract Object remove(Object obj);

    public abstract void putAll(Map map);

    public abstract Object put(Object obj, Object obj1);
}
