// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Tuples.kt

package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class Triple
    implements Serializable
{

    public String toString()
    {
        return (new StringBuilder()).append("(").append(first).append(", ").append(second).append(", ").append(third).append(")").toString();
    }

    public final Object getFirst()
    {
        return first;
    }

    public final Object getSecond()
    {
        return second;
    }

    public final Object getThird()
    {
        return third;
    }

    public Triple(Object first, Object second, Object third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public final Object component1()
    {
        return first;
    }

    public final Object component2()
    {
        return second;
    }

    public final Object component3()
    {
        return third;
    }

    public final Triple copy(Object first, Object second, Object third)
    {
        return new Triple(first, second, third);
    }

    public static volatile Triple copy$default(Triple triple, Object obj, Object obj1, Object obj2, int i, Object obj3)
    {
        if(obj3 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        if((i & 1) != 0)
            obj = triple.first;
        if((i & 2) != 0)
            obj1 = triple.second;
        if((i & 4) != 0)
            obj2 = triple.third;
        return triple.copy(obj, obj1, obj2);
    }

    public int hashCode()
    {
        first;
        if(first == null) goto _L2; else goto _L1
_L1:
        hashCode();
          goto _L3
_L2:
        JVM INSTR pop ;
        false;
_L3:
        31;
        JVM INSTR imul ;
        second == null ? 0 : second.hashCode();
        JVM INSTR iadd ;
        31;
        JVM INSTR imul ;
        third == null ? 0 : third.hashCode();
        JVM INSTR iadd ;
        return;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if(this != obj)
            {
                if(!(obj instanceof Triple))
                    break label0;
                Triple triple = (Triple)obj;
                if(!Intrinsics.areEqual(first, triple.first) || !Intrinsics.areEqual(second, triple.second) || !Intrinsics.areEqual(third, triple.third))
                    break label0;
            }
            return true;
        }
        return false;
    }

    private final Object first;
    private final Object second;
    private final Object third;
}
