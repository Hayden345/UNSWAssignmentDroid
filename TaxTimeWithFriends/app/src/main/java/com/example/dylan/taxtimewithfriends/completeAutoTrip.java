package com.example.dylan.taxtimewithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class completeAutoTrip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_auto_trip);
    }

    public void mainMenuActivity (View v){
        startActivity(new Intent(completeAutoTrip.this, MainActivity.class));
        Toast.makeText(this, "New Trip Added", Toast.LENGTH_SHORT).show();
    }

}
