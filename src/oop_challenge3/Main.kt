package oop_challenge3

class Main {
    companion object : Callback {
        @JvmStatic
        fun main(args:Array<String>){

            var curIndexA = 0
            var curIndexB = 0

            var dataArrays = Determinan(this)
            do {
                print("Masukkan data index $curIndexA : ")
                var inputA = readLine()
                curIndexA++
                dataArrays.dataA.add(inputA!!.toInt())
            } while (curIndexA < 4)
            println(dataArrays.dataA)

            do {
                print("Masukkan data index $curIndexB : ")
                var inputB = readLine()
                curIndexB++
                dataArrays.dataB.add(inputB!!.toInt())
            } while (curIndexB < 4)
            println(dataArrays.dataB)

            dataArrays.hitungDeterminan()
        }

        override fun kirimNilaiDeterminan(nilai: MutableList<Int>) {
            print("Nilai : $nilai")
        }
    }
}