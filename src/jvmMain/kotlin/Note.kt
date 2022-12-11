data class Note(val title: String, val description: String, val type: Type) {
    enum class Type { TEXT, AUDIO }
}

val list = listOf(
    Note("Title 1", "Description 1", Note.Type.TEXT),
    Note("Title 2", "Description 2", Note.Type.TEXT),
    Note("Title 3", "Description 3", Note.Type.AUDIO),
    Note("Title 4", "Description 4", Note.Type.TEXT),
    Note("Title 5", "Description 5", Note.Type.TEXT),
    Note("Title 6", "Description 6", Note.Type.AUDIO),
    Note("Title 7", "Description 7", Note.Type.TEXT),
    Note("Title 8", "Description 8", Note.Type.TEXT),
    Note("Title 9", "Description 9", Note.Type.TEXT),
    Note("Title 10", "Description 10", Note.Type.AUDIO)
)