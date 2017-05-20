// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exceptions.kt

package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class ExceptionsKt
{

    private static final String constructMessage(File file, File other, String reason)
    {
        StringBuilder sb = new StringBuilder(file.toString());
        if(other != null)
            sb.append((new StringBuilder()).append(" -> ").append(other).toString());
        if(reason != null)
            sb.append((new StringBuilder()).append(": ").append(reason).toString());
        String s = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(s, "sb.toString()");
        return s;
    }

}
