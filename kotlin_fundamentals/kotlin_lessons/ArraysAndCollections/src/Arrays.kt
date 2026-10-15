fun main() {

    // -> Déclaration de type implicite

    val numbers = arrayOf(1, 9, 8, 3)
    numbers[0]=2

    //println("Numbers[0] = ${numbers[0]}") //2

    // -> Déclaration de type explicite

    val nombres = arrayOf<Int>(1,9,8,3)
    nombres[0]=4

    //println("nombres[0] = ${nombres[0]}") //4

    // Mutable (taille fixe)

    var myArray = Array<Int>(5) { 0 }
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 11

    //for (element in myArray) {
    //    println(element)
    //}

    //for (index in 0..myArray.size - 1) {
    //    println(myArray[index])
    //}

    // charArray

    val chars = charArrayOf('a', 'b', 'c')

    // En utilisant la boucle pour afficher des valeurs à l'écran
    //for (i in chars.indices) {
    //    println(chars[i])
    //}

    //println(chars)

    // Arrays :pairs

    val scores = arrayOf(3 to 2, 1 to 1, 0 to 0)

    //for (score in scores) {
    //    println("Team 1: ${score.first}, Team 2: ${score.second}")
    //}

    // Parcourir les elements
    //scores.forEach { score -> println("Team 1: ${score.first}, Team 2: ${score.second}") }

    val totalScores = scores.map { it.first + it.second }
    //println(totalScores)

    // Retourner des résultats avec condition
    val draws = scores.filter { it.first == it.second }
    //println(draws)

    // Si vous n'êtes pas sûr de la présence d'un élément à un certain indice, vous pouvez utiliser la méthode getOrNull.
    val score = scores.getOrNull(2)
    //println(score)

    val arrayWithPairs = arrayOf(Pair("a", 1), Pair("b", 2), Pair("c", 3))
    val arrayWithPairs2 = arrayOf("a" to listOf(1, 2), "b" to listOf(2, 3), "c" to listOf(3, 3))

    // Afficher les elements
    //for (pair in arrayWithPairs2) {
    //    val key = pair.first
    //    val values = pair.second.joinToString(", ")
    //    println("$key -> [$values]")
    //}

    //arrayWithPairs2.forEach { (key, values) ->
    //    println("$key -> ${values.joinToString(", ")}")
    //}

    // Accéder à des valeurs
    val valeur0=arrayWithPairs[0]
    val valeur0Premiere=arrayWithPairs[0].first
    //println(valeur0)
    //println(valeur0Premiere)

}