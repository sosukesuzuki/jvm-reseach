// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Regex.kt

package kotlin.text;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.*;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.text:
//            RegexKt, MatchResult, RegexOption

public final class Regex
{
    public static final class Companion
    {

        public final Regex fromLiteral(String literal)
        {
            Intrinsics.checkParameterIsNotNull(literal, "literal");
            String s = literal;
            RegexOption regexoption = RegexOption.LITERAL;
            return new Regex(s, regexoption);
        }

        public final String escape(String literal)
        {
            Intrinsics.checkParameterIsNotNull(literal, "literal");
            String s = Pattern.quote(literal);
            Intrinsics.checkExpressionValueIsNotNull(s, "Pattern.quote(literal)");
            return s;
        }

        public final String escapeReplacement(String literal)
        {
            Intrinsics.checkParameterIsNotNull(literal, "literal");
            String s = Matcher.quoteReplacement(literal);
            Intrinsics.checkExpressionValueIsNotNull(s, "Matcher.quoteReplacement(literal)");
            return s;
        }

        private final int ensureUnicodeCase(int flags)
        {
            return (flags & 2) == 0 ? flags : flags | 0x40;
        }


        private Companion()
        {
        }

        public Companion(DefaultConstructorMarker $constructor_marker)
        {
            this();
        }
    }


    public final String getPattern()
    {
        String s = nativePattern.pattern();
        Intrinsics.checkExpressionValueIsNotNull(s, "nativePattern.pattern()");
        return s;
    }

    public final Set getOptions()
    {
        return options;
    }

    public final boolean matches(CharSequence input)
    {
        Intrinsics.checkParameterIsNotNull(input, "input");
        return nativePattern.matcher(input).matches();
    }

    public final boolean containsMatchIn(CharSequence input)
    {
        Intrinsics.checkParameterIsNotNull(input, "input");
        return nativePattern.matcher(input).find();
    }

    public final MatchResult find(CharSequence input, int startIndex)
    {
        Intrinsics.checkParameterIsNotNull(input, "input");
        return RegexKt.access$findNext(nativePattern.matcher(input), startIndex, input);
    }

    public static volatile MatchResult find$default(Regex regex, CharSequence charsequence, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: find");
        if((j & 2) != 0)
            i = 0;
        return regex.find(charsequence, i);
    }

    public final Sequence findAll(CharSequence input, int startIndex)
    {
        Intrinsics.checkParameterIsNotNull(input, "input");
        static final class findAll._cls2 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return invoke((MatchResult)obj);
            }

            public final MatchResult invoke(MatchResult match)
            {
                Intrinsics.checkParameterIsNotNull(match, "match");
                return match.next();
            }

