<%@page import="java.util.Vector"%>
<%@page import="com.e_shop.entidades.Pedidos"%>
<%@page import="com.e_shop.entidades.Categorias"%>
<%@page import="com.e_shop.entidades.Roles"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.e_shop.entidades.Usuarios"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.e_shop.procesos.*"%>
<%

    String var = "";
    ResultSet rs;
    Conexion conn = new ConexionPool();
    Operaciones.setConexion(conn);
    HttpSession sesion = request.getSession();
    String usuario = request.getParameter("usuario");
    String clave = request.getParameter("clave");
    String url = "";
    String id ="";
    if (sesion.getAttribute("url") != null) {
        url = "?sc=" + sesion.getAttribute("url").toString();
    }

    if (usuario == "" || clave == "") {
        response.sendRedirect("index.jsp" + url);
    }

    rs = Operaciones.consultar("select * from usuarios where nombreusuario ='"+usuario+"'");
   if(rs.next())
   {
       
       id = rs.getString("idusuario");
   }
    
    if (conn != null) {
        HashMap hpUsuario = Operaciones.getRegistro(new Usuarios(), id);

        if (!hpUsuario.isEmpty()) {

            if (hpUsuario.get("clave").equals(clave)) {

                sesion.setAttribute("idusuario", hpUsuario.get("idusuario"));
                sesion.setAttribute("Nombre", hpUsuario.get("nombres"));
                sesion.setAttribute("rol", hpUsuario.get("idrol"));

                response.sendRedirect("index.jsp" + url);
            } else {
                response.sendRedirect("index.jsp?error=0");
            }
        } else {
            response.sendRedirect("index.jsp?error=1");
        }

    }

%>
