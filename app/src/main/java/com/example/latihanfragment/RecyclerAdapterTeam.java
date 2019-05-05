package com.example.latihanfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapterTeam extends RecyclerView.Adapter<RecyclerAdapterTeam.ViewHolder> {


    private ArrayList<Team> teamArrayList; private Context context;

    public RecyclerAdapterTeam(Context context,ArrayList<Team> teamArrayList) {
        this.teamArrayList = teamArrayList;
        this.context = context;
    }

    @NonNull @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()). inflate(R.layout.list_team,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        int no=i+1; viewHolder.txtno.setText(String.valueOf(no));
        viewHolder.txtTeam.setText(teamArrayList.get(i).getName());
        viewHolder.imgLogo.setImageResource(Integer.parseInt(teamArrayList.get(i).getLogo()));
    }

    @Override
    public int getItemCount() {
        return teamArrayList!=null ? teamArrayList.size():0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtTeam,txtno;
        ImageView imgLogo;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            txtno=itemView.findViewById(R.id.text_no);
            txtTeam=itemView.findViewById(R.id.text_team);
            imgLogo=itemView.findViewById(R.id.img_logo);
        }
    }





}
