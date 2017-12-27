/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebXam.struts;

import com.WebXam.Hibernate.QuestionDBControl;
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
public class QuestionFW extends Action {

    private static final String QUESTIONS = "questions";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        QuestionDBControl qdc = new QuestionDBControl();
        HttpSession hSession = request.getSession();
        hSession.setAttribute("questionlist", qdc.getAllQuestions());
        
        return mapping.findForward(QUESTIONS);
    }
}
