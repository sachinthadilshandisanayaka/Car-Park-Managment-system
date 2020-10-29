package operation

interface AddBillOperation {
    fun calculate(vType : String, vNumber: String): Any?
}