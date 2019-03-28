package oop

class MathLib {
    //companion object
    companion object {
        fun addValues(a:Double,b:Double ):Double {return a.plus(b)}
        fun subtractValues(a:Double,b:Double ):Double {return a.minus(b)}
        fun divideValues(a:Double,b:Double ):Double {return a.div(b)}
        fun multiplyValues(a:Double,b:Double ):Double {return a.times(b)}
        fun getInput(prompt: String): Double {
            println(prompt)
            val number: Double = readLine()!!.toDouble()
            return number
        }
    }
}