package com.example.latihanfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MahasiswaFragment extends Fragment {

    private RecyclerView recyclerViewMahasiswa;
    private RecyclerAdapterMahasiswa recyclerAdapterMahasiswa;
    private ArrayList<Mahasiswa>mahasiswaArrayList;


    public MahasiswaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mahasiswa, container, false);

        recyclerViewMahasiswa=view.findViewById(R.id.rcv_mahasiswa);
        getMahasiswa();
        recyclerAdapterMahasiswa=new
                RecyclerAdapterMahasiswa(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerViewMahasiswa.setLayoutManager(layoutManager);

        recyclerViewMahasiswa.setAdapter(recyclerAdapterMahasiswa);
        return view;
    }

    private void getMahasiswa(){
        mahasiswaArrayList= new ArrayList <Mahasiswa>();
        mahasiswaArrayList.add(new Mahasiswa(1,"170030258","agussetiawan","Sistem Informasi"));
        mahasiswaArrayList.add(new Mahasiswa(1,"170030213","wayan gabler","Sistem Komputer"));
    }

}
