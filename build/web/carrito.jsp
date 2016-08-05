<%@page import="com.e_shop.entidades.Detalle_Pedidos"%>
<%@page import="com.e_shop.entidades.Pedidos"%>
<%@page import="com.e_shop.procesos.Operaciones"%>
<%@page import="java.sql.ResultSet"%>
<jsp:include page="top.jsp"/>

<%response.setHeader( "Pragma", "no-cache" );
    response.setHeader( "Cache-Control", "no-cache" );
    response.setDateHeader( "Expires", 0 );
 %>
    
    
<div id="carritocompras">
    <% 
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
    %>
    
    <form action="opcarrito.jsp" method="get">
    <table align="center" id="tablacarrito" >
        <tr>
            <th id="th"> ID</th>
            <th id="th"> Artículo</th>
            <th id="th">Cantidad</th>
            <th id="th">Precio</th>
            <th id="th">Total</th>
            <th id="th">X</th>
        </tr>
        
    <%
    
   
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
            out.println("<td>");
            out.println("<b>Total</b>");
            out.println("</td>");
            out.println("<td>");
            out.println("</td>");
            out.println("<td>");
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
        
        
    
    
            %>
   
</div>

<jsp:include page="down.jsp"/>
    
