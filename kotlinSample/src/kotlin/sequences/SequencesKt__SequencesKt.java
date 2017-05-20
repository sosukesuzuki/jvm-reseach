// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sequences.kt

package kotlin.sequences;

import java.util.*;
import kotlin.*;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

// Referenced classes of package kotlin.sequences:
//            Sequence, SequencesKt, EmptySequence, TransformingSequence, 
//            FlatteningSequence, ConstrainedOnceSequence, GeneratorSequence

class SequencesKt__SequencesKt
{

    private static final Sequence Sequence(Function0 iterator)
    {
        return (Sequence)new Sequence(iterator) {

            public Iterator iterator()
            {
                return (Iterator)$iterator.invoke();
            }

            final Function0 $iterator;

            public 
            {
                $iterator = $captured_local_variable$0;
                super();
            }
        }
;
    }

    public static final Sequence asSequence(Iterator $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        class asSequence..inlined.Sequence._cls1
            implements Sequence
        {

            public Iterator iterator()
            {
                return (Iterator)receiver$0$inlined;
            }

            final Iterator receiver$0$inlined;

            asSequence..inlined.Sequence._cls1(Iterator iterator1)
            {
                receiver$0$inlined = iterator1;
                super();
            }
        }

        return SequencesKt.constrainOnce((Sequence)new asSequence..inlined.Sequence._cls1($receiver));
    }

    private static final Sequence asSequence(Enumeration $receiver)
    {
        return SequencesKt.asSequence(CollectionsKt.iterator($receiver));
    }

    public static final transient Sequence sequenceOf(Object elements[])
    {
        Intrinsics.checkParameterIsNotNull(((Object) (elements)), "elements");
        Object aobj[] = elements;
        return (aobj.length != 0) ? ArraysKt.asSequence(elements) : SequencesKt.emptySequence();
    }

    public static final Sequence emptySequence()
    {
        return (Sequence)EmptySequence.INSTANCE;
    }

    public static final Sequence flatten(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        static final class flatten._cls1 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return invoke((Sequence)obj);
            }

            public final Iterator invoke(Sequence it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return it.iterator();
            }

            public static final flatten._cls1 INSTANCE = new flatten._cls1();


        }

        return flatten$SequencesKt__SequencesKt($receiver, (Function1)flatten._cls1.INSTANCE);
    }

    public static final Sequence flattenSequenceOfIterable(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        static final class flatten._cls2 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return invoke((Iterable)obj);
            }

            public final Iterator invoke(Iterable it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return it.iterator();
            }

            public static final flatten._cls2 INSTANCE = new flatten._cls2();


        }

        return flatten$SequencesKt__SequencesKt($receiver, (Function1)flatten._cls2.INSTANCE);
    }

    private static final Sequence flatten$SequencesKt__SequencesKt(Sequence $receiver, Function1 iterator)
    {
        static final class flatten._cls3 extends Lambda
            implements Function1
        {

            public final Object invoke(Object it)
            {
                return it;
            }

            public static final flatten._cls3 INSTANCE = new flatten._cls3();


        }

        if($receiver instanceof TransformingSequence)
        {
            if($receiver == null)
                throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.TransformingSequence<*, T>");
            return ((TransformingSequence)$receiver).flatten$kotlin_stdlib(iterator);
        } else
        {
            return (Sequence)new FlatteningSequence($receiver, (Function1)flatten._cls3.INSTANCE, iterator);
        }
    }

    public static final Pair unzip(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        ArrayList listT = new ArrayList();
        ArrayList listR = new ArrayList();
        Pair pair;
        for(Iterator iterator = $receiver.iterator(); iterator.hasNext(); listR.add(pair.getSecond()))
        {
            pair = (Pair)iterator.next();
            listT.add(pair.getFirst());
        }

        return TuplesKt.to(listT, listR);
    }

    public static final Sequence constrainOnce(Sequence $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return ($receiver instanceof ConstrainedOnceSequence) ? $receiver : (Sequence)new ConstrainedOnceSequence($receiver);
    }

    public static final Sequence generateSequence(Function0 nextFunction)
    {
        Intrinsics.checkParameterIsNotNull(nextFunction, "nextFunction");
        return SequencesKt.constrainOnce((Sequence)new GeneratorSequence(nextFunction, (Function1)new Function1(nextFunction) {

            public final Object invoke(Object it)
            {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return $nextFunction.invoke();
            }

            final Function0 $nextFunction;

            
            {
                $nextFunction = function0;
                super(1);
            }
        }
));
    }

    public static final Sequence generateSequence(Object seed, Function1 nextFunction)
    {
        Intrinsics.checkParameterIsNotNull(nextFunction, "nextFunction");
        return seed != null ? (Sequence)new GeneratorSequence((Function0)new Function0(seed) {

            public final Object invoke()
            {
                return $seed;
            }

            final Object $seed;

            
            {
                $seed = obj;
                super(0);
            }
        }
, nextFunction) : (Sequence)EmptySequence.INSTANCE;
    }

    public static final Sequence generateSequence(Function0 seedFunction, Function1 nextFunction)
    {
        Intrinsics.checkParameterIsNotNull(seedFunction, "seedFunction");
        Intrinsics.checkParameterIsNotNull(nextFunction, "nextFunction");
        return (Sequence)new GeneratorSequence(seedFunction, nextFunction);
    }

    public SequencesKt__SequencesKt()
    {
    }
}
