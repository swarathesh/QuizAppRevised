package com.salyert.swarathesh.quizappfinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuestionTwo extends Activity {
    public int scoreTwo = 0;
    public Store store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);
        store = new Store();
    }

    public void IncrementScore(View view) {
        scoreTwo += 1;
    }

    public void QuestionThree(View view) {
        if (scoreTwo == 1) {
            int score = store.getSCORE();
            score++;
            store.setSCORE(score);
            startActivity(new Intent(QuestionTwo.this, QuestionThree.class));
        } else {
            startActivity(new Intent(QuestionTwo.this, QuestionThree.class));
        }

    }
}
