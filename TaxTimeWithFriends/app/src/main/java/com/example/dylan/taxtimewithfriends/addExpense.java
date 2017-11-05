package com.example.dylan.taxtimewithfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.example.dylan.taxtimewithfriends.Objects.Expense;

public class addExpense extends AppCompatActivity {

    private boolean business = true;
    private MainActivity parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);
        parent = (MainActivity)getParent();
    }

    public void mainMenuActivity (View v){
        startActivity(new Intent(addExpense.this, MainActivity.class));
        Toast.makeText(this, "New Expense Added", Toast.LENGTH_SHORT).show();
    }

    public void clickFunction(View view) {

        //TODO: Replace Driver and Vehicle spinners with a LogBook Spinner

        Spinner newDriverExpense = (Spinner) findViewById(R.id.expenseDriver);

        Spinner newExpenseVehicle = (Spinner) findViewById(R.id.expenseVehicle);

        EditText newExpenseType = (EditText) findViewById(R.id.expenseType);

        EditText newExpenseCost = (EditText) findViewById(R.id.expenseCost);

        Switch bSwitch = (Switch) findViewById(R.id.expenseSwitch);

        //TODO: Add date spinner
        //TODO: Save photo and get file path

        bSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    business = true;
                else business = false;
            }
        });

        Expense expense = new Expense(parent.getDb().getExpensesCount()+1, newExpenseDate.getDate, Double.parseDouble(newExpenseCost.getText().toString()),
                newExpenseType.getText().toString(), business, photoFilePath, logBookRowID); //TODO: Add code for date, photo, and logbook
        parent.getDb().addExpense(expense);
    }
}
