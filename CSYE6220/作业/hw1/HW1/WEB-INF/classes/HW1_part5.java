import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
/** Shows all the request headers sent on the current request. */
public class HW1_part5 extends HttpServlet {
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String title = "all the getX() methods";
String docType =
"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
"Transitional//EN\">\n";
out.println(docType +
"<HTML>\n" +
"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
"<BODY BGCOLOR=\"#FDF5E6\">\n" +
"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
"<B>Request Method: </B>" +
request.getMethod()+ "<BR>\n" +
"<B>Request URI: </B>" +
request.getRequestURI()+ "<BR>\n" +
"<B>Request Protocol: </B>" +request.getProtocol()+ "<BR><BR>\n" +
"<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
"<TR BGCOLOR=\"#FFAD00\">\n" +
"<TH>getX()Method<TH>Value");

long lastModified = getLastModified(request);
out.println("<TR><TD>" + "getLastModified(HttpServletRequest request)");
out.println(" <TD>" +String.valueOf(lastModified));

out.println("<TR><TD>" + "getInitParameter(String name)");
out.println(" <TD>" +String.valueOf(lastModified));


out.println("<TR><TD>" + "	getInitParameterNames()");
out.println(" <TD>" + getInitParameterNames());

out.println("<TR><TD>" + "	getServletConfig()");
out.println(" <TD>" +getServletConfig());

out.println("<TR><TD>" + "	getServletContext()");
out.println(" <TD>" + request.getServletContext());

out.println("<TR><TD>" + "	getServletInfo()");
out.println(" <TD>" + getServletInfo());

out.println("<TR><TD>" + "	getServletName()");
out.println(" <TD>" + getServletName());

out.println("</TABLE>\n</BODY></HTML>");
}
/** Since this servlet is for debugging, have it
* handle GET and POST identically.
*/
public void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
doGet(request, response);
}
}