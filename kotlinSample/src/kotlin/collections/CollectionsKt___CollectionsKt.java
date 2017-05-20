// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   _Collections.kt

package kotlin.collections;

import java.util.*;
import kotlin.*;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.collections:
//            CollectionsKt__ReversedViewsKt, CollectionsKt, ArraysKt, MapsKt, 
//            SetsKt, IndexingIterable

class CollectionsKt___CollectionsKt extends CollectionsKt__ReversedViewsKt
{

    private static final Object component1(List $receiver)
    {
        return $receiver.get(0);
    }

    private static final Object component2(List $receiver)
    {
        return $receiver.get(1);
    }

    private static final Object component3(List $receiver)
    {
        return $receiver.get(2);
    }

    private static final Object component4(List $receiver)
    {
        return $receiver.get(3);
    }

    private static final Object component5(List $receiver)
    {
        return $receiver.get(4);
    }

    public static final boolean contains(Iterable $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof Collection)
            return ((Collection)$receiver).contains(element);
        else
            return CollectionsKt.indexOf($receiver, element) >= 0;
    }

    public static final Object elementAt(Iterable $receiver, int index)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof List)
            return ((List)$receiver).get(index);
        else
            return CollectionsKt.elementAtOrElse($receiver, index, (Function1)new Function1(index) {

                public volatile Object invoke(Object obj)
                {
                    return invoke(((Number)obj).intValue());
                }

                public final Void invoke(int it)
                {
                    throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("Collection doesn't contain element at index ").append($index).append(".").toString());
                }

                final int $index;

            
            {
                $index = i;
                super(1);
            }
            }
);
    }

    private static final Object elementAt(List $receiver, int index)
    {
        return $receiver.get(index);
    }

    public static final Object elementAtOrElse(Iterable $receiver, int index, Function1 defaultValue)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        if($receiver instanceof List)
        {
            List list = (List)$receiver;
            return index < 0 || index > CollectionsKt.getLastIndex(list) ? defaultValue.invoke(Integer.valueOf(index)) : list.get(index);
        }
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

    private static final Object elementAtOrElse(List $receiver, int index, Function1 defaultValue)
    {
        return index < 0 || index > CollectionsKt.getLastIndex($receiver) ? defaultValue.invoke(Integer.valueOf(index)) : $receiver.get(index);
    }

    public static final Object elementAtOrNull(Iterable $receiver, int index)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof List)
            return CollectionsKt.getOrNull((List)$receiver, index);
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

    private static final Object elementAtOrNull(List $receiver, int index)
    {
        return CollectionsKt.getOrNull($receiver, index);
    }

    private static final Object find(Iterable $receiver, Function1 predicate)
    {
        Iterator iterator;
        Iterable iterable = $receiver;
        iterator = iterable.iterator();
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

    private static final Object findLast(Iterable $receiver, Function1 predicate)
    {
        Iterable $receiver$iv = $receiver;
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

    private static final Object findLast(List $receiver, Function1 predicate)
    {
        ListIterator iterator$iv;
        List $receiver$iv = $receiver;
        iterator$iv = $receiver$iv.listIterator($receiver$iv.size());
_L4:
        if(!iterator$iv.hasPrevious()) goto _L2; else goto _L1
_L1:
        Object element$iv = iterator$iv.previous();
        if(!((Boolean)predicate.invoke(element$iv)).booleanValue()) goto _L4; else goto _L3
_L3:
        element$iv;
          goto _L5
_L2:
        null;
_L5:
        return;
    }

    public static final Object first(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterable iterable = $receiver;
        if(iterable instanceof List)
            return CollectionsKt.first((List)$receiver);
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new NoSuchElementException("Collection is empty.");
        else
            return iterator.next();
    }

    public static final Object first(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver.isEmpty())
            throw (Throwable)new NoSuchElementException("List is empty.");
        else
            return $receiver.get(0);
    }

    public static final Object first(Iterable $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                return element;
        }

        throw (Throwable)new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final Object firstOrNull(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterable iterable = $receiver;
        if(iterable instanceof List)
            if(((List)$receiver).isEmpty())
                return null;
            else
                return ((List)$receiver).get(0);
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        else
            return iterator.next();
    }

    public static final Object firstOrNull(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.isEmpty() ? null : $receiver.get(0);
    }

    public static final Object firstOrNull(Iterable $receiver, Function1 predicate)
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

    private static final Object getOrElse(List $receiver, int index, Function1 defaultValue)
    {
        return index < 0 || index > CollectionsKt.getLastIndex($receiver) ? defaultValue.invoke(Integer.valueOf(index)) : $receiver.get(index);
    }

    public static final Object getOrNull(List $receiver, int index)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return index < 0 || index > CollectionsKt.getLastIndex($receiver) ? null : $receiver.get(index);
    }

    public static final int indexOf(Iterable $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof List)
            return ((List)$receiver).indexOf(element);
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

    public static final int indexOf(List $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.indexOf(element);
    }

    public static final int indexOfFirst(Iterable $receiver, Function1 predicate)
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

    public static final int indexOfFirst(List $receiver, Function1 predicate)
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

    public static final int indexOfLast(Iterable $receiver, Function1 predicate)
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

    public static final int indexOfLast(List $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(ListIterator iterator = $receiver.listIterator($receiver.size()); iterator.hasPrevious();)
            if(((Boolean)predicate.invoke(iterator.previous())).booleanValue())
                return iterator.nextIndex();

        return -1;
    }

    public static final Object last(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterable iterable = $receiver;
        if(iterable instanceof List)
            return CollectionsKt.last((List)$receiver);
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new NoSuchElementException("Collection is empty.");
        Object last;
        for(last = iterator.next(); iterator.hasNext(); last = iterator.next());
        return last;
    }

    public static final Object last(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver.isEmpty())
            throw (Throwable)new NoSuchElementException("List is empty.");
        else
            return $receiver.get(CollectionsKt.getLastIndex($receiver));
    }

    public static final Object last(Iterable $receiver, Function1 predicate)
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
            throw (Throwable)new NoSuchElementException("Collection contains no element matching the predicate.");
        else
            return (Object)last;
    }

    public static final Object last(List $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(ListIterator iterator = $receiver.listIterator($receiver.size()); iterator.hasPrevious();)
        {
            Object element = iterator.previous();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                return element;
        }

        throw (Throwable)new NoSuchElementException("List contains no element matching the predicate.");
    }

    public static final int lastIndexOf(Iterable $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof List)
            return ((List)$receiver).lastIndexOf(element);
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

    public static final int lastIndexOf(List $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.lastIndexOf(element);
    }

    public static final Object lastOrNull(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterable iterable = $receiver;
        if(iterable instanceof List)
            return ((List)$receiver).isEmpty() ? null : ((List)$receiver).get(((List)$receiver).size() - 1);
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        Object last;
        for(last = iterator.next(); iterator.hasNext(); last = iterator.next());
        return last;
    }

    public static final Object lastOrNull(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.isEmpty() ? null : $receiver.get($receiver.size() - 1);
    }

    public static final Object lastOrNull(Iterable $receiver, Function1 predicate)
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

    public static final Object lastOrNull(List $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(ListIterator iterator = $receiver.listIterator($receiver.size()); iterator.hasPrevious();)
        {
            Object element = iterator.previous();
            if(((Boolean)predicate.invoke(element)).booleanValue())
                return element;
        }

        return null;
    }

    public static final Object single(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterable iterable = $receiver;
        if(iterable instanceof List)
            return CollectionsKt.single((List)$receiver);
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new NoSuchElementException("Collection is empty.");
        Object single = iterator.next();
        if(iterator.hasNext())
            throw (Throwable)new IllegalArgumentException("Collection has more than one element.");
        else
            return single;
    }

    public static final Object single(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        switch($receiver.size())
        {
        case 0: // '\0'
            throw (Throwable)new NoSuchElementException("List is empty.");

        case 1: // '\001'
            return $receiver.get(0);
        }
        throw (Throwable)new IllegalArgumentException("List has more than one element.");
    }

    public static final Object single(Iterable $receiver, Function1 predicate)
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
                    throw (Throwable)new IllegalArgumentException("Collection contains more than one matching element.");
                single = element;
                found = true;
            }
        } while(true);
        if(!found)
            throw (Throwable)new NoSuchElementException("Collection contains no element matching the predicate.");
        else
            return (Object)single;
    }

    public static final Object singleOrNull(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterable iterable = $receiver;
        if(iterable instanceof List)
            return ((List)$receiver).size() != 1 ? null : ((List)$receiver).get(0);
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            return null;
        Object single = iterator.next();
        if(iterator.hasNext())
            return null;
        else
            return single;
    }

    public static final Object singleOrNull(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.size() != 1 ? null : $receiver.get(0);
    }

    public static final Object singleOrNull(Iterable $receiver, Function1 predicate)
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

    public static final List drop(Iterable $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested element count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        }
        if(n == 0)
            return CollectionsKt.toList($receiver);
        ArrayList list;
        if($receiver instanceof Collection)
        {
            int resultSize = ((Collection)$receiver).size() - n;
            if(resultSize <= 0)
                return CollectionsKt.emptyList();
            if(resultSize == 1)
                return CollectionsKt.listOf(CollectionsKt.last($receiver));
            list = new ArrayList(resultSize);
            if($receiver instanceof List)
            {
                if($receiver instanceof RandomAccess)
                {
                    int index = n;
                    int i = ((List)$receiver).size() - 1;
                    if(index <= i)
                        do
                        {
                            list.add(((List)$receiver).get(index));
                            if(index == i)
                                break;
                            index++;
                        } while(true);
                } else
                {
                    Iterator iterator2 = (Iterator)((List)$receiver).listIterator(n);
                    Object item;
                    for(Iterator iterator = iterator2; iterator.hasNext(); list.add(item))
                        item = iterator.next();

                }
                return (List)list;
            }
        } else
        {
            list = new ArrayList();
        }
        int count = 0;
        Iterator iterator1 = $receiver.iterator();
        do
        {
            if(!iterator1.hasNext())
                break;
            Object item = iterator1.next();
            if(count++ >= n)
                list.add(item);
        } while(true);
        return CollectionsKt.optimizeReadOnlyList((List)list);
    }

    public static final List dropLast(List $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested element count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return CollectionsKt.take((Iterable)$receiver, RangesKt.coerceAtLeast($receiver.size() - n, 0));
        }
    }

    public static final List dropLastWhile(List $receiver, Function1 predicate)
    {
label0:
        {
            Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
            Intrinsics.checkParameterIsNotNull(predicate, "predicate");
            if($receiver.isEmpty())
                break label0;
            ListIterator iterator = $receiver.listIterator($receiver.size());
            do
                if(!iterator.hasPrevious())
                    break label0;
            while(((Boolean)predicate.invoke(iterator.previous())).booleanValue());
            return CollectionsKt.take((Iterable)$receiver, iterator.nextIndex() + 1);
        }
        return CollectionsKt.emptyList();
    }

    public static final List dropWhile(Iterable $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        boolean yielding = false;
        ArrayList list = new ArrayList();
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object item = iterator.next();
            if(yielding)
                list.add(item);
            else
            if(!((Boolean)predicate.invoke(item)).booleanValue())
            {
                list.add(item);
                yielding = true;
            }
        } while(true);
        return (List)list;
    }

    public static final List filter(Iterable $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Iterable iterable = $receiver;
        Collection destination$iv = (Collection)new ArrayList();
        Iterator iterator = iterable.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv = iterator.next();
            if(((Boolean)predicate.invoke(element$iv)).booleanValue())
                destination$iv.add(element$iv);
        } while(true);
        return (List)destination$iv;
    }

    public static final List filterIndexed(Iterable $receiver, Function2 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Iterable iterable = $receiver;
        Collection destination$iv = (Collection)new ArrayList();
        Iterable $receiver$iv$iv = iterable;
        int index$iv$iv = 0;
        for(Iterator iterator = $receiver$iv$iv.iterator(); iterator.hasNext();)
        {
            Object item$iv$iv = iterator.next();
            Object element$iv = item$iv$iv;
            int index$iv = index$iv$iv++;
            if(((Boolean)predicate.invoke(Integer.valueOf(index$iv), element$iv)).booleanValue())
                destination$iv.add(element$iv);
        }

        return (List)destination$iv;
    }

    public static final Collection filterIndexedTo(Iterable $receiver, Collection destination, Function2 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Iterable $receiver$iv = $receiver;
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

    private static final List filterIsInstance(Iterable $receiver)
    {
        Iterable iterable = $receiver;
        Collection destination$iv = (Collection)new ArrayList();
        Iterator iterator = iterable.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv = iterator.next();
            Intrinsics.reifiedOperationMarker(3, "R");
            if(element$iv instanceof Object)
                destination$iv.add(element$iv);
        } while(true);
        return (List)destination$iv;
    }

    private static final Collection filterIsInstanceTo(Iterable $receiver, Collection destination)
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

    public static final List filterNot(Iterable $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Iterable iterable = $receiver;
        Collection destination$iv = (Collection)new ArrayList();
        Iterator iterator = iterable.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv = iterator.next();
            if(!((Boolean)predicate.invoke(element$iv)).booleanValue())
                destination$iv.add(element$iv);
        } while(true);
        return (List)destination$iv;
    }

    public static final List filterNotNull(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (List)CollectionsKt.filterNotNullTo($receiver, (Collection)new ArrayList());
    }

    public static final Collection filterNotNullTo(Iterable $receiver, Collection destination)
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

    public static final Collection filterNotTo(Iterable $receiver, Collection destination, Function1 predicate)
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

    public static final Collection filterTo(Iterable $receiver, Collection destination, Function1 predicate)
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

    public static final List slice(List $receiver, IntRange indices)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(indices, "indices");
        if(indices.isEmpty())
            return CollectionsKt.emptyList();
        else
            return CollectionsKt.toList((Iterable)$receiver.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final List slice(List $receiver, Iterable indices)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(indices, "indices");
        int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if(size == 0)
            return CollectionsKt.emptyList();
        ArrayList list = new ArrayList(size);
        int index;
        for(Iterator iterator = indices.iterator(); iterator.hasNext(); list.add($receiver.get(index)))
            index = ((Number)iterator.next()).intValue();

        return (List)list;
    }

    public static final List take(Iterable $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested element count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        }
        if(n == 0)
            return CollectionsKt.emptyList();
        if($receiver instanceof Collection)
        {
            if(n >= ((Collection)$receiver).size())
                return CollectionsKt.toList($receiver);
            if(n == 1)
                return CollectionsKt.listOf(CollectionsKt.first($receiver));
        }
        int count = 0;
        ArrayList list = new ArrayList(n);
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object item = iterator.next();
            if(count++ == n)
                break;
            list.add(item);
        } while(true);
        return CollectionsKt.optimizeReadOnlyList((List)list);
    }

    public static final List takeLast(List $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested element count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        }
        if(n == 0)
            return CollectionsKt.emptyList();
        int size = $receiver.size();
        if(n >= size)
            return CollectionsKt.toList((Iterable)$receiver);
        if(n == 1)
            return CollectionsKt.listOf(CollectionsKt.last($receiver));
        ArrayList list = new ArrayList(n);
        if($receiver instanceof RandomAccess)
        {
            int index = size - n;
            int i = size - 1;
            if(index <= i)
                do
                {
                    list.add($receiver.get(index));
                    if(index == i)
                        break;
                    index++;
                } while(true);
        } else
        {
            Iterator iterator1 = (Iterator)$receiver.listIterator(n);
            Object item;
            for(Iterator iterator = iterator1; iterator.hasNext(); list.add(item))
                item = iterator.next();

        }
        return (List)list;
    }

    public static final List takeLastWhile(List $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        if($receiver.isEmpty())
            return CollectionsKt.emptyList();
        for(ListIterator iterator = $receiver.listIterator($receiver.size()); iterator.hasPrevious();)
            if(!((Boolean)predicate.invoke(iterator.previous())).booleanValue())
            {
                iterator.next();
                int expectedSize = $receiver.size() - iterator.nextIndex();
                if(expectedSize == 0)
                    return CollectionsKt.emptyList();
                ArrayList arraylist = new ArrayList(expectedSize);
                ArrayList $receiver = (ArrayList)arraylist;
                for(; iterator.hasNext(); $receiver.add(iterator.next()));
                return (List)arraylist;
            }

        return CollectionsKt.toList((Iterable)$receiver);
    }

    public static final List takeWhile(Iterable $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        ArrayList list = new ArrayList();
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object item = iterator.next();
            if(!((Boolean)predicate.invoke(item)).booleanValue())
                break;
            list.add(item);
        } while(true);
        return (List)list;
    }

    public static final void reverse(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Collections.reverse($receiver);
    }

    public static final List reversed(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(($receiver instanceof Collection) && ((Collection)$receiver).size() <= 1)
        {
            return CollectionsKt.toList($receiver);
        } else
        {
            List list = CollectionsKt.toMutableList($receiver);
            Collections.reverse(list);
            return list;
        }
    }

    public static final void sortBy(List $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        if($receiver.size() > 1)
        {
            List list = $receiver;
            Comparator comparator = (Comparator)new kotlin.comparisons.ComparisonsKt.compareBy._cls2(selector);
            CollectionsKt.sortWith(list, comparator);
        }
    }

    public static final void sortByDescending(List $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        if($receiver.size() > 1)
        {
            List list = $receiver;
            Comparator comparator = (Comparator)new kotlin.comparisons.ComparisonsKt.compareByDescending._cls1(selector);
            CollectionsKt.sortWith(list, comparator);
        }
    }

    public static final void sortDescending(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CollectionsKt.sortWith($receiver, ComparisonsKt.reverseOrder());
    }

    public static final List sorted(Iterable $receiver)
    {
        Collection collection;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(!($receiver instanceof Collection))
            break MISSING_BLOCK_LABEL_132;
        if(((Collection)$receiver).size() <= 1)
            return CollectionsKt.toList($receiver);
        collection = (Collection)$receiver;
        collection;
        if(collection == null)
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        (Collection);
        Collection thisCollection$iv;
        thisCollection$iv;
        Object aobj[] = thisCollection$iv.toArray(new Comparable[thisCollection$iv.size()]);
        aobj;
        if(aobj == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        (Object[]);
        JVM INSTR dup ;
        JVM INSTR ifnonnull 105;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_94;
_L2:
        break MISSING_BLOCK_LABEL_105;
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        (Comparable[]);
        Comparable acomparable[];
        acomparable;
        Comparable $receiver[] = (Comparable[])acomparable;
        ArraysKt.sort((Object[])$receiver);
        return ArraysKt.asList((Object[])acomparable);
        List list = CollectionsKt.toMutableList($receiver);
        List $receiver = (List)list;
        CollectionsKt.sort($receiver);
        return (List)list;
    }

    public static final List sortedBy(Iterable $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        Iterable iterable = $receiver;
        Comparator comparator = (Comparator)new kotlin.comparisons.ComparisonsKt.compareBy._cls2(selector);
        return CollectionsKt.sortedWith(iterable, comparator);
    }

    public static final List sortedByDescending(Iterable $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        Iterable iterable = $receiver;
        Comparator comparator = (Comparator)new kotlin.comparisons.ComparisonsKt.compareByDescending._cls1(selector);
        return CollectionsKt.sortedWith(iterable, comparator);
    }

    public static final List sortedDescending(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return CollectionsKt.sortedWith($receiver, ComparisonsKt.reverseOrder());
    }

    public static final List sortedWith(Iterable $receiver, Comparator comparator)
    {
        Collection collection;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        if(!($receiver instanceof Collection))
            break MISSING_BLOCK_LABEL_137;
        if(((Collection)$receiver).size() <= 1)
            return CollectionsKt.toList($receiver);
        collection = (Collection)$receiver;
        collection;
        if(collection == null)
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        (Collection);
        Collection thisCollection$iv;
        thisCollection$iv;
        Object aobj1[] = thisCollection$iv.toArray(new Object[thisCollection$iv.size()]);
        aobj1;
        if(aobj1 == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        (Object[]);
        JVM INSTR dup ;
        JVM INSTR ifnonnull 112;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_101;
_L2:
        break MISSING_BLOCK_LABEL_112;
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        (Object[]);
        Object aobj[];
        aobj;
        Object $receiver[] = (Object[])aobj;
        ArraysKt.sortWith($receiver, comparator);
        return ArraysKt.asList((Object[])aobj);
        List list = CollectionsKt.toMutableList($receiver);
        List $receiver = (List)list;
        CollectionsKt.sortWith($receiver, comparator);
        return (List)list;
    }

    public static final boolean[] toBooleanArray(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean result[] = new boolean[$receiver.size()];
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            boolean element = ((Boolean)iterator.next()).booleanValue();
            result[index++] = element;
        }

        return result;
    }

    public static final byte[] toByteArray(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        byte result[] = new byte[$receiver.size()];
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            byte element = ((Number)iterator.next()).byteValue();
            result[index++] = element;
        }

        return result;
    }

    public static final char[] toCharArray(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        char result[] = new char[$receiver.size()];
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            char element = ((Character)iterator.next()).charValue();
            result[index++] = element;
        }

        return result;
    }

    public static final double[] toDoubleArray(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        double result[] = new double[$receiver.size()];
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            double element = ((Number)iterator.next()).doubleValue();
            result[index++] = element;
        }

        return result;
    }

    public static final float[] toFloatArray(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        float result[] = new float[$receiver.size()];
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            float element = ((Number)iterator.next()).floatValue();
            result[index++] = element;
        }

        return result;
    }

    public static final int[] toIntArray(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        int result[] = new int[$receiver.size()];
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            int element = ((Number)iterator.next()).intValue();
            result[index++] = element;
        }

        return result;
    }

    public static final long[] toLongArray(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        long result[] = new long[$receiver.size()];
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            long element = ((Number)iterator.next()).longValue();
            result[index++] = element;
        }

        return result;
    }

    public static final short[] toShortArray(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        short result[] = new short[$receiver.size()];
        int index = 0;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            short element = ((Number)iterator.next()).shortValue();
            result[index++] = element;
        }

        return result;
    }

    public static final Map associate(Iterable $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($receiver, 10)), 16);
        Iterable iterable = $receiver;
        Map destination$iv = (Map)new LinkedHashMap(capacity);
        Map map1;
        Pair pair;
        for(Iterator iterator = iterable.iterator(); iterator.hasNext(); map1.put(pair.getFirst(), pair.getSecond()))
        {
            Object element$iv = iterator.next();
            map1 = destination$iv;
            pair = (Pair)transform.invoke(element$iv);
        }

        return destination$iv;
    }

    public static final Map associateBy(Iterable $receiver, Function1 keySelector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($receiver, 10)), 16);
        Iterable iterable = $receiver;
        Map destination$iv = (Map)new LinkedHashMap(capacity);
        Object element$iv;
        for(Iterator iterator = iterable.iterator(); iterator.hasNext(); destination$iv.put(keySelector.invoke(element$iv), element$iv))
            element$iv = iterator.next();

        return destination$iv;
    }

    public static final Map associateBy(Iterable $receiver, Function1 keySelector, Function1 valueTransform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($receiver, 10)), 16);
        Iterable iterable = $receiver;
        Map destination$iv = (Map)new LinkedHashMap(capacity);
        Object element$iv;
        for(Iterator iterator = iterable.iterator(); iterator.hasNext(); destination$iv.put(keySelector.invoke(element$iv), valueTransform.invoke(element$iv)))
            element$iv = iterator.next();

        return destination$iv;
    }

    public static final Map associateByTo(Iterable $receiver, Map destination, Function1 keySelector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Object element;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); destination.put(keySelector.invoke(element), element))
            element = iterator.next();

        return destination;
    }

    public static final Map associateByTo(Iterable $receiver, Map destination, Function1 keySelector, Function1 valueTransform)
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

    public static final Map associateTo(Iterable $receiver, Map destination, Function1 transform)
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

    public static final Collection toCollection(Iterable $receiver, Collection destination)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Object item;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); destination.add(item))
            item = iterator.next();

        return destination;
    }

    public static final HashSet toHashSet(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (HashSet)CollectionsKt.toCollection($receiver, (Collection)new HashSet(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($receiver, 12))));
    }

    public static final List toList(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        List list;
        if($receiver instanceof Collection)
        {
            switch(((Collection)$receiver).size())
            {
            case 0: // '\0'
                list = CollectionsKt.emptyList();
                break;

            case 1: // '\001'
                list = CollectionsKt.listOf(($receiver instanceof List) ? ((List)$receiver).get(0) : $receiver.iterator().next());
                break;

            default:
                list = CollectionsKt.toMutableList((Collection)$receiver);
                break;
            }
            return list;
        } else
        {
            return CollectionsKt.optimizeReadOnlyList(CollectionsKt.toMutableList($receiver));
        }
    }

    public static final List toMutableList(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof Collection)
            return CollectionsKt.toMutableList((Collection)$receiver);
        else
            return (List)CollectionsKt.toCollection($receiver, (Collection)new ArrayList());
    }

    public static final List toMutableList(Collection $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (List)new ArrayList($receiver);
    }

    public static final Set toSet(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Set set;
        if($receiver instanceof Collection)
        {
            switch(((Collection)$receiver).size())
            {
            case 0: // '\0'
                set = SetsKt.emptySet();
                break;

            case 1: // '\001'
                set = SetsKt.setOf(($receiver instanceof List) ? ((List)$receiver).get(0) : $receiver.iterator().next());
                break;

            default:
                set = (Set)CollectionsKt.toCollection($receiver, (Collection)new LinkedHashSet(MapsKt.mapCapacity(((Collection)$receiver).size())));
                break;
            }
            return set;
        } else
        {
            return SetsKt.optimizeReadOnlySet((Set)CollectionsKt.toCollection($receiver, (Collection)new LinkedHashSet()));
        }
    }

    public static final SortedSet toSortedSet(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (SortedSet)CollectionsKt.toCollection($receiver, (Collection)new TreeSet());
    }

    public static final SortedSet toSortedSet(Iterable $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (SortedSet)CollectionsKt.toCollection($receiver, (Collection)new TreeSet(comparator));
    }

    public static final List flatMap(Iterable $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable iterable = $receiver;
        Collection destination$iv = (Collection)new ArrayList();
        Iterable list$iv;
        for(Iterator iterator = iterable.iterator(); iterator.hasNext(); CollectionsKt.addAll(destination$iv, list$iv))
        {
            Object element$iv = iterator.next();
            list$iv = (Iterable)transform.invoke(element$iv);
        }

        return (List)destination$iv;
    }

    public static final Collection flatMapTo(Iterable $receiver, Collection destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable list;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); CollectionsKt.addAll(destination, list))
        {
            Object element = iterator.next();
            list = (Iterable)transform.invoke(element);
        }

        return destination;
    }

    public static final Map groupBy(Iterable $receiver, Function1 keySelector)
    {
        Map destination$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Iterable iterable = $receiver;
        destination$iv = (Map)new LinkedHashMap();
        iterator = iterable.iterator();
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

    public static final Map groupBy(Iterable $receiver, Function1 keySelector, Function1 valueTransform)
    {
        Map destination$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        Iterable iterable = $receiver;
        destination$iv = (Map)new LinkedHashMap();
        iterator = iterable.iterator();
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

    public static final Map groupByTo(Iterable $receiver, Map destination, Function1 keySelector)
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

    public static final Map groupByTo(Iterable $receiver, Map destination, Function1 keySelector, Function1 valueTransform)
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

    public static final List map(Iterable $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable iterable = $receiver;
        Collection destination$iv = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver, 10));
        Object item$iv;
        for(Iterator iterator = iterable.iterator(); iterator.hasNext(); destination$iv.add(transform.invoke(item$iv)))
            item$iv = iterator.next();

        return (List)destination$iv;
    }

    public static final List mapIndexed(Iterable $receiver, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable $receiver$iv = $receiver;
        Collection destination$iv = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver, 10));
        int index$iv = 0;
        Object item$iv;
        for(Iterator iterator = $receiver$iv.iterator(); iterator.hasNext(); destination$iv.add(transform.invoke(Integer.valueOf(index$iv), item$iv)))
        {
            item$iv = iterator.next();
            index$iv++;
        }

        return (List)destination$iv;
    }

    public static final List mapIndexedNotNull(Iterable $receiver, Function2 transform)
    {
        Collection destination$iv;
        int index$iv$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable iterable = $receiver;
        destination$iv = (Collection)new ArrayList();
        Iterable $receiver$iv$iv = iterable;
        index$iv$iv = 0;
        iterator = $receiver$iv$iv.iterator();
_L3:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object item$iv$iv = iterator.next();
        Object element$iv = item$iv$iv;
        int index$iv = index$iv$iv++;
        obj1 = transform.invoke(Integer.valueOf(index$iv), element$iv);
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

    public static final Collection mapIndexedNotNullTo(Iterable $receiver, Collection destination, Function2 transform)
    {
        int index$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable $receiver$iv = $receiver;
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
            break MISSING_BLOCK_LABEL_103;
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

    public static final Collection mapIndexedTo(Iterable $receiver, Collection destination, Function2 transform)
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

    public static final List mapNotNull(Iterable $receiver, Function1 transform)
    {
        Collection destination$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable iterable = $receiver;
        destination$iv = (Collection)new ArrayList();
        Iterable iterable1 = iterable;
        iterator = iterable1.iterator();
_L3:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object element$iv$iv = iterator.next();
        Object element$iv = element$iv$iv;
        obj1 = transform.invoke(element$iv);
        obj1;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_97;
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

    public static final Collection mapNotNullTo(Iterable $receiver, Collection destination, Function1 transform)
    {
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable iterable = $receiver;
        iterator = iterable.iterator();
_L3:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object element$iv = iterator.next();
        Object element = element$iv;
        obj1 = transform.invoke(element);
        obj1;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_88;
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

    public static final Collection mapTo(Iterable $receiver, Collection destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Object item;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); destination.add(transform.invoke(item)))
            item = iterator.next();

        return destination;
    }

    public static final Iterable withIndex(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (Iterable)new IndexingIterable((Function0)new Function0($receiver) {

            public volatile Object invoke()
            {
                return invoke();
            }

            public final Iterator invoke()
            {
                return receiver$0.iterator();
            }

            final Iterable receiver$0;

            
            {
                receiver$0 = iterable;
                super(0);
            }
        }
);
    }

    public static final List distinct(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return CollectionsKt.toList((Iterable)CollectionsKt.toMutableSet($receiver));
    }

    public static final List distinctBy(Iterable $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        HashSet set = new HashSet();
        ArrayList list = new ArrayList();
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object e = iterator.next();
            Object key = selector.invoke(e);
            if(set.add(key))
                list.add(e);
        } while(true);
        return (List)list;
    }

    public static final Set intersect(Iterable $receiver, Iterable other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Set set = CollectionsKt.toMutableSet($receiver);
        CollectionsKt.retainAll((Collection)set, other);
        return set;
    }

    public static final Set subtract(Iterable $receiver, Iterable other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Set set = CollectionsKt.toMutableSet($receiver);
        CollectionsKt.removeAll((Collection)set, other);
        return set;
    }

    public static final Set toMutableSet(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Iterable iterable = $receiver;
        return (iterable instanceof Collection) ? (Set)new LinkedHashSet((Collection)$receiver) : (Set)CollectionsKt.toCollection($receiver, (Collection)new LinkedHashSet());
    }

    public static final Set union(Iterable $receiver, Iterable other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Set set = CollectionsKt.toMutableSet($receiver);
        CollectionsKt.addAll((Collection)set, other);
        return set;
    }

    public static final boolean all(Iterable $receiver, Function1 predicate)
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

    public static final boolean any(Iterable $receiver)
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

    public static final boolean any(Iterable $receiver, Function1 predicate)
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

    public static final int count(Iterable $receiver)
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

    private static final int count(Collection $receiver)
    {
        return $receiver.size();
    }

    public static final int count(Iterable $receiver, Function1 predicate)
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

    public static final Object fold(Iterable $receiver, Object initial, Function2 operation)
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

    public static final Object foldIndexed(Iterable $receiver, Object initial, Function3 operation)
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

    public static final Object foldRight(List $receiver, Object initial, Function2 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Object accumulator = initial;
        if(!$receiver.isEmpty())
        {
            for(ListIterator iterator = $receiver.listIterator($receiver.size()); iterator.hasPrevious();)
                accumulator = operation.invoke(iterator.previous(), accumulator);

        }
        return accumulator;
    }

    public static final Object foldRightIndexed(List $receiver, Object initial, Function3 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Object accumulator = initial;
        if(!$receiver.isEmpty())
        {
            for(ListIterator iterator = $receiver.listIterator($receiver.size()); iterator.hasPrevious();)
            {
                int index = iterator.previousIndex();
                accumulator = operation.invoke(Integer.valueOf(index), iterator.previous(), accumulator);
            }

        }
        return accumulator;
    }

    public static final void forEach(Iterable $receiver, Function1 action)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(action, "action");
        Object element;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); action.invoke(element))
            element = iterator.next();

    }

    public static final void forEachIndexed(Iterable $receiver, Function2 action)
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

    public static final Comparable max(Iterable $receiver)
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

    public static final Object maxBy(Iterable $receiver, Function1 selector)
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

    public static final Object maxWith(Iterable $receiver, Comparator comparator)
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

    public static final Comparable min(Iterable $receiver)
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

    public static final Object minBy(Iterable $receiver, Function1 selector)
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

    public static final Object minWith(Iterable $receiver, Comparator comparator)
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

    public static final boolean none(Iterable $receiver)
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

    public static final boolean none(Iterable $receiver, Function1 predicate)
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

    public static final Object reduce(Iterable $receiver, Function2 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new UnsupportedOperationException("Empty collection can't be reduced.");
        Object accumulator;
        for(accumulator = iterator.next(); iterator.hasNext(); accumulator = operation.invoke(accumulator, iterator.next()));
        return accumulator;
    }

    public static final Object reduceIndexed(Iterable $receiver, Function3 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Iterator iterator = $receiver.iterator();
        if(!iterator.hasNext())
            throw (Throwable)new UnsupportedOperationException("Empty collection can't be reduced.");
        int index = 1;
        Object accumulator;
        for(accumulator = iterator.next(); iterator.hasNext(); accumulator = operation.invoke(Integer.valueOf(index), accumulator, iterator.next()))
            index++;

        return accumulator;
    }

    public static final Object reduceRight(List $receiver, Function2 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        ListIterator iterator = $receiver.listIterator($receiver.size());
        if(!iterator.hasPrevious())
            throw (Throwable)new UnsupportedOperationException("Empty list can't be reduced.");
        Object accumulator;
        for(accumulator = iterator.previous(); iterator.hasPrevious(); accumulator = operation.invoke(iterator.previous(), accumulator));
        return accumulator;
    }

    public static final Object reduceRightIndexed(List $receiver, Function3 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        ListIterator iterator = $receiver.listIterator($receiver.size());
        if(!iterator.hasPrevious())
            throw (Throwable)new UnsupportedOperationException("Empty list can't be reduced.");
        Object accumulator;
        int index;
        for(accumulator = iterator.previous(); iterator.hasPrevious(); accumulator = operation.invoke(Integer.valueOf(index), iterator.previous(), accumulator))
            index = iterator.previousIndex();

        return accumulator;
    }

    public static final int sumBy(Iterable $receiver, Function1 selector)
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

    public static final double sumByDouble(Iterable $receiver, Function1 selector)
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

    public static final Iterable requireNoNulls(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            if(element == null)
                throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("null element found in ").append($receiver).append(".").toString());
        }

        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Iterable<T>");
        (Iterable);
        return;
    }

    public static final List requireNoNulls(List $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext();)
        {
            Object element = iterator.next();
            if(element == null)
                throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("null element found in ").append($receiver).append(".").toString());
        }

        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<T>");
        (List);
        return;
    }

    public static final List minus(Iterable $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        ArrayList result = new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver, 10));
        kotlin.jvm.internal.Ref.BooleanRef removed = new kotlin.jvm.internal.Ref.BooleanRef();
        removed.element = false;
        Iterable iterable = $receiver;
        Iterator iterator = iterable.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv = iterator.next();
            Object it = element$iv;
            if(!removed.element && Intrinsics.areEqual(it, element))
            {
                removed.element = true;
                if(true)
                    continue;
            } else
            if(false)
                continue;
            ((Collection)result).add(element$iv);
        } while(true);
        return (List)(Collection)result;
    }

    public static final List minus(Iterable $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        Object aobj[] = elements;
        if(aobj.length == 0)
            return CollectionsKt.toList($receiver);
        HashSet other = ArraysKt.toHashSet(elements);
        Iterable iterable = $receiver;
        Iterable iterable1 = iterable;
        Collection destination$iv$iv = (Collection)new ArrayList();
        Iterator iterator = iterable1.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv$iv = iterator.next();
            Object it = element$iv$iv;
            if(!other.contains(it))
                destination$iv$iv.add(element$iv$iv);
        } while(true);
        return (List)destination$iv$iv;
    }

    public static final List minus(Iterable $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        Collection other = CollectionsKt.convertToSetForSetOperationWith(elements, $receiver);
        if(other.isEmpty())
            return CollectionsKt.toList($receiver);
        Iterable iterable = $receiver;
        Iterable iterable1 = iterable;
        Collection destination$iv$iv = (Collection)new ArrayList();
        Iterator iterator = iterable1.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv$iv = iterator.next();
            Object it = element$iv$iv;
            if(!other.contains(it))
                destination$iv$iv.add(element$iv$iv);
        } while(true);
        return (List)destination$iv$iv;
    }

    public static final List minus(Iterable $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        HashSet other = SequencesKt.toHashSet(elements);
        if(other.isEmpty())
            return CollectionsKt.toList($receiver);
        Iterable iterable = $receiver;
        Iterable iterable1 = iterable;
        Collection destination$iv$iv = (Collection)new ArrayList();
        Iterator iterator = iterable1.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv$iv = iterator.next();
            Object it = element$iv$iv;
            if(!other.contains(it))
                destination$iv$iv.add(element$iv$iv);
        } while(true);
        return (List)destination$iv$iv;
    }

    private static final List minusElement(Iterable $receiver, Object element)
    {
        return CollectionsKt.minus($receiver, element);
    }

    public static final Pair partition(Iterable $receiver, Function1 predicate)
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

    public static final List plus(Iterable $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof Collection)
        {
            return CollectionsKt.plus((Collection)$receiver, element);
        } else
        {
            ArrayList result = new ArrayList();
            CollectionsKt.addAll((Collection)result, $receiver);
            result.add(element);
            return (List)result;
        }
    }

    public static final List plus(Collection $receiver, Object element)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        ArrayList result = new ArrayList($receiver.size() + 1);
        result.addAll($receiver);
        result.add(element);
        return (List)result;
    }

    public static final List plus(Iterable $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        if($receiver instanceof Collection)
        {
            return CollectionsKt.plus((Collection)$receiver, elements);
        } else
        {
            ArrayList result = new ArrayList();
            CollectionsKt.addAll((Collection)result, $receiver);
            CollectionsKt.addAll((Collection)result, elements);
            return (List)result;
        }
    }

    public static final List plus(Collection $receiver, Object elements[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        ArrayList result = new ArrayList($receiver.size() + elements.length);
        result.addAll($receiver);
        CollectionsKt.addAll((Collection)result, elements);
        return (List)result;
    }

    public static final List plus(Iterable $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        if($receiver instanceof Collection)
        {
            return CollectionsKt.plus((Collection)$receiver, elements);
        } else
        {
            ArrayList result = new ArrayList();
            CollectionsKt.addAll((Collection)result, $receiver);
            CollectionsKt.addAll((Collection)result, elements);
            return (List)result;
        }
    }

    public static final List plus(Collection $receiver, Iterable elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        if(elements instanceof Collection)
        {
            ArrayList result = new ArrayList($receiver.size() + ((Collection)elements).size());
            result.addAll($receiver);
            result.addAll((Collection)elements);
            return (List)result;
        } else
        {
            ArrayList result = new ArrayList($receiver);
            CollectionsKt.addAll((Collection)result, elements);
            return (List)result;
        }
    }

    public static final List plus(Iterable $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        ArrayList result = new ArrayList();
        CollectionsKt.addAll((Collection)result, $receiver);
        CollectionsKt.addAll((Collection)result, elements);
        return (List)result;
    }

    public static final List plus(Collection $receiver, Sequence elements)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        ArrayList result = new ArrayList($receiver.size() + 10);
        result.addAll($receiver);
        CollectionsKt.addAll((Collection)result, elements);
        return (List)result;
    }

    private static final List plusElement(Iterable $receiver, Object element)
    {
        return CollectionsKt.plus($receiver, element);
    }

    private static final List plusElement(Collection $receiver, Object element)
    {
        return CollectionsKt.plus($receiver, element);
    }

    public static final List zip(Iterable $receiver, Object other[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (other)), "other");
        Iterable $receiver$iv = $receiver;
        int arraySize$iv = other.length;
        ArrayList list$iv = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10), arraySize$iv));
        int i$iv = 0;
        Iterator iterator = $receiver$iv.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv = iterator.next();
            if(i$iv >= arraySize$iv)
                break;
            Object t2 = other[i$iv++];
            Object obj = element$iv;
            ArrayList arraylist = list$iv;
            Pair pair = TuplesKt.to(obj, t2);
            arraylist.add(pair);
        } while(true);
        return (List)list$iv;
    }

    public static final List zip(Iterable $receiver, Object other[], Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (other)), "other");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        int arraySize = other.length;
        ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($receiver, 10), arraySize));
        int i = 0;
        Iterator iterator = $receiver.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element = iterator.next();
            if(i >= arraySize)
                break;
            list.add(transform.invoke(element, other[i++]));
        } while(true);
        return (List)list;
    }

    public static final List zip(Iterable $receiver, Iterable other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Iterable $receiver$iv = $receiver;
        Iterator first$iv = $receiver$iv.iterator();
        Iterator second$iv = other.iterator();
        ArrayList list$iv = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10), CollectionsKt.collectionSizeOrDefault(other, 10)));
        ArrayList arraylist;
        Pair pair;
        for(; first$iv.hasNext() && second$iv.hasNext(); arraylist.add(pair))
        {
            Object t2 = second$iv.next();
            Object obj = first$iv.next();
            arraylist = list$iv;
            pair = TuplesKt.to(obj, t2);
        }

        return (List)list$iv;
    }

    public static final List zip(Iterable $receiver, Iterable other, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterator first = $receiver.iterator();
        Iterator second = other.iterator();
        ArrayList list = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault($receiver, 10), CollectionsKt.collectionSizeOrDefault(other, 10)));
        for(; first.hasNext() && second.hasNext(); list.add(transform.invoke(first.next(), second.next())));
        return (List)list;
    }

    public static final Appendable joinTo(Iterable $receiver, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform)
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

    public static volatile Appendable joinTo$default(Iterable iterable, Appendable appendable, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, CharSequence charsequence3, Function1 function1, 
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
        return CollectionsKt.joinTo(iterable, appendable, charsequence, charsequence1, charsequence2, i, charsequence3, function1);
    }

    public static final String joinToString(Iterable $receiver, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(separator, "separator");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        Intrinsics.checkParameterIsNotNull(postfix, "postfix");
        Intrinsics.checkParameterIsNotNull(truncated, "truncated");
        String s = ((StringBuilder)CollectionsKt.joinTo($receiver, (Appendable)new StringBuilder(), separator, prefix, postfix, limit, truncated, transform)).toString();
        Intrinsics.checkExpressionValueIsNotNull(s, "joinTo(StringBuilder(), \u2026ed, transform).toString()");
        return s;
    }

    public static volatile String joinToString$default(Iterable iterable, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, CharSequence charsequence3, Function1 function1, int j, 
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
        return CollectionsKt.joinToString(iterable, charsequence, charsequence1, charsequence2, i, charsequence3, function1);
    }

    private static final Iterable asIterable(Iterable $receiver)
    {
        return $receiver;
    }

    public static final Sequence asSequence(Iterable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        class asSequence..inlined.Sequence._cls1
            implements Sequence
        {

            public Iterator iterator()
            {
                return (Iterator)receiver$0$inlined.iterator();
            }

            final Iterable receiver$0$inlined;

            asSequence..inlined.Sequence._cls1(Iterable iterable)
            {
                receiver$0$inlined = iterable;
                super();
            }
        }

        return (Sequence)new asSequence..inlined.Sequence._cls1($receiver);
    }

    public static final List filterIsInstance(Iterable $receiver, Class klass)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(klass, "klass");
        return (List)CollectionsKt.filterIsInstanceTo($receiver, (Collection)new ArrayList(), klass);
    }

    public static final Collection filterIsInstanceTo(Iterable $receiver, Collection destination, Class klass)
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

    public static final double averageOfByte(Iterable $receiver)
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

    public static final double averageOfShort(Iterable $receiver)
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

    public static final double averageOfInt(Iterable $receiver)
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

    public static final double averageOfLong(Iterable $receiver)
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

    public static final double averageOfFloat(Iterable $receiver)
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

    public static final double averageOfDouble(Iterable $receiver)
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

    public static final int sumOfByte(Iterable $receiver)
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

    public static final int sumOfShort(Iterable $receiver)
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

    public static final int sumOfInt(Iterable $receiver)
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

    public static final long sumOfLong(Iterable $receiver)
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

    public static final float sumOfFloat(Iterable $receiver)
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

    public static final double sumOfDouble(Iterable $receiver)
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

    public CollectionsKt___CollectionsKt()
    {
    }
}
