package operation.paymentCalculation

import operation.paymentCalculation.costForVehicle.BikeTypeOne

class BikePayement: PayementCalcutate {
    override fun payment(minits : Long) : Double {
        return (BikeTypeOne().price() * minits)
    }
}