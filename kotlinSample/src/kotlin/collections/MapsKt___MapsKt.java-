// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   _Maps.kt

package kotlin.collections;

import java.util.*;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

// Referenced classes of package kotlin.collections:
//            MapsKt__MapsKt, CollectionsKt

class MapsKt___MapsKt extends MapsKt__MapsKt
{

    public static final List toList(Map $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver.size() == 0)
            return CollectionsKt.emptyList();
        Iterator iterator = $receiver.entrySet().iterator();
        if(!iterator.hasNext())
            return CollectionsKt.emptyList();
        java.util.Map.Entry first = (java.util.Map.Entry)iterator.next();
        if(!iterator.hasNext())
        {
            java.util.Map.Entry entry = first;
            return CollectionsKt.listOf(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList result = new ArrayList($receiver.size());
        java.util.Map.Entry entry1 = first;
        ArrayList arraylist = result;
        Pair pair = new Pair(entry1.getKey(), entry1.getValue());
        arraylist.add(pair);
        do
        {
            java.util.Map.Entry entry2 = (java.util.Map.Entry)iterator.next();
            ArrayList arraylist1 = result;
            Pair pair1 = new Pair(entry2.getKey(), entry2.getValue());
            arraylist1.add(pair1);
        } while(iterator.hasNext());
        return (List)result;
    }

    public static final List flatMap(Map $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Map map1 = $receiver;
        Collection destination$iv = (Collection)new ArrayList();
        Iterable list$iv = map1;
        for(Iterator iterator = list$iv.entrySet().iterator(); iterator.hasNext(); CollectionsKt.addAll(destination$iv, list$iv))
        {
            java.util.Map.Entry element$iv = (java.util.Map.Entry)iterator.next();
            list$iv = (Iterable)transform.invoke(element$iv);
        }

        return (List)destination$iv;
    }

    public static final Collection flatMapTo(Map $receiver, Collection destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable list = $receiver;
        for(Iterator iterator = list.entrySet().iterator(); iterator.hasNext(); CollectionsKt.addAll(destination, list))
        {
            java.util.Map.Entry element = (java.util.Map.Entry)iterator.next();
            list = (Iterable)transform.invoke(element);
        }

        return destination;
    }

    public static final List map(Map $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Map map1 = $receiver;
        Collection destination$iv = (Collection)new ArrayList($receiver.size());
        Map map2 = map1;
        java.util.Map.Entry item$iv;
        for(Iterator iterator = map2.entrySet().iterator(); iterator.hasNext(); destination$iv.add(transform.invoke(item$iv)))
            item$iv = (java.util.Map.Entry)iterator.next();

        return (List)destination$iv;
    }

    public static final List mapNotNull(Map $receiver, Function1 transform)
    {
        Collection destination$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Map map1 = $receiver;
        destination$iv = (Collection)new ArrayList();
        Map map2 = map1;
        Map map3 = map2;
        iterator = map3.entrySet().iterator();
_L3:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        java.util.Map.Entry element$iv$iv = (java.util.Map.Entry)iterator.next();
        java.util.Map.Entry element$iv = (java.util.Map.Entry)element$iv$iv;
        obj1 = transform.invoke(element$iv);
        obj1;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_112;
        Object obj;
        obj;
        Object it$iv = obj;
        destination$iv.add(it$iv);
        continue; /* Loop/switch isn't completed */
        JVM INSTR pop ;
          goto _L3
_L2:
        return (List)destination$iv;
    }

    public static final Collection mapNotNullTo(Map $receiver, Collection destination, Function1 transform)
    {
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Map map1 = $receiver;
        Map map2 = map1;
        iterator = map2.entrySet().iterator();
_L3:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        java.util.Map.Entry element$iv = (java.util.Map.Entry)iterator.next();
        java.util.Map.Entry element = (java.util.Map.Entry)element$iv;
        obj1 = transform.invoke(element);
        obj1;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_102;
        Object obj;
        obj;
        Object it = obj;
        destination.add(it);
        continue; /* Loop/switch isn't completed */
        JVM INSTR pop ;
          goto _L3
_L2:
        return destination;
    }

    public static final Collection mapTo(Map $receiver, Collection destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Map map1 = $receiver;
        java.util.Map.Entry item;
        for(Iterator iterator = map1.entrySet().iterator(); iterator.hasNext(); destination.add(transform.invoke(item)))
            item = (java.util.Map.Entry)iterator.next();

        return destination;
    }

    public static final boolean all(Map $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Map map1 = $receiver;
        for(Iterator iterator = map1.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry element = (java.util.Map.Entry)iterator.next();
            if(!((Boolean)predicate.invoke(element)).booleanValue())
                return false;
        }

        return true;
    }

    public static final boolean any(Map $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Map map1 = $receiver;
        Iterator iterator = map1.entrySet().iterator();
        if(iterator.hasNext())
        {
            java.util.Map.Entry element = (java.util.Map.Entry)iterator.next();
            return true;
        } else
        {
            return false;
        }
    }

    public static final boolean any(Map $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Map map1 = $receiver;
        for(Iterator iterator = map1.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry element = (java.util.Map.Entry)iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                return true;
        }

        return false;
    }

    private static final int count(Map $receiver)
    {
        return $receiver.size();
    }

    public static final int count(Map $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int count = 0;
        Map map1 = $receiver;
        Iterator iterator = map1.entrySet().iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            java.util.Map.Entry element = (java.util.Map.Entry)iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                count++;
        } while(true);
        return count;
    }

