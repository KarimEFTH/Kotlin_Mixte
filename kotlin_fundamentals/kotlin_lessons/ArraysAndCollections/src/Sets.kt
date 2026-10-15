fun main() {

    // Read only set

    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    //println(readOnlyFruit)

    // Mutable set

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    //println(fruit)

    // HashSet

    var mySet = hashSetOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8)
    mySet.remove(54)
    mySet.add(100)

    // Boucler un set
    //for (element in mySet) {
    //    println(element)
    //}

    // Sets les méthodes

    // Création
    // setOf(): Crée un ensemble immuable
    val set = setOf(1, 2, 3)

    // mutableSetOf(): Crée un ensemble modifiable
    val mutableSet = mutableSetOf(1, 2, 3)

    // Ajout/Suppression (pour les MutableSet)
    // add(element): Ajoute un élément.
    mutableSet.add(4)

    // remove(element): Supprime un élément
    mutableSet.remove(2)

    //println(mutableSet)

    // Vérifications
    // contains(element): Vérifie si l'ensemble contient l'élément donné.
    val hasTwo = set.contains(2)
    //println(hasTwo)

    // isEmpty(): Vérifie si l'ensemble est vide.
    val isEmpty = set.isEmpty()
    //println(isEmpty)

    // Opérations sur les Sets
    // union(otherSet): Renvoie un nouvel ensemble qui contient tous les éléments uniques des deux ensembles.
    val otherSet = setOf(3, 4, 5)
    val unionSet = set.union(otherSet)
    //println(unionSet)

    // intersect(otherSet): Renvoie un nouvel ensemble avec les éléments communs aux deux ensembles.
    val intersection = set.intersect(otherSet)
    //println(intersection)

    // subtract(otherSet): Renvoie un nouvel ensemble avec les éléments du premier ensemble qui ne sont pas dans le second ensemble.
    val difference = set.subtract(otherSet)
    //println(difference)

    // Parcours un set
    //for (item in set) {
    //    println(item)
    //}

    // Transformation: map(transform): Transforme chaque élément et renvoie une liste.
    val mapped = set.map { it * 2 }
    //println(mapped)

    // Recherche: firstOrNull(predicate): Renvoie le premier élément correspondant au prédicat ou null.
    val firstEven = set.firstOrNull { it % 2 == 0 }
    //println(firstEven)

    // Taille
    val setSize = set.size
    //println(setSize)

    // Elément aléatoire
    val randomElement = set.random()
    //println(randomElement)

    // Tous les éléments correspondent
    val allEven = set.all { it % 2 == 0 }
    //println(allEven)

    // Au moins un élément correspond:
    val anyEven = set.any { it % 2 == 0 }
    //println(anyEven)

    // Aucun élément ne correspond:
    val noneEven = set.none { it % 2 == 0 }
    //println(noneEven)

    // Flatten (pour des ensembles de listes)
    val setOfLists = setOf(listOf(1, 2), listOf(3, 4))
    val flattenedSet = setOfLists.flatten()
    //println(setOfLists)
    //println(flattenedSet)

    // Réduction: reduce(operation): Accumule les valeurs en commençant par le premier élément
    // et applique l'opération du premier au dernier élément
    val setProduct = set.reduce { acc, i -> acc * i }
    //println(setProduct)

    // fold(initial, operation): Commence par une valeur initiale et accumule les valeurs en appliquant l'opération
    val setSumWithInitial = set.fold(10) {
            acc, i -> acc + i
    }
    //println(setSumWithInitial)

    // Partitionnement
    val (evens, odds) = set.partition { it % 2 == 0 }
    //println(evens)
    //println(odds)

    // Minima et maxima
    val minElement = set.minOrNull()
    val maxElementByLength = setOf("a", "abc", "ab").maxByOrNull { it.length }
    //println(minElement)
    //println(maxElementByLength)

    // Groupement
    val groupByLength = setOf("a", "abc", "ab").groupBy { it.length }
    //println(groupByLength)

    // Opérations de chaîne pour Set<String>
    val concatenated = setOf("a", "b", "c").joinToString(separator = "-")
    //println(concatenated)

    // Drop et Take
    val dropped = set.drop(1) // supprime le premier élément
    val taken = set.take(2) // prend les deux premiers éléments
    //println(dropped)
    //println(taken)

    // Conversion
    val toList = set.toList()
    val toMutableList = set.toMutableList()

}