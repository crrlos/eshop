<%
    
    
    String id = request.getParameter("id");
    HttpSession s = request.getSession();
    s.setAttribute("url", id);
    
    response.sendRedirect("index.jsp?sc=" + id);

%>