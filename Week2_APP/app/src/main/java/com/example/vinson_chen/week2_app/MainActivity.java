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
    public void onStart(){
        super.onStart();

        Context context = getApplicationContext();

        text = "In onStart";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public void onResume(){
        super.onResume();

        Context context = getApplicationContext();

        text = "In onResume";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public void onRestart(){
        super.onRestart();

        Context context = getApplicationContext();

        text = "In onRestart";
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

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

//        savedInstanceState.putString("message", text.getText().toString());

        Context context = getApplicationContext();

        text = "In onSaveInstanceState";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

//        String message = savedInstanceState.getString("message");

        Context context = getApplicationContext();

        text = "In onRestoreInstanceState";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
