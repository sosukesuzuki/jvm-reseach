// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exceptions.kt

package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin:
//            TypeCastException

class ExceptionsKt__ExceptionsKt
{

    private static final void printStackTrace(Throwable $receiver)
    {
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
        (Throwable);
        printStackTrace();
    }

    private static final void printStackTrace(Throwable $receiver, PrintWriter writer)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
        ((Throwable)$receiver).printStackTrace(writer);
    }

    private static final void printStackTrace(Throwable $receiver, PrintStream stream)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
        ((Throwable)$receiver).printStackTrace(stream);
    }

    public static final StackTraceElement[] getStackTrace(Throwable $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
        (Throwable);
        getStackTrace();
        JVM INSTR dup ;
        JVM INSTR ifnonnull 34;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_31;
_L2:
        break MISSING_BLOCK_LABEL_34;
        Intrinsics.throwNpe();
        return;
    }

    public ExceptionsKt__ExceptionsKt()
    {
    }
}
