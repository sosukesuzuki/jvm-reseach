// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Timer.kt

package kotlin.concurrent;

import java.util.*;
import kotlin.jvm.functions.Function1;

public final class TimersKt
{

    private static final TimerTask schedule(Timer $receiver, long delay, Function1 action)
    {
        TimerTask task = (TimerTask)new TimerTask(action) {

            public void run()
            {
                $action.invoke(this);
            }

            final Function1 $action;

            public 
            {
                $action = $captured_local_variable$0;
                super();
            }
        }
;
        $receiver.schedule(task, delay);
        return task;
    }

    private static final TimerTask schedule(Timer $receiver, Date time, Function1 action)
    {
        TimerTask task = (TimerTask)new timerTask._cls1(action);
        $receiver.schedule(task, time);
        return task;
    }

    private static final TimerTask schedule(Timer $receiver, long delay, long period, Function1 action)
    {
        TimerTask task = (TimerTask)new timerTask._cls1(action);
        $receiver.schedule(task, delay, period);
        return task;
    }

    private static final TimerTask schedule(Timer $receiver, Date time, long period, Function1 action)
    {
        TimerTask task = (TimerTask)new timerTask._cls1(action);
        $receiver.schedule(task, time, period);
        return task;
    }

    private static final TimerTask scheduleAtFixedRate(Timer $receiver, long delay, long period, Function1 action)
    {
        TimerTask task = (TimerTask)new timerTask._cls1(action);
        $receiver.scheduleAtFixedRate(task, delay, period);
        return task;
    }

    private static final TimerTask scheduleAtFixedRate(Timer $receiver, Date time, long period, Function1 action)
    {
        TimerTask task = (TimerTask)new timerTask._cls1(action);
        $receiver.scheduleAtFixedRate(task, time, period);
        return task;
    }

    public static final Timer timer(String name, boolean daemon)
    {
        return name != null ? new Timer(name, daemon) : new Timer(daemon);
    }

    private static final Timer timer(String name, boolean daemon, long initialDelay, long period, Function1 action)
    {
        Timer timer = timer(name, daemon);
        Timer timer1 = timer;
        TimerTask timertask = (TimerTask)new timerTask._cls1(action);
        timer1.schedule(timertask, initialDelay, period);
        TimerTask _tmp = timertask;
        return timer;
    }

    static volatile Timer timer$default(String name, boolean daemon, long initialDelay, long period, Function1 action, int $i$f$timer, 
            Timer timer)
    {
        if(timer != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: timer");
        if(($i$f$timer & 1) != 0)
            name = (String)null;
        if(($i$f$timer & 2) != 0)
            daemon = false;
        if(($i$f$timer & 4) != 0)
            initialDelay = 0;
        timer = timer(name, daemon);
        Timer timer1 = timer;
        TimerTask timertask = (TimerTask)new timerTask._cls1(action);
        timer1.schedule(timertask, initialDelay, period);
        TimerTask _tmp = timertask;
        return timer;
    }

    private static final Timer timer(String name, boolean daemon, Date startAt, long period, Function1 action)
    {
        Timer timer = timer(name, daemon);
        Timer timer1 = timer;
        TimerTask timertask = (TimerTask)new timerTask._cls1(action);
        timer1.schedule(timertask, startAt, period);
        TimerTask _tmp = timertask;
        return timer;
    }

    static volatile Timer timer$default(String name, boolean daemon, Date startAt, long period, Function1 action, int $i$f$timer, Timer timer)
    {
        if(timer != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: timer");
        if(($i$f$timer & 1) != 0)
            name = (String)null;
        if(($i$f$timer & 2) != 0)
            daemon = false;
        timer = timer(name, daemon);
        Timer timer1 = timer;
        TimerTask timertask = (TimerTask)new timerTask._cls1(action);
        timer1.schedule(timertask, startAt, period);
        TimerTask _tmp = timertask;
        return timer;
    }

    private static final Timer fixedRateTimer(String name, boolean daemon, long initialDelay, long period, Function1 action)
    {
        Timer timer = timer(name, daemon);
        Timer timer1 = timer;
        TimerTask timertask = (TimerTask)new timerTask._cls1(action);
        timer1.scheduleAtFixedRate(timertask, initialDelay, period);
        TimerTask _tmp = timertask;
        return timer;
    }

    static volatile Timer fixedRateTimer$default(String name, boolean daemon, long initialDelay, long period, Function1 action, int $i$f$fixedRateTimer, 
            Timer timer)
    {
        if(timer != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fixedRateTimer");
        if(($i$f$fixedRateTimer & 1) != 0)
            name = (String)null;
        if(($i$f$fixedRateTimer & 2) != 0)
            daemon = false;
        if(($i$f$fixedRateTimer & 4) != 0)
            initialDelay = 0;
        timer = timer(name, daemon);
        Timer timer1 = timer;
        TimerTask timertask = (TimerTask)new timerTask._cls1(action);
        timer1.scheduleAtFixedRate(timertask, initialDelay, period);
        TimerTask _tmp = timertask;
        return timer;
    }

    private static final Timer fixedRateTimer(String name, boolean daemon, Date startAt, long period, Function1 action)
    {
        Timer timer = timer(name, daemon);
        Timer timer1 = timer;
        TimerTask timertask = (TimerTask)new timerTask._cls1(action);
        timer1.scheduleAtFixedRate(timertask, startAt, period);
        TimerTask _tmp = timertask;
        return timer;
    }

    static volatile Timer fixedRateTimer$default(String name, boolean daemon, Date startAt, long period, Function1 action, int $i$f$fixedRateTimer, Timer timer)
    {
        if(timer != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fixedRateTimer");
        if(($i$f$fixedRateTimer & 1) != 0)
            name = (String)null;
        if(($i$f$fixedRateTimer & 2) != 0)
            daemon = false;
        timer = timer(name, daemon);
        Timer timer1 = timer;
        TimerTask timertask = (TimerTask)new timerTask._cls1(action);
        timer1.scheduleAtFixedRate(timertask, startAt, period);
        TimerTask _tmp = timertask;
        return timer;
    }

    private static final TimerTask timerTask(Function1 action)
    {
        return (TimerTask)new timerTask._cls1(action);
    }
}
