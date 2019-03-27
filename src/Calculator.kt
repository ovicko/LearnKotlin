fun main() {
    println("Enter first number : ")
    val n1:Int = readLine()!!.toInt()
    println("Enter second number : ")
    val n2:Int = readLine()!!.toInt()
    println("Select operation: - + / *  ")
    val  option = readLine().toString()
     println(operation(num1 = n1,num2 = n2,option = option ))
}

fun operation(num1:Int ,num2:Int,option:String): Int {
    val  result:Int
    when(option) {
        "-" -> result = Consts.subtractValues(num1,num2)
        "+" ->  result = Consts.addValues(num1,num2)
        "/" ->  result = Consts.divideValues(num1,num2)
        "*" ->  result = Consts.multiplyValues(num1,num2)
        else -> throw Exception("Unknown operation")
    }
    return  result
}