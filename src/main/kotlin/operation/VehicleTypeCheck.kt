package operation

import service.park.*
import ui.VehicleTypeError
import java.util.*

class VehicleTypeCheck() : AddVehicleOperation{
    override fun check(service: String) : TreeMap<String, String>?{
        if(service.equals("car", true)) {
            var list = ParkACar().park()
            return list
        } else if (service.equals("van", true)) {
            var list = ParkAVan().park()
            return list
        } else if (service.equals("bike", true)) {
            var list = ParkABike().park()
            return list
        } else if(service.equals("threeweel", true)) {
            var list = ParkATreeWeel().park()
            return list
        } else if (service.equals("longvehicle", true)) {
            var list = ParkALongVehicle().park()
            return list
        } else {
            VehicleTypeError().print()
            return null;
        }
    }
}