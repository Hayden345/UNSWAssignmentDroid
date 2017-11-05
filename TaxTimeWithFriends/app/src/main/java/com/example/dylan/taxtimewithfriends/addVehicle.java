package com.example.dylan.taxtimewithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import com.example.dylan.taxtimewithfriends.Objects.Vehicle;

public class addVehicle extends AppCompatActivity {

    private MainActivity parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);

        parent = (MainActivity)getParent();
    }

    public void mainMenuActivity (View v){
        startActivity(new Intent(addVehicle.this, MainActivity.class));
    }

    public void clickFunction(View view) {

        EditText newRego = (EditText) findViewById(R.id.vehicleRegistration);

        EditText newMake = (EditText) findViewById(R.id.vehicleMake);

        EditText newModel = (EditText) findViewById(R.id.vehicleModel);

        //TODO: Make a year spinner
        EditText carYear = (EditText) findViewById(R.id.vehicleYear);

        EditText newEngineSize = (EditText) findViewById(R.id.vehicleEngine);

        Vehicle vehicle = new Vehicle(parent.getDb().getVehiclesCount()+1, newRego.getText().toString(),
                newMake.getText().toString(), newModel.getText().toString(), carYear.getDate(), newEngineSize.getText().toString());
        parent.getDb().addVehicle(vehicle);
    }
}