package com.example.firebaseauth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firebaseauth.RetrofitService.api
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {


    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    fun getData() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val user = api.signIn()
                _user.postValue(user.body())
            }
        }
    }
}