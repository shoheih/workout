package net.min.workout.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var countNum = MutableLiveData<Int>()
    var displayNum = MutableLiveData<String>()

    fun initParameters() {
        countNum.value = 0
        displayNum.value = countNum.value.toString()
    }

    fun countUp() {
        countNum.value = countNum.value!! + 1
        displayNum.value = countNum.value.toString()
    }
}
