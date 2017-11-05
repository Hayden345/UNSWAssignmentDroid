package com.example.dylan.taxtimewithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class addExpense extends AppCompatActivity {

    String expenseType = "Business";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);
    }

    public void mainMenuActivity (View v){
        startActivity(new Intent(addExpense.this, MainActivity.class));
    }
    public void clickFunction(View view) {

        EditText newDriverExpense = (EditText) findViewById(R.id.expenseDriver);

        EditText newExpenseVehicle = (EditText) findViewById(R.id.expenseVehicle);

        EditText newExpenseType = (EditText) findViewById(R.id.expenseType);

        EditText newExpenseCost = (EditText) findViewById(R.id.expenseCost);

        Switch bSwitch = (Switch) findViewById(R.id.expenseSwitch);

        bSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    expenseType = "Business";
                else expenseType = "Personal";
            }
        });
    }
