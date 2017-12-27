/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.bean;

import javax.persistence.Column;
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
@Table(name = "ADMINDB")
public class AdminDB extends ActionForm {

    @Id
    private String admin_id;    
    
    private String password;
   
    private String workspace;

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }
}
