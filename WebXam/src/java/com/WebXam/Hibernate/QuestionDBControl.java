/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.Hibernate;

import com.WebXam.bean.AdminDB;
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
public class QuestionDBControl {
    Configuration config;
    SessionFactory sessionFactory;
    Session hibernate_Session;
    Transaction hibernate_transaction;
    AdminDB admindb;

    public QuestionDBControl() {
        config = new AnnotationConfiguration();
        config.configure("com/WebXam/Hibernate/hibernate.cfg.xml");
        sessionFactory = config.buildSessionFactory();
        hibernate_Session = sessionFactory.openSession();
        hibernate_transaction = hibernate_Session.beginTransaction();
    }
    
    public List getAllQuestions(){
        return hibernate_Session.createQuery("FROM QuestionDB").list();
    }
    
   

    public void closeSession() {
        hibernate_Session.close();
    }
}
