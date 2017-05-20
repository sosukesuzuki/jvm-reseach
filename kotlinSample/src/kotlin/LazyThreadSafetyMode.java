// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Lazy.kt

package kotlin;


public final class LazyThreadSafetyMode extends Enum
{

    protected LazyThreadSafetyMode(String $enum_name_or_ordinal$0, int $enum_name_or_ordinal$1)
    {
        super($enum_name_or_ordinal$0, $enum_name_or_ordinal$1);
    }

    public static LazyThreadSafetyMode[] values()
    {
        return (LazyThreadSafetyMode[])$VALUES.clone();
    }

    public static LazyThreadSafetyMode valueOf(String s)
    {
        return (LazyThreadSafetyMode)Enum.valueOf(kotlin/LazyThreadSafetyMode, s);
    }

    public static final LazyThreadSafetyMode SYNCHRONIZED;
    public static final LazyThreadSafetyMode PUBLICATION;
    public static final LazyThreadSafetyMode NONE;
    private static final LazyThreadSafetyMode $VALUES[];

    static 
    {
        LazyThreadSafetyMode alazythreadsafetymode[] = new LazyThreadSafetyMode[3];
        alazythreadsafetymode;
        alazythreadsafetymode[0] = SYNCHRONIZED = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        alazythreadsafetymode[1] = PUBLICATION = new LazyThreadSafetyMode("PUBLICATION", 1);
        alazythreadsafetymode[2] = NONE = new LazyThreadSafetyMode("NONE", 2);
        $VALUES = alazythreadsafetymode;
    }
}
