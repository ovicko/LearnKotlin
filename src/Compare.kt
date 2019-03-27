//compare numeric values
fun main(args:Array<String>) {
    val num1 = 15
    val num2 = 30

    val match:Boolean = (num1 == num2 )
    println("Values match:  $match")

    val match2 :Boolean = num1.equals(num2)
    println("Values match2:  $match2")

    println("Comparison result:  ${num1.compareTo(num2)}")

    //increase num2
    println("num2 after increase:  ${num2.inc()}")
}