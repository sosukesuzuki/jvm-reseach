// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PropertyReference2Impl.java

package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty2;

// Referenced classes of package kotlin.jvm.internal:
//            PropertyReference2

public class PropertyReference2Impl extends PropertyReference2
{

    public PropertyReference2Impl(KDeclarationContainer owner, String name, String signature)
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

    public Object get(Object receiver1, Object receiver2)
    {
        return getGetter().call(new Object[] {
            receiver1, receiver2
        });
    }

    private final KDeclarationContainer owner;
    private final String name;
    private final String signature;
}
