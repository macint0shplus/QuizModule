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



    public static ArrayList<QA> getQAs1() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA(0, "QuizName", "Introduction to Business Analysis"));
        QAs.add(new QA(1, "Which Business Analysis Core Concept is defined as the “act of transformation in response to a need”?", "Change"));
        QAs.add(new QA(2, "Which Business Analysis Core Concept is defined as a “problem or opportunity to be addressed”?", "Need"));
        QAs.add(new QA(3, "Which Business Analysis Core Concept is defined as a “specific way of satisfying one or more needs”?", "Solution"));
        QAs.add(new QA(4, "Which Business Analysis Core Concept is defined as a “group or individual with a relationship to the solution”?", "Stakeholder"));
        QAs.add(new QA(5, "Which Business Analysis Core Concept is defined as the “worth or importance of something to a stakeholder”?", "Value"));
        QAs.add(new QA(6, "Which Business Analysis Core Concept is defined as the “circumstances that influence/are influenced by change”?", "Context"));
        QAs.add(new QA(7, "Which Business Analysis Role is characterised by having a limited function and single roles per person?", "Conservative"));
        QAs.add(new QA(8, "Which Business Analysis Role is characterised by having defined roles across cross-functional teams?", "Progressive"));
        QAs.add(new QA(9, "Which Business Analysis Role is characterised by having customisable roles across cross-functional teams?", "Avant-Garde"));
        return QAs;
    }

    public static ArrayList<QA> getQAs2() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA(0, "QuizName", "Scrum Framework"));
        QAs.add(new QA(1, "Which part of the Scrum Framework is defined as a “2-4 week extreme programming iteration”?", "Scrum Sprint"));
        QAs.add(new QA(2, "Which Scrum Role is defined as a “visionary who selects the features and content of the product”?", "Product Owner"));
        QAs.add(new QA(3, "Which Scrum Role is defined as the “servant leader who represents the project's management”?", "Scrum Master"));
        QAs.add(new QA(4, "Which Scrum Role is defined as a “a self-organised 5-9 person group who complete an assortment of tasks”?", "Scrum Team"));
        QAs.add(new QA(5, "Which Scrum Ceremony is defined as “selecting items from the product backlog to complete”?", "Sprint Planning"));
        QAs.add(new QA(6, "Which Scrum Ceremony is defined as the “scrum team presenting demos of their project code during the sprint”?", "Sprint Review"));
        QAs.add(new QA(7, "Which Scrum Ceremony is defined as a “periodic look at what is and isn't working in the project after each sprint”?", "Sprint Retrospective"));
        QAs.add(new QA(8, "Which Scrum Ceremony is defined as a “daily meeting where team members review their current workload and plan their future workload”?", "Stand-up Meeting"));
        QAs.add(new QA(9, "Which Scrum Artefact is defined as a “list of user stories and story points”?", "Product Backlog"));
        QAs.add(new QA(10, "Which Scrum Artefact is defined as “team members selecting tasks to complete during the sprint”?", "Sprint Backlog"));
        QAs.add(new QA(11, "Which Scrum Artefact is defined as a “tracking mechanism of what Sprint work has been completed and is yet to be complete”?", "Sprint Burndown Chart"));
        return QAs;
    }

    public static ArrayList<QA> getQAs3() {
        ArrayList<QA> QAs = new ArrayList<>();
        QAs.add(new QA(0, "QuizName", "Design Thinking"));
        QAs.add(new QA(1, "Which attribute of Design Thinking is defined as “involving the client in every step of the process?", "Human-Centered"));
        QAs.add(new QA(2, "Which attribute of Design Thinking is defined as “constantly working with many team members”?", "Radical Collaboration"));
        QAs.add(new QA(3, "Which attribute of Design Thinking is defined as “creating regular prototypes to solicit feedback”?", "Culture of Prototyping"));
        QAs.add(new QA(4, "Which attribute of Design Thinking is defined as “being visual when representing ideas”?", "Show Don’t Tell"));
        QAs.add(new QA(5, "Which attribute of Design Thinking is defined as “doing more and talking less”?", "Bias towards Action"));
        QAs.add(new QA(6, "Which attribute of Design Thinking is defined as “constantly reflecting on how to improve processes”?", "Mindful of Process"));
        QAs.add(new QA(7, "Which activity in the Empathise Stage is defined as “personalised conversations to better understand client needs”?", "Interviews"));
        QAs.add(new QA(8, "Which activity in the Empathise Stage is defined as “finding the human cause in defects through repetitive analysis”?", "Five Whys Root Cause Analysis"));
        QAs.add(new QA(9, "Which activity in the Empathise Stage is defined as “presenting the feelings, influences, painpoints, and goals of clients”?", "Empathy Maps"));
        QAs.add(new QA(10, "Which activity in the Define Stage is defined as “consolidating the popular opinions of clients from interviews”?", "Thematic Analysis"));
        QAs.add(new QA(11, "Which activity in the Define Stage is represented by “[User] needs to [Action] because [Insight]”?", "POV Statements"));
        QAs.add(new QA(12, "Which activity in the Ideate Stage is defined as “using mind maps to generate many potential solutions”?", "Diverging"));
        QAs.add(new QA(13, "Which activity in the Ideate Stage is defined as “using criteria-based choice marking to find the most relevant solutions”?", "Converging"));
        QAs.add(new QA(14, "Which Tool in the Prototype/Test Phase includes Paper and Mocks?", "Low Fidelity Representation"));
        QAs.add(new QA(15, "Which Tool in the Prototype/Test Phase includes Code and Physical?", "High Fidelity Representation"));
        return QAs;
    }

}