package ui.billingSection

class ExitWithBill: ExitVehicle {
    override fun getBill(money : Double){
        println("=======================")
        println("You cost is : Rs $money")
        println("Thank you! Come again.")
    }
}