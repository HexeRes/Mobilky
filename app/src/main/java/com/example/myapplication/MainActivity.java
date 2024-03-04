package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button btn2;
    private ImageView mFge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRR","onCreate");
        Random random = new Random();
        btn = findViewById(R.id.button);
        mFge = findViewById(R.id.Babka);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int a = random.nextInt(6) + 1;
            int b = random.nextInt(6) + 1;
            if (a==b){
                mFge.setImageResource(R.drawable.babka);


            }

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR","onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","onStop");
    }
}