// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exceptions.kt

package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.io:
//            FileSystemException

public final class FileAlreadyExistsException extends FileSystemException
{

    public FileAlreadyExistsException(File file, File other, String reason)
    {
        Intrinsics.checkParameterIsNotNull(file, "file");
        super(file, other, reason);
    }

    public FileAlreadyExistsException(File file, File file1, String s, int i, DefaultConstructorMarker defaultconstructormarker)
    {
        if((i & 2) != 0)
            file1 = (File)null;
        if((i & 4) != 0)
            s = (String)null;
        this(file, file1, s);
    }
}
