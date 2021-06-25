package com.example.fitdontquit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView img_gym1, img_gym2;
Button btn_gym;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        img_gym1=findViewById(R.id.img1);
        img_gym2=findViewById(R.id.img2);
        btn_gym=findViewById(R.id.btn);

        btn_gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}