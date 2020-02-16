package data_structure

object When {
    @JvmStatic
    fun main(args: Array<String>){
        val nama = ""

        when(nama){
            "nug"   -> println("true")
            "aris"  -> println("aris")
            "wita"  -> println("wita")
            "kevin" -> println("kevin")
            else    -> println("default")
        }
    }
}