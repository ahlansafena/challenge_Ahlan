fun main(args: Array<String>) {

    println("==========================")
    println("Game Suit Terminal Version")
    println("==========================")

    var again = true
    while (again) {
        print("Masukan Pemain 1 : ")
        val data1 = readln()!!.trim().lowercase()
        print("Masukan Pemain 2 : ")
        val data2 = readln()!!.trim().lowercase()

        println("")
        println("Hasil")

        val controller = Controller(object : Callback {
            override fun tampilkanHasil(result: String) {
                println(result)
            }

        })
        controller.banding(data1, data2)
        print("Main lagi Y/T? ")
        val input = readln()!!.trim().lowercase()
        if (input == "t")
            again = false
    }
}