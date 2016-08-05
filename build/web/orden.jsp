<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.e_shop.procesos.Conexion"%>
<%@page import="com.e_shop.procesos.ConexionPool"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.e_shop.entidades.Pedidos"%>
<%@page import="com.e_shop.procesos.Operaciones"%>
<%@page import="com.e_shop.entidades.Detalle_Pedidos"%>
<%

    int id = 0;
    int idusuario;
    double precio;

    ResultSet rs = null;

    try {
        id = Integer.parseInt(request.getParameter("id"));
    } catch (NumberFormatException nfs) {

    }

    HttpSession s = request.getSession();
    if (s.getAttribute("idusuario") != null) {
        idusuario = Integer.parseInt(s.getAttribute("idusuario").toString());
        rs = Operaciones.consultar("select * from pedidos where idcliente ='" + idusuario + "'and estado ='pendiente'");
        if (!rs.next()) {
            Pedidos p = new Pedidos(idusuario, "pendiente");
            Operaciones.insertar(p);
            rs = Operaciones.consultar("select * from pedidos,productos where idcliente='" + idusuario + "'"
                    + " and estado = 'pendiente' and idproducto ='" + id + "'");
            rs.next();
            Detalle_Pedidos dp = new Detalle_Pedidos(rs.getInt("idpedido"), id, 1, rs.getDouble("precio"));
            Operaciones.insertar(dp);

        } else {

            rs = Operaciones.consultar("select * from detalle_pedidos where idproducto ='" + id + "'");
            if (rs.next()) {
                int cantidad = rs.getInt("cantidad");

                ++cantidad;
                out.println(cantidad);

                out.println();
                Detalle_Pedidos dp = new Detalle_Pedidos(rs.getInt("idpedido"), rs.getInt("idproducto"), cantidad, rs.getDouble("precio"));
                Operaciones.actualizar(dp, rs.getString("iddetalle_pedido"));

            }
            else
            {
                rs = Operaciones.consultar("select * from pedidos,productos where idcliente ='" + idusuario + "'and estado ='pendiente'"
                        + "and idproducto = "+id);
                rs.next();
                Detalle_Pedidos dp = new Detalle_Pedidos(rs.getInt("idpedido"),id,1,rs.getDouble("precio"));
                Operaciones.insertar(dp);
            }

        }

    }
    response.sendRedirect("carrito.jsp");

%>