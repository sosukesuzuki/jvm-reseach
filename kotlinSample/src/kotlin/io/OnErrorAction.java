// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Utils.kt

package kotlin.io;


public final class OnErrorAction extends Enum
{

    protected OnErrorAction(String $enum_name_or_ordinal$0, int $enum_name_or_ordinal$1)
    {
        super($enum_name_or_ordinal$0, $enum_name_or_ordinal$1);
    }

    public static OnErrorAction[] values()
    {
        return (OnErrorAction[])$VALUES.clone();
    }

    public static OnErrorAction valueOf(String s)
    {
        return (OnErrorAction)Enum.valueOf(kotlin/io/OnErrorAction, s);
    }

    public static final OnErrorAction SKIP;
    public static final OnErrorAction TERMINATE;
    private static final OnErrorAction $VALUES[];

    static 
    {
        OnErrorAction aonerroraction[] = new OnErrorAction[2];
        aonerroraction;
        aonerroraction[0] = SKIP = new OnErrorAction("SKIP", 0);
        aonerroraction[1] = TERMINATE = new OnErrorAction("TERMINATE", 1);
        $VALUES = aonerroraction;
    }
}
