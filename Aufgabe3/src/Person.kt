class Person(var name: String, var nummer: Int, var alter: Int) {
    fun sprechen()
    {
        println("Hallo an alle")
    }
    fun vorstellung(){
        println("Hallo ich bin $name und bin $alter Jahre alt.")
    }
}
