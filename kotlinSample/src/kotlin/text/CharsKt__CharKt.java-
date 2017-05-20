// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Char.kt

package kotlin.text;

import kotlin.jvm.internal.CharCompanionObject;

// Referenced classes of package kotlin.text:
//            CharsKt__CharJVMKt, CharsKt

class CharsKt__CharKt extends CharsKt__CharJVMKt
{

    private static final String plus(char $receiver, String other)
    {
        return (new StringBuilder()).append(String.valueOf($receiver)).append(other).toString();
    }

    public static final boolean equals(char $receiver, char other, boolean ignoreCase)
    {
        if($receiver == other)
            return true;
        if(!ignoreCase)
            return false;
        char c = $receiver;
        c = other;
        char c1 = Character.toUpperCase(c);
        char c2 = Character.toUpperCase(c);
        if(c1 == c2)
            return true;
        c = $receiver;
        c = other;
        c1 = Character.toLowerCase(c);
        c2 = Character.toLowerCase(c);
        return c1 == c2;
    }

    public static volatile boolean equals$default(char c, char c1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: equals");
        if((i & 2) != 0)
            flag = false;
        return CharsKt.equals(c, c1, flag);
    }

    public static final boolean isSurrogate(char $receiver)
    {
        true;
        $receiver;
        JVM INSTR dup2 ;
        CharCompanionObject.MIN_SURROGATE;
        JVM INSTR icmpge 11;
           goto _L1 _L2
_L1:
        JVM INSTR pop ;
        false;
_L2:
        CharCompanionObject.MAX_SURROGATE;
        JVM INSTR icmple 21;
           goto _L3 _L4
_L3:
        JVM INSTR pop ;
        false;
_L4:
        JVM INSTR iand ;
        return;
    }

    public CharsKt__CharKt()
    {
    }
}
