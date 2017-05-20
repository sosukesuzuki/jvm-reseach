// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LambdaExample.kt

import java.io.PrintStream;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class LambdaExampleKt
{

    public static final void main(String args[])
    {
        Intrinsics.checkParameterIsNotNull(args, "args");
        static final class main._cls1 extends Lambda
            implements Function3
        {

            public volatile Object invoke(Object obj, Object obj1, Object obj2)
            {
                return Integer.valueOf(invoke(((Number)obj).intValue(), ((Number)obj1).intValue(), (Function2)obj2));
            }

            public final int invoke(int x, int y, Function2 func)
            {
                Intrinsics.checkParameterIsNotNull(func, "func");
                return ((Number)func.invoke(Integer.valueOf(x), Integer.valueOf(y))).intValue();
            }

            public static final main._cls1 INSTANCE = new main._cls1();


        }

        main._cls1 calc$ = main._cls1.INSTANCE;
        static final class main._cls2 extends Lambda
            implements Function2
        {

            public volatile Object invoke(Object obj, Object obj1)
            {
                return Integer.valueOf(invoke(((Number)obj).intValue(), ((Number)obj1).intValue()));
            }

            public final int invoke(int x, int y)
            {
                return x + y;
            }

            public static final main._cls2 INSTANCE = new main._cls2();


        }

        int i = ((main._cls1)calc$).invoke(1, 2, (Function2)main._cls2.INSTANCE);
        System.out.println(i);
    }
}
