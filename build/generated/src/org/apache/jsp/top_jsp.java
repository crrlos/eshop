package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.e_shop.procesos.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    HttpServletResponse httpResponse = (HttpServletResponse) response;
    httpResponse.setHeader("Cache-Control", "no-store");
   
    int error = -1;
    try
    {
        error= Integer.parseInt(request.getParameter("error"));
    }
    catch(NumberFormatException nfe)
    {
        
    }
    

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/E_SHOP/css/estilo.css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>E SHOP</title>\n");
      out.write("        <link type=\"text/css\" href=\"./css/zoomy.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"./css/zoomy.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function() {\n");
      out.write("                $('.zoom').zoomy();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"login\">\n");
      out.write("                ");

                    HttpSession s = request.getSession();
                    if( s.getAttribute("idusuario") == null){
                        
      out.write("\n");
      out.write("                    \n");
      out.write("                <form action=\"login.jsp\" method=\"post\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <font size =\"2\" >Usuario</font>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"usuario\" id=\"loginform\">\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <font size =\"2\" >Contraseña</font>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"password\" name=\"clave\" id=\"loginform\" >\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"submit\" value=\"entrar\" >\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                </form>\n");
      out.write("                    ");

                    if( error == 0)
                    {
                        out.println("error");
                    }
                    if( error == 1)
                    {
                        out.println("no se encontró el usuario en la base de datos");
                    }
                    }
                    else
                        out.println("bienvenido  "+s.getAttribute("Nombre")+" "
                                + "<a href='logout.jsp'>Cerrar Sesión</a>");
                    
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id =\"header\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                    <div id=\"cssmenu\">\n");
      out.write("    <ul>\n");
      out.write("        ");

            
            
            Conexion conn = new ConexionPool();
            
            conn.getConexion();
            
            Operaciones.setConexion(conn);
            ResultSet rs = Operaciones.consultar("select * from categorias");

            ResultSet rs2;//variable que almacena el resultado de las subcategorias de cada categoria
//inicia el llenado del menú
            while (rs.next()) {
                rs2 = Operaciones.consultar("select * from sub_categorias where idcategoria = "
                        + rs.getString("idcategoria"));

                out.println("<li class='active has-sub'><a href='#'>" + rs.getString(2) + "</a>");
                out.println("<ul>");
                while (rs2.next()) {
                    out.println("<li class='last'><a href='url.jsp?id=" + rs2.getString("idsub_categoria") + "'>"
                            + rs2.getString("nombre_subcategoria") + ""
                            + "</a>");
                }
                out.println("</li>");
                out.println("</ul>");
            }
//finaliza el llenado del menú
        
      out.write("\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
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
