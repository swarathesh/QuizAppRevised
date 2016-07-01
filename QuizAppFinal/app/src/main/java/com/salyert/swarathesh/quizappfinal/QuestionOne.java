package com.salyert.swarathesh.quizappfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class QuestionOne extends AppCompatActivity {
    private CheckBox check, check2;
    public int scoreFirst;
    public Store store;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
        final Store store = new Store();
        check = (CheckBox) findViewById(R.id.correct);
        check2 = (CheckBox) findViewById(R.id.check2);
        button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check.isChecked() && check2.isChecked()) {
                    scoreFirst = store.getSCORE();
                    scoreFirst++;
                    store.setSCORE(scoreFirst);
                }
                startActivity(new Intent(QuestionOne.this, QuestionTwo.class));
            }
        });

    }

}
