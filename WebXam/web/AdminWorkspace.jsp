<%-- 
    Document   : Admin Workspace
    Created on : 22 Mar, 2015, 8:42:16 PM
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Workspace</title>
        
    </head>
    <body>
        WorkSpace: <%=(String) session.getAttribute("workspace")%>
        <p>Welcome back <%=(String) session.getAttribute("admin_id")%></p>
        <form action="logout.do">
            <input type="submit" value="logout" />


        </form>

        <ul >
            <li> <form action="previousexams.do"> <input type="submit" value="PreviousExams" /> </form></li>
            <li> <form action="students.do"><input type="submit" value="Students" onclick="changeAction(this.value)"/></form></li>
            <li> <form action="results.do"><input type="submit" value="Results" onclick="changeAction(this.value)"/></form></li>
            <li> <form action="createexam.do"><input type="submit" value="CreateExam" onclick="changeAction(this.value)"/></form></li>
            <li> <form action="questionupload.do"><input type="submit" value="QuestionUpload" onclick="changeAction(this.value)"/></form></li>
            <li> <form action="questions.do"><input type="submit" value="Question DB" onclick="changeAction(this.value)"/></form></li>
        </ul>

    </body>
</html>
