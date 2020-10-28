package operation

import fileHandler.readFile
import operation.TimeDefference.MinitsCalculation
import operation.TimeFormate.GetLocaldatetime
import operation.paymentCalculation.FactoryOfPayment
import operation.timeZone.CurrentState
import ui.VehicleEmpty
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

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
                        val parkingTimeZone = GetLocaldatetime().timeAndDate(splitData[5])
                        println(" $currentTime and $parkingTimeZone")
                        val diff = MinitsCalculation().calculation(
                                parkingTimeZone!!,
                                currentTime!!
                        )
                        var balance = FactoryOfPayment().VehicleCost(vType, diff!!)
                        println("Cost is Rs: $balance")
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