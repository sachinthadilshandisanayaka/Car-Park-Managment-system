package operation

import fileHandler.readFile
import input.GetVehicleDetails
import input.GetVehicleType
import service.out.CalculateDuration
import ui.BillShow

class GetOutVehicle() {
    fun calculate(vType : String, vNumber: String) {
        var readerData = readFile()
        if(readerData != null) {
            for (rowData in readerData) {
                var splitData = rowData.split(",")
                println(splitData)
            }
        } else {
            println("No vehilce in the park !")
        }
    }
}