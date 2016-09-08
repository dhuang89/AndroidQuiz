package com.example.dennis.androidquiz;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Quiz2 extends AppCompatActivity {

    public static String[] questions = {"Are you stupid?", "Do you feel dumb?", "Do you feel bad?", "Can you do math?", "Are you good at homework?"};
    public static int[] answers = {0, 0};
    public static String[] results = {"Congratulations, you are smart!", "Sorry, you are dumb."};
    public int i = 0;
    public static int resultIndex = 0;
    public int progressStatus = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        ProgressBar pb = (ProgressBar) findViewById(R.id.pb);
        pb.setProgress(progressStatus);

    }

    //iterate through array and get next question if there is one
    //if not, finish the quiz
    public void nextQuestion(View view) {
        progressStatus += 1;
        ProgressBar pb = (ProgressBar) findViewById(R.id.pb);
        pb.setProgress(progressStatus);
        TextView current = (TextView) findViewById(R.id.textView3);

        Button answer = (Button) view;

        if (answer.getText().toString().equals("Yes")) {
            answers[0] += 1;
        } else {
            answers[1] += 1;
        }

        if (i <= questions.length - 1) {
            current.setText(questions[i]);
            i++;

        }
        else {

            finishQuiz(view);
        }
    }

    //decide which result to display based on the user's answers
    //hide the unnecessary components on the layout, display the string of the result and the button to go home
    public void finishQuiz(View view) {
        TextView ending = (TextView) findViewById(R.id.textView3);

        if (answers[0] >= 3) {
            ending.setText(results[0]);
            resultIndex = 0;
        } else {
            ending.setText(results[1]);
            resultIndex = 1;
        }


        TextView question = (TextView) findViewById(R.id.textView);
        question.setVisibility(View.INVISIBLE);

        Button yes = (Button) findViewById(R.id.button);
        yes.setVisibility(View.INVISIBLE);

        Button no = (Button) findViewById(R.id.button2);
        no.setVisibility(View.INVISIBLE);

        Button end = (Button) findViewById(R.id.button3);
        end.setVisibility(View.VISIBLE);

    }

    //ends quiz activity
    public void goHome(View view) {
        finish();
    }

    //gets result string for the toast message
    public static String getResults() {
        return results[resultIndex];
    }
}
