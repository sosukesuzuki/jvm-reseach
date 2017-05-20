// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Strings.kt

package kotlin.text;

import java.util.*;
import kotlin.*;
import kotlin.collections.*;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.*;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.text:
//            StringsKt__StringsJVMKt, StringsKt, CharsKt, Regex, 
//            DelimitedRangesSequence

class StringsKt__StringsKt extends StringsKt__StringsJVMKt
{

    public static final CharSequence trim(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int startIndex = 0;
        int endIndex = $receiver.length() - 1;
        boolean startFound = false;
        do
        {
            if(startIndex > endIndex)
                break;
            int index = startFound ? endIndex : startIndex;
            boolean match = ((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue();
            if(!startFound)
            {
                if(!match)
                    startFound = true;
                else
                    startIndex++;
                continue;
            }
            if(!match)
                break;
            endIndex--;
        } while(true);
        return $receiver.subSequence(startIndex, endIndex + 1);
    }

    public static final String trim(String $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        (CharSequence);
        CharSequence $receiver$iv;
        $receiver$iv;
        int startIndex$iv = 0;
        int endIndex$iv = $receiver$iv.length() - 1;
        boolean startFound$iv = false;
        do
        {
            if(startIndex$iv > endIndex$iv)
                break;
            int index$iv = startFound$iv ? endIndex$iv : startIndex$iv;
            boolean match$iv = ((Boolean)predicate.invoke(Character.valueOf($receiver$iv.charAt(index$iv)))).booleanValue();
            if(!startFound$iv)
            {
                if(!match$iv)
                    startFound$iv = true;
                else
                    startIndex$iv++;
                continue;
            }
            if(!match$iv)
                break;
            endIndex$iv--;
        } while(true);
        return $receiver$iv.subSequence(startIndex$iv, endIndex$iv + 1).toString();
    }

    public static final CharSequence trimStart(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        IntRange intrange = StringsKt.getIndices($receiver);
        int index = intrange.getFirst();
        int i = intrange.getLast();
        if(index <= i)
            do
            {
                if(!((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
                    return $receiver.subSequence(index, $receiver.length());
                if(index == i)
                    break;
                index++;
            } while(true);
        return (CharSequence)"";
    }

    public static final String trimStart(String $receiver, Function1 predicate)
    {
        CharSequence $receiver$iv;
        int index$iv;
        int i;
        IntRange intrange;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        $receiver$iv = (CharSequence)$receiver;
        intrange = StringsKt.getIndices($receiver$iv);
        index$iv = intrange.getFirst();
        i = intrange.getLast();
        if(index$iv > i) goto _L2; else goto _L1
_L1:
        if(((Boolean)predicate.invoke(Character.valueOf($receiver$iv.charAt(index$iv)))).booleanValue()) goto _L4; else goto _L3
_L3:
        $receiver$iv.subSequence(index$iv, $receiver$iv.length());
          goto _L5
_L4:
        if(index$iv == i)
            break; /* Loop/switch isn't completed */
        index$iv++;
        if(true) goto _L1; else goto _L2
_L2:
        (CharSequence)"";
_L5:
        toString();
        return;
    }

    public static final CharSequence trimEnd(CharSequence $receiver, Function1 predicate)
    {
        int index;
        int i;
        int j;
        IntProgression intprogression;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        intprogression = RangesKt.reversed((IntProgression)StringsKt.getIndices($receiver));
        index = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        index;
        i;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_52;
        JVM INSTR icmpgt 124;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_55;
_L2:
        break MISSING_BLOCK_LABEL_124;
        JVM INSTR icmplt 124;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_55;
_L4:
        break MISSING_BLOCK_LABEL_124;
        do
        {
            if(!((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
            {
                CharSequence charsequence = $receiver;
                int k = 0;
                int l = index + 1;
                return (CharSequence)charsequence.subSequence(k, l).toString();
            }
            if(index == i)
                break;
            index += j;
        } while(true);
        return (CharSequence)"";
    }

    public static final String trimEnd(String $receiver, Function1 predicate)
    {
        CharSequence $receiver$iv;
        int index$iv;
        int i;
        int j;
        IntProgression intprogression;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        $receiver$iv = (CharSequence)$receiver;
        intprogression = RangesKt.reversed((IntProgression)StringsKt.getIndices($receiver$iv));
        index$iv = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        index$iv;
        i;
        if(j <= 0) goto _L2; else goto _L1
_L1:
        JVM INSTR icmpgt 153;
           goto _L3 _L4
_L2:
        JVM INSTR icmplt 153;
           goto _L3 _L4
_L3:
        if(((Boolean)predicate.invoke(Character.valueOf($receiver$iv.charAt(index$iv)))).booleanValue()) goto _L6; else goto _L5
_L5:
        CharSequence charsequence;
        int k;
        int l;
        charsequence = $receiver$iv;
        k = 0;
        l = index$iv + 1;
        (CharSequence)charsequence.subSequence(k, l).toString();
          goto _L7
_L6:
        if(index$iv == i)
            break; /* Loop/switch isn't completed */
        index$iv += j;
        if(true) goto _L3; else goto _L4
_L4:
        (CharSequence)"";
_L7:
        toString();
        return;
    }

    public static final transient CharSequence trim(CharSequence $receiver, char chars[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(chars, "chars");
        CharSequence $receiver$iv = $receiver;
        int startIndex$iv = 0;
        int endIndex$iv = $receiver$iv.length() - 1;
        boolean startFound$iv = false;
        do
        {
            if(startIndex$iv > endIndex$iv)
                break;
            int index$iv = startFound$iv ? endIndex$iv : startIndex$iv;
            char it = $receiver$iv.charAt(index$iv);
            boolean match$iv = ArraysKt.contains(chars, it);
            if(!startFound$iv)
            {
                if(!match$iv)
                    startFound$iv = true;
                else
                    startIndex$iv++;
                continue;
            }
            if(!match$iv)
                break;
            endIndex$iv--;
        } while(true);
        return $receiver$iv.subSequence(startIndex$iv, endIndex$iv + 1);
    }

    public static final transient String trim(String $receiver, char chars[])
    {
        String s;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(chars, "chars");
        s = $receiver;
        s;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        (CharSequence);
        CharSequence $receiver$iv$iv;
        $receiver$iv$iv;
        int startIndex$iv$iv = 0;
        int endIndex$iv$iv = $receiver$iv$iv.length() - 1;
        boolean startFound$iv$iv = false;
        do
        {
            if(startIndex$iv$iv > endIndex$iv$iv)
                break;
            int index$iv$iv = startFound$iv$iv ? endIndex$iv$iv : startIndex$iv$iv;
            char it = $receiver$iv$iv.charAt(index$iv$iv);
            boolean match$iv$iv = ArraysKt.contains(chars, it);
            if(!startFound$iv$iv)
            {
                if(!match$iv$iv)
                    startFound$iv$iv = true;
                else
                    startIndex$iv$iv++;
                continue;
            }
            if(!match$iv$iv)
                break;
            endIndex$iv$iv--;
        } while(true);
        return $receiver$iv$iv.subSequence(startIndex$iv$iv, endIndex$iv$iv + 1).toString();
    }

    public static final transient CharSequence trimStart(CharSequence $receiver, char chars[])
    {
        CharSequence $receiver$iv;
        int index$iv;
        int i;
        IntRange intrange;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(chars, "chars");
        $receiver$iv = $receiver;
        intrange = StringsKt.getIndices($receiver$iv);
        index$iv = intrange.getFirst();
        i = intrange.getLast();
        if(index$iv > i) goto _L2; else goto _L1
_L1:
        char it = $receiver$iv.charAt(index$iv);
        if(ArraysKt.contains(chars, it)) goto _L4; else goto _L3
_L3:
        $receiver$iv.subSequence(index$iv, $receiver$iv.length());
          goto _L5
_L4:
        if(index$iv == i)
            break; /* Loop/switch isn't completed */
        index$iv++;
        if(true) goto _L1; else goto _L2
_L2:
        (CharSequence)"";
_L5:
        return;
    }

    public static final transient String trimStart(String $receiver, char chars[])
    {
        CharSequence $receiver$iv$iv;
        int index$iv$iv;
        int i;
        IntRange intrange;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(chars, "chars");
        String s = $receiver;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        $receiver$iv$iv = (CharSequence)s;
        intrange = StringsKt.getIndices($receiver$iv$iv);
        index$iv$iv = intrange.getFirst();
        i = intrange.getLast();
        if(index$iv$iv > i) goto _L2; else goto _L1
_L1:
        char it = $receiver$iv$iv.charAt(index$iv$iv);
        if(ArraysKt.contains(chars, it)) goto _L4; else goto _L3
_L3:
        $receiver$iv$iv.subSequence(index$iv$iv, $receiver$iv$iv.length());
          goto _L5
_L4:
        if(index$iv$iv == i)
            break; /* Loop/switch isn't completed */
        index$iv$iv++;
        if(true) goto _L1; else goto _L2
_L2:
        (CharSequence)"";
_L5:
        toString();
        return;
    }

    public static final transient CharSequence trimEnd(CharSequence $receiver, char chars[])
    {
        CharSequence $receiver$iv;
        int index$iv;
        int i;
        int j;
        IntProgression intprogression;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(chars, "chars");
        $receiver$iv = $receiver;
        intprogression = RangesKt.reversed((IntProgression)StringsKt.getIndices($receiver$iv));
        index$iv = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        index$iv;
        i;
        if(j <= 0) goto _L2; else goto _L1
_L1:
        JVM INSTR icmpgt 122;
           goto _L3 _L4
_L2:
        JVM INSTR icmplt 122;
           goto _L3 _L4
_L3:
        char it = $receiver$iv.charAt(index$iv);
        if(ArraysKt.contains(chars, it)) goto _L6; else goto _L5
_L5:
        CharSequence charsequence;
        int k;
        int l;
        charsequence = $receiver$iv;
        k = 0;
        l = index$iv + 1;
        (CharSequence)charsequence.subSequence(k, l).toString();
          goto _L7
_L6:
        if(index$iv == i)
            break; /* Loop/switch isn't completed */
        index$iv += j;
        if(true) goto _L3; else goto _L4
_L4:
        (CharSequence)"";
_L7:
        return;
    }

    public static final transient String trimEnd(String $receiver, char chars[])
    {
        CharSequence $receiver$iv$iv;
        int index$iv$iv;
        int i;
        int j;
        IntProgression intprogression;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(chars, "chars");
        String s = $receiver;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        $receiver$iv$iv = (CharSequence)s;
        intprogression = RangesKt.reversed((IntProgression)StringsKt.getIndices($receiver$iv$iv));
        index$iv$iv = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        index$iv$iv;
        i;
        if(j <= 0) goto _L2; else goto _L1
_L1:
        JVM INSTR icmpgt 149;
           goto _L3 _L4
_L2:
        JVM INSTR icmplt 149;
           goto _L3 _L4
_L3:
        char it = $receiver$iv$iv.charAt(index$iv$iv);
        if(ArraysKt.contains(chars, it)) goto _L6; else goto _L5
_L5:
        CharSequence charsequence;
        int k;
        int l;
        charsequence = $receiver$iv$iv;
        k = 0;
        l = index$iv$iv + 1;
        (CharSequence)charsequence.subSequence(k, l).toString();
          goto _L7
_L6:
        if(index$iv$iv == i)
            break; /* Loop/switch isn't completed */
        index$iv$iv += j;
        if(true) goto _L3; else goto _L4
_L4:
        (CharSequence)"";
_L7:
        toString();
        return;
    }

    public static final CharSequence trim(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharSequence $receiver$iv = $receiver;
        int startIndex$iv = 0;
        int endIndex$iv = $receiver$iv.length() - 1;
        boolean startFound$iv = false;
        do
        {
            if(startIndex$iv > endIndex$iv)
                break;
            int index$iv = startFound$iv ? endIndex$iv : startIndex$iv;
            char it = $receiver$iv.charAt(index$iv);
            boolean match$iv = CharsKt.isWhitespace(it);
            if(!startFound$iv)
            {
                if(!match$iv)
                    startFound$iv = true;
                else
                    startIndex$iv++;
                continue;
            }
            if(!match$iv)
                break;
            endIndex$iv--;
        } while(true);
        return $receiver$iv.subSequence(startIndex$iv, endIndex$iv + 1);
    }

    private static final String trim(String $receiver)
    {
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        (CharSequence);
        StringsKt.trim();
        toString();
        return;
    }

    public static final CharSequence trimStart(CharSequence $receiver)
    {
        CharSequence $receiver$iv;
        int index$iv;
        int i;
        IntRange intrange;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver$iv = $receiver;
        intrange = StringsKt.getIndices($receiver$iv);
        index$iv = intrange.getFirst();
        i = intrange.getLast();
        if(index$iv > i) goto _L2; else goto _L1
_L1:
        char it = $receiver$iv.charAt(index$iv);
        if(CharsKt.isWhitespace(it)) goto _L4; else goto _L3
_L3:
        $receiver$iv.subSequence(index$iv, $receiver$iv.length());
          goto _L5
_L4:
        if(index$iv == i)
            break; /* Loop/switch isn't completed */
        index$iv++;
        if(true) goto _L1; else goto _L2
_L2:
        (CharSequence)"";
_L5:
        return;
    }

    private static final String trimStart(String $receiver)
    {
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        (CharSequence);
        StringsKt.trimStart();
        toString();
        return;
    }

    public static final CharSequence trimEnd(CharSequence $receiver)
    {
        CharSequence $receiver$iv;
        int index$iv;
        int i;
        int j;
        IntProgression intprogression;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver$iv = $receiver;
        intprogression = RangesKt.reversed((IntProgression)StringsKt.getIndices($receiver$iv));
        index$iv = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        index$iv;
        i;
        if(j <= 0) goto _L2; else goto _L1
_L1:
        JVM INSTR icmpgt 112;
           goto _L3 _L4
_L2:
        JVM INSTR icmplt 112;
           goto _L3 _L4
_L3:
        char it = $receiver$iv.charAt(index$iv);
        if(CharsKt.isWhitespace(it)) goto _L6; else goto _L5
_L5:
        CharSequence charsequence;
        int k;
        int l;
        charsequence = $receiver$iv;
        k = 0;
        l = index$iv + 1;
        (CharSequence)charsequence.subSequence(k, l).toString();
          goto _L7
_L6:
        if(index$iv == i)
            break; /* Loop/switch isn't completed */
        index$iv += j;
        if(true) goto _L3; else goto _L4
_L4:
        (CharSequence)"";
_L7:
        return;
    }

    private static final String trimEnd(String $receiver)
    {
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        (CharSequence);
        StringsKt.trimEnd();
        toString();
        return;
    }

    public static final CharSequence padStart(CharSequence $receiver, int length, char padChar)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(length < 0)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Desired length ").append(length).append(" is less than zero.").toString());
        if(length <= $receiver.length())
            return $receiver.subSequence(0, $receiver.length());
        StringBuilder sb = new StringBuilder(length);
        int i = 1;
        int j = length - $receiver.length();
        if(i <= j)
            do
            {
                sb.append(padChar);
                if(i == j)
                    break;
                i++;
            } while(true);
        sb.append($receiver);
        return (CharSequence)sb;
    }

    public static volatile CharSequence padStart$default(CharSequence charsequence, int i, char c, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: padStart");
        if((j & 2) != 0)
            c = ' ';
        return StringsKt.padStart(charsequence, i, c);
    }

    public static final String padStart(String $receiver, int length, char padChar)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.padStart((CharSequence)$receiver, length, padChar).toString();
    }

    public static volatile String padStart$default(String s, int i, char c, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: padStart");
        if((j & 2) != 0)
            c = ' ';
        return StringsKt.padStart(s, i, c);
    }

    public static final CharSequence padEnd(CharSequence $receiver, int length, char padChar)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(length < 0)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Desired length ").append(length).append(" is less than zero.").toString());
        if(length <= $receiver.length())
            return $receiver.subSequence(0, $receiver.length());
        StringBuilder sb = new StringBuilder(length);
        sb.append($receiver);
        int i = 1;
        int j = length - $receiver.length();
        if(i <= j)
            do
            {
                sb.append(padChar);
                if(i == j)
                    break;
                i++;
            } while(true);
        return (CharSequence)sb;
    }

    public static volatile CharSequence padEnd$default(CharSequence charsequence, int i, char c, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: padEnd");
        if((j & 2) != 0)
            c = ' ';
        return StringsKt.padEnd(charsequence, i, c);
    }

    public static final String padEnd(String $receiver, int length, char padChar)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.padEnd((CharSequence)$receiver, length, padChar).toString();
    }

    public static volatile String padEnd$default(String s, int i, char c, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: padEnd");
        if((j & 2) != 0)
            c = ' ';
        return StringsKt.padEnd(s, i, c);
    }

    private static final boolean isNullOrEmpty(CharSequence $receiver)
    {
        return $receiver == null || $receiver.length() == 0;
    }

    private static final boolean isEmpty(CharSequence $receiver)
    {
        return $receiver.length() == 0;
    }

    private static final boolean isNotEmpty(CharSequence $receiver)
    {
        return $receiver.length() > 0;
    }

    private static final boolean isNotBlank(CharSequence $receiver)
    {
        return !StringsKt.isBlank($receiver);
    }

    private static final boolean isNullOrBlank(CharSequence $receiver)
    {
        return $receiver == null || StringsKt.isBlank($receiver);
    }

    public static final CharIterator iterator(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (CharIterator)new CharIterator($receiver) {

            private final int getIndex()
            {
                return index;
            }

            private final void setIndex(int <set-?>)
            {
                index = <set-?>;
            }

            public char nextChar()
            {
                int i = index;
                index = index + 1;
                return receiver$0.charAt(i);
            }

            public boolean hasNext()
            {
                return index < receiver$0.length();
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private int index;
            final CharSequence receiver$0;

            
            {
                receiver$0 = $receiver;
                super();
            }
        }
;
    }

    private static final String orEmpty(String $receiver)
    {
        return $receiver == null ? "" : $receiver;
    }

    public static final IntRange getIndices(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        0;
        JVM INSTR new #92  <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        $receiver.length() - 1;
        IntRange();
        return;
    }

    public static final int getLastIndex(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(CharSequence $receiver, int index)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        true;
        index;
        JVM INSTR dup2 ;
        0;
        JVM INSTR icmpge 15;
           goto _L1 _L2
_L1:
        JVM INSTR pop ;
        false;
_L2:
        $receiver.length() - 2;
        JVM INSTR icmple 30;
           goto _L3 _L4
_L3:
        JVM INSTR pop ;
        false;
_L4:
        JVM INSTR iand ;
        JVM INSTR ifeq 72;
           goto _L5 _L6
_L5:
        char c = $receiver.charAt(index);
        if(!Character.isHighSurrogate(c)) goto _L6; else goto _L7
_L7:
        c = $receiver.charAt(index + 1);
        if(!Character.isLowSurrogate(c)) goto _L6; else goto _L8
_L8:
        true;
          goto _L9
_L6:
        false;
_L9:
        return;
    }

    public static final String substring(String $receiver, IntRange range)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(range, "range");
        String s = $receiver;
        int i = range.getStart().intValue();
        int j = range.getEndInclusive().intValue() + 1;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s1 = ((String)s).substring(i, j);
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return s1;
    }

    public static final CharSequence subSequence(CharSequence $receiver, IntRange range)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(range, "range");
        return $receiver.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    /**
     * @deprecated Method subSequence is deprecated
     */

    private static final CharSequence subSequence(String $receiver, int start, int end)
    {
        return $receiver.subSequence(start, end);
    }

    private static final String substring(CharSequence $receiver, int startIndex, int endIndex)
    {
        return $receiver.subSequence(startIndex, endIndex).toString();
    }

    static volatile String substring$default(CharSequence $receiver, int startIndex, int endIndex, int $i$f$substring, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        if(($i$f$substring & 2) != 0)
            endIndex = $receiver.length();
        return $receiver.subSequence(startIndex, endIndex).toString();
    }

    public static final String substring(CharSequence $receiver, IntRange range)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(range, "range");
        return $receiver.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static final String substringBefore(String $receiver, char delimiter, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.indexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1)
            break MISSING_BLOCK_LABEL_36;
        missingDelimiterValue;
        break MISSING_BLOCK_LABEL_76;
        String s1;
        String s = $receiver;
        int i = 0;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s1 = ((String)s).substring(i, index);
        s1;
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return;
    }

    public static volatile String substringBefore$default(String s, char c, String s1, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substringBefore");
        if((i & 2) != 0)
            s1 = s;
        return StringsKt.substringBefore(s, c, s1);
    }

    public static final String substringBefore(String $receiver, String delimiter, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.indexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1)
            break MISSING_BLOCK_LABEL_43;
        missingDelimiterValue;
        break MISSING_BLOCK_LABEL_83;
        String s1;
        String s = $receiver;
        int i = 0;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s1 = ((String)s).substring(i, index);
        s1;
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return;
    }

    public static volatile String substringBefore$default(String s, String s1, String s2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substringBefore");
        if((i & 2) != 0)
            s2 = s;
        return StringsKt.substringBefore(s, s1, s2);
    }

    public static final String substringAfter(String $receiver, char delimiter, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.indexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1)
            break MISSING_BLOCK_LABEL_36;
        missingDelimiterValue;
        break MISSING_BLOCK_LABEL_85;
        String s1;
        String s = $receiver;
        int i = index + 1;
        int j = $receiver.length();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s1 = ((String)s).substring(i, j);
        s1;
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return;
    }

    public static volatile String substringAfter$default(String s, char c, String s1, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substringAfter");
        if((i & 2) != 0)
            s1 = s;
        return StringsKt.substringAfter(s, c, s1);
    }

    public static final String substringAfter(String $receiver, String delimiter, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.indexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1)
            break MISSING_BLOCK_LABEL_43;
        missingDelimiterValue;
        break MISSING_BLOCK_LABEL_95;
        String s1;
        String s = $receiver;
        int i = index + delimiter.length();
        int j = $receiver.length();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s1 = ((String)s).substring(i, j);
        s1;
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return;
    }

    public static volatile String substringAfter$default(String s, String s1, String s2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substringAfter");
        if((i & 2) != 0)
            s2 = s;
        return StringsKt.substringAfter(s, s1, s2);
    }

    public static final String substringBeforeLast(String $receiver, char delimiter, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.lastIndexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1)
            break MISSING_BLOCK_LABEL_36;
        missingDelimiterValue;
        break MISSING_BLOCK_LABEL_76;
        String s1;
        String s = $receiver;
        int i = 0;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s1 = ((String)s).substring(i, index);
        s1;
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return;
    }

