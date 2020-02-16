package oop_challenge3

class Determinan(private var callback: Callback):Rumus {
    var dataA = mutableListOf<Int>()
    var dataB = mutableListOf<Int>()

    override fun hitungDeterminan() {
        var hasil = mutableListOf<Int>()
        hasil.add(dataA[0] + dataB[0])
        hasil.add(dataA[1] + dataB[1])
        hasil.add(dataA[2] + dataB[2])
        hasil.add(dataA[3] + dataB[3])
        callback.kirimNilaiDeterminan(hasil)
    }

}