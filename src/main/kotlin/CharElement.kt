enum class CharElement {
    number, letter;

    val initial: int
        get() {
            return when (this) {
                number -> 0
                letter -> 'a'.code
            }
        }

    fun getNext(num: int): int {
        return when (this) {
            number -> {
                if (num == 9) {
                    1
                } else {
                    num + 1
                }
            }
            letter -> {
                if (num == 'z'.code) {
                    'a'.code
                } else {
                    num + 1
                }
            }
        }
    }
}