// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StringsJVM.kt

package kotlin.text;

import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.text:
//            StringsKt__StringBuilderKt, StringsKt, Charsets, CharsKt

class StringsKt__StringsJVMKt extends StringsKt__StringBuilderKt
{

    private static final int nativeIndexOf(String $receiver, char ch, int fromIndex)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).indexOf(ch, fromIndex);
    }

    private static final int nativeIndexOf(String $receiver, String str, int fromIndex)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).indexOf(str, fromIndex);
    }

    private static final int nativeLastIndexOf(String $receiver, char ch, int fromIndex)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).lastIndexOf(ch, fromIndex);
    }

    private static final int nativeLastIndexOf(String $receiver, String str, int fromIndex)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).lastIndexOf(str, fromIndex);
    }

    public static final boolean equals(String $receiver, String other, boolean ignoreCase)
    {
        if($receiver == null)
            return other == null;
        if(ignoreCase) goto _L2; else goto _L1
_L1:
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)$receiver).equals(other);
          goto _L3
_L2:
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)$receiver).equalsIgnoreCase(other);
_L3:
        return;
    }

    public static volatile boolean equals$default(String s, String s1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: equals");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.equals(s, s1, flag);
    }

    public static final String replace(String $receiver, char oldChar, char newChar, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        String s;
        if(!ignoreCase)
        {
            if($receiver == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            s = ((String)$receiver).replace(oldChar, newChar);
            Intrinsics.checkExpressionValueIsNotNull(s, "(this as java.lang.Strin\u2026replace(oldChar, newChar)");
            return s;
        } else
        {
            int i = 0;
            char ac[] = {
                oldChar
            };
            boolean flag = ignoreCase;
            return SequencesKt.joinToString$default(StringsKt.splitToSequence$default((CharSequence)$receiver, ac, flag, i, 4, null), (CharSequence)java.lang.String.valueOf(newChar), null, null, 0, null, null, 62, null);
        }
    }

    public static volatile String replace$default(String s, char c, char c1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
        if((i & 4) != 0)
            flag = false;
        return StringsKt.replace(s, c, c1, flag);
    }

    public static final String replace(String $receiver, String oldValue, String newValue, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(oldValue, "oldValue");
        Intrinsics.checkParameterIsNotNull(newValue, "newValue");
        int i = 0;
        String as[] = {
            oldValue
        };
        boolean flag = ignoreCase;
        return SequencesKt.joinToString$default(StringsKt.splitToSequence$default((CharSequence)$receiver, as, flag, i, 4, null), (CharSequence)newValue, null, null, 0, null, null, 62, null);
    }

    public static volatile String replace$default(String s, String s1, String s2, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
        if((i & 4) != 0)
            flag = false;
        return StringsKt.replace(s, s1, s2, flag);
    }

    public static final String replaceFirst(String $receiver, char oldChar, char newChar, boolean ignoreCase)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        index = StringsKt.indexOf$default((CharSequence)$receiver, oldChar, 0, ignoreCase, 2, null);
        if(index >= 0) goto _L2; else goto _L1
_L1:
        $receiver;
          goto _L3
_L2:
        int i;
        CharSequence charsequence;
        String s = $receiver;
        i = index + 1;
        charsequence = (CharSequence)java.lang.String.valueOf(newChar);
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, index, i, charsequence).toString();
_L3:
        return;
    }

    public static volatile String replaceFirst$default(String s, char c, char c1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceFirst");
        if((i & 4) != 0)
            flag = false;
        return StringsKt.replaceFirst(s, c, c1, flag);
    }

    public static final String replaceFirst(String $receiver, String oldValue, String newValue, boolean ignoreCase)
    {
        int index;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(oldValue, "oldValue");
        Intrinsics.checkParameterIsNotNull(newValue, "newValue");
        index = StringsKt.indexOf$default((CharSequence)$receiver, oldValue, 0, ignoreCase, 2, null);
        if(index >= 0) goto _L2; else goto _L1
_L1:
        $receiver;
          goto _L3
_L2:
        int i;
        String s = $receiver;
        i = index + oldValue.length();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        StringsKt.replaceRange((CharSequence)s, index, i, (CharSequence)newValue).toString();
_L3:
        return;
    }

    public static volatile String replaceFirst$default(String s, String s1, String s2, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceFirst");
        if((i & 4) != 0)
            flag = false;
        return StringsKt.replaceFirst(s, s1, s2, flag);
    }

    private static final String toUpperCase(String $receiver)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s = ((String)$receiver).toUpperCase();
        Intrinsics.checkExpressionValueIsNotNull(s, "(this as java.lang.String).toUpperCase()");
        return s;
    }

    private static final String toLowerCase(String $receiver)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s = ((String)$receiver).toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(s, "(this as java.lang.String).toLowerCase()");
        return s;
    }

    private static final char[] toCharArray(String $receiver)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        char ac[] = ((String)$receiver).toCharArray();
        Intrinsics.checkExpressionValueIsNotNull(ac, "(this as java.lang.String).toCharArray()");
        return ac;
    }

    private static final char[] toCharArray(String $receiver, char destination[], int destinationOffset, int startIndex, int endIndex)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)$receiver).getChars(startIndex, endIndex, destination, destinationOffset);
        return destination;
    }

    static volatile char[] toCharArray$default(String $receiver, char destination[], int destinationOffset, int startIndex, int endIndex, int $i$f$toCharArray, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCharArray");
        if(($i$f$toCharArray & 2) != 0)
            destinationOffset = 0;
        if(($i$f$toCharArray & 4) != 0)
            startIndex = 0;
        if(($i$f$toCharArray & 8) != 0)
            endIndex = $receiver.length();
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)$receiver).getChars(startIndex, endIndex, destination, destinationOffset);
        return destination;
    }

    private static final transient String format(String $receiver, Object args[])
    {
        String s = java.lang.String.format($receiver, (Object[])Arrays.copyOf(args, args.length));
        Intrinsics.checkExpressionValueIsNotNull(s, "java.lang.String.format(this, *args)");
        return s;
    }

    private static final transient String format(StringCompanionObject $receiver, String format, Object args[])
    {
        String s = java.lang.String.format(format, (Object[])Arrays.copyOf(args, args.length));
        Intrinsics.checkExpressionValueIsNotNull(s, "java.lang.String.format(format, *args)");
        return s;
    }

    private static final transient String format(String $receiver, Locale locale, Object args[])
    {
        String s = java.lang.String.format(locale, $receiver, (Object[])Arrays.copyOf(args, args.length));
        Intrinsics.checkExpressionValueIsNotNull(s, "java.lang.String.format(locale, this, *args)");
        return s;
    }

    private static final transient String format(StringCompanionObject $receiver, Locale locale, String format, Object args[])
    {
        String s = java.lang.String.format(locale, format, (Object[])Arrays.copyOf(args, args.length));
        Intrinsics.checkExpressionValueIsNotNull(s, "java.lang.String.format(locale, format, *args)");
        return s;
    }

    public static final List split(CharSequence $receiver, Pattern regex, int limit)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(regex, "regex");
        boolean flag = limit >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Limit must be non-negative, but was ").append(limit).append(".").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return ArraysKt.asList((Object[])regex.split($receiver, limit != 0 ? limit : -1));
        }
    }

    public static volatile List split$default(CharSequence charsequence, Pattern pattern, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: split");
        if((j & 2) != 0)
            i = 0;
        return StringsKt.split(charsequence, pattern, i);
    }

    private static final String substring(String $receiver, int startIndex)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s = ((String)$receiver).substring(startIndex);
        Intrinsics.checkExpressionValueIsNotNull(s, "(this as java.lang.String).substring(startIndex)");
        return s;
    }

    private static final String substring(String $receiver, int startIndex, int endIndex)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s = ((String)$receiver).substring(startIndex, endIndex);
        Intrinsics.checkExpressionValueIsNotNull(s, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return s;
    }

    public static final boolean startsWith(String $receiver, String prefix, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        if(!ignoreCase)
        {
            if($receiver == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            return ((String)$receiver).startsWith(prefix);
        } else
        {
            return StringsKt.regionMatches($receiver, 0, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    public static volatile boolean startsWith$default(String s, String s1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startsWith");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.startsWith(s, s1, flag);
    }

    public static final boolean startsWith(String $receiver, String prefix, int startIndex, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        if(!ignoreCase)
        {
            if($receiver == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            return ((String)$receiver).startsWith(prefix, startIndex);
        } else
        {
            return StringsKt.regionMatches($receiver, startIndex, prefix, 0, prefix.length(), ignoreCase);
        }
    }

    public static volatile boolean startsWith$default(String s, String s1, int i, boolean flag, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startsWith");
        if((j & 4) != 0)
            flag = false;
        return StringsKt.startsWith(s, s1, i, flag);
    }

    public static final boolean endsWith(String $receiver, String suffix, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(suffix, "suffix");
        if(!ignoreCase)
        {
            if($receiver == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            return ((String)$receiver).endsWith(suffix);
        } else
        {
            return StringsKt.regionMatches($receiver, $receiver.length() - suffix.length(), suffix, 0, suffix.length(), true);
        }
    }

    public static volatile boolean endsWith$default(String s, String s1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endsWith");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.endsWith(s, s1, flag);
    }

    private static final String String(byte bytes[], int offset, int length, Charset charset)
    {
        return (String)new String(bytes, offset, length, charset);
    }

    private static final String String(byte bytes[], Charset charset)
    {
        return (String)new String(bytes, charset);
    }

    private static final String String(byte bytes[], int offset, int length)
    {
        return (String)new String(bytes, offset, length, Charsets.UTF_8);
    }

    private static final String String(byte bytes[])
    {
        return (String)new String(bytes, Charsets.UTF_8);
    }

    private static final String String(char chars[])
    {
        return (String)new String(chars);
    }

    private static final String String(char chars[], int offset, int length)
    {
        return (String)new String(chars, offset, length);
    }

    private static final String String(int codePoints[], int offset, int length)
    {
        return (String)new String(codePoints, offset, length);
    }

    private static final String String(StringBuffer stringBuffer)
    {
        return (String)new String(stringBuffer);
    }

    private static final String String(StringBuilder stringBuilder)
    {
        return (String)new String(stringBuilder);
    }

    private static final int codePointAt(String $receiver, int index)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).codePointAt(index);
    }

    private static final int codePointBefore(String $receiver, int index)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).codePointBefore(index);
    }

    private static final int codePointCount(String $receiver, int beginIndex, int endIndex)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).codePointCount(beginIndex, endIndex);
    }

    public static final int compareTo(String $receiver, String other, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        if(ignoreCase)
        {
            if($receiver == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            return ((String)$receiver).compareToIgnoreCase(other);
        } else
        {
            if($receiver == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            return ((String)$receiver).compareTo(other);
        }
    }

    public static volatile int compareTo$default(String s, String s1, boolean flag, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: compareTo");
        if((i & 2) != 0)
            flag = false;
        return StringsKt.compareTo(s, s1, flag);
    }

    private static final boolean contentEquals(String $receiver, CharSequence charSequence)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).contentEquals(charSequence);
    }

    private static final boolean contentEquals(String $receiver, StringBuffer stringBuilder)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).contentEquals(stringBuilder);
    }

    private static final String intern(String $receiver)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s = ((String)$receiver).intern();
        Intrinsics.checkExpressionValueIsNotNull(s, "(this as java.lang.String).intern()");
        return s;
    }

    public static final boolean isBlank(CharSequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver.length() == 0) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        Iterable iterable = (Iterable)StringsKt.getIndices($receiver);
        iterator = iterable.iterator();
