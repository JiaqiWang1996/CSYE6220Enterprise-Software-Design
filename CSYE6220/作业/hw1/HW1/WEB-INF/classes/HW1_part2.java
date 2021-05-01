import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
/** Shows all the request headers sent on the current request. */
public class HW1_part2 extends HttpServlet {
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String title = "Servlet Example: Showing Request Headers";
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
"<TH>Header Name<TH>Header Value");

  Enumeration headerNames = request.getHeaderNames();

        while(headerNames.hasMoreElements())
        {
            String paramName = (String)headerNames.nextElement();
            out.print("<tr><td>" + paramName + "</td>\n");
            String paramValue = request.getHeader(paramName);
            out.println("<td> " + paramValue + "</td></tr>\n");
        }
   


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