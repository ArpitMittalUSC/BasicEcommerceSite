/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-01-31 18:27:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class webloginpage_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"ticketMenu\">\r\n");
      out.write("\t<h1 class=\"text-center\">Welcome to Basic Ecommerce Site</h1>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div class=\"login-wrap p-4 p-md-5\">\r\n");
      out.write("\t\t<div class=\"d-flex\">\r\n");
      out.write("\t\t\t<div class=\"w-100\">\r\n");
      out.write("\t\t\t\t<h3 class=\"mb-4\">Sign In</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w-100\">\r\n");
      out.write("\t\t\t\t<p class=\"social-media d-flex justify-content-end\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"social-icon d-flex align-items-center justify-content-center\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-facebook\"></span></a> <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"social-icon d-flex align-items-center justify-content-center\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-twitter\"></span></a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<p class=\"text-center\">\r\n");
      out.write("\t\t\tNot a member? <a class=\"open_signUp\">Sign Up</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"signup-wrap p-4 p-md-5\" style=\"display: none;\">\r\n");
      out.write("\t\t<div class=\"d-flex\">\r\n");
      out.write("\t\t\t<div class=\"w-100\">\r\n");
      out.write("\t\t\t\t<h3 class=\"mb-4\">Register</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w-100\">\r\n");
      out.write("\t\t\t\t<p class=\"social-media d-flex justify-content-end\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"social-icon d-flex align-items-center justify-content-center\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-facebook\"></span></a> <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"social-icon d-flex align-items-center justify-content-center\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-twitter\"></span></a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_form_005fform_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<p class=\"text-center\">\r\n");
      out.write("\t\t\tAlready a member? <a class=\"open_signin\">Sign In</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/loginpage.tag(7,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty error}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<div class=\"error_block\">\r\n");
        out.write("\t\t\t<div class=\"alert alert-danger\" role=\"alert\">Error : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
        out.write("</div>\r\n");
        out.write("\t\t</div>\"\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/loginpage.tag(27,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("POST");
    // /WEB-INF/tags/loginpage.tag(27,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("/BasicEcommerceSetup/signin");
    // /WEB-INF/tags/loginpage.tag(27,2) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setModelAttribute("loginDetails");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div class=\"form-group mb-3\">\r\n");
          out.write("\t\t\t\t<label class=\"label\" for=\"name\" style=\"\">Username</label> \r\n");
          out.write("\t\t\t\t<input\r\n");
          out.write("\t\t\t\t\ttype=\"text\" class=\"form-control username\" placeholder=\"Username\"\r\n");
          out.write("\t\t\t\t\trequired=\"\">\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div class=\"form-group mb-3\">\r\n");
          out.write("\t\t\t\t<label class=\"label\" for=\"password\" style=\"\">Password</label> <input\r\n");
          out.write("\t\t\t\t\ttype=\"password\" class=\"form-control password\"\r\n");
          out.write("\t\t\t\t\tplaceholder=\"Password\" required=\"\">\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t<button type=\"submit\"\r\n");
          out.write("\t\t\t\t\tclass=\"form-control btn btn-primary rounded submit px-3\" style=\"\">Sign In</button>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f1 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/loginpage.tag(63,2) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f1.setMethod("POST");
    // /WEB-INF/tags/loginpage.tag(63,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f1.setAction("/BasicEcommerceSetup/signup");
    // /WEB-INF/tags/loginpage.tag(63,2) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f1.setModelAttribute("loginDetails");
    int[] _jspx_push_body_count_form_005fform_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f1 = _jspx_th_form_005fform_005f1.doStartTag();
      if (_jspx_eval_form_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div class=\"form-group mb-3\">\r\n");
          out.write("\t\t\t\t<label class=\"label\" for=\"name\" style=\"\">Username</label> <input\r\n");
          out.write("\t\t\t\t\ttype=\"text\" class=\"form-control username\" placeholder=\"Username\"\r\n");
          out.write("\t\t\t\t\trequired=\"\">\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div class=\"form-group mb-3\">\r\n");
          out.write("\t\t\t\t<label class=\"label\" for=\"password\" style=\"\">Password</label> <input\r\n");
          out.write("\t\t\t\t\ttype=\"password\" class=\"form-control password\"\r\n");
          out.write("\t\t\t\t\tplaceholder=\"Password\" required=\"\">\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t<label class=\"label\" for=\"re-enter-password\" style=\"\">Re-enter\r\n");
          out.write("\t\t\t\t\tPassword</label> <input type=\"password\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\tplaceholder=\"Re-enter Password\" required=\"\">\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t<label class=\"label\" for=\"role\" style=\"\">Role</label> <select\r\n");
          out.write("\t\t\t\t\tclass=\"form-control\">\r\n");
          out.write("\t\t\t\t\t<option value=\"buyer\">Buyer</option>\r\n");
          out.write("\t\t\t\t\t<option value=\"seller\">Seller</option>\r\n");
          out.write("\t\t\t\t</select>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t<button\r\n");
          out.write("\t\t\t\t\tclass=\"form-control btn btn-primary rounded px-3 submit signup_buyer\"\r\n");
          out.write("\t\t\t\t\tstyle=\"\">Sign Up</button>\r\n");
          out.write("\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f1);
    }
    return false;
  }
}