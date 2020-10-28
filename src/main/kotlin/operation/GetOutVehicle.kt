package operation

import fileHandler.readFile
import operation.timeZone.CurrentState
import ui.VehicleEmpty
import java.time.format.DateTimeFormatter

class GetOutVehicle() :AddBillOperation{
    override fun calculate(vType : String, vNumber: String): Boolean {
        var checker = 0
        var readerData = readFile()

        if(readerData?.size != 0) {
            for (rowData in readerData!!) {
                    var splitData = rowData.split(",")
                    if(splitData[0].equals(vType, true) && splitData[3].equals(vNumber, true)) {
                        var currentTime = CurrentState().currentTimeAndDate()
                        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
                        var parkingTimeZone = splitData[5].format(formatter)
                        println(parkingTimeZone + " and " + currentTime?.format(formatter))
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