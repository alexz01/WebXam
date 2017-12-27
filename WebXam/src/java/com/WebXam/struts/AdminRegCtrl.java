/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.struts;

import com.WebXam.Hibernate.AdminDBControl;
import com.WebXam.bean.AdminDB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


/**
 *
 * @author Alex
 */
public class AdminRegCtrl extends Action {

    private static final String REGISTER_SUCCESS = "success";
    private static final String REGISTER_FAIL = "fail";
    private String admin_name;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        AdminDB adb = (AdminDB) form;
        AdminDBControl adc = new AdminDBControl();
        if (!adc.exists(adb)) {
            HttpSession http_session = request.getSession();
            
            http_session.setAttribute("admin_id", adb.getAdmin_id());
            http_session.setAttribute("workspace", adb.getWorkspace());
            adc.save(adb);
            System.out.println("indicate "+adb.getAdmin_id()+" "+adb.getPassword()+" "+adb.getWorkspace());
            return mapping.findForward(REGISTER_SUCCESS);
        } else {
            
            return mapping.findForward(REGISTER_FAIL);
        }
    }
    
    
}
