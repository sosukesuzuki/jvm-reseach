// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Console.kt

package kotlin.io;

import java.io.*;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.*;
import kotlin.reflect.KProperty;

public final class ConsoleKt
{

    private static final void print(Object message)
    {
        System.out.print(message);
    }

    private static final void print(int message)
    {
        System.out.print(message);
    }

    private static final void print(long message)
    {
        System.out.print(message);
    }

    private static final void print(byte message)
    {
        System.out.print(Byte.valueOf(message));
    }

    private static final void print(short message)
    {
        System.out.print(Short.valueOf(message));
    }

    private static final void print(char message)
    {
        System.out.print(message);
    }

    private static final void print(boolean message)
    {
        System.out.print(message);
    }

    private static final void print(float message)
    {
        System.out.print(message);
    }

    private static final void print(double message)
    {
        System.out.print(message);
    }

    private static final void print(char message[])
    {
        System.out.print(message);
    }

    private static final void println(Object message)
    {
        System.out.println(message);
    }

    private static final void println(int message)
    {
        System.out.println(message);
    }

    private static final void println(long message)
    {
        System.out.println(message);
    }

    private static final void println(byte message)
    {
        System.out.println(Byte.valueOf(message));
    }

    private static final void println(short message)
    {
        System.out.println(Short.valueOf(message));
    }

    private static final void println(char message)
    {
        System.out.println(message);
    }

    private static final void println(boolean message)
    {
        System.out.println(message);
    }

    private static final void println(float message)
    {
        System.out.println(message);
    }

    private static final void println(double message)
    {
        System.out.println(message);
    }

    private static final void println(char message[])
    {
        System.out.println(message);
    }

    private static final void println()
    {
        System.out.println();
    }

    private static final BufferedReader getStdin()
    {
        Lazy lazy = stdin$delegate;
        Object obj = null;
        KProperty kproperty = $$delegatedProperties[0];
        return (BufferedReader)lazy.getValue();
    }

    public static final String readLine()
    {
        return getStdin().readLine();
    }

    private static final KProperty $$delegatedProperties[] = {
        (KProperty)Reflection.property0(new PropertyReference0Impl(Reflection.getOrCreateKotlinPackage(kotlin/io/ConsoleKt, "kotlin-stdlib"), "stdin", "getStdin()Ljava/io/BufferedReader;"))
    };
    private static final Lazy stdin$delegate;

    static 
    {
        static final class stdin._cls2 extends Lambda
            implements Function0
        {

            public volatile Object invoke()
            {
                return invoke();
            }

            public final BufferedReader invoke()
            {
                return new BufferedReader((Reader)new InputStreamReader((InputStream)new InputStream() {

                    public int read()
                    {
                        return System.in.read();
                    }

                    public void reset()
                    {
                        System.in.reset();
                    }

                    public int read(byte b[])
                    {
                        Intrinsics.checkParameterIsNotNull(b, "b");
                        return System.in.read(b);
                    }

                    public void close()
                    {
                        System.in.close();
                    }

                    public void mark(int readlimit)
                    {
                        System.in.mark(readlimit);
                    }

                    public long skip(long n)
                    {
                        return System.in.skip(n);
                    }

                    public int available()
                    {
                        return System.in.available();
                    }

                    public boolean markSupported()
                    {
                        return System.in.markSupported();
                    }

                    public int read(byte b[], int off, int len)
                    {
                        Intrinsics.checkParameterIsNotNull(b, "b");
                        return System.in.read(b, off, len);
                    }

                }
));
            }

            public static final stdin._cls2 INSTANCE = new stdin._cls2();


        }

        stdin$delegate = LazyKt.lazy((Function0)stdin._cls2.INSTANCE);
    }
}
