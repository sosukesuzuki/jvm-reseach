// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Standard.kt

package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

// Referenced classes of package kotlin:
//            NotImplementedError

class StandardKt__StandardKt
{

    private static final Void TODO()
    {
        throw (Throwable)new NotImplementedError(null, 1, null);
    }

    private static final Void TODO(String reason)
    {
        throw (Throwable)new NotImplementedError((new StringBuilder()).append("An operation is not implemented: ").append(reason).toString());
    }

    private static final Object run(Function0 block)
    {
        return block.invoke();
    }

    private static final Object run(Object $receiver, Function1 block)
    {
        return block.invoke($receiver);
    }

    private static final Object with(Object receiver, Function1 block)
    {
        return block.invoke(receiver);
    }

    private static final Object apply(Object $receiver, Function1 block)
    {
        block.invoke($receiver);
        return $receiver;
    }

    private static final Object let(Object $receiver, Function1 block)
    {
        return block.invoke($receiver);
    }

    private static final void repeat(int times, Function1 action)
    {
        int index = 0;
        int i = times - 1;
        if(index <= i)
            do
            {
                action.invoke(Integer.valueOf(index));
                if(index == i)
                    break;
                index++;
            } while(true);
    }

    public StandardKt__StandardKt()
    {
    }
}
