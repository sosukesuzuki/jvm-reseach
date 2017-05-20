// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MapWithDefault.kt

package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;

// Referenced classes of package kotlin.collections:
//            MapWithDefault

interface MutableMapWithDefault
    extends Map, MapWithDefault, KMutableMap
{

    public abstract Map getMap();
}
