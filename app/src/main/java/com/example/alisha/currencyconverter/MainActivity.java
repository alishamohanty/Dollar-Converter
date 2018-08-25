package com.example.alisha.currencyconverter;

import android.content.Intent;
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
        Double dollars_double = Double.parseDouble(dollars_string); //converting to double
        Double d_rupees = 69.78*dollars_double;
        String s_rupees = d_rupees.toString();

        TextView textView = (TextView) findViewById(R.id.rupees);
        textView.setText("₹"+s_rupees);

        Log.i("amount", dollars_string);
        Log.i("text","Convert clicked!!");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
