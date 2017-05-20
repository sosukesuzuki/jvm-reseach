// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Comparisons.kt

package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

final class ReversedComparator
    implements Comparator
{

    public int compare(Object a, Object b)
    {
        return comparator.compare(b, a);
    }

    public final Comparator reversed()
    {
        return comparator;
    }

    public final Comparator getComparator()
    {
        return comparator;
    }

    public ReversedComparator(Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        super();
        this.comparator = comparator;
    }

    private final Comparator comparator;
}
