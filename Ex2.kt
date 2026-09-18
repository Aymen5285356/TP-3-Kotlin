package TP3

open class Personne(val nom: String, val age: Int = 24) {
    open fun afficherDetails() {
        println("Nom : $nom, Age : $age")
    }
}

class Eleve(nom: String, age: Int = 24, val niveau: String) : Personne(nom, age) {
    override fun afficherDetails() {
        println("Nom : $nom, Age : $age, Niveau : $niveau")
    }
}

class Employe(nom: String, age: Int = 24, val poste: String) : Personne(nom, age) {
    override fun afficherDetails() {
        println("Nom : $nom, Age : $age, Poste : $poste")
    }
}

fun main() {
    Personne("Ahmed").afficherDetails()
    Eleve("Sara", 21, "Licence").afficherDetails()
    Employe("Youssef", 30, "Ingenieur").afficherDetails()
}