            public static final findAll._cls2 INSTANCE = new findAll._cls2();


        }

        return SequencesKt.generateSequence((Function0)new Function0(this, input, startIndex) {

            public volatile Object invoke()
            {
                return invoke();
            }

            public final MatchResult invoke()
            {
                return find($input, $startIndex);
            }

            final Regex this$0;
            final CharSequence $input;
            final int $startIndex;

            
            {
                this$0 = regex;
                $input = charsequence;
                $startIndex = i;
                super(0);
            }
        }
, (Function1)findAll._cls2.INSTANCE);
    }

    public static volatile Sequence findAll$default(Regex regex, CharSequence charsequence, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findAll");
        if((j & 2) != 0)
            i = 0;
        return regex.findAll(charsequence, i);
    }

    public final MatchResult matchEntire(CharSequence input)
    {
        Intrinsics.checkParameterIsNotNull(input, "input");
        return RegexKt.access$matchEntire(nativePattern.matcher(input), input);
    }

    public final String replace(CharSequence input, String replacement)
    {
        Intrinsics.checkParameterIsNotNull(input, "input");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        String s = nativePattern.matcher(input).replaceAll(replacement);
        Intrinsics.checkExpressionValueIsNotNull(s, "nativePattern.matcher(in\u2026).replaceAll(replacement)");
        return s;
    }

    public final String replace(CharSequence input, Function1 transform)
    {
        MatchResult matchresult;
        Intrinsics.checkParameterIsNotNull(input, "input");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        matchresult = find$default(this, input, 0, 2, null);
        matchresult;
        if(matchresult != null)
            break MISSING_BLOCK_LABEL_33;
        JVM INSTR pop ;
        return input.toString();
        MatchResult match;
        match;
        int lastStart;
        int length;
        StringBuilder sb;
        lastStart = 0;
        length = input.length();
        sb = new StringBuilder(length);
_L2:
        match;
        if(match == null)
            Intrinsics.throwNpe();
        MatchResult foundMatch;
        foundMatch;
        sb.append(input, lastStart, foundMatch.getRange().getStart().intValue());
        sb.append((CharSequence)transform.invoke(foundMatch));
        lastStart = foundMatch.getRange().getEndInclusive().intValue() + 1;
        match = foundMatch.next();
        if(lastStart >= length || match == null)
        {
            if(lastStart < length)
                sb.append(input, lastStart, length);
            String s = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(s, "sb.toString()");
            return s;
        }
        if(true) goto _L2; else goto _L1
_L1:
    }

    public final String replaceFirst(CharSequence input, String replacement)
    {
        Intrinsics.checkParameterIsNotNull(input, "input");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        String s = nativePattern.matcher(input).replaceFirst(replacement);
        Intrinsics.checkExpressionValueIsNotNull(s, "nativePattern.matcher(in\u2026replaceFirst(replacement)");
        return s;
    }

    public final List split(CharSequence input, int limit)
    {
        Intrinsics.checkParameterIsNotNull(input, "input");
        boolean flag = limit >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Limit must be non-negative, but was ").append(limit).append(".").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return ArraysKt.asList((Object[])nativePattern.split(input, limit != 0 ? limit : -1));
        }
    }

    public static volatile List split$default(Regex regex, CharSequence charsequence, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: split");
        if((j & 2) != 0)
            i = 0;
        return regex.split(charsequence, i);
    }

    public String toString()
    {
        String s = nativePattern.toString();
        Intrinsics.checkExpressionValueIsNotNull(s, "nativePattern.toString()");
        return s;
    }

    public final Pattern toPattern()
    {
        return nativePattern;
    }

    public Regex(Pattern nativePattern)
    {
        Intrinsics.checkParameterIsNotNull(nativePattern, "nativePattern");
        super();
        this.nativePattern = nativePattern;
        int value$iv = this.nativePattern.flags();
        Regex regex = this;
        EnumSet enumset = EnumSet.allOf(kotlin/text/RegexOption);
        EnumSet $receiver$iv = (EnumSet)enumset;
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

        CollectionsKt.retainAll((Iterable)$receiver$iv, (Function1)new fromInt..inlined.apply.lambda._cls1(value$iv));
        Set set1 = Collections.unmodifiableSet((Set)enumset);
        Intrinsics.checkExpressionValueIsNotNull(set1, "Collections.unmodifiable\u2026 == it.value }\n        })");
        Set set = set1;
        regex.options = set;
    }

    public Regex(String pattern)
    {
        Intrinsics.checkParameterIsNotNull(pattern, "pattern");
        Pattern pattern1 = Pattern.compile(pattern);
        Intrinsics.checkExpressionValueIsNotNull(pattern1, "Pattern.compile(pattern)");
        this(pattern1);
    }

    public Regex(String pattern, RegexOption option)
    {
        Intrinsics.checkParameterIsNotNull(pattern, "pattern");
        Intrinsics.checkParameterIsNotNull(option, "option");
        Pattern pattern1 = Pattern.compile(pattern, Companion.ensureUnicodeCase(option.getValue()));
        Intrinsics.checkExpressionValueIsNotNull(pattern1, "Pattern.compile(pattern,\u2026nicodeCase(option.value))");
        this(pattern1);
    }

    public Regex(String pattern, Set options)
    {
        Intrinsics.checkParameterIsNotNull(pattern, "pattern");
        Intrinsics.checkParameterIsNotNull(options, "options");
        Pattern pattern1 = Pattern.compile(pattern, Companion.ensureUnicodeCase(RegexKt.access$toInt((Iterable)options)));
        Intrinsics.checkExpressionValueIsNotNull(pattern1, "Pattern.compile(pattern,\u2026odeCase(options.toInt()))");
        this(pattern1);
    }

    private final Set options;
    private final Pattern nativePattern;
    public static final Companion Companion = new Companion(null);

}