    public static volatile String substringBeforeLast$default(String s, char c, String s1, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substringBeforeLast");
        if((i & 2) != 0)
            s1 = s;
        return StringsKt.substringBeforeLast(s, c, s1);
    }

    public static final String substringBeforeLast(String $receiver, String delimiter, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.lastIndexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1)
            break MISSING_BLOCK_LABEL_43;
        missingDelimiterValue;
        break MISSING_BLOCK_LABEL_83;
        String s1;
        String s = $receiver;
        int i = 0;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s1 = ((String)s).substring(i, index);
        s1;
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return;
    }

    public static volatile String substringBeforeLast$default(String s, String s1, String s2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substringBeforeLast");
        if((i & 2) != 0)
            s2 = s;
        return StringsKt.substringBeforeLast(s, s1, s2);
    }

    public static final String substringAfterLast(String $receiver, char delimiter, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.lastIndexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1)
            break MISSING_BLOCK_LABEL_36;
        missingDelimiterValue;
        break MISSING_BLOCK_LABEL_85;
        String s1;
        String s = $receiver;
        int i = index + 1;
        int j = $receiver.length();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s1 = ((String)s).substring(i, j);
        s1;
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return;
    }

    public static volatile String substringAfterLast$default(String s, char c, String s1, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substringAfterLast");
        if((i & 2) != 0)
            s1 = s;
        return StringsKt.substringAfterLast(s, c, s1);
    }

    public static final String substringAfterLast(String $receiver, String delimiter, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.lastIndexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1)
            break MISSING_BLOCK_LABEL_43;
        missingDelimiterValue;
        break MISSING_BLOCK_LABEL_95;
        String s1;
        String s = $receiver;
        int i = index + delimiter.length();
        int j = $receiver.length();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s1 = ((String)s).substring(i, j);
        s1;
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return;
    }

    public static volatile String substringAfterLast$default(String s, String s1, String s2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substringAfterLast");
        if((i & 2) != 0)
            s2 = s;
        return StringsKt.substringAfterLast(s, s1, s2);
    }

    public static final CharSequence replaceRange(CharSequence $receiver, int startIndex, int endIndex, CharSequence replacement)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        if(endIndex < startIndex)
        {
            throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("End index (").append(endIndex).append(") is less than start index (").append(startIndex).append(").").toString());
        } else
        {
            StringBuilder sb = new StringBuilder();
            sb.append($receiver, 0, startIndex);
            sb.append(replacement);
            sb.append($receiver, endIndex, $receiver.length());
            return (CharSequence)sb;
        }
    }

    private static final String replaceRange(String $receiver, int startIndex, int endIndex, CharSequence replacement)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.replaceRange((CharSequence)$receiver, startIndex, endIndex, replacement).toString();
    }

    public static final CharSequence replaceRange(CharSequence $receiver, IntRange range, CharSequence replacement)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(range, "range");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        return StringsKt.replaceRange($receiver, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    private static final String replaceRange(String $receiver, IntRange range, CharSequence replacement)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.replaceRange((CharSequence)$receiver, range, replacement).toString();
    }

    public static final CharSequence removeRange(CharSequence $receiver, int startIndex, int endIndex)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(endIndex < startIndex)
            throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("End index (").append(endIndex).append(") is less than start index (").append(startIndex).append(").").toString());
        if(endIndex == startIndex)
        {
            return $receiver.subSequence(0, $receiver.length());
        } else
        {
            StringBuilder sb = new StringBuilder($receiver.length() - (endIndex - startIndex));
            sb.append($receiver, 0, startIndex);
            sb.append($receiver, endIndex, $receiver.length());
            return (CharSequence)sb;
        }
    }

    private static final String removeRange(String $receiver, int startIndex, int endIndex)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.removeRange((CharSequence)$receiver, startIndex, endIndex).toString();
    }

    public static final CharSequence removeRange(CharSequence $receiver, IntRange range)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(range, "range");
        return StringsKt.removeRange($receiver, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    private static final String removeRange(String $receiver, IntRange range)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.removeRange((CharSequence)$receiver, range).toString();
    }

    public static final CharSequence removePrefix(CharSequence $receiver, CharSequence prefix)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        if(StringsKt.startsWith$default($receiver, prefix, false, 2, null))
            return $receiver.subSequence(prefix.length(), $receiver.length());
        else
            return $receiver.subSequence(0, $receiver.length());
    }

    public static final String removePrefix(String $receiver, CharSequence prefix)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        String s1;
        if(StringsKt.startsWith$default((CharSequence)$receiver, prefix, false, 2, null))
        {
            String s = $receiver;
            int i = prefix.length();
            if(s == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            s1 = ((String)s).substring(i);
            Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.String).substring(startIndex)");
            return s1;
        } else
        {
            return $receiver;
        }
    }

    public static final CharSequence removeSuffix(CharSequence $receiver, CharSequence suffix)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(suffix, "suffix");
        if(StringsKt.endsWith$default($receiver, suffix, false, 2, null))
            return $receiver.subSequence(0, $receiver.length() - suffix.length());
        else
            return $receiver.subSequence(0, $receiver.length());
    }

    public static final String removeSuffix(String $receiver, CharSequence suffix)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(suffix, "suffix");
        String s1;
        if(StringsKt.endsWith$default((CharSequence)$receiver, suffix, false, 2, null))
        {
            String s = $receiver;
            int i = 0;
            int j = $receiver.length() - suffix.length();
            if(s == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            s1 = ((String)s).substring(i, j);
            Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return s1;
        } else
        {
            return $receiver;
        }
    }

    public static final CharSequence removeSurrounding(CharSequence $receiver, CharSequence prefix, CharSequence suffix)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        Intrinsics.checkParameterIsNotNull(suffix, "suffix");
        if($receiver.length() >= prefix.length() + suffix.length() && StringsKt.startsWith$default($receiver, prefix, false, 2, null) && StringsKt.endsWith$default($receiver, suffix, false, 2, null))
            return $receiver.subSequence(prefix.length(), $receiver.length() - suffix.length());
        else
            return $receiver.subSequence(0, $receiver.length());
    }

    public static final String removeSurrounding(String $receiver, CharSequence prefix, CharSequence suffix)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        Intrinsics.checkParameterIsNotNull(suffix, "suffix");
        String s1;
        if($receiver.length() >= prefix.length() + suffix.length() && StringsKt.startsWith$default((CharSequence)$receiver, prefix, false, 2, null) && StringsKt.endsWith$default((CharSequence)$receiver, suffix, false, 2, null))
        {
            String s = $receiver;
            int i = prefix.length();
            int j = $receiver.length() - suffix.length();
            if(s == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            s1 = ((String)s).substring(i, j);
            Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return s1;
        } else
        {
            return $receiver;
        }
    }

    public static final CharSequence removeSurrounding(CharSequence $receiver, CharSequence delimiter)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        return StringsKt.removeSurrounding($receiver, delimiter, delimiter);
    }

    public static final String removeSurrounding(String $receiver, CharSequence delimiter)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        return StringsKt.removeSurrounding($receiver, delimiter, delimiter);
    }

    public static final String replaceBefore(String $receiver, char delimiter, String replacement, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.indexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1) goto _L2; else goto _L1
