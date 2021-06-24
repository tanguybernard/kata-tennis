enum class Score(value: String, ) {
    ZERO ("0"),
    FIFTEEN ("15"),
    THIRTY ("30"),
    FORTY ("40");

    fun next(): Score {
        return Score.values()[this.ordinal + 1]
    }
}