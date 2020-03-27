package com.example.quizmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class afterPage extends AppCompatActivity {

    // Initialising UI elements
    private TextView title;
    private TextView quizName;
    private TextView quizMark;
    private TextView quizPercentage;
    private TextView mark;
    private TextView percentage;
    private TextView feedback;
    private int amountCorrect = 0;
    private double percentCorrect = 0;
    private int questionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_page);

        // Connecting views to variables
        title = findViewById(R.id.title_TV);
        quizName = findViewById((R.id.quizName_TV));
        quizMark = findViewById(R.id.quizMark_TV);
        quizPercentage = findViewById(R.id.quizPercentage_TV);
        mark = findViewById(R.id.mark_TV);
        percentage = findViewById((R.id.percentage_TV));
        feedback = findViewById(R.id.quizFeedback_TV);

        // Receiving information from the main activity
        Intent intent = getIntent();
        amountCorrect = intent.getIntExtra("amountCorrect", 0);
        questionNumber = intent.getIntExtra("questionNumber", 0);

        // Calculating the percentage of correct answers
        double percentCorrect = Math.round(((double) amountCorrect / (double) questionNumber * 100) * 10) / 10.0;

        // Updating UI elements
        quizName.setText("Quiz 1 - Basic Math");
        mark.setText(String.valueOf(amountCorrect) + "/" + String.valueOf(questionNumber));
        percentage.setText(String.valueOf(percentCorrect) + "%");

        // Tailoring feedback based on mark
        if (percentCorrect < 50) {
            feedback.setText("Fail... \uD83D\uDE1E \n Revise harder and come back stronger!");
        } else if (percentCorrect >= 50 && percentCorrect < 65) {
            feedback.setText("Pass. \uD83D\uDE07 \n Let's work on consolidating! ");
        } else if (percentCorrect >= 65 && percentCorrect < 75) {
            feedback.setText("Credit. \uD83D\uDE1B \n You know the content well! Now it's time to practice it more!");
        } else if (percentCorrect >= 75 && percentCorrect < 85) {
            feedback.setText("Distinction! \uD83E\uDD2F \n You have a thorough knowledge of the topic. Now it's time to master it!");
        } else if (percentCorrect >= 85 && percentCorrect < 100) {
            feedback.setText("High Distinction!! \uD83E\uDD29 \n You have nearly mastered this topic! Let's aim for 100%");
        } else if (percentCorrect == 100) {
            feedback.setText("Full Marks! \uD83D\uDE0E \n You have mastered this topic!");
        }
    }
}