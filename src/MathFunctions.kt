import kotlin.math.PI
import kotlin.math.abs

//using inbuilt math functions

fun main(args:Array<String>) {
    val num1 = 15
    val num2 = 2

    val sum:Int  = num1.plus(num2)
    println("Sum is:  $sum")

    val difference:Int = num1.minus(num2)
    println("difference is:  $difference")

    val product:Int = num1.times(num2)
    println("Product is:  $product")

    val remainder:Int = num1.rem(num2)
    println("remainder is:  $remainder")

    val quotient:Double = num1.toDouble().div(num2)
    println("quotient is:  $quotient")

    val neg = -152.5
    val  absolute:Double = abs(neg)
    println("absolute is:  $absolute")

    println("PI is:  $PI")
}