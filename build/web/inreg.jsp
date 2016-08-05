<jsp:include page="top.jsp" />
<div id="cuerpo">

    <%
        int op = 0;
        try {
            op = Integer.parseInt(request.getParameter("op"));
        } catch (NumberFormatException nfe) {

        }
        if (op == 1) {
    %>

    <form action="login.jsp" method="get">
        
           
                    <table align="center">
                        <tr>
                            <td>
                                Nombre de Usuario:
                            </td>
                            <td>
                                <input type="text" name="usuario">
                            </td>

                        </tr>
                        <tr>
                            <td>
                                Contraseña:
                            </td>
                            <td>
                                <input type="password" name="clave">
                            </td>
                        </tr>
                        <tr><td><input type="submit" value="enviar"></td></tr>

                    </table>
           
       
    </form>
    <%
        }
    %>
</div>
<jsp:include page="down.jsp" />