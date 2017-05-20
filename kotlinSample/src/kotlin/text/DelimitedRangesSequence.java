// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Strings.kt

package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

// Referenced classes of package kotlin.text:
//            StringsKt

final class DelimitedRangesSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final int getNextState()
            {
                return nextState;
            }

            public final void setNextState(int <set-?>)
            {
                nextState = <set-?>;
            }

            public final int getCurrentStartIndex()
            {
                return currentStartIndex;
            }

            public final void setCurrentStartIndex(int <set-?>)
            {
                currentStartIndex = <set-?>;
            }

            public final int getNextSearchIndex()
            {
                return nextSearchIndex;
            }

            public final void setNextSearchIndex(int <set-?>)
            {
                nextSearchIndex = <set-?>;
            }

            public final IntRange getNextItem()
            {
                return nextItem;
            }

            public final void setNextItem(IntRange <set-?>)
            {
                nextItem = <set-?>;
            }

            public final int getCounter()
            {
                return counter;
            }

            public final void setCounter(int <set-?>)
            {
                counter = <set-?>;
            }

            private final void calcNext()
            {
label0:
                {
                    if(nextSearchIndex < 0)
                    {
                        nextState = 0;
                        nextItem = (IntRange)null;
                        break MISSING_BLOCK_LABEL_259;
                    }
                    if(limit > 0)
                    {
                        counter = counter + 1;
                        if(counter >= limit)
                            break label0;
                    }
                    if(nextSearchIndex <= input.length())
                        break MISSING_BLOCK_LABEL_112;
                }
                this;
                currentStartIndex;
                JVM INSTR new #53  <Class IntRange>;
                JVM INSTR dup_x1 ;
                JVM INSTR swap ;
                StringsKt.getLastIndex(input);
                IntRange();
                nextItem;
                nextSearchIndex = -1;
                break MISSING_BLOCK_LABEL_254;
                Pair match;
                match = (Pair)getNextMatch.invoke(input, Integer.valueOf(nextSearchIndex));
                if(match != null)
                    break MISSING_BLOCK_LABEL_180;
                this;
                currentStartIndex;
                JVM INSTR new #53  <Class IntRange>;
                JVM INSTR dup_x1 ;
                JVM INSTR swap ;
                StringsKt.getLastIndex(input);
                IntRange();
                nextItem;
                nextSearchIndex = -1;
                break MISSING_BLOCK_LABEL_254;
                int index;
                int length;
                Pair pair = match;
                index = ((Number)pair.component1()).intValue();
                length = ((Number)pair.component2()).intValue();
                pair = null;
                this;
                currentStartIndex;
                JVM INSTR new #53  <Class IntRange>;
                JVM INSTR dup_x1 ;
                JVM INSTR swap ;
                index - 1;
                IntRange();
                nextItem;
                currentStartIndex = index + length;
                nextSearchIndex = currentStartIndex + (length != 0 ? 0 : 1);
                nextState = 1;
            }

            public IntRange next()
            {
                if(nextState == -1)
                    calcNext();
                if(nextState == 0)
                    throw (Throwable)new NoSuchElementException();
                nextItem;
                if(nextItem == null)
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
                (IntRange);
                IntRange result;
                result;
                nextItem = (IntRange)null;
                nextState = -1;
                return result;
            }

            public volatile Object next()
            {
                return next();
            }

            public boolean hasNext()
            {
                if(nextState == -1)
                    calcNext();
                return nextState == 1;
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private int nextState;
            private int currentStartIndex;
            private int nextSearchIndex;
            private IntRange nextItem;
            private int counter;
            final DelimitedRangesSequence this$0;

            
            {
                this$0 = $outer;
                super();
                nextState = -1;
                currentStartIndex = Math.min(Math.max($outer.startIndex, 0), $outer.input.length());
                nextSearchIndex = currentStartIndex;
            }
        }
;
    }

    public DelimitedRangesSequence(CharSequence input, int startIndex, int limit, Function2 getNextMatch)
    {
        Intrinsics.checkParameterIsNotNull(input, "input");
        Intrinsics.checkParameterIsNotNull(getNextMatch, "getNextMatch");
        super();
        this.input = input;
        this.startIndex = startIndex;
        this.limit = limit;
        this.getNextMatch = getNextMatch;
    }

    private final CharSequence input;
    private final int startIndex;
    private final int limit;
    private final Function2 getNextMatch;




}
