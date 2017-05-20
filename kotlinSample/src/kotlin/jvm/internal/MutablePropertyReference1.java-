// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MutablePropertyReference1.java

package kotlin.jvm.internal;

import kotlin.reflect.*;

// Referenced classes of package kotlin.jvm.internal:
//            MutablePropertyReference, Reflection

public class MutablePropertyReference1 extends MutablePropertyReference
    implements KMutableProperty1
{

    public MutablePropertyReference1()
    {
    }

    protected KCallable computeReflected()
    {
        return Reflection.mutableProperty1(this);
    }

    public Object get(Object receiver)
    {
        return ((KMutableProperty1)getReflected()).get(receiver);
    }

    public void set(Object receiver, Object value)
    {
        ((KMutableProperty1)getReflected()).set(receiver, value);
    }

    public Object invoke(Object receiver)
    {
        return get(receiver);
    }

    public kotlin.reflect.KProperty1.Getter getGetter()
    {
        return ((KMutableProperty1)getReflected()).getGetter();
    }

    public kotlin.reflect.KMutableProperty1.Setter getSetter()
    {
        return ((KMutableProperty1)getReflected()).getSetter();
    }

    public volatile kotlin.reflect.KMutableProperty.Setter getSetter()
    {
        return getSetter();
    }

    public volatile kotlin.reflect.KProperty.Getter getGetter()
    {
        return getGetter();
    }
}
