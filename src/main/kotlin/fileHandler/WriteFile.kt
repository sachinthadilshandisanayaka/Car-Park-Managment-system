package fileHandler

import java.io.File
import java.util.*

class WriteFile() {
    fun writeFile(type: String, vehicleDetail: TreeMap<String, String>) {
        val filePath:String = "C:\\Users\\sachi dissanayake\\IdeaProjects\\testKotlin\\src\\main\\kotlin\\fileHandler\\VehiclePark.txt"
        val file = File(filePath)
        file.writeText("Type : $type")
        
    }
}