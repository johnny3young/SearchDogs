package com.black3.app.searchdogs.Interface

import com.black3.app.searchdogs.Model.DogList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheDogDbApi {

@GET("{orderby}/images/random")
fun getDogBy(@Path(value = "orderby", encoded = true) orderby : String) : Call<DogList>


@GET("{orderby}/images/random")
fun getDogsByBreed(@Query("query") searchbybreed : String) : Call<DogList>

}
//https://dog.ceo/api/breed/{orderby}