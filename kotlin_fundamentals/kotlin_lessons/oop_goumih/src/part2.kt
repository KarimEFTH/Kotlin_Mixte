fun main() {

    // Enumération

    //println(Color.BLUE)
    //val earthGravity = Planet.EARTH.surfaceGravity()
    //println("La gravité de surface de la Terre est: $earthGravity")
    //for (color in Color.values()) {
    //    println(color.name)
    //}
    //val color: Color = Color.valueOf("RED")
    //println(color)

    // Classe scellée

    //val const = Expr.Const(5.7)
    //println(eval(const))

    //val nab = Expr.NotANumber
    //println(eval(nab))

    //val sum = Expr.Sum(Expr.Const(3.8), Expr.Const(2.8))
    //println(eval(sum))

    //val sum2 = sum.e1 // Instantiation de la claas Const
    //println(sum2)

    // Companion object

    //val instance = MyClass.create()
    //println(MyClass.CONSTANT)

    // Déclaration Objet

    //DataManager.saveData("Hello, Kotlin!")
    //println(DataManager.data)

    // Modificateur :lateint

    //val person = Person()
    //person.printName() // Affiche "Name is not initialized yet!"
    //person.initName("Alice")
    //person.printName() // Affiche "Alice"x

    // Lazy

    val myObject = MyClass2()
    println("Object created!")
    myObject.resource.doSomething()
    // C'est ici que la resource sera réellement créée

}

// Enumération

//Déclaration enum
enum class Color {
    RED, GREEN, BLUE
}

//Vous pouvez également ajouter des propriétés et des méthodes à chaque élément d'énumération.
enum class Planet(val mass: Double, val radius: Double) {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.3781e6); // Notez le point-virgule si vous ajoutez des méthodes
    fun surfaceGravity(): Double = 6.67300E-11 * mass / (radius * radius)
}

// Classe scellée

sealed class Expr {
    data class Const(val number: Double) : Expr()
    data class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()
}

fun eval(expr: Expr): Double = when(expr) {
    is Expr.Const -> expr.number
    is Expr.Sum -> eval(expr.e1) + eval(expr.e2)
    Expr.NotANumber -> Double.NaN
}

// Companion object

class MyClass {
    companion object {
        const val CONSTANT = "SomeValue"
        fun create(): MyClass = MyClass()
    }
}

// Déclaration Objet

object DataManager {
    var data: String? = null //Se comporte comme une variable statique
    fun saveData(content: String) {//Se comporte comme une méthode statique
        data = content
        println("Données sauvegardées : $content")
    }
}

// Modificateur :lateint

class Person {
    lateinit var name: String
    fun initName(n: String) {
        name = n
    }
    fun printName() {
        if (::name.isInitialized) {
            println(name)
        } else {
            println("Name is not initialized yet!")
        }
    }
}

// Lazy

class ExpensiveResource {
    init {println("Resource created!")}
    fun doSomething()
    {println("Resource is working!")}
}

class MyClass2 {
    val resource: ExpensiveResource by lazy {
        ExpensiveResource()
    }
}


