package com.my_tower.my_tower.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.my_tower.my_tower.Model.accountModel;
import com.my_tower.my_tower.Model.serviceModel;
import com.my_tower.my_tower.R;

import java.util.List;


public class accountAdapter extends RecyclerView.Adapter<com.my_tower.my_tower.Adapter.accountAdapter.MyViewHolder> {

    private List<accountModel> accountList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView accountValue;
        public ImageView accountImage;

        public MyViewHolder(View view) {
            super(view);
            accountValue = (TextView) view.findViewById(R.id.accountValue);
            accountImage = (ImageView) view.findViewById(R.id.accountImage);

        }
    }


    public accountAdapter(List<accountModel> accountList) {
        this.accountList = accountList;
    }

    @Override
    public com.my_tower.my_tower.Adapter.accountAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lists_account, parent, false);
        return new com.my_tower.my_tower.Adapter.accountAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(com.my_tower.my_tower.Adapter.accountAdapter.MyViewHolder holder, int position) {

            accountModel account = accountList.get(position);
            holder.accountValue.setText(account.getValueString());
            holder.accountImage.setImageResource(account.getPhoto());



    }

    @Override
    public int getItemCount() {
        return accountList.size();
    }
}

