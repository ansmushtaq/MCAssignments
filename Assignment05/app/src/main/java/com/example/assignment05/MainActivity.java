package com.example.assignment05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button button;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button = findViewById(R.id.btn);
            button.setOnClickListener(view -> gotoUrl());
        }
        private void gotoUrl(){
            Uri uri= Uri.parse("https://github.com/ansmushtaq/MCAssignments");
            startActivity(new Intent(Intent.ACTION_VIEW , uri));

        }
    }
