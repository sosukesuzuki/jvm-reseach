// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FunctionReference.java

package kotlin.jvm.internal;

import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.*;

// Referenced classes of package kotlin.jvm.internal:
//            FunctionImpl, Reflection

public class FunctionReference extends FunctionImpl
    implements KFunction
{

    public FunctionReference(int arity)
    {
        this.arity = arity;
    }

    public int getArity()
    {
        return arity;
    }

    public KDeclarationContainer getOwner()
    {
        throw new AbstractMethodError();
    }

    public String getName()
    {
        throw new AbstractMethodError();
    }

    public String getSignature()
    {
        throw new AbstractMethodError();
    }

    public List getParameters()
    {
        return getReflected().getParameters();
    }

    public KType getReturnType()
    {
        return getReflected().getReturnType();
    }

    public List getAnnotations()
    {
        return getReflected().getAnnotations();
    }

    public transient Object call(Object args[])
    {
        if(args == null)
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[] {
                "args", "kotlin/jvm/internal/FunctionReference", "call"
            }));
        else
            return getReflected().call(args);
    }

    public Object callBy(Map args)
    {
        if(args == null)
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[] {
                "args", "kotlin/jvm/internal/FunctionReference", "callBy"
            }));
        else
            return getReflected().callBy(args);
    }

    public boolean equals(Object obj)
    {
        if(obj == this)
            return true;
        if(obj instanceof FunctionReference)
        {
            FunctionReference other = (FunctionReference)obj;
            return getOwner().equals(other.getOwner()) && getName().equals(other.getName()) && getSignature().equals(other.getSignature());
        }
        if(obj instanceof KFunction)
        {
            compute();
            return obj.equals(reflected);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return (getOwner().hashCode() * 31 + getName().hashCode()) * 31 + getSignature().hashCode();
    }

    public String toString()
    {
        compute();
        if(reflected != this)
            return reflected.toString();
        else
            return "<init>".equals(getName()) ? "constructor (Kotlin reflection is not available)" : (new StringBuilder()).append("function ").append(getName()).append(" (Kotlin reflection is not available)").toString();
    }

    public KFunction compute()
    {
        if(reflected == null)
            reflected = Reflection.function(this);
        return reflected;
    }

    private KFunction getReflected()
    {
        compute();
        if(reflected == this)
            throw new KotlinReflectionNotSupportedError();
        else
            return reflected;
    }

    private final int arity;
    private KFunction reflected;
}
