package ui

class ServiceErrorPrint() : BasicDeatilPrint {
    override fun print() {
        println("You entered service type is incorrect.\n" +
                "Please correct it.")
    }
}