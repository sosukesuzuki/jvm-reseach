// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Regex.kt

package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

public final class MatchGroup
{

    public final String getValue()
    {
        return value;
    }

    public final IntRange getRange()
    {
        return range;
    }

    public MatchGroup(String value, IntRange range)
    {
        Intrinsics.checkParameterIsNotNull(value, "value");
        Intrinsics.checkParameterIsNotNull(range, "range");
        super();
        this.value = value;
        this.range = range;
    }

    public final String component1()
    {
        return value;
    }

    public final IntRange component2()
    {
        return range;
    }

    public final MatchGroup copy(String value, IntRange range)
    {
        Intrinsics.checkParameterIsNotNull(value, "value");
        Intrinsics.checkParameterIsNotNull(range, "range");
        return new MatchGroup(value, range);
    }

    public static volatile MatchGroup copy$default(MatchGroup matchgroup, String s, IntRange intrange, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        if((i & 1) != 0)
            s = matchgroup.value;
        if((i & 2) != 0)
            intrange = matchgroup.range;
        return matchgroup.copy(s, intrange);
    }

    public String toString()
    {
        return (new StringBuilder()).append("MatchGroup(value=").append(value).append(", range=").append(range).append(")").toString();
    }

    public int hashCode()
    {
        value;
        if(value == null) goto _L2; else goto _L1
_L1:
        hashCode();
          goto _L3
_L2:
        JVM INSTR pop ;
        false;
_L3:
        31;
        JVM INSTR imul ;
        range == null ? 0 : range.hashCode();
        JVM INSTR iadd ;
        return;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if(this != obj)
            {
                if(!(obj instanceof MatchGroup))
                    break label0;
                MatchGroup matchgroup = (MatchGroup)obj;
                if(!Intrinsics.areEqual(value, matchgroup.value) || !Intrinsics.areEqual(range, matchgroup.range))
                    break label0;
            }
            return true;
        }
        return false;
    }

    private final String value;
    private final IntRange range;
}
