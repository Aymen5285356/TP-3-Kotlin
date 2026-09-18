package TP3

open class Forme(val couleur: String) {
    open fun afficherInfo() {
        println("Couleur : $couleur")
    }
}

class Cercle(couleur: String, val rayon: Double) : Forme(couleur) {
    override fun afficherInfo() {
        println("Cercle de couleur $couleur et de rayon $rayon")
    }
}

class Rectangle(couleur: String, val largeur: Double, val hauteur: Double) : Forme(couleur) {
    override fun afficherInfo() {
        println("Rectangle de couleur $couleur, largeur $largeur, hauteur $hauteur")
    }
}

fun main() {
    Cercle("Rouge", 5.0).afficherInfo()
    Rectangle("Bleu", 4.0, 6.0).afficherInfo()
}