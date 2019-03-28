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
    //Mutable map
    val countyMap: MutableMap<Int, String> = mutableMapOf<Int, String>()
    countyMap.put(47, "Nairobi")
    countyMap.put(31, "Vihiga")
    countyMap.put(46, "Kiambu")
    countyMap.put(1, "Mombasa")

    println(countyMap)

    //loop through a map
    for (code: Int in countyMap.keys) {
        println("The code of ${countyMap.get(code)} is $code")
    }
    //loop through a map
    for ((code: Int, county: String) in countyMap) {
        println("The code of $county is $code")
    }
}