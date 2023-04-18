package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_002dcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setLocale_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_setLocale_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_setLocale_value_scope_nobody.release();
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

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_fmt_setLocale_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title> Cadastrar-se como usuário </title>\n");
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
      out.write("                        <text> Cadastrar-se como cliente </text>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                    <form name=\"form1\" id=\"form1\" action=\"pessoa.do\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"idpessoa\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("\n");
      out.write("                        <label class=\"label\"> Nome: </label>  \n");
      out.write("                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.Nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"nome\" id=\"nome\" class=\"input\" maxlength=\"45\" size=\"60\" placeholder=\"Informe o seu nome\" required />\n");
      out.write("\n");
      out.write("                        <label class=\"label\"> Telefone:  </label>\n");
      out.write("                        <input type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.Telefone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"telefone\" id=\"telefone\" class=\"input\" maxlength=\"11\" size=\"30\" placeholder=\"Informe seu número para contato\" required /> \n");
      out.write("\n");
      out.write("                        <label class=\"label\"> Endereço: </label>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.Endereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"endereco\" id=\"endereco\" class=\"input\" maxlength=\"100\" size=\"60\" placeholder=\"Informe o seu endereço\" required />\n");
      out.write("\n");
      out.write("                        <label class=\"label\"> Email:  </label>\n");
      out.write("                        <input type=\"mail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.Email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\" id=\"email\" class=\"input\" maxlength=\"100\" size=\"60\" placeholder=\"Informe seu email\" required />\n");
      out.write("\n");
      out.write("                        <label class=\"label\"> CPF: </label>\n");
      out.write("                        <input type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.Cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"cpf\" id=\"cpf\" class=\"input\" maxlength=\"11\" size=\"30\" placeholder=\"Informe seu CPF\" required />\n");
      out.write("\n");
      out.write("                        <label class=\"label\"> Gênero: </label>\n");
      out.write("\n");
      out.write("                        <input type=\"radio\" name=\"sexo\" id=\"sexo\" class=\"sexo\" value=\"M\" required checked /> Masculino\n");
      out.write("                        <input type=\"radio\" name=\"sexo\" id=\"sexo\" class=\"sexoF\" value=\"F\" required /> Feminino\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <nav class=\"menu\">\n");
      out.write("                            <a href=\"#\" class=\"btnmenu\" onclick=\"enviar('form1')\"> Cadastrar </a>\n");
      out.write("                            <a href=\"#\" class=\"btnmenu\" onclick=\"limpar('form1')\"> Limpar </a>\n");
      out.write("                        </nav>\n");
      out.write("\n");
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

  private boolean _jspx_meth_fmt_setLocale_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setLocale
    org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag _jspx_th_fmt_setLocale_0 = (org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag) _jspx_tagPool_fmt_setLocale_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag.class);
    _jspx_th_fmt_setLocale_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setLocale_0.setParent(null);
    _jspx_th_fmt_setLocale_0.setValue(new String("pt_BR"));
    _jspx_th_fmt_setLocale_0.setScope("application");
    int _jspx_eval_fmt_setLocale_0 = _jspx_th_fmt_setLocale_0.doStartTag();
    if (_jspx_th_fmt_setLocale_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setLocale_value_scope_nobody.reuse(_jspx_th_fmt_setLocale_0);
      return true;
    }
    _jspx_tagPool_fmt_setLocale_value_scope_nobody.reuse(_jspx_th_fmt_setLocale_0);
    return false;
  }
}
