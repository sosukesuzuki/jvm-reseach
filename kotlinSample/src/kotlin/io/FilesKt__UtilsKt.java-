// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Utils.kt

package kotlin.io;

import java.io.*;
import java.util.*;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

// Referenced classes of package kotlin.io:
//            FilesKt__FileTreeWalkKt, FilesKt, FilePathComponents, NoSuchFileException, 
//            FileAlreadyExistsException, FileSystemException, ByteStreamsKt, ConstantsKt, 
//            TerminateException, OnErrorAction, FileTreeWalk

class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt
{

    public static final File createTempDir(String prefix, String suffix, File directory)
    {
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        File dir = File.createTempFile(prefix, suffix, directory);
        dir.delete();
        if(dir.mkdir())
        {
            Intrinsics.checkExpressionValueIsNotNull(dir, "dir");
            return dir;
        } else
        {
            throw (Throwable)new IOException((new StringBuilder()).append("Unable to create temporary directory ").append(dir).append(".").toString());
        }
    }

    public static volatile File createTempDir$default(String s, String s1, File file, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTempDir");
        if((i & 1) != 0)
            s = "tmp";
        if((i & 2) != 0)
            s1 = (String)null;
        if((i & 4) != 0)
            file = (File)null;
        return FilesKt.createTempDir(s, s1, file);
    }

    public static final File createTempFile(String prefix, String suffix, File directory)
    {
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        File file = File.createTempFile(prefix, suffix, directory);
        Intrinsics.checkExpressionValueIsNotNull(file, "File.createTempFile(prefix, suffix, directory)");
        return file;
    }

    public static volatile File createTempFile$default(String s, String s1, File file, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTempFile");
        if((i & 1) != 0)
            s = "tmp";
        if((i & 2) != 0)
            s1 = (String)null;
        if((i & 4) != 0)
            file = (File)null;
        return FilesKt.createTempFile(s, s1, file);
    }

    public static final String getExtension(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return StringsKt.substringAfterLast($receiver.getName(), '.', "");
    }

    public static final String getInvariantSeparatorsPath(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        if(File.separatorChar == '/')
            break MISSING_BLOCK_LABEL_32;
        StringsKt.replace$default($receiver.getPath(), File.separatorChar, '/', false, 4, null);
        break MISSING_BLOCK_LABEL_42;
        String s = $receiver.getPath();
        s;
        Intrinsics.checkExpressionValueIsNotNull(s, "path");
        return;
    }

    public static final String getNameWithoutExtension(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        return StringsKt.substringBeforeLast$default($receiver.getName(), ".", null, 2, null);
    }

    public static final String toRelativeString(File $receiver, File base)
    {
        String s;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(base, "base");
        s = toRelativeStringOrNull$FilesKt__UtilsKt($receiver, base);
        s;
        if(s != null)
            break MISSING_BLOCK_LABEL_69;
        JVM INSTR pop ;
        throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("this and base files have different roots: ").append($receiver).append(" and ").append(base).append(".").toString());
        return;
    }

    public static final File relativeTo(File $receiver, File base)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(base, "base");
        return new File(FilesKt.toRelativeString($receiver, base));
    }

    public static final File relativeToOrSelf(File $receiver, File base)
    {
        String s1;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(base, "base");
        s1 = toRelativeStringOrNull$FilesKt__UtilsKt($receiver, base);
        s1;
        if(s1 == null) goto _L2; else goto _L1
_L1:
        String s;
        s;
        String it = (String)s;
        (File)new File(it);
          goto _L3
_L2:
        JVM INSTR pop ;
        $receiver;
_L3:
        return;
    }

    public static final File relativeToOrNull(File $receiver, File base)
    {
        String s1;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(base, "base");
        s1 = toRelativeStringOrNull$FilesKt__UtilsKt($receiver, base);
        s1;
        if(s1 == null) goto _L2; else goto _L1
_L1:
        String s;
        s;
        String it = (String)s;
        (File)new File(it);
          goto _L3
_L2:
        JVM INSTR pop ;
        null;
_L3:
        return;
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File $receiver, File base)
    {
        FilePathComponents thisComponents;
        FilePathComponents baseComponents;
        int baseCount;
        int thisCount;
        int sameCount;
        StringBuilder res;
        int i;
        int i;
        int j;
        IntProgression intprogression;
        thisComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents($receiver));
        baseComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents(base));
        if(Intrinsics.areEqual(thisComponents.getRoot(), baseComponents.getRoot()) ^ true)
            return (String)null;
        baseCount = baseComponents.getSize();
        thisCount = thisComponents.getSize();
        res = $receiver;
        File $receiver = (File)res;
        i = 0;
        for(int maxSameCount = Math.min(thisCount, baseCount); i < maxSameCount && Intrinsics.areEqual((File)thisComponents.getSegments().get(i), (File)baseComponents.getSegments().get(i)); i++);
        sameCount = i;
        res = new StringBuilder();
        intprogression = RangesKt.downTo(baseCount - 1, sameCount);
        i = intprogression.getFirst();
        i = intprogression.getLast();
        j = intprogression.getStep();
        i;
        i;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_173;
        JVM INSTR icmpgt 247;
           goto _L1 _L2
