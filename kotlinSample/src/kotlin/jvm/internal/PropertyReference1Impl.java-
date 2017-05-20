// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PropertyReference1Impl.java

package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;

// Referenced classes of package kotlin.jvm.internal:
//            PropertyReference1

public class PropertyReference1Impl extends PropertyReference1
{

    public PropertyReference1Impl(KDeclarationContainer owner, String name, String signature)
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

    private final KDeclarationContainer owner;
    private final String name;
    private final String signature;
}
