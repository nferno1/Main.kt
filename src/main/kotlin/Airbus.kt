class Airbus(val modelAir: Int, yearGread: Int, modelOnDay: Int) : Airplane("Airbus", yearGread,
    modelOnDay){
    fun model () : String{
        return "model air: $modelAir"
    }
}


