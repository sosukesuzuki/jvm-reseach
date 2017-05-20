// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimitiveSpreadBuilders.kt

package kotlin.jvm.internal;


// Referenced classes of package kotlin.jvm.internal:
//            Intrinsics

public abstract class PrimitiveSpreadBuilder
{

    protected abstract int getSize(Object obj);

    protected final int getPosition()
    {
        return position;
    }

    protected final void setPosition(int <set-?>)
    {
        position = <set-?>;
    }

    /**
     * @deprecated Method spreads$annotations is deprecated
     */

    private static final void spreads$annotations()
    {
    }

    public final void addSpread(Object spreadArgument)
    {
        Intrinsics.checkParameterIsNotNull(spreadArgument, "spreadArgument");
        int i = position;
        position = position + 1;
        spreads[i] = spreadArgument;
    }

    protected final int size()
    {
        int totalLength = 0;
        int i = 0;
        int j = size - 1;
        if(i <= j)
            do
            {
                totalLength += spreads[i] == null ? 1 : getSize(spreads[i]);
                if(i == j)
                    break;
                i++;
            } while(true);
        return totalLength;
    }

    protected final Object toArray(Object values, Object result)
    {
        Intrinsics.checkParameterIsNotNull(values, "values");
        Intrinsics.checkParameterIsNotNull(result, "result");
        int dstIndex = 0;
        int copyValuesFrom = 0;
        int i = 0;
        int j = size - 1;
        if(i <= j)
            do
            {
                Object spreadArgument = spreads[i];
                if(spreadArgument != null)
                {
                    if(copyValuesFrom < i)
                    {
                        System.arraycopy(values, copyValuesFrom, result, dstIndex, i - copyValuesFrom);
                        dstIndex += i - copyValuesFrom;
                    }
                    int spreadSize = getSize(spreadArgument);
                    System.arraycopy(spreadArgument, 0, result, dstIndex, spreadSize);
                    dstIndex += spreadSize;
                    copyValuesFrom = i + 1;
                }
                if(i == j)
                    break;
                i++;
            } while(true);
        if(copyValuesFrom < size)
            System.arraycopy(values, copyValuesFrom, result, dstIndex, size - copyValuesFrom);
        return result;
    }

    public PrimitiveSpreadBuilder(int size)
    {
        this.size = size;
        spreads = (Object[])new Object[this.size];
    }

    private int position;
    private final Object spreads[];
    private final int size;
}
