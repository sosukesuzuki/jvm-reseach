// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Ranges.kt

package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

// Referenced classes of package kotlin.ranges:
//            CharProgression, ClosedRange

public final class CharRange extends CharProgression
    implements ClosedRange
{
    public static final class Companion
    {

        public final CharRange getEMPTY()
        {
            return CharRange.EMPTY;
        }

        private Companion()
        {
        }

        public Companion(DefaultConstructorMarker $constructor_marker)
        {
            this();
        }
    }


    public Character getStart()
    {
        return Character.valueOf(getFirst());
    }

    public volatile Comparable getStart()
    {
        return (Comparable)getStart();
    }

    public Character getEndInclusive()
    {
        return Character.valueOf(getLast());
    }

    public volatile Comparable getEndInclusive()
    {
        return (Comparable)getEndInclusive();
    }

    public boolean contains(char value)
    {
        return getFirst() <= value && value <= getLast();
    }

    public volatile boolean contains(Comparable comparable)
    {
        return contains(((Character)comparable).charValue());
    }

    public boolean isEmpty()
    {
        return getFirst() > getLast();
    }

    public boolean equals(Object other)
    {
        return (other instanceof CharRange) && (isEmpty() && ((CharRange)other).isEmpty() || getFirst() == ((CharRange)other).getFirst() && getLast() == ((CharRange)other).getLast());
    }

    public int hashCode()
    {
        return isEmpty() ? -1 : 31 * getFirst() + getLast();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getFirst()).append("..").append(getLast()).toString();
    }

    public CharRange(char start, char endInclusive)
    {
        super(start, endInclusive, 1);
    }

    private static final CharRange EMPTY = new CharRange((char)1, (char)0);
    public static final Companion Companion = new Companion(null);


}
