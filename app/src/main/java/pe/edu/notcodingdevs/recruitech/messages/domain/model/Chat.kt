package pe.edu.notcodingdevs.recruitech.messages.domain.model

data class Chat(
    val imageProfile: String,
    val name: String,
    val allMessage: List<Message>
)
