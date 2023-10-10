package com.example.dualcustomlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyCustomAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] name, dates;
    Integer[] images;

    public MyCustomAdapter(Activity context, String[] name, String[] dates, Integer[] images) {
        super(context, R.layout.mycustomitem,dates);
        this.context = context;
        this.name = name;
        this.dates = dates;
        this.images = images;
    }


    @Override
    public int getCount() {
        return name.length;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.mycustomitem,null,true);

        CircleImageView imageView = rowView.findViewById(R.id.image);
        TextView moviename = rowView.findViewById(R.id.name);
        TextView moviedate = rowView.findViewById(R.id.date);

        imageView.setImageResource(images[position]);
        moviename.setText(name[position]);
        moviedate.setText(dates[position]);

        return rowView;
    }
}
