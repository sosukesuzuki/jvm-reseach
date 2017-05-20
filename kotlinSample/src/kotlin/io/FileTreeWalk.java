// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FileTreeWalk.kt

package kotlin.io;

import java.io.File;
import java.util.Iterator;
import java.util.Stack;
import kotlin.*;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.*;
import kotlin.sequences.Sequence;

// Referenced classes of package kotlin.io:
//            FileWalkDirection, AccessDeniedException

public final class FileTreeWalk
    implements Sequence
{
    private static abstract class WalkState
    {

        public abstract File step();

        public final File getRoot()
        {
            return root;
        }

        private final File root;

        public WalkState(File root)
        {
            Intrinsics.checkParameterIsNotNull(root, "root");
            super();
            this.root = root;
        }
    }

    private static abstract class DirectoryState extends WalkState
    {

        public DirectoryState(File rootDir)
        {
            Intrinsics.checkParameterIsNotNull(rootDir, "rootDir");
            super(rootDir);
            if(_Assertions.ENABLED)
            {
                boolean flag = rootDir.isDirectory();
                if(_Assertions.ENABLED)
                {
                    if(!flag)
                    {
                        String s = "rootDir must be verified to be directory beforehand.";
                        throw (Throwable)new AssertionError(s);
                    }
                } else
                {
                }
            }
        }
    }

    private final class FileTreeWalkIterator extends AbstractIterator
    {
        private final class BottomUpDirectoryState extends DirectoryState
        {

            private final boolean getRootVisited()
            {
                return rootVisited;
            }

            private final void setRootVisited(boolean <set-?>)
            {
                rootVisited = <set-?>;
            }

            private final File[] getFileList()
            {
                return fileList;
            }

            private final void setFileList(File <set-?>[])
            {
                fileList = <set-?>;
            }

            private final int getFileIndex()
            {
                return fileIndex;
            }

            private final void setFileIndex(int <set-?>)
            {
                fileIndex = <set-?>;
            }

            private final boolean getFailed()
            {
                return failed;
            }

            private final void setFailed(boolean <set-?>)
            {
                failed = <set-?>;
            }

            public File step()
            {
                if(failed || fileList != null)
                    break MISSING_BLOCK_LABEL_131;
                onEnter;
                if(onEnter == null) goto _L2; else goto _L1
_L1:
                getRoot();
                invoke();
                (Boolean);
                  goto _L3
_L2:
                JVM INSTR pop ;
                null;
_L3:
                Boolean.valueOf(false);
                Intrinsics.areEqual();
                JVM INSTR ifeq 60;
                   goto _L4 _L5
_L4:
                break MISSING_BLOCK_LABEL_55;
_L5:
                break MISSING_BLOCK_LABEL_60;
                return (File)null;
label0:
                {
                    fileList = getRoot().listFiles();
                    if(fileList != null)
                        break MISSING_BLOCK_LABEL_131;
                    if(onFail == null)
                        break label0;
                    (Unit)onFail.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                    break MISSING_BLOCK_LABEL_125;
                }
                JVM INSTR pop ;
                failed = true;
label1:
                {
                    if(fileList != null)
                    {
                        if(fileList == null)
                            Intrinsics.throwNpe();
                        if(fileIndex < ((Object[])fileList).length)
                        {
                            if(fileList == null)
                                Intrinsics.throwNpe();
                            int i = fileIndex;
                            fileIndex = fileIndex + 1;
                            return fileList[i];
                        }
                    }
                    if(!rootVisited)
                    {
                        rootVisited = true;
                        return getRoot();
                    }
                    if(onLeave == null)
                        break label1;
                    (Unit)onLeave.invoke(getRoot());
                    break MISSING_BLOCK_LABEL_234;
                }
                JVM INSTR pop ;
                return (File)null;
            }

            private boolean rootVisited;
            private File fileList[];
            private int fileIndex;
            private boolean failed;
            final FileTreeWalkIterator this$0;

            public BottomUpDirectoryState(File rootDir)
            {
                Intrinsics.checkParameterIsNotNull(rootDir, "rootDir");
                this$0 = FileTreeWalkIterator.this;
                super(rootDir);
            }
        }

        private final class TopDownDirectoryState extends DirectoryState
        {

            private final boolean getRootVisited()
            {
                return rootVisited;
            }

            private final void setRootVisited(boolean <set-?>)
            {
                rootVisited = <set-?>;
            }

            private final File[] getFileList()
            {
                return fileList;
            }

            private final void setFileList(File <set-?>[])
            {
                fileList = <set-?>;
            }

            private final int getFileIndex()
            {
                return fileIndex;
            }

            private final void setFileIndex(int <set-?>)
            {
                fileIndex = <set-?>;
            }

            public File step()
            {
                if(rootVisited)
                    break MISSING_BLOCK_LABEL_63;
                onEnter;
                if(onEnter == null) goto _L2; else goto _L1
_L1:
                getRoot();
                invoke();
                (Boolean);
                  goto _L3
_L2:
                JVM INSTR pop ;
                null;
_L3:
                Boolean.valueOf(false);
                Intrinsics.areEqual();
                JVM INSTR ifeq 53;
                   goto _L4 _L5
_L4:
                break MISSING_BLOCK_LABEL_48;
_L5:
                break MISSING_BLOCK_LABEL_53;
                return (File)null;
                rootVisited = true;
                return getRoot();
label0:
                {
                    if(fileList != null)
                    {
                        if(fileList == null)
                            Intrinsics.throwNpe();
                        if(fileIndex >= ((Object[])fileList).length)
                            break MISSING_BLOCK_LABEL_253;
                    }
                    if(fileList != null)
                        break MISSING_BLOCK_LABEL_227;
                    fileList = getRoot().listFiles();
                    if(fileList != null)
                        break MISSING_BLOCK_LABEL_165;
                    if(onFail == null)
                        break label0;
                    (Unit)onFail.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                    break MISSING_BLOCK_LABEL_164;
                }
                JVM INSTR pop ;
label1:
                {
                    if(fileList != null)
                    {
                        if(fileList == null)
                            Intrinsics.throwNpe();
                        if(((Object[])fileList).length != 0)
                            break MISSING_BLOCK_LABEL_227;
                    }
                    if(onLeave == null)
                        break label1;
                    (Unit)onLeave.invoke(getRoot());
                    break MISSING_BLOCK_LABEL_221;
                }
                JVM INSTR pop ;
                return (File)null;
                if(fileList == null)
                    Intrinsics.throwNpe();
                int i = fileIndex;
                fileIndex = fileIndex + 1;
                return fileList[i];
label2:
                {
                    if(onLeave == null)
                        break label2;
                    (Unit)onLeave.invoke(getRoot());
                    break MISSING_BLOCK_LABEL_284;
                }
                JVM INSTR pop ;
                return (File)null;
            }

            private boolean rootVisited;
            private File fileList[];
            private int fileIndex;
            final FileTreeWalkIterator this$0;

            public TopDownDirectoryState(File rootDir)
            {
                Intrinsics.checkParameterIsNotNull(rootDir, "rootDir");
                this$0 = FileTreeWalkIterator.this;
                super(rootDir);
            }
        }

        private final class SingleFileState extends WalkState
        {

            private final boolean getVisited()
            {
                return visited;
            }

            private final void setVisited(boolean <set-?>)
            {
                visited = <set-?>;
            }

            public File step()
            {
                if(visited)
                {
                    return (File)null;
                } else
                {
                    visited = true;
                    return getRoot();
                }
            }

            private boolean visited;
            final FileTreeWalkIterator this$0;

            public SingleFileState(File rootFile)
            {
                Intrinsics.checkParameterIsNotNull(rootFile, "rootFile");
                this$0 = FileTreeWalkIterator.this;
                super(rootFile);
                if(_Assertions.ENABLED)
                {
                    boolean flag = rootFile.isFile();
                    if(_Assertions.ENABLED)
                    {
                        if(!flag)
                        {
                            String s = "rootFile must be verified to be file beforehand.";
                            throw (Throwable)new AssertionError(s);
                        }
                    } else
                    {
                    }
                }
            }
        }


        private final Stack getState()
        {
            return state;
        }

        protected void computeNext()
        {
            File nextFile = gotoNext();
            if(nextFile != null)
                setNext(nextFile);
            else
                done();
        }

        private final DirectoryState directoryState(File root)
        {
            direction;
            class WhenMappings
            {

                public static final int $EnumSwitchMapping$0[];

                static 
                {
                    $EnumSwitchMapping$0 = new int[FileWalkDirection.values().length];
                    $EnumSwitchMapping$0[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                    $EnumSwitchMapping$0[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                }
            }

            WhenMappings..EnumSwitchMapping._fld0;
            JVM INSTR swap ;
            ordinal();
            JVM INSTR iaload ;
            JVM INSTR lookupswitch 2: default 70
        //                       1: 40
        //                       2: 55;
               goto _L1 _L2 _L3
_L2:
            (DirectoryState)new TopDownDirectoryState(root);
              goto _L4
_L3:
            (DirectoryState)new BottomUpDirectoryState(root);
              goto _L4
_L1:
            throw new NoWhenBranchMatchedException();
_L4:
            return;
        }

        private final File gotoNext()
        {
_L2:
            Object obj;
            if(state.empty())
                return (File)null;
            obj = state.peek();
            obj;
            if(obj == null)
                Intrinsics.throwNpe();
            (WalkState);
            WalkState topState;
            topState;
            File file = topState.step();
            if(file == null)
            {
                state.pop();
                this;
            } else
            {
                if(Intrinsics.areEqual(file, topState.getRoot()) || !file.isDirectory() || state.size() >= maxDepth)
                    return file;
                state.push(directoryState(file));
                this;
            }
            if(true) goto _L2; else goto _L1
_L1:
        }

        public void remove()
        {
            throw new UnsupportedOperationException("Mutating immutable collection");
        }

        private final Stack state = new Stack();
        final FileTreeWalk this$0;

        public FileTreeWalkIterator()
        {
            this$0 = FileTreeWalk.this;
            super();
            if(start.isDirectory())
                state.push(directoryState(start));
            else
            if(start.isFile())
                state.push(new SingleFileState(start));
            else
                done();
        }
    }


    public Iterator iterator()
    {
        return (Iterator)new FileTreeWalkIterator();
    }

    public final FileTreeWalk onEnter(Function1 function)
    {
        Intrinsics.checkParameterIsNotNull(function, "function");
        return new FileTreeWalk(start, direction, function, onLeave, onFail, maxDepth);
    }

    public final FileTreeWalk onLeave(Function1 function)
    {
        Intrinsics.checkParameterIsNotNull(function, "function");
        return new FileTreeWalk(start, direction, onEnter, function, onFail, maxDepth);
    }

    public final FileTreeWalk onFail(Function2 function)
    {
        Intrinsics.checkParameterIsNotNull(function, "function");
        return new FileTreeWalk(start, direction, onEnter, onLeave, function, maxDepth);
    }

    public final FileTreeWalk maxDepth(int depth)
    {
        if(depth <= 0)
            throw (Throwable)new IllegalArgumentException((new StringBuilder()).append("depth must be positive, but was ").append(depth).append(".").toString());
        else
            return new FileTreeWalk(start, direction, onEnter, onLeave, onFail, depth);
    }

    private FileTreeWalk(File start, FileWalkDirection direction, Function1 onEnter, Function1 onLeave, Function2 onFail, int maxDepth)
    {
        this.start = start;
        this.direction = direction;
        this.onEnter = onEnter;
        this.onLeave = onLeave;
        this.onFail = onFail;
        this.maxDepth = maxDepth;
    }

    FileTreeWalk(File file, FileWalkDirection filewalkdirection, Function1 function1, Function1 function1_1, Function2 function2, int i, int j, 
            DefaultConstructorMarker defaultconstructormarker)
    {
        if((j & 2) != 0)
            filewalkdirection = FileWalkDirection.TOP_DOWN;
        if((j & 0x20) != 0)
            i = IntCompanionObject.MAX_VALUE;
        this(file, filewalkdirection, function1, function1_1, function2, i);
    }

    public FileTreeWalk(File start, FileWalkDirection direction)
    {
        Intrinsics.checkParameterIsNotNull(start, "start");
        Intrinsics.checkParameterIsNotNull(direction, "direction");
        this(start, direction, (Function1)null, (Function1)null, (Function2)null, 0, 32, null);
    }

    public FileTreeWalk(File file, FileWalkDirection filewalkdirection, int i, DefaultConstructorMarker defaultconstructormarker)
    {
        if((i & 2) != 0)
            filewalkdirection = FileWalkDirection.TOP_DOWN;
        this(file, filewalkdirection);
    }

    private final File start;
    private final FileWalkDirection direction;
    private final Function1 onEnter;
    private final Function1 onLeave;
    private final Function2 onFail;
    private final int maxDepth;






}
