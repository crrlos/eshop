
<%@page import="java.util.Vector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.e_shop.entidades.*"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.e_shop.procesos.*"%>
<jsp:include page="top.jsp"/>





<div id="cuerpo">

    <%
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


    %>
    <table  align ="center" >
        <tr>
            <%                int i = 1;
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
            %>
        </tr>
    </table>



</div>

<jsp:include page="down.jsp"/>

