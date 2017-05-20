// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ClassReference.kt

package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KClass;

// Referenced classes of package kotlin.jvm.internal:
//            ClassBasedDeclarationContainer, Intrinsics

public final class ClassReference
    implements KClass, ClassBasedDeclarationContainer
{

    public String getSimpleName()
    {
        error();
        throw null;
    }

    public String getQualifiedName()
    {
        error();
        throw null;
    }

    public Collection getMembers()
    {
        error();
        throw null;
    }

    public Collection getConstructors()
    {
        error();
        throw null;
    }

    public Collection getNestedClasses()
    {
        error();
        throw null;
    }

    public List getAnnotations()
    {
        error();
        throw null;
    }

    public Object getObjectInstance()
    {
        error();
        throw null;
    }

    private final Void error()
    {
        throw (Throwable)new KotlinReflectionNotSupportedError();
    }

    public boolean equals(Object other)
    {
        return (other instanceof ClassReference) && Intrinsics.areEqual(getJClass(), ((ClassReference)other).getJClass());
    }

    public int hashCode()
    {
        return getJClass().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getJClass().toString()).append(" (Kotlin reflection is not available)").toString();
    }

    public Class getJClass()
    {
        return jClass;
    }

    public ClassReference(Class jClass)
    {
        Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        super();
        this.jClass = jClass;
    }

    private final Class jClass;
}
