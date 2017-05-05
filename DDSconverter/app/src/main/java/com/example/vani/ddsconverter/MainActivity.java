package com.example.vani.ddsconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Cal_DSS(View view){
        Intent intent = new Intent(this, withDDS.class);

        startActivity(intent);
    }
    public void Cal_withoutDSS(View view){
        Intent intent = new Intent(this, withoutDDS.class);

        startActivity(intent);
    }
}
