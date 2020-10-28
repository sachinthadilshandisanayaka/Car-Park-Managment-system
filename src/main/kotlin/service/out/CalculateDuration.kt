package service.out

import input.GetVehicleDetails
import input.GetVehicleType
import operation.GetOutVehicle
import ui.outVehicle.OutVehicleValidationShow
import ui.userInputError.NullValueEntering

class CalculateDuration() : Calculation{
    override fun getVehicleData() {
        OutVehicleValidationShow().printNumber()
        var VNumber = GetVehicleType().getType()

        OutVehicleValidationShow().printType()
        var VId = GetVehicleDetails().getId()

        if(VNumber.toString().trim() == "") {
            NullValueEntering().print("Vehicle Number")
            return
        } else if ( VId.toString().trim() == ""){
            NullValueEntering().print("Vehicle ID")
            return
        } else {
            var bill = GetOutVehicle().calculate(VId.toString(), VNumber.toString())
            if(bill) {
                println("Founded")
            } else {
                println("Not founded")
            }
        }
    }
}