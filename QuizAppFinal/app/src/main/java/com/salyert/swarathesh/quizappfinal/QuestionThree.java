package com.salyert.swarathesh.quizappfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class QuestionThree extends AppCompatActivity {
    public Store store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);
        store = new Store();
    }

    public void odd(View view) {
        startActivity(new Intent(QuestionThree.this, QuestionFour.class));
    }

    public void even(View view) {
        int score = store.getSCORE();
        score++;
        store.setSCORE(score);
        startActivity(new Intent(QuestionThree.this, QuestionFour.class));
    }
}
