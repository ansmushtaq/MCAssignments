package com.example.englishalphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlphabetActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        Bundle extras=getIntent().getExtras();
        img = (ImageView) findViewById(R.id.img_element);
        switch(extras.getChar("alphabet")){
            case 'a': {
                img.setBackgroundResource(R.drawable.a);
                break;
            }
            case 'b': {
                img.setBackgroundResource(R.drawable.b);
                break;
            }
            case 'c': {
                img.setBackgroundResource(R.drawable.c);
                break;
            }
            case 'd': {
                img.setBackgroundResource(R.drawable.d);
                break;
            }
            case 'e': {
                img.setBackgroundResource(R.drawable.e);
                break;
            }
            case 'f': {
                img.setBackgroundResource(R.drawable.f);
                break;
            }
            case 'g': {
                img.setBackgroundResource(R.drawable.g);
                break;
            }
            case 'h': {
                img.setBackgroundResource(R.drawable.h);
                break;
            }
            case 'i': {
                img.setBackgroundResource(R.drawable.i);
                break;
            }
            case 'j': {
                img.setBackgroundResource(R.drawable.j);
                break;
            }
            case 'k': {
                img.setBackgroundResource(R.drawable.k);
                break;
            }
            case 'l': {
                img.setBackgroundResource(R.drawable.l);
                break;
            }
            case 'm': {
                img.setBackgroundResource(R.drawable.m);
                break;
            }
            case 'n': {
                img.setBackgroundResource(R.drawable.n);
                break;
            }
            case 'o': {
                img.setBackgroundResource(R.drawable.o);
                break;
            }
            case 'p': {
                img.setBackgroundResource(R.drawable.p);
                break;
            }
            case 'q': {
                img.setBackgroundResource(R.drawable.q);
                break;
            }
            case 'r': {
                img.setBackgroundResource(R.drawable.r);
                break;
            }
            case 's': {
                img.setBackgroundResource(R.drawable.s);
                break;
            }
            case 't': {
                img.setBackgroundResource(R.drawable.t);
                break;
            }
            case 'u': {
                img.setBackgroundResource(R.drawable.u);
                break;
            }
            case 'v': {
                img.setBackgroundResource(R.drawable.v);
                break;
            }
            case 'w': {
                img.setBackgroundResource(R.drawable.w);
                break;
            }
            case 'x': {
                img.setBackgroundResource(R.drawable.x);
                break;
            }
            case 'y': {
                img.setBackgroundResource(R.drawable.y);
                break;
            }
            case 'z': {
                img.setBackgroundResource(R.drawable.z);
                break;
            }

        }
    }



}

