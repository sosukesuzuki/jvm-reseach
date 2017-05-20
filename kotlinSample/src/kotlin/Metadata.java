// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Metadata.kt

package kotlin;

import java.lang.annotation.Annotation;

public interface Metadata
    extends Annotation
{

    public abstract int k();

    public abstract int[] mv();

    public abstract int[] bv();

    public abstract String[] d1();

    public abstract String[] d2();

    public abstract String xs();

    public abstract int xi();
}
