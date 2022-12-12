import androidx.compose.runtime.MutableState

fun <T> MutableState<T>.update(produceValue: (T) -> T) {
    this.value = produceValue(this.value)
}