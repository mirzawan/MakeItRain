package com.mirzahadzic.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button makeItRain;
    private TextView moneyValue;
    private Button showInfo;
    private int moneyCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeItRain = findViewById(R.id.btnMakeItRain);
        moneyValue=findViewById(R.id.moneyValue);




    }

    public void showMoney(View view) {
        NumberFormat numberFormat= NumberFormat.getCurrencyInstance();

        moneyCounter+=1000;
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));
       // Log.d("MainActivity", "Make it rain! " + moneyCounter);
    }

    public void showInfo(View view) {
      //  Toast.makeText(MainActivity.this, R.string.app_info,Toast.LENGTH_LONG).show();
        Snackbar.make(moneyValue,R.string.app_info,Snackbar.LENGTH_LONG).show();
    }
}