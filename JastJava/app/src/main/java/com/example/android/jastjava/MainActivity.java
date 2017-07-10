package com.example.android.jastjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private int numberOfCoffees = 0;
    private final int priceCoffees = 120;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        displayPrice(numberOfCoffees * priceCoffees);
    }

    public void decrement(View view) {
        if (numberOfCoffees > 0) numberOfCoffees--;
        display(numberOfCoffees);
    }

    public void increment(View view) {
        numberOfCoffees++;
        display(numberOfCoffees);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Стоимость заказа: " + NumberFormat.getCurrencyInstance().format(number) + "\nСпасибо за покупаку!");
    }
}
