// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Annotations.kt

package kotlin;

import java.lang.annotation.Annotation;

public interface ReplaceWith
    extends Annotation
{

    public abstract String expression();

    public abstract String[] imports();
}
