<%-- 
    Document   : admin_reg
    Created on : 22 Mar, 2015, 6:11:01 PM
    Author     : Alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a workspace</title>
    </head>
    <body>
        <h1>Create your workspace</h1>
        <form name="registerworkspace" action="registerworkspace.do" method="POST">
            Workspace name <input type="text" name="workspace" value="" size="40" /><br>
            AdminId <input type="text" name="admin_id" value="" size="30" /><br>
            Password <input type="password" name="password" value="" size="30" /><br>
            Confirm Password <input type="password" name="confirm passowrd" value="" size="30" /><br>
            <input type="submit" value="Register" name="registerButton" />
            
        </form>
    </body>
</html>
