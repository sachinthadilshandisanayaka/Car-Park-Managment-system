package dataServer.fileHandler

import java.util.*

interface WriteData {
    fun writeFile(type: String, vehicleDetail: TreeMap<String, String>) : Boolean
}