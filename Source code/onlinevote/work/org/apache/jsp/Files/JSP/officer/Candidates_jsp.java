/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.35
 * Generated at: 2014-06-03 08:02:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Files.JSP.officer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.database.conn.*;

public final class Candidates_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Files/JSP/officer/Common_content.jsp", Long.valueOf(1399381847575L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"Stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/Officer.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("  \twindow.history.forward();\r\n");
      out.write("   \tfunction noBack() { window.history.forward(); }\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body background=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/bg.jpg\">\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<br>\t\t\t\t\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/logo-1.png\"><br><br>\r\n");
      out.write("\t\t\t<img  src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/logo-2.png\">\r\n");
      out.write("\t\t</center>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t</div> \r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div align=\"right\">\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Logout\" method=\"post\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Officerhome.jsp\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/home.png\" height=\"30\" width=\"30\"></a>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/line.png\" height=\"30\" width=\"5\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Admin_ChangePassword.jsp\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/changepwd.png\"\r\n");
      out.write("\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/changepwd-click.png'\"\r\n");
      out.write("   \t   \t \t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/changepwd.png'\"></a>\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/line.png\" height=\"30\" width=\"5\">\t\t\r\n");
      out.write("\t\t\t<input type=\"image\" value=\"submit\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/logout.png\"\r\n");
      out.write("\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/logout-click.png'\"\r\n");
      out.write("   \t   \t \t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Manager/logout.png'\">\t\r\n");
      out.write("\t\t\t&emsp;&emsp;\r\n");
      out.write("\t\t</form>\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"sidebar\">\r\n");
      out.write("\t\t<center><br><br>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/index/officer.png\" height=\"100\" width=\"90\"><br>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Electoral_District.jsp\" >\t\r\n");
      out.write("\t\t\t   \t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/electoraldistrict.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/electoraldistrict-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/electoraldistrict.png'\"/></a>\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\r\n");
      out.write("   \t   \t \t\t<tr>\r\n");
      out.write("   \t   \t \t\t\t<td>\r\n");
      out.write("   \t   \t \t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Candidates.jsp\">\t\r\n");
      out.write("   \t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/candidates.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/candidates-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/candidates.png'\"/></a>\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\r\n");
      out.write("   \t   \t \t\t<tr>\r\n");
      out.write("   \t   \t \t\t\t<td>\r\n");
      out.write("   \t   \t \t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/Booths.jsp\">\t\r\n");
      out.write("   \t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/booths.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/booths-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/booths.png'\"/></a>\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\r\n");
      out.write("   \t   \t \t\t<tr>\r\n");
      out.write("   \t   \t \t\t\t<td>\r\n");
      out.write("   \t   \t \t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/ElectionResult.jsp\">\t\r\n");
      out.write("   \t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/results.png\" \r\n");
      out.write("   \t\t\t\t\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/results-click.png'\"\r\n");
      out.write("   \t   \t \t\t\t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/results.png'\"/></a>\t\t\t\t\t\t\t   \t   \t \t\t\t\t\r\n");
      out.write("   \t   \t \t\t\t</td>\r\n");
      out.write("   \t   \t \t\t</tr>\t\r\n");
      out.write("   \t   \t \t</table>\r\n");
      out.write("\t\t</center><br>\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>CANDIDATE DETAILS</title>\r\n");
      out.write("\t<link rel=\"Stylesheet\" type=\"text/css\" href=\"Officer.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/Files/JS/checkbox.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("\t<center><br><br>\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/DeleteCandidates\">\r\n");
      out.write("\t\t\t<table border=\"1\" width=\"700\" style=\"font-family: cambria; font-weight: bold;\">\r\n");
      out.write("\t\t\t\t<tr style=\"background-color:black;color:white;\"><td colspan=\"10\" align=\"center\">CANDIDATE DETAILS</td></tr>\r\n");
      out.write("\t\t\t\t<tr style=\"background-color:lightblue;color:black;\"><td width=5%;>SELECT</td><td>CODE</td><td>NAME</td><td>DISTRICT</td><td>AGE</td><td>PARTY</td><td>SYMBOL</td><td width=5%;>EDIT</td></tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
ResultSet rs=Methods.candidatedetails();
      out.write("\r\n");
      out.write("\t\t\t\t");
while(rs.next())
				{
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=5% align=\"center\"><input type=\"checkbox\" name=\"code\" value=\"");
      out.print(rs.getInt(1) );
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString(1) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString(6) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td><center><img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Candidates/Symbol/");
      out.print(rs.getString(5));
      out.write("\" height=\"30\" width=\"30\"></center></td>\r\n");
      out.write("\t\t\t\t\t<td width=5% align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/EditCandidate.jsp?code=");
      out.print(rs.getInt(1));
      out.write("\">Edit</a>\r\n");
      out.write("\t\t\t\t\t</td>\t\r\n");
      out.write("\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/officer/AddCandidate.jsp\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/add.png\"\r\n");
      out.write("\t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/add-click.png'\"\r\n");
      out.write(" \t\t\t\tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/add.png'\"></a>\r\n");
      out.write(" \t\t\t&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write(" \t\t\t<input type=\"image\" value=\"Submit\"src=\"");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/delete.png\" \r\n");
      out.write("  \t\t\t\tonmouseover=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/delete-click.png'\"\r\n");
      out.write("   \t   \t\t \tonmouseout=\"this.src='");
      out.print(request.getContextPath());
      out.write("/Files/images/Officer/delete.png'\"\r\n");
      out.write("   \t   \t\t \tonclick=\"return deletecandidate()\">   \t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</center>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}
