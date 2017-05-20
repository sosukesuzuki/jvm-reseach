// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Reflection.java

package kotlin.jvm.internal;

import kotlin.reflect.*;

// Referenced classes of package kotlin.jvm.internal:
//            ReflectionFactory, Lambda, FunctionReference, PropertyReference0, 
//            MutablePropertyReference0, PropertyReference1, MutablePropertyReference1, PropertyReference2, 
//            MutablePropertyReference2

public class Reflection
{

    public Reflection()
    {
    }

    public static KClass createKotlinClass(Class javaClass)
    {
        return factory.createKotlinClass(javaClass);
    }

    public static KClass createKotlinClass(Class javaClass, String internalName)
    {
        return factory.createKotlinClass(javaClass, internalName);
    }

    public static KDeclarationContainer getOrCreateKotlinPackage(Class javaClass, String moduleName)
    {
        return factory.getOrCreateKotlinPackage(javaClass, moduleName);
    }

    public static KClass getOrCreateKotlinClass(Class javaClass)
    {
        return factory.getOrCreateKotlinClass(javaClass);
    }

    public static KClass getOrCreateKotlinClass(Class javaClass, String internalName)
    {
        return factory.getOrCreateKotlinClass(javaClass, internalName);
    }

    public static KClass[] getOrCreateKotlinClasses(Class javaClasses[])
    {
        int size = javaClasses.length;
        if(size == 0)
            return EMPTY_K_CLASS_ARRAY;
        KClass kClasses[] = new KClass[size];
        for(int i = 0; i < size; i++)
            kClasses[i] = getOrCreateKotlinClass(javaClasses[i]);

        return kClasses;
    }

    public static String renderLambdaToString(Lambda lambda)
    {
        return factory.renderLambdaToString(lambda);
    }

    public static KFunction function(FunctionReference f)
    {
        return factory.function(f);
    }

    public static KProperty0 property0(PropertyReference0 p)
    {
        return factory.property0(p);
    }

    public static KMutableProperty0 mutableProperty0(MutablePropertyReference0 p)
    {
        return factory.mutableProperty0(p);
    }

    public static KProperty1 property1(PropertyReference1 p)
    {
        return factory.property1(p);
    }

    public static KMutableProperty1 mutableProperty1(MutablePropertyReference1 p)
    {
        return factory.mutableProperty1(p);
    }

    public static KProperty2 property2(PropertyReference2 p)
    {
        return factory.property2(p);
    }

    public static KMutableProperty2 mutableProperty2(MutablePropertyReference2 p)
    {
        return factory.mutableProperty2(p);
    }

    private static final ReflectionFactory factory;
    static final String REFLECTION_NOT_AVAILABLE = " (Kotlin reflection is not available)";
    private static final KClass EMPTY_K_CLASS_ARRAY[] = new KClass[0];

    static 
    {
        ReflectionFactory impl;
        try
        {
            Class implClass = Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl");
            impl = (ReflectionFactory)implClass.newInstance();
        }
        catch(ClassCastException e)
        {
            impl = null;
        }
        catch(ClassNotFoundException e)
        {
            impl = null;
        }
        catch(InstantiationException e)
        {
            impl = null;
        }
        catch(IllegalAccessException e)
        {
            impl = null;
        }
        factory = impl == null ? new ReflectionFactory() : impl;
    }
}
