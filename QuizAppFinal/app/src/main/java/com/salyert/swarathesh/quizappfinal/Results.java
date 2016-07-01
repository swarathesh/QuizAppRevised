package com.salyert.swarathesh.quizappfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Results extends AppCompatActivity {
    private TextView name, score;
    public Store store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        store = new Store();
        int scored = store.getSCORE();
        String named = store.getNAME();
        name = (TextView) findViewById(R.id.nameResult);
        score = (TextView) findViewById(R.id.scoreResult);
        name.setText("hello " + named);
        String string = String.valueOf(scored);
        score.setText("your score " + string + "/4");
        Toast.makeText(getApplicationContext(),"player "+named+" score "+scored+"/4",Toast.LENGTH_LONG).show();
    }
}
