<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.jsp" %>
<%
String pcid=request.getParameter("pcid");
Connection con=(Connection)application.getAttribute("mycon");
PreparedStatement ps=con.prepareStatement("select * from products where pcid=?");
ps.setString(1,pcid);
ResultSet rs=ps.executeQuery();
%>
<html>
    <body>
        <h3><u>List of Products</u></h3>
<%
while(rs.next()){
%>
<a href=""><%=rs.getString(2)%></a><br>        
<%
}
%>

    </body>
</html>
<%@include file="footer.jsp" %>