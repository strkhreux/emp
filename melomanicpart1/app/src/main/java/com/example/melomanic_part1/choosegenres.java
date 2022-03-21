package com.example.melomanic_part1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;



public class choosegenres extends AppCompatActivity {

    private final static String FILE_NAME = "content.txt";
    public static final String APP_PREFERENCES = "FilePreferences";

    TextView textView;
    public SharedPreferences mSettings;

    Button rockBtn, popBtn, indieBtn, punkBtn, russianBtn, hiphopBtn, btn2000s, btn2010s, btn90s, btn80s;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosegenres);

        textView = findViewById(R.id.personName);

        SharedPreferences sharedPref = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        String perName = sharedPref.getString("NAME", "unknown");

        textView.setText("Hi, " + perName + "!");


        rockBtn.findViewById(R.id.btn_choose_rock);
        popBtn.findViewById(R.id.btn_choose_pop);
        indieBtn.findViewById(R.id.btn_choose_indie);
        punkBtn.findViewById(R.id.btn_choose_punk);
        russianBtn.findViewById(R.id.btn_choose_russian);
        hiphopBtn.findViewById(R.id.hbtn_choose_hiphop);
        btn2000s.findViewById(R.id.btn_choose_2000);
        btn2010s.findViewById(R.id.btn_choose_2010);
        btn90s.findViewById(R.id.btn_choose_90);
        btn80s.findViewById(R.id.btn_choose_80);

    }
}