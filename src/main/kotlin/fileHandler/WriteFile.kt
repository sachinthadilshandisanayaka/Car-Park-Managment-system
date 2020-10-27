package fileHandler

import com.sun.org.apache.xpath.internal.operations.Bool
import java.io.File
import java.util.*

class WriteFile() {
    fun writeFile(type: String, vehicleDetail: TreeMap<String, String>) : Boolean {
        return try {
            val filePath:String = "C:\\Users\\sachi dissanayake\\IdeaProjects\\testKotlin\\src\\main\\kotlin\\fileHandler\\VehiclePark.txt"
            val file = File(filePath)
            file.appendText("$type,${vehicleDetail["name"]}," +
                    "${vehicleDetail["id"]},${vehicleDetail["number"]}," +
                    "${vehicleDetail["color"]}\n")
            true
        }catch (e : Exception) {
            false
        }
    }
}