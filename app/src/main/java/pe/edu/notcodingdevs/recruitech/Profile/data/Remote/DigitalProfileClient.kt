package pe.edu.notcodingdevs.recruitech.Profile.data.Remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DigitalProfileClient {
    private const val BASE_URL = "https://backend-recruitech-production.up.railway.app/api/v1"

    fun digitalProfilesService(): DigitalProfilesService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(DigitalProfilesService::class.java)
    }
}