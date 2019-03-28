package oop

fun main() {
    val item = ClothingItem("Shirt","L",15.89)
    val item2 = ClothingItem("M",100.23)
    println(item)
    println("==========\n")
    println(item2)

    item2.price = 1000.00
    println("==========\n")
    println(item2.price)
    println("==========\n")
    val person = Person("Victor", "Amwollo")
    println(person.fullName)
}