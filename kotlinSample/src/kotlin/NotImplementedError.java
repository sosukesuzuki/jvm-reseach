// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Standard.kt

package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class NotImplementedError extends Error
{

    public NotImplementedError(String message)
    {
        Intrinsics.checkParameterIsNotNull(message, "message");
        super(message);
    }

    public NotImplementedError(String s, int i, DefaultConstructorMarker defaultconstructormarker)
    {
        if((i & 1) != 0)
            s = "An operation is not implemented.";
        this(s);
    }

    public NotImplementedError()
    {
        this(null, 1, null);
    }
}
