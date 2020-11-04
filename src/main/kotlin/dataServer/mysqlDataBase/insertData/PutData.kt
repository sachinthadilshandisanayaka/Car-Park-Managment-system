package dataServer.mysqlDataBase.insertData

import dataServer.mysqlDataBase.connection.JDBCDataBaseConnection
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
            resultSet = stmt!!.executeQuery("INSERT INTO CarPark('') VALUE('')")

            if (stmt.execute("INSERT INTO CarPark('') VALUE('')")){
                resultSet = stmt.resultSet
            }
            while (resultSet!!.next()) {

            }
        } catch (e:SQLException) {
            e.printStackTrace()
        }
    }
}