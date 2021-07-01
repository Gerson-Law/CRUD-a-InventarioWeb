package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("        ");

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Acceso</title>\n");
      out.write("        <link href=\"bots/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bots/css/estiloLogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"cuadro\">\n");
      out.write("            <div id=\"cabeza\"><center>Sign In</center></div>\n");
      out.write("            <div id=\"cuerpo\"><form class=\"form-horizontal\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Usuario</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" placeholder=\"User\" name=\"txt_username\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Contraseña</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" placeholder=\"Password\" name=\"txt_password\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success pull-right\" name=\"btn_ingresar\">Sign in</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("</form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