_L1:
        missingDelimiterValue;
          goto _L3
_L2:
        int i;
        String s = $receiver;
        i = 0;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, i, index, (CharSequence)replacement).toString();
_L3:
        return;
    }

    public static volatile String replaceBefore$default(String s, char c, String s1, String s2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceBefore");
        if((i & 4) != 0)
            s2 = s;
        return StringsKt.replaceBefore(s, c, s1, s2);
    }

    public static final String replaceBefore(String $receiver, String delimiter, String replacement, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.indexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1) goto _L2; else goto _L1
_L1:
        missingDelimiterValue;
          goto _L3
_L2:
        int i;
        String s = $receiver;
        i = 0;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, i, index, (CharSequence)replacement).toString();
_L3:
        return;
    }

    public static volatile String replaceBefore$default(String s, String s1, String s2, String s3, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceBefore");
        if((i & 4) != 0)
            s3 = s;
        return StringsKt.replaceBefore(s, s1, s2, s3);
    }

    public static final String replaceAfter(String $receiver, char delimiter, String replacement, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.indexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1) goto _L2; else goto _L1
_L1:
        missingDelimiterValue;
          goto _L3
_L2:
        int i;
        int j;
        String s = $receiver;
        i = index + 1;
        j = $receiver.length();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, i, j, (CharSequence)replacement).toString();
