package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import java.sql.ResultSet;
import com.e_shop.entidades.*;
import java.util.HashMap;
import com.e_shop.procesos.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"cuerpo\">\n");
      out.write("\n");
      out.write("    ");

        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        ResultSet rs;

        HttpSession s = request.getSession();

        int sc = 0;
        try {
            sc = Integer.parseInt(request.getParameter("sc"));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }

        rs = Operaciones.consultar("select * from productos where idsub_categoria = " + sc);


    
      out.write("\n");
      out.write("    <table  align =\"center\" >\n");
      out.write("        <tr>\n");
      out.write("            ");
                int i = 1;
                while (rs.next()) {
                    if (i > 4) {
                        out.println("<tr>");
                        i = 1;
                    }
                    out.println("<td>");

                    out.println("<img src = '" + rs.getString("imagen") + "' heigth = '175' width = '175' /> <br> <b>"
                            + rs.getString("nombre") + "</b><br>"
                            + rs.getString("descripcion") + "<br>"
                            + "<a href='detalles.jsp?id=" + rs.getString("idproducto") + "'><font size=2>+detalles</font></a><br>"
                            + "<b>precio:</b> $" + rs.getString("precio") + "<br>");
                    out.println("<a href='orden.jsp?id=" + rs.getString("idproducto") + "'><img src='./imagenes/carrito.gif'></a></td>");
                    ++i;
                    if (i > 4) {
                        out.println("</tr>");
                    }

                }
            
      out.write("\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "down.jsp", out, false);
      out.write('\n');
      out.write('\n');
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
