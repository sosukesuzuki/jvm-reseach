// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReversedViews.kt

package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//            CollectionsKt__MutableCollectionsKt, ReversedListReadOnly, ReversedList

class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt
{

    public static final List asReversed(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (List)new ReversedListReadOnly($receiver);
    }

    public static final List asReversedMutable(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (List)new ReversedList($receiver);
    }

    public CollectionsKt__ReversedViewsKt()
    {
    }
}
