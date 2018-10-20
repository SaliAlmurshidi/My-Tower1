package com.my_tower.my_tower.tabsAdminUser;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.my_tower.my_tower.tabsUserHome.fragmentAccount;
import com.my_tower.my_tower.tabsUserHome.fragmentPay;
import com.my_tower.my_tower.tabsUserHome.fragmentService;

public class userTabsAdapter extends FragmentStatePagerAdapter {



    String[] tapsArray = new String[] {"رصيد","اعلام الخدمات","الدفعات"};
    Integer tabsNumber = 3;

    public userTabsAdapter(FragmentManager fm) {
        super(fm);
    }

    public CharSequence getPageTitle (int position){

        return tapsArray[position];
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                fragmentAccount account = new fragmentAccount();
                return account;
            case 1:
                fragmentPay pay = new fragmentPay();
                return pay;
            case 2:
                fragmentService service = new fragmentService();
                return service;

        }
        return null;
    }

    @Override
    public int getCount() {
        return tabsNumber;
    }
}
