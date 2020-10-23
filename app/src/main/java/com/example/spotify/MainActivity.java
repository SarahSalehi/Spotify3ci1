package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView coverImage;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coverImage = findViewById(R.id.Ivcapa);
        Glide.with(this).load("https://img.youtube.com/vi/fHI8X4OXluQ/0.jpg").into(coverImage);
        player= MediaPlayer.create(getApplicationContext(), R.raw.calloutmyname);
    }

    protected void onResume(){
        super.onResume();
    }

    public void play(View view) {
        player.start();
    }
}