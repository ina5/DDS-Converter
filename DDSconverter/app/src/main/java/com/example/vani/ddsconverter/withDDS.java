package com.example.vani.ddsconverter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class withDDS extends AppCompatActivity {
 // Declare LocalData
    SharedPreferences preferences = getSharedPreferences("LocalData", Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = preferences.edit();


    TextView result_DDS_Tv, result_Prive_Tv;
    EditText editText;
    Button button_cal_dds;

    double resDDS, resPriceDDS;
    double num;
    double taxRate = 0.20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_dds);

         result_DDS_Tv = (TextView)findViewById(R.id.resultDDS);
        result_Prive_Tv = (TextView)findViewById(R.id.priceWithDDS);

        editText = (EditText)findViewById(R.id.editTextDDS);

        button_cal_dds = (Button)findViewById(R.id.button_cal_dds);
    }
     public void CalculateDDS(View view) {
         DecimalFormat df = new DecimalFormat("0.00");
         // get input number and convert it from string to double
         num = Double.parseDouble(editText.getText().toString());




         resDDS = num * taxRate;
         resPriceDDS = num + resDDS;

         // Working on a Data
         editor.putString("input",editText.getText().toString());
         editor.apply();


         // display results
         result_DDS_Tv.setText(String.valueOf(df.format(resDDS)));
         result_Prive_Tv.setText(String.valueOf(df.format(resPriceDDS)));
     }
    public void HomePage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
