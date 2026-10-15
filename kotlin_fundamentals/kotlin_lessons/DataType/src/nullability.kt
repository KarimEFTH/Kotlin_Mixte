fun main() {

//    fun somme(x: Int, y: Int) : Int = x + y
//    fun somme2(x: Int, y: Int) = x + y
//    fun start() = "OK"

//    infix fun Int.isMultipleOf(number: Int) = this % number == 0
//
//    max(2,4)
//
//    val triple = fun(x: Int) = x * 3
//
//    zeroOuUn(5)

    //for(i in 10 downTo 0 step 2) { println("i = $i") }

//    var i = 0
//    repeat(10) {
//        println(i)
//        i++
//    }

//    repeat(10) {
//        println(it)
//    }

//    repeat(10) { i ->
//        repeat(10) {j ->
//            println("($i, $j)")
//        }
//    }

//    var i = 0
//    while(i < 10) println(i++)

//    for(i in 1..5) {
//        for(j in 1..5) {
//            if(i>j) break
//            print("*") }
//        println()
//    }

//    val name: String? = null
//    val greeting = "Hello, ${name!!}!"
//    println(greeting)
//
//    var person3 = Person3("YT")
//}
//
//fun max(a: Int, b: Int): Int
//        = if (a > b) {
//    println("$a is greater")
//    a
//} else {
//    println("$b is greater")
//    b
//}
//
//fun zeroOuUn(x: Int) {
//    when(x) {
//        0,1 -> {
//            println("Gagné !")
//            println("Zéro ou Un")
//        }
//        else -> {
//            println("Perdu !")
//            println("Ni Zéro ni Un")
//        }
//    }
//
//    val chars = charArrayOf('a', 'b', 'c')

    var tab = CharArray(5)
    tab.forEach { println(it) }

}

open class Personne protected constructor (val nom: String, val prenom: String )
{
}

class Personne2 (var nom: String, var prenom: String ){
    val dateNaissance: Int
    val email: String
    init {
        nom = "Khalid"
        dateNaissance = 2019
        email="toto@gmail.com"
        println("La date de naissance est $dateNaissance")
        println("L'email est $email")
    }
}

class Person3(val name: String = "oi", var age: Int) {
    // Constructeur secondaire
    constructor(name: String) : this(name = "ER", 0) {
        println("Constructeur secondaire appelé") }
}
