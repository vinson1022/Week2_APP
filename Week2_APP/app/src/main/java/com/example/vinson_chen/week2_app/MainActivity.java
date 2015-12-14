package com.example.vinson_chen.week2_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int duration = Toast.LENGTH_SHORT;
    CharSequence text = "Hello toast!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();

        text = "In onCreate";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public void onPause(){
        super.onPause();

        Context context = getApplicationContext();

        text = "In onPause";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public void onStop(){
        super.onStop();

        Context context = getApplicationContext();

        text = "In onStop";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();

        Context context = getApplicationContext();

        text = "In onDestroy";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }



}
