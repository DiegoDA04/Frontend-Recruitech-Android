package pe.edu.notcodingdevs.recruitech.di

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object LoginClient {
    private const val BASE_URL = "https://backend-recruitech-production.up.railway.app/api/v1/users/"

    fun loginService() :LoginService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(LoginService::class.java)
    }
}