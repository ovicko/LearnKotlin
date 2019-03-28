import oop.MathLib
import oop.Operation.*

fun main() {

    val n1: Double = MathLib.getInput("Enter first number : ")
    val n2: Double = MathLib.getInput("Enter second number : ")
    println("Select operation: - + / *  ")
    val  option = readLine().toString()
     println(operation(num1 = n1,num2 = n2,option = option ))
}

fun operation(num1:Double ,num2:Double,option:String): Double? {
    val  result:Double? =
        when(option) {
            ADD.operator ->  MathLib.addValues(num1,num2)
            SUBTRACT.operator ->  MathLib.subtractValues(num1,num2)
            MULTIPLY.operator ->  MathLib.multiplyValues(num1,num2)
            DIVIDE.operator ->  MathLib.divideValues(num1,num2)
            else -> throw Exception("Unknown operation")
        }
    return  result
}