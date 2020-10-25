import fileHandler.readFile
import input.GetVehicleType
import input.ServiceType
import operation.ServiceCheck
import operation.VehicleTypeCheck
import ui.ServiceErrorPrint
import ui.UiServiceType
import ui.VehicleType
import javax.print.PrintService


fun main(args : Array<String>) {
//    var readFileObject: MutableList<String>? = readFile()
//    println(readFileObject?.toString() + "\n" + readFileObject?.size)
    var uiServiceType =  UiServiceType().print()
    var inputServiceType = ServiceType().printServices()
    var seviceCheck = inputServiceType?.let { ServiceCheck().check(it) }

    if(seviceCheck == null) {
        var serviceErrorPrint = ServiceErrorPrint().print()
        return;
    } else if (seviceCheck == "park") {
        var vehicleType = VehicleType().print()
        var getVehicleType = GetVehicleType().getType()
        var vehicleTypeCheck = getVehicleType?.let { VehicleTypeCheck().check(it) }
        if(vehicleTypeCheck == null) {
            return;
        } else {
            println(vehicleTypeCheck)
        }

    }

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