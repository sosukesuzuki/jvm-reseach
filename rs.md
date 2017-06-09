# ScalaとKotlinのラムダと拡張関数はJavaに変換するとどうなってるの？
## 前提
* Javaとは、世界30億のデバイスで走ると言われている世界で一番有名なプログラミング言語の１つで、有名なものだとAndroidアプリケーションはJavaでできている。クラスベースオブジェクト指向言語で、初心者でもとっつきやすいが文法が冗長であったりと、欠点も多いと言われている。JVM（Java仮装環境）上で動作する。
* Kotlinとは、JetBrainsという会社が研究・開発しているプログラミング言語で、Javaと同じJVM上で動作する。最近のGoogle I/OでAndroidアプリケーションの開発における公式言語として採用されることが決定した。関数をファーストクラスオブジェクトとして扱う言語なので、高階関数を使用したり、ラムダ式をそのまま高階関数の引数に渡すことができる。また、容易に拡張関数を実装することができる。今回の例では、これらの機能を使用する。
* Scalaとは、マーティン・オーダスキー博士が2003年に開発したプログラミング言語で関数型プログラミングとオブジェクト指向プログラミングの２つのプログラミングパラダイムを持つ。Java、Kotlin同様にJVM上で動作する。Javaに比べたら冗長に記述する必要がなく、Kotlinと比較してもシンタックスシュガーが豊富で、言語仕様の大きさに比べて直感的なプログラミングが可能である。関数型プログラミング言語であるため、関数をファーストクラスオブジェクトして扱い、Kotlin同様高階関数やラムダ式を自由に使うことができる。また、implicitという他のプログラミング言語にはない珍しい機能を備えており、それにより拡張関数や、Haskellライクな型クラスを表現することが可能である。Haskellライク型クラスを実装できるおかげで、ファンクターやアプリカティブ、モナドなどの純粋関数型言語が備えているような概念を利用することが可能である。だが、Scala自体は非純粋関数型プログラミング言語であり、副作用を許容している。
## モチベーション
前提にあげた三つのプログラミング言語はどれもJVMで動作する。下の図を見て欲しい。
![jvm.png](/Users/suzuki/Desktop/jvm.png)
この図はJava、Scala、Kotlinがそれぞれどのようにコンパイルされ、JVMまでたどり着くかを示したものである。これらはこのあと機械語に変換され実行される。が、いまはそこは重要ではないので、図には記載しなかった。いま重要なのは、それぞれ違うプログラミング言語がコンパイラによって、同じ中間言語「Javaバイトコード」に変換されている点である。これら三つの言語はそれぞれ言語実装も言語仕様も全くことなるはずなのに、同じ種類のファイルに変換されるのである。そして、classファイルをjavaファイルに変換する`jad`というコマンドがある。このコマンドを使えば、ScalaやKotlinで書いたプログラムを一度Javaバイトコードにコンパイルし、それをJavaにデコンパイルすることが可能なのである。だが、これは驚くべきことではない。ScalaやKotiinはそもそもJavaとの相互呼び出しや互換性を保証しているため当然のことなのだ。だが、この事実を踏まえても少し不思議な点がある。ScalaやKotlinにはJavanにはない機能が多く存在している。なら、それらはJavaに変換されたときに、どのような実装になっているのか。つまり、「ScalaやKotlinのコードはJavaで等価なものを表現可能である。だが、それらの言語はJavaにはない機能を多く有している。なら、それらはJavaのコードではどのように表現されているのか？」という疑問が浮かんだのだ。
## 例
***
下に示す例１は「ラムダ式と高階関数」を用いて記述したコードだ。これらをコンパイルした後にJavaにデコンパイルし、その実装を後の章で読んでいく。
### 例１ ラムダ式と高階関数
Scala
```scala
def calc(x: Int, y: Int, func: (Int, Int) => Int): Int = func(x,y)
println(calc(1,2,(x, y) => x + y) //=> 3
```
Kotlin
```kotlin
fun clac(x: Int, y: Int, func: (Int, Int) -> Int): Int = func(x,y)
println(cals(1,2,{ x , y -> x + y }) //=> 3
```
***
下に示す例２は「拡張関数」を用いて記述したコードだ。こちらも後にJavaにデコンパイルし、それを読むことにする。
### 例2 拡張関数
Scala
```scala
implicit class PreInt(x: Int) {
  def add3 = x + 3
}

//使用する
3.add3 //=> 6
```
Kotlin
```kotlin
fun Int.add3() {
  return this + 3
}

//使用する
3.add3() //=> 6
```
## 実践
次はいま書いたコードをコンパイルし、さらにJavaにデコンパイルする必要がある。
手順としては簡単で、書いたコードに`kotlinc`及び`scalac`コマンドを使い、classファイルにコンパイルし、それをjadでjavaにデコンパイルする。
***
下に示すコードは先程示したコードを実行可能な状態まで加筆したものだ。
```scala
object LambdsExample {
  def main (args: Array[String]): Unit = {
    def calc(x: Int, y: Int, func: (Int, Int) => Int): Int = func(x,y)
    println(calc(1,2,(x, y) => x + y))
  }
}
```
```scala
object ExtensionExample {
  implicit class PreInt(x: Int) {
    def add3 = x + 3
  }
  def main (args: Array[String]): Unit = {
    println(3.add3)
  }
}
```
では、これらをコンパイルし、そしてデコンパイルしていく。
```shell
$ scalac Hoge.scala //classファイルが吐き出される

$ jad -s java -d src -r **/*.class //./srcにjavaファイルが出力される
```
Hoge.scalaを先程書いたScalaファイルの名前に置き換えると、コンパイル及びデコンパイルができる。
では、下にデコンパイルした結果のJavaコードを記載する。mainメソッドを含むクラスとロジックを含んでいるクラスに分かれて２つのJavaファイルが生成されたようだ。
### 拡張関数の例
```java
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExtensionExample.scala

import scala.Predef$;
import scala.runtime.BoxesRunTime;

public final class ExtensionExample$
{

    public ExtensionExample.PreInt PreInt(int x)
    {
        return new ExtensionExample.PreInt(x);
    }

    public void main(String args[])
    {
        Predef$.MODULE$.println(BoxesRunTime.boxToInteger(PreInt(3).add3()));
    }

    private ExtensionExample$()
    {
    }

    public static final ExtensionExample$ MODULE$ = this;

    static 
    {
        new ExtensionExample$();
    }
}
```
```java
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExtensionExample.scala


public final class ExtensionExample
{
    public static class PreInt
    {

        public int add3()
        {
            return x + 3;
        }

        private final int x;

        public PreInt(int x)
        {
            this.x = x;
            super();
        }
    }


    public static void main(String args[])
    {
        ExtensionExample$.MODULE$.main(args);
    }

    public static PreInt PreInt(int i)
    {
        return ExtensionExample$.MODULE$.PreInt(i);
    }
}
```
### ラムダの例
```java
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LambdaExample.scala

import scala.*;
import scala.runtime.BoxesRunTime;

public final class LambdsExample$
{

    public void main(String args[])
    {
        Predef$.MODULE$.println(BoxesRunTime.boxToInteger(calc$1(1, 2, new Serializable() {

            public final int apply(int x, int y)
            {
                return apply$mcIII$sp(x, y);
            }

            public int apply$mcIII$sp(int x, int y)
            {
                return x + y;
            }

            public final volatile Object apply(Object v1, Object v2)
            {
                return BoxesRunTime.boxToInteger(apply(BoxesRunTime.unboxToInt(v1), BoxesRunTime.unboxToInt(v2)));
            }

            public static final long serialVersionUID = 0L;

        }
)));
    }

    private final int calc$1(int x, int y, Function2 func)
    {
        return func.apply$mcIII$sp(x, y);
    }

    private LambdsExample$()
    {
    }

    public static final LambdsExample$ MODULE$ = this;

    static 
    {
        new LambdsExample$();
    }
}
```
```java
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LambdaExample.scala


public final class LambdsExample
{

    public static void main(String args[])
    {
        LambdsExample$.MODULE$.main(args);
    }
}

```
***
次に示すのが、実行可能な状態まで加筆したKotlinのコードである。
```kotlin
fun main (args: Array<String>) {
  fun Int.add3(): Int {
    return this + 3
  }
  println(3.add3())
```
```kotlin
fun main(args: Array<String>) {
    fun calc(x: Int, y: Int, func: (Int, Int) -> Int): Int = func(x,y)
    println(calc(1,2,{ x, y -> x + y}))
}
``` 
先程は`scalac`を使ったが、今回はkotlinをコンパイルするので、`kotlinc`コマンドを使う。他は同じ手順で、デコンパイル可能だ。Kotlinの場合は、トップレベルにmainメソッドを記述できるので、2ファイルに分割せずにデコンパイルができた。
### 拡張関数の例
```java
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExtensionExample.kt

import java.io.PrintStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ExtensionExampleKt
{

    public static final void main(String args[])
    {
        Intrinsics.checkParameterIsNotNull(args, "args");
        static final class main._cls1 extends Lambda
            implements Function1
        {

            public volatile Object invoke(Object obj)
            {
                return Integer.valueOf(invoke(((Number)obj).intValue()));
            }

            public final int invoke(int $receiver)
            {
                return $receiver + 3;
            }

            public static final main._cls1 INSTANCE = new main._cls1();


        }

        main._cls1 add3$ = main._cls1.INSTANCE;
        int i = add3$.invoke(3);
        System.out.println(i);
    }
}
```
### ラムダ式のやつ
```java
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LambdaExample.kt

import java.io.PrintStream;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class LambdaExampleKt
{

    public static final void main(String args[])
    {
        Intrinsics.checkParameterIsNotNull(args, "args");
        static final class main._cls1 extends Lambda
            implements Function3
        {

            public volatile Object invoke(Object obj, Object obj1, Object obj2)
            {
                return Integer.valueOf(invoke(((Number)obj).intValue(), ((Number)obj1).intValue(), (Function2)obj2));
            }

            public final int invoke(int x, int y, Function2 func)
            {
                Intrinsics.checkParameterIsNotNull(func, "func");
                return ((Number)func.invoke(Integer.valueOf(x), Integer.valueOf(y))).intValue();
            }

            public static final main._cls1 INSTANCE = new main._cls1();


        }

        main._cls1 calc$ = main._cls1.INSTANCE;
        static final class main._cls2 extends Lambda
            implements Function2
        {

            public volatile Object invoke(Object obj, Object obj1)
            {
                return Integer.valueOf(invoke(((Number)obj).intValue(), ((Number)obj1).intValue()));
            }

            public final int invoke(int x, int y)
            {
                return x + y;
            }

            public static final main._cls2 INSTANCE = new main._cls2();


        }

        int i = ((main._cls1)calc$).invoke(1, 2, (Function2)main._cls2.INSTANCE);
        System.out.println(i);
    }
}



```