package service.park

import input.GetCarDetails
import ui.carDetail.CarDetail
import java.util.*

class ParkABike() {
    fun park() : TreeMap<String, String> {
        var detail = TreeMap<String, String>()
        var carDetail = CarDetail()
        var getCarDetails = GetCarDetails()

        carDetail.showOwner()
        detail["name"] = getCarDetails.getNumber().toString()

        carDetail.showId()
        detail["Id"] = getCarDetails.getId().toString()

        carDetail.showNumber()
        detail["number"] = getCarDetails.getNumber().toString()

        carDetail.showColor()
        detail["color"] = getCarDetails.getColor().toString()

        return detail;
    }
}