package operation.paymentCalculation

import operation.paymentCalculation.costForVehicle.ThreeweelTypeOne

class ThreeweelPayement: PayementCalcutate {
    override fun payment(minits : Long) : Double {
        return (ThreeweelTypeOne().price() * minits)
    }
}