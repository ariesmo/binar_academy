package oop

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            var produk1 = Produk()
            produk1.nama = "Bearbrand"
            produk1.jenis = "Minuman"
            produk1.cetakProduk()

            var produk2 = Produk()
            produk2.nama = "Bangbang"
            produk2.jenis = "Makanan"
            produk2.cetakProduk()
        }
    }
}