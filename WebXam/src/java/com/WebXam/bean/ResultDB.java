/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author Alex
 */
@Entity
@Table(name="ResultDB")
public class ResultDB extends ActionForm{
    @Id
    private int resultid;
    private int studentid;
    private int marks;
    private char pass;
    private String comment;

    public int getResultid() {
        return resultid;
    }

    public void setResultid(int resultid) {
        this.resultid = resultid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getPass() {
        return pass;
    }

    public void setPass(char pass) {
        this.pass = pass;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
