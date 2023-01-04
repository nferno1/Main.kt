data class NewStudent(val name: String, val  mark: Int, val exams: Int) { // в дата классе всегда используется val
    val subject = 12 // не будет считываться так как находится не в конструкторе

    override fun toString(): String {
        return "Student(name='$name', mark=$mark, exams='$exams', subject='$subject)"
    }
}