package de.softdeveloper.viewmodeldemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Data : ViewModel(){
    var content = MutableLiveData<String>()
}