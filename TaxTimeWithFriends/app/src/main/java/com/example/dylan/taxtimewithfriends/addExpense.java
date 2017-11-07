package com.example.dylan.taxtimewithfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
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

        Spinner newExpenseLog = (Spinner) findViewById(R.id.expenseLog);

        EditText newExpenseType = (EditText) findViewById(R.id.expenseType);

        EditText newExpenseCost = (EditText) findViewById(R.id.expenseCost);

        Switch bSwitch = (Switch) findViewById(R.id.expenseSwitch);

        DatePicker newExpenseDate = (DatePicker) findViewById(R.id.expenseDate);

        //TODO: Add date spinner
        //TODO: Save photo and get file path
        //TODO: Add code for date, photo, and logbook

        bSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    business = true;
                else business = false;
            }
        });
        /**
        //TODO: newExpenseDate.getMonth(), newExpenseDate.getYear()  -- Requires modification to SQL statement for month and year
        Expense expense = new Expense(parent.getDb().getExpensesCount()+1, newExpenseDate.getMonth(), newExpenseDate.getYear(), Double.parseDouble(newExpenseCost.getText().toString()), newExpenseType.getText().toString(), business, photoFilePath, logBookRowID);
        parent.getDb().addExpense(expense);
         **/
    }
}
