package com.my_tower.my_tower.adminHomeActivity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.my_tower.my_tower.R;
import com.my_tower.my_tower.tabsAdminGroups.fragmentAdminAddGroup;
import com.my_tower.my_tower.tabsAdminGroups.fragmentAdminListGroup;
import com.my_tower.my_tower.tabsAdminUser.fragmentAdminAddUser;
import com.my_tower.my_tower.tabsAdminUser.fragmentAdminListUsers;

import java.util.ArrayList;
import java.util.List;

public class admin_groups extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout tabLayout;
    private Toolbar toolbar;

//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_admin_users, menu);
//        return true;
//    }

//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_groups);

        toolbar = (Toolbar) findViewById(R.id.toolbarGroups);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.containerGroup);
        setupViewPager(mViewPager);
        mViewPager.setCurrentItem(2);

        tabLayout = (TabLayout) findViewById(R.id.tabsGroup);
        tabLayout.setupWithViewPager(mViewPager);
        mViewPager.setCurrentItem(1);
    }

    private void setupViewPager(ViewPager viewPager) {
        admin_groups.ViewPagerAdapter adapter = new admin_groups.ViewPagerAdapter(getSupportFragmentManager());
        String addGroup = getResources().getString(R.string.addGroup);
        String groupList = getResources().getString(R.string.groupList);
        adapter.addFrag(new fragmentAdminAddGroup(), addGroup);
        adapter.addFrag(new fragmentAdminListGroup(), groupList);
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }



        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
