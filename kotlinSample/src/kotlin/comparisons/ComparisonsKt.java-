// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Comparisons.kt

package kotlin.comparisons;

import java.util.Arrays;
import java.util.Comparator;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.comparisons:
//            NaturalOrderComparator, ReverseOrderComparator, ReversedComparator

public final class ComparisonsKt
{

    public static final transient int compareValuesBy(Object a, Object b, Function1 selectors[])
    {
        Intrinsics.checkParameterIsNotNull(selectors, "selectors");
        boolean flag = ((Object[])selectors).length > 0;
        if(!flag)
        {
            String s = "Failed requirement.";
            throw (Throwable)new IllegalArgumentException(s.toString());
        }
        for(int i = 0; i < selectors.length; i++)
        {
            Function1 fn = selectors[i];
            Comparable v1 = (Comparable)fn.invoke(a);
            Comparable v2 = (Comparable)fn.invoke(b);
            int diff = compareValues(v1, v2);
            if(diff != 0)
                return diff;
        }

        return 0;
    }

    private static final int compareValuesBy(Object a, Object b, Function1 selector)
    {
        return compareValues((Comparable)selector.invoke(a), (Comparable)selector.invoke(b));
    }

    private static final int compareValuesBy(Object a, Object b, Comparator comparator, Function1 selector)
    {
        return comparator.compare(selector.invoke(a), selector.invoke(b));
    }

    public static final int compareValues(Comparable a, Comparable b)
    {
        if(a == b)
            return 0;
        if(a == null)
            return -1;
        if(b == null)
            return 1;
        if(a == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparable<kotlin.Any>");
        return ((Comparable)a).compareTo(b);
    }

    public static final transient Comparator compareBy(Function1 selectors[])
    {
        Intrinsics.checkParameterIsNotNull(selectors, "selectors");
        return (Comparator)new Comparator(selectors) {

            public int compare(Object a, Object b)
            {
                return ComparisonsKt.compareValuesBy(a, b, (Function1[])Arrays.copyOf($selectors, $selectors.length));
            }

            final Function1 $selectors[];

            
            {
                $selectors = $captured_local_variable$0;
                super();
            }
        }
;
    }

    private static final Comparator compareBy(Function1 selector)
    {
        return (Comparator)new Comparator(selector) {

            public int compare(Object a, Object b)
            {
                return ComparisonsKt.compareValues((Comparable)$selector.invoke(a), (Comparable)$selector.invoke(b));
            }

            final Function1 $selector;

            public 
            {
                $selector = $captured_local_variable$0;
                super();
            }
        }
;
    }

    private static final Comparator compareBy(Comparator comparator, Function1 selector)
    {
        return (Comparator)new Comparator(comparator, selector) {

            public int compare(Object a, Object b)
            {
                Comparator comparator1 = $comparator;
                return comparator1.compare($selector.invoke(a), $selector.invoke(b));
            }

            final Comparator $comparator;
            final Function1 $selector;

            public 
            {
                $comparator = $captured_local_variable$0;
                $selector = $captured_local_variable$1;
                super();
            }
        }
;
    }

    private static final Comparator compareByDescending(Function1 selector)
    {
        return (Comparator)new Comparator(selector) {

            public int compare(Object a, Object b)
            {
                return ComparisonsKt.compareValues((Comparable)$selector.invoke(b), (Comparable)$selector.invoke(a));
            }

            final Function1 $selector;

            public 
            {
                $selector = $captured_local_variable$0;
                super();
            }
        }
;
    }

    private static final Comparator compareByDescending(Comparator comparator, Function1 selector)
    {
        return (Comparator)new Comparator(comparator, selector) {

            public int compare(Object a, Object b)
            {
                Comparator comparator1 = $comparator;
                return comparator1.compare($selector.invoke(b), $selector.invoke(a));
            }

            final Comparator $comparator;
            final Function1 $selector;

            public 
            {
                $comparator = $captured_local_variable$0;
                $selector = $captured_local_variable$1;
                super();
            }
        }
;
    }

    private static final Comparator thenBy(Comparator $receiver, Function1 selector)
    {
        return (Comparator)new Comparator($receiver, selector) {

            public int compare(Object a, Object b)
            {
                int previousCompare = receiver$0.compare(a, b);
                if(previousCompare == 0) goto _L2; else goto _L1
_L1:
                previousCompare;
                  goto _L3
_L2:
                ComparisonsKt.compareValues((Comparable)$selector.invoke(a), (Comparable)$selector.invoke(b));
_L3:
                return;
            }

            final Comparator receiver$0;
            final Function1 $selector;

            public 
            {
                receiver$0 = $receiver;
                $selector = $captured_local_variable$1;
                super();
            }
        }
;
    }

    private static final Comparator thenBy(Comparator $receiver, Comparator comparator, Function1 selector)
    {
        return (Comparator)new Comparator($receiver, comparator, selector) {

            public int compare(Object a, Object b)
            {
                int previousCompare = receiver$0.compare(a, b);
                Comparator comparator1;
                return previousCompare == 0 ? (comparator1 = $comparator).compare($selector.invoke(a), $selector.invoke(b)) : previousCompare;
            }

            final Comparator receiver$0;
            final Comparator $comparator;
            final Function1 $selector;

            public 
            {
                receiver$0 = $receiver;
                $comparator = $captured_local_variable$1;
                $selector = $captured_local_variable$2;
                super();
            }
        }
;
    }

    private static final Comparator thenByDescending(Comparator $receiver, Function1 selector)
    {
        return (Comparator)new Comparator($receiver, selector) {

            public int compare(Object a, Object b)
            {
                int previousCompare = receiver$0.compare(a, b);
                if(previousCompare == 0) goto _L2; else goto _L1
_L1:
                previousCompare;
                  goto _L3
_L2:
                ComparisonsKt.compareValues((Comparable)$selector.invoke(b), (Comparable)$selector.invoke(a));
_L3:
                return;
            }

            final Comparator receiver$0;
            final Function1 $selector;

            public 
            {
                receiver$0 = $receiver;
                $selector = $captured_local_variable$1;
                super();
            }
        }
;
    }

    private static final Comparator thenByDescending(Comparator $receiver, Comparator comparator, Function1 selector)
    {
        return (Comparator)new Comparator($receiver, comparator, selector) {

            public int compare(Object a, Object b)
            {
                int previousCompare = receiver$0.compare(a, b);
                Comparator comparator1;
                return previousCompare == 0 ? (comparator1 = $comparator).compare($selector.invoke(b), $selector.invoke(a)) : previousCompare;
            }

            final Comparator receiver$0;
            final Comparator $comparator;
            final Function1 $selector;

            public 
            {
                receiver$0 = $receiver;
                $comparator = $captured_local_variable$1;
                $selector = $captured_local_variable$2;
                super();
            }
        }
;
    }

    private static final Comparator thenComparator(Comparator $receiver, Function2 comparison)
    {
        return (Comparator)new Comparator($receiver, comparison) {

            public int compare(Object a, Object b)
            {
                int previousCompare = receiver$0.compare(a, b);
                return previousCompare == 0 ? ((Number)$comparison.invoke(a, b)).intValue() : previousCompare;
            }

            final Comparator receiver$0;
            final Function2 $comparison;

            public 
            {
                receiver$0 = $receiver;
                $comparison = $captured_local_variable$1;
                super();
            }
        }
;
    }

    public static final Comparator then(Comparator $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Comparator)new Comparator($receiver, comparator) {

            public int compare(Object a, Object b)
            {
                int previousCompare = receiver$0.compare(a, b);
                return previousCompare == 0 ? $comparator.compare(a, b) : previousCompare;
            }

            final Comparator receiver$0;
            final Comparator $comparator;

            
            {
                receiver$0 = $receiver;
                $comparator = $captured_local_variable$1;
                super();
            }
        }
;
    }

