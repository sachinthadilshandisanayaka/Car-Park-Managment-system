package service.park
import input.GetVehicleDetails
import ui.carDetail.VehicleDetail
import java.util.*

class ParkACar() {
    fun park() :TreeMap<String, String>{
        var detail = TreeMap<String, String>()
        var carDetail = VehicleDetail()
        var getCarDetails = GetVehicleDetails()

        carDetail.showOwner()
        detail["name"] = getCarDetails.getNumber().toString()
        
        carDetail.showId()
        detail["id"] = getCarDetails.getId().toString()
        
        carDetail.showNumber()
        detail["number"] = getCarDetails.getNumber().toString()
        
        carDetail.showColor()
        detail["color"] = getCarDetails.getColor().toString()

        return detail;
    }
}