package com.my_tower.my_tower.tabsAdminService;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.my_tower.my_tower.Adapter.listNameAdapter;
import com.my_tower.my_tower.Adapter.nameAdapter;
import com.my_tower.my_tower.Adapter.serviceAdapter;
import com.my_tower.my_tower.Model.listNameModel;
import com.my_tower.my_tower.Model.serviceModel;
import com.my_tower.my_tower.R;

import java.util.ArrayList;
import java.util.List;

public class fragmentAdminListService extends Fragment {
    View rootView;
    AutoCompleteTextView myAutoComplete;
    ArrayList<String> userList;
    private List<listNameModel> serverList = new ArrayList<>();
    private RecyclerView recyclerView;
    private listNameAdapter mAdapter;
    private AutoCompleteTextView completeServerName;
    nameAdapter adapter;
    EditText searchBar;
    public fragmentAdminListService(){}
    private String idName ;
    private List<serviceModel> serviceList = new ArrayList<>();
    //private serviceAdapter mAdapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_admin_list_service, container, false);
        recyclerView();

        searchBar = (EditText) rootView.findViewById(R.id.searchBoxServer);

        //searchBar.addTextChangedListener(textWatcher);

        return rootView;
    }

//    TextWatcher textWatcher = new TextWatcher() {
//        @Override
//        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//        }
//
//        @Override
//        public void onTextChanged(CharSequence s, int start, int before, int count) {
//            adapter.getFilter().filter(s);
//        }
//
//        @Override
//        public void afterTextChanged(Editable s) {
//
//        }
//    };

    private void recyclerView() {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.serverList);
        // mAdapter = new listNameAdapter(nameList);
        adapter = new nameAdapter(getAllNames());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        // recyclerView.setAdapter(mAdapter);
        recyclerView.setAdapter(adapter);
        // getNames();


    }

    private void getNames() {
        serverList.clear();
        listNameModel names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        names = new listNameModel("دولار");
        serverList.add(names);

        mAdapter.notifyDataSetChanged();

    }

    private ArrayList<String> getAllNames () {
        ArrayList<String> names = new ArrayList<>();
        names.add("محمد");
        names.add("أحمد");
        names.add("محمود");
        names.add("مصطفى");
        names.add("أمل");
        names.add("مريم");
        names.add("سامر");
        names.add("تامر");
        names.add("أسعد");
        names.add("محمد");
        names.add("أحمد");
        names.add("محمود");
        names.add("مصطفى");
        names.add("أمل");
        names.add("مريم");
        names.add("سامر");
        names.add("تامر");
        names.add("أسعد");


        return names;
    }
}
