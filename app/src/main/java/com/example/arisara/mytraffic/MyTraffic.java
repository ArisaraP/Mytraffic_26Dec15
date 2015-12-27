package com.example.arisara.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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



    }//Main Method กลุ่มของคำสั่ง จบด้วย ;

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
