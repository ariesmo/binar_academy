package oop_challenge4

class Main {
    companion object:Callback {
        @JvmStatic
        fun main(args:Array<String>){

            var dataArrays = Determinan(this)
            var currentIndex = 0

            do {
                print("Masukkan data index  $currentIndex : ")
                var inputA = readLine()

                dataArrays.dataA.add(inputA!!.toInt())
                currentIndex++
            } while (currentIndex < 4)
            println(dataArrays.dataA)

            dataArrays.hitungDeterminanMinor()

        }

        override fun kembalikanNilai(nilai: MutableList<Int>) {
            print(nilai)
        }
    }
}