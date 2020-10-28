package ui.userInputError

class NullValueEntering: UserInputError {
    override fun print(data : String?) {
        println("Please entered value for \"$data\"")
    }
}