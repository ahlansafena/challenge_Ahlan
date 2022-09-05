class Controller(private val callback: Callback) {
    fun banding(data1: String, data2: String) {
        when (data1 + data2) {
            "gunting" + "kertas", "kertas" + "batu", "batu" + "gunting" -> {
                callback.tampilkanHasil("Pemain 1 Menang")

            }
            "kertas" + "gunting", "batu" + "kertas", "gunting" + "batu" -> {
                callback.tampilkanHasil("Pemain 2 Menang")

            }

            "gunting" + "gunting", "batu" + "batu", "kertas" + "kertas" -> {
                callback.tampilkanHasil("Draw")

            }
            else -> {
                callback.tampilkanHasil("Kamu Hanya boleh memilih = Gunting, Batu, Kertas")

            }
        }
    }
}