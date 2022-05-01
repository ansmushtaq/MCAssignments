package com.example.myapplication03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView out;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClick(View view) {
        btn = findViewById(R.id.btn);
        out = findViewById(R.id.textView);
        out.setText("Hi, My name is Ans Mushtaq");
    }
}