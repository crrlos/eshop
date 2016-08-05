

<%@page import="com.e_shop.entidades.Roles"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.e_shop.entidades.Usuarios"%>
<%@page import="com.e_shop.procesos.*"%>
<%@page import="com.e_shop.entidades.Detalle_Pedidos"%>
<%
    
    Conexion conn = new ConexionPool();
    conn.getConexion();
    Operaciones.setConexion(conn);
    Roles r = new Roles("sjdflsdkf");
    out.println(Operaciones.actualizar(r,"2"));
   

    
    %>
