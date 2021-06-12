<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.jsp" %>
<%
Connection con=(Connection)application.getAttribute("mycon");
ResultSet rs=con.createStatement().executeQuery("select * from product_category");
%>
<html>
    <body>
        <h3><u>List of Product Categories</u></h3>
<%
while(rs.next()){
%>
<a href="showProducts.jsp?pcid=<%=rs.getString(1)%>"><%=rs.getString(2)%></a><br>        
<%
}
%>

    </body>
</html>
<%@include file="footer.jsp" %>