package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fornecedorlista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setLocale_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setLocale_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("    <header id=\"header-index\">\n");
      out.write("        <div id=\"div-header\">\n");
      out.write("            <div id=\"div-header-layout\">\n");
      out.write("                <a href=\"index.html\"><img id=\"imglogo\" src=\"images/logos/logo420x110.png\" title=\"Puffpet - Pet Shop Online\" /></a>\n");
      out.write("                <input type=\"text\" name=\"search\" id=\"search\" size=\"80\" placeholder=\"Pesquisar na Puffpet\"></input>\n");
      out.write("\n");
      out.write("                <a href=\"cadastro-geral.html\"><button name=\"btncadastro\" id=\"btncadastro\" title=\"Cadatre-se na Puffpet\">\n");
      out.write("                        <img id=\"bonecologin\" src=\"images/logos/bonecologin.png\" />\n");
      out.write("                        <label id=\"txt1\" class=\"txt\">Olá, Entre</p><label href=\"cadastro.html\" id=\"txt2\" class=\"txt\">ou Cadastre-se</p>\n");
      out.write("                                <div class=\"triangle\"></div>\n");
      out.write("                                </button></a>\n");
      out.write("\n");
      out.write("                                <a href=\"listar-geral.html\"><img id=\"carrinho\" src=\"images/logos/carrinho.png\"/></a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div id=\"div-header-buttons\">\n");
      out.write("                                    <a href=\"cachorro-geral.html\" class=\"btnmenu\"> Cachorros </a>\n");
      out.write("                                    <a href=\"gato-geral.html\" class=\"btnmenu\"> Gatos </a>\n");
      out.write("                                    <a href=\"peixe-geral.html\" class=\"btnmenu\"> Peixes </a>\n");
      out.write("                                    <a href=\"passaro-geral.html\" class=\"btnmenu\"> Pássaros </a>\n");
      out.write("                                    <a href=\"outrospets-geral.html\" class=\"btnmenu\"> Outros Pets </a>\n");
      out.write("                                    <a href=\"casa-e-jardim.html\" class=\"btnmenu\"> Casa e Jardim </a>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                                </header>\n");
      out.write("                                <body>\n");
      out.write("                                    <section id=\"conteudo\">\n");
      out.write("                                        <table style=\"width:100%; margin-top: 5px; padding: 25px;\" >\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td colspan=\"4\"> LISTAR CADASTROS </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td colspan=\"4\"> </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td> ID </td>\n");
      out.write("                                                <td> Razão Social </td>\n");
      out.write("                                                <td> Email </td>\n");
      out.write("                                                <td> Endereco </td>\n");
      out.write("                                                <td> CNPJ </td>\n");
      out.write("                                                <td> Nome </td>\n");
      out.write("                                                <td> Função </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </table>\n");
      out.write("                                    </section>\n");
      out.write("                                    <footer id=\"footer_index\">\n");
      out.write("                                        <text> Este site é fruto de um projeto de trabalho de conclusão de curso | Senai CETAF-AJU </text>\n");
      out.write("                                        <p> Copyright© 2021 - All rights reserved </p>\n");
      out.write("                                    </footer> \n");
      out.write("                                </body>\n");
      out.write("                                </html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${objFornecedores}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("cont");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.idFornecedor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.RazaoSocial}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.Email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.Endereco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.Cnpj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.Nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                                    <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.Funcao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                                </tr>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