_L3:
        return;
    }

    public static volatile String replaceAfter$default(String s, char c, String s1, String s2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceAfter");
        if((i & 4) != 0)
            s2 = s;
        return StringsKt.replaceAfter(s, c, s1, s2);
    }

    public static final String replaceAfter(String $receiver, String delimiter, String replacement, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.indexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1) goto _L2; else goto _L1
_L1:
        missingDelimiterValue;
          goto _L3
_L2:
        int i;
        int j;
        String s = $receiver;
        i = index + delimiter.length();
        j = $receiver.length();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, i, j, (CharSequence)replacement).toString();
_L3:
        return;
    }

    public static volatile String replaceAfter$default(String s, String s1, String s2, String s3, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceAfter");
        if((i & 4) != 0)
            s3 = s;
        return StringsKt.replaceAfter(s, s1, s2, s3);
    }

    public static final String replaceAfterLast(String $receiver, String delimiter, String replacement, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.lastIndexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1) goto _L2; else goto _L1
_L1:
        missingDelimiterValue;
          goto _L3
_L2:
        int i;
        int j;
        String s = $receiver;
        i = index + delimiter.length();
        j = $receiver.length();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, i, j, (CharSequence)replacement).toString();
_L3:
        return;
    }

    public static volatile String replaceAfterLast$default(String s, String s1, String s2, String s3, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceAfterLast");
        if((i & 4) != 0)
            s3 = s;
        return StringsKt.replaceAfterLast(s, s1, s2, s3);
    }

    public static final String replaceAfterLast(String $receiver, char delimiter, String replacement, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.lastIndexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1) goto _L2; else goto _L1
