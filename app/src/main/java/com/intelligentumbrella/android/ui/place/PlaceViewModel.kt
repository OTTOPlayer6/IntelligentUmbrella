package com.intelligentumbrella.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.util.ArrayList
import com.intelligentumbrella.android.logic.Repository
import com.intelligentumbrella.android.logic.model.Place


class PlaceViewModel : ViewModel() {

    private val searchLivedata = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLivedata) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLivedata.value = query
    }

}