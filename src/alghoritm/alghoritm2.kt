package alghoritm

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */


fun main(){
    for (i in 0..5){   /* 0i eksekusi 6j(0..5), 1i eksekusi 6j(0..5), dst sampai 5i eksekusi 6j(0..5)*/
        for (j in 0..5){
            if(i == 0 || i == 5){
                print("* ")
            }else if(j == 0 || j == 5){
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }

    for(i in 0..5){
        for(j in 0..i){
            print("* ")
        }
        println()
    }

    println()

    for(i in 5 downTo 0){
        for(j in i downTo 0){
            print("*")
        }
        println()

    }

    println()

    var baris = 1
    for(i in 5 downTo 0){
        for(j in i-1 downTo 0){
            print("  ")
        }
        for(k in 0 until baris){
            print(" *")
        }
        baris++
        println()
    }

    println()

    var baris1 = 1
    for(i in 5 downTo 1){
        for(j in i - 1 downTo 0){
            print("  ")
        }
        for(k in 0 until (baris1 * 2 - 1)){
            print("* ")
        }
        for(j in i - 1 downTo 0){
            print(" ")
        }
        baris1++
        println()
    }

    println()

    for(i in 0..5){
        for(j in 0..i){
            if(j == 0) {
                print("* ")
            } else if(i == j){
                print("* ")
            } else if(i == 5){
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }

}

