package com.example.lesson4
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
val counter =  MutableLiveData<Int>()
val historyList = MutableLiveData<String>()
    private var lHistory = ""
    private var count = 0
    fun increment(){
       count++
        counter.value = count
        lHistory = "+"
        historyList.postValue(lHistory)
    }
    fun decrement(){
        count--
        counter.value = count
        lHistory = "-"
        historyList.postValue(lHistory)
    }
}