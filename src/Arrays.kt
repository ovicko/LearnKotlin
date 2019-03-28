fun main() {
    val intArray:IntArray = intArrayOf(23,3,14,52,16)
    //sort array
    intArray.sort()

    //loop through
    for (item:Int in intArray) {
        println(item)
    }

    val colorList:List<String> = listOf("Green","Black","Red")
    println(colorList)
    //Mutable list of strings
    val colorList2 :MutableList<String> = mutableListOf("Green","Black","Red")
    colorList2.add("Yellow")
    colorList2.add("Purple")
    colorList2.add("Orange")
    colorList2.add("Gray")

    println(colorList2)
    colorList2.sortDescending()
    println(colorList2)

//Maps in Kotlin
    //immutable Map
    val priceMap = mapOf(
        Pair("shirt",50),
        Pair("short",60),
        Pair("skirt",70),
        Pair("tie",80),
        Pair("chair",540)
    )

    println(priceMap)

}