package pe.edu.notcodingdevs.recruitech.messages.domain.model

data class Message(
    val message:String,
    val fromMe: Boolean = true
)
