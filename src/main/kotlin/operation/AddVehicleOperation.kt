package operation

import java.util.*

interface AddVehicleOperation {
    fun check(service: String) : TreeMap<String, String>?
}