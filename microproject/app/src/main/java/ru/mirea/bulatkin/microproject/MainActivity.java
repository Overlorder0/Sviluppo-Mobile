package ru.mirea.bulatkin.microproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static public int clicks = 0;
    static public int delta = 1;
    Button button, button3;
    static public TextView textView3, textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button3 = (Button) findViewById(R.id.button3);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(Integer.toString(delta)+ " очков за клик!");
        Click();
    }
    void Click(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks += delta;
                textView3.setText(clicks + "");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Shop.class);
                startActivity(intent);
            }
        });
    }
}