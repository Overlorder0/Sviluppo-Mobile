package ru.mirea.bulatkin.microproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Shop extends AppCompatActivity {

    TextView textView6, textView7;
    Button button2, button4, button5;
    int buycount1, buycount2 =0;
    int setprice1 = 56;
    int setprice2 = 320;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        button2 = (Button) findViewById(R.id.button2);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setText(Integer.toString(setprice1)+ " очков");
        textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setText(Integer.toString(setprice2)+ " очков");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (MainActivity.clicks >=setprice1){

                    MainActivity.delta += 1;
                    MainActivity.clicks -= setprice1;
                    MainActivity.textView3.setText(MainActivity.textView3 + "");
                    buycount1 += 1;
                    setprice1 += 11 * buycount1;
                    textView6.setText(Integer.toString(setprice1)+ " очков");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (MainActivity.clicks >=setprice2){
                    MainActivity.delta += 20;
                    MainActivity.clicks -= setprice2;
                    MainActivity.textView3.setText(MainActivity.textView3 + "");
                    buycount2 += 1;
                    setprice2 += 41 * buycount2;
                    textView7.setText(Integer.toString(setprice2)+ " очков");
                }
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Shop.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onResume(){
        super.onResume();
        setprice1= setprice1;
        setprice2= setprice2;
        buycount1= buycount1;
        buycount2= buycount2;
    }
}