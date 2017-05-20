// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

// Referenced classes of package kotlin.sequences:
//            Sequence

final class GeneratorSequence
    implements Sequence
{

    public Iterator iterator()
    {
        return (Iterator)new Iterator(this) {

            public final Object getNextItem()
            {
                return nextItem;
            }

            public final void setNextItem(Object <set-?>)
            {
                nextItem = <set-?>;
            }

            public final int getNextState()
            {
                return nextState;
            }

            public final void setNextState(int <set-?>)
            {
                nextState = <set-?>;
            }

            private final void calcNext()
            {
                this;
                if(nextState != -2) goto _L2; else goto _L1
_L1:
                getInitialValue.invoke();
                  goto _L3
_L2:
                getNextValue;
                nextItem;
                if(nextItem == null)
                    Intrinsics.throwNpe();
                invoke();
_L3:
                nextItem;
                nextState = nextItem != null ? 1 : 0;
                return;
            }

            public Object next()
            {
                if(nextState < 0)
                    calcNext();
                if(nextState == 0)
                    throw (Throwable)new NoSuchElementException();
                nextItem;
                if(nextItem == null)
                    throw new TypeCastException("null cannot be cast to non-null type T");
                (Object);
                Object result;
                result;
                nextState = -1;
                return result;
            }

            public boolean hasNext()
            {
                if(nextState < 0)
                    calcNext();
                return nextState == 1;
            }

            public void remove()
            {
                throw new UnsupportedOperationException("Mutating immutable collection");
            }

            private Object nextItem;
            private int nextState;
            final GeneratorSequence this$0;

            
            {
                this$0 = $outer;
                super();
                nextState = -2;
            }
        }
;
    }

    public GeneratorSequence(Function0 getInitialValue, Function1 getNextValue)
    {
        Intrinsics.checkParameterIsNotNull(getInitialValue, "getInitialValue");
        Intrinsics.checkParameterIsNotNull(getNextValue, "getNextValue");
        super();
        this.getInitialValue = getInitialValue;
        this.getNextValue = getNextValue;
    }

    private final Function0 getInitialValue;
    private final Function1 getNextValue;


}
