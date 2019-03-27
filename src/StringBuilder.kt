//working with strings
//string builder
fun main() {
    val greetings:StringBuilder =  StringBuilder("Goodmorning Victor\n")
        .append("How was your morning?\n")
        .append("are we having anything for lunch?\n")
    val result:String = greetings.toString()

    println(result)


}