// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Regex.kt

package kotlin.text;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

// Referenced classes of package kotlin.text:
//            FlagEnum, MatchResult, MatcherMatchResult

public final class RegexKt
{

    private static final int toInt(Iterable $receiver)
    {
        Iterable $receiver$iv = $receiver;
        boolean flag = false;
        int accumulator$iv = ((flag) ? 1 : 0);
        for(Iterator iterator = $receiver$iv.iterator(); iterator.hasNext();)
        {
            Object element$iv = iterator.next();
            FlagEnum option = (FlagEnum)element$iv;
            int value = accumulator$iv;
            accumulator$iv = value | option.getValue();
        }

        return accumulator$iv;
    }

    private static final Set fromInt(int value)
    {
        Intrinsics.reifiedOperationMarker(4, "T");
        EnumSet enumset = EnumSet.allOf(java/lang/Enum);
        EnumSet $receiver = (EnumSet)enumset;
        class fromInt..inlined.apply.lambda._cls1 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return Boolean.valueOf(invoke((Enum)obj));
            }

            public final boolean invoke(Enum it)
            {
                return ($value$inlined & ((FlagEnum)it).getMask()) == ((FlagEnum)it).getValue();
            }

            final int $value$inlined;

            fromInt..inlined.apply.lambda._cls1(int i)
            {
                $value$inlined = i;
                super(1);
            }
        }

        CollectionsKt.retainAll((Iterable)$receiver, (Function1)new fromInt..inlined.apply.lambda._cls1(value));
        Set set = Collections.unmodifiableSet((Set)enumset);
        Intrinsics.checkExpressionValueIsNotNull(set, "Collections.unmodifiable\u2026 == it.value }\n        })");
        return set;
    }

    private static final kotlin.text.MatchResult findNext(Matcher $receiver, int from, CharSequence input)
    {
        return $receiver.find(from) ? (kotlin.text.MatchResult)new MatcherMatchResult($receiver, input) : (kotlin.text.MatchResult)null;
    }

    private static final kotlin.text.MatchResult matchEntire(Matcher $receiver, CharSequence input)
    {
        return $receiver.matches() ? (kotlin.text.MatchResult)new MatcherMatchResult($receiver, input) : (kotlin.text.MatchResult)null;
    }

    private static final IntRange range(MatchResult $receiver)
    {
        $receiver.start();
        JVM INSTR new #124 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        $receiver.end() - 1;
        IntRange();
        return;
    }

    private static final IntRange range(MatchResult $receiver, int groupIndex)
    {
        $receiver.start(groupIndex);
        JVM INSTR new #124 <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        $receiver.end(groupIndex) - 1;
        IntRange();
        return;
    }





}
