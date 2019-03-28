package oop

data class ClothingItem  constructor(
                        var type:String?,
                         val size:String,
                         var price:Double){
    init {
        type = type?.toUpperCase() ?: "XXL"
    }

    constructor(size: String,price: Double) :this(null,size,price)
}

