package pe.edu.notcodingdevs.recruitech.Profile.data.Remote

import retrofit2.Call
import retrofit2.http.GET;
import retrofit2.http.Path;

interface DigitalProfilesService {
    @GET("search/{id}")
    fun fetchById(@Path("id") id: String): Call<DigitalProfilesResponse>
    /*

        @Get("search/{firstName}")
        fun fetchByName(@Path("firstName") firstName: String): Call<DigitalProfilesResponse>

        @Get("search/{lastName}")
        fun fetchByName(@Path("lastName") firstName: String): Call<DigitalProfilesResponse>

    */
}