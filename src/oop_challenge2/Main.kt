package oop_challenge2

class Main{
    companion object {
        @JvmStatic
        fun main(args:Array<String>){
            println("Masukkan Jenis :")
            var input = readLine()

            if(input == "Makanan"){
                println("Masukkan Nama Makanan : ")
                var namaMakanan = readLine()
                println("Masukkan Berat Makanan : ")
                var beratMakanan = readLine()!!.toInt()

                var makanan = Makanan(namaMakanan, beratMakanan)
                makanan.cetakProduk()
            } else {
                println("Masukkan Nama Minuman : ")
                var namaMinuman = readLine()
                println("Masukkan Volume Minuman : ")
                var volumeMinuman = readLine()!!.toInt()

                var minuman = Minuman(namaMinuman, volumeMinuman)
                minuman.cetakProduk()
            }
        }
    }
}