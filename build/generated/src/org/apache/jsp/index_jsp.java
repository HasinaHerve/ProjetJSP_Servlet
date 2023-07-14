package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.p.Personnel;
import com.p.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      UtCourant ub = null;
      synchronized (session) {
        ub = (UtCourant) _jspx_page_context.getAttribute("ub", PageContext.SESSION_SCOPE);
        if (ub == null){
          ub = new UtCourant();
          _jspx_page_context.setAttribute("ub", ub, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("<style>\n");
      out.write("/* Extra styles for the cancel button */\n");
      out.write(".cancelbtn {\n");
      out.write("  width: auto;\n");
      out.write("  padding: 10px 18px;\n");
      out.write("  background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Center the image and position the close button */\n");
      out.write(".imgcontainer {\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 24px 0 12px 0;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("  float: right;\n");
      out.write("  padding-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("  display: none; /* Hidden by default */\n");
      out.write("  position: fixed; /* Stay in place */\n");
      out.write("  z-index: 1; /* Sit on top */\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  width: 100%; /* Full width */\n");
      out.write("  height: 100%; /* Full height */\n");
      out.write("  overflow: auto; /* Enable scroll if needed */\n");
      out.write("  background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("  padding-top: 60px;\n");
      out.write("  padding-left: 20%;\n");
      out.write("  padding-right:  20%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content/Box */\n");
      out.write(".modal-content {\n");
      out.write("  background-color: #0c271a;\n");
      out.write("  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */\n");
      out.write("  border: 1px solid #888;\n");
      out.write("  width: 50%; /* Could be more or less, depending on screen size */\n");
      out.write("  padding-left: 20%;\n");
      out.write("  padding-right:  20%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Close Button (x) */\n");
      out.write(".close {\n");
      out.write("  position: absolute;\n");
      out.write("  right: 25px;\n");
      out.write("  top: 0;\n");
      out.write("  color: #000;\n");
      out.write("  font-size: 35px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("  color: red;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add Zoom Animation */\n");
      out.write(".animate {\n");
      out.write("  -webkit-animation: animatezoom 0.6s;\n");
      out.write("  animation: animatezoom 0.6s\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes animatezoom {\n");
      out.write("  from {-webkit-transform: scale(0)} \n");
      out.write("  to {-webkit-transform: scale(1)}\n");
      out.write("}\n");
      out.write("  \n");
      out.write("@keyframes animatezoom {\n");
      out.write("  from {transform: scale(0)} \n");
      out.write("  to {transform: scale(1)}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("  span.psw {\n");
      out.write("     display: block;\n");
      out.write("     float: none;\n");
      out.write("  }\n");
      out.write("  .cancelbtn {\n");
      out.write("     width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<head>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<title>Index</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #06140d; font-size: 18px\">\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alert0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alert2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t<div class=\"container-fluid bg-3 text-center\" style=\"background-color:#0c271a;\"></br></br>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<label class=\"control-label\" style=\"color: white;font-style: italic;font-size: 30px;\">Centre de partage et de communication(CPC)</label>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div></br></br>\t\n");
      out.write("\t<div class=\"container bg-3 text-center\" style=\" background-color:#0c271a; \"></br>\n");
      out.write("            <form class=\"form-horizontal\" action=\"Uservlet\" method=\"POST\">\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<label class=\"control-label col-3\" for=\"nomU\" style=\"color: white;\">Nom utilisateur:</label>\n");
      out.write("\t\t\t\t    <div class=\"col-9\" style=\"column-width: 400px;\">\n");
      out.write("\t\t\t\t    \t<input type=\"text\" class=\"form-control\" id=\"noml\" placeholder=\"Entrer votre nom\" name=\"nomU\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                        \n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t    </div></br>\n");
      out.write("\t\t    \t<div class=\"row\">\n");
      out.write("\t\t\t    \t<label class=\"control-label col-3\" for=\"pwd\" onclick=\"verif()\" style=\"color: white;\">Mot de passe:</label>\n");
      out.write("\t\t\t    \t<div class=\"col-9\" style=\"column-width: 400px;\">          \n");
      out.write("\t\t\t        \t<input type=\"password\" class=\"form-control\" id=\"pwdl\" placeholder=\"Entrer votre mot de passe\" name=\"mdp\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t</div></br>      \n");
      out.write("\t\t    <div class=\"btn-group\">\n");
      out.write("\t\t    \t<div class=\"col-6\">\n");
      out.write("\t\t    \t\t<button type=\"submit\" class=\"btn btn-default\" id=\"connecter\" name=\"connecter\" style=\"border: 1px solid #06140d; color: white; background-color:#006080;\">Se connecter</button>\n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t        <div class=\"col-6\">\n");
      out.write("\t\t        \t<label class=\"control-label\" for=\"creer\" style=\"color: white;\">Avez-vous un compte? sinon,</label>\n");
      out.write("\t\t        \t<button type=\"button\" onclick=\"document.getElementById('id01').style.display='block'\" class=\"btn btn-default\" style=\"border: 1px solid #06140d; color: white;\">Créer un compte</button>\n");
      out.write("\t\t        </div>\t\t        \n");
      out.write("\t\t    </div>\n");
      out.write("\t\t</div>\t\t \n");
      out.write("\t  \t</form></br></br> \t  \n");
      out.write("\t</div></br></br></br></br></br></br></br></br></br></br></br></br>\n");
      out.write("\t<div class=\"container-fluid text-center\" style=\"background-color:#0c271a;\"></br></br>\n");
      out.write("\t\t<label class=\"control-label\" for=\"nom\" style=\"color: white;font-style: italic;font-size: 15px;\">Copyright 2022</label>\n");
      out.write("\t\t</br></br>\n");
      out.write("\t</div>\t\n");
      out.write("        <div id=\"id01\" class=\"modal\">\n");
      out.write("        <form class=\"modal-content animate\" action=\"Uservlet\" method=\"POST\" style=\" background-color:#0c271a; \">\n");
      out.write("    <div class=\"imgcontainer\">\n");
      out.write("       <img src=\"icons/user3.png\" class=\"img-circle\" width=\"50\" height=\"50\">\n");
      out.write("      <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"form-group input-sm\">\n");
      out.write("            ");
List < Personnel > p = UDAO.selectPers();
      out.write("\n");
      out.write("            <label class=\"control-label col-sm-2\" for=\"imi\" style=\"color: white;\">Im:</label>\n");
      out.write("            <div class=\"form-group input-sm\">\n");
      out.write("                <select class=\"form-control\" name=\"imi\" style=\"font-size: 14px;width: 40%\">\n");
      out.write("                ");
for (int k = 0; k < p.size(); k++) {
      out.write("\n");
      out.write("                    <option>");
      out.print(p.get(k).getIm());
      out.write("</option></br>                            \n");
      out.write("                ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group input-sm\">\n");
      out.write("            <label class=\"control-label col-sm-2\" for=\"imi\" style=\"color: white;\">Nom utilisateur:</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"noml\" placeholder=\"Entrer votre nom\" name=\"nomA\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nA}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group input-sm\">\n");
      out.write("            <label class=\"control-label col-sm-2\" for=\"imi\" style=\"color: white;\" onclick=\"verif()\">Mot de passe:</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"password\"  class=\"form-control\"  placeholder=\"Entrer votre mot de passe\" name=\"mdpA\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mA}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></br>\n");
      out.write("                <input type=\"password\" class=\"form-control\" placeholder=\"Confirmer votre mot de passe\" name=\"cmdpA\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmA}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("></br>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\" name=\"ajouter\" style=\"border: 1px solid #06140d; color: white; background-color:#006080; width: 30%\">Enregistrer</button>\n");
      out.write("            </div>\n");
      out.write("        </div></br>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\t</div>\n");
      out.write("  \n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Get the modal\n");
      out.write("var modal = document.getElementById('id01');\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("    if (event.target == modal) {\n");
      out.write("        modal.style.display = \"none\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\t\n");
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
