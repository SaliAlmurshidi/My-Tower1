package com.my_tower.my_tower.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;

import com.my_tower.my_tower.R;

import java.util.ArrayList;

public class nameAdapter  extends RecyclerView.Adapter<nameAdapter.MyViewHolder>  {
    ArrayList<String> galaxies;
    ArrayList<String> currentList;

    public nameAdapter(ArrayList<String> galaxies) {
        this.galaxies = galaxies;
        this.currentList=galaxies;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_user_name,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.nametxt.setText(galaxies.get(position));
    }
    @Override
    public int getItemCount() {
        return galaxies.size();
    }

    public void setGalaxies(ArrayList<String> filteredGalaxies)
    {
        this.galaxies=filteredGalaxies;
    }


    /*
    - Our MyViewHolder class
     */
    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nametxt;
        public MyViewHolder(View itemView) {
            super(itemView);
            nametxt= itemView.findViewById(R.id.viewUserName);
        }
    }

}

