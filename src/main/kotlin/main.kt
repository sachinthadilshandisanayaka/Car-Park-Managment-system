import fileHandler.readFile
fun main(args : Array<String>) {
    var readFileObject: MutableList<String>? = readFile()
    println(readFileObject?.toString() + "\n" + readFileObject?.size)
//    println("Vehicle Park Management System")
//    println("1. Park \n2. Out\n3. Bill")
//    print("Enter your requirement :")
//    var oder = readLine()
//
//    if(oder.equals("park", true)) {
//
//    } else if(oder.equals("out", true)) {
//
//    } else if(oder.equals("bill", true)) {
//
//    } else {
//
//    }
//
//    println("1. Car\n2. Van\n3. ThreeWeel\n4. Bike\n5. LongVehicle")
//    print("Enter vehicle type :")
//    var vehicleType = readLine();
//    println(vehicleType)
//    if(vehicleType.equals("car", true)) {
//
//    } else if(vehicleType.equals("van", true)) {
//
//    } else if (vehicleType.equals("threeWeel", true)) {
//
//    } else if (vehicleType.equals("bike", true)) {
//
//    } else if (vehicleType.equals("longvehicle", true)) {
//
//    } else {
//
//    }
}