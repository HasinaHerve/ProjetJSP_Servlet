package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Essai_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Essai</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form class=\"form-horizontal\" action=\"session\" method=\"POST\">\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-3\" for=\"nom\" style=\"color: white;\" name=\"hasina\">Nom utilisateur:</label>\n");
      out.write("\t\t\t\t    <div class=\"col-9\" style=\"column-width: 400px;\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"noml\" placeholder=\"Enter votre nom\" name=\"n\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                        \n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t    </div></br>\n");
      out.write("\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t    \t<label class=\"control-label col-3\" for=\"pwd\" onclick=\"verif()\" style=\"color: black;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${h}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("\t\t\t    \t<div class=\"col-9\" style=\"column-width: 400px;\">          \n");
      out.write("\t\t\t        \t<input type=\"password\" class=\"form-control\" id=\"pwdl\" placeholder=\"Enter votre mot de passe\" name=\"mp\">\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t    </div></br>      \n");
      out.write("\t\t    <div class=\"btn-group\">\n");
      out.write("\t\t    \t<div class=\"col-6\">\n");
      out.write("                           <button type=\"submit\" class=\"btn btn-default\" id=\"connecter\" name=\"conn\" style=\"border: 1px solid #06140d; color: white; background-color:#006080;\">Se connecter</button>\n");
      out.write("\n");
      out.write("                           <button type=\"submit\" class=\"btn btn-default\" id=\"connecter\" name=\"dec\" style=\"border: 1px solid #06140d; color: white; background-color:#006080;\">dec</button>\n");
      out.write("                           <a href=\"index.jsp\">Lien</a>\n");
      out.write("                        </div>\t        \n");
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
