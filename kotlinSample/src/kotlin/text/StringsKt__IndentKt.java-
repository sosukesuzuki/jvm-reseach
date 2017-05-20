// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Indent.kt

package kotlin.text;

import java.util.*;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.text:
//            StringsKt, CharsKt

class StringsKt__IndentKt
{

    public static final String trimMargin(String $receiver, String marginPrefix)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(marginPrefix, "marginPrefix");
        return StringsKt.replaceIndentByMargin($receiver, "", marginPrefix);
    }

    public static volatile String trimMargin$default(String s, String s1, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trimMargin");
        if((i & 1) != 0)
            s1 = "|";
        return StringsKt.trimMargin(s, s1);
    }

    public static final String replaceIndentByMargin(String $receiver, String newIndent, String marginPrefix)
    {
        int resultSizeEstimate$iv;
        Function1 indentAddFunction$iv;
        int lastIndex$iv;
        Collection destination$iv$iv$iv;
        int index$iv$iv$iv$iv;
        Iterator iterator;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(newIndent, "newIndent");
        Intrinsics.checkParameterIsNotNull(marginPrefix, "marginPrefix");
        List lines = (CharSequence)marginPrefix;
        boolean flag = !StringsKt.isBlank(lines);
        if(!flag)
        {
            String s = "marginPrefix must be non-blank string.";
            throw (Throwable)new IllegalArgumentException(s.toString());
        }
        flag = StringsKt.lines((CharSequence)$receiver);
        List $receiver$iv = flag;
        resultSizeEstimate$iv = $receiver.length() + newIndent.length() * flag.size();
        indentAddFunction$iv = getIndentFunction$StringsKt__IndentKt(newIndent);
        lastIndex$iv = CollectionsKt.getLastIndex($receiver$iv);
        Iterable iterable = (Iterable)$receiver$iv;
        Iterable iterable1 = iterable;
        destination$iv$iv$iv = (Collection)new ArrayList();
        Iterable $receiver$iv$iv$iv$iv = iterable1;
        index$iv$iv$iv$iv = 0;
        iterator = $receiver$iv$iv$iv$iv.iterator();
_L15:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String value$iv;
        int index$iv;
        Object item$iv$iv$iv$iv = iterator.next();
        Object element$iv$iv$iv = item$iv$iv$iv$iv;
        int index$iv$iv$iv = index$iv$iv$iv$iv++;
        value$iv = (String)element$iv$iv$iv;
        index$iv = index$iv$iv$iv;
        if(index$iv != 0 && index$iv != lastIndex$iv || !StringsKt.isBlank((CharSequence)value$iv)) goto _L4; else goto _L3
_L3:
        (String)null;
          goto _L5
_L4:
        String line;
        int firstNonWhitespaceIndex;
        IntRange intrange;
label0:
        {
            line = (String)value$iv;
            CharSequence $receiver$iv = (CharSequence)line;
            intrange = StringsKt.getIndices($receiver$iv);
            int index$iv = intrange.getFirst();
            int j = intrange.getLast();
            if(index$iv <= j)
                do
                {
                    char it = $receiver$iv.charAt(index$iv);
                    if(!CharsKt.isWhitespace(it))
                    {
                        firstNonWhitespaceIndex = index$iv;
                        break label0;
                    }
                    if(index$iv == j)
                        break;
                    index$iv++;
                } while(true);
            firstNonWhitespaceIndex = -1;
        }
        if(firstNonWhitespaceIndex != -1) goto _L7; else goto _L6
_L6:
        (String)null;
          goto _L8
_L7:
        if(!StringsKt.startsWith$default(line, marginPrefix, firstNonWhitespaceIndex, false, 4, null)) goto _L10; else goto _L9
_L9:
        String s6;
        String s1 = line;
        int i = firstNonWhitespaceIndex + marginPrefix.length();
        if(s1 == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        s6 = ((String)s1).substring(i);
        s6;
        Intrinsics.checkExpressionValueIsNotNull(s6, "(this as java.lang.String).substring(startIndex)");
          goto _L8
_L10:
        (String)null;
_L8:
        (String);
        JVM INSTR dup ;
        JVM INSTR ifnull 411;
           goto _L11 _L12
_L11:
        String s2;
        s2;
        String s4 = (String)indentAddFunction$iv.invoke(s2);
        if(true || s4 == null) goto _L12; else goto _L5
_L12:
        s4 == null ? value$iv : s4;
_L5:
        JVM INSTR dup ;
        JVM INSTR ifnull 439;
           goto _L13 _L14
_L13:
        String s3;
        break MISSING_BLOCK_LABEL_418;
_L14:
        break MISSING_BLOCK_LABEL_439;
        s3;
        Object it$iv$iv$iv = s3;
        destination$iv$iv$iv.add(it$iv$iv$iv);
        continue; /* Loop/switch isn't completed */
        JVM INSTR pop ;
          goto _L15
_L2:
        String s5 = ((StringBuilder)CollectionsKt.joinTo$default((Iterable)(List)destination$iv$iv$iv, (Appendable)new StringBuilder(resultSizeEstimate$iv), (CharSequence)"\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkExpressionValueIsNotNull(s5, "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()");
        return s5;
    }

    public static volatile String replaceIndentByMargin$default(String s, String s1, String s2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceIndentByMargin");
        if((i & 1) != 0)
            s1 = "";
        if((i & 2) != 0)
            s2 = "|";
        return StringsKt.replaceIndentByMargin(s, s1, s2);
    }

    public static final String trimIndent(String $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return StringsKt.replaceIndent($receiver, "");
    }

    public static final String replaceIndent(String $receiver, String newIndent)
    {
        List lines;
        Integer integer1;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(newIndent, "newIndent");
        lines = StringsKt.lines((CharSequence)$receiver);
        Iterable $receiver$iv = (Iterable)lines;
        Iterable iterable = $receiver$iv;
        Collection destination$iv$iv = (Collection)new ArrayList();
        Iterator iterator = iterable.iterator();
        do
        {
            if(!iterator.hasNext())
                break;
            Object element$iv$iv = iterator.next();
            String it = (String)element$iv$iv;
            CharSequence charsequence = (CharSequence)it;
            if(!StringsKt.isBlank(charsequence))
                destination$iv$iv.add(element$iv$iv);
        } while(true);
        $receiver$iv = (Iterable)(List)destination$iv$iv;
        iterable = $receiver$iv;
        destination$iv$iv = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10));
        Collection collection;
        Integer integer;
        for(Iterator iterator1 = iterable.iterator(); iterator1.hasNext(); collection.add(integer))
        {
            Object item$iv$iv = iterator1.next();
            String s = (String)item$iv$iv;
            collection = destination$iv$iv;
            integer = Integer.valueOf(indentWidth$StringsKt__IndentKt(s));
        }

        integer1 = (Integer)CollectionsKt.min((Iterable)(List)destination$iv$iv);
        if(integer1 != null)
            break MISSING_BLOCK_LABEL_227;
        else
            break MISSING_BLOCK_LABEL_238;
        minCommonIndent = integer1.intValue();
        break MISSING_BLOCK_LABEL_240;
        int minCommonIndent = 0;
        int resultSizeEstimate$iv;
        Function1 indentAddFunction$iv;
        int lastIndex$iv;
        Collection destination$iv$iv$iv;
        int index$iv$iv$iv$iv;
        Iterator iterator2;
        List $receiver$iv = lines;
        resultSizeEstimate$iv = $receiver.length() + newIndent.length() * lines.size();
        indentAddFunction$iv = getIndentFunction$StringsKt__IndentKt(newIndent);
        lastIndex$iv = CollectionsKt.getLastIndex($receiver$iv);
        Iterable iterable1 = (Iterable)$receiver$iv;
        Iterable iterable2 = iterable1;
        destination$iv$iv$iv = (Collection)new ArrayList();
        Iterable $receiver$iv$iv$iv$iv = iterable2;
        index$iv$iv$iv$iv = 0;
        iterator2 = $receiver$iv$iv$iv$iv.iterator();
_L10:
        if(!iterator2.hasNext()) goto _L2; else goto _L1
_L1:
        String value$iv;
        int index$iv;
        Object item$iv$iv$iv$iv = iterator2.next();
        Object element$iv$iv$iv = item$iv$iv$iv$iv;
        int index$iv$iv$iv = index$iv$iv$iv$iv++;
        value$iv = (String)element$iv$iv$iv;
        index$iv = index$iv$iv$iv;
        if(index$iv != 0 && index$iv != lastIndex$iv || !StringsKt.isBlank((CharSequence)value$iv)) goto _L4; else goto _L3
_L3:
        (String)null;
          goto _L5
_L4:
        String s3;
        String line = (String)value$iv;
        s3 = (String)StringsKt.drop(line, minCommonIndent);
        s3;
        if(s3 == null) goto _L7; else goto _L6
_L6:
        String s1;
        s1;
        String s4 = (String)indentAddFunction$iv.invoke(s1);
        if(true || s4 == null) goto _L7; else goto _L5
_L7:
        s4 == null ? value$iv : s4;
_L5:
        JVM INSTR dup ;
        JVM INSTR ifnull 458;
           goto _L8 _L9
_L8:
        String s2;
        break MISSING_BLOCK_LABEL_437;
_L9:
        break MISSING_BLOCK_LABEL_458;
        s2;
        Object it$iv$iv$iv = s2;
        destination$iv$iv$iv.add(it$iv$iv$iv);
        continue; /* Loop/switch isn't completed */
        JVM INSTR pop ;
          goto _L10
_L2:
        String s5 = ((StringBuilder)CollectionsKt.joinTo$default((Iterable)(List)destination$iv$iv$iv, (Appendable)new StringBuilder(resultSizeEstimate$iv), (CharSequence)"\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkExpressionValueIsNotNull(s5, "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()");
        return s5;
    }

    public static volatile String replaceIndent$default(String s, String s1, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceIndent");
        if((i & 1) != 0)
            s1 = "";
        return StringsKt.replaceIndent(s, s1);
    }

    public static final String prependIndent(String $receiver, String indent)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(indent, "indent");
        return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence((CharSequence)$receiver), (Function1)new Function1(indent) {

            public volatile Object invoke(Object obj)
            {
                return invoke((String)obj);
            }

            public final String invoke(String it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return StringsKt.isBlank((CharSequence)it) ? it.length() >= $indent.length() ? it : $indent : (new StringBuilder()).append($indent).append(it).toString();
            }

            final String $indent;

            
            {
                $indent = s;
                super(1);
            }
        }
), (CharSequence)"\n", null, null, 0, null, null, 62, null);
    }

    public static volatile String prependIndent$default(String s, String s1, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prependIndent");
        if((i & 1) != 0)
            s1 = "    ";
        return StringsKt.prependIndent(s, s1);
    }

    private static final int indentWidth$StringsKt__IndentKt(String $receiver)
    {
        int i;
        IntRange intrange;
label0:
        {
            CharSequence $receiver$iv = (CharSequence)$receiver;
            intrange = StringsKt.getIndices($receiver$iv);
            int index$iv = intrange.getFirst();
            int j = intrange.getLast();
            if(index$iv <= j)
                do
                {
                    char it = $receiver$iv.charAt(index$iv);
                    if(!CharsKt.isWhitespace(it))
                    {
                        i = index$iv;
                        break label0;
                    }
                    if(index$iv == j)
                        break;
                    index$iv++;
                } while(true);
            i = -1;
        }
        int it = i;
        return it != -1 ? it : $receiver.length();
    }

    private static final Function1 getIndentFunction$StringsKt__IndentKt(String indent)
    {
        CharSequence charsequence = (CharSequence)indent;
        static final class getIndentFunction._cls1 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return invoke((String)obj);
            }

            public final String invoke(String line)
            {
                Intrinsics.checkParameterIsNotNull(line, "line");
                return line;
            }

            public static final getIndentFunction._cls1 INSTANCE = new getIndentFunction._cls1();


        }

        return (charsequence.length() != 0) ? (Function1)new Function1(indent) {

            public volatile Object invoke(Object obj)
            {
                return invoke((String)obj);
            }

            public final String invoke(String line)
            {
                Intrinsics.checkParameterIsNotNull(line, "line");
                return (new StringBuilder()).append($indent).append(line).toString();
            }

            final String $indent;

            
            {
                $indent = s;
                super(1);
            }
        }
 : (Function1)getIndentFunction._cls1.INSTANCE;
    }

    private static final String reindent$StringsKt__IndentKt(List $receiver, int resultSizeEstimate, Function1 indentAddFunction, Function1 indentCutFunction)
    {
        int lastIndex;
        Collection destination$iv$iv;
        int index$iv$iv$iv;
        Iterator iterator;
        lastIndex = CollectionsKt.getLastIndex($receiver);
        Iterable iterable = (Iterable)$receiver;
        Iterable iterable1 = iterable;
        destination$iv$iv = (Collection)new ArrayList();
        Iterable $receiver$iv$iv$iv = iterable1;
        index$iv$iv$iv = 0;
        iterator = $receiver$iv$iv$iv.iterator();
_L10:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String value;
        int index;
        Object item$iv$iv$iv = iterator.next();
        Object element$iv$iv = item$iv$iv$iv;
        int index$iv$iv = index$iv$iv$iv++;
        value = (String)element$iv$iv;
        index = index$iv$iv;
        if(index != 0 && index != lastIndex || !StringsKt.isBlank((CharSequence)value)) goto _L4; else goto _L3
_L3:
        (String)null;
          goto _L5
_L4:
        String s2 = (String)indentCutFunction.invoke(value);
        s2;
        if(s2 == null) goto _L7; else goto _L6
_L6:
        String s;
        s;
        String s3 = (String)indentAddFunction.invoke(s);
        if(true || s3 == null) goto _L7; else goto _L5
_L7:
        s3 == null ? value : s3;
_L5:
        JVM INSTR dup ;
        JVM INSTR ifnull 182;
           goto _L8 _L9
_L8:
        String s1;
        break MISSING_BLOCK_LABEL_161;
_L9:
        break MISSING_BLOCK_LABEL_182;
        s1;
        Object it$iv$iv = s1;
        destination$iv$iv.add(it$iv$iv);
        continue; /* Loop/switch isn't completed */
        JVM INSTR pop ;
          goto _L10
_L2:
        String s4 = ((StringBuilder)CollectionsKt.joinTo$default((Iterable)(List)destination$iv$iv, (Appendable)new StringBuilder(resultSizeEstimate), (CharSequence)"\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkExpressionValueIsNotNull(s4, "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()");
        return s4;
    }

    public StringsKt__IndentKt()
    {
    }
}
