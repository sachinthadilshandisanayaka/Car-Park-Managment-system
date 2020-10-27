package service.out

import input.GetVehicleDetails
import input.GetVehicleType
import operation.GetOutVehicle
import ui.BillShow

class CalculateDuration() {
    fun getVehicleData() {
        BillShow().printNumber()
        var VNumber = GetVehicleType().getType()

        BillShow().printType()
        var VId = GetVehicleDetails().getId()

        var bill = GetOutVehicle().calculate(VId.toString(), VNumber.toString())
    }
}