package com.example.arisara.mytraffic;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MyTraffic extends AppCompatActivity {
    //explicit การประกาศตัวแปร
    private ListView TrafficListView;
    private Button AboutMeButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_traffic);

        //Bind Widget
        bindWidget();

        //button controller
        buttonController();

        //listVIewController
        listViewController();


    }//Main Method กลุ่มของคำสั่ง จบด้วย ;

    private void listViewController() {

        //#1
        final int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};

        //#2
        final String[] strTitle = new String[20];
        strTitle[0] = "หัวข้อที่ 1";
        strTitle[1] = "หัวข้อที่ 2";
        strTitle[2] = "หัวข้อที่ 3";
        strTitle[3] = "หัวข้อที่ 4";
        strTitle[4] = "หัวข้อที่ 5";
        strTitle[5] = "หัวข้อที่ 6";
        strTitle[6] = "หัวข้อที่ 7";
        strTitle[7] = "หัวข้อที่ 8";
        strTitle[8] = "หัวข้อที่ 9";
        strTitle[9] = "หัวข้อที่ 10";
        strTitle[10] = "หัวข้อที่ 11";
        strTitle[11] = "หัวข้อที่ 12";
        strTitle[12] = "หัวข้อที่ 13";
        strTitle[13] = "หัวข้อที่ 14";
        strTitle[14] = "หัวข้อที่ 15";
        strTitle[15] = "หัวข้อที่ 16";
        strTitle[16] = "หัวข้อที่ 17";
        strTitle[17] = "หัวข้อที่ 18";
        strTitle[18] = "หัวข้อที่ 19";
        strTitle[19] = "หัวข้อที่ 20";

        //#3
        String[] strDetail = getResources().getStringArray(R.array.detail_shot);


        //call MyAdapter
        MyAdapter objMyAdapter = new MyAdapter(MyTraffic.this, strTitle ,strDetail, intIcon);
        TrafficListView.setAdapter(objMyAdapter);

        //active when cilck on listview
        TrafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Intent to DetailActivity
                Intent objIntent = new Intent(MyTraffic.this, DetailActivity.class);


                //putExtra
                objIntent.putExtra("Title", strTitle[i]);
                objIntent.putExtra("Image", intIcon[i]);
                objIntent.putExtra("Index", i);

                startActivity(objIntent);


            } // event
        });





    }// listViewController


    private void buttonController() {
        AboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // sound effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),
                        R.raw.lion);
                buttonMediaPlayer.start();
                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/dWInNGhwidQ"));
                startActivity(objIntent);
            }// event
        });
    }// buttonController

    private void bindWidget() {
        TrafficListView = (ListView) findViewById(R.id.listView);
        AboutMeButton = (Button) findViewById(R.id.button);
    }


}//Main Class
