// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExtensionExample.kt

import java.io.PrintStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ExtensionExampleKt
{

    public static final void main(String args[])
    {
        Intrinsics.checkParameterIsNotNull(args, "args");
        static final class main._cls1 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return Integer.valueOf(invoke(((Number)obj).intValue()));
            }

            public final int invoke(int $receiver)
            {
                return $receiver + 3;
            }

            public static final main._cls1 INSTANCE = new main._cls1();


        }

        main._cls1 add3$ = main._cls1.INSTANCE;
        int i = add3$.invoke(3);
        System.out.println(i);
    }
}
