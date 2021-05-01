import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
/** Shows all the request headers sent on the current request. */
public class HW1_part6  extends HttpServlet{
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

out.println("<TR><TD>" + "	getAuthType()");
out.println(" <TD>" + request.getAuthType());

out.println("<TR><TD>" + "getContextPath()");
out.println(" <TD>" + request.getContextPath());

out.println("<TR><TD>" + "	getCookies()");
out.println(" <TD>" + request.getCookies());

Enumeration headerNames = request.getHeaderNames();
while(headerNames.hasMoreElements()) {
String headerName = (String)headerNames.nextElement();
long DateHeader=request.getDateHeader(headerName);
out.println("<TR><TD>" + "getDateHeader(String name)");
out.println(" <TD>" +String.valueOf(DateHeader));
out.println("<TR><TD>" + "	getHeader(String name)");
out.println(" <TD>" +request.getHeader(headerName));
}

out.println("<TR><TD>" + "getHeaderNames()");
out.println(" <TD>" + request.getHeaderNames());


out.println("<TR><TD>" + "getHttpServletMapping()");
out.println(" <TD>" + request.getHttpServletMapping());

while(headerNames.hasMoreElements()) {
String headerName = (String)headerNames.nextElement();
out.println("<TR><TD>" + "getIntHeader(String name)");
out.println(" <TD>" + String.valueOf(request.getIntHeader(headerName)));
}


out.println("<TR><TD>" + "	getMethod()");
out.println(" <TD>" + request.getMethod());


Part part=null;
Collection<Part>parts=null;
try{
parts=request.getParts();
}
catch(Exception ex){
}
if(parts==null){part=null;}
else{
try{
part=parts.iterator().next();
}
catch(Exception ex){}
}


out.println("<TR><TD>" + "	getParts()");
out.println(" <TD>" + request.getParts());

out.println("<TR><TD>" + "getPathInfo()");
out.println(" <TD>" + request.getPathInfo());

out.println("<TR><TD>" + "	getPathTranslated()");
out.println(" <TD>" + request.getPathTranslated());

out.println("<TR><TD>" + "	getQueryString()");
out.println(" <TD>" + request.getQueryString());

out.println("<TR><TD>" + "getRemoteUser()");
out.println(" <TD>" + request.getRemoteUser());

out.println("<TR><TD>" + "	getRequestedSessionId()");
out.println(" <TD>" + request.getRequestedSessionId());

out.println("<TR><TD>" + "getRequestURI()");
out.println(" <TD>" +request.getRequestURI());

out.println("<TR><TD>" +"getRequestURL()");
out.println(" <TD>" +request.getRequestURL());

out.println("<TR><TD>" + "	getServletPath()");
out.println(" <TD>" + request.getServletPath());

out.println("<TR><TD>" + "getSession()");
out.println(" <TD>" + request.getSession());

out.println("<TR><TD>" + "getTrailerFields()");
out.println(" <TD>" + request.getTrailerFields());

out.println("<TR><TD>" + "	getUserPrincipal()");
out.println(" <TD>" + request.getUserPrincipal());

out.println("<TR><TD>" + "	getAsyncContext()");
out.println(" <TD>" + request.getAsyncContext());

Enumeration AttributeNames = request.getAttributeNames();
while(AttributeNames.hasMoreElements()) {
String AttributeName = (String)AttributeNames.nextElement();
out.println("<TR><TD>" + "getAttribute(String name)");
out.println(" <TD>" + request.getAttribute(AttributeName));
}

out.println("<TR><TD>" + "	getAttributeNames()");
out.println(" <TD>" + request.getAttributeNames());

out.println("<TR><TD>" + "getCharacterEncoding()");
out.println(" <TD>" + request.getCharacterEncoding());

out.println("<TR><TD>" + "getContentLength()");
out.println(" <TD>" + request.getContentLength());

out.println("<TR><TD>" + "	getContentLengthLong()");
out.println(" <TD>" + request.getContentLengthLong());

out.println("<TR><TD>" + "getContentType()");
out.println(" <TD>" + request.getContentType());

out.println("<TR><TD>" + "getDispatcherType()");
out.println(" <TD>" + request.getDispatcherType());

out.println("<TR><TD>" + "getInputStream()");
out.println(" <TD>" + request.getInputStream());

out.println("<TR><TD>" + "getLocalAddr()");
out.println(" <TD>" + request.getLocalAddr());

out.println("<TR><TD>" + "	getLocale()");
out.println(" <TD>" + request.getLocale());

out.println("<TR><TD>" + "getLocales()");
out.println(" <TD>" + request.getLocales());

out.println("<TR><TD>" + "getLocalName()");
out.println(" <TD>" + request.getLocalName());

out.println("<TR><TD>" + "	getLocalPort()");
out.println(" <TD>" + request.getLocalPort());





Enumeration ParameterNames = request.getParameterNames();
while(ParameterNames.hasMoreElements()) {
String ParameterName = (String)ParameterNames.nextElement();
out.println("<TR><TD>" + "getParameter(String name)");
out.println(" <TD>" + request.getParameter(ParameterName ));
out.println("<TR><TD>" + "	getParameterValues(String name)");
out.println(" <TD>" + request.getParameterValues(ParameterName));
}

out.println("<TR><TD>" + "	getParameterMap()");
out.println(" <TD>" + request.getParameterMap());

out.println("<TR><TD>" + "getParameterNames()");
out.println(" <TD>" + request.getParameterNames());


out.println("<TR><TD>" + "	getProtocol()");
out.println(" <TD>" + request.getProtocol());

out.println("<TR><TD>" + "	getReader()");
out.println(" <TD>" + request.getReader());

out.println("<TR><TD>" + "	getRemoteAddr()");
out.println(" <TD>" + request.getRemoteAddr());

out.println("<TR><TD>" + "	getRemoteHost()");
out.println(" <TD>" + request.getRemoteHost());

out.println("<TR><TD>" + "getRemotePort()");
out.println(" <TD>" + request.getRemotePort());

out.println("<TR><TD>" + "getScheme()");
out.println(" <TD>" + request.getScheme());

out.println("<TR><TD>" + "	getServerName()");
out.println(" <TD>" + request.getServerName());

out.println("<TR><TD>" + "getServerPort()");
out.println(" <TD>" + request.getServerPort());

out.println("<TR><TD>" + "	getServletContext()");
out.println(" <TD>" + request.getServletContext());


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