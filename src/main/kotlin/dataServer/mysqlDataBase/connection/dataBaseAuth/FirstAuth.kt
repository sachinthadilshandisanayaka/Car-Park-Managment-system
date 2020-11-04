package dataServer.mysqlDataBase.connection.dataBaseAuth

class FirstAuth(): AuthDataBase {
    private val user: String? = "root"
    private val password:String? = ""
    override fun authPassword(): String? {
        return password
    }
    override fun authUser(): String? {
        return user
    }
}