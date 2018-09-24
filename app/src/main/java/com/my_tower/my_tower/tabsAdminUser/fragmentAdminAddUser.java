package com.my_tower.my_tower.tabsAdminUser;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

public class fragmentAdminAddUser extends Fragment {
    View rootView;
    private static final String[]listType = {"أدمن", "مستخدم"};
    ArrayList<String> listItemsSelect;
    private Spinner spinnerUserType ;
    String selectType;
    Button btn;
    boolean[] checkedItems;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_admin_add_user, container, false);
         btn = (Button) rootView.findViewById(R.id.btn);
        spinUserName();
        chooseGroups();
        spinnerUserType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                selectType = spinnerUserType.getSelectedItem().toString();
                //slectItem.setText(item);
                Log.e("value select user name", selectType);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return rootView;

    }

    public void chooseGroups(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Build an AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

                // String array for alert dialog multi choice items
                String[] colors = new String[]{
                        "Red",
                        "Green",
                        "Blue",
                        "Purple",
                        "Olive"
                };

                // Boolean array for initial selected items
                final boolean[] checkedColors = new boolean[]{
                        false, // Red
                        false, // Green
                        false, // Blue
                        false, // Purple
                        false // Olive

                };

                // Convert the color array to list
                final List<String> colorsList = Arrays.asList(colors);

                builder.setMultiChoiceItems(colors, checkedColors, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                        // Update the current focused item's checked status
                        checkedColors[which] = isChecked;

                        // Get the current focused item
                        String currentItem = colorsList.get(which);

                        // Notify the current action
                        Toast.makeText(getActivity(),
                                currentItem + " " + isChecked, Toast.LENGTH_SHORT).show();
                    }
                });

                // Specify the dialog is not cancelable
                builder.setCancelable(false);

                // Set a title for alert dialog
                builder.setTitle("Your preferred colors?");

                // Set the positive/yes button click listener
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when click positive button
                        //tv.setText("Your preferred colors..... \n");
                        for (int i = 0; i<checkedColors.length; i++){
                            boolean checked = checkedColors[i];
                            if (checked) {
                                listItemsSelect.add(colorsList.get(i));
                            }
                        }
                    }
                });

                // Set the negative/no button click listener
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when click the negative button
                    }
                });

                // Set the neutral/cancel button click listener
                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when click the neutral button
                    }
                });

                AlertDialog dialog = builder.create();
                // Display the alert dialog on interface
                dialog.show();
            }
        });

    }

    public void saveAddUser(View view){

    }

    protected void spinUserName(){
        spinnerUserType = (Spinner) rootView.findViewById(R.id.spinnerUserType);
        ArrayAdapter<String> usersAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item,listType);

        usersAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerUserType.setAdapter(usersAdapter);
        //spinnerService.setOnItemSelectedListener(select);

    }


}
