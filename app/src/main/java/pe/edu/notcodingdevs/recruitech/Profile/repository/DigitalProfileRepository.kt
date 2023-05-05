package pe.edu.notcodingdevs.recruitech.Profile.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import pe.edu.notcodingdevs.recruitech.Profile.data.Remote.DigitalProfilesResponse
import pe.edu.notcodingdevs.recruitech.Profile.data.Remote.DigitalProfilesService
import pe.edu.notcodingdevs.recruitech.Profile.data.model.DigitalProfile
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DigitalProfileRepository(
    private val digitalProfilesService: DigitalProfilesService,

) {
    private val _digitalProfile = MutableLiveData<List<DigitalProfile>>(emptyList())
    val digitalProfile get() = _digitalProfile

    fun fetchById(id: String) {
        val fetchByName = digitalProfilesService.fetchById(id = String())

        fetchByName.enqueue(object : Callback<DigitalProfilesResponse> {
            override fun onResponse(
                call: Call<DigitalProfilesResponse>,
                response: Response<DigitalProfilesResponse>
            ) {
                if (response.isSuccessful) {

                    if (response.body()!!.results == null) {
                        _digitalProfile.value = emptyList()
                    } else {
                        _digitalProfile.value = response.body()!!.results!!
                    }


                }
            }

            override fun onFailure(call: Call<DigitalProfilesResponse>, t: Throwable) {
                Log.d("SuperHeroRepository", t.message.toString())
            }

        })
    }
}