// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CollectionToArray.java

package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionToArray
{

    public static Object[] toArray(Collection collection)
    {
        int size = collection.size();
        if(size == 0)
            return EMPTY_OBJECT_ARRAY;
        Object r[] = new Object[size];
        Iterator it = collection.iterator();
        for(int i = 0; i < size; i++)
        {
            if(!it.hasNext())
                return Arrays.copyOf(r, i);
            r[i] = it.next();
        }

        return it.hasNext() ? finishToArray(r, it) : r;
    }

    public static Object[] toArray(Collection collection, Object a[])
    {
        int size = collection.size();
        Object r[] = a.length < size ? (Object[])(Object[])Array.newInstance(((Object) (a)).getClass().getComponentType(), size) : a;
        Iterator it = collection.iterator();
        for(int i = 0; i < r.length; i++)
        {
            if(!it.hasNext())
                if(a != r)
                {
                    return Arrays.copyOf(r, i);
                } else
                {
                    r[i] = null;
                    return r;
                }
            r[i] = it.next();
        }

        return it.hasNext() ? finishToArray(r, it) : r;
    }

    private static Object[] finishToArray(Object r[], Iterator it)
    {
        int i = r.length;
        for(; it.hasNext(); r[i++] = it.next())
        {
            int cap = r.length;
            if(i != cap)
                continue;
            int newCap = (cap / 2 + 1) * 3;
            if(newCap <= cap)
            {
                if(cap == 0x7fffffff)
                    throw new OutOfMemoryError("Required array size too large");
                newCap = 0x7fffffff;
            }
            r = Arrays.copyOf(r, newCap);
        }

        return i != r.length ? Arrays.copyOf(r, i) : r;
    }

    private CollectionToArray()
    {
    }

    private static final Object EMPTY_OBJECT_ARRAY[] = new Object[0];

}
