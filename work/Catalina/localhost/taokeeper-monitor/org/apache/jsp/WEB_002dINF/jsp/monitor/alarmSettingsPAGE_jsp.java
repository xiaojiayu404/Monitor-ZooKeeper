/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2017-08-25 06:44:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.monitor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alarmSettingsPAGE_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/common/taglibs.jsp", Long.valueOf(1329715404000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".mytable {align:center;border-collapse:collapse;border:solid #6AA70B;border-width:0px 0 0 0px;width:600;} \r\n");
      out.write(".mytable table tr {list-style:none; border-bottom:#6AA70B 1px dotted ;font-size: 12px;;height:20px;} \r\n");
      out.write(".mytable table tr.t1 {background-color:#EEEEEE;}/* 第一行的背景色 */ \r\n");
      out.write(".mytable table tr.t2{background-color:#;}/* 第二行的背景色 */ \r\n");
      out.write(".mytable table tr.t3 {background-color:#CCCCCC;}/* 鼠标经过时的背景色 */ \r\n");
      out.write("</style> \r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a:link { text-decoration: none}\r\n");
      out.write("a:active { text-decoration:none}\r\n");
      out.write("a:hover { text-decoration:none} \r\n");
      out.write("a:visited { text-decoration:none}\r\n");
      out.write("</style>\r\n");
      out.write("<h1>ZooKeeper 报警设置</h1>\r\n");
      out.write("\r\n");
      out.write("<select id=\"clusterSelector\" onchange=\"javascript:location.href=this.value;\" >\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</select>\r\n");
      out.write("<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span><br/><br/>\r\n");
      out.write("<div align=\"center\" class=\"mytable\" id=\"tab\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"updateAlarmSettings\"  id=\"updateAlarmSettings\" action=\"alarmSettings.do?method=updateAlarmSettingsHandle\"  method=\"post\" >\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<tr style=\"background-color:#D3D1D1; text-align:center;\">\r\n");
      out.write("\t\t \t<td><b>报警项目</b></td>\r\n");
      out.write("\t\t \t<td><b>设置参数(多个参数之间请用英文半角状态 , 相隔)</b></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<td valign=\"middle\">ZooKeeper节点生命检测最大延时</td>\r\n");
      out.write("\t\t \t<td valign=\"middle\" ><input type=\"text\" name=\"maxDelayOfCheck\" id=\"maxDelayOfCheck\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.maxDelayOfCheck}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>s</td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr >\r\n");
      out.write("\t\t \t<td valign=\"middle\">Cpu 峰值报警</td>\r\n");
      out.write("\t\t \t<td valign=\"middle\" ><input type=\"text\" name=\"maxCpuUsage\"  id=\"maxCpuUsage\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.maxCpuUsage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>%</td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr >\r\n");
      out.write("\t\t \t<td valign=\"middle\">Memory 峰值报警</td>\r\n");
      out.write("\t\t \t<td valign=\"middle\" ><input type=\"text\" name=\"maxMemoryUsage\" id=\"maxMemoryUsage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.maxMemoryUsage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>%</td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr >\r\n");
      out.write("\t\t \t<td valign=\"middle\">Load 峰值报警</td>\r\n");
      out.write("\t\t \t<td valign=\"middle\" ><input type=\"text\" name=\"maxLoad\" id=\"maxLoad\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.maxLoad}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr >\r\n");
      out.write("\t\t \t<td valign=\"middle\">Data目录</td>\r\n");
      out.write("\t\t \t<td valign=\"middle\" ><input type=\"text\" name=\"dataDir\" id=\"maxLoad\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.dataDir}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr >\r\n");
      out.write("\t\t \t<td valign=\"middle\">Log目录</td>\r\n");
      out.write("\t\t \t<td valign=\"middle\" ><input type=\"text\" name=\"dataLogDir\" id=\"maxLoad\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.dataLogDir}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr >\r\n");
      out.write("\t\t \t<td valign=\"middle\">磁盘使用率 峰值报警</td>\r\n");
      out.write("\t\t \t<td valign=\"middle\" ><input type=\"text\" name=\"maxDiskUsage\" id=\"maxLoad\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.maxDiskUsage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>%</td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr >\r\n");
      out.write("\t\t \t<td valign=\"middle\">单机 连接数 峰值报警</td>\r\n");
      out.write("\t\t \t<td valign=\"middle\" ><input type=\"text\" name=\"maxConnectionPerIp\" id=\"maxConnectionPerIp\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.maxConnectionPerIp}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr >\r\n");
      out.write("\t\t \t<td valign=\"middle\">单机 Watcher数 峰值报警</td>\r\n");
      out.write("\t\t \t<td valign=\"middle\" ><input type=\"text\" name=\"maxWatchPerIp\" id=\"maxWatchPerIp\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.maxWatchPerIp}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<tr style=\"background-color:#D3D1D1; text-align:center;\">\r\n");
      out.write("\t\t \t<td colspan=\"2\"   ><b>报警对象</b></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<td>旺旺</td>\r\n");
      out.write("\t\t \t<td><input type=\"text\" name=\"wangwangList\" id=\"wangwangList\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.wangwangList}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"50\"/></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<td>手机(线上使用)</td>\r\n");
      out.write("\t\t \t<td><input type=\"text\" name=\"phoneList\" id=\"phoneList\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.phoneList}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"50\" /></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t <!-- \r\n");
      out.write("\t\t <tr style=\"background-color:#D3D1D1; text-align:center;\">\r\n");
      out.write("\t\t \t<td colspan=\"2\" ><b>周报对象</b></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<td>邮箱</td>\r\n");
      out.write("\t\t \t<td><input type=\"text\" name=\"emailList\" id=\"emailList\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alarmSettings.emailList}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"50\"  readonly/></td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t\t -->\r\n");
      out.write("\t\t <tr >\r\n");
      out.write("\t\t \t<td valign=\"middle\"></td>\r\n");
      out.write("\t\t \t<td align=\"right\" ><input type=\"submit\"  value=\"Update\"  size=\"90\"/> <font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${handleMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font> </td>\r\n");
      out.write("\t\t </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<input type=\"hidden\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clusterId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  name=\"clusterId\" id=\"clusterId\" />\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"> \r\n");
      out.write("\r\n");
      out.write("var Ptr=document.getElementById(\"tab\").getElementsByTagName(\"tr\"); \r\n");
      out.write("function $() { \r\n");
      out.write("for (i=1;i<Ptr.length+1;i++) { \r\n");
      out.write("Ptr[i-1].className = (i%2>0)?\"t1\":\"t2\"; \r\n");
      out.write("} \r\n");
      out.write("} \r\n");
      out.write("window.onload=$; \r\n");
      out.write("for(var i=0;i<Ptr.length;i++) { \r\n");
      out.write("Ptr[i].onmouseover=function(){ \r\n");
      out.write("this.tmpClass=this.className; \r\n");
      out.write("this.className = \"t3\"; \r\n");
      out.write("}; \r\n");
      out.write("Ptr[i].onmouseout=function(){ \r\n");
      out.write("this.className=this.tmpClass; \r\n");
      out.write("}; \r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/monitor/alarmSettingsPAGE.jsp(22,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("zooKeeperCluster");
    // /WEB-INF/jsp/monitor/alarmSettingsPAGE.jsp(22,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/monitor/alarmSettingsPAGE.jsp(22,1) '${zooKeeperClusterMap}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${zooKeeperClusterMap}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("     \t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/jsp/monitor/alarmSettingsPAGE.jsp(24,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ zooKeeperCluster.key eq clusterId }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<option value=\"alarmSettings.do?method=alarmSettingsPAGE&clusterId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zooKeeperCluster.key}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\"  selected>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zooKeeperCluster.value.clusterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</option>");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<option value=\"alarmSettings.do?method=alarmSettingsPAGE&clusterId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zooKeeperCluster.key}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zooKeeperCluster.value.clusterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</option>");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
