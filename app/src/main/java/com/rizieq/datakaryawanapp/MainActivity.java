package com.rizieq.datakaryawanapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.rizieq.datakaryawanapp.Main.MainContract;
import com.rizieq.datakaryawanapp.Main.MainPresenter;
import com.rizieq.datakaryawanapp.model.ResultItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainContract.View {


    
    @BindView(R.id.rv_main)
    RecyclerView rvMain;

    MainPresenter presenter = new MainPresenter(this);
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public void showProggress() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    @Override
    public void hideProggress() {
        progressDialog.dismiss();

    }

    @Override
    public void showKaryawan(List<ResultItem> resultItems) {
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setAdapter(new AdapterKaryawan(this,resultItems));


    }

    @Override
    public void showFailureMessage(String msg) {
        Toast.makeText(this, "Gagal", Toast.LENGTH_SHORT).show();

    }
}
