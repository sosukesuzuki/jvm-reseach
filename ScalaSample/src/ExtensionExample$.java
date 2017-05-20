// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExtensionExample.scala

import scala.Predef$;
import scala.runtime.BoxesRunTime;

public final class ExtensionExample$
{

    public ExtensionExample.PreInt PreInt(int x)
    {
        return new ExtensionExample.PreInt(x);
    }

    public void main(String args[])
    {
        Predef$.MODULE$.println(BoxesRunTime.boxToInteger(PreInt(3).add3()));
    }

    private ExtensionExample$()
    {
    }

    public static final ExtensionExample$ MODULE$ = this;

    static 
    {
        new ExtensionExample$();
    }
}
