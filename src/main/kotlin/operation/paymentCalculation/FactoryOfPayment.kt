package operation.paymentCalculation

import java.time.LocalDateTime

class FactoryOfPayment() {
    var balance : Double? = null
    fun VehicleCost(type : String, diff : Long): Double? {
        if(type == "car") {
            balance = CarPayment().payment(diff)
        } else if (type == "van") {
            balance = VanPayement().payment(diff)
        } else if(type == "bike") {
            balance = BikePayement().payment(diff)
        } else if (type == "threeweel") {
            balance = ThreeweelPayement().payment(diff)
        } else if(type == "longvehicle") {
            balance = LongVehiclePayement().payment(diff)
        }
        return balance
    }
}