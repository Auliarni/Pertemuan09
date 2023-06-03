package com.example.pertemuan09.model.response


import com.example.pertemuan09.model.request.DetailDataMahasiswa
import com.google.gson.annotations.SerializedName

data class ResponseDetailMahasiswa(
    @SerializedName("data")
    val data: DetailDataMahasiswa,
    @SerializedName("status")
    val status: String
)