// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.sequences:
//            Sequence

final class ConstrainedOnceSequence
    implements Sequence
{

    private final AtomicReference getSequenceRef()
    {
        return sequenceRef;
    }

    public Iterator iterator()
    {
        Sequence sequence1 = (Sequence)sequenceRef.getAndSet(null);
        sequence1;
        if(sequence1 != null)
            break MISSING_BLOCK_LABEL_32;
        JVM INSTR pop ;
        throw (Throwable)new IllegalStateException("This sequence can be consumed only once.");
        Sequence sequence;
        sequence;
        return sequence.iterator();
    }

    public ConstrainedOnceSequence(Sequence sequence)
    {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        super();
        sequenceRef = new AtomicReference(sequence);
    }

    private final AtomicReference sequenceRef;
}
