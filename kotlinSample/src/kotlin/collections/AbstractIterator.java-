// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   AbstractIterator.kt

package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.collections:
//            State

public abstract class AbstractIterator
    implements Iterator, KMappedMarker
{

    public boolean hasNext()
    {
        boolean flag = Intrinsics.areEqual(state, State.Failed) ^ true;
        if(!flag)
        {
            String s = "Failed requirement.";
            throw (Throwable)new IllegalArgumentException(s.toString());
        }
        boolean flag1;
        switch(WhenMappings..EnumSwitchMapping._fld0[state.ordinal()])
        {
        case 1: // '\001'
            flag1 = false;
            break;

        case 2: // '\002'
            flag1 = true;
            break;

        default:
            flag1 = tryToComputeNext();
            break;
        }
        return flag1;
    }

    public Object next()
    {
        if(!hasNext())
        {
            throw (Throwable)new NoSuchElementException();
        } else
        {
            state = State.NotReady;
            return (Object)nextValue;
        }
    }

    private final boolean tryToComputeNext()
    {
        state = State.Failed;
        computeNext();
        return Intrinsics.areEqual(state, State.Ready);
    }

    protected abstract void computeNext();

    protected final void setNext(Object value)
    {
        nextValue = value;
        state = State.Ready;
    }

    protected final void done()
    {
        state = State.Done;
    }

    public AbstractIterator()
    {
        state = State.NotReady;
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Mutating immutable collection");
    }

    private State state;
    private Object nextValue;

    private class WhenMappings
    {

        public static final int $EnumSwitchMapping$0[];

        static 
        {
            $EnumSwitchMapping$0 = new int[State.values().length];
            $EnumSwitchMapping$0[State.Done.ordinal()] = 1;
            $EnumSwitchMapping$0[State.Ready.ordinal()] = 2;
        }
    }

}