_L6:
        if(!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        int it;
        int element$iv = ((IntIterator)iterator).nextInt();
        it = element$iv;
        if(CharsKt.isWhitespace($receiver.charAt(it))) goto _L6; else goto _L5
_L5:
        if(false) goto _L2; else goto _L7
_L4:
        if(false) goto _L7; else goto _L2
_L2:
        true;
          goto _L8
_L7:
        false;
_L8:
        return;
    }

    private static final int offsetByCodePoints(String $receiver, int index, int codePointOffset)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        return ((String)$receiver).offsetByCodePoints(index, codePointOffset);
    }

    public static final boolean regionMatches(CharSequence $receiver, int thisOffset, CharSequence other, int otherOffset, int length, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        if(($receiver instanceof String) && (other instanceof String))
            return StringsKt.regionMatches((String)$receiver, thisOffset, (String)other, otherOffset, length, ignoreCase);
        else
            return StringsKt.regionMatchesImpl($receiver, thisOffset, other, otherOffset, length, ignoreCase);
    }

    public static volatile boolean regionMatches$default(CharSequence charsequence, int i, CharSequence charsequence1, int j, int k, boolean flag, int l, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: regionMatches");
        if((l & 0x10) != 0)
            flag = false;
        return StringsKt.regionMatches(charsequence, i, charsequence1, j, k, flag);
    }

    public static final boolean regionMatches(String $receiver, int thisOffset, String other, int otherOffset, int length, boolean ignoreCase)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        if(ignoreCase) goto _L2; else goto _L1
