// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.sequences:
//            Sequence, DistinctIterator

public final class DistinctSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new DistinctIterator(source.iterator(), keySelector);
    }

    public DistinctSequence(Sequence source, Function1 keySelector)
    {
        Intrinsics.checkParameterIsNotNull(source, "source");
        Intrinsics.checkParameterIsNotNull(keySelector, "keySelector");
        super();
        this.source = source;
        this.keySelector = keySelector;
    }

    private final Sequence source;
    private final Function1 keySelector;
}
