// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MutablePropertyReference1Impl.java

package kotlin.jvm.internal;

import kotlin.reflect.*;

// Referenced classes of package kotlin.jvm.internal:
//            MutablePropertyReference1

public class MutablePropertyReference1Impl extends MutablePropertyReference1
{

    public MutablePropertyReference1Impl(KDeclarationContainer owner, String name, String signature)
    {
        this.owner = owner;
        this.name = name;
        this.signature = signature;
    }

    public KDeclarationContainer getOwner()
    {
        return owner;
    }

    public String getName()
    {
        return name;
    }

    public String getSignature()
    {
        return signature;
    }

    public Object get(Object receiver)
    {
        return getGetter().call(new Object[] {
            receiver
        });
    }

    public void set(Object receiver, Object value)
    {
        getSetter().call(new Object[] {
            receiver, value
        });
    }

    private final KDeclarationContainer owner;
    private final String name;
    private final String signature;
}
