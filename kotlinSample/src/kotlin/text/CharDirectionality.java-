// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CharDirectionality.kt

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

public final class CharDirectionality extends Enum
{
    public static final class Companion
    {

        private final Map getDirectionalityMap()
        {
            Lazy lazy = CharDirectionality.directionalityMap$delegate;
            Companion companion = this;
            KProperty kproperty = $$delegatedProperties[0];
            return (Map)lazy.getValue();
        }

        public final CharDirectionality valueOf(int directionality)
        {
            CharDirectionality chardirectionality = (CharDirectionality)getDirectionalityMap().get(Integer.valueOf(directionality));
            chardirectionality;
            if(chardirectionality != null)
                break MISSING_BLOCK_LABEL_62;
            JVM INSTR pop ;
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("Directionality #").append(directionality).append(" is not defined.").toString());
            return;
        }

        private static final KProperty $$delegatedProperties[] = {
            (KProperty)Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(kotlin/text/CharDirectionality$Companion), "directionalityMap", "getDirectionalityMap()Ljava/util/Map;"))
        };


        private Companion()
        {
        }

        public Companion(DefaultConstructorMarker $constructor_marker)
        {
            this();
        }
    }


    public final int getValue()
    {
        return value;
    }

    protected CharDirectionality(String $enum_name_or_ordinal$0, int $enum_name_or_ordinal$1, int value)
    {
        super($enum_name_or_ordinal$0, $enum_name_or_ordinal$1);
        this.value = value;
    }

    public static CharDirectionality[] values()
    {
        return (CharDirectionality[])$VALUES.clone();
    }

    public static CharDirectionality valueOf(String s)
    {
        return (CharDirectionality)Enum.valueOf(kotlin/text/CharDirectionality, s);
    }

    public static final CharDirectionality UNDEFINED;
    public static final CharDirectionality LEFT_TO_RIGHT;
    public static final CharDirectionality RIGHT_TO_LEFT;
    public static final CharDirectionality RIGHT_TO_LEFT_ARABIC;
    public static final CharDirectionality EUROPEAN_NUMBER;
    public static final CharDirectionality EUROPEAN_NUMBER_SEPARATOR;
    public static final CharDirectionality EUROPEAN_NUMBER_TERMINATOR;
    public static final CharDirectionality ARABIC_NUMBER;
    public static final CharDirectionality COMMON_NUMBER_SEPARATOR;
    public static final CharDirectionality NONSPACING_MARK;
    public static final CharDirectionality BOUNDARY_NEUTRAL;
    public static final CharDirectionality PARAGRAPH_SEPARATOR;
    public static final CharDirectionality SEGMENT_SEPARATOR;
    public static final CharDirectionality WHITESPACE;
    public static final CharDirectionality OTHER_NEUTRALS;
    public static final CharDirectionality LEFT_TO_RIGHT_EMBEDDING;
    public static final CharDirectionality LEFT_TO_RIGHT_OVERRIDE;
    public static final CharDirectionality RIGHT_TO_LEFT_EMBEDDING;
    public static final CharDirectionality RIGHT_TO_LEFT_OVERRIDE;
    public static final CharDirectionality POP_DIRECTIONAL_FORMAT;
    private static final CharDirectionality $VALUES[];
    private final int value;
    private static final Lazy directionalityMap$delegate;
    public static final Companion Companion;

    static 
    {
        CharDirectionality achardirectionality[] = new CharDirectionality[20];
        achardirectionality;
        achardirectionality[0] = UNDEFINED = new CharDirectionality("UNDEFINED", 0, -1);
        achardirectionality[1] = LEFT_TO_RIGHT = new CharDirectionality("LEFT_TO_RIGHT", 1, 0);
        achardirectionality[2] = RIGHT_TO_LEFT = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);
        achardirectionality[3] = RIGHT_TO_LEFT_ARABIC = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);
        achardirectionality[4] = EUROPEAN_NUMBER = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);
        achardirectionality[5] = EUROPEAN_NUMBER_SEPARATOR = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
        achardirectionality[6] = EUROPEAN_NUMBER_TERMINATOR = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
        achardirectionality[7] = ARABIC_NUMBER = new CharDirectionality("ARABIC_NUMBER", 7, 6);
        achardirectionality[8] = COMMON_NUMBER_SEPARATOR = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);
        achardirectionality[9] = NONSPACING_MARK = new CharDirectionality("NONSPACING_MARK", 9, 8);
        achardirectionality[10] = BOUNDARY_NEUTRAL = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);
        achardirectionality[11] = PARAGRAPH_SEPARATOR = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);
        achardirectionality[12] = SEGMENT_SEPARATOR = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);
        achardirectionality[13] = WHITESPACE = new CharDirectionality("WHITESPACE", 13, 12);
        achardirectionality[14] = OTHER_NEUTRALS = new CharDirectionality("OTHER_NEUTRALS", 14, 13);
        achardirectionality[15] = LEFT_TO_RIGHT_EMBEDDING = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
        achardirectionality[16] = LEFT_TO_RIGHT_OVERRIDE = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
        achardirectionality[17] = RIGHT_TO_LEFT_EMBEDDING = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
        achardirectionality[18] = RIGHT_TO_LEFT_OVERRIDE = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
        achardirectionality[19] = POP_DIRECTIONAL_FORMAT = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);
        $VALUES = achardirectionality;
        Companion = new Companion(null);
        static final class Companion.directionalityMap._cls2 extends Lambda
            implements Function0
        {

            public volatile Object invoke()
            {
                return invoke();
            }

            public final Map invoke()
            {
                Object $receiver$iv[] = (Object[])CharDirectionality.values();
                int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity($receiver$iv.length), 16);
                Object $receiver$iv$iv[] = $receiver$iv;
                Map destination$iv$iv = (Map)new LinkedHashMap(capacity$iv);
                for(int i = 0; i < $receiver$iv$iv.length; i++)
                {
                    Object element$iv$iv = $receiver$iv$iv[i];
                    CharDirectionality chardirectionality = (CharDirectionality)element$iv$iv;
                    Map map = destination$iv$iv;
                    Integer integer = Integer.valueOf(chardirectionality.getValue());
                    map.put(integer, element$iv$iv);
                }

                return destination$iv$iv;
            }

            public static final Companion.directionalityMap._cls2 INSTANCE = new Companion.directionalityMap._cls2();


        }

        directionalityMap$delegate = LazyKt.lazy((Function0)Companion.directionalityMap._cls2.INSTANCE);
    }

}
