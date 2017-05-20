// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Intrinsics.java

package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

public class Intrinsics
{

    private Intrinsics()
    {
    }

    public static String stringPlus(String self, Object other)
    {
        return (new StringBuilder()).append(self).append(other).toString();
    }

    public static void checkNotNull(Object object)
    {
        if(object == null)
            throwNpe();
    }

    public static void checkNotNull(Object object, String message)
    {
        if(object == null)
            throwNpe(message);
    }

    public static void throwNpe()
    {
        throw (KotlinNullPointerException)sanitizeStackTrace(new KotlinNullPointerException());
    }

    public static void throwNpe(String message)
    {
        throw (KotlinNullPointerException)sanitizeStackTrace(new KotlinNullPointerException(message));
    }

    public static void throwUninitializedProperty(String message)
    {
        throw (UninitializedPropertyAccessException)sanitizeStackTrace(new UninitializedPropertyAccessException(message));
    }

    public static void throwUninitializedPropertyAccessException(String propertyName)
    {
        throwUninitializedProperty((new StringBuilder()).append("lateinit property ").append(propertyName).append(" has not been initialized").toString());
    }

    public static void throwAssert()
    {
        throw (AssertionError)sanitizeStackTrace(new AssertionError());
    }

    public static void throwAssert(String message)
    {
        throw (AssertionError)sanitizeStackTrace(new AssertionError(message));
    }

    public static void throwIllegalArgument()
    {
        throw (IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException());
    }

    public static void throwIllegalArgument(String message)
    {
        throw (IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException(message));
    }

    public static void throwIllegalState()
    {
        throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException());
    }

    public static void throwIllegalState(String message)
    {
        throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(message));
    }

    public static void checkExpressionValueIsNotNull(Object value, String expression)
    {
        if(value == null)
            throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException((new StringBuilder()).append(expression).append(" must not be null").toString()));
        else
            return;
    }

    public static void checkNotNullExpressionValue(Object value, String message)
    {
        if(value == null)
            throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(message));
        else
            return;
    }

    public static void checkReturnedValueIsNotNull(Object value, String className, String methodName)
    {
        if(value == null)
            throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException((new StringBuilder()).append("Method specified as non-null returned null: ").append(className).append(".").append(methodName).toString()));
        else
            return;
    }

    public static void checkReturnedValueIsNotNull(Object value, String message)
    {
        if(value == null)
            throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(message));
        else
            return;
    }

    public static void checkFieldIsNotNull(Object value, String className, String fieldName)
    {
        if(value == null)
            throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException((new StringBuilder()).append("Field specified as non-null is null: ").append(className).append(".").append(fieldName).toString()));
        else
            return;
    }

    public static void checkFieldIsNotNull(Object value, String message)
    {
        if(value == null)
            throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(message));
        else
            return;
    }

    public static void checkParameterIsNotNull(Object value, String paramName)
    {
        if(value == null)
            throwParameterIsNullException(paramName);
    }

    public static void checkNotNullParameter(Object value, String message)
    {
        if(value == null)
            throw (IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException(message));
        else
            return;
    }

    private static void throwParameterIsNullException(String paramName)
    {
        StackTraceElement stackTraceElements[] = Thread.currentThread().getStackTrace();
        StackTraceElement caller = stackTraceElements[3];
        String className = caller.getClassName();
        String methodName = caller.getMethodName();
        IllegalArgumentException exception = new IllegalArgumentException((new StringBuilder()).append("Parameter specified as non-null is null: method ").append(className).append(".").append(methodName).append(", parameter ").append(paramName).toString());
        throw (IllegalArgumentException)sanitizeStackTrace(exception);
    }

    public static int compare(long thisVal, long anotherVal)
    {
        return thisVal >= anotherVal ? ((int) (thisVal != anotherVal ? 1 : 0)) : -1;
    }

    public static int compare(int thisVal, int anotherVal)
    {
        return thisVal >= anotherVal ? ((int) (thisVal != anotherVal ? 1 : 0)) : -1;
    }

    public static boolean areEqual(Object first, Object second)
    {
        return first != null ? first.equals(second) : second == null;
    }

    public static void throwUndefinedForReified()
    {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUndefinedForReified(String message)
    {
        throw new UnsupportedOperationException(message);
    }

    public static void reifiedOperationMarker(int id, String typeParameterIdentifier)
    {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int id, String typeParameterIdentifier, String message)
    {
        throwUndefinedForReified(message);
    }

    public static void needClassReification()
    {
        throwUndefinedForReified();
    }

    public static void needClassReification(String message)
    {
        throwUndefinedForReified(message);
    }

    public static void checkHasClass(String internalName)
        throws ClassNotFoundException
    {
        String fqName = internalName.replace('/', '.');
        try
        {
            Class.forName(fqName);
        }
        catch(ClassNotFoundException e)
        {
            throw (ClassNotFoundException)sanitizeStackTrace(new ClassNotFoundException((new StringBuilder()).append("Class ").append(fqName).append(" is not found. Please update the Kotlin runtime to the latest version").toString(), e));
        }
    }

    public static void checkHasClass(String internalName, String requiredVersion)
        throws ClassNotFoundException
    {
        String fqName = internalName.replace('/', '.');
        try
        {
            Class.forName(fqName);
        }
        catch(ClassNotFoundException e)
        {
            throw (ClassNotFoundException)sanitizeStackTrace(new ClassNotFoundException((new StringBuilder()).append("Class ").append(fqName).append(" is not found: this code requires the Kotlin runtime of version at least ").append(requiredVersion).toString(), e));
        }
    }

    private static Throwable sanitizeStackTrace(Throwable throwable)
    {
        return sanitizeStackTrace(throwable, kotlin/jvm/internal/Intrinsics.getName());
    }

    static Throwable sanitizeStackTrace(Throwable throwable, String classNameToDrop)
    {
        StackTraceElement stackTrace[] = throwable.getStackTrace();
        int size = stackTrace.length;
        int lastIntrinsic = -1;
        for(int i = 0; i < size; i++)
            if(classNameToDrop.equals(stackTrace[i].getClassName()))
                lastIntrinsic = i;

        List list = Arrays.asList(stackTrace).subList(lastIntrinsic + 1, size);
        throwable.setStackTrace((StackTraceElement[])list.toArray(new StackTraceElement[list.size()]));
        return throwable;
    }
}
