// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReversedViews.kt

package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

class ReversedListReadOnly extends AbstractList
{

    public int getSize()
    {
        return getDelegate().size();
    }

    public final volatile int size()
    {
        return getSize();
    }

    public Object get(int index)
    {
        return getDelegate().get(flipIndex(index));
    }

    protected final int flipIndex(int $receiver)
    {
        true;
        $receiver;
        JVM INSTR dup2 ;
        0;
        JVM INSTR icmpge 9;
           goto _L1 _L2
_L1:
        JVM INSTR pop ;
        false;
_L2:
        size() - 1;
        JVM INSTR icmple 22;
           goto _L3 _L4
_L3:
        JVM INSTR pop ;
        false;
_L4:
        JVM INSTR iand ;
        JVM INSTR ifeq 37;
           goto _L5 _L6
_L6:
        JVM INSTR new #33  <Class IndexOutOfBoundsException>;
        JVM INSTR dup ;
        (new StringBuilder()).append("index ").append($receiver).append(" should be in range [");
        0;
        JVM INSTR new #52  <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        size() - 1;
        IntRange();
        append();
        "].";
        append();
        toString();
        IndexOutOfBoundsException();
        (Throwable);
        throw ;
_L5:
        return size() - $receiver - 1;
    }

    protected final int flipIndexForward(int $receiver)
    {
        true;
        $receiver;
        JVM INSTR dup2 ;
        0;
        JVM INSTR icmpge 9;
           goto _L1 _L2
_L1:
        JVM INSTR pop ;
        false;
_L2:
        size();
        JVM INSTR icmple 20;
           goto _L3 _L4
_L3:
        JVM INSTR pop ;
        false;
_L4:
        JVM INSTR iand ;
        JVM INSTR ifeq 33;
           goto _L5 _L6
_L6:
        JVM INSTR new #33  <Class IndexOutOfBoundsException>;
        JVM INSTR dup ;
        (new StringBuilder()).append("index ").append($receiver).append(" should be in range [");
        0;
        JVM INSTR new #52  <Class IntRange>;
        JVM INSTR dup_x1 ;
        JVM INSTR swap ;
        size();
        IntRange();
        append();
        "].";
        append();
        toString();
        IndexOutOfBoundsException();
        (Throwable);
        throw ;
_L5:
        return size() - $receiver;
    }

    protected List getDelegate()
    {
        return _flddelegate;
    }

    public ReversedListReadOnly(List delegate)
    {
        Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        super();
        _flddelegate = delegate;
    }

    public volatile boolean contains(Object obj)
    {
        return super.contains(obj);
    }

    public volatile Object removeAt(int i)
    {
        return super.remove(i);
    }

    public final volatile Object remove(int i)
    {
        return removeAt(i);
    }

    public volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public volatile int lastIndexOf(Object obj)
    {
        return super.lastIndexOf(obj);
    }

    public volatile int indexOf(Object obj)
    {
        return super.indexOf(obj);
    }

    private final List _flddelegate;
}
