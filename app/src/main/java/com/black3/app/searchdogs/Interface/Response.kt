package com.black3.app.searchdogs.Interface

import com.black3.app.searchdogs.Interface.Message
import com.google.gson.annotations.SerializedName

//@Generated("com.robohorse.robopojogenerator")
data class Response(

	@field:SerializedName("message")
	val message: Message? = null,

	@field:SerializedName("status")
	val status: String? = null
)