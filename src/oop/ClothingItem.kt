package oop

data class ClothingItem  constructor(
                        var type:String?,
                         val size:String,
                         private var _price:Double){
    init {
        type = type?.toUpperCase() ?: "XXL"
    }

    var price = _price
    set(value) {
        field = value * .9
    }

    constructor(size: String,price: Double) :this(null,size,price)
}

