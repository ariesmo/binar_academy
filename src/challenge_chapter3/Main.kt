package challenge_chapter3

class Main {
    companion object : Callback {
        @JvmStatic
        fun main(args:Array<String>){
            var suit = Suit(this)

            print("Masukkan Gunting / Kertas / Batu : ")
            suit.pemainPertama = readLine()
            print("Masukkan Gunting / Kertas / Batu : ")
            suit.pemainKedua = readLine()

            suit.hitungSuit()
        }

        override fun tampilkanPemenang(hasil: String) {
            print(hasil)
        }
    }
}