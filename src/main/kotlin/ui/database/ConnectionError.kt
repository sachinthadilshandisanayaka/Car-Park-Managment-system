package ui.database

import java.sql.SQLException

interface ConnectionError {
    fun printError(e: SQLException)
}