// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArraysJVM.kt

package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Collection;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

class ArraysKt__ArraysJVMKt
{

    private static final String toString(byte $receiver[], Charset charset)
    {
        return (String)new String($receiver, charset);
    }

    private static final Object[] toTypedArray(Collection $receiver)
    {
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        (Collection);
        Collection thisCollection;
        thisCollection;
        Object aobj[];
        Intrinsics.reifiedOperationMarker(0, "T?");
        aobj = thisCollection.toArray(new Object[thisCollection.size()]);
        aobj;
        if(aobj == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        (Object[]);
        return;
    }

    public static final Object[] arrayOfNulls(Object reference[], int size)
    {
        Object obj;
        Intrinsics.checkParameterIsNotNull(((Object) (reference)), "reference");
        obj = Array.newInstance(((Object) (reference)).getClass().getComponentType(), size);
        obj;
        if(obj == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        (Object[]);
        return;
    }

    public ArraysKt__ArraysJVMKt()
    {
    }
}
