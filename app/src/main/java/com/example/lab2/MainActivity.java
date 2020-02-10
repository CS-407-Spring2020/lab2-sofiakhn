package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import  android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String str = myTextField.getText().toString();
        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity3(str);

    }

    public void goToActivity3(String s){
        Intent intent = new Intent( this, Main3Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
