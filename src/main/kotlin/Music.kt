class Music {

    private var countBand = 495

    fun printBand () {
        println("$countBand")
    }
      inner class Band { // ��������� �����/   Inner - ��� ������� � private

        fun classicMusic(count: Int) {
            countBand -= count
            printBand()
        }
    }
}