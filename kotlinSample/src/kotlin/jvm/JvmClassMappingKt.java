// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JvmClassMapping.kt

package kotlin.jvm;

import java.lang.annotation.Annotation;
import kotlin.TypeCastException;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

public final class JvmClassMappingKt
{

    public static final Class getJavaClass(KClass $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.jvm.internal.ClassBasedDeclarationContainer");
        (ClassBasedDeclarationContainer);
        getJClass();
        JVM INSTR dup ;
        JVM INSTR ifnonnull 43;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_33;
_L2:
        break MISSING_BLOCK_LABEL_43;
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        (Class);
        return;
    }

    public static final Class getJavaPrimitiveType(KClass $receiver)
    {
        String s;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.jvm.internal.ClassBasedDeclarationContainer");
        Class thisJClass = ((ClassBasedDeclarationContainer)$receiver).getJClass();
        if(thisJClass.isPrimitive())
        {
            if(thisJClass == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
            return (Class)thisJClass;
        }
        s = thisJClass.getCanonicalName();
        s;
        if(s != null) goto _L2; else goto _L1
_L1:
        JVM INSTR pop ;
          goto _L3
_L2:
        hashCode();
        JVM INSTR lookupswitch 8: default 292
    //                   -2056817302: 196
    //                   -527879800: 232
    //                   -515992664: 208
    //                   155276373: 184
    //                   344809556: 160
    //                   398507100: 220
    //                   398795216: 172
    //                   761287205: 148;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        if(!s.equals("java.lang.Double")) goto _L3; else goto _L12
_L8:
        if(!s.equals("java.lang.Boolean")) goto _L3; else goto _L13
_L10:
        if(!s.equals("java.lang.Long")) goto _L3; else goto _L14
_L7:
        if(!s.equals("java.lang.Character")) goto _L3; else goto _L15
_L4:
        if(!s.equals("java.lang.Integer")) goto _L3; else goto _L16
_L6:
        if(!s.equals("java.lang.Short")) goto _L3; else goto _L17
_L9:
        if(!s.equals("java.lang.Byte")) goto _L3; else goto _L18
_L5:
        if(!s.equals("java.lang.Float")) goto _L3; else goto _L19
_L13:
        Boolean.TYPE;
          goto _L20
_L15:
        Character.TYPE;
          goto _L20
_L18:
        Byte.TYPE;
          goto _L20
_L17:
        Short.TYPE;
          goto _L20
_L16:
        Integer.TYPE;
          goto _L20
_L19:
        Float.TYPE;
          goto _L20
_L14:
        Long.TYPE;
          goto _L20
_L12:
        Double.TYPE;
          goto _L20
_L3:
        (Class)null;
_L20:
        (Class);
        return;
    }

    public static final Class getJavaObjectType(KClass $receiver)
    {
        Class thisJClass;
        String s;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.jvm.internal.ClassBasedDeclarationContainer");
        thisJClass = ((ClassBasedDeclarationContainer)$receiver).getJClass();
        if(!thisJClass.isPrimitive())
        {
            if(thisJClass == null)
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
            return (Class)thisJClass;
        }
        s = thisJClass.getCanonicalName();
        s;
        if(s != null) goto _L2; else goto _L1
_L1:
        JVM INSTR pop ;
          goto _L3
_L2:
        hashCode();
        JVM INSTR lookupswitch 8: default 284
    //                   -1325958191: 208
    //                   104431: 184
    //                   3039496: 160
    //                   3052374: 172
    //                   3327612: 220
    //                   64711720: 196
    //                   97526364: 232
    //                   109413500: 148;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        if(!s.equals("short")) goto _L3; else goto _L12
_L6:
        if(!s.equals("byte")) goto _L3; else goto _L13
_L7:
        if(!s.equals("char")) goto _L3; else goto _L14
_L5:
        if(!s.equals("int")) goto _L3; else goto _L15
_L9:
        if(!s.equals("boolean")) goto _L3; else goto _L16
_L4:
        if(!s.equals("double")) goto _L3; else goto _L17
_L8:
        if(!s.equals("long")) goto _L3; else goto _L18
_L10:
        if(!s.equals("float")) goto _L3; else goto _L19
_L16:
        java/lang/Boolean;
          goto _L20
_L14:
        java/lang/Character;
          goto _L20
_L13:
        java/lang/Byte;
          goto _L20
_L12:
        java/lang/Short;
          goto _L20
_L15:
        java/lang/Integer;
          goto _L20
_L19:
        java/lang/Float;
          goto _L20
_L18:
        java/lang/Long;
          goto _L20
_L17:
        java/lang/Double;
          goto _L20
_L3:
        thisJClass;
_L20:
        JVM INSTR dup ;
        JVM INSTR ifnonnull 299;
           goto _L21 _L22
_L21:
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
_L22:
        (Class);
        return;
    }

    public static final KClass getKotlinClass(Class $receiver)
    {
        KClass kclass;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        kclass = Reflection.createKotlinClass($receiver);
        kclass;
        if(kclass == null)
            throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KClass<T>");
        (KClass);
        return;
    }

    public static final Class getJavaClass(Object $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
        (Object);
        getClass();
        JVM INSTR dup ;
        JVM INSTR ifnonnull 41;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_31;
_L2:
        break MISSING_BLOCK_LABEL_41;
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        (Class);
        return;
    }

    /**
     * @deprecated Method javaClass$annotations is deprecated
     */

    private static final void javaClass$annotations(KClass kclass)
    {
    }

    /**
     * @deprecated Method getRuntimeClassOfKClassInstance is deprecated
     */

    public static final Class getRuntimeClassOfKClassInstance(KClass $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
        (Object);
        getClass();
        JVM INSTR dup ;
        JVM INSTR ifnonnull 41;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_31;
_L2:
        break MISSING_BLOCK_LABEL_41;
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T>>");
        (Class);
        return;
    }

    private static final boolean isArrayOf(Object $receiver[])
    {
        Intrinsics.reifiedOperationMarker(4, "T");
        return java/lang/Object.isAssignableFrom(((Object) ($receiver)).getClass().getComponentType());
    }

    public static final KClass getAnnotationClass(Annotation $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        $receiver;
        if($receiver == null)
            throw new TypeCastException("null cannot be cast to non-null type java.lang.annotation.Annotation");
        (Annotation);
        annotationType();
        getKotlinClass();
        JVM INSTR dup ;
        JVM INSTR ifnonnull 46;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_36;
_L2:
        break MISSING_BLOCK_LABEL_46;
        throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
        (KClass);
        return;
    }
}
