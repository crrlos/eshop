package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.e_shop.entidades.Detalle_Pedidos;
import com.e_shop.entidades.Pedidos;
import com.e_shop.procesos.Operaciones;
import java.sql.ResultSet;

public final class carrito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write('\n');
      out.write('\n');
response.setHeader( "Pragma", "no-cache" );
    response.setHeader( "Cache-Control", "no-cache" );
    response.setDateHeader( "Expires", 0 );
 
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div id=\"carritocompras\">\n");
      out.write("    ");
 
    HttpSession s = request.getSession();
    if( s.getAttribute("idusuario") != null){
    String sql = "select d.iddetalle_pedido, d.idproducto, p.nombre,d.cantidad,d.precio, d.precio*d.cantidad as total from detalle_pedidos d,productos p "
            + "where d.idproducto = p.idproducto";
    ResultSet rs = Operaciones.consultar(sql);
    double total = 0.0;
    if(!rs.next())
        out.println("<center><h2>carrito vacío</h2></center>");
    else{
        rs.beforeFirst();
    
      out.write("\n");
      out.write("    \n");
      out.write("    <form action=\"opcarrito.jsp\" method=\"get\">\n");
      out.write("    <table align=\"center\"  >\n");
      out.write("        <tr>\n");
      out.write("            <th id=\"th\"> ID</th>\n");
      out.write("            <th id=\"th\"> Artículo</th>\n");
      out.write("            <th id=\"th\">Cantidad</th>\n");
      out.write("            <th id=\"th\">Precio</th>\n");
      out.write("            <th id=\"th\">Total</th>\n");
      out.write("            <th id=\"th\">X</th>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("    ");

    
   
    while(rs.next())
    {
        
        out.println("<tr>");
        
            out.println("<td id='tdcarrito'>");
            
                 out.println(rs.getString("idproducto"));
            out.println("</td>");
            
            
            
            out.println("<td id='tdcarrito'>");
                 out.println(rs.getString("nombre"));
            out.println("</td>");
            
            
            
            out.println("<td id='tdcarrito'>");
                out.println("<input type='text' name='txtcantidad' value = '"+rs.getInt("cantidad")+"' id='txtcantidad'>");
            out.println("</td>");
            
            out.println("<td id='tdcarrito'>");
                out.println(rs.getString("precio"));
            out.println("</td>");
            
            out.println("<td id='tdcarrito'>");
                out.println(rs.getString("total"));
                total += rs.getDouble("total");
            out.println("</td>");
            
            out.println("<td id='tdcarrito'>");
               out.println("<input type='checkbox' name='check' value='"+rs.getInt("iddetalle_pedido")+"' >");
            out.println("</td>");
            
            out.println("<td id='tdcarrito'>");
                 out.println("<input type='hidden' name='iddetalle' value='"+rs.getInt("iddetalle_pedido")+"'>");
            out.println("</td>");
          
        out.println("</tr>");
        
    }
        out.println("<tr id= 'th'>");
        
            out.println("<td");
            out.println("</td>");
            out.println("<td>");
            out.println("</td>");
            out.println("<td id='tdcarrito'>");
            out.println("<b>Total</b>");
            out.println("</td>");
            out.println("<td>");
            out.println("</td>");
            out.println("<td id='th'>");
            out.println("<b>"+total+"</b>");
            out.println("</td>");
            out.println("<td>");
            out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>");
        out.println("<input type='submit' value='actualizar' name='operacion'>");
        out.println("</td>");
        out.println("<td>");
        out.println("<input type='submit' value='remover' name='operacion'>");
        out.println("</td>");
        out.println("</tr>");
        out.println("</table></form>");
        
    }
    }
        
        
    
    
            
      out.write("\n");
      out.write("   \n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "down.jsp", out, false);
      out.write("\n");
      out.write("    \n");
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
