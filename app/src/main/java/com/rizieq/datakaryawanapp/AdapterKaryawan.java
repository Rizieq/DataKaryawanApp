package com.rizieq.datakaryawanapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rizieq.datakaryawanapp.model.ResultItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterKaryawan extends RecyclerView.Adapter<AdapterKaryawan.MyViewHolder> {



    private Context context;
    private List<ResultItem> resultItems;

    public AdapterKaryawan(Context context, List<ResultItem> resultItems) {
        this.context = context;
        this.resultItems = resultItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_main, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        final ResultItem model = resultItems.get(i);

        Glide.with(context).load("http://localhost/db_karyawan/uploads/" + model.getFotoKaryawan()).into(myViewHolder.imgProfil);
        myViewHolder.txtNama.setText(model.getNamaKaryawan());
        myViewHolder.txtJabatan.setText(model.getJabatan());
        myViewHolder.txtUmur.setText(model.getUmurKaryawan());
        myViewHolder.txtGaji.setText(model.getGajih());

    }

    @Override
    public int getItemCount() {
        return resultItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txtNama)
        TextView txtNama;
        @BindView(R.id.txtJabatan)
        TextView txtJabatan;
        @BindView(R.id.txtUmur)
        TextView txtUmur;
        @BindView(R.id.txtGaji)
        TextView txtGaji;
        @BindView(R.id.imgProfil)
        CircleImageView imgProfil;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);

        }
    }
}
