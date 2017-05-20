// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExtensionExample.scala


public final class ExtensionExample
{
    public static class PreInt
    {

        public int add3()
        {
            return x + 3;
        }

        private final int x;

        public PreInt(int x)
        {
            this.x = x;
            super();
        }
    }


    public static void main(String args[])
    {
        ExtensionExample$.MODULE$.main(args);
    }

    public static PreInt PreInt(int i)
    {
        return ExtensionExample$.MODULE$.PreInt(i);
    }
}
