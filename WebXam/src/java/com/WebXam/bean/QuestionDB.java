/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author Alex
 */
@Entity
@Table(name="QuestionDB")
public class QuestionDB extends ActionForm{
    @Id
    @GeneratedValue
    private int questionid;
    private String qtype;
    private String Question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private char correct;
    private long attempted;
    private long correctattempt;
    private int difficulty;

    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public char getCorrect() {
        return correct;
    }

    public void setCorrect(char correct) {
        this.correct = correct;
    }

    

    public long getAttempted() {
        return attempted;
    }

    public void setAttempted(long attempted) {
        this.attempted = attempted;
    }

    public long getCorrectattempt() {
        return correctattempt;
    }

    public void setCorrectattempt(long correctattempt) {
        this.correctattempt = correctattempt;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
