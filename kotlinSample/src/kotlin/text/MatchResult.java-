// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MatchResult.kt

package kotlin.text;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

// Referenced classes of package kotlin.text:
//            MatchGroupCollection

public interface MatchResult
{
    public static final class Destructured
    {

        private final String component1()
        {
            return (String)getMatch().getGroupValues().get(1);
        }

        private final String component2()
        {
            return (String)getMatch().getGroupValues().get(2);
        }

        private final String component3()
        {
            return (String)getMatch().getGroupValues().get(3);
        }

        private final String component4()
        {
            return (String)getMatch().getGroupValues().get(4);
        }

        private final String component5()
        {
            return (String)getMatch().getGroupValues().get(5);
        }

        private final String component6()
        {
            return (String)getMatch().getGroupValues().get(6);
        }

        private final String component7()
        {
            return (String)getMatch().getGroupValues().get(7);
        }

        private final String component8()
        {
            return (String)getMatch().getGroupValues().get(8);
        }

        private final String component9()
        {
            return (String)getMatch().getGroupValues().get(9);
        }

        private final String component10()
        {
            return (String)getMatch().getGroupValues().get(10);
        }

        public final List toList()
        {
            return match.getGroupValues().subList(1, match.getGroupValues().size());
        }

        public final MatchResult getMatch()
        {
            return match;
        }

        private final MatchResult match;

        public Destructured(MatchResult match)
        {
            Intrinsics.checkParameterIsNotNull(match, "match");
            super();
            this.match = match;
        }
    }

    public static final class DefaultImpls
    {

        public static Destructured getDestructured(MatchResult $this)
        {
            return new Destructured($this);
        }
    }


    public abstract IntRange getRange();

    public abstract String getValue();

    public abstract MatchGroupCollection getGroups();

    public abstract List getGroupValues();

    public abstract Destructured getDestructured();

    public abstract MatchResult next();
}
