package com.example.redoan.harmonyfinal;

import android.app.Activity;
import android.app.ListActivity;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SongList extends Activity {
    private static  final String path = new String("/sdcard/");
    private List<String> song = new ArrayList<String>();
    private MediaPlayer mp = new MediaPlayer();
    protected String sample[] = {"ABC", "DEF", "IJK"};
    protected static String selected = "No File Selected";
    private ListView Li;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        Li = (ListView) findViewById(R.id.list);
        updatePlayList();
    }

    protected void onListItemClick(ListView list, View view, int position, long id){
        selected = sample[position];
        Intent i = new Intent(this, PlaySong.class);
        startActivity(i);
    }
    private void updatePlayList(){
        /*File home = new File(path);
        if(home.listFiles(new Mp3Filter()).length>0){
            for(File file: home.listFiles(new Mp3Filter())){
                song.add(file.getName());
            }

            ListAdapter songList = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, song);
            Li.setAdapter(songList);
        }*/
        ListAdapter songList = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sample);
        Li.setAdapter(songList);
    }

    public void onClick(View view){
        Intent i = new Intent(this, PlaySong.class);
        startActivity(i);
    }
}
