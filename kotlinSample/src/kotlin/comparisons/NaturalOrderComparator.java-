// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Comparisons.kt

package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.comparisons:
//            ReverseOrderComparator

final class NaturalOrderComparator
    implements Comparator
{

    public int compare(Comparable c1, Comparable c2)
    {
        Intrinsics.checkParameterIsNotNull(c1, "c1");
        Intrinsics.checkParameterIsNotNull(c2, "c2");
        return c1.compareTo(c2);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Comparable)obj, (Comparable)obj1);
    }

    public final Comparator reversed()
    {
        return (Comparator)ReverseOrderComparator.INSTANCE;
    }

    private NaturalOrderComparator()
    {
    }

    public static final NaturalOrderComparator INSTANCE = (NaturalOrderComparator)this;

    static 
    {
        new NaturalOrderComparator();
    }
}
