// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReflectionFactory.java

package kotlin.jvm.internal;

import kotlin.reflect.*;

// Referenced classes of package kotlin.jvm.internal:
//            ClassReference, Lambda, FunctionReference, PropertyReference0, 
//            MutablePropertyReference0, PropertyReference1, MutablePropertyReference1, PropertyReference2, 
//            MutablePropertyReference2

public class ReflectionFactory
{

    public ReflectionFactory()
    {
    }

    public KClass createKotlinClass(Class javaClass)
    {
        return new ClassReference(javaClass);
    }

    public KClass createKotlinClass(Class javaClass, String internalName)
    {
        return new ClassReference(javaClass);
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class javaClass, String moduleName)
    {
        return null;
    }

    public KClass getOrCreateKotlinClass(Class javaClass)
    {
        return new ClassReference(javaClass);
    }

    public KClass getOrCreateKotlinClass(Class javaClass, String internalName)
    {
        return new ClassReference(javaClass);
    }

    public String renderLambdaToString(Lambda lambda)
    {
        String result = lambda.getClass().getGenericInterfaces()[0].toString();
        return result.startsWith("kotlin.jvm.functions.") ? result.substring("kotlin.jvm.functions.".length()) : result;
    }

    public KFunction function(FunctionReference f)
    {
        return f;
    }

    public KProperty0 property0(PropertyReference0 p)
    {
        return p;
    }

    public KMutableProperty0 mutableProperty0(MutablePropertyReference0 p)
    {
        return p;
    }

    public KProperty1 property1(PropertyReference1 p)
    {
        return p;
    }

    public KMutableProperty1 mutableProperty1(MutablePropertyReference1 p)
    {
        return p;
    }

    public KProperty2 property2(PropertyReference2 p)
    {
        return p;
    }

    public KMutableProperty2 mutableProperty2(MutablePropertyReference2 p)
    {
        return p;
    }

    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";
}
