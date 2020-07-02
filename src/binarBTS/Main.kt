package binarBTS

import java.util.*

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val input = Scanner(System.`in`)
            print("Masukkan nama : ")
            val pemain = input.next()
            print("Mau main berapa kali : ")
            val ronde = input.nextInt()

            val number = arrayOf(1, 2, 3, 4, 5, 6)
            var score = 0


            for (i in 1..ronde){
                val random = number.random()
                if ((random % 2) != 0){
                    score += 5
                    println("Angka yang muncul adalah : $random")
                } else if ((random % 2) == 0){
                    score -= 3
                    println("Angka yang muncul adalah : $random")
                }
                score++
            }

            println("Score $pemain adalah = $score")
        }
    }

}