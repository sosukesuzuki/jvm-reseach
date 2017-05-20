// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FileTreeWalk.kt

package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.io:
//            FilesKt__FileReadWriteKt, FileTreeWalk, FileWalkDirection, FilesKt

class FilesKt__FileTreeWalkKt extends FilesKt__FileReadWriteKt
{

    public static final FileTreeWalk walk(File $receiver, FileWalkDirection direction)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(direction, "direction");
        return new FileTreeWalk($receiver, direction);
    }

    public static volatile FileTreeWalk walk$default(File file, FileWalkDirection filewalkdirection, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: walk");
        if((i & 1) != 0)
            filewalkdirection = FileWalkDirection.TOP_DOWN;
        return FilesKt.walk(file, filewalkdirection);
    }

    public static final FileTreeWalk walkTopDown(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return FilesKt.walk($receiver, FileWalkDirection.TOP_DOWN);
    }

    public static final FileTreeWalk walkBottomUp(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return FilesKt.walk($receiver, FileWalkDirection.BOTTOM_UP);
    }

    public FilesKt__FileTreeWalkKt()
    {
    }
}
