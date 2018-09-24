package com.my_tower.my_tower.tabsAdminGroups;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.my_tower.my_tower.Adapter.listNameGroupAdapter;
import com.my_tower.my_tower.Model.listNameModel;
import com.my_tower.my_tower.R;

import java.util.ArrayList;
import java.util.List;

public class fragmentAdminListGroup extends Fragment {
    public fragmentAdminListGroup(){}
    private List<listNameModel> groupList = new ArrayList<>();
    private RecyclerView recyclerView;
    private listNameGroupAdapter mAdapter;
    View rootView;
    String idGroup;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_admin_list_group, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.groupListView);

        mAdapter = new listNameGroupAdapter(groupList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        payData();

        return rootView;
    }

    private void payData() {
        groupList.clear();
        listNameModel name = new listNameModel("group A");
        groupList.add(name);

        name = new listNameModel("group B");
        groupList.add(name);

        name = new listNameModel("group C");
        groupList.add(name);

        name = new listNameModel("group D");
        groupList.add(name);

        name = new listNameModel("group E");
        groupList.add(name);

        name = new listNameModel("group F");
        groupList.add(name);

        name = new listNameModel("group G");
        groupList.add(name);

        name = new listNameModel("group H");
        groupList.add(name);
        mAdapter.notifyDataSetChanged();
    }
}
