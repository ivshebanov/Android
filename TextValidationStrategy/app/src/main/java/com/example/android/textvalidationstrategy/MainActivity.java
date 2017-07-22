package com.example.android.textvalidationstrategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.textvalidationstrategy.implementationsForStringValidation.CheckNumber;
import com.example.android.textvalidationstrategy.implementationsForStringValidation.CheckStringLowerCase;
import com.example.android.textvalidationstrategy.implementationsForStringValidation.CheckStringUpperCase;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private boolean stringLowerCase;
    private boolean stringUpperCase;
    private boolean number;
    private EditText editText = (EditText) findViewById(R.id.editText1);
    private TextView priceTextView = (TextView) findViewById(R.id.executionResultView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = new Context(new CheckNumber());
    }

    public void onCheckboxNamber(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.namber);
        this.number = checkBox.isChecked();
    }

    public void onCheckboxStringLowerCase(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.stringLowerCase);
        this.stringLowerCase = checkBox.isChecked();
    }

    public void onCheckboxStringUpperCase(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.stringUpperCase);
        this.stringUpperCase = checkBox.isChecked();
    }

    public void checkString(View view) {
        if (number) {
            context.setICheckString(new CheckNumber());
        } else if (stringUpperCase) {
            context.setICheckString(new CheckStringUpperCase());
        } else if (stringLowerCase) {
            context.setICheckString(new CheckStringLowerCase());
        }

        String result = context.ExecuteOperation(editText.getText().toString());
        priceTextView.setText(result);
    }
}
