fun main(args : Array<String>) {
    var _name = setName();
    _name.name = "sanju";
    // test class object
//    println("my name is "+ _name.name);
    println("my name is  ${_name.name}")

    var ageGet = javaClass();
    ageGet.age = "34 years"
    println("my age is ${ageGet.age}");
}