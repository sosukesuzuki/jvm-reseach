// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FilePathComponents.kt

package kotlin.io;

import java.io.File;
import java.util.*;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

// Referenced classes of package kotlin.io:
//            FilesKt, FilePathComponents

class FilesKt__FilePathComponentsKt
{

    private static final int getRootLength$FilesKt__FilePathComponentsKt(String $receiver)
    {
        int first = StringsKt.indexOf$default((CharSequence)$receiver, File.separatorChar, 0, false, 4, null);
        if(first == 0)
        {
            if($receiver.length() > 1 && $receiver.charAt(1) == File.separatorChar)
            {
                first = StringsKt.indexOf$default((CharSequence)$receiver, File.separatorChar, 2, false, 4, null);
                if(first >= 0)
                {
                    first = StringsKt.indexOf$default((CharSequence)$receiver, File.separatorChar, first + 1, false, 4, null);
                    if(first >= 0)
                        return first + 1;
                    else
                        return $receiver.length();
                }
            }
            return 1;
        }
        if(first > 0 && $receiver.charAt(first - 1) == ':')
            return ++first;
        if(first == -1 && StringsKt.endsWith$default((CharSequence)$receiver, ':', false, 2, null))
            return $receiver.length();
        else
            return 0;
    }

    public static final String getRootName(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        String s = $receiver.getPath();
        int i = 0;
        int j = getRootLength$FilesKt__FilePathComponentsKt($receiver.getPath());
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s1 = ((String)s).substring(i, j);
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return s1;
    }

    public static final File getRoot(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return new File(FilesKt.getRootName($receiver));
    }

    public static final boolean isRooted(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return getRootLength$FilesKt__FilePathComponentsKt($receiver.getPath()) > 0;
    }

    public static final FilePathComponents toComponents(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        String path = $receiver.getPath();
        int rootLength = getRootLength$FilesKt__FilePathComponentsKt(path);
        String subPath = path;
        int i = 0;
        if(subPath == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s = ((String)subPath).substring(i, rootLength);
        Intrinsics.checkExpressionValueIsNotNull(s, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        String rootName = s;
        List list = path;
        if(list == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        String s1 = ((String)list).substring(rootLength);
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.String).substring(startIndex)");
        subPath = s1;
        CharSequence charsequence = (CharSequence)subPath;
        if(charsequence.length() == 0)
        {
            list = CollectionsKt.emptyList();
        } else
        {
            Iterable $receiver$iv = (Iterable)StringsKt.split$default((CharSequence)subPath, new char[] {
                File.separatorChar
            }, false, 0, 6, null);
            Iterable iterable = $receiver$iv;
            Collection destination$iv$iv = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10));
            Collection collection;
            File file;
            for(Iterator iterator = iterable.iterator(); iterator.hasNext(); collection.add(file))
            {
                Object item$iv$iv = iterator.next();
                String it = (String)item$iv$iv;
                collection = destination$iv$iv;
                file = new File(it);
            }

            list = (List)destination$iv$iv;
        }
        return new FilePathComponents(new File(rootName), list);
    }

    public static final File subPath(File $receiver, int beginIndex, int endIndex)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return FilesKt.toComponents($receiver).subPath(beginIndex, endIndex);
    }

    public FilesKt__FilePathComponentsKt()
    {
    }
}
