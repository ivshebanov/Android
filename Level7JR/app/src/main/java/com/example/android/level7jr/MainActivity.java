package com.example.android.level7jr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int countMedBookYes = 0;
    private int countMedBookNo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bookYes(View view) {
        countMedBookYes++;
    }

    public void bookSometime(View view) {
        display1();
    }

    public void bookNo(View view) {
        countMedBookNo--;
    }

    public void checkCountBook(View view) {
        display(countMedBookYes + "", countMedBookNo + "");
    }

    private void display(String count, String count1) {
        TextView textView = (TextView) findViewById(R.id.countBookViewYes);
        textView.setText(count);
        TextView textView1 = (TextView) findViewById(R.id.countBookViewNo);
        textView1.setText(count1);
    }

    private void display1() {
        TextView textView = (TextView) findViewById(R.id.countBookViewYes);
        textView.setText("Я");
        TextView textView1 = (TextView) findViewById(R.id.countBookViewNo);
        textView1.setText("лох");
    }
}
