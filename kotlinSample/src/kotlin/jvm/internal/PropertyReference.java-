// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PropertyReference.java

package kotlin.jvm.internal;

import kotlin.reflect.KProperty;

// Referenced classes of package kotlin.jvm.internal:
//            CallableReference

public abstract class PropertyReference extends CallableReference
    implements KProperty
{

    public PropertyReference()
    {
    }

    public boolean equals(Object obj)
    {
        if(obj == this)
            return true;
        if(obj instanceof PropertyReference)
        {
            PropertyReference other = (PropertyReference)obj;
            return getOwner().equals(other.getOwner()) && getName().equals(other.getName()) && getSignature().equals(other.getSignature());
        }
        if(obj instanceof KProperty)
        {
            compute();
            return obj.equals(reflected);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return (getOwner().hashCode() * 31 + getName().hashCode()) * 31 + getSignature().hashCode();
    }

    public String toString()
    {
        compute();
        if(reflected != this)
            return reflected.toString();
        else
            return (new StringBuilder()).append("property ").append(getName()).append(" (Kotlin reflection is not available)").toString();
    }
}
