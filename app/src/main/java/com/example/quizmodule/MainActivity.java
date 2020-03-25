package com.example.quizmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView question;

    private RadioGroup radioGroup;
    private RadioButton answers;

    private Button confirmButton;

    private String questionText;
    private int selectedQuestionIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = findViewById(R.id.question_TV);
        radioGroup = findViewById(R.id.answers_RG);

        for (int i = 0; i < radioGroup .getChildCount(); i++) {
            ((RadioButton) radioGroup.getChildAt(i)).setText(String.valueOf(QA.getQAs().get(i).getAnswer()));
        }

        // findviewbyid
        question = findViewById(R.id.question_TV);
        confirmButton = findViewById(R.id.confirm_BT);

        selectedQuestionIndex = (int)(Math.random() * 10);

        questionText = QA.getQAs().get(selectedQuestionIndex).getQuestion();
        question.setText((questionText));

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                confirmAnswer(answers);
            }
        });
    }
/// end of oncreate
    public void checkButton(View v){
        int radioID = radioGroup.getCheckedRadioButtonId();
        answers = findViewById(radioID);

    }


    private void confirmAnswer(RadioButton answers){
        question.setText(String.valueOf(answers.getText()));
    }



}
