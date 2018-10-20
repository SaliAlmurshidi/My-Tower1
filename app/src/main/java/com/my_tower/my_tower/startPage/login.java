package com.my_tower.my_tower.startPage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.my_tower.my_tower.R;
import com.my_tower.my_tower.home.adminHome;
import com.my_tower.my_tower.home.userHome;

public class login extends AppCompatActivity {
     TextInputLayout userNumLayout , userPasswordLayout;
    EditText userNum , userPassword;
    String userPasswordTran ="", userNumTran ="" ;
    CoordinatorLayout coordinatorSnackLogin;

    @Override //  onCreate method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    // method to chick password from DataBase
    public void chickPassword(String number ,String password){

        String type;
        String userName;
        int ID;
        String typeNmae ="";

        if (typeNmae.isEmpty()){
           //yourInfoError();
            userNumLayout.setError(getResources().getString(R.string.forgetInterUserNum));


        }else {
            // return moveTo(type,userName);

        }

    }

    // internet snack
    public void snackInternet(){
        coordinatorSnackLogin = (CoordinatorLayout) findViewById(R.id.coordinatorSnackLogin);
        userNumLayout.setErrorEnabled(false);
        userPasswordLayout.setErrorEnabled(false);
        snackShow();
    }
    //  internet connection
    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

    // to show the snack bar massage
    public void snackShow(){
        Snackbar snackbar = Snackbar
                .make(coordinatorSnackLogin, "", Snackbar.LENGTH_LONG)
                .setAction(R.string.chickInternet, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(coordinatorSnackLogin, "Message is restored!", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });

        snackbar.show();
    }

    // to show the snack bar massage if there is erorr in type
    public void snackShowType(){
        Snackbar snackbar = Snackbar
                .make(coordinatorSnackLogin, "", Snackbar.LENGTH_LONG)
                .setAction(R.string.chickDB, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(coordinatorSnackLogin, "Message is restored!", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });

        snackbar.show();
    }

    // method run when click on button
    public void login(View view) {
        String testField = "false";
        String testInternet = "false";

        userPasswordLayout =  (TextInputLayout) findViewById(R.id.userPasswordLayout);
        userNumLayout =  (TextInputLayout) findViewById(R.id.userNumLayout);
        userNum =  (EditText) findViewById(R.id.userNum);
        userPassword =  (EditText) findViewById(R.id.userPassword);

        // casting user password and user number to String
        userPasswordTran = userPasswordLayout.getEditText().getText().toString();
        userNumTran = userNumLayout.getEditText().getText().toString();

        hideKeyboard();
        // call method forgetYourInfo to show the alertDialog
        if(userNumTran.isEmpty() || userPasswordTran.isEmpty()){
            userNumLayout.setError(getResources().getString(R.string.forgetInterUserNum));
            userPasswordLayout.setError(getResources().getString(R.string.forgetInterUserPassword));
            userNumLayout.setErrorEnabled(false);
        }else if (userNumTran.length() != 10){
            userPasswordLayout.setError(getResources().getString(R.string.forgetInterUserPassword));
            userNumLayout.setErrorEnabled(false);
        }else{
            userNumLayout.setErrorEnabled(false);
            userPasswordLayout.setErrorEnabled(false);
            testField = "true";
            doLogin();
        }

        // to check the internt connection
        Boolean internet = isNetworkConnected();
//        if(internet== true){
//            testInternet = "true";
//        }else{
//            snackInternet();
//        }
        // chick the user number and password is full
        if (testField == "true" && testInternet == "true"){
             //send userNumTran, userPasswordTran to chickPassword method
            //chickPassword(userNumTran , userPasswordTran);
        }
        moveTo("N","أحمد ",1234567891);
    }

    // method to show that the operation run
    public void doLogin() {
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.chickInfo), Toast.LENGTH_SHORT).show();
        // TODO: login procedure; not within the scope of this tutorial.
    }

    // method to hide keyboard after click on button
    private void hideKeyboard() {
        View view = getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    // This method to move to  user home
    public void moveTo (String type,String userName, int ID ){


//        if(type == "U"){
//            Intent i = new Intent(login.this , userHome.class);
//            i.putExtra("ID",ID);
//            i.putExtra("userName",userName);
//            login.this.startActivity(i);
//            finish();
//        }else if(type == "A"){
//            Intent i = new Intent(login.this , userHome.class);
//            i.putExtra("ID",ID);
//            i.putExtra("userName",userName);
//            login.this.startActivity(i);
//            finish();
//        }else{
//            snackShowType();
//        }

        //Intent i = new Intent(login.this , userHome.class);

        Intent i = new Intent(login.this , userHome.class);

        i.putExtra("ID",ID);
        i.putExtra("userName",userName);
        login.this.startActivity(i);
        finish();
        Log.e("value", userName);

//        Toast.makeText(login.this, "This is my Toast message!"+ID+userName,
//                Toast.LENGTH_LONG).show();
    }



}
