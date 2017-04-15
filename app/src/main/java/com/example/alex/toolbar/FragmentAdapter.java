package com.example.alex.toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Alex on 2017/4/14.
 * <pre>
 *     author  ： Alex
 *     e-mail  ： 18238818283@sina.cn
 *     time    ： 2017/04/14
 *     desc    ：
 *     version ： 1.0
 */
public class FragmentAdapter  extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments ;

    public FragmentAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size() != 0 ? fragments.size() : 0;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return Content.string[position];
    }
}
