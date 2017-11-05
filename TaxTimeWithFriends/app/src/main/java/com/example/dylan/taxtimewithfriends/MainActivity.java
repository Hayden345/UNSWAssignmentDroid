package com.example.dylan.taxtimewithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private DBReaderHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DBReaderHelper (this);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
        System.exit(0);
    }

    public void logTripActivity(View v){
        startActivity(new Intent(MainActivity.this, logTrip.class));
    }

    public void addDriverActivity (View v){
        startActivity(new Intent(MainActivity.this, addDriver.class));
    }

    public void addVehicleActivity (View v){
        startActivity(new Intent(MainActivity.this, addVehicle.class));
    }

    public void addExpenseActivity (View v){
        startActivity(new Intent(MainActivity.this, addExpense.class));
    }

    public void summaryActivity (View v){
        startActivity(new Intent(MainActivity.this, summary.class));
    }

    public DBReaderHelper getDb() {
        return db;
    }
}
