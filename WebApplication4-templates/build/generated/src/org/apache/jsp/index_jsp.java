package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Calm breeze login screen</title>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body link=\"#ffffcc\">\n");
      out.write("  <div class=\"wrapper\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1>Welcome</h1>\n");
      out.write("\t\t\n");
      out.write("\t\t<form class=\"form\">\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"Username\">\n");
      out.write("\t\t\t<input type=\"password\" placeholder=\"Password\">\n");
      out.write("\t\t\t<button type=\"submit\" id=\"login-button\">Login</button><br><br><br>\n");
      out.write("                         <a href=\"registration.jsp\">New user register here</a>\n");
      out.write("\t\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("     <ul class=\"bg-bubbles\">\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t\t<li></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("    <script src=\"js 1/index.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
