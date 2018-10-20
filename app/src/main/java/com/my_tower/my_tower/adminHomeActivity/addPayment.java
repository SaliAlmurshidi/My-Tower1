package com.my_tower.my_tower.adminHomeActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toolbar;

import com.my_tower.my_tower.R;

public class addPayment extends AppCompatActivity {
    String adminID;
    EditText moneyAdd;
    private Spinner spinnerService, spinnerAccount , spinnerUserName;
    private static final String[]listService = {"ايجار", "بنزين", "نظافة"};
    private static final String[]listAccount = {"شيكل", "دينار", "دولار"};
    private static final String[]listUsers = {"أحمد", "محمود", "محمد"};
    String selectService , selectAccount , selectUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payment);

//        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        mToolbar.setTitle(getString(R.string.addPayment));
//        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);

        adminID = getIntent().getStringExtra("ID");
        moneyAdd = (EditText) findViewById(R.id.moneyAdd);

        spinService();
        spinAccount();
        spinUserName();

        spinnerService.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                selectService = spinnerService.getSelectedItem().toString();
                //slectItem.setText(item);
                Log.e("value select service", selectService);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerAccount.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                selectAccount = spinnerAccount.getSelectedItem().toString();
                //slectItem.setText(item);
                Log.e("value select Account", selectAccount);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerUserName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                selectUser = spinnerUserName.getSelectedItem().toString();
                //slectItem.setText(item);
                Log.e("value select user name", selectUser);
            }

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    protected void spinService (){
        spinnerService = (Spinner) findViewById(R.id.spinnerService);
        ArrayAdapter<String> serviceAdapter = new ArrayAdapter<String>(addPayment.this,
                android.R.layout.simple_spinner_item,listService);

        serviceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerService.setAdapter(serviceAdapter);
        //spinnerService.setOnItemSelectedListener(select);

//        Toast.makeText(addPayment.this,
//                "OnClickListener : " +
//                        "\nSpinner 1 : "+ String.valueOf(spinnerService.getSelectedItem()),
//                Toast.LENGTH_SHORT).show();
    }

    protected void spinAccount (){
        spinnerAccount = (Spinner) findViewById(R.id.spinnerAccount);
        ArrayAdapter<String> accountAdapter = new ArrayAdapter<String>(addPayment.this,
                android.R.layout.simple_spinner_item,listAccount);

        accountAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAccount.setAdapter(accountAdapter);
        //spinnerService.setOnItemSelectedListener(select);

    }

    protected void spinUserName(){
        spinnerUserName = (Spinner) findViewById(R.id.spinnerUsers);
        ArrayAdapter<String> usersAdapter = new ArrayAdapter<String>(addPayment.this,
                android.R.layout.simple_spinner_item,listUsers);

        usersAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerUserName.setAdapter(usersAdapter);
        //spinnerService.setOnItemSelectedListener(select);
    }

    public void doneAddPayment(View view) {

    }


}
