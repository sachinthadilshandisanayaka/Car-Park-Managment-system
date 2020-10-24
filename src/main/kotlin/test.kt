//@file:JvmName("First")
fun main(args: Array<String>) {
//    var result = fileReader();
//    result.name = "sanju"
//    println(result.name)

    var a1 = student()
    a1.name = "sachintha"

    var a2 = student()
    a2.name = "dilshan"

    var a3 = a1.plus(a2)
    println(a3.name)

}
    // extension function
fun student.plus(obj : student) : student {
    var fullName = student()
    fullName.name = this.name + " " + obj.name
        return fullName
}

fun add(x :Int, y : Int) : Int = x+y

//@JvmOverloads
//fun offer(x : Int, y : Double = 0.05) :Int {
//    return ( x + x*y ).toInt()
//}