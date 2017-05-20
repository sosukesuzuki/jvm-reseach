// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PropertyReference2.java

package kotlin.jvm.internal;

import kotlin.reflect.*;

// Referenced classes of package kotlin.jvm.internal:
//            PropertyReference, Reflection

public class PropertyReference2 extends PropertyReference
    implements KProperty2
{

    public PropertyReference2()
    {
    }

    protected KCallable computeReflected()
    {
        return Reflection.property2(this);
    }

    public Object get(Object receiver1, Object receiver2)
    {
        return ((KProperty2)getReflected()).get(receiver1, receiver2);
    }

    public Object invoke(Object receiver1, Object receiver2)
    {
        return get(receiver1, receiver2);
    }

    public kotlin.reflect.KProperty2.Getter getGetter()
    {
        return ((KProperty2)getReflected()).getGetter();
    }

    public volatile kotlin.reflect.KProperty.Getter getGetter()
    {
        return getGetter();
    }
}
