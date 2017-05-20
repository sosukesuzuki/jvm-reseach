// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   _Strings.kt

package kotlin.text;

import java.util.*;
import kotlin.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.*;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.text:
//            StringsKt__StringsKt, StringsKt

class StringsKt___StringsKt extends StringsKt__StringsKt
{

    private static final char elementAt(CharSequence $receiver, int index)
    {
        return $receiver.charAt(index);
    }

    private static final char elementAtOrElse(CharSequence $receiver, int index, Function1 defaultValue)
    {
        return index < 0 || index > StringsKt.getLastIndex($receiver) ? ((Character)defaultValue.invoke(Integer.valueOf(index))).charValue() : $receiver.charAt(index);
    }

    private static final Character elementAtOrNull(CharSequence $receiver, int index)
    {
        return StringsKt.getOrNull($receiver, index);
    }

    private static final Character find(CharSequence $receiver, Function1 predicate)
    {
        CharIterator chariterator;
        CharSequence charsequence = $receiver;
        chariterator = StringsKt.iterator(charsequence);
_L4:
        if(!chariterator.hasNext()) goto _L2; else goto _L1
_L1:
        char element$iv = chariterator.nextChar();
        if(!((Boolean)predicate.invoke(Character.valueOf(element$iv))).booleanValue()) goto _L4; else goto _L3
_L3:
        Character.valueOf(element$iv);
          goto _L5
_L2:
        (Character)null;
_L5:
        return;
    }

    private static final Character findLast(CharSequence $receiver, Function1 predicate)
    {
        CharSequence $receiver$iv;
        int index$iv;
        int i;
        int j;
        IntProgression intprogression;
        $receiver$iv = $receiver;
        intprogression = RangesKt.reversed((IntProgression)StringsKt.getIndices($receiver$iv));
        index$iv = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        index$iv;
        i;
        if(j <= 0) goto _L2; else goto _L1
_L1:
        JVM INSTR icmpgt 103;
           goto _L3 _L4
_L2:
        JVM INSTR icmplt 103;
           goto _L3 _L4
_L3:
        char element$iv = $receiver$iv.charAt(index$iv);
        if(!((Boolean)predicate.invoke(Character.valueOf(element$iv))).booleanValue()) goto _L6; else goto _L5
_L5:
        Character.valueOf(element$iv);
          goto _L7
_L6:
        if(index$iv == i)
            break; /* Loop/switch isn't completed */
        index$iv += j;
        if(true) goto _L3; else goto _L4
_L4:
        (Character)null;
_L7:
        return;
    }

    public static final char first(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            throw (Throwable)new NoSuchElementException("Char sequence is empty.");
        else
            return $receiver.charAt(0);
    }

    public static final char first(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                return element;
        }

        throw (Throwable)new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final Character firstOrNull(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharSequence charsequence = $receiver;
        return (charsequence.length() != 0) ? Character.valueOf($receiver.charAt(0)) : (Character)null;
    }

    public static final Character firstOrNull(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                return Character.valueOf(element);
        }

