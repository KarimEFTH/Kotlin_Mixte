fun main() {

    // Classes

    //var student = Student("Steve", 10)
    //println(student.id)

    // Héritage

    //var dog = TheDog("Black", "Pug")

    // Surcharger une méthode

    //val dog2 = Dog()
    //dog2.sound() // Affiche: Le chien aboie

    //val cat = Cat()
    //cat.sound() // Affiche: Le chat miaule

    // Classe Abstraite

    //var person = Trainer()

    //println(person.name)
    //person.name = "Steve"
    //println(person.name)
    //person.eat()
    //person.goToSchool()

    // Interface

    //var myButton = MyButton()
    //myButton.onTouch()
    //myButton.onClick()

    // Classe interne

    //val outer = OuterClass("Hello from outer class")
    //val inner = outer.InnerClass("Hello from inner class")
    //inner.displayValues()

    // Classe de donnée :data class

    var user1 = User("Sam", 10)
    var user2 = User("Sam", 10)

    // Méthode toString
    println(user1.toString())

    // Equals
    if (user1 == user2)
        println("Equal")
    else
        println("Not equal")

    // Cloner un objet
    var newUser = user1.copy(id = 25)
    println(newUser)

}

// Classes

class Student(var name: String) {
    var id: Int = -1
    init {
        println("Student name is $name and id is $id")
    }
    constructor(n: String, id: Int): this(n)
    {
        this.id = id
    }
}

// Héritage

open class TheAnimal { // Super class / Parent class / Base class
    var color: String = ""
    constructor(color: String) {
        this.color = color
        println("From Animal: $color")
    }
}
class TheDog : TheAnimal { // Sub class / enfant class / classe héritée
    var bread: String = ""
    constructor(color: String, breed: String): super(color) {
        this.bread = breed
        println("From Dog: $color and $breed")
    }
}

// Surcharger une méthode

open class Animal {
    open fun sound() {
        println("L'animal fait un bruit")
    }
}

// Une sous-classe de Animal qui écrase la méthode sound
class Dog : Animal() {
    override fun sound() {
        println("Le chien aboie")
    }
}

// Une autre sous-classe de Animal qui écrase également la méthode sound
class Cat : Animal() {
    override fun sound() {
        println("Le chat miaule")
    }
}

// Classe Abstraite

abstract class MyPerson {
    abstract val name: String //méthode abstraite
    abstract fun eat() // Les propriétés abstraites sont «open» par défaut
    open fun getHeight() {} // 'open' function Prête à être override
    fun goToSchool() {} // normal function
}

class Trainer: MyPerson() {
    override val name: String = "stagiaire dev"
    override fun eat() {
        println("manger le petit-dejeuner")
    }
}

// Interface

interface MyInterfaceListener { // Vous ne pouvez pas créer l'instance d'interface
    fun onTouch() // Les méthodes d'interface sont abstraites par défaut
    fun onClick() { // Les méthodes normales sont publiques et ouvertes par défaut
        println("MyInterfaceListener: onClick")
    }
}
interface MySecondInterface {
    fun onTouch() { // Normal Method
        println("MySecondInterface: onTouch")
    }
    fun onClick() {
        println("MySecondInterface: onClick")
    }
}

class MyButton: MyInterfaceListener,
    MySecondInterface {
    override fun onTouch() {
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()
    }
    override fun onClick() {
        super.onTouch()
    }
}

// Classe interne

class OuterClass(val outerValue: String) {
    inner class InnerClass(val innerValue: String) {
        fun displayValues() {
            println("Outer value: $outerValue")
            println("Inner value: $innerValue")
        }
    }
}

// Classe de donnée :data class

data class User(var name: String, var id: Int)