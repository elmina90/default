package com.photonapps.yesorno.tabfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.photonapps.yesorno.R;
import com.photonapps.yesorno.tabsadapter.DummyAdapter;

public class DummyFragment extends Fragment {

    DummyAdapter adapter;
    RecyclerView rvDummy;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new DummyAdapter(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab_dummy, container, false);
        rvDummy = (RecyclerView)v.findViewById(R.id.rvDummy);
        rvDummy.setAdapter(adapter);
        rvDummy.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
    }

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static DummyFragment newInstance(int sectionNumber) {
        DummyFragment fragment = new DummyFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public DummyFragment() {
    }

}
