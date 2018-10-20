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
import com.my_tower.my_tower.Adapter.payAdapter;
import com.my_tower.my_tower.Model.payModel;
import com.my_tower.my_tower.R;
import java.util.ArrayList;
import java.util.List;


public class fragmentPay extends Fragment {
    private List<payModel> payList = new ArrayList<>();
    private RecyclerView recyclerView;
    private payAdapter mAdapter;
    String idName;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pay, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.payListView);

        mAdapter = new payAdapter(payList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        payData();

        return rootView;
    }
    private void goToAccount(View view){

    }
    private void payData() {
        payList.clear();
        payModel movie = new payModel("20-01-2003",0.1,"دولار");
        payList.add(movie);

         movie = new payModel("20-01-2003",20.5,"شيكل");
        payList.add(movie);

        movie = new payModel("20-01-2003",20.5,"شيكل");
        payList.add(movie);

        movie = new payModel("20-01-2003",20.5,"شيكل");
        payList.add(movie);

        movie = new payModel("20-01-2003",20.5,"شيكل");
        payList.add(movie);

        movie = new payModel("20-01-2003",20.5,"شيكل");
        payList.add(movie);

        movie = new payModel("20-01-2003",20.5,"شيكل");
        payList.add(movie);

        movie = new payModel("20-01-2003",20.5,"شيكل");
        payList.add(movie);

        movie = new payModel("20-01-2003",20.5,"شيكل");
        payList.add(movie);

        movie = new payModel("20-01-2003",20.5,"شيكل");
        payList.add(movie);

        movie = new payModel("20-01-2003",20.5,"دينار");
        payList.add(movie);

        mAdapter.notifyDataSetChanged();
    }

    public void sharedPreferences (){
//        SharedPreferences preferences = this.getActivity().getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE);
//        //SharedPreferences prefs = mContext.getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
//        String restoredText = preferences.getString("text", null);
//        if (restoredText != null) {
//            //name = preferences.getString("userName", "No name defined");//"No name defined" is the default value.
//            idName = preferences.getString("idUser", "No name defined");//"No name defined" is the default value.
//            // idName = prefs.getInt("idUser", 0); //0 is the default value.
//        }
    }
}


