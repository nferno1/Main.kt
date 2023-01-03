class Music {

    private var countBand = 495

    fun printBand () {
        println("$countBand")
    }
      inner class Band { // вложенный класс/   Inner - для доступа к private

        fun classicMusic(count: Int) {
            countBand -= count
            printBand()
        }
    }
}