@file:JvmName("First")
fun main(args: Array<String>) {
//    var result = fileReader();
//    result.name = "sanju"
//    println(result.name)
}
fun add(x :Int, y : Int) : Int = x+y

@JvmOverloads
fun offer(x : Int, y : Double = 0.05) :Int {
    return ( x + x*y ).toInt()
}