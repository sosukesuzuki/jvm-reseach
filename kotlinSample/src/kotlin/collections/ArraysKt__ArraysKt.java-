// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Arrays.kt

package kotlin.collections;

import java.util.*;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//            ArraysKt__ArraysJVMKt, CollectionsKt

class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt
{

    private static final Object[] orEmpty(Object $receiver[])
    {
        $receiver;
        if($receiver == null) goto _L2; else goto _L1
_L2:
        JVM INSTR pop ;
        Object aobj[];
        Intrinsics.reifiedOperationMarker(0, "T");
        aobj = new Object[0];
        (Object[])aobj;
_L1:
        return;
    }

    public static final List flatten(Object $receiver[][])
    {
        Intrinsics.checkParameterIsNotNull(((Object) ($receiver)), "$receiver");
        JVM INSTR new #33  <Class ArrayList>;
        JVM INSTR dup ;
        Object $receiver$iv[] = (Object[])$receiver;
        ArrayList arraylist1;
        arraylist1;
        ArrayList arraylist;
        arraylist;
        int sum$iv = 0;
        for(int j = 0; j < $receiver$iv.length; j++)
        {
            Object element$iv = $receiver$iv[j];
            Object aobj[] = (Object[])element$iv;
            int k = sum$iv;
            int i1 = aobj.length;
            sum$iv = k + i1;
        }

        int l = sum$iv;
        arraylist1.ArrayList(l);
        ArrayList result = arraylist;
        for(int i = 0; i < $receiver.length; i++)
        {
            Object element[] = $receiver[i];
            CollectionsKt.addAll((Collection)result, element);
        }

        return (List)result;
    }

    public static final Pair unzip(Pair $receiver[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        ArrayList listT = new ArrayList(((Object[])$receiver).length);
        ArrayList listR = new ArrayList(((Object[])$receiver).length);
        for(int i = 0; i < $receiver.length; i++)
        {
            Pair pair = $receiver[i];
            listT.add(pair.getFirst());
            listR.add(pair.getSecond());
        }

        return TuplesKt.to(listT, listR);
    }

    public ArraysKt__ArraysKt()
    {
    }
}
