package challenge_chapter2

import java.util.*

object IfElseStatement3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        print("pemain pertama pilih: batu, gunting, kertas?")
        val pemainPertama = input.next()
        print("pemain kedua pilih : batu, gunting, kertas?")
        val pemainKedua = input.next()
        if (pemainPertama.equals("batu", ignoreCase = true) && pemainKedua.equals("gunting", ignoreCase = true)
                || pemainPertama.equals("gunting", ignoreCase = true) && pemainKedua.equals("kertas", ignoreCase = true)
                || pemainPertama.equals("kertas", ignoreCase = true) && pemainKedua.equals("batu", ignoreCase = true)) {
            println("pemain pertama menang")
        } else {
            println("pemain kedua menang")
        }
    }
}