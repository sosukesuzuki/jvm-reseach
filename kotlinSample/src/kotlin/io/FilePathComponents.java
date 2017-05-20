// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FilePathComponents.kt

package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class FilePathComponents
{

    public final String getRootName()
    {
        String s = root.getPath();
        Intrinsics.checkExpressionValueIsNotNull(s, "root.path");
        return s;
    }

    public final boolean isRooted()
    {
        CharSequence charsequence = (CharSequence)root.getPath();
        return charsequence.length() > 0;
    }

    public final int getSize()
    {
        return segments.size();
    }

    public final File subPath(int beginIndex, int endIndex)
    {
        if(beginIndex < 0 || beginIndex > endIndex || endIndex > getSize())
        {
            throw (Throwable)new IllegalArgumentException();
        } else
        {
            CharSequence charsequence = (CharSequence)File.separator;
            Intrinsics.checkExpressionValueIsNotNull(charsequence, "File.separator");
            return new File(CollectionsKt.joinToString$default((Iterable)segments.subList(beginIndex, endIndex), charsequence, null, null, 0, null, null, 62, null));
        }
    }

    public final File getRoot()
    {
        return root;
    }

    public final List getSegments()
    {
        return segments;
    }

    public FilePathComponents(File root, List segments)
    {
        Intrinsics.checkParameterIsNotNull(root, "root");
        Intrinsics.checkParameterIsNotNull(segments, "segments");
        super();
        this.root = root;
        this.segments = segments;
    }

    public final File component1()
    {
        return root;
    }

    public final List component2()
    {
        return segments;
    }

    public final FilePathComponents copy(File root, List segments)
    {
        Intrinsics.checkParameterIsNotNull(root, "root");
        Intrinsics.checkParameterIsNotNull(segments, "segments");
        return new FilePathComponents(root, segments);
    }

    public static volatile FilePathComponents copy$default(FilePathComponents filepathcomponents, File file, List list, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        if((i & 1) != 0)
            file = filepathcomponents.root;
        if((i & 2) != 0)
            list = filepathcomponents.segments;
        return filepathcomponents.copy(file, list);
    }

    public String toString()
    {
        return (new StringBuilder()).append("FilePathComponents(root=").append(root).append(", segments=").append(segments).append(")").toString();
    }

    public int hashCode()
    {
        root;
        if(root == null) goto _L2; else goto _L1
_L1:
        hashCode();
          goto _L3
_L2:
        JVM INSTR pop ;
        false;
_L3:
        31;
        JVM INSTR imul ;
        segments == null ? 0 : segments.hashCode();
        JVM INSTR iadd ;
        return;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if(this != obj)
            {
                if(!(obj instanceof FilePathComponents))
                    break label0;
                FilePathComponents filepathcomponents = (FilePathComponents)obj;
                if(!Intrinsics.areEqual(root, filepathcomponents.root) || !Intrinsics.areEqual(segments, filepathcomponents.segments))
                    break label0;
            }
            return true;
        }
        return false;
    }

    private final File root;
    private final List segments;
}
