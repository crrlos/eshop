<%
    HttpSession s = request.getSession();
    String url = "";
    if (s.getAttribute("url") != null) {
        url = "?sc="+ s.getAttribute("url").toString();
    }
    s.invalidate();
    response.sendRedirect("index.jsp"+url);
    %>