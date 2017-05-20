// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CallableReference.java

package kotlin.jvm.internal;

import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.*;

public abstract class CallableReference
    implements KCallable
{

    public CallableReference()
    {
    }

    protected abstract KCallable computeReflected();

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
                "args", "kotlin/jvm/internal/CallableReference", "call"
            }));
        else
            return getReflected().call(args);
    }

    public Object callBy(Map args)
    {
        if(args == null)
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[] {
                "args", "kotlin/jvm/internal/CallableReference", "callBy"
            }));
        else
            return getReflected().callBy(args);
    }

    public KCallable compute()
    {
        if(reflected == null)
            reflected = computeReflected();
        return reflected;
    }

    protected KCallable getReflected()
    {
        compute();
        if(reflected == this)
            throw new KotlinReflectionNotSupportedError();
        else
            return reflected;
    }

    protected KCallable reflected;
}
