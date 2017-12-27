<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%
        if (session != null) {
            session.invalidate();
        }
    %>
<form name="adminlogin" action="adminlogin.do" method="POST">
    Admin id <input type="text" name="admin_id" value="" size="30" /><br>
    Password <input type="password" name="password" value="" size="30" /><br>
    <input type="submit" value="Login" name="loginButton" /><br>
    <h2><a href="admin_reg.jsp">Register Workspace</a></h2>
    
</form>
