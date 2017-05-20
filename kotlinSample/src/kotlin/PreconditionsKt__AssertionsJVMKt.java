// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AssertionsJVM.kt

package kotlin;

import kotlin.jvm.functions.Function0;

// Referenced classes of package kotlin:
//            _Assertions

class PreconditionsKt__AssertionsJVMKt
{

    private static final void assert(boolean value)
    {
        if(_Assertions.ENABLED)
        {
            if(!value)
            {
                String s = "Assertion failed";
                throw (Throwable)new AssertionError(s);
            }
        } else
        {
        }
    }

    private static final void assert(boolean value, Function0 lazyMessage)
    {
        if(_Assertions.ENABLED)
        {
            if(!value)
            {
                Object message = lazyMessage.invoke();
                throw (Throwable)new AssertionError(message);
            }
        } else
        {
        }
    }

    public PreconditionsKt__AssertionsJVMKt()
    {
    }
}
