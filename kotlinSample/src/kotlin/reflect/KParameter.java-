// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KParameter.kt

package kotlin.reflect;


// Referenced classes of package kotlin.reflect:
//            KAnnotatedElement, KType

public interface KParameter
    extends KAnnotatedElement
{
    public static final class Kind extends Enum
    {

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(kotlin/reflect/KParameter$Kind, s);
        }

        public static final Kind INSTANCE;
        public static final Kind EXTENSION_RECEIVER;
        public static final Kind VALUE;
        private static final Kind $VALUES[];

        static 
        {
            Kind akind[] = new Kind[3];
            akind;
            akind[0] = INSTANCE = new Kind("INSTANCE", 0);
            akind[1] = EXTENSION_RECEIVER = new Kind("EXTENSION_RECEIVER", 1);
            akind[2] = VALUE = new Kind("VALUE", 2);
            $VALUES = akind;
        }

        protected Kind(String $enum_name_or_ordinal$0, int $enum_name_or_ordinal$1)
        {
            super($enum_name_or_ordinal$0, $enum_name_or_ordinal$1);
        }
    }


    public abstract int getIndex();

    public abstract String getName();

    public abstract KType getType();

    public abstract Kind getKind();

    public abstract boolean isOptional();
}
