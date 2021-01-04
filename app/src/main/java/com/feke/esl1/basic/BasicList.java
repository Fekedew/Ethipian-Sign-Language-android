package com.feke.esl1.basic;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.feke.esl1.MainFragment;
import com.feke.esl1.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class BasicList extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_tab);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Learn");
        if (!getIntent().getStringExtra("type").equals("all")) {
            arrayList.add("Exercise");
        }
        this.tabLayout.setupWithViewPager(this.viewPager);
        setUpViewPager(viewPager, arrayList);
    }

    private void setUpViewPager(ViewPager viewPager2, ArrayList<String> arrayList) {
        MainAdapter pageAdapter = new MainAdapter(getSupportFragmentManager());

        MainFragment fragment = new MainFragment();


        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = new Bundle();
            bundle.putString("type", arrayList.get(i));
            bundle.putString("folder", getIntent().getStringExtra("type"));
            fragment.setArguments(bundle);
            pageAdapter.addFragment(fragment, arrayList.get(i));
            fragment = new MainFragment();
        }
        viewPager2.setAdapter(pageAdapter);

    }


    /* access modifiers changed from: private */
    public class MainAdapter extends FragmentPagerAdapter {
        ArrayList<String> arrayList = new ArrayList<>();
        List<Fragment> fragmentList = new ArrayList();

        public MainAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment, String title) {
            this.arrayList.add(title);
            this.fragmentList.add(fragment);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int position) {
            return this.fragmentList.get(position);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.fragmentList.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int position) {
            return this.arrayList.get(position);
        }
    }
}


