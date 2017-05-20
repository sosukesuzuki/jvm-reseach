// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StringBuilder.kt

package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.text:
//            StringsKt__StringBuilderJVMKt

class StringsKt__StringBuilderKt extends StringsKt__StringBuilderJVMKt
{

    private static final String buildString(Function1 builderAction)
    {
        StringBuilder stringbuilder = new StringBuilder();
        builderAction.invoke(stringbuilder);
        String s = ((StringBuilder)stringbuilder).toString();
        Intrinsics.checkExpressionValueIsNotNull(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public static final transient Appendable append(Appendable $receiver, CharSequence value[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(value, "value");
        for(int i = 0; i < value.length; i++)
        {
            CharSequence item = value[i];
            $receiver.append(item);
        }

        return $receiver;
    }

    public static final transient StringBuilder append(StringBuilder $receiver, String value[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(value, "value");
        for(int i = 0; i < value.length; i++)
        {
            String item = value[i];
            $receiver.append(item);
        }

        return $receiver;
    }

    public static final transient StringBuilder append(StringBuilder $receiver, Object value[])
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(((Object) (value)), "value");
        for(int i = 0; i < value.length; i++)
        {
            Object item = value[i];
            $receiver.append(item);
        }

        return $receiver;
    }

    private static final void set(StringBuilder $receiver, int index, char value)
    {
        $receiver.setCharAt(index, value);
    }

    public StringsKt__StringBuilderKt()
    {
    }
}
