// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Annotations.kt

package kotlin.annotation;


public final class AnnotationTarget extends Enum
{

    protected AnnotationTarget(String $enum_name_or_ordinal$0, int $enum_name_or_ordinal$1)
    {
        super($enum_name_or_ordinal$0, $enum_name_or_ordinal$1);
    }

    public static AnnotationTarget[] values()
    {
        return (AnnotationTarget[])$VALUES.clone();
    }

    public static AnnotationTarget valueOf(String s)
    {
        return (AnnotationTarget)Enum.valueOf(kotlin/annotation/AnnotationTarget, s);
    }

    public static final AnnotationTarget CLASS;
    public static final AnnotationTarget ANNOTATION_CLASS;
    public static final AnnotationTarget TYPE_PARAMETER;
    public static final AnnotationTarget PROPERTY;
    public static final AnnotationTarget FIELD;
    public static final AnnotationTarget LOCAL_VARIABLE;
    public static final AnnotationTarget VALUE_PARAMETER;
    public static final AnnotationTarget CONSTRUCTOR;
    public static final AnnotationTarget FUNCTION;
    public static final AnnotationTarget PROPERTY_GETTER;
    public static final AnnotationTarget PROPERTY_SETTER;
    public static final AnnotationTarget TYPE;
    public static final AnnotationTarget EXPRESSION;
    public static final AnnotationTarget FILE;
    private static final AnnotationTarget $VALUES[];

    static 
    {
        AnnotationTarget aannotationtarget[] = new AnnotationTarget[14];
        aannotationtarget;
        aannotationtarget[0] = CLASS = new AnnotationTarget("CLASS", 0);
        aannotationtarget[1] = ANNOTATION_CLASS = new AnnotationTarget("ANNOTATION_CLASS", 1);
        aannotationtarget[2] = TYPE_PARAMETER = new AnnotationTarget("TYPE_PARAMETER", 2);
        aannotationtarget[3] = PROPERTY = new AnnotationTarget("PROPERTY", 3);
        aannotationtarget[4] = FIELD = new AnnotationTarget("FIELD", 4);
        aannotationtarget[5] = LOCAL_VARIABLE = new AnnotationTarget("LOCAL_VARIABLE", 5);
        aannotationtarget[6] = VALUE_PARAMETER = new AnnotationTarget("VALUE_PARAMETER", 6);
        aannotationtarget[7] = CONSTRUCTOR = new AnnotationTarget("CONSTRUCTOR", 7);
        aannotationtarget[8] = FUNCTION = new AnnotationTarget("FUNCTION", 8);
        aannotationtarget[9] = PROPERTY_GETTER = new AnnotationTarget("PROPERTY_GETTER", 9);
        aannotationtarget[10] = PROPERTY_SETTER = new AnnotationTarget("PROPERTY_SETTER", 10);
        aannotationtarget[11] = TYPE = new AnnotationTarget("TYPE", 11);
        aannotationtarget[12] = EXPRESSION = new AnnotationTarget("EXPRESSION", 12);
        aannotationtarget[13] = FILE = new AnnotationTarget("FILE", 13);
        $VALUES = aannotationtarget;
    }
}
