package pe.edu.notcodingdevs.recruitech.feature_login.domain.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import pe.edu.notcodingdevs.recruitech.di.LoginResponse
import pe.edu.notcodingdevs.recruitech.di.LoginService
import pe.edu.notcodingdevs.recruitech.feature_login.domain.model.Credential
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginRepository(
    private val loginService: LoginService
) {
    private val _auth = MutableLiveData<String>()
    val authenticator get() = _auth

     fun authentication(credential: Credential) {
        var auth = loginService.auth(credential)

         auth.enqueue(object : Callback<LoginResponse> {
             override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                 if (response.isSuccessful) {
                     _auth.postValue(response.body()!!.status)
                 }
             }

             override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                 Log.d("LoginRepository", t.message.toString())
             }

         })
    }
}