package com.example.dylan.taxtimewithfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class addDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_driver);
    }

    public void mainMenuActivity (View v){
        startActivity(new Intent(addDriver.this, MainActivity.class));
    }

    public void clickFunction(View view) {

        EditText newDriverName = (EditText) findViewById(R.id.//drivers name);
    }


}
