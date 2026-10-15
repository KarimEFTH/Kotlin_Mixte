fun main() {
    // val demo = Outer.Nested().foo() // == 2
}

open class Animal2 (val name: String) {
}
class Chien:Animal2{
    constructor(name: String):super(name){
    }
    constructor(name: String,race: String ):this(name){
    }
}
class Outer {
    private val bar: Int = 1
    inner class Nested {
        fun foo() = 2
    }
}