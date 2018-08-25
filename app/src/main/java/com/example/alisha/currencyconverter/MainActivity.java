package com.example.alisha.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText dollars = (EditText) findViewById(R.id.dollars);
        String dollars_string = dollars.getText().toString(); //getting the string
        Double dollars = Double.parseDouble(dollars_string); //converting to double
        Log.i("amount", dollars);
        Log.i("text","Convert clicked!!");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
