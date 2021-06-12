<%@include file="header.jsp" %>
<html>
    <body>
        <h3>User Registration Form</h3>
        <form action="Register" method="Post">
            <pre>
User Id   :  <input type="text" name="uid"/>           
User Name :  <input type="text" name="unm"/>
Address   :  <input type="text" name="add"/>
Mobile No :  <input type="text" name="mob"/>
User Type :  <select name="utype"/>
<option>Buyer</option>
<option>Seller</option>
</select>
Password  :  <input type="password" name="pass"/>
             <input type="submit" value="Save"/>
            </pre>
        </form>
    </body>
    </html>
<%@include file="footer.jsp" %>
