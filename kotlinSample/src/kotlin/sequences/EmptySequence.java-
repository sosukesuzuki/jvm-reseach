// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;

// Referenced classes of package kotlin.sequences:
//            Sequence, DropTakeSequence

final class EmptySequence
    implements Sequence, DropTakeSequence
{

    public Iterator iterator()
    {
        return (Iterator)EmptyIterator.INSTANCE;
    }

    public EmptySequence drop(int n)
    {
        return INSTANCE;
    }

    public volatile Sequence drop(int i)
    {
        return (Sequence)drop(i);
    }

    public EmptySequence take(int n)
    {
        return INSTANCE;
    }

    public volatile Sequence take(int i)
    {
        return (Sequence)take(i);
    }

    private EmptySequence()
    {
    }

    public static final EmptySequence INSTANCE = (EmptySequence)this;

    static 
    {
        new EmptySequence();
    }
}
