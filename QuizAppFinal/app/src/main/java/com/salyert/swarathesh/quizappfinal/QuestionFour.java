package com.salyert.swarathesh.quizappfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class QuestionFour extends AppCompatActivity {

    private CheckBox check, check2;
    public Store store;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);
        final Store store = new Store();
        check = (CheckBox) findViewById(R.id.correct1);
        check2 = (CheckBox) findViewById(R.id.checkBox);
        button = (Button) findViewById(R.id.submit1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check.isChecked() && check2.isChecked()) {
                    int score = store.getSCORE();
                    score++;
                    store.setSCORE(score);
                    startActivity(new Intent(QuestionFour.this, Results.class));
                }
            }
        });

    }


}

