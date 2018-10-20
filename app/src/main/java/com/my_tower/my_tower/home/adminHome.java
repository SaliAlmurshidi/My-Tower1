package com.my_tower.my_tower.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.my_tower.my_tower.R;
import com.my_tower.my_tower.adminHomeActivity.addPayment;
import com.my_tower.my_tower.adminHomeActivity.admin_service;
import com.my_tower.my_tower.adminHomeActivity.admin_users;

public class adminHome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    String admin_name;
    String adminID;
    TextView adminName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        admin_name = getIntent().getStringExtra("userName");
        adminID = getIntent().getStringExtra("ID");
        //sharedPreferences();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        adminName = (TextView) findViewById(R.id.adminName);
        adminName.setText(admin_name);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_admain_addGrouops) {
            // Handle the camera action
        } else if (id == R.id.nav_admain_addService) {

        } else if (id == R.id.nav_admain_addUser) {

        } else if (id == R.id.nav_admain_groups) {

        } else if (id == R.id.nav_admain_user) {

        } else if (id == R.id.nav_admain_service) {

        }else if (id == R.id.nav_admain_logout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void buttonAddpayment(View view) {
        Intent i = new Intent(adminHome.this , addPayment.class);
        i.putExtra("ID",adminID);
        //i.putExtra("userName",userName);
        adminHome.this.startActivity(i);
    }

    public void buttonUsers(View view) {
        Intent i = new Intent(adminHome.this , admin_users.class);
        i.putExtra("ID",adminID);
        //i.putExtra("userName",userName);
        adminHome.this.startActivity(i);
    }

    public void buttonService(View view) {
        Intent i = new Intent(adminHome.this , admin_service.class);
        i.putExtra("ID",adminID);
        //i.putExtra("userName",userName);
        adminHome.this.startActivity(i);
    }

    public void buttonGroups(View view) {
        Intent i = new Intent(adminHome.this , adminHome.class);
        i.putExtra("ID",adminID);
        //i.putExtra("userName",userName);
        adminHome.this.startActivity(i);
    }

//    private void sharedPreferences(){
//        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
//        //editor.putString("name", user_name);
//        editor.putString("idUser", adminID);
//        //editor.putInt("idUser", ID);
//        editor.apply();
//    }
}
