package fileHandler

import java.io.File

fun readFile() : MutableList<String>? {
    var data = mutableListOf<String>()
    val fileName : String = "C:\\Users\\sachi dissanayake\\IdeaProjects\\testKotlin\\src\\main\\kotlin\\fileHandler\\VehiclePark.txt"
    try {
        val file = File(fileName)
        file.forEachLine{
            data.add(it)
        }
    } catch (e: Exception) {
        println("The system cannot find the file")
    }
    return data
}