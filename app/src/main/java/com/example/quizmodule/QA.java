package com.example.quizmodule;

import java.util.ArrayList;

public class QA {
    private String question;
    private int answer;

    public QA() {
    }

    public QA(String question, int answer) {
        this.question = question;
        this.answer = answer;

    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String name) {
        this.question = question;
    }

    public int getAnswer() {
        return answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public static ArrayList<QA> getQAs() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA("1+0", 1));
        QAs.add(new QA("1+1", 2));
        QAs.add(new QA("1+2", 3));
        QAs.add(new QA("1+3", 4));
        QAs.add(new QA("1+4", 5));
        QAs.add(new QA("1+5", 6));
        QAs.add(new QA("1+6", 7));
        QAs.add(new QA("1+7", 8));
        QAs.add(new QA("1+8", 9));
        QAs.add(new QA("1+9", 10));
        return QAs;
    }

}