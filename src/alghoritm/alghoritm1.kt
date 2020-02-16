package alghoritm

fun main() {
    val a = 10
    val b = 15
    val j = 2
    val detikAll = 69012

    var jam = 69012 / 3600
    var sisa1 = 69012 % 3600

    var menit = sisa1 / 60
    var sisa2 = menit % 60

    val max = if (a > b) {
        println("a greater than b")
        a
    } else {
        println("b greater then a")
        b
    }
    coba(max)
    println(max)

    when {
        (j % 2 == 0) -> println("Genap")
        else -> println("Ganjil")
    }

    println("Pemecahan $detikAll adalah $jam jam, $menit menit, $sisa2 detik")
}

fun coba(a: Int) {
    println(a)
}