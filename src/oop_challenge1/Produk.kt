package oop_challenge1

open class Produk(protected var nama: String?, var jenis: String?, protected var netto: String?) {
//    constructor(nama:String, jenis: String, netto: String) : this(){
//        this.nama = nama
//        this.jenis = jenis
//        this.netto = netto
//    }

    fun cetakProduk(){
        println("Nama : $nama, Jenis : $jenis, Netto : $netto")
    }
}