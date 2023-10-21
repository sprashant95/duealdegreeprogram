package com.example.dualfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class TollyFragment extends Fragment {

    public TollyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ListView listView;

        String[] name = {"Adipurush","Bambai, An Untold Story","1920 Evil Returns",
                "Jailer","Jaane Jaan","Rocky Ki Rani", "Guns and Gulaabs"};

        Integer[] posters = {R.drawable.adipurush,R.drawable.bambai,R.drawable.devil1920,R.drawable.jailer,
                R.drawable.janejaan,R.drawable.rockyandrani, R.drawable.gunsandgulabs};


        View view =  inflater.inflate(R.layout.fragment_tolly, container, false);
        listView = view.findViewById(R.id.list);

        MyTollyWoodAdapter myTollyWoodAdapter = new MyTollyWoodAdapter(getActivity(),name,posters);
        listView.setAdapter(myTollyWoodAdapter);

        return view;
    }

}