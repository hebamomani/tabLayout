package com.example.tablayout;

import androidx.fragment.app.Fragment;

public class MyTab {
    String tabname;
    Fragment fragment;

    public MyTab(String tabname ,Fragment fragment) {
        this.tabname = tabname;
        this.fragment=fragment;
    }

    public Fragment getFragment() {

        return fragment;
    }

    public void setFragment(Fragment fragment) {

        this.fragment = fragment;
    }

    public String getTabname() {

        return tabname;
    }

    public void setTabname(String tabname) {

        this.tabname = tabname;
    }
}
