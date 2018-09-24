package com.my_tower.my_tower.tabsAdminService;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.my_tower.my_tower.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fragmentAdminAddService extends Fragment {
    View rootView;
    private static final String[]listType = {"دينار اردني", "شيكل","دولار"};
    ArrayList<String> listItemsSelect;
    private Spinner spinnerCurencyType ;
    String selectType;
    Button btn;
    boolean[] checkedItems;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_admin_add_service, container, false);
        btn = (Button) rootView.findViewById(R.id.btn);
        spinCurencyType();
        //chooseGroups();
        spinnerCurencyType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                selectType = spinnerCurencyType.getSelectedItem().toString();
                //slectItem.setText(item);
                Log.e("value select user name", selectType);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return rootView;

    }


    public void saveAddDone(View view){

    }

    protected void spinCurencyType(){
        spinnerCurencyType = (Spinner) rootView.findViewById(R.id.spinnerCurencyType);
        ArrayAdapter<String> usersAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item,listType);

        usersAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCurencyType.setAdapter(usersAdapter);
        //spinnerService.setOnItemSelectedListener(select);

    }
}
