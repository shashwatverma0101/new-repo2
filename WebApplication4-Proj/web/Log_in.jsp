<%-- 
    Document   : Log_in
    Created on : Apr 12, 2017, 4:31:10 PM
    Author     : DELL
--%>
<html>
    <head>
        <style>
            body{
                background-image:url("img/Wallpaper/Capture.PNG"); 
                color:#99ff99;
                height:auto;
            }
            
        </style>
    </head>
    <body link="#ffcccc">
        <h1 align='left' >Log_in Page</h1>
        <form action="Chckusr" method="post">
            <pre>
            <h1 align='left'</h1> 

        User Id  : <input type="text" name="uid" value=""/>
        Password : <input type="password" name="pass" value=""/>
       
        User Type: <select name="utype">
        <option>Admin</option>
        <option>Student</option>
            </select>   
        <input type="submit" value="Login now"/> 
        <a href="Registration.jsp">New User Register Here</a>

            </pre>
        </form>
    </body>
</html>