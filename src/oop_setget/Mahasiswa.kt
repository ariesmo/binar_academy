package oop_setget

class Mahasiswa(nomoInduk: String, var nama: String? = null, var umur: Int? = null, var jurusan: String? = null) {
    private var nim: String? = nomoInduk
    get() {
        return field
    }
    set(value) {
        field = value
    }

    fun cetakMahasiswa(){
        println("NIM : $nim, Nama : $nama, Umur : $umur, Jurusan: $jurusan")
    }
}