/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.bean;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name="ExamDB")
public class ExamDB extends ActionForm {
    
    @Id
    @GeneratedValue
    private int id;
    private int examid;
    private String subject;
    private ArrayList questions;
    private ArrayList students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExamid() {
        return examid;
    }

    public void setExamid(int examid) {
        this.examid = examid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList questions) {
        this.questions = questions;
    }

    public ArrayList getStudents() {
        return students;
    }

    public void setStudents(ArrayList students) {
        this.students = students;
    }
    
}