    public static final void forEach(Map $receiver, Function1 action)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(action, "action");
        Map map1 = $receiver;
        java.util.Map.Entry element;
        for(Iterator iterator = map1.entrySet().iterator(); iterator.hasNext(); action.invoke(element))
            element = (java.util.Map.Entry)iterator.next();

    }

    private static final java.util.Map.Entry maxBy(Map $receiver, Function1 selector)
    {
        Iterator iterator$iv;
        Iterable iterable = (Iterable)$receiver.entrySet();
        iterator$iv = iterable.iterator();
        if(iterator$iv.hasNext()) goto _L2; else goto _L1
_L1:
        null;
          goto _L3
_L2:
        Object maxElem$iv;
        maxElem$iv = iterator$iv.next();
        Comparable maxValue$iv = (Comparable)selector.invoke(maxElem$iv);
        do
        {
            if(!iterator$iv.hasNext())
                break;
            Object e$iv = iterator$iv.next();
            Comparable v$iv = (Comparable)selector.invoke(e$iv);
            if(maxValue$iv.compareTo(v$iv) < 0)
            {
                maxElem$iv = e$iv;
                maxValue$iv = v$iv;
            }
        } while(true);
        maxElem$iv;
_L3:
        (java.util.Map.Entry);
        return;
    }

    private static final java.util.Map.Entry maxWith(Map $receiver, Comparator comparator)
    {
        return (java.util.Map.Entry)CollectionsKt.maxWith((Iterable)$receiver.entrySet(), comparator);
    }

    public static final java.util.Map.Entry minBy(Map $receiver, Function1 selector)
    {
        Iterator iterator$iv;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        Iterable iterable = (Iterable)$receiver.entrySet();
        iterator$iv = iterable.iterator();
        if(iterator$iv.hasNext()) goto _L2; else goto _L1
_L1:
        null;
          goto _L3
_L2:
        Object minElem$iv;
        minElem$iv = iterator$iv.next();
        Comparable minValue$iv = (Comparable)selector.invoke(minElem$iv);
        do
        {
            if(!iterator$iv.hasNext())
                break;
            Object e$iv = iterator$iv.next();
            Comparable v$iv = (Comparable)selector.invoke(e$iv);
            if(minValue$iv.compareTo(v$iv) > 0)
            {
                minElem$iv = e$iv;
                minValue$iv = v$iv;
            }
        } while(true);
        minElem$iv;
_L3:
        (java.util.Map.Entry);
        return;
    }

    public static final java.util.Map.Entry minWith(Map $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (java.util.Map.Entry)CollectionsKt.minWith((Iterable)$receiver.entrySet(), comparator);
    }

    public static final boolean none(Map $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Map map1 = $receiver;
        Iterator iterator = map1.entrySet().iterator();
        if(iterator.hasNext())
        {
            java.util.Map.Entry element = (java.util.Map.Entry)iterator.next();
            return false;
        } else
        {
            return true;
        }
    }

    public static final boolean none(Map $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Map map1 = $receiver;
        for(Iterator iterator = map1.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry element = (java.util.Map.Entry)iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                return false;
        }

        return true;
    }

    private static final Iterable asIterable(Map $receiver)
    {
        return (Iterable)$receiver.entrySet();
    }

    public static final Sequence asSequence(Map $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        class asSequence..inlined.Sequence._cls1
            implements Sequence
        {

            public Iterator iterator()
            {
                Map map1 = receiver$0$inlined;
                return (Iterator)map1.entrySet().iterator();
            }

            final Map receiver$0$inlined;

            asSequence..inlined.Sequence._cls1(Map map1)
            {
                receiver$0$inlined = map1;
                super();
            }
        }

        return (Sequence)new asSequence..inlined.Sequence._cls1($receiver);
    }

    public MapsKt___MapsKt()
    {
    }
}
