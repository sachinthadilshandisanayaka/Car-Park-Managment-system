package dataServer.mysqlDataBase.connection

import java.sql.Connection

interface GetConnection {
    fun connection(): Connection?
}