package com.example.dylan.taxtimewithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class addVehicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);
    }

    public void mainMenuActivity (View v){
        startActivity(new Intent(addVehicle.this, MainActivity.class));
    }

    public void clickFunction(View view) {

        EditText newRego = (EditText) findViewById(R.id.vehicleRegistration);

        EditText newMake = (EditText) findViewById(R.id.vehicleMake);

        EditText newModel = (EditText) findViewById(R.id.vehicleModel);

        EditText carYear = (EditText) findViewById(R.id.vehicleYear);

        Switch newEngineSize = (Switch) findViewById(R.id.vehicleEngine);

    }

    }
