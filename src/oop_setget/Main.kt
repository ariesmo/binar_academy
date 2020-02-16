package oop_setget

class Main() {
    companion object {
        @JvmStatic
        fun main(args:Array<String>){
            var mahasiswa = Mahasiswa(nomoInduk = "2019MI0006", nama = "Aris Mulyadi", umur = 32, jurusan = "Manajemen Informatika")
            mahasiswa.nama = "Testing"
            mahasiswa.umur = 20
            mahasiswa.jurusan = "Tehnik Informatika"
            mahasiswa.cetakMahasiswa()
        }
    }
}