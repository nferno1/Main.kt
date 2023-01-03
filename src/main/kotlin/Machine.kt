class Machine(var drive: Boolean)

fun Machine.engineOff() {
    this.drive = false
}

fun Machine.engineOn() {
    this.drive = true
}

fun main() {
    val car = Machine(false)
    car.engineOff()
    println(car.drive)
}