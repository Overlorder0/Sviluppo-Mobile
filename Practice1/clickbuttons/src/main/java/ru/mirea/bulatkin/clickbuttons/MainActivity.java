package ru.mirea.bulatkin.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.textView);
        buttonOk = (Button) findViewById(R.id.button);
        buttonCancel = (Button) findViewById(R.id.button2);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        buttonOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCan = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        buttonCancel.setOnClickListener(oclBtnCan);
    }
}