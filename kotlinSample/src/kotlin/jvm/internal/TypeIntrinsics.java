// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TypeIntrinsics.java

package kotlin.jvm.internal;

import java.util.*;
import kotlin.Function;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;

// Referenced classes of package kotlin.jvm.internal:
//            FunctionImpl, Intrinsics

public class TypeIntrinsics
{

    public TypeIntrinsics()
    {
    }

    private static Throwable sanitizeStackTrace(Throwable throwable)
    {
        return Intrinsics.sanitizeStackTrace(throwable, kotlin/jvm/internal/TypeIntrinsics.getName());
    }

    public static void throwCce(Object argument, String requestedClassName)
    {
        String argumentClassName = argument != null ? argument.getClass().getName() : "null";
        throwCce((new StringBuilder()).append(argumentClassName).append(" cannot be cast to ").append(requestedClassName).toString());
    }

    public static void throwCce(String message)
    {
        throw throwCce(new ClassCastException(message));
    }

    public static ClassCastException throwCce(ClassCastException e)
    {
        throw (ClassCastException)sanitizeStackTrace(e);
    }

    public static boolean isMutableIterator(Object obj)
    {
        return (obj instanceof Iterator) && (!(obj instanceof KMappedMarker) || (obj instanceof KMutableIterator));
    }

