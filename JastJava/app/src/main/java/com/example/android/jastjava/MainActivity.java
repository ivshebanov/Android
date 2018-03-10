package com.example.android.jastjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private int numberOfCoffees = 1;
    private int priceCoffees = 120;
    private boolean whippedCream = false;
    private boolean chocolate = false;
    private int itoPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        itoPrice = numberOfCoffees * priceCoffees;

        if (whippedCream) {
            itoPrice = itoPrice + numberOfCoffees * 15;
        }

        if (chocolate) {
            itoPrice = itoPrice + numberOfCoffees * 20;
        }

        EditText editText = (EditText) findViewById(R.id.editText1);
        String nameClient = editText.getText().toString();

//        displayPrice(nameClient);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");

        intent.putExtra(android.content.Intent.EXTRA_EMAIL,
                new String[]{"klacuk070@mail.ru"});
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.ORDER));
        intent.putExtra(Intent.EXTRA_TEXT, "Мое имя: " + nameClient +
                "\nМне " + numberOfCoffees + " кофе" +
                "\n" + getString(R.string.WHIPPED_CREAM) + ": " + whippedCream +
                "\n"+ getString(R.string.CHOCOLATE) + ": " + chocolate +
                "\nСтоимость заказа: " + NumberFormat.getCurrencyInstance().format(itoPrice) +
                "\nСпасибо за кофе!");

        try {
            startActivity(Intent.createChooser(intent, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
//
//        if (intent.resolveActivity(getPackageManager()) != null){
//            startActivity(intent);
//        }
    }

    public void onCheckboxClickedWhippedCreamId(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.whipped_cream_id);
        this.whippedCream = checkBox.isChecked();
    }

    public void onCheckboxClickedChocolateId(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.chocolate_id);
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

//    private void displayPrice(String name) {
//        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
//        priceTextView.setText("Добро пожаловать " + name +
//                "\nКолличество кофе: " + numberOfCoffees +
//                "\nВзбитые сливки: " + whippedCream +
//                "\nШоколадный топинг: " + chocolate +
//                "\nСтоимость заказа: " + NumberFormat.getCurrencyInstance().format(itoPrice) +
//                "\nСпасибо за покупаку!");
//    }
}
