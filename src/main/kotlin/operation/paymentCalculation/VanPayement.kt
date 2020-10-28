package operation.paymentCalculation

import operation.paymentCalculation.costForVehicle.VanTypeOne

class VanPayement : PayementCalcutate {
    override fun payment(minits : Long) : Double {
        return (VanTypeOne().price() * minits)
    }
}