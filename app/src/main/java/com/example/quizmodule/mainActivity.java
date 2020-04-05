package com.example.quizmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainActivity extends AppCompatActivity {

    private Button introductionQuizButton;
    private Button methodologiesQuizButton;
    private Button leanQuizButton;
    private Button designThinkingQuizButton;
    private Button agileScrumQuizButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        introductionQuizButton = findViewById(R.id.introductionQuiz);
        methodologiesQuizButton = findViewById(R.id.businessAnalysisMethodologiesQuiz);
        leanQuizButton = findViewById(R.id.leanDevelopmentQuiz);
        designThinkingQuizButton = findViewById(R.id.designThinkingQuiz);
        agileScrumQuizButton = findViewById(R.id.agileScrumQuiz);


        introductionQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(1);
            }
        });

        methodologiesQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(2);
            }
        });

        leanQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(3);
            }
        });

        designThinkingQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(4);
            }
        });

        agileScrumQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectQuiz(5);
            }
        });


    }


    public void selectQuiz(int quizIndex) {
        Intent intent = new Intent(this, quizActivity.class);
        intent.putExtra("quizIndex", quizIndex);
        startActivity(intent);
    }


}
