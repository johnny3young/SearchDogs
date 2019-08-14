package com.black3.app.searchdogs.Model
import com.black3.app.searchdogs.Interface.Message
import com.google.gson.annotations.SerializedName

data class Dog (@field:SerializedName("message")
                val message: Message? = null,

                @field:SerializedName("status")
                val status: String? = null
              ){
}