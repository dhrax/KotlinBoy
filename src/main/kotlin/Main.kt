import com.google.gson.Gson
import com.google.gson.internal.LinkedTreeMap
import com.google.gson.reflect.TypeToken
import util.Util

fun main() {
    val window = Window("Game window")

    val util = Util()

    //read file from
    val line: String? = object {}.javaClass.getResourceAsStream("Opcodes.json")?.bufferedReader()?.readText()

    //parse the json data if not null
    line?.let {
        val gson = Gson()
        val objectType = object : TypeToken<Map<String, LinkedTreeMap<String, Instruction>>>() {}.type

        val opcodeMap: Map<String, LinkedTreeMap<String, Instruction>> = gson.fromJson(line, objectType)

        val unprefixedOpcodes = mutableListOf<Instruction>()
        val cbprefixedOpcodes = mutableListOf<Instruction>()

        util.parseOpcodes(opcodeMap, unprefixedOpcodes,cbprefixedOpcodes)

        util.printOpcodes(unprefixedOpcodes,cbprefixedOpcodes)
    }


}