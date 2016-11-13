package com.example.rohail.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText userName = (EditText) findViewById(R.id.userName);

        Toast.makeText(MainActivity.this, userName.getText().toString(), Toast.LENGTH_SHORT).show();

        Log.i("INFO",userName.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
