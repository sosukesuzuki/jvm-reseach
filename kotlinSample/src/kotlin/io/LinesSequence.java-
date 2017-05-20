// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReadWrite.kt

package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

final class LinesSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public boolean hasNext()
            {
                if(nextValue == null && !done)
                {
                    nextValue = reader.readLine();
                    if(nextValue == null)
                        done = true;
                }
                return nextValue != null;
            }

            public String next()
            {
                String answer;
                if(!hasNext())
                    throw (Throwable)new NoSuchElementException();
                answer = nextValue;
                nextValue = (String)null;
                answer;
                if(answer == null)
                    Intrinsics.throwNpe();
                return;
            }

            public volatile Object next()
            {
                return next();
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private String nextValue;
            private boolean done;
            final LinesSequence this$0;

            
            {
                this$0 = $outer;
                super();
            }
        }
;
    }

    public LinesSequence(BufferedReader reader)
    {
        Intrinsics.checkParameterIsNotNull(reader, "reader");
        super();
        this.reader = reader;
    }

    private final BufferedReader reader;

}
