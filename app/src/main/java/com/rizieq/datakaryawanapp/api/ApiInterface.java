package com.rizieq.datakaryawanapp.api;

import com.google.gson.annotations.SerializedName;
import com.rizieq.datakaryawanapp.model.ResponseKaryawan;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface ApiInterface {

    @FormUrlEncoded
    @GET("list_karyawan.php")
    Call<ResponseKaryawan> getKaryawan();
}
