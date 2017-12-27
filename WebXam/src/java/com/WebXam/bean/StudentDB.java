/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.bean;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author Alex
 */
@Entity
@Table(name="STUDENTDB")
public class StudentDB extends ActionForm{
    @Id
    private int studentid;
    private String fname;
    private String mname;
    private String lname;
    private String institute;
    private float cgpa;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
    

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    
}
