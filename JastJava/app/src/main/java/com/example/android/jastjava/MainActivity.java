package com.example.android.jastjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private int numberOfCoffees = 1;
    private int priceCoffees = 120;
    private boolean whippedCream = false;
    private boolean chocolate = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        int itoPrice = numberOfCoffees * priceCoffees;

        if (whippedCream) {
            itoPrice = itoPrice + numberOfCoffees * 15;
        }

        Log.v("WeatherActivity", "Thank you for using the WhetherWeather App.");
        if (whippedCream) {
            Log.v("WeatherActivity", "It's raining, better bring an umbrella.");
        } else {
            Log.v("WeatherActivity", "It's unlikely to rain.");
        }

        if (chocolate) {
            itoPrice = itoPrice + numberOfCoffees * 20;
        }

        EditText editText = (EditText) findViewById(R.id.editText1);
        String nameClient = editText.getText().toString();

        displayPrice(itoPrice, nameClient);
    }

    public void onCheckboxClickedWhippedCreamId(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.WHIPPED_CREAM_ID);
        this.whippedCream = checkBox.isChecked();
    }

    public void onCheckboxClickedChocolateId(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.Chocolate_ID);
        this.chocolate = checkBox.isChecked();
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

    private void displayPrice(int number, String name) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Добро пожаловать " + name +
                "\nКолличество кофе: " + numberOfCoffees +
                "\nВзбитые сливки: " + whippedCream +
                "\nШоколадный топинг: " + chocolate +
                "\nСтоимость заказа: " + NumberFormat.getCurrencyInstance().format(number) +
                "\nСпасибо за покупаку!");
    }
}
