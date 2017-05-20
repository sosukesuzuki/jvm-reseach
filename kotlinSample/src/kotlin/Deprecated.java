// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Annotations.kt

package kotlin;

import java.lang.annotation.Annotation;

// Referenced classes of package kotlin:
//            ReplaceWith, DeprecationLevel

public interface Deprecated
    extends Annotation
{

    public abstract String message();

    public abstract ReplaceWith replaceWith();

    public abstract DeprecationLevel level();
}
