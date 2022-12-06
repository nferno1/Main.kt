import java.util.Scanner

fun main(args: Array<String>) {

    val age = 19
    when (age){
        in 7..18 -> println("школьник")
        in 18..22 -> println("Бакалавр")
        in 22..24 -> println("Магистр")
        in 24..28 -> println("Аспирант")
        in 18..22 -> println("Бакалавр")
        in 18..22 -> println("Бакалавр")
        !in 7..28 -> println("age вне диапозона от 7 до 28")
        else -> println("неопределенное значение")
    }

}

//    val a = 18
//    when {
//        a < 18 -> println("18")
//
//
//        a < 55 -> println("a < 55")
//
//        else -> println("a =< 55")
//        }




//    if (a !=b && a > b) { }
//    if (a < b || a == b) { }

//   print("Введите возраст: ")
//
//    val reader = Scanner(System.`in`)
//    val age = reader.nextInt()
//
//    if (age > 18)
//        print("вам можно пройти в клуб")
//    if (age == 18)
//        print("Вам 18 лет")
//    else
//        print("вам нельзя пройти в клуб")


//    val longNumber1: Long = 999999999L
//    val floatNumber2: Float = 68.88f
//
//    val a: Boolean = true
//    val b: Boolean = false
//    val charSymbol1: Char = 'y'
//    val textString: String = "Kotlin - статически типизированный язык программирования, \n разбабатываемый компанией JetBrains"
//    println(textString)
//    val name = "Kotlin"
//    val age = 10
//    val description = "Laguage $name, age: $age"
//    println(description)
//
//    var  typeAny: Any = "Any type" // супертип всех типов
//    typeAny = 4858
//    println(typeAny)
//
////var variable // изменяемые переменные
////val value // неизменяемые переменные final






/*
Byte: -128... 127 // 1 - байт
Short: -32768.... 32767 // 2
Int: -2.147.483.648.... 2.147.483.647 // 4
Long: -9 223 372 036 854 775 808... 9 223 372 036 854 775 807 // 8
Float: -3.4*1038... 3.4*1038 // 4
Double: +-5.0*10-324... +-1.7*10308 // 8
*/



