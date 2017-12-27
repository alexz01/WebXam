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
public class AdminLoginCtrl extends Action {

    private static final String LOGIN_SUCCESS = "success";
    private static final String LOGIN_FAIL = "fail";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        AdminDB adb = (AdminDB) form;
        AdminDBControl adc = new AdminDBControl();
        String workspace = adc.verify(adb);
        if ( workspace != null) {
            HttpSession http_session = request.getSession();

            http_session.setAttribute("admin_id", adb.getAdmin_id());
            http_session.setAttribute("workspace", workspace);
            return mapping.findForward(LOGIN_SUCCESS);
        } else {
            return mapping.findForward(LOGIN_FAIL);
        }
    }
}
