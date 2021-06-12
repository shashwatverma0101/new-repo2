package EShops.src.java.shops;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class CheckUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
String uid=request.getParameter("uid");
String pass=request.getParameter("pass");
Connection con=(Connection)this.getServletContext().getAttribute("mycon");
PreparedStatement ps=con.prepareStatement("select * from users where userid=? and password=?");
ps.setString(1, uid);
ps.setString(2, pass);
ResultSet rs=ps.executeQuery();
boolean found=rs.next();
            if(found){
            String unm=rs.getString(2);
            request.getSession().setAttribute("username", unm);
            String utype=rs.getString(5);
            String status=rs.getString(7);
            
            if(status.equalsIgnoreCase("Approved")){
                        if(utype.equalsIgnoreCase("Buyer"))
                            response.sendRedirect("buyershome.jsp");
                        else
                            response.sendRedirect("sellershome.jsp");
            }
            else{
                    out.println("<h2>U r not authorised user....");
            }
                
            }
            else{
            if(uid.equals("admin") && pass.equals("ssi"))
                response.sendRedirect("adminhome.jsp");
            else
            {
                out.println("<h2>Invalid User Details....</h2>");
                out.println("<a href=login.jsp>Try-Again</a>");
            }
            }
                
        
        
        } catch (SQLException ex) {
            Logger.getLogger(CheckUser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
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
