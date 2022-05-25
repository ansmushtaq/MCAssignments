package com.example.englishalphabets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class AlphabetActivity extends AppCompatActivity {
    ImageView img;
    TextView txtview;
    ArrayList<Character> alphabets=new ArrayList<Character>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        alphabets.add('a');
        alphabets.add('b');
        alphabets.add('c');
        alphabets.add('d');
        alphabets.add('e');
        alphabets.add('f');
        alphabets.add('g');
        alphabets.add('h');
        alphabets.add('i');
        alphabets.add('j');
        alphabets.add('k');
        alphabets.add('l');
        alphabets.add('m');
        alphabets.add('n');
        alphabets.add('o');
        alphabets.add('p');
        alphabets.add('q');
        alphabets.add('r');
        alphabets.add('s');
        alphabets.add('t');
        alphabets.add('u');
        alphabets.add('v');
        alphabets.add('w');
        alphabets.add('x');
        alphabets.add('y');
        alphabets.add('z');

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        Bundle extras=getIntent().getExtras();
        txtview=findViewById(R.id.textView2);

        img = (ImageView) findViewById(R.id.img_element);
        char key=extras.getChar("alphabet");
        showImg(key);
    }
    public void showImg(char key){
        switch(key) {
            case 'a': {
                txtview.setText(alphabets.get(0).toString());
                img.setBackgroundResource(R.drawable.a);
                break;
            }
            case 'b': {
                txtview.setText(alphabets.get(1).toString());
                img.setBackgroundResource(R.drawable.b);
                break;
            }
            case 'c': {
                txtview.setText(alphabets.get(2).toString());
                img.setBackgroundResource(R.drawable.c);
                break;
            }
            case 'd': {
                txtview.setText(alphabets.get(3).toString());
                img.setBackgroundResource(R.drawable.d);
                break;
            }
            case 'e': {
                txtview.setText(alphabets.get(4).toString());
                img.setBackgroundResource(R.drawable.e);
                break;
            }
            case 'f': {
                txtview.setText(alphabets.get(5).toString());
                img.setBackgroundResource(R.drawable.f);
                break;
            }
            case 'g': {
                txtview.setText(alphabets.get(6).toString());
                img.setBackgroundResource(R.drawable.g);
                break;
            }
            case 'h': {
                txtview.setText(alphabets.get(7).toString());
                img.setBackgroundResource(R.drawable.h);
                break;
            }
            case 'i': {
                txtview.setText(alphabets.get(8).toString());
                img.setBackgroundResource(R.drawable.i);
                break;
            }
            case 'j': {
                txtview.setText(alphabets.get(9).toString());
                img.setBackgroundResource(R.drawable.j);
                break;
            }
            case 'k': {
                txtview.setText(alphabets.get(10).toString());
                img.setBackgroundResource(R.drawable.k);
                break;
            }
            case 'l': {
                txtview.setText(alphabets.get(11).toString());
                img.setBackgroundResource(R.drawable.l);
                break;
            }
            case 'm': {
                txtview.setText(alphabets.get(12).toString());
                img.setBackgroundResource(R.drawable.m);
                break;
            }
            case 'n': {
                txtview.setText(alphabets.get(13).toString());
                img.setBackgroundResource(R.drawable.n);
                break;
            }
            case 'o': {
                txtview.setText(alphabets.get(14).toString());
                img.setBackgroundResource(R.drawable.o);
                break;
            }
            case 'p': {
                txtview.setText(alphabets.get(15).toString());
                img.setBackgroundResource(R.drawable.p);
                break;
            }
            case 'q': {
                txtview.setText(alphabets.get(16).toString());
                img.setBackgroundResource(R.drawable.q);
                break;
            }
            case 'r': {
                txtview.setText(alphabets.get(17).toString());
                img.setBackgroundResource(R.drawable.r);
                break;
            }
            case 's': {
                txtview.setText(alphabets.get(18).toString());
                img.setBackgroundResource(R.drawable.s);
                break;
            }
            case 't': {
                txtview.setText(alphabets.get(19).toString());
                img.setBackgroundResource(R.drawable.t);
                break;
            }
            case 'u': {
                txtview.setText(alphabets.get(20).toString());
                img.setBackgroundResource(R.drawable.u);
                break;
            }
            case 'v': {
                txtview.setText(alphabets.get(21).toString());
                img.setBackgroundResource(R.drawable.v);
                break;
            }
            case 'w': {
                txtview.setText(alphabets.get(22).toString());
                img.setBackgroundResource(R.drawable.w);
                break;
            }
            case 'x': {
                txtview.setText(alphabets.get(23).toString());
                img.setBackgroundResource(R.drawable.x);
                break;
            }
            case 'y': {
                txtview.setText(alphabets.get(24).toString());
                img.setBackgroundResource(R.drawable.y);
                break;
            }
            case 'z': {
                txtview.setText(alphabets.get(25).toString());
                img.setBackgroundResource(R.drawable.z);
                break;
            }
        }
        }
    public void moveback(View view) {
            char currentAlphabet = txtview.getText().charAt(0);
            System.out.println(currentAlphabet);
            int index = alphabets.indexOf(currentAlphabet);
            System.out.println(index);
            showImg(alphabets.get(index - 1));
    }
    public void movefor(View view){
        char currentAlphabet = txtview.getText().charAt(0);
        System.out.println(currentAlphabet);
        int index = alphabets.indexOf(currentAlphabet);
        System.out.println(index);
        showImg(alphabets.get(1 + index));
    }

}

