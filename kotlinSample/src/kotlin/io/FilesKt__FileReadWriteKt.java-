// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FileReadWrite.kt

package kotlin.io;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.*;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;

// Referenced classes of package kotlin.io:
//            FilesKt__FilePathComponentsKt, ConstantsKt, ByteStreamsKt, FilesKt, 
//            TextStreamsKt

class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt
{

    private static final InputStreamReader reader(File $receiver, Charset charset)
    {
        Object obj = $receiver;
        obj = (InputStream)new FileInputStream(((File) (obj)));
        return new InputStreamReader(((InputStream) (obj)), charset);
    }

    static volatile InputStreamReader reader$default(File $receiver, Charset charset, int $i$f$reader, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reader");
        if(($i$f$reader & 1) != 0)
            charset = Charsets.UTF_8;
        obj = $receiver;
        obj = (InputStream)new FileInputStream(((File) (obj)));
        return new InputStreamReader(((InputStream) (obj)), charset);
    }

    private static final BufferedReader bufferedReader(File $receiver, Charset charset, int bufferSize)
    {
        Object obj = $receiver;
        Object obj1 = obj;
        obj1 = (InputStream)new FileInputStream(((File) (obj1)));
        obj = (Reader)new InputStreamReader(((InputStream) (obj1)), charset);
        return (obj instanceof BufferedReader) ? (BufferedReader)obj : new BufferedReader(((Reader) (obj)), bufferSize);
    }

    static volatile BufferedReader bufferedReader$default(File $receiver, Charset charset, int bufferSize, int $i$f$bufferedReader, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bufferedReader");
        if(($i$f$bufferedReader & 1) != 0)
            charset = Charsets.UTF_8;
        if(($i$f$bufferedReader & 2) != 0)
            bufferSize = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj = $receiver;
        Object obj1 = obj;
        obj1 = (InputStream)new FileInputStream(((File) (obj1)));
        obj = (Reader)new InputStreamReader(((InputStream) (obj1)), charset);
        return (obj instanceof BufferedReader) ? (BufferedReader)obj : new BufferedReader(((Reader) (obj)), bufferSize);
    }

    private static final OutputStreamWriter writer(File $receiver, Charset charset)
    {
        Object obj = $receiver;
        obj = (OutputStream)new FileOutputStream(((File) (obj)));
        return new OutputStreamWriter(((OutputStream) (obj)), charset);
    }

    static volatile OutputStreamWriter writer$default(File $receiver, Charset charset, int $i$f$writer, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writer");
        if(($i$f$writer & 1) != 0)
            charset = Charsets.UTF_8;
        obj = $receiver;
        obj = (OutputStream)new FileOutputStream(((File) (obj)));
        return new OutputStreamWriter(((OutputStream) (obj)), charset);
    }

    private static final BufferedWriter bufferedWriter(File $receiver, Charset charset, int bufferSize)
    {
        Object obj = $receiver;
        Object obj1 = obj;
        obj1 = (OutputStream)new FileOutputStream(((File) (obj1)));
        obj = (Writer)new OutputStreamWriter(((OutputStream) (obj1)), charset);
        return (obj instanceof BufferedWriter) ? (BufferedWriter)obj : new BufferedWriter(((Writer) (obj)), bufferSize);
    }

    static volatile BufferedWriter bufferedWriter$default(File $receiver, Charset charset, int bufferSize, int $i$f$bufferedWriter, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bufferedWriter");
        if(($i$f$bufferedWriter & 1) != 0)
            charset = Charsets.UTF_8;
        if(($i$f$bufferedWriter & 2) != 0)
            bufferSize = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj = $receiver;
        Object obj1 = obj;
        obj1 = (OutputStream)new FileOutputStream(((File) (obj1)));
        obj = (Writer)new OutputStreamWriter(((OutputStream) (obj1)), charset);
        return (obj instanceof BufferedWriter) ? (BufferedWriter)obj : new BufferedWriter(((Writer) (obj)), bufferSize);
    }

