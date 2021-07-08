enum class Score(val value: String, ) {
    ZERO ("love"),
    FIFTEEN ("15"),
    THIRTY ("30"),
    FORTY ("40");

    fun next(): Score {
        return values()[this.ordinal + 1]
    }
}
