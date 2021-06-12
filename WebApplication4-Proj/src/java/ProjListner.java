/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 * @author DELL
 */
@WebListener()
public class ProjListner implements ServletContextListener {
        Connection con;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName("com.jdbc.mysql.Driver"); 
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
            sce.getServletContext().setAttribute("mycon",con);
        } catch (SQLException ex) {
            Logger.getLogger(ProjListner.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjListner.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProjListner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
