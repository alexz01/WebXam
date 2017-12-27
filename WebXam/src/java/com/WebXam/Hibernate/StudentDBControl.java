/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.Hibernate;

import com.WebXam.bean.AdminDB;
import com.WebXam.bean.StudentDB;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Alex
 */
public class StudentDBControl {
    
    Configuration config;
    SessionFactory sessionFactory;
    Session hibernate_Session;
    Transaction hibernate_transaction;
    AdminDB admindb;

    public StudentDBControl() {
        config = new AnnotationConfiguration();
        config.configure("com/WebXam/Hibernate/hibernate.cfg.xml");
        sessionFactory = config.buildSessionFactory();
        hibernate_Session = sessionFactory.openSession();
        hibernate_transaction = hibernate_Session.beginTransaction();
    }
    
    public List getAllStudents(){
        return hibernate_Session.createQuery("FROM StudentDB").list();
    }
    
   

    public void closeSession() {
        hibernate_Session.close();
    }
    public static void main(String[] args) {
        StudentDBControl sdc = new StudentDBControl();
        List students = sdc.getAllStudents();
        Iterator i = students.iterator();
        while(i.hasNext()){
            StudentDB sdb = (StudentDB)i.next();
            System.out.println(""+sdb.getFname()+" "+sdb.getLname());
        }
    }
}
