package com.example.fitdontquit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WorkoutsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);
        getSupportActionBar().hide();
    }

    public void ButtonClicked(View view)
    {
        Intent i=new Intent(getApplicationContext(),StartWorkout.class);
        startActivity(i);
    }
}