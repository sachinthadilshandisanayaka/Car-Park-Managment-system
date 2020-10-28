package fileHandler

import com.sun.org.apache.xpath.internal.operations.Bool
import fileHandler.FileLocation.GetLocation
import fileHandler.FileLocation.LocationOne
import java.io.File
import java.util.*

class WriteFile(): WriteData {
    override fun writeFile(type: String, vehicleDetail: TreeMap<String, String>) : Boolean {
        return try {
            val filePath:String = LocationOne().getLocation()
            val file = File(filePath)
            file.appendText("$type,${vehicleDetail["name"]}," +
                    "${vehicleDetail["id"]},${vehicleDetail["number"]}," +
                    "${vehicleDetail["color"]},${vehicleDetail["park_Time"]}\n")
            true
        }catch (e : Exception) {
            false
        }
    }
}