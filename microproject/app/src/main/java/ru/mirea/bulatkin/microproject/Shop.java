package ru.mirea.bulatkin.microproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//Было лень делать родительские классы для всех этих элементов, да и не знаю я как они в жаве делаются
public class Shop extends AppCompatActivity {

    TextView textView6, textView7, textView8;
    Button button2, button4, button5, button6;
    int buycount1, buycount2, buycount3 =0;
    int setprice1 = 56;
    int setprice2 = 320;
    int setprice3 = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        button2 = (Button) findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText(Integer.toString(setprice1) + " очков");
        textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText(Integer.toString(setprice2) + " очков");
        textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setText(Integer.toString(setprice3) + " очков");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (MainActivity.clicks >= setprice1) {

                    MainActivity.delta += 1;
                    MainActivity.clicks -= setprice1;
                    MainActivity.textView3.setText(MainActivity.textView3 + "");
                    buycount1 += 1;
                    setprice1 += 11 * buycount1;
                    textView6.setText(Integer.toString(setprice1) + " очков");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (MainActivity.clicks >= setprice2) {
                    MainActivity.delta += 20;
                    MainActivity.clicks -= setprice2;
                    MainActivity.textView3.setText(MainActivity.textView3 + "");
                    buycount2 += 1;
                    setprice2 += 41 * buycount2;
                    textView7.setText(Integer.toString(setprice2) + " очков");
                }
            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.clicks >= setprice3) {
                    MainActivity.delta += 100;
                    MainActivity.clicks -= setprice3;
                    MainActivity.textView3.setText(MainActivity.textView3 + "");
                    buycount3 += 1;
                    setprice3 += 62 * buycount3;
                    textView8.setText(Integer.toString(setprice3) + " очков");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shop.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}