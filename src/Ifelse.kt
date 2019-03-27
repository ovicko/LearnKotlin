//control flow with if else

fun main() {
    println("Enter any digit: ")
    val name = readLine()

    if (name.equals("Victor") ) {
        println("Yes its Victor ")
    } else {
        println("Its $name, we wanted Victor ")
    }

    //this could be null
    val  person:String?
    when(name) {
        "VA" -> person = "Victor Amwollo"
        "VI" ->  person = "AMWOLLO VIC"
        else ->person  = "Unknown"
    }

    println("========The person is  $person")
}