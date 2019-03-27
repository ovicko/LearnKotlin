//working with strings
//strings are immutable
fun main() {
    var greetings = "Hello"
    print(greetings)

    //concat
    greetings +=  "Victor"

    val  charArray:CharArray = greetings.toCharArray()
    print(charArray.toList())

    //compare strings
    val string2 = "HelloVictor"
    println("Do they match? ${string2.equals(greetings)}")


}