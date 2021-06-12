/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class Chckusr extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          String uid=request.getParameter("uid");
            String password=request.getParameter("pass");
            String utype=request.getParameter("utype");
            
           if(utype.equals("Admin")){
                if(uid.equals("s123") && password.equals("priya12"))
                response.sendRedirect("Admin proj.jsp");
                else{
                    out.println("<h2>Invalid Admin Details..</h2>");
                    out.println("<a href=Log_in.jsp>Try-Again</a>");
                    }
                 }
           else if(utype.equals("Student")){
         Connection con=(Connection)this.getServletContext().getAttribute("mycon");
        // Class.forName("com.mysql.jdbc.Driver");
         //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
         PreparedStatement ps=con.prepareStatement("select * from student where std_id=? and password=?");
         ps.setString(1, uid);
         ps.setString(2, password);
         ResultSet rs=ps.executeQuery();
         boolean found=rs.next();
                if(found)
                    response.sendRedirect("studentHome.jsp");
                else{
                    out.println("<h2>Invalid Student Details..</h2>");
                    out.println("<a href=Log_in.jsp>Try-Again</a>");
                    }                
     }
        } catch (SQLException ex) {
            Logger.getLogger(Chckusr.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
