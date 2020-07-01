package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        Log.i("Info.","Currency Converted !!");
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        Log.i("Entered Amount (in USD)", nameEditText.getText().toString());
        String amountInDollar = nameEditText.getText().toString();
        double amountDoubleDollar = Double.parseDouble(amountInDollar);
        double amountDoubleRupee = amountDoubleDollar * 76.15;
        //String amountInRupee = String.valueOf(amountDoubleRupee);
        String amountInRupee = String.format("%.2f",amountDoubleRupee);
        String dollar = "$";
        Toast.makeText(this, dollar.concat(amountInDollar).concat(" = ₹").concat(amountInRupee), Toast.LENGTH_LONG).show();
        Log.i("Converted Amount (in INR)", amountInRupee);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
