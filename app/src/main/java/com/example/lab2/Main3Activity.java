package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView2 = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();

        String str = intent.getStringExtra("message");
        Log.i("Mess", str);
        textView2.setText("Hello " + str);

    }
}
