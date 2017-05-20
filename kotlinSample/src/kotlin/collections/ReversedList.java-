// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReversedViews.kt

package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//            ReversedListReadOnly

final class ReversedList extends ReversedListReadOnly
{

    public void clear()
    {
        getDelegate().clear();
    }

    public Object removeAt(int index)
    {
        return getDelegate().remove(flipIndex(index));
    }

    public Object set(int index, Object element)
    {
        return getDelegate().set(flipIndex(index), element);
    }

    public void add(int index, Object element)
    {
        getDelegate().add(flipIndexForward(index), element);
    }

    protected List getDelegate()
    {
        return _flddelegate;
    }

    public ReversedList(List delegate)
    {
        Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        super(delegate);
        _flddelegate = delegate;
    }

    public volatile int lastIndexOf(Object obj)
    {
        return super.lastIndexOf(obj);
    }

    public volatile int getSize()
    {
        return super.getSize();
    }

    public volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public volatile boolean contains(Object obj)
    {
        return super.contains(obj);
    }

    public volatile int indexOf(Object obj)
    {
        return super.indexOf(obj);
    }

    private final List _flddelegate;
}