_L1:
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)$receiver).regionMatches(thisOffset, other, otherOffset, length);
          goto _L3
_L2:
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        ((String)$receiver).regionMatches(ignoreCase, thisOffset, other, otherOffset, length);
_L3:
        return;
    }

    public static volatile boolean regionMatches$default(String s, int i, String s1, int j, int k, boolean flag, int l, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: regionMatches");
        if((l & 0x10) != 0)
            flag = false;
        return StringsKt.regionMatches(s, i, s1, j, k, flag);
    }

    private static final String toLowerCase(String $receiver, Locale locale)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s = ((String)$receiver).toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(s, "(this as java.lang.String).toLowerCase(locale)");
        return s;
    }

    private static final String toUpperCase(String $receiver, Locale locale)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s = ((String)$receiver).toUpperCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(s, "(this as java.lang.String).toUpperCase(locale)");
        return s;
    }

    private static final boolean toBoolean(String $receiver)
    {
        return Boolean.parseBoolean($receiver);
    }

    private static final byte toByte(String $receiver)
    {
        return Byte.parseByte($receiver);
    }

    private static final short toShort(String $receiver)
    {
        return Short.parseShort($receiver);
    }

    private static final int toInt(String $receiver)
    {
        return Integer.parseInt($receiver);
    }

    private static final long toLong(String $receiver)
    {
        return Long.parseLong($receiver);
    }

    private static final float toFloat(String $receiver)
    {
        return Float.parseFloat($receiver);
    }

    private static final double toDouble(String $receiver)
    {
        return Double.parseDouble($receiver);
    }

    private static final byte[] toByteArray(String $receiver, Charset charset)
    {
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        byte abyte0[] = ((String)$receiver).getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(abyte0, "(this as java.lang.String).getBytes(charset)");
        return abyte0;
    }

    static volatile byte[] toByteArray$default(String $receiver, Charset charset, int $i$f$toByteArray, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toByteArray");
        if(($i$f$toByteArray & 1) != 0)
            charset = Charsets.UTF_8;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        byte abyte0[] = ((String)$receiver).getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(abyte0, "(this as java.lang.String).getBytes(charset)");
        return abyte0;
    }

    private static final Pattern toPattern(String $receiver, int flags)
    {
        Pattern pattern = Pattern.compile($receiver, flags);
        Intrinsics.checkExpressionValueIsNotNull(pattern, "java.util.regex.Pattern.compile(this, flags)");
        return pattern;
    }

    static volatile Pattern toPattern$default(String $receiver, int flags, int $i$f$toPattern, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPattern");
        if(($i$f$toPattern & 1) != 0)
            flags = 0;
        Pattern pattern = Pattern.compile($receiver, flags);
        Intrinsics.checkExpressionValueIsNotNull(pattern, "java.util.regex.Pattern.compile(this, flags)");
        return pattern;
    }

    public static final String capitalize(String $receiver)
    {
        CharSequence charsequence;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        charsequence = (CharSequence)$receiver;
        if(charsequence.length() <= 0) goto _L2; else goto _L1
_L1:
        char c = $receiver.charAt(0);
        if(!Character.isLowerCase(c)) goto _L2; else goto _L3
_L3:
        StringBuilder stringbuilder;
        String s1;
        String s2;
        String s3;
        String s4;
        String s = $receiver;
        int i = 0;
        int j = 1;
        stringbuilder = new StringBuilder();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s2 = ((String)s).substring(i, j);
        Intrinsics.checkExpressionValueIsNotNull(s2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        s1 = s2;
        s = s1;
        stringbuilder = stringbuilder;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s3 = ((String)s).toUpperCase();
        Intrinsics.checkExpressionValueIsNotNull(s3, "(this as java.lang.String).toUpperCase()");
        s1 = s3;
        s = $receiver;
        i = 1;
        stringbuilder = stringbuilder.append(s1);
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s4 = ((String)s).substring(i);
        Intrinsics.checkExpressionValueIsNotNull(s4, "(this as java.lang.String).substring(startIndex)");
        s1 = s4;
        stringbuilder.append(s1).toString();
          goto _L4
_L2:
        $receiver;
_L4:
        return;
    }

    public static final String decapitalize(String $receiver)
    {
        CharSequence charsequence;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        charsequence = (CharSequence)$receiver;
        if(charsequence.length() <= 0) goto _L2; else goto _L1
_L1:
        char c = $receiver.charAt(0);
        if(!Character.isUpperCase(c)) goto _L2; else goto _L3
_L3:
        StringBuilder stringbuilder;
        String s1;
        String s2;
        String s3;
        String s4;
        String s = $receiver;
        int i = 0;
        int j = 1;
        stringbuilder = new StringBuilder();
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s2 = ((String)s).substring(i, j);
        Intrinsics.checkExpressionValueIsNotNull(s2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        s1 = s2;
        s = s1;
        stringbuilder = stringbuilder;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s3 = ((String)s).toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(s3, "(this as java.lang.String).toLowerCase()");
        s1 = s3;
        s = $receiver;
        i = 1;
        stringbuilder = stringbuilder.append(s1);
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s4 = ((String)s).substring(i);
        Intrinsics.checkExpressionValueIsNotNull(s4, "(this as java.lang.String).substring(startIndex)");
        s1 = s4;
        stringbuilder.append(s1).toString();
          goto _L4
_L2:
        $receiver;
_L4:
        return;
    }

    public static final String repeat(CharSequence $receiver, int n)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        boolean flag = n >= 0;
        if(!flag)
        {
            String s = (new StringBuilder()).append("Count 'n' must be non-negative, but was ").append(n).append(".").toString();
            throw (Throwable)new IllegalArgumentException(s.toString());
        }
        n;
        JVM INSTR lookupswitch 2: default 105
    //                   0: 92
    //                   1: 98;
           goto _L1 _L2 _L3
_L2:
        "";
        break MISSING_BLOCK_LABEL_302;
_L3:
        $receiver.toString();
        break MISSING_BLOCK_LABEL_302;
_L1:
        $receiver.length();
        JVM INSTR lookupswitch 2: default 246
    //                   0: 136
    //                   1: 142;
           goto _L4 _L5 _L6
_L5:
        "";
        break MISSING_BLOCK_LABEL_302;
_L6:
        char ac[];
        Character character = Character.valueOf($receiver.charAt(0));
        char char = ((Character)character).charValue();
        int size$iv = n;
        char result$iv[] = new char[size$iv];
        int i$iv = 0;
        int k = size$iv - 1;
        if(i$iv <= k)
            do
            {
                int l = i$iv;
                int i1 = i$iv;
                char ac1[] = result$iv;
                char c = char;
                ac1[i1] = c;
                if(i$iv == k)
                    break;
                i$iv++;
            } while(true);
        ac = result$iv;
        (String)(String)new String(ac);
        break MISSING_BLOCK_LABEL_302;
_L4:
        String s1;
        StringBuilder sb = new StringBuilder(n * $receiver.length());
        int i = 1;
        int j = n;
        if(i <= j)
            do
            {
                sb.append($receiver);
                if(i == j)
                    break;
                i++;
            } while(true);
        s1 = sb.toString();
        s1;
        Intrinsics.checkExpressionValueIsNotNull(s1, "sb.toString()");
        return;
    }

    public static final Comparator getCASE_INSENSITIVE_ORDER(StringCompanionObject $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkExpressionValueIsNotNull(String.CASE_INSENSITIVE_ORDER, "java.lang.String.CASE_INSENSITIVE_ORDER");
        return String.CASE_INSENSITIVE_ORDER;
    }

    public StringsKt__StringsJVMKt()
    {
    }
}
