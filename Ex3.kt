package TP3

open class Vehicule(val marque: String) {
    init {
        println("Vehicule cree : $marque")
    }
}

class Voiture(marque: String, val nombrePortes: Int) : Vehicule(marque) {
    init {
        println("Voiture creee avec $nombrePortes portes")
    }
}

class Camion(marque: String, val capaciteCharge: Double) : Vehicule(marque) {
    init {
        println("Camion cree avec une capacite de $capaciteCharge tonnes")
    }
}

fun main() {
    Voiture("Toyota", 4)
    Camion("Volvo", 12.5)
}
