fun main() {

    // Map

    // Création
    // mapOf(): Crée une carte immuable
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    //println(map)

    // mutableMapOf(): Crée une carte modifiable.
    val mutableMap = mutableMapOf("a" to 1, "b" to 2)
    //println(mutableMap)

    // Accès
    val valueA = map["a"] // renvoie 1
    //println(valueA)

    // Taille
    val mapSize = map.size
    //println(mapSize)

    // Ajout/Modification/Suppression (pour les MutableMap)
    mutableMap["d"] = 4 // Ajoute ou remplace une paire
    mutableMap.remove("a") // Supprime la paire avec la clé "a
    //println(mutableMap)

    // Opérations de clés et de valeurs:
    val keys = map.keys // renvoie un ensemble detoutes les clés
    //println(keys)

    val values = map.values // renvoie une collection de toutes les valeurs
    //println(values)

    // put(key, value)
    val mutableMap2 = mutableMapOf("a" to 1, "b" to 2)
    mutableMap2.put("c", 3) // Ajoute "c" -> 3
    mutableMap2.put("a", 4) // Met à jour "a" -> 4
    //println(mutableMap2)

    // count()
    val map2 = mapOf("a" to 1, "b" to 2, "c" to 3)
    val totalCount = map2.count() // Résultat : 3
    val countEvenValues = map2.count { it.value % 2 == 0 } // Résultat : 1
    //println(totalCount)
    //println(countEvenValues)

    // in :
    val map3 = mapOf("a" to 1, "b" to 2)
    val isAPresent = "a" in map3 // Résultat : true
    val isZPresent = "z" in map3 // Résultat : false
    //println(isAPresent)
    //println(isZPresent)

    //Recherche:
    val defaultValue = map.getOrElse("e") { 0 }
    //println(defaultValue)

    //Transformation
    val transformedMap = map.mapValues { entry -> entry.value * 2 }
    //println(transformedMap)

    // Filtrage
    val filteredMap = map.filterKeys { it == "a" || it == "b" }
    val filteredByValue = map.filterValues { it < 3 }
    //println(filteredMap)
    //println(filteredByValue)

    // Conversion
    val toList = map.toList()
    //val toMutableList = map.toMutableList() // Error
    //val toSet = map.toSet() // Error

    // Élément aléatoire
    //val randomEntry = map.random() // Error

    // Opérations sur les paires clé-valeur
    val entriesSet = map.entries
    //println(entriesSet)

    val valueB = map.getValue("b")
    //val valueM = map.getValue("m")
    //println(valueB)
    //println(valueM)

    // Recherche
    val foundEntry = map.entries.find { it.key.startsWith("a") }
    //println(foundEntry)

    // Partitionnement
    val (matched, rest) = map.entries.partition { it.value > 2 }
    //println(matched)
    //println(rest)

    // Groupement
    val groupedByValue = map.entries.groupBy { it.value }
    //println(groupedByValue)

    val groupedByKey = map.entries.groupBy { it.key }
    //println(groupedByKey)

    // Transformation





}