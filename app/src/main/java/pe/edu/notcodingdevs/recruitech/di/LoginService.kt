package pe.edu.notcodingdevs.recruitech.di

import pe.edu.notcodingdevs.recruitech.feature_login.domain.model.Credential
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface  LoginService {
    @POST("login")
    fun auth(@Body credential: Credential): Call<LoginResponse>
}