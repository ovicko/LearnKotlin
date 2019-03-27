//using custom functions
fun main() {
    println(greatVisitor("Victor Amwollo"))

    println(addValues(1,2,3,4,5,6,8))

}

fun greatVisitor(name:String): String{
    val greetings:StringBuilder =  StringBuilder("Goodmorning $name \n")
        .append("How was your morning?\n")
        .append("are we having anything for lunch?\n")
    //val result:String = greetings.toString()
    return greetings.toString()
}

//accepting multiple arguments
fun addValues(vararg numbers:Int ):Int {
   var result = 0
    for (i:Int in numbers) {
        result += i
    }
    return  result
}