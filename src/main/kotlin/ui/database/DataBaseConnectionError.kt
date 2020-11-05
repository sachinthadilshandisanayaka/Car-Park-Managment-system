package ui.database

import java.sql.SQLException

class DataBaseConnectionError {
    fun printError(e: SQLException) {
        println(e)
    }
}