    public static Iterator asMutableIterator(Object obj)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterator))
            throwCce(obj, "kotlin.collections.MutableIterator");
        return castToIterator(obj);
    }

    public static Iterator asMutableIterator(Object obj, String message)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterator))
            throwCce(message);
        return castToIterator(obj);
    }

    public static Iterator castToIterator(Object obj)
    {
        try
        {
            return (Iterator)obj;
        }
        catch(ClassCastException e)
        {
            throw throwCce(e);
        }
    }

    public static boolean isMutableListIterator(Object obj)
    {
        return (obj instanceof ListIterator) && (!(obj instanceof KMappedMarker) || (obj instanceof KMutableListIterator));
    }

    public static ListIterator asMutableListIterator(Object obj)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableListIterator))
            throwCce(obj, "kotlin.collections.MutableListIterator");
        return castToListIterator(obj);
    }

    public static ListIterator asMutableListIterator(Object obj, String message)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableListIterator))
            throwCce(message);
        return castToListIterator(obj);
    }

    public static ListIterator castToListIterator(Object obj)
    {
        try
        {
            return (ListIterator)obj;
        }
        catch(ClassCastException e)
        {
            throw throwCce(e);
        }
    }

    public static boolean isMutableIterable(Object obj)
    {
        return (obj instanceof Iterable) && (!(obj instanceof KMappedMarker) || (obj instanceof KMutableIterable));
    }

    public static Iterable asMutableIterable(Object obj)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterable))
            throwCce(obj, "kotlin.collections.MutableIterable");
        return castToIterable(obj);
    }

    public static Iterable asMutableIterable(Object obj, String message)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableIterable))
            throwCce(message);
        return castToIterable(obj);
    }

    public static Iterable castToIterable(Object obj)
    {
        try
        {
            return (Iterable)obj;
        }
        catch(ClassCastException e)
        {
            throw throwCce(e);
        }
    }

    public static boolean isMutableCollection(Object obj)
    {
        return (obj instanceof Collection) && (!(obj instanceof KMappedMarker) || (obj instanceof KMutableCollection));
    }

    public static Collection asMutableCollection(Object obj)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection))
            throwCce(obj, "kotlin.collections.MutableCollection");
        return castToCollection(obj);
    }

    public static Collection asMutableCollection(Object obj, String message)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableCollection))
            throwCce(message);
        return castToCollection(obj);
    }

    public static Collection castToCollection(Object obj)
    {
        try
        {
            return (Collection)obj;
        }
        catch(ClassCastException e)
        {
            throw throwCce(e);
        }
    }

    public static boolean isMutableList(Object obj)
    {
        return (obj instanceof List) && (!(obj instanceof KMappedMarker) || (obj instanceof KMutableList));
    }

    public static List asMutableList(Object obj)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableList))
            throwCce(obj, "kotlin.collections.MutableList");
        return castToList(obj);
    }

    public static List asMutableList(Object obj, String message)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableList))
            throwCce(message);
        return castToList(obj);
    }

    public static List castToList(Object obj)
    {
        try
        {
            return (List)obj;
        }
        catch(ClassCastException e)
        {
            throw throwCce(e);
        }
    }

    public static boolean isMutableSet(Object obj)
    {
        return (obj instanceof Set) && (!(obj instanceof KMappedMarker) || (obj instanceof KMutableSet));
    }

    public static Set asMutableSet(Object obj)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet))
            throwCce(obj, "kotlin.collections.MutableSet");
        return castToSet(obj);
    }

    public static Set asMutableSet(Object obj, String message)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableSet))
            throwCce(message);
        return castToSet(obj);
    }

    public static Set castToSet(Object obj)
    {
        try
        {
            return (Set)obj;
        }
        catch(ClassCastException e)
        {
            throw throwCce(e);
        }
    }

    public static boolean isMutableMap(Object obj)
    {
        return (obj instanceof Map) && (!(obj instanceof KMappedMarker) || (obj instanceof KMutableMap));
    }

    public static Map asMutableMap(Object obj)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap))
            throwCce(obj, "kotlin.collections.MutableMap");
        return castToMap(obj);
    }

    public static Map asMutableMap(Object obj, String message)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof KMutableMap))
            throwCce(message);
        return castToMap(obj);
    }

    public static Map castToMap(Object obj)
    {
        try
        {
            return (Map)obj;
        }
        catch(ClassCastException e)
        {
            throw throwCce(e);
        }
    }

    public static boolean isMutableMapEntry(Object obj)
    {
        return (obj instanceof java.util.Map.Entry) && (!(obj instanceof KMappedMarker) || (obj instanceof kotlin.jvm.internal.markers.KMutableMap.Entry));
    }

    public static java.util.Map.Entry asMutableMapEntry(Object obj)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof kotlin.jvm.internal.markers.KMutableMap.Entry))
            throwCce(obj, "kotlin.collections.MutableMap.MutableEntry");
        return castToMapEntry(obj);
    }

    public static java.util.Map.Entry asMutableMapEntry(Object obj, String message)
    {
        if((obj instanceof KMappedMarker) && !(obj instanceof kotlin.jvm.internal.markers.KMutableMap.Entry))
            throwCce(message);
        return castToMapEntry(obj);
    }

    public static java.util.Map.Entry castToMapEntry(Object obj)
    {
        try
        {
            return (java.util.Map.Entry)obj;
        }
        catch(ClassCastException e)
        {
            throw throwCce(e);
        }
    }

    public static int getFunctionArity(Object obj)
    {
        if(obj instanceof FunctionImpl)
            return ((FunctionImpl)obj).getArity();
        if(obj instanceof Function0)
            return 0;
        if(obj instanceof Function1)
            return 1;
        if(obj instanceof Function2)
            return 2;
        if(obj instanceof Function3)
            return 3;
        if(obj instanceof Function4)
            return 4;
        if(obj instanceof Function5)
            return 5;
        if(obj instanceof Function6)
            return 6;
        if(obj instanceof Function7)
            return 7;
        if(obj instanceof Function8)
            return 8;
        if(obj instanceof Function9)
            return 9;
        if(obj instanceof Function10)
            return 10;
        if(obj instanceof Function11)
            return 11;
        if(obj instanceof Function12)
            return 12;
        if(obj instanceof Function13)
            return 13;
        if(obj instanceof Function14)
            return 14;
        if(obj instanceof Function15)
            return 15;
        if(obj instanceof Function16)
            return 16;
        if(obj instanceof Function17)
            return 17;
        if(obj instanceof Function18)
            return 18;
        if(obj instanceof Function19)
            return 19;
        if(obj instanceof Function20)
            return 20;
        if(obj instanceof Function21)
            return 21;
        return !(obj instanceof Function22) ? -1 : 22;
    }

    public static boolean isFunctionOfArity(Object obj, int arity)
    {
        return (obj instanceof Function) && getFunctionArity(obj) == arity;
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int arity)
    {
        if(obj != null && !isFunctionOfArity(obj, arity))
            throwCce(obj, (new StringBuilder()).append("kotlin.jvm.functions.Function").append(arity).toString());
        return obj;
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int arity, String message)
    {
        if(obj != null && !isFunctionOfArity(obj, arity))
            throwCce(message);
        return obj;
    }
}
