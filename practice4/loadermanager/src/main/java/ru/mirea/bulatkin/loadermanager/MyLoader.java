package ru.mirea.bulatkin.loadermanager;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.loader.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.Collections;

public class MyLoader extends AsyncTaskLoader<String> {
    private String symbols;
    ArrayList<Character> chrl;
    public static final String word = "word";

    public MyLoader(@NonNull Context context, Bundle args, EditText editText) {
        super(context);
        if (args != null) {
            symbols = args.getString(word);
            chrl = new ArrayList<>();
            for (char symbol : symbols.toCharArray()){
                chrl.add(symbol);
            }
            Collections.shuffle(chrl);
            symbols = chrl.toString();
            for(char symbol : symbols.toCharArray()){
                if (symbol == '[' || symbol == ']' || symbol == ','){
                    symbols = symbols.replace(symbol, ' ');
                }
            }
            symbols = symbols.trim();
            editText.setText(symbols);
        }
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public String loadInBackground() {
        SystemClock.sleep(5000);
        return symbols;
    }
}