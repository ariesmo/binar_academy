package oop_challenge4

class Determinan(private var callback: Callback): Rumus {
    var dataA = mutableListOf<Int>()


    override fun hitungDeterminanMinor() {
        var hasil = mutableListOf<Int>()
        for (currentIndex in 0..3){
            hasil.add(dataA[(dataA.size - 1)  - currentIndex])
        }
        callback.kembalikanNilai(hasil)
    }

}