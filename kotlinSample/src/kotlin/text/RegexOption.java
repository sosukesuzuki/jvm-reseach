// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Regex.kt

package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

// Referenced classes of package kotlin.text:
//            FlagEnum

public final class RegexOption extends Enum
    implements FlagEnum
{

    public int getValue()
    {
        return value;
    }

    public int getMask()
    {
        return mask;
    }

    protected RegexOption(String $enum_name_or_ordinal$0, int $enum_name_or_ordinal$1, int value, int mask)
    {
        super($enum_name_or_ordinal$0, $enum_name_or_ordinal$1);
        this.value = value;
        this.mask = mask;
    }

    protected RegexOption(String s, int i, int j, int k, int l, DefaultConstructorMarker defaultconstructormarker)
    {
        if((l & 2) != 0)
            k = j;
        this(s, i, j, k);
    }

    public static RegexOption[] values()
    {
        return (RegexOption[])$VALUES.clone();
    }

    public static RegexOption valueOf(String s)
    {
        return (RegexOption)Enum.valueOf(kotlin/text/RegexOption, s);
    }

    public static final RegexOption IGNORE_CASE;
    public static final RegexOption MULTILINE;
    public static final RegexOption LITERAL;
    public static final RegexOption UNIX_LINES;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption CANON_EQ;
    private static final RegexOption $VALUES[];
    private final int value;
    private final int mask;

    static 
    {
        RegexOption aregexoption[] = new RegexOption[7];
        aregexoption;
        aregexoption[0] = IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);
        aregexoption[1] = MULTILINE = new RegexOption("MULTILINE", 1, 8, 0, 2, null);
        aregexoption[2] = LITERAL = new RegexOption("LITERAL", 2, 16, 0, 2, null);
        aregexoption[3] = UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);
        aregexoption[4] = COMMENTS = new RegexOption("COMMENTS", 4, 4, 0, 2, null);
        aregexoption[5] = DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
        aregexoption[6] = CANON_EQ = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);
        $VALUES = aregexoption;
    }
}
