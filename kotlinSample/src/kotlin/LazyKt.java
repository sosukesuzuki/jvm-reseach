// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Lazy.kt

package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

// Referenced classes of package kotlin:
//            InitializedLazyImpl, Lazy, SynchronizedLazyImpl, LazyThreadSafetyMode, 
//            SafePublicationLazyImpl, UnsafeLazyImpl, NoWhenBranchMatchedException

public final class LazyKt
{

    public static final Lazy lazyOf(Object value)
    {
        return (Lazy)new InitializedLazyImpl(value);
    }

    public static final Lazy lazy(Function0 initializer)
    {
        Intrinsics.checkParameterIsNotNull(initializer, "initializer");
        return (Lazy)new SynchronizedLazyImpl(initializer, null, 2, null);
    }

    public static final Lazy lazy(LazyThreadSafetyMode mode, Function0 initializer)
    {
        Intrinsics.checkParameterIsNotNull(mode, "mode");
        Intrinsics.checkParameterIsNotNull(initializer, "initializer");
        WhenMappings..EnumSwitchMapping._fld0[mode.ordinal()];
        JVM INSTR tableswitch 1 3: default 93
    //                   1 48
    //                   2 65
    //                   3 79;
           goto _L1 _L2 _L3 _L4
_L2:
        (Lazy)new SynchronizedLazyImpl(initializer, null, 2, null);
        break MISSING_BLOCK_LABEL_101;
_L3:
        (Lazy)new SafePublicationLazyImpl(initializer);
        break MISSING_BLOCK_LABEL_101;
_L4:
        (Lazy)new UnsafeLazyImpl(initializer);
        break MISSING_BLOCK_LABEL_101;
_L1:
        throw new NoWhenBranchMatchedException();
        return;
    }

    public static final Lazy lazy(Object lock, Function0 initializer)
    {
        Intrinsics.checkParameterIsNotNull(initializer, "initializer");
        return (Lazy)new SynchronizedLazyImpl(initializer, lock);
    }

    private static final Object getValue(Lazy $receiver, Object thisRef, KProperty property)
    {
        return $receiver.getValue();
    }

    private class WhenMappings
    {

        public static final int $EnumSwitchMapping$0[];

        static 
        {
            $EnumSwitchMapping$0 = new int[LazyThreadSafetyMode.values().length];
            $EnumSwitchMapping$0[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            $EnumSwitchMapping$0[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            $EnumSwitchMapping$0[LazyThreadSafetyMode.NONE.ordinal()] = 3;
        }
    }

}
