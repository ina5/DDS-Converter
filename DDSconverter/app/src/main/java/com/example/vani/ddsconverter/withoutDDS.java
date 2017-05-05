package com.example.vani.ddsconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class withoutDDS extends AppCompatActivity {

    TextView result_OnlyPrice_Tv;
    EditText editTextWithoutDDS;
    Button button_cal_withoutDDS;


    double resOnlyPrice;
    double num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_without_dds);

        result_OnlyPrice_Tv = (TextView)findViewById(R.id.resOnlyPrice);

        editTextWithoutDDS = (EditText)findViewById(R.id.editTextWithoutDDS);

        button_cal_withoutDDS = (Button)findViewById(R.id.button_cal_withoutDDS);
    }
    public void CalculateJustPrice(View view){
        DecimalFormat df = new DecimalFormat("0.00");
        // get input number and convert it from string to double
        num = Double.parseDouble(editTextWithoutDDS.getText().toString());

        resOnlyPrice = num / 1.2;
        // display results
        result_OnlyPrice_Tv.setText(String.valueOf(df.format(resOnlyPrice)));
    }
    public void HomePage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
