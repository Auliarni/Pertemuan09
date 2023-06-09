package com.example.pertemuan09.model.response


import com.example.pertemuan09.model.request.DataMahasiswa
import com.google.gson.annotations.SerializedName

data class ResponseDataMahasiswa(
    @SerializedName("data")
    val data: List<DataMahasiswa>,
    @SerializedName("status")
    val status: String
)