package com.example.lesson_two_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String valuestring = "200";
        Integer x = 10;
        Integer y = 4;
        Double number = Double.parseDouble(valuestring);
        Log.d("myLog", "" + number);


        if (x > y) {
            Log.d("myLog", "x is bigger");
        } else {
            Log.d("myLog", "x is smaller");
        }

        if (number.toString().equals(valuestring)) {
            Log.d("myLog", "the values are equal");
        } else {
            Log.d("myLog", "The values of both variables are different!");
        }

        if (y == x) {
            Log.d("myLog", "variables are equal");
        } else {
            Log.d("myLog", "variables are different");
        }


        if (x >= y) {
            Log.d("myLog", "x larger or equal to y");
        } else {
            Log.d("myLog", "x smaller than y");
        }


        if ((y >= 3) && (y < 10)) {
            Log.d("myLog", "y is bigger than 3 and smaller than 10");
        }
        else if ((y <= 10) || (x < 12)) {
            Log.d("myLog", "both variables are smaller or equal to 10");
        }
        else if (!(x == 10)) {
            Log.d("myLog", "x is not equal to 10");
        }
    }
}