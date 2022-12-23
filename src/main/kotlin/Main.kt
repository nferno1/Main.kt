fun main(args: Array<String>) {

    



}


    /*val scanner = Scanner(System.`in`)
    println( "How much money do you have? ")
    var money = scanner.nextInt()
    if (money in 500..1500)
        println(true)
    else if (money>1500) {
        println(true)
        println("You can buy something else")
    }
    else
        println(false)*/


//    outFunction("outer function")
//}
//
//fun outFunction (outFun: String){
//    val outInt = 15
//
//    fun inFunction (inFun: String){
//        println(inFun)
//        println(outFun)
//        println(outInt)
//    }
//
//    inFunction("inner function")
//}

//  fun mult (x: Int, y: Int, z: Int) = x + y + z// задача 4
//
//    val scanner = Scanner(System.`in`)
//    val x = scanner.nextInt()
//    val y = scanner.nextInt()
//    val z = scanner.nextInt()
//    println(mult(x, y, z))


//    fun sum (x: Int, y: Int, z: Int) = x + y == z // задача 3
//
//
//        val scanner = Scanner(System.`in`)
//        val x = scanner.nextInt()
//        val y = scanner.nextInt()
//        val z = scanner.nextInt()
//        println(sum(x, y, z))








//    val random = 3
//    print("Enter a number: ") // задача 2
//    val reader = Scanner(System.`in`)
//    val number = reader.nextInt()
//    if (number == random) {
//        print("Yes!")
//    }
//    if (number != random) {
//
//        print("Ooops! Try again:  ")
//
//
//    }








//    print("Введите сумму имеющуюся для покупки торта: ") // практическая задание 1
//
//    val scanner = Scanner(System.`in`)
//    var cash = scanner.nextInt()
//    if (cash < 500)
//        print("false")
//    if (cash in 500..1500){
//        print("true")
//
//    }
//    if (cash > 1500)
//        print("Вы можете купить что то ещё ")



//    try { // исключения
//
//    }
//    catch (e: SomeException){
//
//    }
//    finally {
//
//    }
//}





//  var number = 12
//    if (number !in 0..10) {
//        throw IllegalArgumentException ( // исключение
//            "Value must be between 0 and 10"
//        )
//    }
//    print(number)

//}
//    printAll(2, "two", "three" , "four")
//
//}
//
// fun printAll (grade: Int, vararg messages: String) {
//     println("grade: $grade")
//     for (m in messages)
//         println(m)
// }
//    println(sum(5, 7, 7, 3))
//
//}
//
// fun sum (vararg grade: Int) : Int { // аргументы переменной длины
//     var result = 0
//     for (num in grade) {
//         result += num
//     }
//     return result
// }

//    println(sum(1, 2, 3, 4))
//}
//
//fun sum (a: Int, b: Int, c: Int = 0, d: Int = 0 ) = a + b + c + d

//    studentsList(name = "Петров", surname = "ПЕТР", mark = 70) // (name =, и.т.д - именнованные параметры
//    studentsList(name = "Романов", surname = "Роман")
//
//}
//
//fun studentsList (surname: String, name: String, mark: Int = 0) { // 0 - параметр по умолчанию
//    println("Surname: $surname")
//    println("Name: $name")
//    println("mark: $mark")
//}


//    val  arrayNum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // вывод индексов
////    for (num in 1..7) {
////        println("$num: ${arrayNum[num]}")
////        for (i in 5 until 9 )
////            println("$i: ${arrayNum[i]}")
//        for (b in 9 downTo 3 step 3) {
//            println("$b: ${arrayNum[b]}")
//    }


//
//    for (i in 1.. 10 step 1) { // Таблица умножния
//        for (j in 1..10 step 1) {
//
//
//            print("${i * j}\t")
//        }
//        println()
//    }



//    for (i in 1..10) // операторы until, downTo, step
//        println(i)
//
//    for (a in 10 downTo 1 step 2)
//        println(a)
//
//    for (b in 1 until 10 )
//        println(b)



