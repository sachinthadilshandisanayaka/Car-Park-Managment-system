package ui.database

import java.sql.SQLException

class DataBaseConnectionError: ConnectionError{
    override fun printError(e: SQLException) {
        println(e)
    }
}