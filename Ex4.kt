package TP3

open class Appareil(open val marque: String, var allume: Boolean = false) {
    init {
        println("Appareil cree : $marque")
    }

    fun allumer() {
        allume = true
        println("$marque est allume")
    }
}

class Telephone(override val marque: String, val numeroDeTelephone: String) : Appareil(marque) {
    init {
        println("Telephone cree avec le numero $numeroDeTelephone")
    }
}

class Ordinateur(override val marque: String, val systemeDExploitation: String) : Appareil(marque) {
    init {
        println("Ordinateur cree avec le systeme $systemeDExploitation")
    }
}