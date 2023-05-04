package pe.edu.notcodingdevs.recruitech.feature_login.presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import pe.edu.notcodingdevs.recruitech.di.LoginClient
import pe.edu.notcodingdevs.recruitech.feature_login.domain.model.Credential
import pe.edu.notcodingdevs.recruitech.feature_login.domain.repository.LoginRepository

class LoginViewModel(): ViewModel() {
    private val loginService = LoginClient.loginService()
    private val loginRepository = LoginRepository(loginService)

    private val _auth = loginRepository.authenticator
    val authenticator get() = _auth

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email
    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    fun setEmail(email: String) {
        _email.value = email
    }

    fun setPassword (password: String) {
        _password.value = password
    }

    fun validate() {
        loginRepository.authentication(Credential(email.value.toString(), password.value.toString()))
        _auth.value = loginRepository.authenticator.value
    }
}