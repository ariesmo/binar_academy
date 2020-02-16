package oop_constructor

class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            var produk1 = Produk("Bearbrand", "Minuman")
            produk1.cetakProduk()

            var produk2 = Produk()
            produk2.cetakProduk()
        }
    }
}