// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   _Sequences.kt

package kotlin.sequences;

import java.util.*;
import kotlin.*;
import kotlin.collections.*;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

// Referenced classes of package kotlin.sequences:
//            SequencesKt__SequencesKt, SequencesKt, Sequence, DropTakeSequence, 
//            DropSequence, DropWhileSequence, FilteringSequence, TransformingSequence, 
//            IndexingSequence, TakeSequence, TakeWhileSequence, FlatteningSequence, 
//            TransformingIndexedSequence, DistinctSequence, MergingSequence

class SequencesKt___SequencesKt extends SequencesKt__SequencesKt
{

    public static final boolean contains(Sequence $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return SequencesKt.indexOf($receiver, element) >= 0;
    }

    public static final Object elementAt(Sequence $receiver, int index)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return SequencesKt.elementAtOrElse($receiver, index, (Function1)new Function1(index) {

            public volatile Object invoke(Object obj)
            {
                return invoke(((Number)obj).intValue());
            }

            public final Void invoke(int it)
            {
                throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("Sequence doesn't contain element at index ").append($index).append(".").toString());
            }

            final int $index;

            
            {
                $index = i;
                super(1);
            }
        }
);
    }

    public static final Object elementAtOrElse(Sequence $receiver, int index, Function1 defaultValue)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        if(index < 0)
            return defaultValue.invoke(Integer.valueOf(index));
        Iterator iterator = $receiver.iterator();
        int count = 0;
        while(iterator.hasNext()) 
        {
            Object element = iterator.next();
            if(index == count++)
                return element;
        }
        return defaultValue.invoke(Integer.valueOf(index));
    }

    public static final Object elementAtOrNull(Sequence $receiver, int index)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(index < 0)
            return null;
        Iterator iterator = $receiver.iterator();
        int count = 0;
        while(iterator.hasNext()) 
        {
            Object element = iterator.next();
            if(index == count++)
                return element;
        }
        return null;
    }

    private static final Object find(Sequence $receiver, Function1 predicate)
    {
        Iterator iterator;
        Sequence sequence = $receiver;
        iterator = sequence.iterator();
_L4:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object element$iv = iterator.next();
        if(!((Boolean)predicate.invoke(element$iv)).booleanValue()) goto _L4; else goto _L3
_L3:
        element$iv;
          goto _L5
_L2:
        null;
_L5:
        return;
    }

    private static final Object findLast(Sequence $receiver, Function1 predicate)
    {
        Sequence $receiver$iv = $receiver;
        Object last$iv = null;
        Iterator iterator = $receiver$iv.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv = iterator.next();
            if(((Boolean)predicate.invoke(element$iv)).booleanValue())
                last$iv = element$iv;
        } while(true);
        return last$iv;
    }

    public static final Object first(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new NoSuchElementException("Sequence is empty.");
        else
            return iterator.next();
    }

    public static final Object first(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                return element;
        }

        throw (Throwable)new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final Object firstOrNull(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        else
            return iterator.next();
    }

    public static final Object firstOrNull(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                return element;
        }

        return null;
    }

    public static final int indexOf(Sequence $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object item = iterator.next();
            if(Intrinsics.areEqual(element, item))
                return index;
            index++;
        }

        return -1;
    }

    public static final int indexOfFirst(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object item = iterator.next();
            if(((Boolean)predicate.invoke(item)).booleanValue())
                return index;
            index++;
        }

        return -1;
    }

    public static final int indexOfLast(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int lastIndex = -1;
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object item = iterator.next();
            if(((Boolean)predicate.invoke(item)).booleanValue())
                lastIndex = index;
            index++;
        }

        return lastIndex;
    }

    public static final Object last(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new NoSuchElementException("Sequence is empty.");
        Object last;
        for(last = iterator.next(); iterator.hasNext(); last = iterator.next());
        return last;
    }

    public static final Object last(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Object last = null;
        boolean found = false;
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
            {
                last = element;
                found = true;
            }
        } while(true);
        if(!found)
            throw (Throwable)new NoSuchElementException("Sequence contains no element matching the predicate.");
        else
            return (Object)last;
    }

    public static final int lastIndexOf(Sequence $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        int lastIndex = -1;
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object item = iterator.next();
            if(Intrinsics.areEqual(element, item))
                lastIndex = index;
            index++;
        }

        return lastIndex;
    }

    public static final Object lastOrNull(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        Object last;
        for(last = iterator.next(); iterator.hasNext(); last = iterator.next());
        return last;
    }

    public static final Object lastOrNull(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Object last = null;
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                last = element;
        } while(true);
        return last;
    }

    public static final Object single(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new NoSuchElementException("Sequence is empty.");
        Object single = iterator.next();
        if(iterator.hasNext())
            throw (Throwable)new IllegalArgumentException("Sequence has more than one element.");
        else
            return single;
    }

    public static final Object single(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Object single = null;
        boolean found = false;
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
            {
                if(found)
                    throw (Throwable)new IllegalArgumentException("Sequence contains more than one matching element.");
                single = element;
                found = true;
            }
        } while(true);
        if(!found)
            throw (Throwable)new NoSuchElementException("Sequence contains no element matching the predicate.");
        else
            return (Object)single;
    }

    public static final Object singleOrNull(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        Object single = iterator.next();
        if(iterator.hasNext())
            return null;
        else
            return single;
    }

    public static final Object singleOrNull(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Object single = null;
        boolean found = false;
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
            {
                if(found)
                    return null;
                single = element;
                found = true;
            }
        } while(true);
        if(!found)
            return null;
        else
            return single;
    }

    public static final Sequence drop(Sequence $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested element count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return n != 0 ? ($receiver instanceof DropTakeSequence) ? ((DropTakeSequence)$receiver).drop(n) : (Sequence)new DropSequence($receiver, n) : $receiver;
        }
    }

    public static final Sequence dropWhile(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return (Sequence)new DropWhileSequence($receiver, predicate);
    }

    public static final Sequence filter(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return (Sequence)new FilteringSequence($receiver, true, predicate);
    }

    public static final Sequence filterIndexed(Sequence $receiver, Function2 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        static final class filterIndexed._cls2 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return invoke((IndexedValue)obj);
            }

            public final Object invoke(IndexedValue it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getValue();
            }

            public static final filterIndexed._cls2 INSTANCE = new filterIndexed._cls2();


        }

        return (Sequence)new TransformingSequence((Sequence)new FilteringSequence((Sequence)new IndexingSequence($receiver), true, (Function1)new Function1(predicate) {

            public volatile Object invoke(Object obj)
            {
                return Boolean.valueOf(invoke((IndexedValue)obj));
            }

            public final boolean invoke(IndexedValue it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return ((Boolean)$predicate.invoke(Integer.valueOf(it.getIndex()), it.getValue())).booleanValue();
            }

            final Function2 $predicate;

            
            {
                $predicate = function2;
                super(1);
            }
        }
), (Function1)filterIndexed._cls2.INSTANCE);
    }

    public static final Collection filterIndexedTo(Sequence $receiver, Collection destination, Function2 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Sequence $receiver$iv = $receiver;
        int index$iv = 0;
        for(Iterator iterator = $receiver$iv.iterator(); iterator.hasNext();)
        {
            Object item$iv = iterator.next();
            Object element = item$iv;
            int index = index$iv++;
            if(((Boolean)predicate.invoke(Integer.valueOf(index), element)).booleanValue())
                destination.add(element);
        }

        return destination;
    }

    private static final Sequence filterIsInstance(Sequence $receiver)
    {
        Sequence sequence;
        Intrinsics.needClassReification();
        public static final class filterIsInstance._cls1 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return Boolean.valueOf(invoke(obj));
            }

            public final boolean invoke(Object it)
            {
                Intrinsics.reifiedOperationMarker(3, "R");
                return it instanceof Object;
            }

            public static final filterIsInstance._cls1 INSTANCE = new filterIsInstance._cls1();


        }

        sequence = SequencesKt.filter($receiver, (Function1)filterIsInstance._cls1.INSTANCE);
        sequence;
        if(sequence == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
        (Sequence);
        return;
    }

    private static final Collection filterIsInstanceTo(Sequence $receiver, Collection destination)
    {
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            Intrinsics.reifiedOperationMarker(3, "R");
            if(element instanceof Object)
                destination.add(element);
        } while(true);
        return destination;
    }

    public static final Sequence filterNot(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return (Sequence)new FilteringSequence($receiver, false, predicate);
    }

    public static final Sequence filterNotNull(Sequence $receiver)
    {
        Sequence sequence;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        static final class filterNotNull._cls1 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return Boolean.valueOf(invoke(obj));
            }

            public final boolean invoke(Object it)
            {
                return it == null;
            }

            public static final filterNotNull._cls1 INSTANCE = new filterNotNull._cls1();


        }

        sequence = SequencesKt.filterNot($receiver, (Function1)filterNotNull._cls1.INSTANCE);
        sequence;
        if(sequence == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.Sequence<T>");
        (Sequence);
        return;
    }

    public static final Collection filterNotNullTo(Sequence $receiver, Collection destination)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(element != null)
                destination.add(element);
        } while(true);
        return destination;
    }

    public static final Collection filterNotTo(Sequence $receiver, Collection destination, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(!((Boolean)predicate.invoke(element)).booleanValue())
                destination.add(element);
        } while(true);
        return destination;
    }

    public static final Collection filterTo(Sequence $receiver, Collection destination, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                destination.add(element);
        } while(true);
        return destination;
    }

    public static final Sequence take(Sequence $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested element count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return n != 0 ? ($receiver instanceof DropTakeSequence) ? ((DropTakeSequence)$receiver).take(n) : (Sequence)new TakeSequence($receiver, n) : SequencesKt.emptySequence();
        }
    }

    public static final Sequence takeWhile(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return (Sequence)new TakeWhileSequence($receiver, predicate);
    }

    public static final Sequence sorted(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (Sequence)new Sequence($receiver) {

            public Iterator iterator()
            {
                List sortedList = SequencesKt.toMutableList(receiver$0);
                CollectionsKt.sort(sortedList);
                return sortedList.iterator();
            }

            final Sequence receiver$0;

            
            {
                receiver$0 = $receiver;
                super();
            }
        }
;
    }

    public static final Sequence sortedBy(Sequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        Sequence sequence = $receiver;
        Comparator comparator = (Comparator)new kotlin.comparisons.ComparisonsKt.compareBy._cls2(selector);
        return SequencesKt.sortedWith(sequence, comparator);
    }

    public static final Sequence sortedByDescending(Sequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        Sequence sequence = $receiver;
        Comparator comparator = (Comparator)new kotlin.comparisons.ComparisonsKt.compareByDescending._cls1(selector);
        return SequencesKt.sortedWith(sequence, comparator);
    }

    public static final Sequence sortedDescending(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return SequencesKt.sortedWith($receiver, ComparisonsKt.reverseOrder());
    }

    public static final Sequence sortedWith(Sequence $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (Sequence)new Sequence($receiver, comparator) {

            public Iterator iterator()
            {
                List sortedList = SequencesKt.toMutableList(receiver$0);
                CollectionsKt.sortWith(sortedList, $comparator);
                return sortedList.iterator();
            }

            final Sequence receiver$0;
            final Comparator $comparator;

            
            {
                receiver$0 = $receiver;
                $comparator = $captured_local_variable$1;
                super();
            }
        }
;
    }

    public static final Map associate(Sequence $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Sequence sequence = $receiver;
        Map destination$iv = (Map)new LinkedHashMap();
        Map map1;
        Pair pair;
        for(Iterator iterator = sequence.iterator(); iterator.hasNext(); map1.put(pair.getFirst(), pair.getSecond()))
        {
            Object element$iv = iterator.next();
            map1 = destination$iv;
            pair = (Pair)transform.invoke(element$iv);
        }

        return destination$iv;
    }

    public static final Map associateBy(Sequence $receiver, Function1 keySelector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Sequence sequence = $receiver;
        Map destination$iv = (Map)new LinkedHashMap();
        Object element$iv;
        for(Iterator iterator = sequence.iterator(); iterator.hasNext(); destination$iv.put(keySelector.invoke(element$iv), element$iv))
            element$iv = iterator.next();

        return destination$iv;
    }

    public static final Map associateBy(Sequence $receiver, Function1 keySelector, Function1 valueTransform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        Sequence sequence = $receiver;
        Map destination$iv = (Map)new LinkedHashMap();
        Object element$iv;
        for(Iterator iterator = sequence.iterator(); iterator.hasNext(); destination$iv.put(keySelector.invoke(element$iv), valueTransform.invoke(element$iv)))
            element$iv = iterator.next();

        return destination$iv;
    }

    public static final Map associateByTo(Sequence $receiver, Map destination, Function1 keySelector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Object element;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); destination.put(keySelector.invoke(element), element))
            element = iterator.next();

        return destination;
    }

    public static final Map associateByTo(Sequence $receiver, Map destination, Function1 keySelector, Function1 valueTransform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        Object element;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); destination.put(keySelector.invoke(element), valueTransform.invoke(element)))
            element = iterator.next();

        return destination;
    }

    public static final Map associateTo(Sequence $receiver, Map destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Map map1;
        Pair pair;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); map1.put(pair.getFirst(), pair.getSecond()))
        {
            Object element = iterator.next();
            map1 = destination;
            pair = (Pair)transform.invoke(element);
        }

        return destination;
    }

    public static final Collection toCollection(Sequence $receiver, Collection destination)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Object item;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); destination.add(item))
            item = iterator.next();

        return destination;
    }

    public static final HashSet toHashSet(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (HashSet)SequencesKt.toCollection($receiver, (Collection)new HashSet());
    }

    public static final List toList(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return CollectionsKt.optimizeReadOnlyList(SequencesKt.toMutableList($receiver));
    }

    public static final List toMutableList(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (List)SequencesKt.toCollection($receiver, (Collection)new ArrayList());
    }

    public static final Set toSet(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return SetsKt.optimizeReadOnlySet((Set)SequencesKt.toCollection($receiver, (Collection)new LinkedHashSet()));
    }

    public static final SortedSet toSortedSet(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (SortedSet)SequencesKt.toCollection($receiver, (Collection)new TreeSet());
    }

    public static final SortedSet toSortedSet(Sequence $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (SortedSet)SequencesKt.toCollection($receiver, (Collection)new TreeSet(comparator));
    }

    public static final Sequence flatMap(Sequence $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        static final class flatMap._cls1 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return invoke((Sequence)obj);
            }

            public final Iterator invoke(Sequence it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return it.iterator();
            }

            public static final flatMap._cls1 INSTANCE = new flatMap._cls1();


        }

        return (Sequence)new FlatteningSequence($receiver, transform, (Function1)flatMap._cls1.INSTANCE);
    }

    public static final Collection flatMapTo(Sequence $receiver, Collection destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Sequence list;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); CollectionsKt.addAll(destination, list))
        {
            Object element = iterator.next();
            list = (Sequence)transform.invoke(element);
        }

        return destination;
    }

    public static final Map groupBy(Sequence $receiver, Function1 keySelector)
    {
        Map destination$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Sequence sequence = $receiver;
        destination$iv = (Map)new LinkedHashMap();
        iterator = sequence.iterator();
_L5:
        Object element$iv;
        Object key$iv;
        Map $receiver$iv$iv;
        Object value$iv$iv;
        if(!iterator.hasNext())
            break; /* Loop/switch isn't completed */
        element$iv = iterator.next();
        key$iv = keySelector.invoke(element$iv);
        $receiver$iv$iv = destination$iv;
        value$iv$iv = $receiver$iv$iv.get(key$iv);
        if(value$iv$iv != null) goto _L2; else goto _L1
_L1:
        Object answer$iv$iv;
        answer$iv$iv = new ArrayList();
        $receiver$iv$iv.put(key$iv, answer$iv$iv);
        answer$iv$iv;
          goto _L3
_L2:
        value$iv$iv;
_L3:
        (List);
        List list$iv;
        list$iv;
        list$iv.add(element$iv);
        if(true) goto _L5; else goto _L4
_L4:
        return destination$iv;
    }

    public static final Map groupBy(Sequence $receiver, Function1 keySelector, Function1 valueTransform)
    {
        Map destination$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        Sequence sequence = $receiver;
        destination$iv = (Map)new LinkedHashMap();
        iterator = sequence.iterator();
_L5:
        Object element$iv;
        Object key$iv;
        Map $receiver$iv$iv;
        Object value$iv$iv;
        if(!iterator.hasNext())
            break; /* Loop/switch isn't completed */
        element$iv = iterator.next();
        key$iv = keySelector.invoke(element$iv);
        $receiver$iv$iv = destination$iv;
        value$iv$iv = $receiver$iv$iv.get(key$iv);
        if(value$iv$iv != null) goto _L2; else goto _L1
_L1:
        Object answer$iv$iv;
        answer$iv$iv = new ArrayList();
        $receiver$iv$iv.put(key$iv, answer$iv$iv);
        answer$iv$iv;
          goto _L3
_L2:
        value$iv$iv;
_L3:
        (List);
        List list$iv;
        list$iv;
        list$iv.add(valueTransform.invoke(element$iv));
        if(true) goto _L5; else goto _L4
_L4:
        return destination$iv;
    }

    public static final Map groupByTo(Sequence $receiver, Map destination, Function1 keySelector)
    {
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        iterator = $receiver.iterator();
_L5:
        Object element;
        Object key;
        Map $receiver$iv;
        Object value$iv;
        if(!iterator.hasNext())
            break; /* Loop/switch isn't completed */
        element = iterator.next();
        key = keySelector.invoke(element);
        $receiver$iv = destination;
        value$iv = $receiver$iv.get(key);
        if(value$iv != null) goto _L2; else goto _L1
_L1:
        Object answer$iv;
        answer$iv = new ArrayList();
        $receiver$iv.put(key, answer$iv);
        answer$iv;
          goto _L3
_L2:
        value$iv;
_L3:
        (List);
        List list;
        list;
        list.add(element);
        if(true) goto _L5; else goto _L4
_L4:
        return destination;
    }

    public static final Map groupByTo(Sequence $receiver, Map destination, Function1 keySelector, Function1 valueTransform)
    {
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        iterator = $receiver.iterator();
_L5:
        Object element;
        Object key;
        Map $receiver$iv;
        Object value$iv;
        if(!iterator.hasNext())
            break; /* Loop/switch isn't completed */
        element = iterator.next();
        key = keySelector.invoke(element);
        $receiver$iv = destination;
        value$iv = $receiver$iv.get(key);
        if(value$iv != null) goto _L2; else goto _L1
_L1:
        Object answer$iv;
        answer$iv = new ArrayList();
        $receiver$iv.put(key, answer$iv);
        answer$iv;
          goto _L3
_L2:
        value$iv;
_L3:
        (List);
        List list;
        list;
        list.add(valueTransform.invoke(element));
        if(true) goto _L5; else goto _L4
_L4:
        return destination;
    }

    public static final Sequence map(Sequence $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        return (Sequence)new TransformingSequence($receiver, transform);
    }

    public static final Sequence mapIndexed(Sequence $receiver, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        return (Sequence)new TransformingIndexedSequence($receiver, transform);
    }

    public static final Sequence mapIndexedNotNull(Sequence $receiver, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        return SequencesKt.filterNotNull((Sequence)new TransformingIndexedSequence($receiver, transform));
    }

    public static final Collection mapIndexedNotNullTo(Sequence $receiver, Collection destination, Function2 transform)
    {
        int index$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Sequence $receiver$iv = $receiver;
        index$iv = 0;
        iterator = $receiver$iv.iterator();
_L3:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object item$iv = iterator.next();
        Object element = item$iv;
        int index = index$iv++;
        obj1 = transform.invoke(Integer.valueOf(index), element);
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

    public static final Collection mapIndexedTo(Sequence $receiver, Collection destination, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        int index = 0;
        Object item;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); destination.add(transform.invoke(Integer.valueOf(index), item)))
        {
            item = iterator.next();
            index++;
        }

        return destination;
    }

    public static final Sequence mapNotNull(Sequence $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        return SequencesKt.filterNotNull((Sequence)new TransformingSequence($receiver, transform));
    }

    public static final Collection mapNotNullTo(Sequence $receiver, Collection destination, Function1 transform)
    {
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Sequence sequence = $receiver;
        iterator = sequence.iterator();
_L3:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object element$iv = iterator.next();
        Object element = element$iv;
        obj1 = transform.invoke(element);
        obj1;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_87;
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

    public static final Collection mapTo(Sequence $receiver, Collection destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Object item;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); destination.add(transform.invoke(item)))
            item = iterator.next();

        return destination;
    }

    public static final Sequence withIndex(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (Sequence)new IndexingSequence($receiver);
    }

    public static final Sequence distinct(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        static final class distinct._cls1 extends Lambda
            implements Function1
        {

            public final Object invoke(Object it)
            {
                return it;
            }

            public static final distinct._cls1 INSTANCE = new distinct._cls1();


        }

        return SequencesKt.distinctBy($receiver, (Function1)distinct._cls1.INSTANCE);
    }

    public static final Sequence distinctBy(Sequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        return (Sequence)new DistinctSequence($receiver, selector);
    }

    public static final Set toMutableSet(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        LinkedHashSet set = new LinkedHashSet();
        Object item;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); set.add(item))
            item = iterator.next();

        return (Set)set;
    }

    public static final boolean all(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            if(!((Boolean)predicate.invoke(element)).booleanValue())
                return false;
        }

        return true;
    }

    public static final boolean any(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(iterator.hasNext())
        {
            Object element = iterator.next();
            return true;
        } else
        {
            return false;
        }
    }

    public static final boolean any(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                return true;
        }

        return false;
    }

    public static final int count(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        int count = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            count++;
        }

        return count;
    }

    public static final int count(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int count = 0;
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                count++;
        } while(true);
        return count;
    }

    public static final Object fold(Sequence $receiver, Object initial, Function2 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Object accumulator = initial;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            accumulator = operation.invoke(accumulator, element);
        }

        return accumulator;
    }

    public static final Object foldIndexed(Sequence $receiver, Object initial, Function3 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = 0;
        Object accumulator = initial;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            index++;
            accumulator = operation.invoke(Integer.valueOf(index), accumulator, element);
        }

        return accumulator;
    }

    public static final void forEach(Sequence $receiver, Function1 action)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(action, "action");
        Object element;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); action.invoke(element))
            element = iterator.next();

    }

    public static final void forEachIndexed(Sequence $receiver, Function2 action)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(action, "action");
        int index = 0;
        Object item;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); action.invoke(Integer.valueOf(index), item))
        {
            item = iterator.next();
            index++;
        }

    }

    public static final Comparable max(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return (Comparable)null;
        Comparable max = (Comparable)iterator.next();
        do
        {
            if(!iterator.hasNext())
                break;
            Comparable e = (Comparable)iterator.next();
            if(max.compareTo(e) < 0)
                max = e;
        } while(true);
        return max;
    }

    public static final Object maxBy(Sequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        Object maxElem = iterator.next();
        Comparable maxValue = (Comparable)selector.invoke(maxElem);
        do
        {
            if(!iterator.hasNext())
                break;
            Object e = iterator.next();
            Comparable v = (Comparable)selector.invoke(e);
            if(maxValue.compareTo(v) < 0)
            {
                maxElem = e;
                maxValue = v;
            }
        } while(true);
        return maxElem;
    }

    public static final Object maxWith(Sequence $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        Object max = iterator.next();
        do
        {
            if(!iterator.hasNext())
                break;
            Object e = iterator.next();
            if(comparator.compare(max, e) < 0)
                max = e;
        } while(true);
        return max;
    }

    public static final Comparable min(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return (Comparable)null;
        Comparable min = (Comparable)iterator.next();
        do
        {
            if(!iterator.hasNext())
                break;
            Comparable e = (Comparable)iterator.next();
            if(min.compareTo(e) > 0)
                min = e;
        } while(true);
        return min;
    }

    public static final Object minBy(Sequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        Object minElem = iterator.next();
        Comparable minValue = (Comparable)selector.invoke(minElem);
        do
        {
            if(!iterator.hasNext())
                break;
            Object e = iterator.next();
            Comparable v = (Comparable)selector.invoke(e);
            if(minValue.compareTo(v) > 0)
            {
                minElem = e;
                minValue = v;
            }
        } while(true);
        return minElem;
    }

    public static final Object minWith(Sequence $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        Object min = iterator.next();
        do
        {
            if(!iterator.hasNext())
                break;
            Object e = iterator.next();
            if(comparator.compare(min, e) > 0)
                min = e;
        } while(true);
        return min;
    }

    public static final boolean none(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterator iterator = $receiver.iterator();
        if(iterator.hasNext())
        {
            Object element = iterator.next();
            return false;
        } else
        {
            return true;
        }
    }

    public static final boolean none(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                return false;
        }

        return true;
    }

    public static final Object reduce(Sequence $receiver, Function2 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new UnsupportedOperationException("Empty sequence can't be reduced.");
        Object accumulator;
        for(accumulator = iterator.next(); iterator.hasNext(); accumulator = operation.invoke(accumulator, iterator.next()));
        return accumulator;
    }

    public static final Object reduceIndexed(Sequence $receiver, Function3 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new UnsupportedOperationException("Empty sequence can't be reduced.");
        int index = 1;
        Object accumulator;
        for(accumulator = iterator.next(); iterator.hasNext(); accumulator = operation.invoke(Integer.valueOf(index), accumulator, iterator.next()))
            index++;

        return accumulator;
    }

    public static final int sumBy(Sequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        int sum = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            sum += ((Number)selector.invoke(element)).intValue();
        }

        return sum;
    }

    public static final double sumByDouble(Sequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        double sum = 0.0D;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            sum += ((Number)selector.invoke(element)).doubleValue();
        }

        return sum;
    }

    public static final Sequence requireNoNulls(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return SequencesKt.map($receiver, (Function1)new Function1($receiver) {

            public final Object invoke(Object it)
            {
                it;
                if(it != null)
                    break MISSING_BLOCK_LABEL_47;
                JVM INSTR pop ;
                throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("null element found in ").append(receiver$0).append(".").toString());
                return;
            }

            final Sequence receiver$0;

            
            {
                receiver$0 = sequence;
                super(1);
            }
        }
);
    }

    public static final Sequence minus(Sequence $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (Sequence)new Sequence($receiver, element) {

            public Iterator iterator()
            {
                kotlin.jvm.internal.Ref.BooleanRef removed = new kotlin.jvm.internal.Ref.BooleanRef();
                removed.element = false;
                return SequencesKt.filter(receiver$0, (Function1)new Function1(this, removed) {

                    public volatile Object invoke(Object obj)
                    {
                        return Boolean.valueOf(invoke(obj));
                    }

                    public final boolean invoke(Object it)
                    {
                        if($removed.element || !Intrinsics.areEqual(it, element)) goto _L2; else goto _L1
_L1:
                        $removed.element = true;
                        false;
                          goto _L3
_L2:
                        true;
_L3:
                        return;
                    }

                    final minus._cls1 this$0;
                    final kotlin.jvm.internal.Ref.BooleanRef $removed;

                    
                    {
                        this$0 = _pcls1;
                        $removed = booleanref;
                        super(1);
                    }
                }
).iterator();
            }

            final Sequence receiver$0;
            final Object $element;

            
            {
                receiver$0 = $receiver;
                $element = $captured_local_variable$1;
                super();
            }
        }
;
    }

    public static final Sequence minus(Sequence $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        Object aobj[] = elements;
        if(aobj.length == 0)
            return $receiver;
        else
            return (Sequence)new Sequence($receiver, elements) {

                public Iterator iterator()
                {
                    HashSet other = ArraysKt.toHashSet($elements);
                    return SequencesKt.filterNot(receiver$0, (Function1)new Function1(other) {

                        public volatile Object invoke(Object obj)
                        {
                            return Boolean.valueOf(invoke(obj));
                        }

                        public final boolean invoke(Object it)
                        {
                            return $other.contains(it);
                        }

                        final HashSet $other;

                    
                    {
                        $other = hashset;
                        super(1);
                    }
                    }
).iterator();
                }

                final Sequence receiver$0;
                final Object $elements[];

            
            {
                receiver$0 = $receiver;
                $elements = $captured_local_variable$1;
                super();
            }
            }
;
    }

    public static final Sequence minus(Sequence $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return (Sequence)new Sequence($receiver, elements) {

            public Iterator iterator()
            {
                Collection other = CollectionsKt.convertToSetForSetOperation($elements);
                if(other.isEmpty())
                    return receiver$0.iterator();
                else
                    return SequencesKt.filterNot(receiver$0, (Function1)new Function1(other) {

                        public volatile Object invoke(Object obj)
                        {
                            return Boolean.valueOf(invoke(obj));
                        }

                        public final boolean invoke(Object it)
                        {
                            return $other.contains(it);
                        }

                        final Collection $other;

                    
                    {
                        $other = collection;
                        super(1);
                    }
                    }
).iterator();
            }

            final Sequence receiver$0;
            final Iterable $elements;

            
            {
                receiver$0 = $receiver;
                $elements = $captured_local_variable$1;
                super();
            }
        }
;
    }

    public static final Sequence minus(Sequence $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return (Sequence)new Sequence($receiver, elements) {

            public Iterator iterator()
            {
                HashSet other = SequencesKt.toHashSet($elements);
                if(other.isEmpty())
                    return receiver$0.iterator();
                else
                    return SequencesKt.filterNot(receiver$0, (Function1)new Function1(other) {

                        public volatile Object invoke(Object obj)
                        {
                            return Boolean.valueOf(invoke(obj));
                        }

                        public final boolean invoke(Object it)
                        {
                            return $other.contains(it);
                        }

                        final HashSet $other;

                    
                    {
                        $other = hashset;
                        super(1);
                    }
                    }
).iterator();
            }

            final Sequence receiver$0;
            final Sequence $elements;

            
            {
                receiver$0 = $receiver;
                $elements = $captured_local_variable$1;
                super();
            }
        }
;
    }

    private static final Sequence minusElement(Sequence $receiver, Object element)
    {
        return SequencesKt.minus($receiver, element);
    }

    public static final Pair partition(Sequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        ArrayList first = new ArrayList();
        ArrayList second = new ArrayList();
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                first.add(element);
            else
                second.add(element);
        }

        return new Pair(first, second);
    }

    public static final Sequence plus(Sequence $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return SequencesKt.flatten(SequencesKt.sequenceOf(new Sequence[] {
            $receiver, SequencesKt.sequenceOf(new Object[] {
                element
            })
        }));
    }

    public static final Sequence plus(Sequence $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        return SequencesKt.plus($receiver, (Iterable)ArraysKt.asList(elements));
    }

    public static final Sequence plus(Sequence $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return SequencesKt.flatten(SequencesKt.sequenceOf(new Sequence[] {
            $receiver, CollectionsKt.asSequence(elements)
        }));
    }

    public static final Sequence plus(Sequence $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        return SequencesKt.flatten(SequencesKt.sequenceOf(new Sequence[] {
            $receiver, elements
        }));
    }

    private static final Sequence plusElement(Sequence $receiver, Object element)
    {
        return SequencesKt.plus($receiver, element);
    }

    public static final Sequence zip(Sequence $receiver, Sequence other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        static final class zip._cls1 extends Lambda
            implements Function2
        {

            public volatile Object invoke(Object obj, Object obj1)
            {
                return invoke(obj, obj1);
            }

            public final Pair invoke(Object t1, Object t2)
            {
                return TuplesKt.to(t1, t2);
            }

            public static final zip._cls1 INSTANCE = new zip._cls1();


        }

        return (Sequence)new MergingSequence($receiver, other, (Function2)zip._cls1.INSTANCE);
    }

    public static final Sequence zip(Sequence $receiver, Sequence other, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        return (Sequence)new MergingSequence($receiver, other, transform);
    }

    public static final Appendable joinTo(Sequence $receiver, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(buffer, "buffer");
        Intrinsics.checkParameterIsNotNull(separator, "separator");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        Intrinsics.checkParameterIsNotNull(postfix, "postfix");
        Intrinsics.checkParameterIsNotNull(truncated, "truncated");
        buffer.append(prefix);
        int count = 0;
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(++count > 1)
                buffer.append(separator);
            if(limit >= 0 && count > limit)
                break;
            if(transform != null)
                buffer.append((CharSequence)transform.invoke(element));
            else
                buffer.append((CharSequence)(element != null ? element.toString() : "null"));
        } while(true);
        if(limit >= 0 && count > limit)
            buffer.append(truncated);
        buffer.append(postfix);
        return buffer;
    }

    public static volatile Appendable joinTo$default(Sequence sequence, Appendable appendable, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, CharSequence charsequence3, Function1 function1, 
            int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinTo");
        if((j & 2) != 0)
            charsequence = (CharSequence)", ";
        if((j & 4) != 0)
            charsequence1 = (CharSequence)"";
        if((j & 8) != 0)
            charsequence2 = (CharSequence)"";
        if((j & 0x10) != 0)
            i = -1;
        if((j & 0x20) != 0)
            charsequence3 = (CharSequence)"...";
        if((j & 0x40) != 0)
            function1 = (Function1)null;
        return SequencesKt.joinTo(sequence, appendable, charsequence, charsequence1, charsequence2, i, charsequence3, function1);
    }

    public static final String joinToString(Sequence $receiver, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(separator, "separator");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        Intrinsics.checkParameterIsNotNull(postfix, "postfix");
        Intrinsics.checkParameterIsNotNull(truncated, "truncated");
        String s = ((StringBuilder)SequencesKt.joinTo($receiver, (Appendable)new StringBuilder(), separator, prefix, postfix, limit, truncated, transform)).toString();
        Intrinsics.checkExpressionValueIsNotNull(s, "joinTo(StringBuilder(), \u2026ed, transform).toString()");
        return s;
    }

    public static volatile String joinToString$default(Sequence sequence, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, CharSequence charsequence3, Function1 function1, int j, 
            Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        if((j & 1) != 0)
            charsequence = (CharSequence)", ";
        if((j & 2) != 0)
            charsequence1 = (CharSequence)"";
        if((j & 4) != 0)
            charsequence2 = (CharSequence)"";
        if((j & 8) != 0)
            i = -1;
        if((j & 0x10) != 0)
            charsequence3 = (CharSequence)"...";
        if((j & 0x20) != 0)
            function1 = (Function1)null;
        return SequencesKt.joinToString(sequence, charsequence, charsequence1, charsequence2, i, charsequence3, function1);
    }

    public static final Iterable asIterable(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        class asIterable..inlined.Iterable._cls1
            implements Iterable, KMappedMarker
        {

            public Iterator iterator()
            {
                return (Iterator)receiver$0$inlined.iterator();
            }

            final Sequence receiver$0$inlined;

            asIterable..inlined.Iterable._cls1(Sequence sequence)
            {
                receiver$0$inlined = sequence;
                super();
            }
        }

        return (Iterable)new asIterable..inlined.Iterable._cls1($receiver);
    }

    private static final Sequence asSequence(Sequence $receiver)
    {
        return $receiver;
    }

    public static final Sequence filterIsInstance(Sequence $receiver, Class klass)
    {
        Sequence sequence;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(klass, "klass");
        sequence = SequencesKt.filter($receiver, (Function1)new Function1(klass) {

            public volatile Object invoke(Object obj)
            {
                return Boolean.valueOf(invoke(obj));
            }

            public final boolean invoke(Object it)
            {
                return $klass.isInstance(it);
            }

            final Class $klass;

            
            {
                $klass = class1;
                super(1);
            }
        }
);
        sequence;
        if(sequence == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
        (Sequence);
        return;
    }

    public static final Collection filterIsInstanceTo(Sequence $receiver, Collection destination, Class klass)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(klass, "klass");
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(klass.isInstance(element))
                destination.add((Object)element);
        } while(true);
        return destination;
    }

    public static final double averageOfByte(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        double sum = 0.0D;
        int count = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            byte element = ((Number)iterator.next()).byteValue();
            sum += element;
            count++;
        }

        return count != 0 ? sum / (double)count : 0.0D;
    }

    public static final double averageOfShort(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        double sum = 0.0D;
        int count = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            short element = ((Number)iterator.next()).shortValue();
            sum += element;
            count++;
        }

        return count != 0 ? sum / (double)count : 0.0D;
    }

    public static final double averageOfInt(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        double sum = 0.0D;
        int count = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            int element = ((Number)iterator.next()).intValue();
            sum += element;
            count++;
        }

        return count != 0 ? sum / (double)count : 0.0D;
    }

    public static final double averageOfLong(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        double sum = 0.0D;
        int count = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            long element = ((Number)iterator.next()).longValue();
            sum += element;
            count++;
        }

        return count != 0 ? sum / (double)count : 0.0D;
    }

    public static final double averageOfFloat(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        double sum = 0.0D;
        int count = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            float element = ((Number)iterator.next()).floatValue();
            sum += element;
            count++;
        }

        return count != 0 ? sum / (double)count : 0.0D;
    }

    public static final double averageOfDouble(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        double sum = 0.0D;
        int count = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            double element = ((Number)iterator.next()).doubleValue();
            sum += element;
            count++;
        }

        return count != 0 ? sum / (double)count : 0.0D;
    }

    public static final int sumOfByte(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        int sum = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            byte element = ((Number)iterator.next()).byteValue();
            sum += element;
        }

        return sum;
    }

    public static final int sumOfShort(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        int sum = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            short element = ((Number)iterator.next()).shortValue();
            sum += element;
        }

        return sum;
    }

    public static final int sumOfInt(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        int sum = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            int element = ((Number)iterator.next()).intValue();
            sum += element;
        }

        return sum;
    }

    public static final long sumOfLong(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        long sum = 0L;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            long element = ((Number)iterator.next()).longValue();
            sum += element;
        }

        return sum;
    }

    public static final float sumOfFloat(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        float sum = 0.0F;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            float element = ((Number)iterator.next()).floatValue();
            sum += element;
        }

        return sum;
    }

    public static final double sumOfDouble(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        double sum = 0.0D;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            double element = ((Number)iterator.next()).doubleValue();
            sum += element;
        }

        return sum;
    }

    public SequencesKt___SequencesKt()
    {
    }
}
