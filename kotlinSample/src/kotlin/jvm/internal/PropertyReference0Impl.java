// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PropertyReference0Impl.java

package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty0;

// Referenced classes of package kotlin.jvm.internal:
//            PropertyReference0

public class PropertyReference0Impl extends PropertyReference0
{

    public PropertyReference0Impl(KDeclarationContainer owner, String name, String signature)
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

    public Object get()
    {
        return getGetter().call(new Object[0]);
    }

    private final KDeclarationContainer owner;
    private final String name;
    private final String signature;
}
