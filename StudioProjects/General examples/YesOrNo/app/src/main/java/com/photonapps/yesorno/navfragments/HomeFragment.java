package com.photonapps.yesorno.navfragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.photonapps.yesorno.R;
import com.photonapps.yesorno.constants.K;
import com.photonapps.yesorno.navdrawer.SlidingTabLayout;
import com.photonapps.yesorno.tabfragments.DummyFragment;

public class HomeFragment extends Fragment {

    SlidingTabLayout tabLayout;

    ViewPager mViewPager;
    SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        mViewPager = (ViewPager) v.findViewById(R.id.pagerCities);
        mSectionsPagerAdapter = new SectionsPagerAdapter(
                getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);
        tabLayout = (SlidingTabLayout) v.findViewById(R.id.tabanim_tabs);
        tabLayout.setViewPager(mViewPager);

        return v;
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return DummyFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            return K.tabs.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return K.tabs[position];
        }

    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
