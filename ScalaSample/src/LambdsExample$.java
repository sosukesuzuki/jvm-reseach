// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LambdaExample.scala

import scala.*;
import scala.runtime.BoxesRunTime;

public final class LambdsExample$
{

    public void main(String args[])
    {
        Predef$.MODULE$.println(BoxesRunTime.boxToInteger(calc$1(1, 2, new Serializable() {

            public final int apply(int x, int y)
            {
                return apply$mcIII$sp(x, y);
            }

            public int apply$mcIII$sp(int x, int y)
            {
                return x + y;
            }

            public final volatile Object apply(Object v1, Object v2)
            {
                return BoxesRunTime.boxToInteger(apply(BoxesRunTime.unboxToInt(v1), BoxesRunTime.unboxToInt(v2)));
            }

            public static final long serialVersionUID = 0L;

        }
)));
    }

    private final int calc$1(int x, int y, Function2 func)
    {
        return func.apply$mcIII$sp(x, y);
    }

    private LambdsExample$()
    {
    }

    public static final LambdsExample$ MODULE$ = this;

    static 
    {
        new LambdsExample$();
    }
}
