<%@page import="java.sql.ResultSet"%>
<%@page import="com.e_shop.procesos.ConexionPool"%>
<%@page import="com.e_shop.procesos.Operaciones"%>
<%@page import="com.e_shop.procesos.Conexion"%>
<jsp:include page="top.jsp" />
<%!
    public String formatoDescripcion(String s) {
        String cadena = "";
        for (int i = 0; i < s.length(); ++i) {

            if (s.charAt(i) == '~') {
                cadena += "<br><b>";

            } else if (s.charAt(i) == ':') {
                cadena += ":</b>";

            } else {
                cadena += String.valueOf(s.charAt(i));
            }

        }

        return cadena;
    }
%>
<%
    int detalle = 0;
    try {
        detalle = Integer.parseInt(request.getParameter("id"));
    } catch (NumberFormatException nfe) {
        nfe.printStackTrace();
    }

    Conexion conn = new ConexionPool();
    conn.getConexion();
    Operaciones.setConexion(conn);

    ResultSet rs = Operaciones.consultar("select * from productos where idproducto =" + detalle);
    rs.next();
    out.println("<center><h1>" + rs.getString("nombre") + "</h1></center>");
    out.println("<table>"
            + "<tr>"
            + "<td>");
    out.println("<a href='" + rs.getString("imagen") + "' class='zoom'><img src='" + rs.getString("imagen") + "' width=500 /></a>"
            + "</td>"
            + "<td>"//descripcion

            + formatoDescripcion(rs.getString("detalle"))
            + "</td>"
            + "</tr>");
    out.println("</table>");


%>

<jsp:include page="down.jsp" />