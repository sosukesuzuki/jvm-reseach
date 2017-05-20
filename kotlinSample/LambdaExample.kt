fun main(args: Array<String>) {
    fun calc(x: Int, y: Int, func: (Int, Int) -> Int): Int = func(x,y)
    println(calc(1,2,{ x, y -> x + y}))
}