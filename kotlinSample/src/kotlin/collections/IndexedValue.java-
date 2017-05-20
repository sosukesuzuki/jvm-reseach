// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IndexedValue.kt

package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;

public final class IndexedValue
{

    public final int getIndex()
    {
        return index;
    }

    public final Object getValue()
    {
        return value;
    }

    public IndexedValue(int index, Object value)
    {
        this.index = index;
        this.value = value;
    }

    public final int component1()
    {
        return index;
    }

    public final Object component2()
    {
        return value;
    }

    public final IndexedValue copy(int index, Object value)
    {
        return new IndexedValue(index, value);
    }

    public static volatile IndexedValue copy$default(IndexedValue indexedvalue, int i, Object obj, int j, Object obj1)
    {
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        if((j & 1) != 0)
            i = indexedvalue.index;
        if((j & 2) != 0)
            obj = indexedvalue.value;
        return indexedvalue.copy(i, obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append("IndexedValue(index=").append(index).append(", value=").append(value).append(")").toString();
    }

    public int hashCode()
    {
        return index * 31 + (value == null ? 0 : value.hashCode());
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if(this != obj)
            {
                if(!(obj instanceof IndexedValue))
                    break label0;
                IndexedValue indexedvalue = (IndexedValue)obj;
                if((index != indexedvalue.index) || !Intrinsics.areEqual(value, indexedvalue.value))
                    break label0;
            }
            return true;
        }
        return false;
    }

    private final int index;
    private final Object value;
}
