package pe.edu.notcodingdevs.recruitech.data.Remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DigitalProfilesService {

    @Get("search/{firstName}")
    fun fetchByName(@Path("firstName") firstName: String): Call<DigitalProfilesResponse>

    @Get("search/{lastName}")
    fun fetchByName(@Path("lastName") firstName: String): Call<DigitalProfilesResponse>
}