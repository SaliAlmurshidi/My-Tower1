package com.my_tower.my_tower.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.my_tower.my_tower.Model.payModel;
import com.my_tower.my_tower.Model.serviceModel;
import com.my_tower.my_tower.R;

import java.util.ArrayList;
import java.util.List;


public class payAdapter extends RecyclerView.Adapter<payAdapter.MyViewHolder> {

    private List<payModel> payList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView payDate, payCurrency, payValue;

        public MyViewHolder(View view) {
            super(view);
            payDate = (TextView) view.findViewById(R.id.payDate);
            payCurrency = (TextView) view.findViewById(R.id.payCurrency);
            payValue = (TextView) view.findViewById(R.id.payValue);
        }
    }


    public payAdapter(List<payModel> payList) {
        this.payList = payList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lists_pay, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        payModel pay = payList.get(position);
        holder.payCurrency.setText(pay.getCurrency());
        holder.payValue.setText(pay.getValueSTring());
        holder.payDate.setText(pay.getDate());
    }

    @Override
    public int getItemCount() {
        return payList.size();
    }
}


