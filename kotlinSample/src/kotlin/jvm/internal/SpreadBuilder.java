// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SpreadBuilder.java

package kotlin.jvm.internal;

import java.util.*;

public class SpreadBuilder
{

    public SpreadBuilder(int size)
    {
        list = new ArrayList(size);
    }

    public void addSpread(Object container)
    {
        if(container == null)
            return;
        if(container instanceof Object[])
        {
            Object array[] = (Object[])(Object[])container;
            if(array.length > 0)
            {
                list.ensureCapacity(list.size() + array.length);
                Object arr$[] = array;
                int len$ = arr$.length;
                for(int i$ = 0; i$ < len$; i$++)
                {
                    Object element = arr$[i$];
                    list.add(element);
                }

            }
        } else
        if(container instanceof Collection)
            list.addAll((Collection)container);
        else
        if(container instanceof Iterable)
        {
            Object element;
            for(Iterator i$ = ((Iterable)container).iterator(); i$.hasNext(); list.add(element))
                element = i$.next();

        } else
        if(container instanceof Iterator)
        {
            for(Iterator iterator = (Iterator)container; iterator.hasNext(); list.add(iterator.next()));
        } else
        {
            throw new UnsupportedOperationException((new StringBuilder()).append("Don't know how to spread ").append(container.getClass()).toString());
        }
    }

    public int size()
    {
        return list.size();
    }

    public void add(Object element)
    {
        list.add(element);
    }

    public Object[] toArray(Object a[])
    {
        return list.toArray(a);
    }

    private final ArrayList list;
}
