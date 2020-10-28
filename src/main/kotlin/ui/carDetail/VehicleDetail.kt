package ui.carDetail

class VehicleDetail() : VehicleData{
    override fun showNumber(){
        println("Enter Vehicle number :")
    }
    override fun showOwner(){
        println("Enter Driver name :")
    }
    override fun showId(){
        println("Enter ID number :")
    }
    override fun showColor() {
        println("Enter Color :")
    }
}