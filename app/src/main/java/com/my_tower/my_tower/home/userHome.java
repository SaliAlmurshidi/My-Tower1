package com.my_tower.my_tower.home;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.my_tower.my_tower.R;
import com.my_tower.my_tower.tabsAdminUser.userTabsAdapter;
import com.my_tower.my_tower.tabsUserHome.fragmentAccount;
import com.my_tower.my_tower.tabsUserHome.fragmentPay;
import com.my_tower.my_tower.tabsUserHome.fragmentService;

public class userHome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabsText);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viwerpagerUser);

        userTabsAdapter userTabsAdapter = new userTabsAdapter(getSupportFragmentManager());
        viewPager.setAdapter(userTabsAdapter);
        tabLayout.setupWithViewPager(viewPager);

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
      //  Fragment fragment;
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        int id = item.getItemId();
        Fragment fragment = null;
        Class fragmentClass = null;
        Bundle args = new Bundle();


        if (id == R.id.nav_account) {
            fragment = new fragmentAccount();
            transaction.replace(R.id.fragmentAccountLayout, fragment);
            // Handle the camera action
//            fragmentAccount account = new fragmentAccount();
//            Fragment fragment = new YourFragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction transaction = fm.beginTransaction();
//            transaction.replace(R.id.fragmentAccountLayout, account);
//            transaction.commit();
          //  fragment = new fragmentAccount();
           // fragmentClass =fragmentAccount.class;

        } else if (id == R.id.nav_payment) {
            //fragmentClass =fragmentPay.class;
            fragment = new fragmentPay();
            transaction.replace(R.id.fragmentPayLayout, fragment);
//            fragmentPay pay = new fragmentPay();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction transaction = fm.beginTransaction();
//            transaction.replace(R.id.fragmentPayLayout, pay);
//            transaction.commit();
            //fragment = new fragmentPay();


        } else if (id == R.id.nav_service) {
           // fragmentClass =fragmentService.class;
 //           fragmentService service = new fragmentService();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction transaction = fm.beginTransaction();
//            transaction.replace(R.id.fragmentServiceLayout, service);
//            transaction.commit();7
            fragment = new fragmentService();
            transaction.replace(R.id.fragmentServiceLayout, fragment);

        } else if (id == R.id.nav_logout) {
            //fragmentClass =fragmentAccount.class;


        }


       // transaction.replace(R.id.viwerpagerUser, fragment);
        transaction.addToBackStack(null);
        transaction.commit();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
