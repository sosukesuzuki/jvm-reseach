// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AbstractIterator.kt

package kotlin.collections;


final class State extends Enum
{

    protected State(String $enum_name_or_ordinal$0, int $enum_name_or_ordinal$1)
    {
        super($enum_name_or_ordinal$0, $enum_name_or_ordinal$1);
    }

    public static State[] values()
    {
        return (State[])$VALUES.clone();
    }

    public static State valueOf(String s)
    {
        return (State)Enum.valueOf(kotlin/collections/State, s);
    }

    public static final State Ready;
    public static final State NotReady;
    public static final State Done;
    public static final State Failed;
    private static final State $VALUES[];

    static 
    {
        State astate[] = new State[4];
        astate;
        astate[0] = Ready = new State("Ready", 0);
        astate[1] = NotReady = new State("NotReady", 1);
        astate[2] = Done = new State("Done", 2);
        astate[3] = Failed = new State("Failed", 3);
        $VALUES = astate;
    }
}
