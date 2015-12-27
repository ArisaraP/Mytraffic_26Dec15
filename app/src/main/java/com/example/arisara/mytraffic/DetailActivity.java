package com.example.arisara.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detaiTextView;
    private ImageView trafficImageView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //initial widget
        initilaWidget();

        //show view
        showView();

    }//main mathod

    public void clickBack(View view){
        finish();

    }



    private void showView() {

        //receive value from intent
        String strTitle = getIntent().getStringExtra("Title");
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index", 0);

        //show title
        titleTextView.setText(strTitle);

        //show image
        trafficImageView.setImageResource(intImage);

        //show detail
        String[] detailStrings = getResources(). getStringArray(R.array.detail_long);
        detaiTextView.setText(detailStrings[intIndex]);



    }//show view

    private void initilaWidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detaiTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);
    }
} //Main class
