// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   NotNull.java

package org.jetbrains.annotations;

import java.lang.annotation.Annotation;

public interface NotNull
    extends Annotation
{

    public abstract String value();
}