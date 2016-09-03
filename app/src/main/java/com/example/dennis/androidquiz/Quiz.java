package com.example.dennis.androidquiz;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    public static String[] questions = {null, "Do you like this app?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }

    //finish quiz activity here
    public void finishQuiz(View view) {
        int i = 0;
        TextView current = (TextView) findViewById(R.id.textView3);

        while (i < questions.length) {
            current.setText(questions[i]);
            SystemClock.sleep(3000);
            i++;

        }

        finish();
    }
}
