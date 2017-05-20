// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KClass.kt

package kotlin.reflect;

import java.util.Collection;

// Referenced classes of package kotlin.reflect:
//            KDeclarationContainer, KAnnotatedElement

public interface KClass
    extends KDeclarationContainer, KAnnotatedElement
{

    public abstract String getSimpleName();

    public abstract String getQualifiedName();

    public abstract Collection getMembers();

    public abstract Collection getConstructors();

    public abstract Collection getNestedClasses();

    public abstract Object getObjectInstance();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
