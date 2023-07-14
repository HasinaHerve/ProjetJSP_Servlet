package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"jquery-3.6.0.min.js\"></script>\n");
      out.write("\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>Profil</title>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #06140d;\">\n");
      out.write("    \n");
      out.write("  <div class=\"container-fluid bg-3 text-center\" style=\"background-color:#0c271a; position: fixed;\"></br></br>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <label class=\"control-label\" style=\"color: white;font-style: italic;font-size: 30px;\">");
      out.print(session.getAttribute("nomU"));
      out.write("</label>\n");
      out.write("      <input class=\"form-control\" type=\"date\" name=\"adresse\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </div></br></br> </br></br></br></br> \n");
      out.write("  <div class=\"container bg-3 text-center\" style=\" background-color:#0c271a; \">\n");
      out.write("    <div class=\"container text-center\" style=\"\">\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </br>\n");
      out.write("  <form class=\"form-horizontal\" action=\"Uservlet\" method=\"POST\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"container\"> \n");
      out.write("              <img src=\"D://FRONT//img.jpg\" class=\"img-circle\" alt=\"Photo de profil\" width=\"304\" height=\"236\"> \n");
      out.write("              <div class=\"text-center\">\n");
      out.write("                <input type=\"file\" name=\"pdp\" selectionDirection=\"image\">\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("            </div></br>       \n");
      out.write("      </form></br></br>     \n");
      out.write("  </div></br></br></br></br>\n");
      out.write("  <div class=\"container-fluid text-center\" style=\"background-color:#0c271a;\"></br></br>\n");
      out.write("    <div class=\"btn-group\">\n");
      out.write("          <div class=\"col-6\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default\" style=\"border: 1px solid #06140d; color: white; background-color:#006080;\">Enregistrer</button>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"col-6\" style=\"text-align: right;\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default\" style=\"border: 1px solid #06140d; color: white;background-color: #990000;\">Annuler</button>\n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("    </br></br>\n");
      out.write("  </div>    \n");
      out.write("  \n");
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
