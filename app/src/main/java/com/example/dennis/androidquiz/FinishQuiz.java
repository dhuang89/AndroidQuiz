package com.example.dennis.androidquiz;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Dennis on 8/31/16.
 */
public class FinishQuiz extends Fragment {
    public static RelativeLayout rl;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rl = (RelativeLayout) inflater.inflate(R.layout.finish_quiz, container, false);
        return rl;
    }

    public static void showText() {
        if (MainActivity.hideBool()) {
            TextView done = (TextView) rl.findViewById(R.id.textView4);
            done.setVisibility(View.VISIBLE);
        }
    }


}
