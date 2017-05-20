// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Tuples.kt

package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class Pair
    implements Serializable
{

    public String toString()
    {
        return (new StringBuilder()).append("(").append(first).append(", ").append(second).append(")").toString();
    }

    public final Object getFirst()
    {
        return first;
    }

    public final Object getSecond()
    {
        return second;
    }

    public Pair(Object first, Object second)
    {
        this.first = first;
        this.second = second;
    }

    public final Object component1()
    {
        return first;
    }

    public final Object component2()
    {
        return second;
    }

    public final Pair copy(Object first, Object second)
    {
        return new Pair(first, second);
    }

    public static volatile Pair copy$default(Pair pair, Object obj, Object obj1, int i, Object obj2)
    {
        if(obj2 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        if((i & 1) != 0)
            obj = pair.first;
        if((i & 2) != 0)
            obj1 = pair.second;
        return pair.copy(obj, obj1);
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
        return;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if(this != obj)
            {
                if(!(obj instanceof Pair))
                    break label0;
                Pair pair = (Pair)obj;
                if(!Intrinsics.areEqual(first, pair.first) || !Intrinsics.areEqual(second, pair.second))
                    break label0;
            }
            return true;
        }
        return false;
    }

    private final Object first;
    private final Object second;
}
