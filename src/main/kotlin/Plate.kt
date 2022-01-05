class Plate(private vararg val charElements: CharElement) {

    var prefix = ""

    private val ints = IntArray(charElements.size) {
        if (charElements[it] == CharElement.letter) {
            'a'.code
        } else {
            0
        }
    }

    fun next(): string {
        val str = StringBuilder()
        for (i in this.charElements.indices) {
            if (this.charElements[i] == CharElement.letter)
                str.append(this.ints[i].toChar())
            else
                str.append(this.ints[i])
        }
        for (i in this.charElements.size - 1 downTo 0) {
            if (this.charElements[i].getNext(this.ints[i]).also { this.ints[i] = it } != this.charElements[i].initial) {
                break
            }
        }
        return prefix + str.toString()
    }

}