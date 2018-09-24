package com.my_tower.my_tower.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.my_tower.my_tower.Model.listNameModel;
import com.my_tower.my_tower.R;

import java.util.List;


public class listNameGroupAdapter extends RecyclerView.Adapter<listNameGroupAdapter.MyViewHolder> {

    private List<listNameModel> nameList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView userName;

        public MyViewHolder(View view) {
            super(view);
            userName = (TextView) view.findViewById(R.id.groupNameList);

        }
    }


    public listNameGroupAdapter(List<listNameModel> nameList) {
        this.nameList = nameList;
    }

    @Override
    public com.my_tower.my_tower.Adapter.listNameGroupAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_name_group_details, parent, false);
        return new com.my_tower.my_tower.Adapter.listNameGroupAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(com.my_tower.my_tower.Adapter.listNameGroupAdapter.MyViewHolder holder, int position) {
        listNameModel names = nameList.get(position);
        holder.userName.setText(names.getUserName());

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
