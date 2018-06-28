package com.example.redoan.harmonyfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlaySong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        TextView select = (TextView) findViewById(R.id.selectedfile);
        select.setText(new SongList().selected);
    }
}
