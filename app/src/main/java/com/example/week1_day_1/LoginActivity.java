package com.example.week1_day_1;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String message;
        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            message= null;
        } else {
            message= extras.getString("MESSAGE");
        }
        Log.i("Message",message);
    }
}
