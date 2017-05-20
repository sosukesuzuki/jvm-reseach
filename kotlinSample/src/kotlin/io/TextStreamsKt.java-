// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReadWrite.kt

package kotlin.io;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.*;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

// Referenced classes of package kotlin.io:
//            ConstantsKt, LinesSequence, ByteStreamsKt

public final class TextStreamsKt
{

    private static final BufferedReader buffered(Reader $receiver, int bufferSize)
    {
        return ($receiver instanceof BufferedReader) ? (BufferedReader)$receiver : new BufferedReader($receiver, bufferSize);
    }

    static volatile BufferedReader buffered$default(Reader $receiver, int bufferSize, int $i$f$buffered, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(($i$f$buffered & 1) != 0)
            bufferSize = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return ($receiver instanceof BufferedReader) ? (BufferedReader)$receiver : new BufferedReader($receiver, bufferSize);
    }

    private static final BufferedWriter buffered(Writer $receiver, int bufferSize)
    {
        return ($receiver instanceof BufferedWriter) ? (BufferedWriter)$receiver : new BufferedWriter($receiver, bufferSize);
    }

    static volatile BufferedWriter buffered$default(Writer $receiver, int bufferSize, int $i$f$buffered, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(($i$f$buffered & 1) != 0)
            bufferSize = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return ($receiver instanceof BufferedWriter) ? (BufferedWriter)$receiver : new BufferedWriter($receiver, bufferSize);
    }

    public static final void forEachLine(Reader $receiver, Function1 action)
    {
        Object obj;
        boolean flag;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(action, "action");
        Reader reader1 = $receiver;
        obj = reader1;
        int i = 0;
        boolean flag1 = true;
        Object obj1 = null;
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(flag1 & true)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj = (Closeable)((obj instanceof BufferedReader) ? (BufferedReader)obj : new BufferedReader(((Reader) (obj)), i));
        flag = false;
        BufferedReader it$iv;
        try
        {
            it$iv = (BufferedReader)obj;
            Sequence it = (Sequence)lineSequence(it$iv);
            Sequence sequence = it;
            Function1 action$iv = action;
            Object element$iv;
            for(Iterator iterator = sequence.iterator(); iterator.hasNext(); action$iv.invoke(element$iv))
                element$iv = iterator.next();

            it$iv = Unit.INSTANCE;
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
        if(!flag)
            ((Closeable) (obj)).close();
        Exception exception1;
        it$iv;
        break MISSING_BLOCK_LABEL_213;
        exception1;
        if(!flag)
            ((Closeable) (obj)).close();
        throw exception1;
    }

    public static final List readLines(Reader $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        ArrayList result = CollectionsKt.arrayListOf(new String[0]);
        forEachLine($receiver, (Function1)new Function1(result) {

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

    public static final Object useLines(Reader $receiver, Function1 block)
    {
        Object obj;
        boolean flag;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(block, "block");
        obj = $receiver;
        int i = 0;
        boolean flag1 = true;
        Object obj1 = null;
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(flag1 & true)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj = (Closeable)((obj instanceof BufferedReader) ? (BufferedReader)obj : new BufferedReader(((Reader) (obj)), i));
        flag = false;
        break MISSING_BLOCK_LABEL_83;
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
            it = ((BufferedReader) (block.invoke(lineSequence(it))));
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

    private static final StringReader reader(String $receiver)
    {
        return new StringReader($receiver);
    }

    public static final Sequence lineSequence(BufferedReader $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return SequencesKt.constrainOnce((Sequence)new LinesSequence($receiver));
    }

    public static final String readText(Reader $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        StringWriter buffer = new StringWriter();
        copyTo$default($receiver, (Writer)buffer, 0, 2, null);
        String s = buffer.toString();
        Intrinsics.checkExpressionValueIsNotNull(s, "buffer.toString()");
        return s;
    }

    public static final long copyTo(Reader $receiver, Writer out, int bufferSize)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(out, "out");
        long charsCopied = 0L;
        char buffer[] = new char[bufferSize];
        for(int chars = $receiver.read(buffer); chars >= 0; chars = $receiver.read(buffer))
        {
            out.write(buffer, 0, chars);
            charsCopied += chars;
        }

        return charsCopied;
    }

    public static volatile long copyTo$default(Reader reader1, Writer writer, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyTo");
        if((j & 2) != 0)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return copyTo(reader1, writer, i);
    }

    private static final String readText(URL $receiver, Charset charset)
    {
        byte abyte0[] = readBytes($receiver);
        return (String)new String(abyte0, charset);
    }

    static volatile String readText$default(URL $receiver, Charset charset, int $i$f$readText, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
        if(($i$f$readText & 1) != 0)
            charset = Charsets.UTF_8;
        obj = readBytes($receiver);
        return (String)new String(((byte []) (obj)), charset);
    }

    public static final byte[] readBytes(URL $receiver)
    {
        Closeable closeable;
        boolean flag;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        closeable = (Closeable)$receiver.openStream();
        flag = false;
        break MISSING_BLOCK_LABEL_17;
        exception1;
        if(!flag)
            closeable.close();
        throw exception1;
        byte abyte0[];
        try
        {
            InputStream it = (InputStream)closeable;
            abyte0 = ByteStreamsKt.readBytes$default(it, 0, 1, null);
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

    private static final Object use(Closeable $receiver, Function1 block)
    {
        boolean closed = false;
        Object obj;
        try
        {
            obj = block.invoke($receiver);
        }
        catch(Exception e)
        {
            closed = true;
            try
            {
                $receiver.close();
            }
            catch(Exception exception1) { }
            throw (Throwable)e;
        }
        InlineMarker.finallyStart(1);
        if(!closed)
            $receiver.close();
        InlineMarker.finallyEnd(1);
        return obj;
        Exception exception;
        exception;
        InlineMarker.finallyStart(1);
        if(!closed)
            $receiver.close();
        InlineMarker.finallyEnd(1);
        throw exception;
    }
}
