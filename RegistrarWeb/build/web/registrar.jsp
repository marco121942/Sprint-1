<%-- 
    Document   : registrar
    Created on : 02/10/2018, 10:22:52 AM
    Author     : Josue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Sregistro" method="POST">
            <table>
                
                <tr>
                    <td>Nombres</td>
                    <td><input type="text" name="nom" value=""></td>
                </tr>  
            
                <tr>
                    <td>Usuario</td>
                    <td><input type="text" name="usu" value=""></td>
                </tr>
                
                 <tr>
                    <td>Password</td>
                    <td><input type="password" name="pass" value=""></td>
                </tr>
                
                <tr>
                    <td><input type="submit"  value="Registrar"></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
