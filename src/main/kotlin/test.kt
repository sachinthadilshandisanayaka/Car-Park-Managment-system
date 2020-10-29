////@file:JvmName("First")
//import java.math.BigInteger
//fun main(args: Array<String>) {
//    var a :String = "text"
//    var b :String? = ""
//    val l = b!!.length
//    println(l)
////    var result = fileReader();
////    result.name = "sanju"
////    println(result.name)
//
////    var a1 = student()
////    a1.name = "sachintha"
////
////    var a2 = student()
////    a2.name = "dilshan"
////
////        // use + key word to operator overloading
////    var a3 = a1 + a2
////    println(a3.name)
////
////
////    // Recursion
////    var num = BigInteger("7")
////    println(fact(num, BigInteger.ONE))
////    var m = Fruit("tasty")
////    m.apple()
////    var objectFourWeel = FourWeel(20)
////    println(objectFourWeel.car())
//}
//class Fruit constructor(var n: String= "nice"){
//    var name:String=""
//    init {
//        name = n
//    }
//    fun apple() {
//        print("apple is : $name")
//    }
//}
//open class Vehicle(num : Int) {
//    init {
//        println("Car number is : $num")
//    }
//    // function override
//    open fun car() {
//        println("I'm a Car ")
//    }
//}
//class FourWeel(num : Int) : Vehicle(num) {
//    override fun car() {
//    println("car is override")
//    }
//}
//    // extension function
//    // infix function can get only one parameter
//    // operator overloading
//    infix operator fun student.plus(obj : student) : student {
//    var fullName = student()
//    fullName.name = this.name + " " + obj.name
//        return fullName
//}
//tailrec fun fact(num : BigInteger, res : BigInteger) : BigInteger {
//    return if(num == BigInteger.ZERO) {
//        res
//    } else {
//        fact( num - BigInteger.ONE, num*res )
//    }
//}
//
////@JvmOverloads
////fun offer(x : Int, y : Double = 0.05) :Int {
////    return ( x + x*y ).toInt()
////}