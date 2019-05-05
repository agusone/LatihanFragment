package com.example.latihanfragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapterMahasiswa extends RecyclerView.Adapter<RecyclerAdapterMahasiswa.ViewHolder> {

    private ArrayList<Mahasiswa> mahasiswaArrayList;

    public RecyclerAdapterMahasiswa(ArrayList<Mahasiswa> mahasiswaArrayList) {
        this.mahasiswaArrayList = mahasiswaArrayList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.list_mahasiswa, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        int no = (i + 1);

        viewHolder.txtNo.setText(String.valueOf(no));
        viewHolder.txtNim.setText(mahasiswaArrayList.get(i).getNim());
        viewHolder.txtNama.setText(mahasiswaArrayList.get(i).getNama());
        viewHolder.txtProdi.setText(mahasiswaArrayList.get(i).getProdi());
    }

    @Override
    public int getItemCount() {
        return mahasiswaArrayList != null ? mahasiswaArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNo, txtNama, txtNim, txtProdi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNo = itemView.findViewById(R.id.text_no);
            txtNama = itemView.findViewById(R.id.text_nama);
            txtNim = itemView.findViewById(R.id.text_nim);
            txtProdi = itemView.findViewById(R.id.text_prodi);


        }


    }

}
