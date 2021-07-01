// Elena Abarca 
<%-- 
    Document   : Login
    Created on : 1/07/2021, 12:55:19 PM
    Author     : 15bs040la
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%
	            //Al hacer click en el botón ingresar
	            if (request.getParameter("btn_ingresar") != null) 
	            {
	                //Crea dos strings, una para el user y otra para el password.
	                String username = request.getParameter("txt_username");
	                String password = request.getParameter("txt_password");
	                
	                //Si ambas son "admin"...
	                if (username.equals("Dorado")&&password.equals("Rojomora"))
	                {
	                    //Redirecciona al servlet 'crear_departamento.do'
	                    response.sendRedirect("Inicio.jsp");
	                }
	                //Si no...
	                else
	                {
	                    //Muestra un mensaje javascript señalando que hay daros erróneos
	                    out.println("<script>alert('Usuario o contraseña incorrecta');</script>");
	                }
	            }
//contenido		    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso</title>
        <link href="bots/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="bots/css/estiloLogin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="cuadro">
            <div id="cabeza"><center>Sign In</center></div>
            <div id="cuerpo"><form class="form-horizontal">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">Usuario</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputEmail3" placeholder="User" name="txt_username">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">Contraseña</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="txt_password">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-success pull-right" name="btn_ingresar">Sign in</button>
                        </div>
                    </div>
</form>
            </div>
        </div>
    </body>
</html>
