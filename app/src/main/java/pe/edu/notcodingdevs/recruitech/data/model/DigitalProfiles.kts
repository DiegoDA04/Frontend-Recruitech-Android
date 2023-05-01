package pe.edu.notcodingdevs.recruitech.data.model

import com.google.gson.annotations.SerializedName

data class DigitalProfiles(

    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val password: String,
    val role: String,
    val description: String,
    val image: String,
    val bannerImage: String

)