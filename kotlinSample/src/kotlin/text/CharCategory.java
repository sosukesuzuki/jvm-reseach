// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CharCategory.kt

package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.*;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

public final class CharCategory extends Enum
{
    public static final class Companion
    {

        private final Map getCategoryMap()
        {
            Lazy lazy = CharCategory.categoryMap$delegate;
            Companion companion = this;
            KProperty kproperty = $$delegatedProperties[0];
            return (Map)lazy.getValue();
        }

        public final CharCategory valueOf(int category)
        {
            CharCategory charcategory = (CharCategory)getCategoryMap().get(Integer.valueOf(category));
            charcategory;
            if(charcategory != null)
                break MISSING_BLOCK_LABEL_62;
            JVM INSTR pop ;
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Category #").append(category).append(" is not defined.").toString());
            return;
        }

        private static final KProperty $$delegatedProperties[] = {
            (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(kotlin/text/CharCategory$Companion), "categoryMap", "getCategoryMap()Ljava/util/Map;"))
        };


        private Companion()
        {
        }

        public Companion(DefaultConstructorMarker $constructor_marker)
        {
            this();
        }
    }


    public final boolean contains(char char)
    {
        return Character.getType(char) == value;
    }

    public final int getValue()
    {
        return value;
    }

    public final String getCode()
    {
        return code;
    }

    protected CharCategory(String $enum_name_or_ordinal$0, int $enum_name_or_ordinal$1, int value, String code)
    {
        Intrinsics.checkParameterIsNotNull(code, "code");
        super($enum_name_or_ordinal$0, $enum_name_or_ordinal$1);
        this.value = value;
        this.code = code;
    }

    public static CharCategory[] values()
    {
        return (CharCategory[])$VALUES.clone();
    }

    public static CharCategory valueOf(String s)
    {
        return (CharCategory)Enum.valueOf(kotlin/text/CharCategory, s);
    }

    public static final CharCategory UNASSIGNED;
    public static final CharCategory UPPERCASE_LETTER;
    public static final CharCategory LOWERCASE_LETTER;
    public static final CharCategory TITLECASE_LETTER;
    public static final CharCategory MODIFIER_LETTER;
    public static final CharCategory OTHER_LETTER;
    public static final CharCategory NON_SPACING_MARK;
    public static final CharCategory ENCLOSING_MARK;
    public static final CharCategory COMBINING_SPACING_MARK;
    public static final CharCategory DECIMAL_DIGIT_NUMBER;
    public static final CharCategory LETTER_NUMBER;
    public static final CharCategory OTHER_NUMBER;
    public static final CharCategory SPACE_SEPARATOR;
    public static final CharCategory LINE_SEPARATOR;
    public static final CharCategory PARAGRAPH_SEPARATOR;
    public static final CharCategory CONTROL;
    public static final CharCategory FORMAT;
    public static final CharCategory PRIVATE_USE;
    public static final CharCategory SURROGATE;
    public static final CharCategory DASH_PUNCTUATION;
    public static final CharCategory START_PUNCTUATION;
    public static final CharCategory END_PUNCTUATION;
    public static final CharCategory CONNECTOR_PUNCTUATION;
    public static final CharCategory OTHER_PUNCTUATION;
    public static final CharCategory MATH_SYMBOL;
    public static final CharCategory CURRENCY_SYMBOL;
    public static final CharCategory MODIFIER_SYMBOL;
    public static final CharCategory OTHER_SYMBOL;
    public static final CharCategory INITIAL_QUOTE_PUNCTUATION;
    public static final CharCategory FINAL_QUOTE_PUNCTUATION;
    private static final CharCategory $VALUES[];
    private final int value;
    private final String code;
    private static final Lazy categoryMap$delegate;
    public static final Companion Companion;

    static 
    {
        CharCategory acharcategory[] = new CharCategory[30];
        acharcategory;
        acharcategory[0] = UNASSIGNED = new CharCategory("UNASSIGNED", 0, 0, "Cn");
        acharcategory[1] = UPPERCASE_LETTER = new CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");
        acharcategory[2] = LOWERCASE_LETTER = new CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");
        acharcategory[3] = TITLECASE_LETTER = new CharCategory("TITLECASE_LETTER", 3, 3, "Lt");
        acharcategory[4] = MODIFIER_LETTER = new CharCategory("MODIFIER_LETTER", 4, 4, "Lm");
        acharcategory[5] = OTHER_LETTER = new CharCategory("OTHER_LETTER", 5, 5, "Lo");
        acharcategory[6] = NON_SPACING_MARK = new CharCategory("NON_SPACING_MARK", 6, 6, "Mn");
        acharcategory[7] = ENCLOSING_MARK = new CharCategory("ENCLOSING_MARK", 7, 7, "Me");
        acharcategory[8] = COMBINING_SPACING_MARK = new CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");
        acharcategory[9] = DECIMAL_DIGIT_NUMBER = new CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
        acharcategory[10] = LETTER_NUMBER = new CharCategory("LETTER_NUMBER", 10, 10, "Nl");
        acharcategory[11] = OTHER_NUMBER = new CharCategory("OTHER_NUMBER", 11, 11, "No");
        acharcategory[12] = SPACE_SEPARATOR = new CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");
        acharcategory[13] = LINE_SEPARATOR = new CharCategory("LINE_SEPARATOR", 13, 13, "Zl");
        acharcategory[14] = PARAGRAPH_SEPARATOR = new CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
        acharcategory[15] = CONTROL = new CharCategory("CONTROL", 15, 15, "Cc");
        acharcategory[16] = FORMAT = new CharCategory("FORMAT", 16, 16, "Cf");
        acharcategory[17] = PRIVATE_USE = new CharCategory("PRIVATE_USE", 17, 18, "Co");
        acharcategory[18] = SURROGATE = new CharCategory("SURROGATE", 18, 19, "Cs");
        acharcategory[19] = DASH_PUNCTUATION = new CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");
        acharcategory[20] = START_PUNCTUATION = new CharCategory("START_PUNCTUATION", 20, 21, "Ps");
        acharcategory[21] = END_PUNCTUATION = new CharCategory("END_PUNCTUATION", 21, 22, "Pe");
        acharcategory[22] = CONNECTOR_PUNCTUATION = new CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
        acharcategory[23] = OTHER_PUNCTUATION = new CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");
        acharcategory[24] = MATH_SYMBOL = new CharCategory("MATH_SYMBOL", 24, 25, "Sm");
        acharcategory[25] = CURRENCY_SYMBOL = new CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");
        acharcategory[26] = MODIFIER_SYMBOL = new CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");
        acharcategory[27] = OTHER_SYMBOL = new CharCategory("OTHER_SYMBOL", 27, 28, "So");
        acharcategory[28] = INITIAL_QUOTE_PUNCTUATION = new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
        acharcategory[29] = FINAL_QUOTE_PUNCTUATION = new CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");
        $VALUES = acharcategory;
        Companion = new Companion(null);
        static final class Companion.categoryMap._cls2 extends Lambda
            implements Function0
        {

            public volatile Object invoke()
            {
                return invoke();
            }

            public final Map invoke()
            {
                Object $receiver$iv[] = (Object[])CharCategory.values();
                int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity($receiver$iv.length), 16);
                Object $receiver$iv$iv[] = $receiver$iv;
                Map destination$iv$iv = (Map)new LinkedHashMap(capacity$iv);
                for(int i = 0; i < $receiver$iv$iv.length; i++)
                {
                    Object element$iv$iv = $receiver$iv$iv[i];
                    CharCategory charcategory = (CharCategory)element$iv$iv;
                    Map map = destination$iv$iv;
                    Integer integer = Integer.valueOf(charcategory.getValue());
                    map.put(integer, element$iv$iv);
                }

                return destination$iv$iv;
            }

            public static final Companion.categoryMap._cls2 INSTANCE = new Companion.categoryMap._cls2();


        }

        categoryMap$delegate = LazyKt.lazy((Function0)Companion.categoryMap._cls2.INSTANCE);
    }

}
