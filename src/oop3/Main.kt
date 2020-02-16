package oop3

class Main() {
    companion object:Callback {
        @JvmStatic
        fun main(args:Array<String>){
            var segitiga = Segitiga(this)
            segitiga.tinggi = 2
            segitiga.alas = 6
            segitiga.hitungLuas()
            segitiga.hitungKeliling()

            var jajarGenjang = JajarGenjang(object : Callback{
                override fun kirimNilaiLuas(nilai: Int) {
                    println("Nilai : $nilai")
                }

                override fun kirimNilaiKeliling(nilai: Int) {
                    println("Nilai : $nilai")
                }
            })
            jajarGenjang.alas = 55
            jajarGenjang.tinggi = 674
            jajarGenjang.hitungLuas()
            jajarGenjang.hitungKeliling()
        }

        override fun kirimNilaiLuas(nilai: Int) {
            println("Nilai : $nilai")
        }

        override fun kirimNilaiKeliling(nilai: Int) {
            println("Nilai : $nilai")
        }
    }
}