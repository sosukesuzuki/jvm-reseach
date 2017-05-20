// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Exceptions.kt

package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.io:
//            ExceptionsKt

public class FileSystemException extends IOException
{

    public final File getFile()
    {
        return file;
    }

    public final File getOther()
    {
        return other;
    }

    public final String getReason()
    {
        return reason;
    }

    public FileSystemException(File file, File other, String reason)
    {
        Intrinsics.checkParameterIsNotNull(file, "file");
        super(ExceptionsKt.access$constructMessage(file, other, reason));
        this.file = file;
        this.other = other;
        this.reason = reason;
    }

    public FileSystemException(File file1, File file2, String s, int i, DefaultConstructorMarker defaultconstructormarker)
    {
        if((i & 2) != 0)
            file2 = (File)null;
        if((i & 4) != 0)
            s = (String)null;
        this(file1, file2, s);
    }

    private final File file;
    private final File other;
    private final String reason;
}
