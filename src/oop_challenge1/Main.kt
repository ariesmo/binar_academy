package oop_challenge1

class Main:Produk(nama = "", jenis = "", netto = "") {
    companion object {
        @JvmStatic
        fun main(args:Array<String>){
            var produk1 = Makanan()
            var produk2 = Minuman()

//            produk1.makan()
//            produk2.minum()

            if(produk1.jenis == "Makanan"){
                produk1.makan()
            } else {
                produk2.minum()
            }
        }
    }
}