package dataServer.mysqlDataBase.connection

import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

class JDBCDataBaseConnection() : GetConnection {
    fun connection() {
        val connectionProp = Properties()
        connectionProp.put("user", "root")
        connectionProp.put("password", "")

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance()
            var conn = DriverManager.getConnection(
                    "jdbc:" + "mysql" + "://" +
                            "127.0.0.1" +
                            ":" + "3306" + "/" +
                            "",
                    connectionProp)
        } catch (e : SQLException) {
            e.printStackTrace()
        }
    }
}