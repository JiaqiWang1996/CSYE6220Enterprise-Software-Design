<%-- 
    Document   : show
    Created on : 2021年2月18日, 下午4:08:17
    Author     : Jiaqi Wang
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.IOException" %>
<%@ page contentType="  text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
    <title>Show part8 Result</title>
</head>

    <body>
        <%
        String acadamicterm= request.getParameter("acadamic_term");
        String acadamicyear = request.getParameter("acadamic_year");
        String employeestatus = request.getParameter("eStatus");

        String studentname = request.getParameter("Student_name");
        String studentNUID = request.getParameter("Student_NUID");
        String employeename = request.getParameter("Employee_name");
        String employeeNUID = request.getParameter("Employee_NUID");
String department = request.getParameter("Department");
String campuslocation = request.getParameter("Campus_location");
String phonenumber = request.getParameter("Phone_number");
String supervisorname= request.getParameter("Supervisor_name");

String schoolprogram= request.getParameter("school_program");
String coursenumber1= request.getParameter("Course_no1");
String coursename1= request.getParameter("Course_name1");
String supervisorsignature1= request.getParameter("Supervisor_signature 1");
String credithrs1= request.getParameter("Credit_hrs1");
String days1=request.getParameter("days1");
String time1=request.getParameter("time1");
String coursenumber2= request.getParameter("Course_no2");
String coursename2= request.getParameter("Course_name2");
String supervisorsignature2= request.getParameter("Supervisor_signature 2");
String credithrs2= request.getParameter("Credit_hrs2");
String days2=request.getParameter("days2");
String time2=request.getParameter("time2");
String coursenumber3= request.getParameter("Course_no3");
String coursename3= request.getParameter("Course_name3");
String supervisorsignature3= request.getParameter("Supervisor_signature 3");
String credithrs3= request.getParameter("Credit_hrs3");
String days3=request.getParameter("days3");
String time3=request.getParameter("time3");

String employeesignature=request.getParameter("Employee_signature");
String dateempolyee=request.getParameter("date_employee");

String hrmapproval=request.getParameter("HRM_approval");
String datehrm=request.getParameter("date_HRM");
 
        out.println("enrollment form information Display");
      out.println("<br/>");

        out.println(" acadamic term is: " + acadamicterm );
        out.println(" acadamic year  is: " + acadamicyear  );
        out.println(" employee status is: " + employeestatus );
   out.println("<br/>");
        out.println("student's name: " + studentname );
        out.println("student's NUID: " + studentNUID + );
        out.println("employee's name : " + employeename);
        out.println("employee's NUID: " +employeeNUID);
        out.println("department is " + department );
        out.println("campus location is " + campuslocation);
        out.println("<br/>");
out.println(" phone number is " +  phonenumber );
out.println("supervisor's name is " +supervisorname );
out.println("<br/>");
out.println("school or program is " +schoolprogram );
out.println("No.1 course's number is " + coursenumber1);
out.println("No.1 course's name is " +coursename1 );
out.println("No.1 supervisor's signature is " + supervisorsignature1);
out.println("No.1 credit hours is " +credithrs1);
out.println("No.1 day(s) is " +days1  );
out.println("No.1 time is " + time1);
out.println("<br/>");
out.println("No.2 course's number is " + coursenumber2);
out.println("No.2 course's name is " +coursename2 );
out.println("No.2 supervisor's signature is " + supervisorsignature2);
out.println("No.2 credit hours is " +credithrs2);
out.println("No.2 day(s) is " +days2);
out.println("No.2 time is " + time2);
out.println("<br/>");
out.println("No.3 course's number is " + coursenumber3);
out.println("No.3 course's name is " +coursename3 );
out.println("No.3 supervisor's signature is " + supervisorsignature3);
out.println("No.3 credit hours is " +credithrs3 );
out.println("No.3 day(s) is " +days3 );
out.println("No.3 time is " + time3);
out.println("<br/>");
out.println("employee's signature is " +employeesignature );
out.println("Date of employee's signature is " + dateempolyee);
out.println("<br/>");
out.println("HRM's approval is " +hrmapproval );
out.println("Date of HRM's signature is " + datehrm);
     
        %>
    </body>
</html>
