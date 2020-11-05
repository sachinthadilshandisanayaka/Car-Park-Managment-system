package dataServer.mysqlDataBase.connection

import dataServer.mysqlDataBase.connection.dataBaseAuth.FirstAuth
import ui.database.DataBaseConnectionError
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

class JDBCDataBaseConnection() : GetConnection {
    override fun connection(): Connection? {
        val connectionProp = Properties()
        connectionProp["user"] = FirstAuth().authUser()
        connectionProp["password"] = FirstAuth().authPassword()

        return try {
            Class.forName("com.mysql.jdbc.Driver").newInstance()
            DriverManager.getConnection(
                    "jdbc:" + "mysql" + "://" +
                            "127.0.0.1" +
                            ":" + "3306" + "/" +
                            "",
                    connectionProp)
        } catch (e : SQLException) {
            DataBaseConnectionError().printError(e)
            null
        }
    }
}