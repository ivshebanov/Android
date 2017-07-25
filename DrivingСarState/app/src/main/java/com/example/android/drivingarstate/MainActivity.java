package com.example.android.drivingarstate;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Car car;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.car = new Car();
        init();
    }

    public void getGasoline(View view) {
        list.add(String.valueOf(this.car.getGasoline()));
        setAdapt();
    }

    public void getIStateCar(View view) {
        String str = this.car.getIStateCar().getClass().getName();
        list.add(str.substring(str.lastIndexOf(".") + 1, str.length()));
        setAdapt();
    }

    public void fullTank(View view) {
        list.add(this.car.fullTank());
        setAdapt();
    }

    public void turnKey(View view) {
        list.add(this.car.turnKey());
        setAdapt();
    }

    public void driver(View view) {
        list.add(this.car.driver());
        setAdapt();
    }

    public void stop(View view) {
        list.add(this.car.stop());
        setAdapt();
    }

    private void init() {
        this.listView = (ListView) findViewById(R.id.itog_text_view);
        listView.smoothScrollToPosition(list.size());
        this.adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
    }

    private void setAdapt() {
        Parcelable state = listView.onSaveInstanceState();
        listView.setAdapter(adapter);
        listView.onRestoreInstanceState(state);
        listView.smoothScrollToPosition(list.size());
    }
}
