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
import android.widget.ImageView;
import android.widget.TextView;
import com.my_tower.my_tower.Adapter.accountAdapter;
import com.my_tower.my_tower.Model.accountModel;
import com.my_tower.my_tower.R;
import java.util.ArrayList;
import java.util.List;
import static com.my_tower.my_tower.home.userHome.MY_PREFS_NAME;

public class fragmentAccount extends Fragment{

    private List<accountModel> accountList = new ArrayList<>();
    private RecyclerView recyclerView;
    private accountAdapter mAdapter;
    View rootView;
    TextView value;
    ImageView image;
    String name,idName ;
    //int idName;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.fragment_account, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.accountListView);
        mAdapter = new accountAdapter(accountList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        putValues();
        return rootView;

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

    public void putValues (){
        accountList.clear();
        accountModel account = new accountModel(R.drawable.dolar,20.5);
        accountList.add(account);

        account = new accountModel(R.drawable.nis,21.5);
        accountList.add(account);

        account = new accountModel(R.drawable.jod,22.5);
        accountList.add(account);

        mAdapter.notifyDataSetChanged();

    }

}
