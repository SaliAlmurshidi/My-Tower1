package com.my_tower.my_tower.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.my_tower.my_tower.Model.serviceModel;
import com.my_tower.my_tower.R;

import java.util.List;



    public class serviceAdapter extends RecyclerView.Adapter<com.my_tower.my_tower.Adapter.serviceAdapter.MyViewHolder> {

        private List<serviceModel> serviceList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView serverDaly, serverValue, serverCurrency , serverName;

            public MyViewHolder(View view) {
                super(view);
                serverDaly = (TextView) view.findViewById(R.id.serverDaly);
                serverValue = (TextView) view.findViewById(R.id.serverValue);
                serverCurrency = (TextView) view.findViewById(R.id.serverCurrency);
                serverName = (TextView) view.findViewById(R.id.serverName);
            }
        }


        public serviceAdapter(List<serviceModel> serviceList) {
            this.serviceList = serviceList;
        }

        @Override
        public com.my_tower.my_tower.Adapter.serviceAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.lists_service, parent, false);
            return new com.my_tower.my_tower.Adapter.serviceAdapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(com.my_tower.my_tower.Adapter.serviceAdapter.MyViewHolder holder, int position) {
            serviceModel service = serviceList.get(position);
            holder.serverDaly.setText(service.getCyclic());
            holder.serverValue.setText(service.getValueSTring());
            holder.serverCurrency.setText(service.getCurrency());
            holder.serverName.setText(service.getService());
        }

        @Override
        public int getItemCount() {
            return serviceList.size();
        }
    }
