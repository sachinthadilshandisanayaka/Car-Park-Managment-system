package operation

class ServiceCheck() : AddSeviceOperation{
    override fun check(service: String) : String? {
        if(service.equals("park", true)) {
            return "park"
        } else if(service.equals("out", true)) {
            return "out"
        } else if(service.equals("bill", true)) {
            return "bill"
        } else {
            return null
        }
    }
}