    public static final Comparator thenDescending(Comparator $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Comparator)new Comparator($receiver, comparator) {

            public int compare(Object a, Object b)
            {
                int previousCompare = receiver$0.compare(a, b);
                return previousCompare == 0 ? $comparator.compare(b, a) : previousCompare;
            }

            final Comparator receiver$0;
            final Comparator $comparator;

            
            {
                receiver$0 = $receiver;
                $comparator = $captured_local_variable$1;
                super();
            }
        }
;
    }

    public static final Comparator nullsFirst(Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Comparator)new Comparator(comparator) {

            public int compare(Object a, Object b)
            {
                if(a == b)
                    return 0;
                if(a == null)
                    return -1;
                if(b == null)
                    return 1;
                else
                    return $comparator.compare(a, b);
            }

            final Comparator $comparator;

            
            {
                $comparator = $captured_local_variable$0;
                super();
            }
        }
;
    }

    private static final Comparator nullsFirst()
    {
        return nullsFirst(naturalOrder());
    }

    public static final Comparator nullsLast(Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Comparator)new Comparator(comparator) {

            public int compare(Object a, Object b)
            {
                if(a == b)
                    return 0;
                if(a == null)
                    return 1;
                if(b == null)
                    return -1;
                else
                    return $comparator.compare(a, b);
            }

            final Comparator $comparator;

            
            {
                $comparator = $captured_local_variable$0;
                super();
            }
        }
;
    }

    private static final Comparator nullsLast()
    {
        return nullsLast(naturalOrder());
    }

    public static final Comparator naturalOrder()
    {
        NaturalOrderComparator.INSTANCE;
        if(NaturalOrderComparator.INSTANCE == null)
            throw new TypeCastException("null cannot be cast to non-null type java.util.Comparator<T>");
        (Comparator);
        return;
    }

    public static final Comparator reverseOrder()
    {
        ReverseOrderComparator.INSTANCE;
        if(ReverseOrderComparator.INSTANCE == null)
            throw new TypeCastException("null cannot be cast to non-null type java.util.Comparator<T>");
        (Comparator);
        return;
    }

    public static final Comparator reversed(Comparator $receiver)
    {
        Comparator comparator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        comparator = $receiver;
        if(!(comparator instanceof ReversedComparator)) goto _L2; else goto _L1
_L1:
        ((ReversedComparator)$receiver).getComparator();
          goto _L3
_L2:
        if(!Intrinsics.areEqual(comparator, NaturalOrderComparator.INSTANCE)) goto _L5; else goto _L4
_L4:
        if(ReverseOrderComparator.INSTANCE == null)
            throw new TypeCastException("null cannot be cast to non-null type java.util.Comparator<T>");
        (Comparator)ReverseOrderComparator.INSTANCE;
          goto _L3
_L5:
        if(!Intrinsics.areEqual(comparator, ReverseOrderComparator.INSTANCE)) goto _L7; else goto _L6
_L6:
        if(NaturalOrderComparator.INSTANCE == null)
            throw new TypeCastException("null cannot be cast to non-null type java.util.Comparator<T>");
        (Comparator)NaturalOrderComparator.INSTANCE;
          goto _L3
_L7:
        (Comparator)new ReversedComparator($receiver);
_L3:
        return;
    }
}