_L1:
        missingDelimiterValue;
          goto _L3
_L2:
        int i;
        int j;
        String s = $receiver;
        i = index + 1;
        j = $receiver.length();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, i, j, (CharSequence)replacement).toString();
_L3:
        return;
    }

    public static volatile String replaceAfterLast$default(String s, char c, String s1, String s2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceAfterLast");
        if((i & 4) != 0)
            s2 = s;
        return StringsKt.replaceAfterLast(s, c, s1, s2);
    }

    public static final String replaceBeforeLast(String $receiver, char delimiter, String replacement, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.lastIndexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1) goto _L2; else goto _L1
_L1:
        missingDelimiterValue;
          goto _L3
_L2:
        int i;
        String s = $receiver;
        i = 0;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, i, index, (CharSequence)replacement).toString();
_L3:
        return;
    }

    public static volatile String replaceBeforeLast$default(String s, char c, String s1, String s2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceBeforeLast");
        if((i & 4) != 0)
            s2 = s;
        return StringsKt.replaceBeforeLast(s, c, s1, s2);
    }

    public static final String replaceBeforeLast(String $receiver, String delimiter, String replacement, String missingDelimiterValue)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiter, "delimiter");
        Intrinsics.checkParameterIsNotNull(replacement, "replacement");
        Intrinsics.checkParameterIsNotNull(missingDelimiterValue, "missingDelimiterValue");
        index = StringsKt.lastIndexOf$default((CharSequence)$receiver, delimiter, 0, false, 6, null);
        if(index != -1) goto _L2; else goto _L1
_L1:
        missingDelimiterValue;
          goto _L3
_L2:
        int i;
        String s = $receiver;
        i = 0;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, i, index, (CharSequence)replacement).toString();
_L3:
        return;
    }

    public static volatile String replaceBeforeLast$default(String s, String s1, String s2, String s3, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceBeforeLast");
        if((i & 4) != 0)
            s3 = s;
        return StringsKt.replaceBeforeLast(s, s1, s2, s3);
    }

    private static final String replace(CharSequence $receiver, Regex regex, String replacement)
    {
        return regex.replace($receiver, replacement);
    }

    private static final String replace(CharSequence $receiver, Regex regex, Function1 transform)
    {
        return regex.replace($receiver, transform);
    }

    private static final String replaceFirst(CharSequence $receiver, Regex regex, String replacement)
    {
        return regex.replaceFirst($receiver, replacement);
    }

    private static final boolean matches(CharSequence $receiver, Regex regex)
    {
        return regex.matches($receiver);
    }

    public static final boolean regionMatchesImpl(CharSequence $receiver, int thisOffset, CharSequence other, int otherOffset, int length, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        if(otherOffset < 0 || thisOffset < 0 || thisOffset > $receiver.length() - length || otherOffset > other.length() - length)
            return false;
        int index = 0;
        int i = length - 1;
        if(index <= i)
            do
            {
                if(!CharsKt.equals($receiver.charAt(thisOffset + index), other.charAt(otherOffset + index), ignoreCase))
                    return false;
                if(index == i)
                    break;
                index++;
            } while(true);
        return true;
    }

    public static final boolean startsWith(CharSequence $receiver, char char, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length() > 0 && CharsKt.equals($receiver.charAt(0), char, ignoreCase);
    }

    public static volatile boolean startsWith$default(CharSequence charsequence, char c, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startsWith");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.startsWith(charsequence, c, flag);
    }

    public static final boolean endsWith(CharSequence $receiver, char char, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length() > 0 && CharsKt.equals($receiver.charAt(StringsKt.getLastIndex($receiver)), char, ignoreCase);
    }

    public static volatile boolean endsWith$default(CharSequence charsequence, char c, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endsWith");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.endsWith(charsequence, c, flag);
    }

    public static final boolean startsWith(CharSequence $receiver, CharSequence prefix, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        if(!ignoreCase && ($receiver instanceof String) && (prefix instanceof String))
            return StringsKt.startsWith$default((String)$receiver, (String)prefix, false, 2, null);
        else
            return StringsKt.regionMatchesImpl($receiver, 0, prefix, 0, prefix.length(), ignoreCase);
    }

    public static volatile boolean startsWith$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startsWith");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.startsWith(charsequence, charsequence1, flag);
    }

    public static final boolean startsWith(CharSequence $receiver, CharSequence prefix, int startIndex, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        if(!ignoreCase && ($receiver instanceof String) && (prefix instanceof String))
            return StringsKt.startsWith$default((String)$receiver, (String)prefix, startIndex, false, 4, null);
        else
            return StringsKt.regionMatchesImpl($receiver, startIndex, prefix, 0, prefix.length(), ignoreCase);
    }

    public static volatile boolean startsWith$default(CharSequence charsequence, CharSequence charsequence1, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startsWith");
        if((j & 4) != 0)
            flag = false;
        return StringsKt.startsWith(charsequence, charsequence1, i, flag);
    }

    public static final boolean endsWith(CharSequence $receiver, CharSequence suffix, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(suffix, "suffix");
        if(!ignoreCase && ($receiver instanceof String) && (suffix instanceof String))
            return StringsKt.endsWith$default((String)$receiver, (String)suffix, false, 2, null);
        else
            return StringsKt.regionMatchesImpl($receiver, $receiver.length() - suffix.length(), suffix, 0, suffix.length(), ignoreCase);
    }

    public static volatile boolean endsWith$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endsWith");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.endsWith(charsequence, charsequence1, flag);
    }

    public static final String commonPrefixWith(CharSequence $receiver, CharSequence other, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        int shortestLength = Math.min($receiver.length(), other.length());
        int i;
        for(i = 0; i < shortestLength && CharsKt.equals($receiver.charAt(i), other.charAt(i), ignoreCase); i++);
        if(StringsKt.hasSurrogatePairAt($receiver, i - 1) || StringsKt.hasSurrogatePairAt(other, i - 1))
            i--;
        return $receiver.subSequence(0, i).toString();
    }

    public static volatile String commonPrefixWith$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commonPrefixWith");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.commonPrefixWith(charsequence, charsequence1, flag);
    }

    public static final String commonSuffixWith(CharSequence $receiver, CharSequence other, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        int thisLength = $receiver.length();
        int otherLength = other.length();
        int shortestLength = Math.min(thisLength, otherLength);
        int i;
        for(i = 0; i < shortestLength && CharsKt.equals($receiver.charAt(thisLength - i - 1), other.charAt(otherLength - i - 1), ignoreCase); i++);
        if(StringsKt.hasSurrogatePairAt($receiver, thisLength - i - 1) || StringsKt.hasSurrogatePairAt(other, otherLength - i - 1))
            i--;
        return $receiver.subSequence(thisLength - i, thisLength).toString();
    }

    public static volatile String commonSuffixWith$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commonSuffixWith");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.commonSuffixWith(charsequence, charsequence1, flag);
    }

    private static final Pair findAnyOf$StringsKt__StringsKt(CharSequence $receiver, char chars[], int startIndex, boolean ignoreCase, boolean last)
    {
        int index;
        if(!ignoreCase && chars.length == 1 && ($receiver instanceof String))
        {
            char char = ArraysKt.single(chars);
            if(!last)
            {
                String s = (String)$receiver;
                if(s == null)
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                index = ((String)s).indexOf(char, startIndex);
            } else
            {
                String s1 = (String)$receiver;
                if(s1 == null)
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                index = ((String)s1).lastIndexOf(char, startIndex);
            }
            return index >= 0 ? TuplesKt.to(Integer.valueOf(index), Character.valueOf(char)) : (Pair)null;
        }
        if(last) goto _L2; else goto _L1
_L1:
        Math.max(startIndex, 0);
        JVM INSTR new #92  <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        StringsKt.getLastIndex($receiver);
        IntRange();
        (IntProgression);
          goto _L3
_L2:
        RangesKt.downTo(Math.min(startIndex, StringsKt.getLastIndex($receiver)), 0);
_L3:
        IntProgression indices;
        indices;
        int i;
        int j;
        index = indices.getFirst();
        i = indices.getLast();
        j = indices.getStep();
        index;
        i;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_202;
        JVM INSTR icmpgt 314;
           goto _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_205;
_L5:
        break MISSING_BLOCK_LABEL_314;
        JVM INSTR icmplt 314;
           goto _L6 _L7
_L6:
        break MISSING_BLOCK_LABEL_205;
_L7:
        break MISSING_BLOCK_LABEL_314;
        do
        {
            int matchingCharIndex;
label0:
            {
                char charAtIndex = $receiver.charAt(index);
                char $receiver$iv[] = chars;
                int index$iv = 0;
                int k = $receiver$iv.length - 1;
                if(index$iv <= k)
                    do
                    {
                        char it = $receiver$iv[index$iv];
                        if(CharsKt.equals(it, charAtIndex, ignoreCase))
                        {
                            matchingCharIndex = index$iv;
                            break label0;
                        }
                        if(index$iv == k)
                            break;
                        index$iv++;
                    } while(true);
                matchingCharIndex = -1;
            }
            if(matchingCharIndex >= 0)
                return TuplesKt.to(Integer.valueOf(index), Character.valueOf(chars[matchingCharIndex]));
            if(index == i)
                break;
            index += j;
        } while(true);
        return (Pair)null;
    }

    public static final int indexOfAny(CharSequence $receiver, char chars[], int startIndex, boolean ignoreCase)
    {
        Pair pair;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(chars, "chars");
        pair = findAnyOf$StringsKt__StringsKt($receiver, chars, startIndex, ignoreCase, false);
        pair;
        if(pair == null) goto _L2; else goto _L1
_L1:
        getFirst();
        (Integer);
        JVM INSTR dup ;
        JVM INSTR ifnull 40;
           goto _L3 _L2
_L3:
        intValue();
          goto _L4
_L2:
        JVM INSTR pop ;
        -1;
_L4:
        return;
    }

    public static volatile int indexOfAny$default(CharSequence charsequence, char ac[], int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOfAny");
        if((j & 2) != 0)
            i = 0;
        if((j & 4) != 0)
            flag = false;
        return StringsKt.indexOfAny(charsequence, ac, i, flag);
    }

    public static final int lastIndexOfAny(CharSequence $receiver, char chars[], int startIndex, boolean ignoreCase)
    {
        Pair pair;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(chars, "chars");
        pair = findAnyOf$StringsKt__StringsKt($receiver, chars, startIndex, ignoreCase, true);
        pair;
        if(pair == null) goto _L2; else goto _L1
_L1:
        getFirst();
        (Integer);
        JVM INSTR dup ;
        JVM INSTR ifnull 40;
           goto _L3 _L2
_L3:
        intValue();
          goto _L4
_L2:
        JVM INSTR pop ;
        -1;
_L4:
        return;
    }

    public static volatile int lastIndexOfAny$default(CharSequence charsequence, char ac[], int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOfAny");
        if((j & 2) != 0)
            i = StringsKt.getLastIndex(charsequence);
        if((j & 4) != 0)
            flag = false;
        return StringsKt.lastIndexOfAny(charsequence, ac, i, flag);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence $receiver, CharSequence other, int startIndex, int endIndex, boolean ignoreCase, boolean last)
    {
        if(last) goto _L2; else goto _L1
_L1:
        RangesKt.coerceAtLeast(startIndex, 0);
        JVM INSTR new #92  <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        RangesKt.coerceAtMost(endIndex, $receiver.length());
        IntRange();
        (IntProgression);
          goto _L3
_L2:
        RangesKt.downTo(RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex($receiver)), RangesKt.coerceAtLeast(endIndex, 0));
