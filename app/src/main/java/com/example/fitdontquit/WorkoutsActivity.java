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

    public void buttonMountain(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void buttonBasicCrun(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void buttonBenchDips(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void buttonBicycle(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void LegRaise(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void SitUp(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void vUps(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void PlankRotation(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void PlankLeftLeg(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void RussianTwist(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void Bridge(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    } public void Vertica(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void AlternativeHeelTouch(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void WindMill(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
    public void LegUpCrunches(View view)
    {
        Intent i=new Intent(getApplicationContext(), StartMountainClimbing.class);
        startActivity(i);
    }
}
