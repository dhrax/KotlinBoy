fun main(){

    val lines: String? = object {}.javaClass.getResourceAsStream("Opcodes.json")?.bufferedReader()?.readText()

    println(lines)

}