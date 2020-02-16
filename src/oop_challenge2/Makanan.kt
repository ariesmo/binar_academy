package oop_challenge2

class Makanan(nama: String?, var netto: Int):Produk(nama) {
    override fun cetakProduk() {
        println("Nama : $nama, Jenis: Makanan, Netto $netto gramm")
    }
}