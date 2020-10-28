package operation

import fileHandler.readFile
import operation.timeZone.CurrentState
import sun.util.resources.LocaleData
import ui.VehicleEmpty
import java.time.LocalDate
import java.time.LocalDateTime
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
                        var parkingTimeZone = LocalDateTime.parse(splitData[5], formatter)
                        println(" $currentTime and $parkingTimeZone")
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