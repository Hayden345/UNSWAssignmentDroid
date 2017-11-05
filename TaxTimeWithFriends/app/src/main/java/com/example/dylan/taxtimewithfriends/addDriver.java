package com.example.dylan.taxtimewithfriends;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dylan.taxtimewithfriends.Objects.Driver;

public class addDriver extends AppCompatActivity {

    MainActivity parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_driver);
        parent = (MainActivity)getParent();
    }

    public void mainMenuActivity (View v){
        startActivity(new Intent(addDriver.this, MainActivity.class));
        Toast.makeText(this, "New Driver Added", Toast.LENGTH_SHORT).show();
    }
    public void clickFunction(View view) {

        EditText newDriverName = (EditText) findViewById(R.id.driverName);
        Driver driver = new Driver(parent.getDb().getDriversCount()+1, newDriverName.getText().toString());
        parent.getDb().addDriver(driver);
    }
}
