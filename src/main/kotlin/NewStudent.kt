data class NewStudent(val name: String, val  mark: Int, val exams: Int) { // � ���� ������ ������ ������������ val
    val subject = 12 // �� ����� ����������� ��� ��� ��������� �� � ������������

    override fun toString(): String {
        return "Student(name='$name', mark=$mark, exams='$exams', subject='$subject)"
    }
}