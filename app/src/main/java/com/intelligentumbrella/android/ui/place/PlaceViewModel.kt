package com.intelligentumbrella.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.intelligentumbrella.android.logic.Repository
import com.intelligentumbrella.android.logic.model.Place
import java.util.ArrayList

class PlaceViewModel : ViewModel() {

    private val searchLivedata = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val palceLiveData = Transformations.switchMap(searchLivedata) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLivedata.value = query
    }

}