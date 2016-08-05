<%@page import="java.sql.ResultSet"%>
<%@page import="com.e_shop.procesos.*"%>

<%
    response.setHeader( "Pragma", "no-cache" );
    response.setHeader( "Cache-Control", "no-cache" );
    response.setDateHeader( "Expires", 0 );
   
    int error = -1;
    try
    {
        error= Integer.parseInt(request.getParameter("error"));
    }
    catch(NumberFormatException nfe)
    {
        
    }
    ResultSet rs;
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/E_SHOP/css/estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E SHOP</title>
        <link type="text/css" href="./css/zoomy.css" rel="stylesheet">

        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.js"></script>
        <script type="text/javascript" src="./css/zoomy.min.js"></script>
        <script type="text/javascript">
            $(function() {
                $('.zoom').zoomy();
            });
        </script>
    </head>
    <body>
        <div id="wrapper">
            
            <div id="login">
                <%
                    HttpSession s = request.getSession();
                    if( s.getAttribute("idusuario") == null){
                        %>
                    
                <form action="login.jsp" method="post">
                <table>
                    <tr>
                        <td>
                            <font size ="2" >Usuario</font>
                        </td>
                        <td>
                            <font size ="2" >Contraseña</font>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="text" name="usuario" id="loginform">
                        </td>
                        
                        <td>
                            <input type="password" name="clave" id="loginform" >
                        </td>
                    
                        <td>
                            <input type="submit" value="entrar" >

                        </td>


                    </tr>
                    

                </table>
                </form>
                    <%
                    if( error == 0)
                    {
                        out.println("<font color=red size=3>la contraseña no es correcta</font>");
                    }
                    if( error == 1)
                    {
                        out.println("<font color=red size =3>no se encontró el usuario en la base de datos</font>");
                    }
                    }
                    else
                        out.println("<font size = '5' ><b>Bienvenido </b>"+s.getAttribute("Nombre")+"</font> "
                                + "<a href='logout.jsp'>cerrar sesión</a>");
                    %>
                    
                   

            </div>
                    
                    <div id="carrito">
                        <a href="carrito.jsp">
                        <img src="./imagenes/carrito.jpg" height="40"></a>
                        <%
                           if ( s.getAttribute("idusuario") != null){
                            rs = Operaciones.consultar("select count(idproducto) from detalle_pedidos");
                            rs.next();
                            out.println("("+rs.getString("count(idproducto)")+")");}
                    %>
                    
                    </div>
            <div id ="header">


                <img src="./imagenes/descarga.jpg" height="60" id="logo">
               <h4><nav>
                        <a href ="index.jsp" id="letra">Inicio </a>|| <a href="" id="letra">Regístrese </a>|| <a href="" id="letra"> ¿Cómo Pagar?</a>
                                                                                           
                   </nav> </h4>
                    



                
            </div>
                    <div id="cssmenu">
    <ul>
        <%
            
            
            Conexion conn = new ConexionPool();
            
            conn.getConexion();
            
            Operaciones.setConexion(conn);
            rs = Operaciones.consultar("select * from categorias");

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
        %>

    </ul>

</div>

