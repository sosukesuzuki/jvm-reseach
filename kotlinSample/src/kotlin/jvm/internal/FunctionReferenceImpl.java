// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FunctionReferenceImpl.java

package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

// Referenced classes of package kotlin.jvm.internal:
//            FunctionReference

public class FunctionReferenceImpl extends FunctionReference
{

    public FunctionReferenceImpl(int arity, KDeclarationContainer owner, String name, String signature)
    {
        super(arity);
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

    private final KDeclarationContainer owner;
    private final String name;
    private final String signature;
}
