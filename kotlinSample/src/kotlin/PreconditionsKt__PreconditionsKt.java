// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Preconditions.kt

package kotlin;

import kotlin.jvm.functions.Function0;

// Referenced classes of package kotlin:
//            PreconditionsKt__AssertionsJVMKt

class PreconditionsKt__PreconditionsKt extends PreconditionsKt__AssertionsJVMKt
{

    private static final void require(boolean value)
    {
        if(!value)
        {
            String s = "Failed requirement.";
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return;
        }
    }

    private static final void require(boolean value, Function0 lazyMessage)
    {
        if(!value)
        {
            Object message = lazyMessage.invoke();
            throw (Throwable)new IllegalArgumentException(message.toString());
        } else
        {
            return;
        }
    }

    private static final Object requireNotNull(Object value)
    {
        if(value == null)
        {
            String s = "Required value was null.";
            throw (Throwable)new IllegalArgumentException(s.toString());
        } else
        {
            return value;
        }
    }

    private static final Object requireNotNull(Object value, Function0 lazyMessage)
    {
        if(value == null)
        {
            Object message = lazyMessage.invoke();
            throw (Throwable)new IllegalArgumentException(message.toString());
        } else
        {
            return value;
        }
    }

    private static final void check(boolean value)
    {
        if(!value)
        {
            String s = "Check failed.";
            throw (Throwable)new IllegalStateException(s.toString());
        } else
        {
            return;
        }
    }

    private static final void check(boolean value, Function0 lazyMessage)
    {
        if(!value)
        {
            Object message = lazyMessage.invoke();
            throw (Throwable)new IllegalStateException(message.toString());
        } else
        {
            return;
        }
    }

    private static final Object checkNotNull(Object value)
    {
        if(value == null)
        {
            String s = "Required value was null.";
            throw (Throwable)new IllegalStateException(s.toString());
        } else
        {
            return value;
        }
    }

    private static final Object checkNotNull(Object value, Function0 lazyMessage)
    {
        if(value == null)
        {
            Object message = lazyMessage.invoke();
            throw (Throwable)new IllegalStateException(message.toString());
        } else
        {
            return value;
        }
    }

    private static final Void error(Object message)
    {
        throw (Throwable)new IllegalStateException(message.toString());
    }

    public PreconditionsKt__PreconditionsKt()
    {
    }
}
