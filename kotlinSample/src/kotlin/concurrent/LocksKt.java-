// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Locks.kt

package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;

public final class LocksKt
{

    private static final Object withLock(Lock $receiver, Function0 action)
    {
        $receiver.lock();
        Object obj;
        obj = action.invoke();
        InlineMarker.finallyStart(1);
        $receiver.unlock();
        InlineMarker.finallyEnd(1);
        return obj;
        Exception exception;
        exception;
        InlineMarker.finallyStart(1);
        $receiver.unlock();
        InlineMarker.finallyEnd(1);
        throw exception;
    }

    private static final Object read(ReentrantReadWriteLock $receiver, Function0 action)
    {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock rl;
        rl = $receiver.readLock();
        rl.lock();
        Object obj;
        obj = action.invoke();
        InlineMarker.finallyStart(1);
        rl.unlock();
        InlineMarker.finallyEnd(1);
        return obj;
        Exception exception;
        exception;
        InlineMarker.finallyStart(1);
        rl.unlock();
        InlineMarker.finallyEnd(1);
        throw exception;
    }

    private static final Object write(ReentrantReadWriteLock $receiver, Function0 action)
    {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock rl;
        int readCount;
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock wl;
        rl = $receiver.readLock();
        readCount = $receiver.getWriteHoldCount() != 0 ? 0 : $receiver.getReadHoldCount();
        int i = 0;
        int j = readCount - 1;
        if(i <= j)
            do
            {
                int it = i;
                rl.unlock();
                if(i == j)
                    break;
                i++;
            } while(true);
        wl = $receiver.writeLock();
        wl.lock();
        Object obj;
        obj = action.invoke();
        InlineMarker.finallyStart(1);
        int k = 0;
        int i1 = readCount - 1;
        if(k <= i1)
            do
            {
                int it = k;
                rl.lock();
                if(k == i1)
                    break;
                k++;
            } while(true);
        wl.unlock();
        InlineMarker.finallyEnd(1);
        return obj;
        Exception exception;
        exception;
        InlineMarker.finallyStart(1);
        int l = 0;
        int j1 = readCount - 1;
        if(l <= j1)
            do
            {
                int it = l;
                rl.lock();
                if(l == j1)
                    break;
                l++;
            } while(true);
        wl.unlock();
        InlineMarker.finallyEnd(1);
        throw exception;
    }
}
