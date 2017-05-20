// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Annotations.kt

package kotlin.annotation;


public final class AnnotationRetention extends Enum
{

    protected AnnotationRetention(String $enum_name_or_ordinal$0, int $enum_name_or_ordinal$1)
    {
        super($enum_name_or_ordinal$0, $enum_name_or_ordinal$1);
    }

    public static AnnotationRetention[] values()
    {
        return (AnnotationRetention[])$VALUES.clone();
    }

    public static AnnotationRetention valueOf(String s)
    {
        return (AnnotationRetention)Enum.valueOf(kotlin/annotation/AnnotationRetention, s);
    }

    public static final AnnotationRetention SOURCE;
    public static final AnnotationRetention BINARY;
    public static final AnnotationRetention RUNTIME;
    private static final AnnotationRetention $VALUES[];

    static 
    {
        AnnotationRetention aannotationretention[] = new AnnotationRetention[3];
        aannotationretention;
        aannotationretention[0] = SOURCE = new AnnotationRetention("SOURCE", 0);
        aannotationretention[1] = BINARY = new AnnotationRetention("BINARY", 1);
        aannotationretention[2] = RUNTIME = new AnnotationRetention("RUNTIME", 2);
        $VALUES = aannotationretention;
    }
}
