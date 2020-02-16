package oop4

abstract class Hewan {
    fun cetakNamaHewan(){
        println(ambilNama())
    }

    abstract fun ambilNama(): String
}