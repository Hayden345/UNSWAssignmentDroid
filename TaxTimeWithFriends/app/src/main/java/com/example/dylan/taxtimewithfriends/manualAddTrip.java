package com.example.dylan.taxtimewithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.dylan.taxtimewithfriends.Objects.Log;
import com.example.dylan.taxtimewithfriends.Objects.Trip;

public class manualAddTrip extends AppCompatActivity {


    private MainActivity parent;
    private boolean manWork = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_add_trip);

        parent = (MainAcivity)getParent();
    }

    public void mainMenuActivity(View v) {
        startActivity(new Intent(manualAddTrip.this, MainActivity.class));
        Toast.makeText(this, "New Trip Added", Toast.LENGTH_SHORT).show();
    }

    public void clickFunction(View view) {

        EditText manOdoStart = (EditText) findViewById(R.id.manualOdoStart);

        EditText manOdoEnd = (EditText) findViewById(R.id.manualOdoEnd);

        EditText manDate = (EditText) findViewById(R.id.manualDate);

        EditText manReason = (EditText) findViewById(R.id.manualReason);

        Switch aSwitch = (Switch) findViewById(R.id.manualSwitch);

        //TODO: Get which log (manLog) is being worked in - should be able to use the parent attribute to access it

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    manWork = true;
                else manWork = false;
            }
        });

        Trip trip = new Trip(manOdoStart, manOdoEnd, manDate, manDate, manReason, manWork, manLog);
        parent.getDb().addTrip(trip);
    }

}