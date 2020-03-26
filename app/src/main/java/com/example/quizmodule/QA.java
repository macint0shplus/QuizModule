package com.example.quizmodule;

import java.util.ArrayList;

public class QA {
    private int ID;
    private String question;
    private String answer;

    public QA() {
    }

    public QA(int ID, String question, String answer) {
        this.ID = ID;
        this.question = question;
        this.answer = answer;

    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String name) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }



    public static ArrayList<QA> getQAs() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA(0, "indexDud", "XXX"));
        QAs.add(new QA(1, "0+1", "one"));
        QAs.add(new QA(2, "0+2", "two"));
        QAs.add(new QA(3, "0+3", "three"));
        QAs.add(new QA(4, "0+4", "four"));
        QAs.add(new QA(5, "0+5", "five"));
        QAs.add(new QA(6, "0+6", "six"));
        QAs.add(new QA(7, "0+7", "seven"));
        QAs.add(new QA(8, "0+8", "eight"));
        QAs.add(new QA(9, "0+9", "nine"));
        QAs.add(new QA(10, "0+10", "ten"));
        return QAs;
    }

}