        return (Character)null;
    }

    private static final char getOrElse(CharSequence $receiver, int index, Function1 defaultValue)
    {
        return index < 0 || index > StringsKt.getLastIndex($receiver) ? ((Character)defaultValue.invoke(Integer.valueOf(index))).charValue() : $receiver.charAt(index);
    }

    public static final Character getOrNull(CharSequence $receiver, int index)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return index < 0 || index > StringsKt.getLastIndex($receiver) ? (Character)null : Character.valueOf($receiver.charAt(index));
    }

    public static final int indexOfFirst(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        IntRange intrange = StringsKt.getIndices($receiver);
        int index = intrange.getFirst();
        int i = intrange.getLast();
        if(index <= i)
            do
            {
                if(((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
                    return index;
                if(index == i)
                    break;
                index++;
            } while(true);
        return -1;
    }

    public static final int indexOfLast(CharSequence $receiver, Function1 predicate)
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
        JVM INSTR icmpgt 96;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_55;
_L2:
        break MISSING_BLOCK_LABEL_96;
        JVM INSTR icmplt 96;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_55;
_L4:
        break MISSING_BLOCK_LABEL_96;
        do
        {
            if(((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
                return index;
            if(index == i)
                break;
            index += j;
        } while(true);
        return -1;
    }

    public static final char last(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            throw (Throwable)new NoSuchElementException("Char sequence is empty.");
        else
            return $receiver.charAt(StringsKt.getLastIndex($receiver));
    }

    public static final char last(CharSequence $receiver, Function1 predicate)
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
        JVM INSTR icmpgt 101;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_55;
_L2:
        break MISSING_BLOCK_LABEL_101;
        JVM INSTR icmplt 101;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_55;
_L4:
        break MISSING_BLOCK_LABEL_101;
        do
        {
            char element = $receiver.charAt(index);
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                return element;
            if(index == i)
                break;
            index += j;
        } while(true);
        throw (Throwable)new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final Character lastOrNull(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharSequence charsequence = $receiver;
        return (charsequence.length() != 0) ? Character.valueOf($receiver.charAt($receiver.length() - 1)) : (Character)null;
    }

    public static final Character lastOrNull(CharSequence $receiver, Function1 predicate)
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
        JVM INSTR icmpgt 104;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_55;
_L2:
        break MISSING_BLOCK_LABEL_104;
        JVM INSTR icmplt 104;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_55;
_L4:
        break MISSING_BLOCK_LABEL_104;
        do
        {
            char element = $receiver.charAt(index);
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                return Character.valueOf(element);
            if(index == i)
                break;
            index += j;
        } while(true);
        return (Character)null;
    }

    public static final char single(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        switch($receiver.length())
        {
        case 0: // '\0'
            throw (Throwable)new NoSuchElementException("Char sequence is empty.");

        case 1: // '\001'
            return $receiver.charAt(0);
        }
        throw (Throwable)new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final char single(CharSequence $receiver, Function1 predicate)
    {
        Character single;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        single = (Character)null;
        boolean found = false;
        CharIterator chariterator = StringsKt.iterator($receiver);
        do
        {
            if(!chariterator.hasNext())
                break;
            char element = chariterator.nextChar();
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
            {
                if(found)
                    throw (Throwable)new IllegalArgumentException("Char sequence contains more than one matching element.");
                single = Character.valueOf(element);
                found = true;
            }
        } while(true);
        if(!found)
            throw (Throwable)new NoSuchElementException("Char sequence contains no character matching the predicate.");
        single;
        if(single == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Char");
        (Character);
        charValue();
        return;
    }

    public static final Character singleOrNull(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return $receiver.length() != 1 ? (Character)null : Character.valueOf($receiver.charAt(0));
    }

    public static final Character singleOrNull(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        Character single = (Character)null;
        boolean found = false;
        CharIterator chariterator = StringsKt.iterator($receiver);
        do
        {
            if(!chariterator.hasNext())
                break;
            char element = chariterator.nextChar();
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
            {
                if(found)
                    return (Character)null;
                single = Character.valueOf(element);
                found = true;
            }
        } while(true);
        if(!found)
            return (Character)null;
        else
            return single;
    }

    public static final CharSequence drop(CharSequence $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested character count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return $receiver.subSequence(RangesKt.coerceAtMost(n, $receiver.length()), $receiver.length());
        }
    }

    public static final String drop(String $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s1 = (new StringBuilder()).append("Requested character count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s1.toString());
        }
        String s = $receiver;
        int i = RangesKt.coerceAtMost(n, $receiver.length());
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s2 = ((String)s).substring(i);
        Intrinsics.checkExpressionValueIsNotNull(s2, "(this as java.lang.String).substring(startIndex)");
        return s2;
    }

    public static final CharSequence dropLast(CharSequence $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested character count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return StringsKt.take($receiver, RangesKt.coerceAtLeast($receiver.length() - n, 0));
        }
    }

    public static final String dropLast(String $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested character count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return StringsKt.take($receiver, RangesKt.coerceAtLeast($receiver.length() - n, 0));
        }
    }

    public static final CharSequence dropLastWhile(CharSequence $receiver, Function1 predicate)
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
        JVM INSTR icmpgt 105;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_55;
_L2:
        break MISSING_BLOCK_LABEL_105;
        JVM INSTR icmplt 105;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_55;
_L4:
        break MISSING_BLOCK_LABEL_105;
        do
        {
            if(!((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
                return $receiver.subSequence(0, index + 1);
            if(index == i)
                break;
            index += j;
        } while(true);
        return (CharSequence)"";
    }

    public static final String dropLastWhile(String $receiver, Function1 predicate)
    {
        int index;
        int i;
        int j;
        IntProgression intprogression;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        intprogression = RangesKt.reversed((IntProgression)StringsKt.getIndices((CharSequence)$receiver));
        index = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        index;
        i;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_55;
        JVM INSTR icmpgt 140;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_58;
_L2:
        break MISSING_BLOCK_LABEL_140;
        JVM INSTR icmplt 140;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_58;
_L4:
        break MISSING_BLOCK_LABEL_140;
        String s1;
        do
        {
            if(!((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
            {
                String s = $receiver;
                int k = 0;
                int l = index + 1;
                if(s == null)
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                s1 = ((String)s).substring(k, l);
                Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                return s1;
            }
            if(index == i)
                break;
            index += j;
        } while(true);
        return "";
    }

    public static final CharSequence dropWhile(CharSequence $receiver, Function1 predicate)
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

    public static final String dropWhile(String $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        IntRange intrange = StringsKt.getIndices((CharSequence)$receiver);
        int index = intrange.getFirst();
        int i = intrange.getLast();
        String s1;
        if(index <= i)
            do
            {
                if(!((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
                {
                    String s = $receiver;
                    if(s == null)
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    s1 = ((String)s).substring(index);
                    Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.String).substring(startIndex)");
                    return s1;
                }
                if(index == i)
                    break;
                index++;
            } while(true);
        return "";
    }

    public static final CharSequence filter(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        CharSequence $receiver$iv = $receiver;
        Appendable destination$iv = (Appendable)new StringBuilder();
        int index$iv = 0;
        int i = $receiver$iv.length() - 1;
        if(index$iv <= i)
            do
            {
                char element$iv = $receiver$iv.charAt(index$iv);
                if(((Boolean)predicate.invoke(Character.valueOf(element$iv))).booleanValue())
                    destination$iv.append(element$iv);
                if(index$iv == i)
                    break;
                index$iv++;
            } while(true);
        return (CharSequence)destination$iv;
    }

    public static final String filter(String $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        CharSequence $receiver$iv = (CharSequence)$receiver;
        Appendable destination$iv = (Appendable)new StringBuilder();
        int index$iv = 0;
        int i = $receiver$iv.length() - 1;
        if(index$iv <= i)
            do
            {
                char element$iv = $receiver$iv.charAt(index$iv);
                if(((Boolean)predicate.invoke(Character.valueOf(element$iv))).booleanValue())
                    destination$iv.append(element$iv);
                if(index$iv == i)
                    break;
                index$iv++;
            } while(true);
        String s = ((StringBuilder)destination$iv).toString();
        Intrinsics.checkExpressionValueIsNotNull(s, "filterTo(StringBuilder(), predicate).toString()");
        return s;
    }

    public static final CharSequence filterIndexed(CharSequence $receiver, Function2 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        CharSequence charsequence = $receiver;
        Appendable destination$iv = (Appendable)new StringBuilder();
        CharSequence $receiver$iv$iv = charsequence;
        int index$iv$iv = 0;
        for(CharIterator chariterator = StringsKt.iterator($receiver$iv$iv); chariterator.hasNext();)
        {
            char item$iv$iv = chariterator.nextChar();
            char element$iv = item$iv$iv;
            int index$iv = index$iv$iv++;
            if(((Boolean)predicate.invoke(Integer.valueOf(index$iv), Character.valueOf(element$iv))).booleanValue())
                destination$iv.append(element$iv);
        }

        return (CharSequence)destination$iv;
    }

    public static final String filterIndexed(String $receiver, Function2 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        CharSequence charsequence = (CharSequence)$receiver;
        Appendable destination$iv = (Appendable)new StringBuilder();
        CharSequence $receiver$iv$iv = charsequence;
        int index$iv$iv = 0;
        for(CharIterator chariterator = StringsKt.iterator($receiver$iv$iv); chariterator.hasNext();)
        {
            char item$iv$iv = chariterator.nextChar();
            char element$iv = item$iv$iv;
            int index$iv = index$iv$iv++;
            if(((Boolean)predicate.invoke(Integer.valueOf(index$iv), Character.valueOf(element$iv))).booleanValue())
                destination$iv.append(element$iv);
        }

        String s = ((StringBuilder)destination$iv).toString();
        Intrinsics.checkExpressionValueIsNotNull(s, "filterIndexedTo(StringBu\u2026(), predicate).toString()");
        return s;
    }

    public static final Appendable filterIndexedTo(CharSequence $receiver, Appendable destination, Function2 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        CharSequence $receiver$iv = $receiver;
        int index$iv = 0;
        for(CharIterator chariterator = StringsKt.iterator($receiver$iv); chariterator.hasNext();)
        {
            char item$iv = chariterator.nextChar();
            char element = item$iv;
            int index = index$iv++;
            if(((Boolean)predicate.invoke(Integer.valueOf(index), Character.valueOf(element))).booleanValue())
                destination.append(element);
        }

        return destination;
    }

    public static final CharSequence filterNot(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        CharSequence charsequence = $receiver;
        Appendable destination$iv = (Appendable)new StringBuilder();
        CharIterator chariterator = StringsKt.iterator(charsequence);
        do
        {
            if(!chariterator.hasNext())
                break;
            char element$iv = chariterator.nextChar();
            if(!((Boolean)predicate.invoke(Character.valueOf(element$iv))).booleanValue())
                destination$iv.append(element$iv);
        } while(true);
        return (CharSequence)destination$iv;
    }

    public static final String filterNot(String $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        CharSequence charsequence = (CharSequence)$receiver;
        Appendable destination$iv = (Appendable)new StringBuilder();
        CharIterator chariterator = StringsKt.iterator(charsequence);
        do
        {
            if(!chariterator.hasNext())
                break;
            char element$iv = chariterator.nextChar();
            if(!((Boolean)predicate.invoke(Character.valueOf(element$iv))).booleanValue())
                destination$iv.append(element$iv);
        } while(true);
        String s = ((StringBuilder)destination$iv).toString();
        Intrinsics.checkExpressionValueIsNotNull(s, "filterNotTo(StringBuilder(), predicate).toString()");
        return s;
    }

    public static final Appendable filterNotTo(CharSequence $receiver, Appendable destination, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        CharIterator chariterator = StringsKt.iterator($receiver);
        do
        {
            if(!chariterator.hasNext())
                break;
            char element = chariterator.nextChar();
            if(!((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                destination.append(element);
        } while(true);
        return destination;
    }

    public static final Appendable filterTo(CharSequence $receiver, Appendable destination, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int index = 0;
        int i = $receiver.length() - 1;
        if(index <= i)
            do
            {
                char element = $receiver.charAt(index);
                if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                    destination.append(element);
                if(index == i)
                    break;
                index++;
            } while(true);
        return destination;
    }

    public static final CharSequence slice(CharSequence $receiver, IntRange indices)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(indices, "indices");
        if(indices.isEmpty())
            return (CharSequence)"";
        else
            return StringsKt.subSequence($receiver, indices);
    }

    public static final String slice(String $receiver, IntRange indices)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(indices, "indices");
        if(indices.isEmpty())
            return "";
        else
            return StringsKt.substring($receiver, indices);
    }

    public static final CharSequence slice(CharSequence $receiver, Iterable indices)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(indices, "indices");
        int size = CollectionsKt.collectionSizeOrDefault(indices, 10);
        if(size == 0)
            return (CharSequence)"";
        StringBuilder result = new StringBuilder(size);
        int i;
        for(Iterator iterator = indices.iterator(); iterator.hasNext(); result.append($receiver.charAt(i)))
            i = ((Number)iterator.next()).intValue();

        return (CharSequence)result;
    }

    private static final String slice(String $receiver, Iterable indices)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.slice((CharSequence)$receiver, indices).toString();
    }

    public static final CharSequence take(CharSequence $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested character count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return $receiver.subSequence(0, RangesKt.coerceAtMost(n, $receiver.length()));
        }
    }

    public static final String take(String $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s1 = (new StringBuilder()).append("Requested character count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s1.toString());
        }
        String s = $receiver;
        int i = 0;
        int j = RangesKt.coerceAtMost(n, $receiver.length());
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s2 = ((String)s).substring(i, j);
        Intrinsics.checkExpressionValueIsNotNull(s2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return s2;
    }

    public static final CharSequence takeLast(CharSequence $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Requested character count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            int length = $receiver.length();
            return $receiver.subSequence(length - RangesKt.coerceAtMost(n, length), length);
        }
    }

    public static final String takeLast(String $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s1 = (new StringBuilder()).append("Requested character count ").append(n).append(" is less than zero.").toString();
            throw (Throwable)new IllegalArgumentException(s1.toString());
        }
        int length = $receiver.length();
        String s = $receiver;
        int i = length - RangesKt.coerceAtMost(n, length);
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s2 = ((String)s).substring(i);
        Intrinsics.checkExpressionValueIsNotNull(s2, "(this as java.lang.String).substring(startIndex)");
        return s2;
    }

    public static final CharSequence takeLastWhile(CharSequence $receiver, Function1 predicate)
    {
        int index;
        int i;
        int j;
        IntProgression intprogression;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        intprogression = RangesKt.downTo(StringsKt.getLastIndex($receiver), 0);
        index = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        index;
        i;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_50;
        JVM INSTR icmpgt 108;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_53;
_L2:
        break MISSING_BLOCK_LABEL_108;
        JVM INSTR icmplt 108;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_53;
_L4:
        break MISSING_BLOCK_LABEL_108;
        do
        {
            if(!((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
                return $receiver.subSequence(index + 1, $receiver.length());
            if(index == i)
                break;
            index += j;
        } while(true);
        return $receiver.subSequence(0, $receiver.length());
    }

    public static final String takeLastWhile(String $receiver, Function1 predicate)
    {
        int index;
        int i;
        int j;
        IntProgression intprogression;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        intprogression = RangesKt.downTo(StringsKt.getLastIndex((CharSequence)$receiver), 0);
        index = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        index;
        i;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_53;
        JVM INSTR icmpgt 133;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_56;
_L2:
        break MISSING_BLOCK_LABEL_133;
        JVM INSTR icmplt 133;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_56;
_L4:
        break MISSING_BLOCK_LABEL_133;
        String s1;
        do
        {
            if(!((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
            {
                String s = $receiver;
                int k = index + 1;
                if(s == null)
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                s1 = ((String)s).substring(k);
                Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.String).substring(startIndex)");
                return s1;
            }
            if(index == i)
                break;
            index += j;
        } while(true);
        return $receiver;
    }

    public static final CharSequence takeWhile(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int index = 0;
        int i = $receiver.length() - 1;
        if(index <= i)
            do
            {
                if(!((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
                    return $receiver.subSequence(0, index);
                if(index == i)
                    break;
                index++;
            } while(true);
        return $receiver.subSequence(0, $receiver.length());
    }

    public static final String takeWhile(String $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int index = 0;
        int i = $receiver.length() - 1;
        String s1;
        if(index <= i)
            do
            {
                if(!((Boolean)predicate.invoke(Character.valueOf($receiver.charAt(index)))).booleanValue())
                {
                    String s = $receiver;
                    int j = 0;
                    if(s == null)
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    s1 = ((String)s).substring(j, index);
                    Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    return s1;
                }
                if(index == i)
                    break;
                index++;
            } while(true);
        return $receiver;
    }

    public static final CharSequence reversed(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharSequence charsequence = (CharSequence)(new StringBuilder($receiver)).reverse();
        Intrinsics.checkExpressionValueIsNotNull(charsequence, "StringBuilder(this).reverse()");
        return charsequence;
    }

    private static final String reversed(String $receiver)
    {
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        (CharSequence);
        StringsKt.reversed();
        toString();
        return;
    }

    public static final Map associate(CharSequence $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity($receiver.length()), 16);
        CharSequence charsequence = $receiver;
        Map destination$iv = (Map)new LinkedHashMap(capacity);
        Map map1;
        Pair pair;
        for(CharIterator chariterator = StringsKt.iterator(charsequence); chariterator.hasNext(); map1.put(pair.getFirst(), pair.getSecond()))
        {
            char element$iv = chariterator.nextChar();
            map1 = destination$iv;
            pair = (Pair)transform.invoke(Character.valueOf(element$iv));
        }

        return destination$iv;
    }

    public static final Map associateBy(CharSequence $receiver, Function1 keySelector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity($receiver.length()), 16);
        CharSequence charsequence = $receiver;
        Map destination$iv = (Map)new LinkedHashMap(capacity);
        char element$iv;
        for(CharIterator chariterator = StringsKt.iterator(charsequence); chariterator.hasNext(); destination$iv.put(keySelector.invoke(Character.valueOf(element$iv)), Character.valueOf(element$iv)))
            element$iv = chariterator.nextChar();

        return destination$iv;
    }

    public static final Map associateBy(CharSequence $receiver, Function1 keySelector, Function1 valueTransform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        int capacity = RangesKt.coerceAtLeast(MapsKt.mapCapacity($receiver.length()), 16);
        CharSequence charsequence = $receiver;
        Map destination$iv = (Map)new LinkedHashMap(capacity);
        char element$iv;
        for(CharIterator chariterator = StringsKt.iterator(charsequence); chariterator.hasNext(); destination$iv.put(keySelector.invoke(Character.valueOf(element$iv)), valueTransform.invoke(Character.valueOf(element$iv))))
            element$iv = chariterator.nextChar();

        return destination$iv;
    }

    public static final Map associateByTo(CharSequence $receiver, Map destination, Function1 keySelector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        char element;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext(); destination.put(keySelector.invoke(Character.valueOf(element)), Character.valueOf(element)))
            element = chariterator.nextChar();

        return destination;
    }

    public static final Map associateByTo(CharSequence $receiver, Map destination, Function1 keySelector, Function1 valueTransform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        char element;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext(); destination.put(keySelector.invoke(Character.valueOf(element)), valueTransform.invoke(Character.valueOf(element))))
            element = chariterator.nextChar();

        return destination;
    }

    public static final Map associateTo(CharSequence $receiver, Map destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Map map1;
        Pair pair;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext(); map1.put(pair.getFirst(), pair.getSecond()))
        {
            char element = chariterator.nextChar();
            map1 = destination;
            pair = (Pair)transform.invoke(Character.valueOf(element));
        }

        return destination;
    }

    public static final Collection toCollection(CharSequence $receiver, Collection destination)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        char item;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext(); destination.add(Character.valueOf(item)))
            item = chariterator.nextChar();

        return destination;
    }

    public static final HashSet toHashSet(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (HashSet)StringsKt.toCollection($receiver, (Collection)new HashSet(MapsKt.mapCapacity($receiver.length())));
    }

    public static final List toList(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        List list;
        switch($receiver.length())
        {
        case 0: // '\0'
            list = CollectionsKt.emptyList();
            break;

        case 1: // '\001'
            list = CollectionsKt.listOf(Character.valueOf($receiver.charAt(0)));
            break;

        default:
            list = StringsKt.toMutableList($receiver);
            break;
        }
        return list;
    }

    public static final List toMutableList(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (List)StringsKt.toCollection($receiver, (Collection)new ArrayList($receiver.length()));
    }

    public static final Set toSet(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Set set;
        switch($receiver.length())
        {
        case 0: // '\0'
            set = SetsKt.emptySet();
            break;

        case 1: // '\001'
            set = SetsKt.setOf(Character.valueOf($receiver.charAt(0)));
            break;

        default:
            set = (Set)StringsKt.toCollection($receiver, (Collection)new LinkedHashSet(MapsKt.mapCapacity($receiver.length())));
            break;
        }
        return set;
    }

    public static final SortedSet toSortedSet(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (SortedSet)StringsKt.toCollection($receiver, (Collection)new TreeSet());
    }

    public static final List flatMap(CharSequence $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        CharSequence charsequence = $receiver;
        Collection destination$iv = (Collection)new ArrayList();
        Iterable list$iv;
        for(CharIterator chariterator = StringsKt.iterator(charsequence); chariterator.hasNext(); CollectionsKt.addAll(destination$iv, list$iv))
        {
            char element$iv = chariterator.nextChar();
            list$iv = (Iterable)transform.invoke(Character.valueOf(element$iv));
        }

        return (List)destination$iv;
    }

    public static final Collection flatMapTo(CharSequence $receiver, Collection destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        Iterable list;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext(); CollectionsKt.addAll(destination, list))
        {
            char element = chariterator.nextChar();
            list = (Iterable)transform.invoke(Character.valueOf(element));
        }

        return destination;
    }

    public static final Map groupBy(CharSequence $receiver, Function1 keySelector)
    {
        Map destination$iv;
        CharIterator chariterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        CharSequence charsequence = $receiver;
        destination$iv = (Map)new LinkedHashMap();
        chariterator = StringsKt.iterator(charsequence);
_L5:
        char element$iv;
        Object key$iv;
        Map $receiver$iv$iv;
        Object value$iv$iv;
        if(!chariterator.hasNext())
            break; /* Loop/switch isn't completed */
        element$iv = chariterator.nextChar();
        key$iv = keySelector.invoke(Character.valueOf(element$iv));
        $receiver$iv$iv = destination$iv;
        value$iv$iv = $receiver$iv$iv.get(key$iv);
        if(value$iv$iv != null) goto _L2; else goto _L1
_L1:
        Object answer$iv$iv;
        answer$iv$iv = new ArrayList();
        $receiver$iv$iv.put(key$iv, answer$iv$iv);
        answer$iv$iv;
          goto _L3
_L2:
        value$iv$iv;
_L3:
        (List);
        List list$iv;
        list$iv;
        list$iv.add(Character.valueOf(element$iv));
        if(true) goto _L5; else goto _L4
_L4:
        return destination$iv;
    }

    public static final Map groupBy(CharSequence $receiver, Function1 keySelector, Function1 valueTransform)
    {
        Map destination$iv;
        CharIterator chariterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        CharSequence charsequence = $receiver;
        destination$iv = (Map)new LinkedHashMap();
        chariterator = StringsKt.iterator(charsequence);
_L5:
        char element$iv;
        Object key$iv;
        Map $receiver$iv$iv;
        Object value$iv$iv;
        if(!chariterator.hasNext())
            break; /* Loop/switch isn't completed */
        element$iv = chariterator.nextChar();
        key$iv = keySelector.invoke(Character.valueOf(element$iv));
        $receiver$iv$iv = destination$iv;
        value$iv$iv = $receiver$iv$iv.get(key$iv);
        if(value$iv$iv != null) goto _L2; else goto _L1
_L1:
        Object answer$iv$iv;
        answer$iv$iv = new ArrayList();
        $receiver$iv$iv.put(key$iv, answer$iv$iv);
        answer$iv$iv;
          goto _L3
_L2:
        value$iv$iv;
_L3:
        (List);
        List list$iv;
        list$iv;
        list$iv.add(valueTransform.invoke(Character.valueOf(element$iv)));
        if(true) goto _L5; else goto _L4
_L4:
        return destination$iv;
    }

    public static final Map groupByTo(CharSequence $receiver, Map destination, Function1 keySelector)
    {
        CharIterator chariterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        chariterator = StringsKt.iterator($receiver);
_L5:
        char element;
        Object key;
        Map $receiver$iv;
        Object value$iv;
        if(!chariterator.hasNext())
            break; /* Loop/switch isn't completed */
        element = chariterator.nextChar();
        key = keySelector.invoke(Character.valueOf(element));
        $receiver$iv = destination;
        value$iv = $receiver$iv.get(key);
        if(value$iv != null) goto _L2; else goto _L1
_L1:
        Object answer$iv;
        answer$iv = new ArrayList();
        $receiver$iv.put(key, answer$iv);
        answer$iv;
          goto _L3
_L2:
        value$iv;
_L3:
        (List);
        List list;
        list;
        list.add(Character.valueOf(element));
        if(true) goto _L5; else goto _L4
_L4:
        return destination;
    }

    public static final Map groupByTo(CharSequence $receiver, Map destination, Function1 keySelector, Function1 valueTransform)
    {
        CharIterator chariterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        Intrinsics.checkParameterIsNotNull(valueTransform, "valueTransform");
        chariterator = StringsKt.iterator($receiver);
_L5:
        char element;
        Object key;
        Map $receiver$iv;
        Object value$iv;
        if(!chariterator.hasNext())
            break; /* Loop/switch isn't completed */
        element = chariterator.nextChar();
        key = keySelector.invoke(Character.valueOf(element));
        $receiver$iv = destination;
        value$iv = $receiver$iv.get(key);
        if(value$iv != null) goto _L2; else goto _L1
_L1:
        Object answer$iv;
        answer$iv = new ArrayList();
        $receiver$iv.put(key, answer$iv);
        answer$iv;
          goto _L3
_L2:
        value$iv;
_L3:
        (List);
        List list;
        list;
        list.add(valueTransform.invoke(Character.valueOf(element)));
        if(true) goto _L5; else goto _L4
_L4:
        return destination;
    }

    public static final List map(CharSequence $receiver, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        CharSequence charsequence = $receiver;
        Collection destination$iv = (Collection)new ArrayList($receiver.length());
        char item$iv;
        for(CharIterator chariterator = StringsKt.iterator(charsequence); chariterator.hasNext(); destination$iv.add(transform.invoke(Character.valueOf(item$iv))))
            item$iv = chariterator.nextChar();

        return (List)destination$iv;
    }

    public static final List mapIndexed(CharSequence $receiver, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        CharSequence $receiver$iv = $receiver;
        Collection destination$iv = (Collection)new ArrayList($receiver.length());
        int index$iv = 0;
        char item$iv;
        for(CharIterator chariterator = StringsKt.iterator($receiver$iv); chariterator.hasNext(); destination$iv.add(transform.invoke(Integer.valueOf(index$iv), Character.valueOf(item$iv))))
        {
            item$iv = chariterator.nextChar();
            index$iv++;
        }

        return (List)destination$iv;
    }

    public static final List mapIndexedNotNull(CharSequence $receiver, Function2 transform)
    {
        Collection destination$iv;
        int index$iv$iv;
        CharIterator chariterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        CharSequence charsequence = $receiver;
        destination$iv = (Collection)new ArrayList();
        CharSequence $receiver$iv$iv = charsequence;
        index$iv$iv = 0;
        chariterator = StringsKt.iterator($receiver$iv$iv);
_L3:
        if(!chariterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        char item$iv$iv = chariterator.nextChar();
        char element$iv = item$iv$iv;
        int index$iv = index$iv$iv++;
        obj1 = transform.invoke(Integer.valueOf(index$iv), Character.valueOf(element$iv));
        obj1;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_109;
        Object obj;
        obj;
        Object it$iv = obj;
        destination$iv.add(it$iv);
        continue; /* Loop/switch isn't completed */
        JVM INSTR pop ;
          goto _L3
_L2:
        return (List)destination$iv;
    }

    public static final Collection mapIndexedNotNullTo(CharSequence $receiver, Collection destination, Function2 transform)
    {
        int index$iv;
        CharIterator chariterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        CharSequence $receiver$iv = $receiver;
        index$iv = 0;
        chariterator = StringsKt.iterator($receiver$iv);
_L3:
        if(!chariterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        char item$iv = chariterator.nextChar();
        char element = item$iv;
        int index = index$iv++;
        obj1 = transform.invoke(Integer.valueOf(index), Character.valueOf(element));
        obj1;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_100;
        Object obj;
        obj;
        Object it = obj;
        destination.add(it);
        continue; /* Loop/switch isn't completed */
        JVM INSTR pop ;
          goto _L3
_L2:
        return destination;
    }

    public static final Collection mapIndexedTo(CharSequence $receiver, Collection destination, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        int index = 0;
        char item;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext(); destination.add(transform.invoke(Integer.valueOf(index), Character.valueOf(item))))
        {
            item = chariterator.nextChar();
            index++;
        }

        return destination;
    }

    public static final List mapNotNull(CharSequence $receiver, Function1 transform)
    {
        Collection destination$iv;
        CharIterator chariterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        CharSequence charsequence = $receiver;
        destination$iv = (Collection)new ArrayList();
        CharSequence charsequence1 = charsequence;
        chariterator = StringsKt.iterator(charsequence1);
_L3:
        if(!chariterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        char element$iv$iv = chariterator.nextChar();
        char element$iv = element$iv$iv;
        obj1 = transform.invoke(Character.valueOf(element$iv));
        obj1;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_94;
        Object obj;
        obj;
        Object it$iv = obj;
        destination$iv.add(it$iv);
        continue; /* Loop/switch isn't completed */
        JVM INSTR pop ;
          goto _L3
_L2:
        return (List)destination$iv;
    }

    public static final Collection mapNotNullTo(CharSequence $receiver, Collection destination, Function1 transform)
    {
        CharIterator chariterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        CharSequence charsequence = $receiver;
        chariterator = StringsKt.iterator(charsequence);
_L3:
        if(!chariterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        char element$iv = chariterator.nextChar();
        char element = element$iv;
        obj1 = transform.invoke(Character.valueOf(element));
        obj1;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_85;
        Object obj;
        obj;
        Object it = obj;
        destination.add(it);
        continue; /* Loop/switch isn't completed */
        JVM INSTR pop ;
          goto _L3
_L2:
        return destination;
    }

    public static final Collection mapTo(CharSequence $receiver, Collection destination, Function1 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        char item;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext(); destination.add(transform.invoke(Character.valueOf(item))))
            item = chariterator.nextChar();

        return destination;
    }

    public static final Iterable withIndex(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (Iterable)new IndexingIterable((Function0)new Function0($receiver) {

            public volatile Object invoke()
            {
                return invoke();
            }

            public final CharIterator invoke()
            {
                return StringsKt.iterator(receiver$0);
            }

            final CharSequence receiver$0;

            
            {
                receiver$0 = charsequence;
                super(0);
            }
        }
);
    }

    public static final boolean all(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            if(!((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                return false;
        }

        return true;
    }

    public static final boolean any(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharIterator chariterator = StringsKt.iterator($receiver);
        if(chariterator.hasNext())
        {
            char element = chariterator.nextChar();
            return true;
        } else
        {
            return false;
        }
    }

    public static final boolean any(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                return true;
        }

        return false;
    }

    private static final int count(CharSequence $receiver)
    {
        return $receiver.length();
    }

    public static final int count(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        int count = 0;
        CharIterator chariterator = StringsKt.iterator($receiver);
        do
        {
            if(!chariterator.hasNext())
                break;
            char element = chariterator.nextChar();
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                count++;
        } while(true);
        return count;
    }

    public static final Object fold(CharSequence $receiver, Object initial, Function2 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        Object accumulator = initial;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            accumulator = operation.invoke(accumulator, Character.valueOf(element));
        }

        return accumulator;
    }

    public static final Object foldIndexed(CharSequence $receiver, Object initial, Function3 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = 0;
        Object accumulator = initial;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            index++;
            accumulator = operation.invoke(Integer.valueOf(index), accumulator, Character.valueOf(element));
        }

        return accumulator;
    }

    public static final Object foldRight(CharSequence $receiver, Object initial, Function2 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = StringsKt.getLastIndex($receiver);
        Object accumulator;
        for(accumulator = initial; index >= 0; accumulator = operation.invoke(Character.valueOf($receiver.charAt(index--)), accumulator));
        return accumulator;
    }

    public static final Object foldRightIndexed(CharSequence $receiver, Object initial, Function3 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = StringsKt.getLastIndex($receiver);
        Object accumulator = initial;
        for(; index >= 0; index--)
            accumulator = operation.invoke(Integer.valueOf(index), Character.valueOf($receiver.charAt(index)), accumulator);

        return accumulator;
    }

    public static final void forEach(CharSequence $receiver, Function1 action)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(action, "action");
        char element;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext(); action.invoke(Character.valueOf(element)))
            element = chariterator.nextChar();

    }

    public static final void forEachIndexed(CharSequence $receiver, Function2 action)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(action, "action");
        int index = 0;
        char item;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext(); action.invoke(Integer.valueOf(index), Character.valueOf(item)))
        {
            item = chariterator.nextChar();
            index++;
        }

    }

    public static final Character max(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            return (Character)null;
        char max = $receiver.charAt(0);
        int i = 1;
        int j = StringsKt.getLastIndex($receiver);
        if(i <= j)
            do
            {
                char e = $receiver.charAt(i);
                if(max < e)
                    max = e;
                if(i == j)
                    break;
                i++;
            } while(true);
        return Character.valueOf(max);
    }

    public static final Character maxBy(CharSequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            return (Character)null;
        char maxElem = $receiver.charAt(0);
        Comparable maxValue = (Comparable)selector.invoke(Character.valueOf(maxElem));
        int i = 1;
        int j = StringsKt.getLastIndex($receiver);
        if(i <= j)
            do
            {
                char e = $receiver.charAt(i);
                Comparable v = (Comparable)selector.invoke(Character.valueOf(e));
                if(maxValue.compareTo(v) < 0)
                {
                    maxElem = e;
                    maxValue = v;
                }
                if(i == j)
                    break;
                i++;
            } while(true);
        return Character.valueOf(maxElem);
    }

    public static final Character maxWith(CharSequence $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            return (Character)null;
        char max = $receiver.charAt(0);
        int i = 1;
        int j = StringsKt.getLastIndex($receiver);
        if(i <= j)
            do
            {
                char e = $receiver.charAt(i);
                if(comparator.compare(Character.valueOf(max), Character.valueOf(e)) < 0)
                    max = e;
                if(i == j)
                    break;
                i++;
            } while(true);
        return Character.valueOf(max);
    }

    public static final Character min(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            return (Character)null;
        char min = $receiver.charAt(0);
        int i = 1;
        int j = StringsKt.getLastIndex($receiver);
        if(i <= j)
            do
            {
                char e = $receiver.charAt(i);
                if(min > e)
                    min = e;
                if(i == j)
                    break;
                i++;
            } while(true);
        return Character.valueOf(min);
    }

    public static final Character minBy(CharSequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            return (Character)null;
        char minElem = $receiver.charAt(0);
        Comparable minValue = (Comparable)selector.invoke(Character.valueOf(minElem));
        int i = 1;
        int j = StringsKt.getLastIndex($receiver);
        if(i <= j)
            do
            {
                char e = $receiver.charAt(i);
                Comparable v = (Comparable)selector.invoke(Character.valueOf(e));
                if(minValue.compareTo(v) > 0)
                {
                    minElem = e;
                    minValue = v;
                }
                if(i == j)
                    break;
                i++;
            } while(true);
        return Character.valueOf(minElem);
    }

    public static final Character minWith(CharSequence $receiver, Comparator comparator)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            return (Character)null;
        char min = $receiver.charAt(0);
        int i = 1;
        int j = StringsKt.getLastIndex($receiver);
        if(i <= j)
            do
            {
                char e = $receiver.charAt(i);
                if(comparator.compare(Character.valueOf(min), Character.valueOf(e)) > 0)
                    min = e;
                if(i == j)
                    break;
                i++;
            } while(true);
        return Character.valueOf(min);
    }

    public static final boolean none(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        CharIterator chariterator = StringsKt.iterator($receiver);
        if(chariterator.hasNext())
        {
            char element = chariterator.nextChar();
            return false;
        } else
        {
            return true;
        }
    }

    public static final boolean none(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                return false;
        }

        return true;
    }

    public static final char reduce(CharSequence $receiver, Function2 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            throw (Throwable)new UnsupportedOperationException("Empty char sequence can't be reduced.");
        char accumulator = $receiver.charAt(0);
        int index = 1;
        int i = StringsKt.getLastIndex($receiver);
        if(index <= i)
            do
            {
                accumulator = ((Character)operation.invoke(Character.valueOf(accumulator), Character.valueOf($receiver.charAt(index)))).charValue();
                if(index == i)
                    break;
                index++;
            } while(true);
        return accumulator;
    }

    public static final char reduceIndexed(CharSequence $receiver, Function3 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        CharSequence charsequence = $receiver;
        if(charsequence.length() == 0)
            throw (Throwable)new UnsupportedOperationException("Empty char sequence can't be reduced.");
        char accumulator = $receiver.charAt(0);
        int index = 1;
        int i = StringsKt.getLastIndex($receiver);
        if(index <= i)
            do
            {
                accumulator = ((Character)operation.invoke(Integer.valueOf(index), Character.valueOf(accumulator), Character.valueOf($receiver.charAt(index)))).charValue();
                if(index == i)
                    break;
                index++;
            } while(true);
        return accumulator;
    }

    public static final char reduceRight(CharSequence $receiver, Function2 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = StringsKt.getLastIndex($receiver);
        if(index < 0)
            throw (Throwable)new UnsupportedOperationException("Empty char sequence can't be reduced.");
        char accumulator;
        for(accumulator = $receiver.charAt(index--); index >= 0; accumulator = ((Character)operation.invoke(Character.valueOf($receiver.charAt(index--)), Character.valueOf(accumulator))).charValue());
        return accumulator;
    }

    public static final char reduceRightIndexed(CharSequence $receiver, Function3 operation)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(operation, "operation");
        int index = StringsKt.getLastIndex($receiver);
        if(index < 0)
            throw (Throwable)new UnsupportedOperationException("Empty char sequence can't be reduced.");
        char accumulator = $receiver.charAt(index--);
        for(; index >= 0; index--)
            accumulator = ((Character)operation.invoke(Integer.valueOf(index), Character.valueOf($receiver.charAt(index)), Character.valueOf(accumulator))).charValue();

        return accumulator;
    }

    public static final int sumBy(CharSequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        int sum = 0;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            sum += ((Number)selector.invoke(Character.valueOf(element))).intValue();
        }

        return sum;
    }

    public static final double sumByDouble(CharSequence $receiver, Function1 selector)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(selector, "selector");
        double sum = 0.0D;
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            sum += ((Number)selector.invoke(Character.valueOf(element))).doubleValue();
        }

        return sum;
    }

    public static final Pair partition(CharSequence $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for(CharIterator chariterator = StringsKt.iterator($receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                first.append(element);
            else
                second.append(element);
        }

        return new Pair(first, second);
    }

    public static final Pair partition(String $receiver, Function1 predicate)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for(CharIterator chariterator = StringsKt.iterator((CharSequence)$receiver); chariterator.hasNext();)
        {
            char element = chariterator.nextChar();
            if(((Boolean)predicate.invoke(Character.valueOf(element))).booleanValue())
                first.append(element);
            else
                second.append(element);
        }

        return new Pair(first.toString(), second.toString());
    }

    public static final List zip(CharSequence $receiver, CharSequence other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        CharSequence $receiver$iv = $receiver;
        int length$iv = Math.min($receiver$iv.length(), other.length());
        ArrayList list$iv = new ArrayList(length$iv);
        int i$iv = 0;
        int i = length$iv - 1;
        if(i$iv <= i)
            do
            {
                char c2 = other.charAt(i$iv);
                char c = $receiver$iv.charAt(i$iv);
                ArrayList arraylist = list$iv;
                Pair pair = TuplesKt.to(Character.valueOf(c), Character.valueOf(c2));
                arraylist.add(pair);
                if(i$iv == i)
                    break;
                i$iv++;
            } while(true);
        return (List)list$iv;
    }

    public static final List zip(CharSequence $receiver, CharSequence other, Function2 transform)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        Intrinsics.checkParameterIsNotNull(transform, "transform");
        int length = Math.min($receiver.length(), other.length());
        ArrayList list = new ArrayList(length);
        int i = 0;
        int j = length - 1;
        if(i <= j)
            do
            {
                list.add(transform.invoke(Character.valueOf($receiver.charAt(i)), Character.valueOf(other.charAt(i))));
                if(i == j)
                    break;
                i++;
            } while(true);
        return (List)list;
    }

    public static final Iterable asIterable(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof String)
        {
            CharSequence charsequence = $receiver;
            if(charsequence.length() == 0)
                return (Iterable)CollectionsKt.emptyList();
        }
        class asIterable..inlined.Iterable._cls1
            implements Iterable, KMappedMarker
        {

            public Iterator iterator()
            {
                return (Iterator)StringsKt.iterator(receiver$0$inlined);
            }

            final CharSequence receiver$0$inlined;

            asIterable..inlined.Iterable._cls1(CharSequence charsequence)
            {
                receiver$0$inlined = charsequence;
                super();
            }
        }

        return (Iterable)new asIterable..inlined.Iterable._cls1($receiver);
    }

    public static final Sequence asSequence(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver instanceof String)
        {
            CharSequence charsequence = $receiver;
            if(charsequence.length() == 0)
                return SequencesKt.emptySequence();
        }
        class asSequence..inlined.Sequence._cls1
            implements Sequence
        {

            public Iterator iterator()
            {
                return (Iterator)StringsKt.iterator(receiver$0$inlined);
            }

            final CharSequence receiver$0$inlined;

            asSequence..inlined.Sequence._cls1(CharSequence charsequence)
            {
                receiver$0$inlined = charsequence;
                super();
            }
        }

        return (Sequence)new asSequence..inlined.Sequence._cls1($receiver);
    }

    public StringsKt___StringsKt()
    {
    }
}
