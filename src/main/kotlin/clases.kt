fun main(){

    val ivan = Student()
    ivan.name = "Ivan"
    ivan.surname = "Ivanov"
    ivan.mark = 88.3

    val petr = Student()
    petr.name = "Petr"
    petr.surname = " "
    petr.mark = 96.2

    println("${ivan.name}, ${ivan.surname}: ${ivan.mark} mark")
    println("${petr.name}, ${petr.surname}: ${petr.mark} mark")

    /*val student = Student()
    println(student.name)
    println(student.surname)
    println(student.mark)*/


 /*val student = Student("Ivan", true)
    println(student.name)
    println(student.isPassed)*/

}