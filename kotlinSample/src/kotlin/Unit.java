// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Unit.kt

package kotlin;


public final class Unit
{

    public String toString()
    {
        return "kotlin.Unit";
    }

    private Unit()
    {
    }

    public static final Unit INSTANCE = (Unit)this;

    static 
    {
        new Unit();
    }
}
