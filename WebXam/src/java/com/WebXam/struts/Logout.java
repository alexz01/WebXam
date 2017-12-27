/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Alex
 */
public class Logout extends Action{
    private static final String LOGOUT = "logout";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getSession().invalidate();
        
        return mapping.findForward(LOGOUT);
    }
    
}
