// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Ref.java

package kotlin.jvm.internal;


public class Ref
{
    public static final class BooleanRef
    {

        public String toString()
        {
            return String.valueOf(element);
        }

        public volatile boolean element;

        public BooleanRef()
        {
        }
    }

    public static final class CharRef
    {

        public String toString()
        {
            return String.valueOf(element);
        }

        public volatile char element;

        public CharRef()
        {
        }
    }

    public static final class DoubleRef
    {

        public String toString()
        {
            return String.valueOf(element);
        }

        public volatile double element;

        public DoubleRef()
        {
        }
    }

    public static final class FloatRef
    {

        public String toString()
        {
            return String.valueOf(element);
        }

        public volatile float element;

        public FloatRef()
        {
        }
    }

    public static final class LongRef
    {

        public String toString()
        {
            return String.valueOf(element);
        }

        public volatile long element;

        public LongRef()
        {
        }
    }

    public static final class IntRef
    {

        public String toString()
        {
            return String.valueOf(element);
        }

        public volatile int element;

        public IntRef()
        {
        }
    }

    public static final class ShortRef
    {

        public String toString()
        {
            return String.valueOf(element);
        }

        public volatile short element;

        public ShortRef()
        {
        }
    }

    public static final class ByteRef
    {

        public String toString()
        {
            return String.valueOf(element);
        }

        public volatile byte element;

        public ByteRef()
        {
        }
    }

    public static final class ObjectRef
    {

        public String toString()
        {
            return String.valueOf(element);
        }

        public volatile Object element;

        public ObjectRef()
        {
        }
    }


    private Ref()
    {
    }
}
