/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.Hibernate;

import com.WebXam.bean.AdminDB;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Alex
 */
public class AdminDBControl {

    Configuration config;
    SessionFactory sessionFactory;
    Session hibernate_Session;
    Transaction hibernate_transaction;
    AdminDB admindb;

    public AdminDBControl() {
        config = new AnnotationConfiguration();
        config.configure("com/WebXam/Hibernate/hibernate.cfg.xml");
        sessionFactory = config.buildSessionFactory();
        hibernate_Session = sessionFactory.openSession();
        hibernate_transaction = hibernate_Session.beginTransaction();
    }

    public String verify(AdminDB adminBean) {

        admindb = (AdminDB) hibernate_Session.get(AdminDB.class, adminBean.getAdmin_id());
        if (admindb != null && admindb.getPassword().equals(adminBean.getPassword())) {
            hibernate_transaction.commit();
            return admindb.getWorkspace();
        }

        hibernate_transaction.commit();
        return null;
    }

    public boolean exists(AdminDB adminBean) {
        if (hibernate_Session.get(AdminDB.class, adminBean.getAdmin_id()) != null) {
            return true;
        }
        return false;
    }
    
    public void save(AdminDB adminBean){
        hibernate_Session.save(adminBean);
        hibernate_transaction.commit();
    }

    public void closeSession() {
        hibernate_Session.close();
    }
}
