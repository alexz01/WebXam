<%-- 
    Document   : QuestionsList
    Created on : 23 Mar, 2015, 9:38:20 PM
    Author     : Alex
--%>

<%@page import="com.WebXam.bean.QuestionDB"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question DB</title>
    </head>
    <body>
        <h1>Question DB: </h1>
        <div style="float: right; border: solid thin lightsteelblue; position: absolute; left:25%;">
            <%
                List StudentList = (List) request.getSession().getAttribute("questionlist");
                Iterator iterator = StudentList.iterator();
            %>
            <table border="1">

                <tbody>
                    <%
                        while (iterator.hasNext()) {
                            QuestionDB qdb = (QuestionDB) iterator.next();
                    %>
                    <tr>
                        <td><%=qdb.getQuestionid()%></td>
                        <td><%=qdb.getQtype()%></td>
                        <td><%=qdb.getQuestion()%></td>
                        <td><%=qdb.getOptionA()%></td>
                        <td><%=qdb.getOptionB()%></td>
                        <td><%=qdb.getOptionC()%></td>
                        <td><%=qdb.getOptionD()%></td>
                        <td><%=qdb.getCorrect()%></td>
                        <td><%=qdb.getAttempted() %></td>
                        <td><%=qdb.getCorrectattempt()%></td>
                        <td><%=qdb.getDifficulty()%></td>

                    </tr>
                    <%
                        }
                    %>

                </tbody>
            </table>


        </div>
    </body>
</html>
