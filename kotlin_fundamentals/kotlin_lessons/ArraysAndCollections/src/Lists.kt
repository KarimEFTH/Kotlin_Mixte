fun main() {

    // Read only list

    val readOnlyShapes = listOf("triangle", "square", "circle")
    //println(readOnlyShapes)

    // Mutable list

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    //println(shapes) //[triangle, square, circle]

    // Le casting

    val shapesLocked: List<String> = shapes

    // Autoriser la liste à être nulle

    var names: List<String>? = null
    //println(names)

    // Autoriser les éléments de la liste à être nuls Mais la liste ne peut pas être nulle

    var names2: List<String?> = listOf()
    //println(names2)

    //var names3: List<String?> = null // ERROR, List cannot be null

    // Autoriser les éléments de la liste et la liste elle-même à être nuls Mais la liste ne peut pas être nulle

    var names4: List<String?>? = null
    //println(names4)

    // Liste avec quelques éléments nuls

    var listWithNulls: List<String?> = listOf("Kot", null, "melo", null)
    //println(listWithNulls)

    var nullableLi: List<Int?> = listOf(1, null, 2, null, null, 5)
    //println(nullableLi)

    var nonNullLi = nullableLi.filterNotNull()
    //print(nonNullLi) //[1, 2, 5]

    val listWithNulls2: List<String?> = listOf("Kotlin", null)
    //for (item in listWithNulls2) {
    //    item?.let {
    //        println(it) // prints Kotlin ignore null
    //    }
    //}

    // Méthodes sur les listes (Mutable List)

    var list = mutableListOf<String>()
    //println(list)

    var list2 = arrayListOf<String>()
    //println(list2)

    var list3 = ArrayList<String>()
    list3.add("Yogi") //0
    list3.add("Manmohan") //1
    list3.add("Vajpayee") //2
    list3.remove("Manmohan")
    list3.add("Vajpayee")
    list3[1] = "Modi"

    //for (element in list3) { // boucler une liste
    //    println(element)
    //}

    //for (index in 0 until list3.size) {
    //    println(list3[index])
    //}

    //println(list3)

    //println(list3.size)

    // Les prédicats sur les listes

    // Liste de tests

    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    // Définir le prédicat
    val myPredicate = { num: Int -> num > 10 }

    // Tous les éléments sont-ils supérieurs à 10?
    val check1 = myNumbers.all( myPredicate )
    //println(check1)

    // L'un de ces éléments satisfait-il le prédicat?
    val check2 = myNumbers.any(myPredicate)
    //println(check2)

    // Nombre d'éléments qui satisfont le prédicat.
    val totalCount: Int = myNumbers.count(myPredicate)
    //println(totalCount)

    // Renvoie le premier numéro qui correspond au prédicat
    val num = myNumbers.find(myPredicate)
    //println(num)

}