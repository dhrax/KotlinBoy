package util

import Instruction
import com.google.gson.internal.LinkedTreeMap

class Util {

    fun parseOpcodes(
        opcodeMap: Map<String, LinkedTreeMap<String, Instruction>>,
        unprefixedOpcodes: MutableList<Instruction>,
        cbprefixedOpcodes: MutableList<Instruction>
    ) {
        opcodeMap.forEach { entry ->
            entry.value.forEach { value ->
                value.value.setOpcode(value.key)

                if(entry.key.equals("unprefixed")){
                    unprefixedOpcodes.add(value.value)
                }else{
                    cbprefixedOpcodes.add(value.value)
                }
            }
        }
    }

    fun printOpcodes(
        unprefixedOpcodes: MutableList<Instruction>,
        cbprefixedOpcodes: MutableList<Instruction>
    ) {
        unprefixedOpcodes.forEach { value ->
            println(value)
            println("-------------------------------")

        }
        println("*********************************")
        cbprefixedOpcodes.forEach { value ->
            println(value)
            println("-------------------------------")
        }
    }
}