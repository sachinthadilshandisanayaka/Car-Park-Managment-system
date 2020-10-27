package service.out

import input.GetVehicleDetails
import input.GetVehicleType
import operation.GetOutVehicle
import ui.OutVehicleValidationShow

class CalculateDuration() {
    fun getVehicleData() {
        OutVehicleValidationShow().printNumber()
        var VNumber = GetVehicleType().getType()

        OutVehicleValidationShow().printType()
        var VId = GetVehicleDetails().getId()

        var bill = GetOutVehicle().calculate(VId.toString(), VNumber.toString())
        if(bill) {
            println("Founded")
        } else {
            println("Not founded")
        }
    }
}