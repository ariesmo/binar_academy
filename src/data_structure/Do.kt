package data_structure

object Do {
    @JvmStatic
    fun main(args: Array<String>){
        val name = mutableListOf("nama", 10, false)

        var currentIndex = 2
        while (currentIndex > -1 ){
            println(name[currentIndex])
            currentIndex--
            println("dari while")
        }

        do {
            currentIndex++
            println(name[currentIndex])
            println("dari do")
        } while (currentIndex < 2)
    }
}