_L1:
        break MISSING_BLOCK_LABEL_176;
_L2:
        break MISSING_BLOCK_LABEL_247;
        JVM INSTR icmplt 247;
           goto _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_176;
_L4:
        break MISSING_BLOCK_LABEL_247;
        do
        {
            if(Intrinsics.areEqual(((File)baseComponents.getSegments().get(i)).getName(), ".."))
                return (String)null;
            res.append("..");
            if(i != sameCount)
                res.append(File.separatorChar);
            if(i == i)
                break;
            i += j;
        } while(true);
        CharSequence charsequence;
        if(sameCount < thisCount)
        {
            if(sameCount < baseCount)
                res.append(File.separatorChar);
            charsequence = (CharSequence)File.separator;
            Intrinsics.checkExpressionValueIsNotNull(charsequence, "File.separator");
            CollectionsKt.joinTo$default((Iterable)CollectionsKt.drop((Iterable)thisComponents.getSegments(), sameCount), (Appendable)res, charsequence, null, null, 0, null, null, 124, null);
        }
        return res.toString();
    }

    public static final File copyTo(File $receiver, File target, boolean overwrite, int bufferSize)
    {
        File file;
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(target, "target");
        if(!$receiver.exists())
            throw (Throwable)new NoSuchFileException($receiver, null, "The source file doesn't exist.", 2, null);
        if(target.exists())
        {
            boolean stillExists = overwrite ? !target.delete() : true;
            if(stillExists)
                throw (Throwable)new FileAlreadyExistsException($receiver, target, "The destination file already exists.");
        }
        if($receiver.isDirectory())
        {
            if(!target.mkdirs())
                throw (Throwable)new FileSystemException($receiver, target, "Failed to create target directory.");
            break MISSING_BLOCK_LABEL_331;
        }
        file = target.getParentFile();
        file;
        if(file == null)
            break MISSING_BLOCK_LABEL_134;
        mkdirs();
        JVM INSTR pop ;
        break MISSING_BLOCK_LABEL_135;
        JVM INSTR pop ;
        Object obj;
        boolean flag;
        obj = $receiver;
        obj = (Closeable)new FileInputStream(((File) (obj)));
        flag = false;
        FileInputStream input;
        Object obj2;
        boolean flag1;
        input = (FileInputStream)obj;
        obj2 = target;
        obj2 = (Closeable)new FileOutputStream(((File) (obj2)));
        flag1 = false;
        break MISSING_BLOCK_LABEL_188;
        exception2;
        if(!flag1)
            ((Closeable) (obj2)).close();
        throw exception2;
        long l;
        long l1;
        try
        {
            FileOutputStream output = (FileOutputStream)obj2;
            l1 = ByteStreamsKt.copyTo((InputStream)input, (OutputStream)output, bufferSize);
        }
        catch(Exception exception1)
        {
            flag1 = true;
            try
            {
                ((Closeable) (obj2)).close();
            }
            catch(Exception exception3) { }
            throw (Throwable)exception1;
        }
        if(!flag1)
            ((Closeable) (obj2)).close();
        Exception exception2;
        l = l1;
        if(!flag)
            ((Closeable) (obj)).close();
        Object obj1;
        Exception exception;
        l;
        break MISSING_BLOCK_LABEL_331;
        obj1;
        flag = true;
        try
        {
            ((Closeable) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Exception exception) { }
        throw (Throwable)obj1;
        obj1;
        if(!flag)
            ((Closeable) (obj)).close();
        throw obj1;
        return target;
    }

    public static volatile File copyTo$default(File file, File file1, boolean flag, int i, int j, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyTo");
        if((j & 2) != 0)
            flag = false;
        if((j & 4) != 0)
            i = ConstantsKt.DEFAULT_BUFFER_SIZE;
        return FilesKt.copyTo(file, file1, flag, i);
    }

    public static final boolean copyRecursively(File $receiver, File target, boolean overwrite, Function2 onError)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(target, "target");
        Intrinsics.checkParameterIsNotNull(onError, "onError");
        if(!$receiver.exists())
            return Intrinsics.areEqual((OnErrorAction)onError.invoke($receiver, new NoSuchFileException($receiver, null, "The source file doesn't exist.", 2, null)), OnErrorAction.TERMINATE) ^ true;
        try
        {
label0:
            {
                Iterator iterator = FilesKt.walkTopDown($receiver).onFail((Function2)new Function2(onError) {

                    public volatile Object invoke(Object obj, Object obj1)
                    {
                        invoke((File)obj, (IOException)obj1);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(File f, IOException e)
                    {
                        Intrinsics.checkParameterIsNotNull(f, "f");
                        Intrinsics.checkParameterIsNotNull(e, "e");
                        if(Intrinsics.areEqual((OnErrorAction)$onError.invoke(f, e), OnErrorAction.TERMINATE))
                            throw (Throwable)new TerminateException(f);
                        else
                            return;
                    }

                    final Function2 $onError;

            
            {
                $onError = function2;
                super(2);
            }
                }
).iterator();
                File src;
                File dstFile;
label1:
                do
                    do
                    {
                        if(!iterator.hasNext())
                            break label0;
                        src = (File)iterator.next();
                        if(!src.exists())
                        {
                            if(Intrinsics.areEqual((OnErrorAction)onError.invoke(src, new NoSuchFileException(src, null, "The source file doesn't exist.", 2, null)), OnErrorAction.TERMINATE))
                                return false;
                            continue;
                        }
                        String relPath = FilesKt.toRelativeString(src, $receiver);
                        dstFile = new File(target, relPath);
                        if(dstFile.exists() && (!src.isDirectory() || !dstFile.isDirectory()))
                        {
                            boolean stillExists = overwrite ? dstFile.isDirectory() ? !FilesKt.deleteRecursively(dstFile) : !dstFile.delete() : true;
                            if(stillExists)
                            {
                                if(Intrinsics.areEqual((OnErrorAction)onError.invoke(dstFile, new FileAlreadyExistsException(src, dstFile, "The destination file already exists.")), OnErrorAction.TERMINATE))
                                    return false;
                                continue;
                            }
                        }
                        if(!src.isDirectory())
                            continue label1;
                        dstFile.mkdirs();
                    } while(true);
                while(FilesKt.copyTo$default(src, dstFile, overwrite, 0, 4, null).length() == src.length() || !Intrinsics.areEqual((OnErrorAction)onError.invoke(src, new IOException("Source file wasn't copied completely, length of destination file differs.")), OnErrorAction.TERMINATE));
                return false;
            }
            return true;
        }
        catch(TerminateException terminateexception)
        {
            return false;
        }
    }

    public static volatile boolean copyRecursively$default(File file, File file1, boolean flag, Function2 function2, int i, Object obj)
    {
        if(obj != null)
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyRecursively");
        if((i & 2) != 0)
            flag = false;
        static final class copyRecursively._cls1 extends Lambda
            implements Function2
        {

            public volatile Object invoke(Object obj1, Object obj2)
            {
                return invoke((File)obj1, (IOException)obj2);
            }

            public final Void invoke(File file, IOException exception)
            {
                Intrinsics.checkParameterIsNotNull(file, "file");
                Intrinsics.checkParameterIsNotNull(exception, "exception");
                throw (Throwable)exception;
            }

            public static final copyRecursively._cls1 INSTANCE = new copyRecursively._cls1();


        }

        if((i & 4) != 0)
            function2 = (Function2)copyRecursively._cls1.INSTANCE;
        return FilesKt.copyRecursively(file, file1, flag, function2);
    }

    public static final boolean deleteRecursively(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Sequence $receiver$iv = (Sequence)FilesKt.walkBottomUp($receiver);
        boolean flag = true;
        boolean accumulator$iv = flag;
        for(Iterator iterator = $receiver$iv.iterator(); iterator.hasNext();)
        {
            Object element$iv = iterator.next();
            File it = (File)element$iv;
            boolean res = accumulator$iv;
            accumulator$iv = (it.delete() || !it.exists()) && res;
        }

        return accumulator$iv;
    }

    public static final boolean startsWith(File $receiver, File other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        FilePathComponents components = FilesKt.toComponents($receiver);
        FilePathComponents otherComponents = FilesKt.toComponents(other);
        if(Intrinsics.areEqual(components.getRoot(), otherComponents.getRoot()) ^ true)
            return false;
        else
            return components.getSize() >= otherComponents.getSize() ? components.getSegments().subList(0, otherComponents.getSize()).equals(otherComponents.getSegments()) : false;
    }

    public static final boolean startsWith(File $receiver, String other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return FilesKt.startsWith($receiver, new File(other));
    }

    public static final boolean endsWith(File $receiver, File other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        FilePathComponents components = FilesKt.toComponents($receiver);
        FilePathComponents otherComponents = FilesKt.toComponents(other);
        if(otherComponents.isRooted())
        {
            return Intrinsics.areEqual($receiver, other);
        } else
        {
            int shift = components.getSize() - otherComponents.getSize();
            return shift >= 0 ? components.getSegments().subList(shift, components.getSize()).equals(otherComponents.getSegments()) : false;
        }
    }

    public static final boolean endsWith(File $receiver, String other)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(other, "other");
        return FilesKt.endsWith($receiver, new File(other));
    }

    public static final File normalize(File $receiver)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        FilePathComponents filepathcomponents = FilesKt.toComponents($receiver);
        FilePathComponents $receiver = (FilePathComponents)filepathcomponents;
        CharSequence charsequence = (CharSequence)File.separator;
        Intrinsics.checkExpressionValueIsNotNull(charsequence, "File.separator");
        return (File)FilesKt.resolve($receiver.getRoot(), CollectionsKt.joinToString$default((Iterable)normalize$FilesKt__UtilsKt($receiver.getSegments()), charsequence, null, null, 0, null, null, 62, null));
    }

    private static final FilePathComponents normalize$FilesKt__UtilsKt(FilePathComponents $receiver)
    {
        return new FilePathComponents($receiver.getRoot(), normalize$FilesKt__UtilsKt($receiver.getSegments()));
    }

    private static final List normalize$FilesKt__UtilsKt(List $receiver)
    {
        List list;
        Iterator iterator;
        list = (List)new ArrayList($receiver.size());
        iterator = $receiver.iterator();
_L5:
        File file;
        String s;
        if(!iterator.hasNext())
            break; /* Loop/switch isn't completed */
        file = (File)iterator.next();
        s = file.getName();
        s;
        if(s != null)
            break MISSING_BLOCK_LABEL_59;
        JVM INSTR pop ;
        break MISSING_BLOCK_LABEL_172;
        hashCode();
        JVM INSTR lookupswitch 2: default 172
    //                   46: 101
    //                   1472: 88;
           goto _L1 _L2 _L3
_L1:
        break MISSING_BLOCK_LABEL_172;
_L3:
        if(s.equals(".."))
        {
            if(!list.isEmpty() && Intrinsics.areEqual(((File)CollectionsKt.last(list)).getName(), "..") ^ true)
                list.remove(list.size() - 1);
            else
                list.add(file);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_172;
_L2:
        if(s.equals("."))
            continue; /* Loop/switch isn't completed */
        list.add(file);
        if(true) goto _L5; else goto _L4
_L4:
        return list;
    }

    public static final File resolve(File $receiver, File relative)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(relative, "relative");
        if(FilesKt.isRooted(relative))
        {
            return relative;
        } else
        {
            String baseName = $receiver.toString();
            CharSequence charsequence = (CharSequence)baseName;
            return (charsequence.length() != 0) && !StringsKt.endsWith$default((CharSequence)baseName, File.separatorChar, false, 2, null) ? new File((new StringBuilder()).append(baseName).append(File.separatorChar).append(relative).toString()) : new File((new StringBuilder()).append(baseName).append(relative).toString());
        }
    }

    public static final File resolve(File $receiver, String relative)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(relative, "relative");
        return FilesKt.resolve($receiver, new File(relative));
    }

    public static final File resolveSibling(File $receiver, File relative)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(relative, "relative");
        FilePathComponents components = FilesKt.toComponents($receiver);
        File parentSubPath = components.getSize() != 0 ? components.subPath(0, components.getSize() - 1) : new File("..");
        return FilesKt.resolve(FilesKt.resolve(components.getRoot(), parentSubPath), relative);
    }

    public static final File resolveSibling(File $receiver, String relative)
    {
        Intrinsics.checkParameterIsNotNull($receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(relative, "relative");
        return FilesKt.resolveSibling($receiver, new File(relative));
    }

    public FilesKt__UtilsKt()
    {
    }
}
