package challenge_chapter3

class Suit(private var callback: Callback):Logika {
    var pemainPertama: String? = null
    var pemainKedua: String? = null

    override fun hitungSuit() {
        var hasil = if (
                (pemainPertama.equals("batu", ignoreCase = true)) && (pemainKedua.equals("gunting", ignoreCase = true)) ||
                (pemainPertama.equals("gunting", ignoreCase = true)) && (pemainKedua.equals("kertas", ignoreCase = true)) ||
                (pemainPertama.equals("kertas", ignoreCase = true)) && (pemainKedua.equals("batu", ignoreCase = true))
        ){
            "Pemain Pertama MENANG !!"
        } else if (
                (pemainPertama.equals("batu", ignoreCase = true)) && (pemainKedua.equals("batu", ignoreCase = true)) ||
                (pemainPertama.equals("gunting", ignoreCase = true)) && (pemainKedua.equals("gunting", ignoreCase = true)) ||
                (pemainPertama.equals("kertas", ignoreCase = true)) && (pemainKedua.equals("kertas", ignoreCase = true))
        ){
            "Permainan DRAW"
        } else {
            "Pemain Kedua MENANG !!"
        }
        callback.tampilkanPemenang(hasil)
    }
}