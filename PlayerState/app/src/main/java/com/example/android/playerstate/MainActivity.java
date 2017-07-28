package com.example.android.playerstate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Player player;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.init();
    }

    public void onStop(View view) {
        this.textView.setText(player.getState().onLock());
    }

    public void onPlay(View view) {
        this.textView.setText(player.getState().onPlay());
    }


    public void onNext(View view) {
        this.textView.setText(player.getState().onNext());
    }

    public void onPrevious(View view) {
        this.textView.setText(player.getState().onPrevious());
    }

    private void init() {
        this.player = new Player();
        this.textView = (TextView) findViewById(R.id.text_view_res);
    }
}
