open class Phone(val os: String, val model: String, val cost: Int){ //open ��� ���������� ������
    fun printInfo() : String {
        return "Os: $os, Model: $model, Cost: $cost$"
    }

    fun isExpensive() : Boolean {

        return cost > 8000
    }

}


