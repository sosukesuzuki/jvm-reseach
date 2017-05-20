// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ClassBasedDeclarationContainer.kt

package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

public interface ClassBasedDeclarationContainer
    extends KDeclarationContainer
{

    public abstract Class getJClass();
}