_L3:
        IntProgression indices;
        indices;
        int index;
        int i;
        int j;
        if(!($receiver instanceof String) || !(other instanceof String))
            break MISSING_BLOCK_LABEL_151;
        index = indices.getFirst();
        i = indices.getLast();
        j = indices.getStep();
        index;
        i;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_100;
        JVM INSTR icmpgt 148;
           goto _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_103;
_L5:
        break MISSING_BLOCK_LABEL_227;
        JVM INSTR icmplt 148;
           goto _L6 _L7
_L6:
        break MISSING_BLOCK_LABEL_103;
_L7:
        break MISSING_BLOCK_LABEL_227;
        do
        {
            if(StringsKt.regionMatches((String)other, 0, (String)$receiver, index, other.length(), ignoreCase))
                return index;
            if(index == i)
                break;
            index += j;
        } while(true);
        break MISSING_BLOCK_LABEL_227;
        index = indices.getFirst();
        i = indices.getLast();
        j = indices.getStep();
        index;
        i;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_185;
        JVM INSTR icmpgt 227;
           goto _L8 _L9
_L8:
        break MISSING_BLOCK_LABEL_188;
_L9:
        break MISSING_BLOCK_LABEL_227;
        JVM INSTR icmplt 227;
           goto _L10 _L11
_L10:
        break MISSING_BLOCK_LABEL_188;
_L11:
        break MISSING_BLOCK_LABEL_227;
        do
        {
            if(StringsKt.regionMatchesImpl(other, 0, $receiver, index, other.length(), ignoreCase))
                return index;
            if(index == i)
                break;
            index += j;
        } while(true);
        return -1;
    }

    static volatile int indexOf$StringsKt__StringsKt$default(CharSequence charsequence, CharSequence charsequence1, int i, int j, boolean flag, boolean flag1, int k, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf$StringsKt__StringsKt");
        if((k & 0x10) != 0)
            flag1 = false;
        return indexOf$StringsKt__StringsKt(charsequence, charsequence1, i, j, flag, flag1);
    }

    private static final Pair findAnyOf$StringsKt__StringsKt(CharSequence $receiver, Collection strings, int startIndex, boolean ignoreCase, boolean last)
    {
        int index;
        if(!ignoreCase && strings.size() == 1)
        {
            String string = (String)CollectionsKt.single((Iterable)strings);
            index = last ? StringsKt.lastIndexOf$default($receiver, string, startIndex, false, 4, null) : StringsKt.indexOf$default($receiver, string, startIndex, false, 4, null);
            return index >= 0 ? TuplesKt.to(Integer.valueOf(index), string) : (Pair)null;
        }
        if(last) goto _L2; else goto _L1
_L1:
        RangesKt.coerceAtLeast(startIndex, 0);
        JVM INSTR new #92  <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        $receiver.length();
        IntRange();
        (IntProgression);
          goto _L3
_L2:
        RangesKt.downTo(RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex($receiver)), 0);
_L3:
        IntProgression indices;
        indices;
        if(!($receiver instanceof String)) goto _L5; else goto _L4
_L4:
        int i;
        int j;
        index = indices.getFirst();
        i = indices.getLast();
        j = indices.getStep();
        index;
        i;
        if(j <= 0) goto _L7; else goto _L6
_L6:
        JVM INSTR icmpgt 278;
           goto _L8 _L9
_L7:
        JVM INSTR icmplt 278;
           goto _L8 _L9
_L8:
        Iterator iterator1;
        Iterable iterable = (Iterable)strings;
        iterator1 = iterable.iterator();
_L13:
        if(!iterator1.hasNext()) goto _L11; else goto _L10
