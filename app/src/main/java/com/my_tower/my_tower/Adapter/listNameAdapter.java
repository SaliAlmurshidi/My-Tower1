package com.my_tower.my_tower.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.my_tower.my_tower.Model.listNameModel;
import com.my_tower.my_tower.R;

import java.util.List;


public class listNameAdapter extends RecyclerView.Adapter<listNameAdapter.MyViewHolder> {

    private List<listNameModel> nameList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView userName;

        public MyViewHolder(View view) {
            super(view);
            userName = (TextView) view.findViewById(R.id.viewUserName);

        }
    }


    public listNameAdapter(List<listNameModel> nameList) {
        this.nameList = nameList;
    }

    @Override
    public com.my_tower.my_tower.Adapter.listNameAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_user_name, parent, false);
        return new com.my_tower.my_tower.Adapter.listNameAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(com.my_tower.my_tower.Adapter.listNameAdapter.MyViewHolder holder, int position) {
        listNameModel names = nameList.get(position);
        holder.userName.setText(names.getUserName());

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
