package oop_poly

class Main {

    companion object {

        var hewan:Hewan? = null

        fun main(args: Array<String>){

            hewan = Kuda()
            (hewan as Kuda).berjalan()
            (hewan as Kuda).berlari()
            (hewan as Kuda).makan()
            (hewan as Kuda).minum()

        }
    }
}