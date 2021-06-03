package com.example.vest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;

public class MainActivity extends AppCompatActivity {
//
//    PlayerView playerView;
//    SimpleExoPlayer player;
//    Button button;
//    String videoUrl ="https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4";
//    private boolean playWhenReady=true;
//    private int currentWindow=0;
//    private long playPackPosition=0;
    String url="";
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =findViewById(R.id.video1);
        button2 =findViewById(R.id.video2);
        button3 =findViewById(R.id.video3);
        button4 =findViewById(R.id.video4);

button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String videoURL="https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4";
        Intent i = new Intent(MainActivity.this, video.class);
        i.putExtra("URL",videoURL);
        startActivity(i);
    }
});
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoURL="https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4";

                Intent i = new Intent(MainActivity.this, video.class);
                i.putExtra("URL",videoURL);

                startActivity(i);
                                           }
                                       });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoURL="https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4";

                Intent i = new Intent(MainActivity.this, video.class);
                i.putExtra("URL",videoURL);

                startActivity(i);
                                           }
                                       });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoURL="https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4";
                Intent i = new Intent(MainActivity.this, video.class);
                i.putExtra("URL",videoURL);
                startActivity(i);
                                           }
                                       });
                                   }}