//    var i = 10 // Цыклы
//
//    while (i > 0){
//        println(i)
//        i--
//    }
//
//    var r = 10
//    do {
//        println(r)
//        r--
//    }while (r > 0)

//}

// private var name: String? = "Kotlin"

//fun main(args: Array<String>) {
//    val result = mult(40)
//    print(result)
//
//}
//
//fun mult (x: Int)  = 2 * x


//    val numbers: Array<Int> = arrayOf(5, -15, 100, -55, 20, -5, -80, 45, 25, -10) //Задание 3
//    numbers.sort()
//    println("Sorted array: ${numbers.contentToString()}")



//    val a = "Kotlin" // задание 1
//    val b: String? = null
//    println(b?.length)
//    println(a?.length)
    

//val itemsArr = mutableListOf<Int>() // Коллекция
//    val listAdd = listOf(1, 2, 3, 4, 5, 6, 7)
//
//    itemsArr.addAll(listAdd)
//    itemsArr[0] = 15
//    itemsArr.removeAt(2)
//    itemsArr.add(-2)
//
//    itemsArr.forEach { i ->
//        println(i)
//
//    }


//    val reader = Scanner(System.`in`)// перечесление массива
//    println("First number: ")
//    val a = reader.nextInt()
//    println("Second number: ")
//    val x = reader.nextInt()
//
//
//    var checkArr = mutableListOf<Int>()
//    if (a > x) {
//        for (i in x..a )
//            checkArr.add(i)
//
//    }else
//        for (i in a.. x )
//            checkArr.add(i)
//    print(checkArr)



//    val x:IntArray = intArrayOf(5, 9, 45, 96)
//    x[0] = x[1] + x[2] // Сложение в массиве
//    println(x[0])


//    val arrNum: Array<Int> = arrayOf(9, 96, 85, 88, 63, 45, 82)
//    val getNum = arrNum[6]
//    println(getNum)
//
//    val integerNumArr: IntArray = intArrayOf(98, 65,52, 85)
//    val charSymbArr: CharArray = charArrayOf('a', '#','%') // Массивы




//    val presley = name?.length?:0 // если выражение стоящее слева от Элвис оператора не является null то Элвис
//    оператор
//    // его вернет в противном случае вернет то что стоит с права, часть кода выполняется с права только если с
//    // лева получается null
//    println(presley)


//    print("Введите число: ")  // задание 5
//    val week = Scanner(System.`in`)
//    val day = week.nextInt()
//
//    when (day){
//        in 1..1 -> println("Понедельник")
//        in 2..2 -> println("Вторник")
//        in 3..3 -> println("Среда")
//        in 4..4 -> println("Четверг")
//        in 5..5 -> println("Пятница")
//        in 6..6 -> println("Суббота")
//        in 7..7 -> println("Воскресенье")
//        else -> println("неопределенное значение")
//    }


//    val a = 5 // задание 4
//    val b = 6
//    if (a % 2 == 0)
//        print("Число " + a + " Четное")
//
//    if (b % 2 == 0){
//        print("Число " + b + " Четное")
//    }







//    val a = 5 // задание 3
//    val b = 3
//    val c = 2
//    println(a*b*c)






//    print("Введите число: ")// задание 2
//    val number = Scanner(System.`in`)
//    val number1 = number.nextInt()
//
//
//    val a = 10
//    val b = 20
//    if (number1 > a)
//        print(">")
//    if (number1 < b)
//        print("<")
//    if (number1 == a)
//        print("=")
//    if (number1 == b)
//        print("=")







//    println("Введите ваше имя: ")
//    println("Введите ваш возраст: ") // домашняя работа Задача 1
//
//
//    val name = readln()
//    val age = readln() !!.toInt()
//    println("Привет $name!")
//    println("Вам: $age")

//    val age = 19
//    when (age){
//        in 7..18 -> println("школьник")
//        in 18..22 -> println("Бакалавр")
//        in 22..24 -> println("Магистр")
//        in 24..28 -> println("Аспирант")
//        !in 7..28 -> println("age вне диапозона от 7 до 28")
//        else -> println("неопределенное значение")
//    }



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



