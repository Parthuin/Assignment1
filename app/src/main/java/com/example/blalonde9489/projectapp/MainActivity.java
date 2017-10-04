package com.example.blalonde9489.projectapp;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static int TIME_OUT = 4000;
    SharedPreferences my_preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.my_preferences = PreferenceManager
                .getDefaultSharedPreferences(this);


    }

}
