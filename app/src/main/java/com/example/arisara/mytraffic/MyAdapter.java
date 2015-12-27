package com.example.arisara.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Arisara on 12/27/2015.
 */
public class MyAdapter extends BaseAdapter{
    //Explicit
    private Context objContext;
    private String[] titleStrings, detaiStrings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] titleStrings, String[] detaiStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.detaiStrings = detaiStrings;
        this.iconInts = iconInts;
    }//Constructor


    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);
        // for textview
        TextView titleTextView = (TextView) objView1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        TextView detaiTextView = (TextView)objView1.findViewById(R.id.textView3);
        detaiTextView.setText(detaiStrings[i]);

        // for icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);
        return objView1;
    }
} // main class
