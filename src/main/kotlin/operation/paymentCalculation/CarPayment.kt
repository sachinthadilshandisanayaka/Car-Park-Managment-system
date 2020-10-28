package operation.paymentCalculation

import operation.paymentCalculation.costForVehicle.CarTypeOne
import operation.paymentCalculation.costForVehicle.LongVehicleTypeOne

class CarPayment: PayementCalcutate {
    override fun payment(minits : Long) : Double {
        return (LongVehicleTypeOne().price() * minits)
    }
}