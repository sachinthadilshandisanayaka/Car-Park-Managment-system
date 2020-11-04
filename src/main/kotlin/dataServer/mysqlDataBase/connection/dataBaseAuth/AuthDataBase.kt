package dataServer.mysqlDataBase.connection.dataBaseAuth

interface AuthDataBase {
    fun authPassword(): String?
    fun authUser(): String?
}