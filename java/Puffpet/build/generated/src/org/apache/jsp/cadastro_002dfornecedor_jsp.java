package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_002dfornecedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title> Cadastrar-se como fornecedor </title>\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/logos/logoicon.ico\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos-cadastro.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header-cadastro\">\n");
      out.write("            <div id=\"meio\">\n");
      out.write("                <a href=\"index.html\"><img id=\"logo\" src=\"images/logos/logo420x110.png\" /></a>\n");
      out.write("                <div id=\"ambiente-seguro\">\n");
      out.write("                    <img id=\"cadeado\" src=\"images/logos/cadeado.png\" />\n");
      out.write("                    <nav>\n");
      out.write("                        <label> Ambiente </label>\n");
      out.write("                        <text> seguro </text>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <section id=\"section-cadastro-cliente\">\n");
      out.write("\n");
      out.write("            <div id=\"div-cadastro\">\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("                    <nav id=\"nav-title\">\n");
      out.write("                        <text> Cadastrar-se como fornecedor </text>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                    <form name=\"form1\" id=\"form1\" action=\"fornecedor.do\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"idfornecedor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.idFornecedor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        \n");
      out.write("                        <label class=\"label\"> Razão Social: </label>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.RazaoSocial}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"razaosocial\" id=\"razaosocial\" class=\"input\" maxlength=\"45\" size=\"60\" placeholder=\"Digite a razão social\" required />\n");
      out.write("\n");
      out.write("                        <label class=\"label\"> Email:  </label>\n");
      out.write("                        <input type=\"mail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.Email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\" id=\"email\" class=\"input\" maxlength=\"60\" size=\"60\" placeholder=\"Digite seu email\" required />\n");
      out.write("\n");
      out.write("                        <label class=\"label\"> Endereço: </label>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.Endereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"endereco\" id=\"endereco\" class=\"input\" maxlength=\"100\" size=\"60\" placeholder=\"Digite o endereço da fornecedora\" required />\n");
      out.write("\n");
      out.write("                        <label class=\"label\"> CNPJ: </label>\n");
      out.write("                        <input type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.Cnpj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"cnpj\" id=\"cnpj\" class=\"input\" maxlength=\"14\" size=\"30\" placeholder=\"CNPJ\" required />\n");
      out.write("\n");
      out.write("                        <label class=\"label\"> Nome:  </label>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.Nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"nome\" id=\"nome\" class=\"input\" maxlength=\"45\" size=\"30\" placeholder=\"Digite seu nome\" required /> \n");
      out.write("\n");
      out.write("                        <label class=\"label\"> Função:  </label>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.Funcao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"funcao\" id=\"funcao\" class=\"input\" maxlength=\"60\" size=\"30\" placeholder=\"Digite sua função na fornecedora\" required />\n");
      out.write("\n");
      out.write("                        <nav class=\"menu\">\n");
      out.write("                            <a href=\"#\" class=\"btnmenu\" onclick=\"enviar('form1')\"> Cadastrar </a>\n");
      out.write("                            <a href=\"#\" class=\"btnmenu\" onclick=\"limpar('form1')\"> Limpar </a>\n");
      out.write("                        </nav>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <footer>\n");
      out.write("            <text> Este site é fruto de um projeto de trabalho de conclusão de curso | Senai CETAF-AJU </text>\n");
      out.write("            <p> Copyright© 2021 - All rights reserved </p>\n");
      out.write("        </footer>\n");
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
