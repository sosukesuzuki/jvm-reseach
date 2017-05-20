// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UninitializedPropertyAccessException.kt

package kotlin;

import kotlin.jvm.internal.Intrinsics;

public final class UninitializedPropertyAccessException extends RuntimeException
{

    public UninitializedPropertyAccessException()
    {
    }

    public UninitializedPropertyAccessException(String message)
    {
        Intrinsics.checkParameterIsNotNull(message, "message");
        super(message);
    }

    public UninitializedPropertyAccessException(String message, Throwable cause)
    {
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(cause, "cause");
        super(message, cause);
    }

    public UninitializedPropertyAccessException(Throwable cause)
    {
        Intrinsics.checkParameterIsNotNull(cause, "cause");
        super(cause);
    }
}
