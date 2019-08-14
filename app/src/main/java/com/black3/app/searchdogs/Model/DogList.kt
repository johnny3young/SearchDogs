package com.black3.app.searchdogs.Model

import com.black3.app.searchdogs.Model.Dog
import com.google.gson.annotations.SerializedName

class DogList {
    @SerializedName("results")
    var movies: ArrayList<Dog>? = null
}
