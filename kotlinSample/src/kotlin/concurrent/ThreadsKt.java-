// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Thread.kt

package kotlin.concurrent;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class ThreadsKt
{

    public static final Thread thread(boolean start, boolean isDaemon, ClassLoader contextClassLoader, String name, int priority, Function0 block)
    {
        Intrinsics.checkParameterIsNotNull(block, "block");
        thread.thread._cls1 thread = new Thread(block) {

            public void run()
            {
                $block.invoke();
            }

            final Function0 $block;

            
            {
                $block = $captured_local_variable$0;
                super();
            }
        }
;
        if(isDaemon)
            thread.setDaemon(true);
        if(priority > 0)
            thread.setPriority(priority);
        if(name != null)
            thread.setName(name);
        if(contextClassLoader != null)
            thread.setContextClassLoader(contextClassLoader);
        if(start)
            thread.start();
        return (Thread)thread;
    }

    public static volatile Thread thread$default(boolean flag, boolean flag1, ClassLoader classloader, String s, int i, Function0 function0, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: thread");
        if((j & 1) != 0)
            flag = true;
        if((j & 2) != 0)
            flag1 = false;
        if((j & 4) != 0)
            classloader = (ClassLoader)null;
        if((j & 8) != 0)
            s = (String)null;
        if((j & 0x10) != 0)
            i = -1;
        return thread(flag, flag1, classloader, s, i, function0);
    }

    private static final Object getOrSet(ThreadLocal $receiver, Function0 default)
    {
        Object obj1 = $receiver.get();
        obj1;
        if(obj1 == null) goto _L2; else goto _L1
_L2:
        JVM INSTR pop ;
        Object obj;
        obj = default.invoke();
        Object $receiver = obj;
        $receiver.set($receiver);
        obj;
_L1:
        return;
    }
}
