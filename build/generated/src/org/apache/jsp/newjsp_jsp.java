package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form class=\"form-horizontal\" action=\"Uservlet\" method=\"POST\">\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-3\" for=\"nom\" style=\"color: white;\">Nom utilisateur:</label>\n");
      out.write("\t\t\t\t    <div class=\"col-9\" style=\"column-width: 400px;\">\n");
      out.write("\t\t\t\t    \t<input type=\"text\" class=\"form-control\" placeholder=\"Enter votre nom\" name=\"nom\" required>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t    </div></br>\n");
      out.write("\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t    \t<label class=\"control-label col-3\" for=\"mdp\" style=\"color: white;\">Mot de passe:</label>\n");
      out.write("\t\t\t    \t<div class=\"col-9\" style=\"column-width: 400px;\">          \n");
      out.write("\t\t\t        \t<input type=\"password\" class=\"form-control\" placeholder=\"Enter votre mot de passe\" name=\"mdp\" required>\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t    </div></br>\n");
      out.write("\t\t\t    <div class=\"row\">\n");
      out.write("\t\t\t    \t<label class=\"control-label col-3\" for=\"cmdp\" style=\"color: white;\"></label>\n");
      out.write("\t\t\t    \t<div class=\"col-9\" style=\"column-width: 400px;\">          \n");
      out.write("\t\t\t        \t<input type=\"password\" class=\"form-control\" placeholder=\"Confirmer votre mot de passe\" name=\"cmdp\" required>\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t    </div></br>       \n");
      out.write("\t\t    <div class=\"btn-group\">\n");
      out.write("\t\t    \t<div class=\"col-6\">\n");
      out.write("\t\t    \t\t<button type=\"submit\" name=\"aa\" id=\"ajouter\" class=\"btn btn-default\" style=\"border: 1px solid #06140d; color: white; background-color:#006080;\">Enregistrer</button>\n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t        <div class=\"col-6\">\n");
      out.write("                            <button type=\"submit\" name=\"aaa\" class=\"btn btn-default\" style=\"border: 1px solid #06140d; color: white;background-color: #f44336;text-align: right;\">Annuler</button>\n");
      out.write("\t\t        </div>\t\t        \n");
      out.write("\t\t    </div>\n");
      out.write("\t\t</div>\t\t \n");
      out.write("\t  \t</form>\n");
      out.write("    </body>\n");
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