_L10:
        Object element$iv;
        String it;
        element$iv = iterator1.next();
        it = (String)element$iv;
        if(!StringsKt.regionMatches(it, 0, (String)$receiver, index, it.length(), ignoreCase)) goto _L13; else goto _L12
_L12:
        element$iv;
          goto _L14
_L11:
        null;
_L14:
        (String);
        String matchingString;
        matchingString;
        if(matchingString != null)
            return TuplesKt.to(Integer.valueOf(index), matchingString);
        if(index == i)
            break; /* Loop/switch isn't completed */
        index += j;
        if(true) goto _L8; else goto _L9
_L5:
        index = indices.getFirst();
        i = indices.getLast();
        j = indices.getStep();
        index;
        i;
        if(j <= 0) goto _L16; else goto _L15
_L15:
        JVM INSTR icmpgt 428;
           goto _L17 _L9
_L16:
        JVM INSTR icmplt 428;
           goto _L17 _L9
_L17:
        Iterable iterable1 = (Iterable)strings;
        iterator1 = iterable1.iterator();
_L21:
        if(!iterator1.hasNext()) goto _L19; else goto _L18
_L18:
        element$iv = iterator1.next();
        it = (String)element$iv;
        if(!StringsKt.regionMatchesImpl((CharSequence)it, 0, $receiver, index, it.length(), ignoreCase)) goto _L21; else goto _L20
_L20:
        element$iv;
          goto _L22
_L19:
        null;
_L22:
        (String);
        matchingString;
        if(matchingString != null)
            return TuplesKt.to(Integer.valueOf(index), matchingString);
        if(index == i)
            break; /* Loop/switch isn't completed */
        index += j;
        if(true) goto _L17; else goto _L9
_L9:
        return (Pair)null;
    }

    public static final Pair findAnyOf(CharSequence $receiver, Collection strings, int startIndex, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(strings, "strings");
        return findAnyOf$StringsKt__StringsKt($receiver, strings, startIndex, ignoreCase, false);
    }

    public static volatile Pair findAnyOf$default(CharSequence charsequence, Collection collection, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findAnyOf");
        if((j & 2) != 0)
            i = 0;
        if((j & 4) != 0)
            flag = false;
        return StringsKt.findAnyOf(charsequence, collection, i, flag);
    }

    public static final Pair findLastAnyOf(CharSequence $receiver, Collection strings, int startIndex, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(strings, "strings");
        return findAnyOf$StringsKt__StringsKt($receiver, strings, startIndex, ignoreCase, true);
    }

    public static volatile Pair findLastAnyOf$default(CharSequence charsequence, Collection collection, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findLastAnyOf");
        if((j & 2) != 0)
            i = StringsKt.getLastIndex(charsequence);
        if((j & 4) != 0)
            flag = false;
        return StringsKt.findLastAnyOf(charsequence, collection, i, flag);
    }

    public static final int indexOfAny(CharSequence $receiver, Collection strings, int startIndex, boolean ignoreCase)
    {
        Pair pair;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(strings, "strings");
        pair = findAnyOf$StringsKt__StringsKt($receiver, strings, startIndex, ignoreCase, false);
        pair;
        if(pair == null) goto _L2; else goto _L1
_L1:
        getFirst();
        (Integer);
        JVM INSTR dup ;
        JVM INSTR ifnull 41;
           goto _L3 _L2
_L3:
        intValue();
          goto _L4
_L2:
        JVM INSTR pop ;
        -1;
_L4:
        return;
    }

    public static volatile int indexOfAny$default(CharSequence charsequence, Collection collection, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOfAny");
        if((j & 2) != 0)
            i = 0;
        if((j & 4) != 0)
            flag = false;
        return StringsKt.indexOfAny(charsequence, collection, i, flag);
    }

    public static final int lastIndexOfAny(CharSequence $receiver, Collection strings, int startIndex, boolean ignoreCase)
    {
        Pair pair;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(strings, "strings");
        pair = findAnyOf$StringsKt__StringsKt($receiver, strings, startIndex, ignoreCase, true);
        pair;
        if(pair == null) goto _L2; else goto _L1
_L1:
        getFirst();
        (Integer);
        JVM INSTR dup ;
        JVM INSTR ifnull 41;
           goto _L3 _L2
_L3:
        intValue();
          goto _L4
_L2:
        JVM INSTR pop ;
        -1;
_L4:
        return;
    }

    public static volatile int lastIndexOfAny$default(CharSequence charsequence, Collection collection, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOfAny");
        if((j & 2) != 0)
            i = StringsKt.getLastIndex(charsequence);
        if((j & 4) != 0)
            flag = false;
        return StringsKt.lastIndexOfAny(charsequence, collection, i, flag);
    }

    public static final int indexOf(CharSequence $receiver, char char, int startIndex, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(!ignoreCase && ($receiver instanceof String)) goto _L2; else goto _L1
_L1:
        StringsKt.indexOfAny($receiver, new char[] {
            char
        }, startIndex, ignoreCase);
          goto _L3
_L2:
        String s = (String)$receiver;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)s).indexOf(char, startIndex);
_L3:
        return;
    }

    public static volatile int indexOf$default(CharSequence charsequence, char c, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        if((j & 2) != 0)
            i = 0;
        if((j & 4) != 0)
            flag = false;
        return StringsKt.indexOf(charsequence, c, i, flag);
    }

    public static final int indexOf(CharSequence $receiver, String string, int startIndex, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(string, "string");
        if(!ignoreCase && ($receiver instanceof String)) goto _L2; else goto _L1
_L1:
        indexOf$StringsKt__StringsKt$default($receiver, (CharSequence)string, startIndex, $receiver.length(), ignoreCase, false, 16, null);
          goto _L3
_L2:
        String s = (String)$receiver;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)s).indexOf(string, startIndex);
_L3:
        return;
    }

    public static volatile int indexOf$default(CharSequence charsequence, String s, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        if((j & 2) != 0)
            i = 0;
        if((j & 4) != 0)
            flag = false;
        return StringsKt.indexOf(charsequence, s, i, flag);
    }

    public static final int lastIndexOf(CharSequence $receiver, char char, int startIndex, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(!ignoreCase && ($receiver instanceof String)) goto _L2; else goto _L1
_L1:
        StringsKt.lastIndexOfAny($receiver, new char[] {
            char
        }, startIndex, ignoreCase);
          goto _L3
_L2:
        String s = (String)$receiver;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)s).lastIndexOf(char, startIndex);
_L3:
        return;
    }

    public static volatile int lastIndexOf$default(CharSequence charsequence, char c, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        if((j & 2) != 0)
            i = StringsKt.getLastIndex(charsequence);
        if((j & 4) != 0)
            flag = false;
        return StringsKt.lastIndexOf(charsequence, c, i, flag);
    }

    public static final int lastIndexOf(CharSequence $receiver, String string, int startIndex, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(string, "string");
        if(!ignoreCase && ($receiver instanceof String)) goto _L2; else goto _L1
_L1:
        indexOf$StringsKt__StringsKt($receiver, (CharSequence)string, startIndex, 0, ignoreCase, true);
          goto _L3
_L2:
        String s = (String)$receiver;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)s).lastIndexOf(string, startIndex);
