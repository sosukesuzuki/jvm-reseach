// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Synchronized.kt

package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;

// Referenced classes of package kotlin:
//            StandardKt__StandardKt

class StandardKt__SynchronizedKt extends StandardKt__StandardKt
{

    private static final Object _mthsynchronized(Object lock, Function0 block)
    {
        lock;
        JVM INSTR monitorenter ;
        Object obj;
        obj = block.invoke();
        InlineMarker.finallyStart(1);
        lock;
        JVM INSTR monitorexit ;
        InlineMarker.finallyEnd(1);
        return obj;
        Exception exception;
        exception;
        InlineMarker.finallyStart(1);
        InlineMarker.finallyEnd(1);
        throw exception;
    }

    public StandardKt__SynchronizedKt()
    {
    }
}
