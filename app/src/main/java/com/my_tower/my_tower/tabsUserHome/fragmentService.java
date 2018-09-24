package com.my_tower.my_tower.tabsUserHome;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.my_tower.my_tower.Adapter.serviceAdapter;
import com.my_tower.my_tower.Model.serviceModel;
import com.my_tower.my_tower.R;
import java.util.ArrayList;
import java.util.List;
import static com.my_tower.my_tower.home.userHome.MY_PREFS_NAME;

public class fragmentService extends Fragment {
    public fragmentService(){}
    private String idName ;
    View rootView;
    private List<serviceModel> serviceList = new ArrayList<>();
    private RecyclerView recyclerView;
    private serviceAdapter mAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_service, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.serviceListView);
        mAdapter = new serviceAdapter(serviceList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        getServerInfo();

        return rootView;
    }

    private void getServerInfo(){
        serviceList.clear();
        serviceModel service = new serviceModel("بنزين","شهري",25.0,"دولار");
        serviceList.add(service);

        service = new serviceModel("بنزين","شهري",25.0,"دينار");
        serviceList.add(service);

        service = new serviceModel("بنزين","شهري",25.0,"دينار");
        serviceList.add(service);

        service = new serviceModel("بنزين","شهري",25.0,"شيكل");
        serviceList.add(service);

        mAdapter.notifyDataSetChanged();
    }
    public void sharedPreferences (){
        SharedPreferences preferences = this.getActivity().getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE);
        //SharedPreferences prefs = mContext.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        String restoredText = preferences.getString("text", null);
        if (restoredText != null) {
            //name = preferences.getString("userName", "No name defined");//"No name defined" is the default value.
            idName = preferences.getString("idUser", "No name defined");//"No name defined" is the default value.
            // idName = prefs.getInt("idUser", 0); //0 is the default value.
        }
    }
}
