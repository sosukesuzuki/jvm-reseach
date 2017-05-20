// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Regex.kt

package kotlin.text;

import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.*;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.text:
//            MatchResult, RegexKt, MatchGroupCollection, MatchGroup

final class MatcherMatchResult
    implements kotlin.text.MatchResult
{

    public IntRange getRange()
    {
        return RegexKt.access$range(matchResult);
    }

    public String getValue()
    {
        String s = matchResult.group();
        Intrinsics.checkExpressionValueIsNotNull(s, "matchResult.group()");
        return s;
    }

    public MatchGroupCollection getGroups()
    {
        return groups;
    }

    public List getGroupValues()
    {
        if(groupValues_ == null)
            groupValues_ = (List)new AbstractList(this) {

                public int getSize()
                {
                    return matchResult.groupCount() + 1;
                }

                public final volatile int size()
                {
                    return getSize();
                }

                public String get(int index)
                {
                    String s = matchResult.group(index);
                    return s == null ? "" : s;
                }

                public volatile Object get(int i)
                {
                    return get(i);
                }

                public volatile int lastIndexOf(String s)
                {
                    return super.lastIndexOf(s);
                }

                public final volatile int lastIndexOf(Object obj)
                {
                    obj;
                    if(obj == null) goto _L2; else goto _L1
_L1:
                    JVM INSTR instanceof #45  <Class String>;
                      goto _L3
_L2:
                    JVM INSTR pop ;
                    true;
_L3:
                    JVM INSTR ifne 18;
                       goto _L4 _L5
_L4:
                    break MISSING_BLOCK_LABEL_16;
_L5:
                    break MISSING_BLOCK_LABEL_18;
                    return -1;
                    return lastIndexOf((String)obj);
                }

                public volatile boolean remove(String s)
                {
                    return super.remove(s);
                }

                public final volatile boolean remove(Object obj)
                {
                    obj;
                    if(obj == null) goto _L2; else goto _L1
_L1:
                    JVM INSTR instanceof #45  <Class String>;
                      goto _L3
_L2:
                    JVM INSTR pop ;
                    true;
_L3:
                    JVM INSTR ifne 18;
                       goto _L4 _L5
_L4:
                    break MISSING_BLOCK_LABEL_16;
_L5:
                    break MISSING_BLOCK_LABEL_18;
                    return false;
                    return remove((String)obj);
                }

                public volatile boolean contains(String s)
                {
                    return super.contains(s);
                }

                public final volatile boolean contains(Object obj)
                {
                    obj;
                    if(obj == null) goto _L2; else goto _L1
_L1:
                    JVM INSTR instanceof #45  <Class String>;
                      goto _L3
_L2:
                    JVM INSTR pop ;
                    true;
_L3:
                    JVM INSTR ifne 18;
                       goto _L4 _L5
_L4:
                    break MISSING_BLOCK_LABEL_16;
_L5:
                    break MISSING_BLOCK_LABEL_18;
                    return false;
                    return contains((String)obj);
                }

                public volatile int indexOf(String s)
                {
                    return super.indexOf(s);
                }

                public final volatile int indexOf(Object obj)
                {
                    obj;
                    if(obj == null) goto _L2; else goto _L1
_L1:
                    JVM INSTR instanceof #45  <Class String>;
                      goto _L3
_L2:
                    JVM INSTR pop ;
                    true;
_L3:
                    JVM INSTR ifne 18;
                       goto _L4 _L5
_L4:
                    break MISSING_BLOCK_LABEL_16;
_L5:
                    break MISSING_BLOCK_LABEL_18;
                    return -1;
                    return indexOf((String)obj);
                }

                public volatile String removeAt(int i)
                {
                    return (String)super.remove(i);
                }

                public final volatile String remove(int i)
                {
                    return removeAt(i);
                }

                final MatcherMatchResult this$0;

            
            {
                this$0 = $outer;
                super();
            }
            }
;
        groupValues_;
        if(groupValues_ == null)
            Intrinsics.throwNpe();
        return;
    }

    public kotlin.text.MatchResult next()
    {
        int nextIndex = matchResult.end() + (matchResult.end() != matchResult.start() ? 0 : 1);
        return nextIndex > input.length() ? (kotlin.text.MatchResult)null : RegexKt.access$findNext(matcher, nextIndex, input);
    }

    public MatcherMatchResult(Matcher matcher, CharSequence input)
    {
        Intrinsics.checkParameterIsNotNull(matcher, "matcher");
        Intrinsics.checkParameterIsNotNull(input, "input");
        super();
        this.matcher = matcher;
        this.input = input;
        matchResult = this.matcher.toMatchResult();
    }

    public MatchResult.Destructured getDestructured()
    {
        return MatchResult.DefaultImpls.getDestructured(this);
    }

    private final MatchResult matchResult;
    private final MatchGroupCollection groups = (MatchGroupCollection)new MatchGroupCollection(this) {

        public int getSize()
        {
            return matchResult.groupCount() + 1;
        }

        public final volatile int size()
        {
            return getSize();
        }

        public boolean isEmpty()
        {
            return false;
        }

        public boolean contains(MatchGroup element)
        {
            Iterator iterator1;
            Iterable iterable = (Iterable)this;
            iterator1 = iterable.iterator();
_L4:
            if(!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
            MatchGroup it;
            Object element$iv = iterator1.next();
            it = (MatchGroup)element$iv;
            if(!Intrinsics.areEqual(it, element)) goto _L4; else goto _L3
_L3:
            true;
              goto _L5
_L2:
            false;
_L5:
            return;
        }

        public final volatile boolean contains(Object obj)
        {
            obj;
            if(obj == null) goto _L2; else goto _L1
_L1:
            JVM INSTR instanceof #38  <Class MatchGroup>;
              goto _L3
_L2:
            JVM INSTR pop ;
            true;
_L3:
            JVM INSTR ifne 18;
               goto _L4 _L5
_L4:
            break MISSING_BLOCK_LABEL_16;
_L5:
            break MISSING_BLOCK_LABEL_18;
            return false;
            return contains((MatchGroup)obj);
        }

        public boolean containsAll(Collection elements)
        {
            Iterator iterator1;
            Intrinsics.checkParameterIsNotNull(elements, "elements");
            Iterable iterable = (Iterable)elements;
            iterator1 = iterable.iterator();
_L4:
            if(!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
            MatchGroup it;
            Object element$iv = iterator1.next();
            it = (MatchGroup)element$iv;
            if(contains(it)) goto _L4; else goto _L3
_L3:
            false;
              goto _L5
_L2:
            true;
_L5:
            return;
        }

        public Iterator iterator()
        {
            return SequencesKt.map(CollectionsKt.asSequence((Iterable)CollectionsKt.getIndices(this)), (Function1)new Function1(this) {

                public volatile Object invoke(Object obj)
                {
                    return invoke(((Number)obj).intValue());
                }

                public final MatchGroup invoke(int it)
                {
                    return get(it);
                }

                final groups._cls1 this$0;

                    
                    {
                        this$0 = _pcls1;
                        super(1);
                    }
            }
).iterator();
        }

        public MatchGroup get(int index)
        {
            IntRange range = RegexKt.access$range(matchResult, index);
            if(range.getStart().intValue() < 0) goto _L2; else goto _L1
_L1:
            String s;
            s = matchResult.group(index);
            Intrinsics.checkExpressionValueIsNotNull(s, "matchResult.group(index)");
            new MatchGroup(s, range);
              goto _L3
_L2:
            (MatchGroup)null;
_L3:
            return;
        }

        public boolean add(MatchGroup matchgroup)
        {
            throw new UnsupportedOperationException("Mutating immutable collection");
        }

        public boolean remove(MatchGroup matchgroup)
        {
            throw new UnsupportedOperationException("Mutating immutable collection");
        }

        public boolean remove(Object obj)
        {
            throw new UnsupportedOperationException("Mutating immutable collection");
        }

        public boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException("Mutating immutable collection");
        }

        public boolean removeAll(Collection collection)
        {
            throw new UnsupportedOperationException("Mutating immutable collection");
        }

        public boolean retainAll(Collection collection)
        {
            throw new UnsupportedOperationException("Mutating immutable collection");
        }

        public void clear()
        {
            throw new UnsupportedOperationException("Mutating immutable collection");
        }

        public boolean add(Object obj)
        {
            throw new UnsupportedOperationException("Mutating immutable collection");
        }

        public Object[] toArray()
        {
            return CollectionToArray.toArray(this);
        }

        public Object[] toArray(Object aobj[])
        {
            return CollectionToArray.toArray(this, aobj);
        }

        final MatcherMatchResult this$0;

            
            {
                this$0 = $outer;
                super();
            }
    }
;
    private List groupValues_;
    private final Matcher matcher;
    private final CharSequence input;

}
