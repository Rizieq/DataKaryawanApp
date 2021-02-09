package com.rizieq.datakaryawanapp.Main;

import com.rizieq.datakaryawanapp.api.ApiClient;
import com.rizieq.datakaryawanapp.api.ApiInterface;
import com.rizieq.datakaryawanapp.model.ResponseKaryawan;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements MainContract.Presenter {

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    private MainContract.View view;
    private ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

    @Override
    public void getListKaryawan() {
        Call<ResponseKaryawan> call = apiInterface.getKaryawan();
        call.enqueue(new Callback<ResponseKaryawan>() {
            @Override
            public void onResponse(Call<ResponseKaryawan> call, Response<ResponseKaryawan> response) {
                view.hideProggress();
                if (response.body() != null){
                    if (response.body().getKode() == 1){
                        view.showKaryawan(response.body().getResult());
                    } else {
                        view.showFailureMessage(response.body().getPesan());
                    }
                } else {
                    view.showFailureMessage("Data Kosong");
                }
            }

            @Override
            public void onFailure(Call<ResponseKaryawan> call, Throwable t) {
                view.showFailureMessage(t.getMessage());

            }
        });

    }
}