    private static final PrintWriter printWriter(File $receiver, Charset charset)
    {
        JVM INSTR new #100 <Class PrintWriter>;
        JVM INSTR dup ;
        File file;
        int i;
        byte byte0;
        Object obj;
        file = $receiver;
        i = 0;
        byte0 = 2;
        obj = null;
        PrintWriter printwriter1;
        printwriter1;
        PrintWriter printwriter;
        printwriter;
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bufferedWriter");
        if((byte0 & 1) != 0)
            charset = Charsets.UTF_8;
        if((byte0 & 2) != 0)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj = file;
        Object obj1 = obj;
        obj1 = (OutputStream)new FileOutputStream(((File) (obj1)));
        obj = (Writer)new OutputStreamWriter(((OutputStream) (obj1)), charset);
        BufferedWriter bufferedwriter = (obj instanceof BufferedWriter) ? (BufferedWriter)obj : new BufferedWriter(((Writer) (obj)), i);
        printwriter1.PrintWriter((Writer)bufferedwriter);
        return printwriter;
    }

    static volatile PrintWriter printWriter$default(File $receiver, Charset charset, int $i$f$printWriter, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: printWriter");
        if(($i$f$printWriter & 1) != 0)
            charset = Charsets.UTF_8;
        JVM INSTR new #100 <Class PrintWriter>;
        JVM INSTR dup ;
        int i;
        byte byte0;
        Object obj1;
        obj = $receiver;
        i = 0;
        byte0 = 2;
        obj1 = null;
        PrintWriter printwriter1;
        printwriter1;
        PrintWriter printwriter;
        printwriter;
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bufferedWriter");
        if((byte0 & 1) != 0)
            charset = Charsets.UTF_8;
        if((byte0 & 2) != 0)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj1 = obj;
        Object obj2 = obj1;
        obj2 = (OutputStream)new FileOutputStream(((File) (obj2)));
        obj1 = (Writer)new OutputStreamWriter(((OutputStream) (obj2)), charset);
        BufferedWriter bufferedwriter = (obj1 instanceof BufferedWriter) ? (BufferedWriter)obj1 : new BufferedWriter(((Writer) (obj1)), i);
        printwriter1.PrintWriter((Writer)bufferedwriter);
        return printwriter;
    }

    public static final byte[] readBytes(File $receiver)
    {
        Closeable closeable;
        boolean flag;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        closeable = (Closeable)new FileInputStream($receiver);
        flag = false;
        break MISSING_BLOCK_LABEL_21;
        exception1;
        if(!flag)
            closeable.close();
        throw exception1;
        byte abyte0[];
        try
        {
            FileInputStream it = (FileInputStream)closeable;
            abyte0 = ByteStreamsKt.readBytes((InputStream)it, (int)$receiver.length());
        }
        catch(Exception exception)
        {
            flag = true;
            try
            {
                closeable.close();
            }
            catch(Exception exception2) { }
            throw (Throwable)exception;
        }
        if(!flag)
            closeable.close();
        Exception exception1;
        return (byte[])abyte0;
    }

    public static final void writeBytes(File $receiver, byte array[])
    {
        Closeable closeable;
        boolean flag;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(array, "array");
        closeable = (Closeable)new FileOutputStream($receiver);
        flag = false;
        FileOutputStream it;
        try
        {
            it = (FileOutputStream)closeable;
            it.write(array);
            it = Unit.INSTANCE;
        }
        catch(Exception exception)
        {
            flag = true;
            try
            {
                closeable.close();
            }
            catch(Exception exception2) { }
            throw (Throwable)exception;
        }
        if(!flag)
            closeable.close();
        Exception exception1;
        it;
        break MISSING_BLOCK_LABEL_98;
        exception1;
        if(!flag)
            closeable.close();
        throw exception1;
    }

