package dataServer.mysqlDataBase.insertData

import dataServer.mysqlDataBase.connection.JDBCDataBaseConnection
import dataServer.mysqlDataBase.connection.quary.InsertQuery
import ui.database.DataBaseConnectionError
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement

class PutData {
    fun insertDataToDataBase() {
        var stmt: Statement? = null
        var resultSet: ResultSet? = null

        try {
            val conn = JDBCDataBaseConnection().connection()
            stmt = conn!!.createStatement()
            var query = InsertQuery().getQuery()
            resultSet = stmt!!.executeQuery(query)

            if (stmt.execute(query)){
                resultSet = stmt.resultSet
            }
            while (resultSet!!.next()) {

            }
        } catch (e:SQLException) {
            DataBaseConnectionError().printError(e)
//            e.printStackTrace()
        }
    }
}