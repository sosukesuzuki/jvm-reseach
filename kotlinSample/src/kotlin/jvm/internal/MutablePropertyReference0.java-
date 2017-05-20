// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MutablePropertyReference0.java

package kotlin.jvm.internal;

import kotlin.reflect.*;

// Referenced classes of package kotlin.jvm.internal:
//            MutablePropertyReference, Reflection

public class MutablePropertyReference0 extends MutablePropertyReference
    implements KMutableProperty0
{

    public MutablePropertyReference0()
    {
    }

    protected KCallable computeReflected()
    {
        return Reflection.mutableProperty0(this);
    }

    public Object get()
    {
        return ((KMutableProperty0)getReflected()).get();
    }

    public void set(Object value)
    {
        ((KMutableProperty0)getReflected()).set(value);
    }

    public Object invoke()
    {
        return get();
    }

    public kotlin.reflect.KProperty0.Getter getGetter()
    {
        return ((KMutableProperty0)getReflected()).getGetter();
    }

    public kotlin.reflect.KMutableProperty0.Setter getSetter()
    {
        return ((KMutableProperty0)getReflected()).getSetter();
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
