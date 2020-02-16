package oop3

class Segitiga(private var callback: Callback):Rumus {
    var alas = 0
    var tinggi = 0

    override fun hitungLuas() {
        var hasil = (alas * tinggi) / 2
        callback.kirimNilaiLuas(hasil)
    }

    override fun hitungKeliling() {
        var hasil = alas * 3
        callback.kirimNilaiKeliling(hasil)
    }

}


