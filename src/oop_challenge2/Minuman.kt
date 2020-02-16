package oop_challenge2

class Minuman(nama: String?, var netto: Int):Produk(nama) {
   override fun cetakProduk(){
       println("Nama : $nama, Jenis : Minuman, Netto : $netto Liter")
   }
}