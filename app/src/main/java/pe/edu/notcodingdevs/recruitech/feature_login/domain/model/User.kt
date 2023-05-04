package pe.edu.notcodingdevs.recruitech.feature_login.domain.model

data class User (
    val id: Int,
    val email: String,
    val password: String,
    val name: String,
    val lastname: String,
)