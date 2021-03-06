package br.com.fiap.placarapp

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class PlacarViewModel: ViewModel() {

    var goalHome:MutableLiveData<Int> = MutableLiveData() //antes era 0
    var goalAway:MutableLiveData<Int> = MutableLiveData() //antes era 0

    init {
        startGame()
    }

    fun goalAway() {
        //goalAway++
        goalAway.value = goalAway.value?.plus(1)
    }

    fun goalHome() {
        //goalHome++
        goalHome.value = goalHome.value?.plus(1)
    }

    fun restartMatch() {
        startGame()
    }

    private fun startGame() {
        goalAway.value = 0
        goalHome.value = 0
    }
}