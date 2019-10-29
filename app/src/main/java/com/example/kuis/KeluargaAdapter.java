package com.example.kuis;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder> {
    private ArrayList<Keluarga>dataList;

    public KeluargaAdapter(ArrayList<Keluarga>dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public KeluargaAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new KeluargaViewHolder(view);
    }

    public void onBindViewHolder(KeluargaViewHolder holder, int position){
        holder.imgProfil.setImageDrawable(dataList.get(position).getGambar());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtAnggota.setText(dataList.get(position).getAnggota());
    }

    @Override
    public int getItemCount(){
        return (dataList !=null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtAnggota;
        private ImageView imgProfil;

        public KeluargaViewHolder(View itemView){
            super(itemView);
            imgProfil = (ImageView) itemView.findViewById(R.id.profile_image) ;
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_keluarga);
            txtAnggota = (TextView) itemView.findViewById(R.id.txt_anggota_keluarga);
        }
    }
}
