package com.example.timeutilsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.timeutility.MessageToastPublish;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MessageToastPublish.showMessage(this,"Hola");

    }
}
