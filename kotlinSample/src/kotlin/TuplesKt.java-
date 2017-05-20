// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Tuples.kt

package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin:
//            Pair, Triple

public final class TuplesKt
{

    public static final Pair to(Object $receiver, Object that)
    {
        return new Pair($receiver, that);
    }

    public static final List toList(Pair $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return CollectionsKt.listOf(new Object[] {
            $receiver.getFirst(), $receiver.getSecond()
        });
    }

    public static final List toList(Triple $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return CollectionsKt.listOf(new Object[] {
            $receiver.getFirst(), $receiver.getSecond(), $receiver.getThird()
        });
    }
}
