package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Log_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image:url(\"img/Wallpaper/Capture.PNG\"); \n");
      out.write("                color:#99ff99;\n");
      out.write("                height:auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body link=\"#ffcccc\">\n");
      out.write("        <h1 align='left' >Log_in Page</h1>\n");
      out.write("        <form action=\"Chckusr\" method=\"post\">\n");
      out.write("            <pre>\n");
      out.write("            <h1 align='left'</h1> \n");
      out.write("\n");
      out.write("        User Id  : <input type=\"text\" name=\"uid\" value=\"\"/>\n");
      out.write("        Password : <input type=\"password\" name=\"pass\" value=\"\"/>\n");
      out.write("       \n");
      out.write("        User Type: <select name=\"utype\">\n");
      out.write("        <option>Admin</option>\n");
      out.write("        <option>Student</option>\n");
      out.write("            </select>   \n");
      out.write("        <input type=\"submit\" value=\"Login now\"/> \n");
      out.write("        <a href=\"Registration.jsp\">New User Register Here</a>\n");
      out.write("\n");
      out.write("            </pre>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