_L3:
        return;
    }

    public static volatile int lastIndexOf$default(CharSequence charsequence, String s, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        if((j & 2) != 0)
            i = StringsKt.getLastIndex(charsequence);
        if((j & 4) != 0)
            flag = false;
        return StringsKt.lastIndexOf(charsequence, s, i, flag);
    }

    public static final boolean contains(CharSequence $receiver, CharSequence other, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return (other instanceof String) ? StringsKt.indexOf$default($receiver, (String)other, 0, ignoreCase, 2, null) >= 0 : indexOf$StringsKt__StringsKt$default($receiver, other, 0, $receiver.length(), ignoreCase, false, 16, null) >= 0;
    }

    public static volatile boolean contains$default(CharSequence charsequence, CharSequence charsequence1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: contains");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.contains(charsequence, charsequence1, flag);
    }

    public static final boolean contains(CharSequence $receiver, char char, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return StringsKt.indexOf$default($receiver, char, 0, ignoreCase, 2, null) >= 0;
    }

    public static volatile boolean contains$default(CharSequence charsequence, char c, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: contains");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.contains(charsequence, c, flag);
    }

    private static final boolean contains(CharSequence $receiver, Regex regex)
    {
        return regex.containsMatchIn($receiver);
    }

    private static final Sequence rangesDelimitedBy$StringsKt__StringsKt(CharSequence $receiver, char delimiters[], int startIndex, boolean ignoreCase, int limit)
    {
        boolean flag = limit >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Limit must be non-negative, but was ").append(limit).append(".").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return (Sequence)new DelimitedRangesSequence($receiver, startIndex, limit, (Function2)new Function2(delimiters, ignoreCase) {

                public volatile Object invoke(Object obj, Object obj1)
                {
                    return invoke((CharSequence)obj, ((Number)obj1).intValue());
                }

                public final Pair invoke(CharSequence $receiver, int startIndex)
                {
                    Pair pair1;
                    Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
                    pair1 = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($receiver, $delimiters, startIndex, $ignoreCase, false);
                    pair1;
                    if(pair1 == null) goto _L2; else goto _L1
_L1:
                    Pair pair;
                    pair;
                    Pair it = (Pair)pair;
                    (Pair)TuplesKt.to(it.getFirst(), Integer.valueOf(1));
                      goto _L3
_L2:
                    JVM INSTR pop ;
                    null;
_L3:
                    return;
                }

                final char $delimiters[];
                final boolean $ignoreCase;

            
            {
                $delimiters = ac;
                $ignoreCase = flag;
                super(2);
            }
            }
);
        }
    }

    static volatile Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charsequence, char ac[], int i, boolean flag, int j, int k, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rangesDelimitedBy$StringsKt__StringsKt");
        if((k & 2) != 0)
            i = 0;
        if((k & 4) != 0)
            flag = false;
        if((k & 8) != 0)
            j = 0;
        return rangesDelimitedBy$StringsKt__StringsKt(charsequence, ac, i, flag, j);
    }

    private static final Sequence rangesDelimitedBy$StringsKt__StringsKt(CharSequence $receiver, String delimiters[], int startIndex, boolean ignoreCase, int limit)
    {
        boolean flag = limit >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Limit must be non-negative, but was ").append(limit).append(".").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            List delimitersList = ArraysKt.asList((Object[])delimiters);
            return (Sequence)new DelimitedRangesSequence($receiver, startIndex, limit, (Function2)new Function2(delimitersList, ignoreCase) {

                public volatile Object invoke(Object obj, Object obj1)
                {
                    return invoke((CharSequence)obj, ((Number)obj1).intValue());
                }

                public final Pair invoke(CharSequence $receiver, int startIndex)
                {
                    Pair pair1;
                    Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
                    pair1 = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($receiver, (Collection)$delimitersList, startIndex, $ignoreCase, false);
                    pair1;
                    if(pair1 == null) goto _L2; else goto _L1
_L1:
                    Pair pair;
                    pair;
                    Pair it = (Pair)pair;
                    (Pair)TuplesKt.to(it.getFirst(), Integer.valueOf(((String)it.getSecond()).length()));
                      goto _L3
_L2:
                    JVM INSTR pop ;
                    null;
_L3:
                    return;
                }

                final List $delimitersList;
                final boolean $ignoreCase;

            
            {
                $delimitersList = list;
                $ignoreCase = flag;
                super(2);
            }
            }
);
        }
    }

    static volatile Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charsequence, String as[], int i, boolean flag, int j, int k, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rangesDelimitedBy$StringsKt__StringsKt");
        if((k & 2) != 0)
            i = 0;
        if((k & 4) != 0)
            flag = false;
        if((k & 8) != 0)
            j = 0;
        return rangesDelimitedBy$StringsKt__StringsKt(charsequence, as, i, flag, j);
    }

    public static final Sequence splitToSequence(CharSequence $receiver, String delimiters[], boolean ignoreCase, int limit)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiters, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default($receiver, delimiters, 0, ignoreCase, limit, 2, null), (Function1)new Function1($receiver) {

            public volatile Object invoke(Object obj)
            {
                return invoke((IntRange)obj);
            }

            public final String invoke(IntRange it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return StringsKt.substring(receiver$0, it);
            }

            final CharSequence receiver$0;

            
            {
                receiver$0 = charsequence;
                super(1);
            }
        }
);
    }

    public static volatile Sequence splitToSequence$default(CharSequence charsequence, String as[], boolean flag, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: splitToSequence");
        if((j & 2) != 0)
            flag = false;
        if((j & 4) != 0)
            i = 0;
        return StringsKt.splitToSequence(charsequence, as, flag, i);
    }

    public static final List split(CharSequence $receiver, String delimiters[], boolean ignoreCase, int limit)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiters, "delimiters");
        Iterable $receiver$iv = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default($receiver, delimiters, 0, ignoreCase, limit, 2, null));
        Iterable iterable = $receiver$iv;
        Collection destination$iv$iv = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10));
        Collection collection;
        String s;
        for(Iterator iterator1 = iterable.iterator(); iterator1.hasNext(); collection.add(s))
        {
            Object item$iv$iv = iterator1.next();
            IntRange it = (IntRange)item$iv$iv;
            collection = destination$iv$iv;
            s = StringsKt.substring($receiver, it);
        }

        return (List)destination$iv$iv;
    }

    public static volatile List split$default(CharSequence charsequence, String as[], boolean flag, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: split");
        if((j & 2) != 0)
            flag = false;
        if((j & 4) != 0)
            i = 0;
        return StringsKt.split(charsequence, as, flag, i);
    }

    public static final Sequence splitToSequence(CharSequence $receiver, char delimiters[], boolean ignoreCase, int limit)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiters, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default($receiver, delimiters, 0, ignoreCase, limit, 2, null), (Function1)new Function1($receiver) {

            public volatile Object invoke(Object obj)
            {
                return invoke((IntRange)obj);
            }

            public final String invoke(IntRange it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return StringsKt.substring(receiver$0, it);
            }

            final CharSequence receiver$0;

            
            {
                receiver$0 = charsequence;
                super(1);
            }
        }
);
    }

    public static volatile Sequence splitToSequence$default(CharSequence charsequence, char ac[], boolean flag, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: splitToSequence");
        if((j & 2) != 0)
            flag = false;
        if((j & 4) != 0)
            i = 0;
        return StringsKt.splitToSequence(charsequence, ac, flag, i);
    }

    public static final List split(CharSequence $receiver, char delimiters[], boolean ignoreCase, int limit)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(delimiters, "delimiters");
        Iterable $receiver$iv = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default($receiver, delimiters, 0, ignoreCase, limit, 2, null));
        Iterable iterable = $receiver$iv;
        Collection destination$iv$iv = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10));
        Collection collection;
        String s;
        for(Iterator iterator1 = iterable.iterator(); iterator1.hasNext(); collection.add(s))
        {
            Object item$iv$iv = iterator1.next();
            IntRange it = (IntRange)item$iv$iv;
            collection = destination$iv$iv;
            s = StringsKt.substring($receiver, it);
        }

        return (List)destination$iv$iv;
    }

    public static volatile List split$default(CharSequence charsequence, char ac[], boolean flag, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: split");
        if((j & 2) != 0)
            flag = false;
        if((j & 4) != 0)
            i = 0;
        return StringsKt.split(charsequence, ac, flag, i);
    }

    private static final List split(CharSequence $receiver, Regex regex, int limit)
    {
        return regex.split($receiver, limit);
    }

    static volatile List split$default(CharSequence $receiver, Regex regex, int limit, int $i$f$split, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: split");
        if(($i$f$split & 2) != 0)
            limit = 0;
        return regex.split($receiver, limit);
    }

    public static final Sequence lineSequence(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return StringsKt.splitToSequence$default($receiver, new String[] {
            "\r\n", "\n", "\r"
        }, false, 0, 6, null);
    }

    public static final List lines(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return SequencesKt.toList(StringsKt.lineSequence($receiver));
    }

    public StringsKt__StringsKt()
    {
    }


}
