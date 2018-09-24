package com.my_tower.my_tower.tabsAdminGroups;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import com.my_tower.my_tower.R;

import java.util.ArrayList;

public class fragmentAdminAddGroup extends Fragment {

    View rootView;
    private static final String[] listType = {"دينار اردني", "شيكل", "دولار"};
    ArrayList<String> listItemsSelect;
    private Spinner spinnerCurencyType;
    String selectType;
    Button btn;
    boolean[] checkedItems;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_admin_add_group, container, false);
        btn = (Button) rootView.findViewById(R.id.btn);

        //chooseGroups();

        return rootView;

    }

    public void choseUser(View view) {
    }
    public void choseService(View view) {
    }
    public void addGroupSave(View view) {
    }
}