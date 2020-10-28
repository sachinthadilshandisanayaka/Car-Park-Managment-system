package operation

import fileHandler.readFile
import ui.VehicleEmpty

class GetOutVehicle() :AddBillOperation{
    override fun calculate(vType : String, vNumber: String): Boolean {
        var checker = 0
        var readerData = readFile()

        if(readerData?.size != 0) {
            for (rowData in readerData!!) {
                var splitData = rowData.split(",")
                if(splitData[0].equals(vType, true) && splitData[3].equals(vNumber, true)) {
                    checker = 1;
                }
            }
            return checker == 1

        } else {
            VehicleEmpty().print()
            return false
        }
    }
}