package com.lumi.findcallsinc;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestPermissions(new String[]{
                Manifest.permission.READ_PHONE_STATE

        }, 1);
    }
}