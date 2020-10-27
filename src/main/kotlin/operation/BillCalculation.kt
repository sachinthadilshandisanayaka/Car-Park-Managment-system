package operation

import input.GetVehicleDetails
import input.GetVehicleType
import ui.BillShow

class BillCalculation() {
    fun getVehicleData() {
        BillShow().printNumber()
        var VNumber = GetVehicleType().getType()

        BillShow().printType()
        var VId = GetVehicleDetails().getId()


    }
}