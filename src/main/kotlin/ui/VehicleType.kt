package ui

class VehicleType() : BasicDeatilPrint {
    override fun print() {
        println("1. Car\n2. Van\n3. ThreeWeel\n4. Bike\n5. LongVehicle\n" +
                "Enter vehicle type :")
    }
}