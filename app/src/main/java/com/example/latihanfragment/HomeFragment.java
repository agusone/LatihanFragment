package com.example.latihanfragment;


import android.content.res.Resources;
import android.content.res.TypedArray;
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
public class HomeFragment extends Fragment {

    private RecyclerView recyclerViewTeam;
    private RecyclerAdapterTeam recyclerAdapterTeam;
    private ArrayList<Team> teamArrayList;




    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewTeam=view.findViewById(R.id.rcv_team); getTeam();
        recyclerAdapterTeam= new RecyclerAdapterTeam(getContext(),teamArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerViewTeam.setLayoutManager(layoutManager); recyclerViewTeam.setAdapter(recyclerAdapterTeam);
        return view;


    }

    private void getTeam()
    {
        if(teamArrayList==null)
        {
            Resources resources = getResources();
            String[] teamName= resources.getStringArray(R.array.club_name); final TypedArray
                teamLogo=resources.obtainTypedArray(R.array.club_image); teamArrayList=new ArrayList<Team>();
            for (int i=0;i<teamName.length;i++)
            {
                teamArrayList.add(new Team(teamName[i],String.valueOf(teamLogo.getResourceId(i,-1))));
            }
        }
    }




}
