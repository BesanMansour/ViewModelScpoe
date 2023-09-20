package com.project.viewmodelscpoe.Model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*

class MainActivityViewModel : ViewModel(){
//    private val myJob = Job()
//    private val myScope = CoroutineScope(Dispatchers.IO + myJob)
    private var userRepository = UserRepository()
    var users : MutableLiveData<List<User>> = MutableLiveData()


    fun getUserData(){
//        myScope.launch {
//
//        }
        viewModelScope.launch {
            var result : List<User>?=null
            withContext(Dispatchers.IO){
                result = userRepository.getUsers()
            }
            users.value = result
        }
    }
//
//    override fun onCleared() {
//        super.onCleared()
//        myScope.cancel()
//    }
}