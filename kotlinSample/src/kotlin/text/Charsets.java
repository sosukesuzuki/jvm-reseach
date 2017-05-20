// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Charsets.kt

package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

public final class Charsets
{

    public final Charset UTF32()
    {
        utf_32;
        if(utf_32 == null) goto _L2; else goto _L1
_L2:
        JVM INSTR pop ;
        Charset charset;
        Charset charset1;
        Charsets charsets = this;
        Charsets $receiver = (Charsets)charsets;
        charset1 = Charset.forName("UTF-32");
        Intrinsics.checkExpressionValueIsNotNull(charset1, "Charset.forName(\"UTF-32\")");
        charset = charset1;
        utf_32 = charset;
        (Charset)charset;
_L1:
        return;
    }

    public final Charset UTF32_LE()
    {
        utf_32le;
        if(utf_32le == null) goto _L2; else goto _L1
_L2:
        JVM INSTR pop ;
        Charset charset;
        Charset charset1;
        Charsets charsets = this;
        Charsets $receiver = (Charsets)charsets;
        charset1 = Charset.forName("UTF-32LE");
        Intrinsics.checkExpressionValueIsNotNull(charset1, "Charset.forName(\"UTF-32LE\")");
        charset = charset1;
        utf_32le = charset;
        (Charset)charset;
_L1:
        return;
    }

    public final Charset UTF32_BE()
    {
        utf_32be;
        if(utf_32be == null) goto _L2; else goto _L1
_L2:
        JVM INSTR pop ;
        Charset charset;
        Charset charset1;
        Charsets charsets = this;
        Charsets $receiver = (Charsets)charsets;
        charset1 = Charset.forName("UTF-32BE");
        Intrinsics.checkExpressionValueIsNotNull(charset1, "Charset.forName(\"UTF-32BE\")");
        charset = charset1;
        utf_32be = charset;
        (Charset)charset;
_L1:
        return;
    }

    private Charsets()
    {
        Charset charset = Charset.forName("UTF-8");
        Intrinsics.checkExpressionValueIsNotNull(charset, "Charset.forName(\"UTF-8\")");
        UTF_8 = charset;
        Charset charset1 = Charset.forName("UTF-16");
        Intrinsics.checkExpressionValueIsNotNull(charset1, "Charset.forName(\"UTF-16\")");
        UTF_16 = charset1;
        Charset charset2 = Charset.forName("UTF-16BE");
        Intrinsics.checkExpressionValueIsNotNull(charset2, "Charset.forName(\"UTF-16BE\")");
        UTF_16BE = charset2;
        Charset charset3 = Charset.forName("UTF-16LE");
        Intrinsics.checkExpressionValueIsNotNull(charset3, "Charset.forName(\"UTF-16LE\")");
        UTF_16LE = charset3;
        Charset charset4 = Charset.forName("US-ASCII");
        Intrinsics.checkExpressionValueIsNotNull(charset4, "Charset.forName(\"US-ASCII\")");
        US_ASCII = charset4;
        Charset charset5 = Charset.forName("ISO-8859-1");
        Intrinsics.checkExpressionValueIsNotNull(charset5, "Charset.forName(\"ISO-8859-1\")");
        ISO_8859_1 = charset5;
    }

    public static final Charset UTF_8;
    public static final Charset UTF_16;
    public static final Charset UTF_16BE;
    public static final Charset UTF_16LE;
    public static final Charset US_ASCII;
    public static final Charset ISO_8859_1;
    private static Charset utf_32;
    private static Charset utf_32le;
    private static Charset utf_32be;
    public static final Charsets INSTANCE = (Charsets)this;

    static 
    {
        new Charsets();
    }
}
