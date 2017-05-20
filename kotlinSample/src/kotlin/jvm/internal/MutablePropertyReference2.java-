// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MutablePropertyReference2.java

package kotlin.jvm.internal;

import kotlin.reflect.*;

// Referenced classes of package kotlin.jvm.internal:
//            MutablePropertyReference, Reflection

public class MutablePropertyReference2 extends MutablePropertyReference
    implements KMutableProperty2
{

    public MutablePropertyReference2()
    {
    }

    protected KCallable computeReflected()
    {
        return Reflection.mutableProperty2(this);
    }

    public Object get(Object receiver1, Object receiver2)
    {
        return ((KMutableProperty2)getReflected()).get(receiver1, receiver2);
    }

    public void set(Object receiver1, Object receiver2, Object value)
    {
        ((KMutableProperty2)getReflected()).set(receiver1, receiver2, value);
    }

    public Object invoke(Object receiver1, Object receiver2)
    {
        return get(receiver1, receiver2);
    }

    public kotlin.reflect.KProperty2.Getter getGetter()
    {
        return ((KMutableProperty2)getReflected()).getGetter();
    }

    public kotlin.reflect.KMutableProperty2.Setter getSetter()
    {
        return ((KMutableProperty2)getReflected()).getSetter();
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
