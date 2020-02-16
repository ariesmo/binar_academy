package alghoritm

fun main(){
    var n = 9
    for (i in 0..8){
        for (j in 0..8){
            if(i == 4 && j == 1){
                print("* ")
            } else {
                print("-")
            }
        }
        println()
    }

    println()
    println("soal 1")

//    (n-i-1)*2

    for(i in 0..8){
        for(j in 0..i){
            if(i == j){
                print(i+j+1)

            } else{
                print(" ")
            }
        }
        println()
    }
    println()
    println("soal 2")

    for(i in 8 downTo 0){
        for (j in 0..i){
            if (i == j ){
                print(i+j)
            } else {
                print(" ")
            }
        }
        println()
    }
    println()
    println("soal 3")

    for(i in 0..8){
        for(j in 0..8){
            if(i == j ){
                print(i+j+1)
            } else if (j == (n-i-1)){
                print("${(n-i-1)*2}")
            } else {
                print(" ")
            }
        }
        println()
    }
    println()
    println("soal 4")

    for(i in 0..8){
        for(j in 0..8){
            if(i == j ){
                print(i+j+1)
            } else if(j == (n-i-1)){
                print("${(n-i-1)*2}")
            } else if(j == 4){
                print("${i*2+1}")
            } else if(i == 4){
                print(2*j)
            } else {
                print(" ")
            }
        }
        println()
    }
    println()
    println("soal 5")

    for(i in 0..8){
        for(j in 0..i){
            print(j*2+1)
        }
        println()
    }
    println()
    println("soal 6")

    for (i in 8 downTo 0){
        for (j in 0..i){
            print(" ")
        }
        for (k in 8 downTo i){
            print("${(i*2)}")
        }
        println()
    }
    println()
    println("soal 7")
    for(i in 0..8){
        for (j in 0..8){
            if(i == j){
                print(i+j+1)
            } else if(j == n-i-1){
                print("${(n-i-1)*2}")
            } else if(j > i && j < n-i-1){
                print("A")
            } else if(j < i && j >= n-i-1){
                print("B")
            } else {
                print(" ")
            }
        }
        println()
    }
    println()
    println("soal8")

    for (i in 0..8){
        for (j in 0..8){
            if (i == j){
                print(i+j+1)
            } else if(j == n-i-1){
                print("${(n-i-1)*2}")
            } else if((j >= i || j <= n-i-1)){
//                print(if(j < (n/2))"A" else "B")
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }

//    for(i in 0..8){
//        for(j in 0..i){
//            if(i == j){
//                print("* ")
//            } else{
//                print(" ")
//            }
//        }
//        for (k in 8 downTo i){
//            if(k == i){
//                print(" ")
//            } else {
//                print("* ")
//            }
//        }
//        println()
//    }
}