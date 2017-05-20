// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PropertyReference1.java

package kotlin.jvm.internal;

import kotlin.reflect.*;

// Referenced classes of package kotlin.jvm.internal:
//            PropertyReference, Reflection

public class PropertyReference1 extends PropertyReference
    implements KProperty1
{

    public PropertyReference1()
    {
    }

    protected KCallable computeReflected()
    {
        return Reflection.property1(this);
    }

    public Object get(Object receiver)
    {
        return ((KProperty1)getReflected()).get(receiver);
    }

    public Object invoke(Object receiver)
    {
        return get(receiver);
    }

    public kotlin.reflect.KProperty1.Getter getGetter()
    {
        return ((KProperty1)getReflected()).getGetter();
    }

    public volatile kotlin.reflect.KProperty.Getter getGetter()
    {
        return getGetter();
    }
}
