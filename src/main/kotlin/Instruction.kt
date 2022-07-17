data class Instruction(
    var opcode: Int, val immediate: Boolean, val operands: List<Operand>,
    val mnemonic: String, val bytes: Int, val cycles: List<Int>, var comment: String = ""
){

    override fun toString(): String {
        return "Instruction(opcode=$opcode, immediate=$immediate, operands=$operands, mnemonic='$mnemonic', bytes=$bytes, cycles=$cycles, comment='$comment')"
    }

    fun setOpcode(value: String){
        opcode = Integer.decode(value)
    }
}
