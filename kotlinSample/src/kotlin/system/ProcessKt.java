// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Process.kt

package kotlin.system;


public final class ProcessKt
{

    private static final Void exitProcess(int status)
    {
        System.exit(status);
        throw (Throwable)new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