    public static final void appendBytes(File $receiver, byte array[])
    {
        Closeable closeable;
        boolean flag;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(array, "array");
        closeable = (Closeable)new FileOutputStream($receiver, true);
        flag = false;
        FileOutputStream it;
        try
        {
            it = (FileOutputStream)closeable;
            it.write(array);
            it = Unit.INSTANCE;
        }
        catch(Exception exception)
        {
            flag = true;
            try
            {
                closeable.close();
            }
            catch(Exception exception2) { }
            throw (Throwable)exception;
        }
        if(!flag)
            closeable.close();
        Exception exception1;
        it;
        break MISSING_BLOCK_LABEL_99;
        exception1;
        if(!flag)
            closeable.close();
        throw exception1;
    }

    public static final String readText(File $receiver, Charset charset)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        byte abyte0[] = FilesKt.readBytes($receiver);
        return (String)new String(abyte0, charset);
    }

    public static volatile String readText$default(File file, Charset charset, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
        if((i & 1) != 0)
            charset = Charsets.UTF_8;
        return FilesKt.readText(file, charset);
    }

    public static final void writeText(File $receiver, String text, Charset charset)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        String s = text;
        File file = $receiver;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        byte abyte1[] = ((String)s).getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(abyte1, "(this as java.lang.String).getBytes(charset)");
        byte abyte0[] = abyte1;
        FilesKt.writeBytes(file, abyte0);
    }

    public static volatile void writeText$default(File file, String s, Charset charset, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeText");
        if((i & 2) != 0)
            charset = Charsets.UTF_8;
        FilesKt.writeText(file, s, charset);
    }

    public static final void appendText(File $receiver, String text, Charset charset)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        String s = text;
        File file = $receiver;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        byte abyte1[] = ((String)s).getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(abyte1, "(this as java.lang.String).getBytes(charset)");
        byte abyte0[] = abyte1;
        FilesKt.appendBytes(file, abyte0);
    }

    public static volatile void appendText$default(File file, String s, Charset charset, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendText");
        if((i & 2) != 0)
            charset = Charsets.UTF_8;
        FilesKt.appendText(file, s, charset);
    }

    public static final void forEachBlock(File $receiver, Function2 action)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(action, "action");
        FilesKt.forEachBlock($receiver, ConstantsKt.DEFAULT_BLOCK_SIZE, action);
    }

    public static final void forEachBlock(File $receiver, int blockSize, Function2 action)
    {
        byte arr[];
        FileInputStream fis;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(action, "action");
        arr = new byte[RangesKt.coerceAtLeast(blockSize, ConstantsKt.MINIMUM_BLOCK_SIZE)];
        fis = new FileInputStream($receiver);
        do
        {
            int size = fis.read(arr);
            if(size <= 0)
                break;
            action.invoke(arr, Integer.valueOf(size));
        } while(true);
        fis.close();
        break MISSING_BLOCK_LABEL_85;
        Exception exception;
        exception;
        fis.close();
        throw exception;
    }

    public static final void forEachLine(File $receiver, Charset charset, Function1 action)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        Intrinsics.checkParameterIsNotNull(action, "action");
        TextStreamsKt.forEachLine((Reader)new BufferedReader((Reader)new InputStreamReader((InputStream)new FileInputStream($receiver), charset)), action);
    }

    public static volatile void forEachLine$default(File file, Charset charset, Function1 function1, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEachLine");
        if((i & 1) != 0)
            charset = Charsets.UTF_8;
        FilesKt.forEachLine(file, charset, function1);
    }

    private static final FileInputStream inputStream(File $receiver)
    {
        return new FileInputStream($receiver);
    }

    private static final FileOutputStream outputStream(File $receiver)
    {
        return new FileOutputStream($receiver);
    }

    public static final List readLines(File $receiver, Charset charset)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        ArrayList result = new ArrayList();
        FilesKt.forEachLine($receiver, charset, (Function1)new Function1(result) {

            public volatile Object invoke(Object obj)
            {
                invoke((String)obj);
                return Unit.INSTANCE;
            }

            public final void invoke(String it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                $result.add(it);
            }

            final ArrayList $result;

            
            {
                $result = arraylist;
                super(1);
            }
        }
);
        return (List)result;
    }

    public static volatile List readLines$default(File file, Charset charset, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readLines");
        if((i & 1) != 0)
            charset = Charsets.UTF_8;
        return FilesKt.readLines(file, charset);
    }

    public static final Object useLines(File $receiver, Charset charset, Function1 block)
    {
        Object obj;
        boolean flag;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        Intrinsics.checkParameterIsNotNull(block, "block");
        obj = $receiver;
        int i = 0;
        byte byte0 = 2;
        Object obj1 = null;
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bufferedReader");
        if((byte0 & 1) != 0)
            charset = Charsets.UTF_8;
        if((byte0 & 2) != 0)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj1 = obj;
        Object obj2 = obj1;
        obj2 = (InputStream)new FileInputStream(((File) (obj2)));
        obj1 = (Reader)new InputStreamReader(((InputStream) (obj2)), charset);
        obj = (Closeable)((obj1 instanceof BufferedReader) ? (BufferedReader)obj1 : new BufferedReader(((Reader) (obj1)), i));
        flag = false;
        break MISSING_BLOCK_LABEL_147;
        exception1;
        InlineMarker.finallyStart(1);
        if(!flag)
            ((Closeable) (obj)).close();
        InlineMarker.finallyEnd(1);
        throw exception1;
        BufferedReader it;
        try
        {
            it = (BufferedReader)obj;
            it = ((BufferedReader) (block.invoke(TextStreamsKt.lineSequence(it))));
        }
        catch(Exception exception)
        {
            flag = true;
            try
            {
                ((Closeable) (obj)).close();
            }
            catch(Exception exception2) { }
            throw (Throwable)exception;
        }
        InlineMarker.finallyStart(1);
        if(!flag)
            ((Closeable) (obj)).close();
        InlineMarker.finallyEnd(1);
        Exception exception1;
        return it;
    }

    public static volatile Object useLines$default(File $receiver, Charset charset, Function1 block, int $i$f$useLines, Object obj)
    {
        boolean flag;
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: useLines");
        if(($i$f$useLines & 1) != 0)
            charset = Charsets.UTF_8;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(charset, "charset");
        Intrinsics.checkParameterIsNotNull(block, "block");
        obj = $receiver;
        int i = 0;
        byte byte0 = 2;
        Object obj1 = null;
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bufferedReader");
        if((byte0 & 1) != 0)
            charset = Charsets.UTF_8;
        if((byte0 & 2) != 0)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj1 = obj;
        Object obj2 = obj1;
        obj2 = (InputStream)new FileInputStream(((File) (obj2)));
        obj1 = (Reader)new InputStreamReader(((InputStream) (obj2)), charset);
        obj = (Closeable)((obj1 instanceof BufferedReader) ? (BufferedReader)obj1 : new BufferedReader(((Reader) (obj1)), i));
        flag = false;
        break MISSING_BLOCK_LABEL_173;
        exception1;
        InlineMarker.finallyStart(1);
        if(!flag)
            ((Closeable) (obj)).close();
        InlineMarker.finallyEnd(1);
        throw exception1;
        BufferedReader it;
        try
        {
            it = (BufferedReader)obj;
            it = ((BufferedReader) (block.invoke(TextStreamsKt.lineSequence(it))));
        }
        catch(Exception exception)
        {
            flag = true;
            try
            {
                ((Closeable) (obj)).close();
            }
            catch(Exception exception2) { }
            throw (Throwable)exception;
        }
        InlineMarker.finallyStart(1);
        if(!flag)
            ((Closeable) (obj)).close();
        InlineMarker.finallyEnd(1);
        Exception exception1;
        return it;
    }

    public FilesKt__FileReadWriteKt()
    {
    }
}
