fun main() {

    // Pair (x, y)

    val coordinates: Pair<Int, Int> = Pair(2, 3)
    val coordinates2 = Pair(2, 3) // Type interface
    val coordinates3 = 2 to 3 // Using "to" operator
    val coordinates4 = Pair(4.1, 2)

    println("The Coordinates: $coordinates")
    println("The x coordinate: ${coordinates.first}")
    println("The y coordinate: ${coordinates.second}")

    // Triples (x, y, z)

    val coordinates3D: Triple<Int, Int, Int> = Triple(1, 2, 3)
    val coordinates3D_2 = Triple(4, 5, 6) // Using type interface

    val x = coordinates3D.first
    val y = coordinates3D.second
    val z = coordinates3D.third

    println("The 3D Coordinates: $coordinates3D")
    println("z of coordinate: $z")

}