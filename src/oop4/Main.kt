package oop4

class Main {
    companion object: Hewan() {
        @JvmStatic
        fun main(args: Array<String>){
            cetakNamaHewan()
        }

        override fun ambilNama(): String {
            return "Anjing"
        }
    }
}