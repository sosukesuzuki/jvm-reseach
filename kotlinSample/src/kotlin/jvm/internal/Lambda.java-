// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Lambda.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            FunctionImpl, Reflection

public abstract class Lambda extends FunctionImpl
{

    public int getArity()
    {
        return arity;
    }

    public String toString()
    {
        return Reflection.renderLambdaToString(this);
    }

    public Lambda(int arity)
    {
        this.arity = arity;
    }

    private final int arity;
}
