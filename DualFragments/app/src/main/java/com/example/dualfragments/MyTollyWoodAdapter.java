package com.example.dualfragments;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyTollyWoodAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] name;
    Integer[] image;

    public MyTollyWoodAdapter(Activity context, String[] name, Integer[] image) {
        super(context, R.layout.mycustomitem,name);
        this.context = context;
        this.name = name;
        this.image = image;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.mycustomitem,null,true);

        CircleImageView circleImageView = view.findViewById(R.id.image);
        TextView textView = view.findViewById(R.id.name);

        circleImageView.setImageResource(image[position]);
        textView.setText(name[position]);

        return view;
    }
}
