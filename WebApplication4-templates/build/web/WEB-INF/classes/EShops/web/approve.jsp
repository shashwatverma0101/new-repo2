<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%
Connection con=(Connection)application.getAttribute("mycon");
ResultSet rs=con.createStatement().executeQuery("select * from users where status='New'");
%>
<html>
    <body>
        <h3>List of Users Pending for Approval</h3>
        <form action="ApproveUser">
        
        <table border="4" width="3" cellspacing="4" cellpadding="3">
            <thead>
                <tr>
                    <th>User Id</th>
                    <th>User Name</th>
                    <th>User Type</th>
                    <th>Approve</th>
                </tr>
            </thead>
            <tbody>
<%
while(rs.next()){
            String uid=rs.getString(1);
            String unm=rs.getString(2);
            String utype=rs.getString(5);
%>
                <tr>
                    <td><%=uid%></td>
                    <td><%=unm%></td>
                    <td><%=utype%></td>
                    <td align="center"><input type="checkbox" name="st" value="<%=uid%>" /></td>
                </tr>
<%
}
%>                
<tr>
    <td></td><td></td><td colspan="2"><input type="submit" value="Approve User" /></td>
    
</tr>         
            </tbody>
        </table>
</form>
    </body>
</html>
