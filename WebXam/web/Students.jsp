<%-- 
    Document   : Students
    Created on : 23 Mar, 2015, 8:39:27 AM
    Author     : Alex
--%>

<%@page import="com.WebXam.bean.StudentDB"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student list</title>
    </head>
    <body>
        <h1>Students:</h1>
        <div style="float: right; border: solid thin lightsteelblue; position: absolute; left:25%;">
            <%
                List StudentList = (List) request.getSession().getAttribute("studentlist");
                Iterator iterator = StudentList.iterator();
            %>
            <table border="1">

                <thead>
                    <tr>
                        <td>Id</td>
                        <td>Institute</td>
                        <td>First name</td>
                        <td>Middle name</td>
                        <td>Last name</td>
                        <td>CGPA</td>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (iterator.hasNext()) {
                            StudentDB sdb = (StudentDB) iterator.next();
                    %>
                    <tr>
                        <td><%=sdb.getStudentid()%></td>
                        <td><%=sdb.getInstitute()%></td>
                        <td><%=sdb.getFname()%></td>
                        <td><%=sdb.getMname()%></td>
                        <td><%=sdb.getLname()%></td>
                        <td><%=sdb.getCgpa()%></td>

                    </tr>
                    <%
                        }
                    %>

                </tbody>
            </table>


        </div>
    </body>
</html>
