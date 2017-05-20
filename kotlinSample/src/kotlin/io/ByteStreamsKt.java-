// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IOStreams.kt

package kotlin.io;

import java.io.*;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.TypeCastException;
import kotlin.collections.ByteIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

// Referenced classes of package kotlin.io:
//            ConstantsKt

public final class ByteStreamsKt
{

    public static final ByteIterator iterator(BufferedInputStream $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return (ByteIterator)new ByteIterator($receiver) {

            public final int getNextByte()
            {
                return nextByte;
            }

            public final void setNextByte(int <set-?>)
            {
                nextByte = <set-?>;
            }

            public final boolean getNextPrepared()
            {
                return nextPrepared;
            }

            public final void setNextPrepared(boolean <set-?>)
            {
                nextPrepared = <set-?>;
            }

            public final boolean getFinished()
            {
                return finished;
            }

            public final void setFinished(boolean <set-?>)
            {
                finished = <set-?>;
            }

            private final void prepareNext()
            {
                if(!nextPrepared && !finished)
                {
                    nextByte = receiver$0.read();
                    nextPrepared = true;
                    finished = nextByte == -1;
                }
            }

            public boolean hasNext()
            {
                prepareNext();
                return !finished;
            }

            public byte nextByte()
            {
                prepareNext();
                if(finished)
                {
                    throw (Throwable)new NoSuchElementException("Input stream is over.");
                } else
                {
                    byte res = (byte)nextByte;
                    nextPrepared = false;
                    return res;
                }
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private int nextByte;
            private boolean nextPrepared;
            private boolean finished;
            final BufferedInputStream receiver$0;

            
            {
                receiver$0 = $receiver;
                super();
                nextByte = -1;
            }
        }
;
    }

    private static final ByteArrayInputStream byteInputStream(String $receiver, Charset charset)
    {
        JVM INSTR new #32  <Class ByteArrayInputStream>;
        JVM INSTR dup ;
        String s = $receiver;
        ByteArrayInputStream bytearrayinputstream1;
        bytearrayinputstream1;
        ByteArrayInputStream bytearrayinputstream;
        bytearrayinputstream;
        if(s == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        byte abyte1[] = ((String)s).getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(abyte1, "(this as java.lang.String).getBytes(charset)");
        byte abyte0[] = abyte1;
        bytearrayinputstream1.ByteArrayInputStream(abyte0);
        return bytearrayinputstream;
    }

    static volatile ByteArrayInputStream byteInputStream$default(String $receiver, Charset charset, int $i$f$byteInputStream, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: byteInputStream");
        if(($i$f$byteInputStream & 1) != 0)
            charset = Charsets.UTF_8;
        JVM INSTR new #32  <Class ByteArrayInputStream>;
        JVM INSTR dup ;
        obj = $receiver;
        ByteArrayInputStream bytearrayinputstream1;
        bytearrayinputstream1;
        ByteArrayInputStream bytearrayinputstream;
        bytearrayinputstream;
        if(obj == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        byte abyte1[] = ((String)obj).getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(abyte1, "(this as java.lang.String).getBytes(charset)");
        byte abyte0[] = abyte1;
        bytearrayinputstream1.ByteArrayInputStream(abyte0);
        return bytearrayinputstream;
    }

    private static final ByteArrayInputStream inputStream(byte $receiver[])
    {
        return new ByteArrayInputStream($receiver);
    }

    private static final ByteArrayInputStream inputStream(byte $receiver[], int offset, int length)
    {
        return new ByteArrayInputStream($receiver, offset, length);
    }

    private static final BufferedInputStream buffered(InputStream $receiver, int bufferSize)
    {
        return ($receiver instanceof BufferedInputStream) ? (BufferedInputStream)$receiver : new BufferedInputStream($receiver, bufferSize);
    }

    static volatile BufferedInputStream buffered$default(InputStream $receiver, int bufferSize, int $i$f$buffered, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(($i$f$buffered & 1) != 0)
            bufferSize = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return ($receiver instanceof BufferedInputStream) ? (BufferedInputStream)$receiver : new BufferedInputStream($receiver, bufferSize);
    }

    private static final InputStreamReader reader(InputStream $receiver, Charset charset)
    {
        return new InputStreamReader($receiver, charset);
    }

    static volatile InputStreamReader reader$default(InputStream $receiver, Charset charset, int $i$f$reader, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reader");
        if(($i$f$reader & 1) != 0)
            charset = Charsets.UTF_8;
        return new InputStreamReader($receiver, charset);
    }

    private static final BufferedReader bufferedReader(InputStream $receiver, Charset charset)
    {
        Object obj = $receiver;
        obj = (Reader)new InputStreamReader(((InputStream) (obj)), charset);
        int i = 0;
        boolean flag = true;
        Object obj1 = null;
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(flag & true)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return (obj instanceof BufferedReader) ? (BufferedReader)obj : new BufferedReader(((Reader) (obj)), i);
    }

    static volatile BufferedReader bufferedReader$default(InputStream $receiver, Charset charset, int $i$f$bufferedReader, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bufferedReader");
        if(($i$f$bufferedReader & 1) != 0)
            charset = Charsets.UTF_8;
        obj = $receiver;
        obj = (Reader)new InputStreamReader(((InputStream) (obj)), charset);
        int i = 0;
        boolean flag = true;
        Object obj1 = null;
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(flag & true)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return (obj instanceof BufferedReader) ? (BufferedReader)obj : new BufferedReader(((Reader) (obj)), i);
    }

    private static final BufferedOutputStream buffered(OutputStream $receiver, int bufferSize)
    {
        return ($receiver instanceof BufferedOutputStream) ? (BufferedOutputStream)$receiver : new BufferedOutputStream($receiver, bufferSize);
    }

    static volatile BufferedOutputStream buffered$default(OutputStream $receiver, int bufferSize, int $i$f$buffered, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(($i$f$buffered & 1) != 0)
            bufferSize = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return ($receiver instanceof BufferedOutputStream) ? (BufferedOutputStream)$receiver : new BufferedOutputStream($receiver, bufferSize);
    }

    private static final OutputStreamWriter writer(OutputStream $receiver, Charset charset)
    {
        return new OutputStreamWriter($receiver, charset);
    }

    static volatile OutputStreamWriter writer$default(OutputStream $receiver, Charset charset, int $i$f$writer, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writer");
        if(($i$f$writer & 1) != 0)
            charset = Charsets.UTF_8;
        return new OutputStreamWriter($receiver, charset);
    }

    private static final BufferedWriter bufferedWriter(OutputStream $receiver, Charset charset)
    {
        Object obj = $receiver;
        obj = (Writer)new OutputStreamWriter(((OutputStream) (obj)), charset);
        int i = 0;
        boolean flag = true;
        Object obj1 = null;
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(flag & true)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return (obj instanceof BufferedWriter) ? (BufferedWriter)obj : new BufferedWriter(((Writer) (obj)), i);
    }

    static volatile BufferedWriter bufferedWriter$default(OutputStream $receiver, Charset charset, int $i$f$bufferedWriter, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bufferedWriter");
        if(($i$f$bufferedWriter & 1) != 0)
            charset = Charsets.UTF_8;
        obj = $receiver;
        obj = (Writer)new OutputStreamWriter(((OutputStream) (obj)), charset);
        int i = 0;
        boolean flag = true;
        Object obj1 = null;
        if(obj1 != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buffered");
        if(flag & true)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return (obj instanceof BufferedWriter) ? (BufferedWriter)obj : new BufferedWriter(((Writer) (obj)), i);
    }

    public static final long copyTo(InputStream $receiver, OutputStream out, int bufferSize)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(out, "out");
        long bytesCopied = 0L;
        byte buffer[] = new byte[bufferSize];
        for(int bytes = $receiver.read(buffer); bytes >= 0; bytes = $receiver.read(buffer))
        {
            out.write(buffer, 0, bytes);
            bytesCopied += bytes;
        }

        return bytesCopied;
    }

    public static volatile long copyTo$default(InputStream inputstream, OutputStream outputstream, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyTo");
        if((j & 2) != 0)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return copyTo(inputstream, outputstream, i);
    }

    public static final byte[] readBytes(InputStream $receiver, int estimatedSize)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(estimatedSize);
        copyTo$default($receiver, (OutputStream)buffer, 0, 2, null);
        byte abyte0[] = buffer.toByteArray();
        Intrinsics.checkExpressionValueIsNotNull(abyte0, "buffer.toByteArray()");
        return abyte0;
    }

    public static volatile byte[] readBytes$default(InputStream inputstream, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readBytes");
        if((j & 1) != 0)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return readBytes(inputstream, i);
    }
}
