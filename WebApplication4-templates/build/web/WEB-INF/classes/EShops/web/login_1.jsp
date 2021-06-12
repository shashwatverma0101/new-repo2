<%@include file="header.jsp" %>
<%
int i=10;
String name="SSi";
%>
<html>
    <body>
        <form action="CheckUser" method="Post">
            <pre>
User Id : <input type="text" name="uid"/>
Password: <input type="password" name="pass"/>
          <input type="submit" value="Login"/>


<a href="registration.jsp">New User Register Here</a>
            </pre>
        </form>
        <%@include file="footer.jsp" %>        
    </body>
</html>
